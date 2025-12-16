package com.yandex.mobile.ads.impl;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;

/* loaded from: classes8.dex */
final class kb1 {
    @j.P
    public static lb1 a(@j.P lb1 lb1Var, @j.P String[] strArr, Map<String, lb1> map) {
        int i12 = 0;
        if (lb1Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                lb1 lb1Var2 = new lb1();
                int length = strArr.length;
                while (i12 < length) {
                    lb1Var2.a(map.get(strArr[i12]));
                    i12++;
                }
                return lb1Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return lb1Var.a(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i12 < length2) {
                    lb1Var.a(map.get(strArr[i12]));
                    i12++;
                }
            }
        }
        return lb1Var;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i12, int i13, lb1 lb1Var, @j.P ib1 ib1Var, Map map, int i14) {
        ib1 ib1Var2;
        if (lb1Var.k() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(lb1Var.k()), i12, i13, 33);
        }
        if (lb1Var.q()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i12, i13, 33);
        }
        if (lb1Var.r()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, 33);
        }
        if (lb1Var.p()) {
            g61.a(spannableStringBuilder, new ForegroundColorSpan(lb1Var.b()), i12, i13);
        }
        if (lb1Var.o()) {
            g61.a(spannableStringBuilder, new BackgroundColorSpan(lb1Var.a()), i12, i13);
        }
        if (lb1Var.c() != null) {
            g61.a(spannableStringBuilder, new TypefaceSpan(lb1Var.c()), i12, i13);
        }
        if (lb1Var.n() != null) {
            lb1Var.n().getClass();
            g61.a(spannableStringBuilder, new u81(), i12, i13);
        }
        int i15 = lb1Var.i();
        if (i15 == 2) {
            while (true) {
                ib1Var2 = null;
                if (ib1Var == null) {
                    ib1Var = null;
                    break;
                }
                lb1 lb1VarA = a(ib1Var.f386435f, ib1Var.c(), map);
                if (lb1VarA != null && lb1VarA.i() == 1) {
                    break;
                } else {
                    ib1Var = ib1Var.f386439j;
                }
            }
            if (ib1Var != null) {
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(ib1Var);
                while (true) {
                    if (arrayDeque.isEmpty()) {
                        break;
                    }
                    ib1 ib1Var3 = (ib1) arrayDeque.pop();
                    lb1 lb1VarA2 = a(ib1Var3.f386435f, ib1Var3.c(), map);
                    if (lb1VarA2 != null && lb1VarA2.i() == 3) {
                        ib1Var2 = ib1Var3;
                        break;
                    }
                    for (int iA2 = ib1Var3.a() - 1; iA2 >= 0; iA2--) {
                        arrayDeque.push(ib1Var3.a(iA2));
                    }
                }
                if (ib1Var2 != null) {
                    if (ib1Var2.a() == 1 && ib1Var2.a(0).f386431b != null) {
                        String str = ib1Var2.a(0).f386431b;
                        int i16 = pc1.f388768a;
                        lb1 lb1VarA3 = a(ib1Var2.f386435f, ib1Var2.c(), map);
                        if ((lb1VarA3 != null ? lb1VarA3.h() : -1) == -1) {
                            a(ib1Var.f386435f, ib1Var.c(), map);
                        }
                        spannableStringBuilder.setSpan(new a11(), i12, i13, 33);
                    } else {
                        ka0.c("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                    }
                }
            }
        } else if (i15 == 3 || i15 == 4) {
            spannableStringBuilder.setSpan(new sp(), i12, i13, 33);
        }
        if (lb1Var.m()) {
            g61.a(spannableStringBuilder, new lz(), i12, i13);
        }
        int iE2 = lb1Var.e();
        if (iE2 == 1) {
            g61.a(spannableStringBuilder, new AbsoluteSizeSpan((int) lb1Var.d(), true), i12, i13);
        } else if (iE2 != 2) {
            if (iE2 != 3) {
                return;
            }
            g61.a(spannableStringBuilder, new RelativeSizeSpan(lb1Var.d() / 100.0f), i12, i13);
        } else {
            g61.a(spannableStringBuilder, new RelativeSizeSpan(lb1Var.d()), i12, i13);
        }
    }
}
