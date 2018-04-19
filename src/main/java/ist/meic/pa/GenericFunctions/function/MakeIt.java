/*
 * MIT License
 *
 * Copyright (c) 2018 Francisca Cambra, Rui Ventura
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package ist.meic.pa.GenericFunctions.function;

import ist.meic.pa.GenericFunctions.AfterMethod;
import ist.meic.pa.GenericFunctions.BeforeMethod;
import ist.meic.pa.GenericFunctions.GenericFunction;
import ist.meic.pa.GenericFunctions.domain.C1;
import ist.meic.pa.GenericFunctions.domain.Foo;

@GenericFunction
public class MakeIt {

  public static void ddouble(C1 c) {
    System.out.println("C1");
  }

  @BeforeMethod
  @AfterMethod
  public static void ddouble(Object c) {
    System.out.println("Object");
  }

  @BeforeMethod
  @AfterMethod
  public static void ddouble(Foo c) {
    System.out.println("Foo");
  }

}

