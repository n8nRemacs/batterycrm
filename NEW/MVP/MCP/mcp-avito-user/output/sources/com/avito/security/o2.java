package com.avito.security;

import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
class o2 extends n2 {

    final class a extends c1 implements s0<CharSequence, Integer, m1<? extends Integer, ? extends Integer>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f338616b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f338617c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list, boolean z12) {
            super(2);
            this.f338616b = list;
            this.f338617c = z12;
        }

        public final m1<Integer, Integer> a(CharSequence charSequence, int i12) {
            y0.b(charSequence, "$receiver");
            m1 m1VarB = o2.b(charSequence, this.f338616b, i12, this.f338617c, false);
            if (m1VarB != null) {
                return v2.a(m1VarB.c(), Integer.valueOf(((String) m1VarB.d()).length()));
            }
            return null;
        }

        @Override // com.avito.security.s0
        public /* bridge */ /* synthetic */ m1<? extends Integer, ? extends Integer> a(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    public static final int a(CharSequence charSequence) {
        y0.b(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    public static final int b(CharSequence charSequence, String str, int i12, boolean z12) {
        y0.b(charSequence, "$this$lastIndexOf");
        y0.b(str, "string");
        return (z12 || !(charSequence instanceof String)) ? a(charSequence, (CharSequence) str, i12, 0, z12, true) : ((String) charSequence).lastIndexOf(str, i12);
    }

    public static final int a(CharSequence charSequence, char c12, int i12, boolean z12) {
        y0.b(charSequence, "$this$indexOf");
        return (z12 || !(charSequence instanceof String)) ? a(charSequence, new char[]{c12}, i12, z12) : ((String) charSequence).indexOf(c12, i12);
    }

    public static /* synthetic */ int b(CharSequence charSequence, String str, int i12, boolean z12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = a(charSequence);
        }
        if ((i13 & 4) != 0) {
            z12 = false;
        }
        return b(charSequence, str, i12, z12);
    }

    public static /* synthetic */ int a(CharSequence charSequence, char c12, int i12, boolean z12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        if ((i13 & 4) != 0) {
            z12 = false;
        }
        return a(charSequence, c12, i12, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        return com.avito.security.v2.a(java.lang.Integer.valueOf(r12), r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.avito.security.m1<java.lang.Integer, java.lang.String> b(java.lang.CharSequence r10, java.util.Collection<java.lang.String> r11, int r12, boolean r13, boolean r14) {
        /*
            r0 = 0
            if (r13 != 0) goto L2d
            int r1 = r11.size()
            r2 = 1
            if (r1 != r2) goto L2d
            java.lang.Object r11 = com.avito.security.o.b(r11)
            java.lang.String r11 = (java.lang.String) r11
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            if (r14 != 0) goto L1d
            int r10 = a(r1, r2, r3, r4, r5, r6)
            goto L21
        L1d:
            int r10 = b(r1, r2, r3, r4, r5, r6)
        L21:
            if (r10 >= 0) goto L24
            goto L2c
        L24:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            com.avito.security.m1 r0 = com.avito.security.v2.a(r10, r11)
        L2c:
            return r0
        L2d:
            r1 = 0
            if (r14 != 0) goto L3e
            int r12 = com.avito.security.q1.a(r12, r1)
            com.avito.security.x0 r14 = new com.avito.security.x0
            int r1 = r10.length()
            r14.<init>(r12, r1)
            goto L4a
        L3e:
            int r14 = a(r10)
            int r12 = com.avito.security.q1.b(r12, r14)
            com.avito.security.v0 r14 = com.avito.security.q1.c(r12, r1)
        L4a:
            boolean r12 = r10 instanceof java.lang.String
            if (r12 == 0) goto L95
            int r12 = r14.a()
            int r1 = r14.b()
            int r14 = r14.c()
            if (r14 < 0) goto L5f
            if (r12 > r1) goto Ld2
            goto L61
        L5f:
            if (r12 < r1) goto Ld2
        L61:
            java.util.Iterator r8 = r11.iterator()
        L65:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L83
            java.lang.Object r9 = r8.next()
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2
            r4 = r10
            java.lang.String r4 = (java.lang.String) r4
            int r6 = r2.length()
            r3 = 0
            r5 = r12
            r7 = r13
            boolean r2 = com.avito.security.n2.a(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L65
            goto L84
        L83:
            r9 = r0
        L84:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L91
        L88:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            com.avito.security.m1 r10 = com.avito.security.v2.a(r10, r9)
            return r10
        L91:
            if (r12 == r1) goto Ld2
            int r12 = r12 + r14
            goto L61
        L95:
            int r12 = r14.a()
            int r1 = r14.b()
            int r14 = r14.c()
            if (r14 < 0) goto La6
            if (r12 > r1) goto Ld2
            goto La8
        La6:
            if (r12 < r1) goto Ld2
        La8:
            java.util.Iterator r8 = r11.iterator()
        Lac:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lc8
            java.lang.Object r9 = r8.next()
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2
            int r6 = r2.length()
            r3 = 0
            r4 = r10
            r5 = r12
            r7 = r13
            boolean r2 = a(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto Lac
            goto Lc9
        Lc8:
            r9 = r0
        Lc9:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto Lce
            goto L88
        Lce:
            if (r12 == r1) goto Ld2
            int r12 = r12 + r14
            goto La8
        Ld2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.security.o2.b(java.lang.CharSequence, java.util.Collection, int, boolean, boolean):com.avito.security.m1");
    }

    private static final int a(CharSequence charSequence, CharSequence charSequence2, int i12, int i13, boolean z12, boolean z13) {
        v0 x0Var = !z13 ? new x0(s1.a(i12, 0), s1.b(i13, charSequence.length())) : s1.c(s1.b(i12, a(charSequence)), s1.a(i13, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iA2 = x0Var.a();
            int iB2 = x0Var.b();
            int iC2 = x0Var.c();
            if (iC2 >= 0) {
                if (iA2 > iB2) {
                    return -1;
                }
            } else if (iA2 < iB2) {
                return -1;
            }
            while (!n2.a((String) charSequence2, 0, (String) charSequence, iA2, ((String) charSequence2).length(), z12)) {
                if (iA2 == iB2) {
                    return -1;
                }
                iA2 += iC2;
            }
            return iA2;
        }
        int iA3 = x0Var.a();
        int iB3 = x0Var.b();
        int iC3 = x0Var.c();
        if (iC3 >= 0) {
            if (iA3 > iB3) {
                return -1;
            }
        } else if (iA3 < iB3) {
            return -1;
        }
        while (!a(charSequence2, 0, charSequence, iA3, charSequence2.length(), z12)) {
            if (iA3 == iB3) {
                return -1;
            }
            iA3 += iC3;
        }
        return iA3;
    }

    public static /* synthetic */ int a(CharSequence charSequence, CharSequence charSequence2, int i12, int i13, boolean z12, boolean z13, int i14, Object obj) {
        if ((i14 & 16) != 0) {
            z13 = false;
        }
        return a(charSequence, charSequence2, i12, i13, z12, z13);
    }

    public static final int a(CharSequence charSequence, String str, int i12, boolean z12) {
        y0.b(charSequence, "$this$indexOf");
        y0.b(str, "string");
        return (z12 || !(charSequence instanceof String)) ? a(charSequence, str, i12, charSequence.length(), z12, false, 16, null) : ((String) charSequence).indexOf(str, i12);
    }

    public static /* synthetic */ int a(CharSequence charSequence, String str, int i12, boolean z12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        if ((i13 & 4) != 0) {
            z12 = false;
        }
        return a(charSequence, str, i12, z12);
    }

    public static final int a(CharSequence charSequence, char[] cArr, int i12, boolean z12) {
        y0.b(charSequence, "$this$indexOfAny");
        y0.b(cArr, "chars");
        if (z12 || cArr.length != 1 || !(charSequence instanceof String)) {
            int iA2 = s1.a(i12, 0);
            int iA3 = a(charSequence);
            if (iA2 > iA3) {
                return -1;
            }
            while (true) {
                char cCharAt = charSequence.charAt(iA2);
                for (char c12 : cArr) {
                    if (k.a(c12, cCharAt, z12)) {
                        return iA2;
                    }
                }
                if (iA2 == iA3) {
                    return -1;
                }
                iA2++;
            }
        } else {
            return ((String) charSequence).indexOf(f.a(cArr), i12);
        }
    }

    private static final v1<x0> a(CharSequence charSequence, String[] strArr, int i12, boolean z12, int i13) {
        a(i13);
        return new e0(charSequence, i12, i13, new a(e.a(strArr), z12));
    }

    public static /* synthetic */ v1 a(CharSequence charSequence, String[] strArr, int i12, boolean z12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        if ((i14 & 4) != 0) {
            z12 = false;
        }
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        return a(charSequence, strArr, i12, z12, i13);
    }

    public static final String a(CharSequence charSequence, x0 x0Var) {
        y0.b(charSequence, "$this$substring");
        y0.b(x0Var, "range");
        return charSequence.subSequence(x0Var.g().intValue(), x0Var.f().intValue() + 1).toString();
    }

    private static final List<String> a(CharSequence charSequence, String str, boolean z12, int i12) {
        a(i12);
        int length = 0;
        int iA2 = a(charSequence, str, 0, z12);
        if (iA2 != -1 && i12 != 1) {
            boolean z13 = i12 > 0;
            ArrayList arrayList = new ArrayList(z13 ? s1.b(i12, 10) : 10);
            do {
                arrayList.add(charSequence.subSequence(length, iA2).toString());
                length = str.length() + iA2;
                if (z13 && arrayList.size() == i12 - 1) {
                    break;
                }
                iA2 = a(charSequence, str, length, z12);
            } while (iA2 != -1);
            arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
            return arrayList;
        }
        return p.a(charSequence.toString());
    }

    public static final List<String> a(CharSequence charSequence, String[] strArr, boolean z12, int i12) {
        y0.b(charSequence, "$this$split");
        y0.b(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return a(charSequence, str, z12, i12);
            }
        }
        Iterable iterableA = b2.a(a(charSequence, strArr, 0, z12, i12, 2, null));
        ArrayList arrayList = new ArrayList(r.a(iterableA, 10));
        Iterator it = iterableA.iterator();
        while (it.hasNext()) {
            arrayList.add(a(charSequence, (x0) it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ List a(CharSequence charSequence, String[] strArr, boolean z12, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z12 = false;
        }
        if ((i13 & 4) != 0) {
            i12 = 0;
        }
        return a(charSequence, strArr, z12, i12);
    }

    public static final void a(int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException(AK.c.g(i12, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final boolean a(CharSequence charSequence, int i12, CharSequence charSequence2, int i13, int i14, boolean z12) {
        y0.b(charSequence, "$this$regionMatchesImpl");
        y0.b(charSequence2, PluralsKeys.OTHER);
        if (i13 < 0 || i12 < 0 || i12 > charSequence.length() - i14 || i13 > charSequence2.length() - i14) {
            return false;
        }
        for (int i15 = 0; i15 < i14; i15++) {
            if (!k.a(charSequence.charAt(i12 + i15), charSequence2.charAt(i13 + i15), z12)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean a(CharSequence charSequence, CharSequence charSequence2, boolean z12) {
        y0.b(charSequence, "$this$contains");
        y0.b(charSequence2, PluralsKeys.OTHER);
        return !(charSequence2 instanceof String) ? a(charSequence, charSequence2, 0, charSequence.length(), z12, false, 16, null) < 0 : a(charSequence, (String) charSequence2, 0, z12, 2, (Object) null) < 0;
    }

    public static /* synthetic */ boolean a(CharSequence charSequence, CharSequence charSequence2, boolean z12, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z12 = false;
        }
        return a(charSequence, charSequence2, z12);
    }
}
