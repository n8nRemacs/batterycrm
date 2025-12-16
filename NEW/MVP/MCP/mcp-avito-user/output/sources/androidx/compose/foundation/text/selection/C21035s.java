package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.C21045x;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;

/* compiled from: MultiWidgetSelectionDelegate.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/s;", "Landroidx/compose/foundation/text/selection/v;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.selection.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21035s implements InterfaceC21041v {

    /* renamed from: a, reason: collision with root package name */
    public final long f32124a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.a<androidx.compose.ui.layout.A> f32125b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.a<androidx.compose.ui.text.o0> f32126c;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.text.o0 f32128e;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C21035s f32127d = this;

    /* renamed from: f, reason: collision with root package name */
    public int f32129f = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public C21035s(long j12, @Y61.k Y41.a<? extends androidx.compose.ui.layout.A> aVar, @Y61.k Y41.a<androidx.compose.ui.text.o0> aVar2) {
        this.f32124a = j12;
        this.f32125b = aVar;
        this.f32126c = aVar2;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21041v
    public final float a(int i12) {
        androidx.compose.ui.text.G g12;
        int iD2;
        androidx.compose.ui.text.o0 o0VarInvoke = this.f32126c.invoke();
        if (o0VarInvoke != null && (iD2 = (g12 = o0VarInvoke.f42527b).d(i12)) < g12.f41921f) {
            return o0VarInvoke.g(iD2);
        }
        return -1.0f;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21041v
    public final float b(int i12) {
        androidx.compose.ui.text.G g12;
        int iD2;
        androidx.compose.ui.text.o0 o0VarInvoke = this.f32126c.invoke();
        if (o0VarInvoke != null && (iD2 = (g12 = o0VarInvoke.f42527b).d(i12)) < g12.f41921f) {
            return o0VarInvoke.h(iD2);
        }
        return -1.0f;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21041v
    @Y61.l
    public final androidx.compose.ui.layout.A c() {
        androidx.compose.ui.layout.A aInvoke = this.f32125b.invoke();
        if (aInvoke == null || !aInvoke.m()) {
            return null;
        }
        return aInvoke;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21041v
    public final long d(@Y61.k C21045x c21045x, boolean z12) {
        C21045x.a aVar = c21045x.f32156a;
        long j12 = this.f32124a;
        if (!z12 || aVar.f32161c == j12) {
            C21045x.a aVar2 = c21045x.f32157b;
            if (z12 || aVar2.f32161c == j12) {
                if (c() == null) {
                    l0.g.f413384b.getClass();
                    return l0.g.f413386d;
                }
                androidx.compose.ui.text.o0 o0VarInvoke = this.f32126c.invoke();
                if (o0VarInvoke != null) {
                    return F1.a(o0VarInvoke, kotlin.ranges.s.g(z12 ? aVar.f32160b : aVar2.f32160b, 0, k(o0VarInvoke)), z12, c21045x.f32158c);
                }
                l0.g.f413384b.getClass();
                return l0.g.f413386d;
            }
        }
        l0.g.f413384b.getClass();
        return l0.g.f413386d;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21041v
    public final int e() {
        androidx.compose.ui.text.o0 o0VarInvoke = this.f32126c.invoke();
        if (o0VarInvoke == null) {
            return 0;
        }
        return k(o0VarInvoke);
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21041v
    public final float f(int i12) {
        androidx.compose.ui.text.G g12;
        int iD2;
        androidx.compose.ui.text.o0 o0VarInvoke = this.f32126c.invoke();
        if (o0VarInvoke == null || (iD2 = (g12 = o0VarInvoke.f42527b).d(i12)) >= g12.f41921f) {
            return -1.0f;
        }
        float f12 = g12.f(iD2);
        return ((g12.b(iD2) - f12) / 2) + f12;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21041v
    /* renamed from: g, reason: from getter */
    public final long getF32124a() {
        return this.f32124a;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21041v
    @Y61.k
    public final C22602e getText() {
        androidx.compose.ui.text.o0 o0VarInvoke = this.f32126c.invoke();
        return o0VarInvoke == null ? new C22602e("", null, 2, null) : o0VarInvoke.f42526a.f42506a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02a1, code lost:
    
        if (r9 == 254) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02a4, code lost:
    
        r9 = java.lang.Long.hashCode(r2[r5]) * (-862048943);
        r14 = (r9 ^ (r9 << 16)) >>> 7;
        r10 = r3.c(r14);
        r14 = r14 & r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02c7, code lost:
    
        if ((((r10 - r14) & r1) / 8) != (((r5 - r14) & r1) / 8)) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02c9, code lost:
    
        r0[r6] = ((r9 & 127) << r11) | ((~(255 << r11)) & r0[r6]);
        r0[r0.length - 1] = (r0[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02f4, code lost:
    
        r34 = r12;
        r12 = r10 >> 3;
        r13 = r0[r12];
        r15 = (r10 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0309, code lost:
    
        if (((r13 >> r15) & 255) != 128) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x030b, code lost:
    
        r37 = r7;
        r36 = r8;
        r38 = r3;
        r39 = r4;
        r0[r12] = ((~(255 << r15)) & r13) | ((r9 & 127) << r15);
        r0[r6] = (r0[r6] & (~(255 << r11))) | (128 << r11);
        r2[r10] = r2[r5];
        r2[r5] = 0;
        r39[r10] = r39[r5];
        r39[r5] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x033c, code lost:
    
        r38 = r3;
        r39 = r4;
        r37 = r7;
        r36 = r8;
        r0[r12] = ((r9 & 127) << r15) | ((~(255 << r15)) & r13);
        r3 = r2[r10];
        r2[r10] = r2[r5];
        r2[r5] = r3;
        r3 = r39[r10];
        r39[r10] = r39[r5];
        r39[r5] = r3;
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0365, code lost:
    
        r0[r0.length - 1] = (r0[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
        r12 = r34;
        r8 = r36;
        r7 = r37;
        r3 = r38;
        r4 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0383, code lost:
    
        r5 = r3;
        r37 = r7;
        r34 = r12;
        r5.f25543f = androidx.collection.i1.a(r5.f25592d) - r5.f25593e;
        r0 = r8;
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x039b, code lost:
    
        r5 = r3;
        r37 = r7;
        r36 = r8;
        r34 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x03a4, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x03a7, code lost:
    
        r0 = androidx.collection.i1.c(r5.f25592d);
        r1 = r5.f25589a;
        r2 = r5.f25590b;
        r3 = r5.f25591c;
        r4 = r5.f25592d;
        r5.d(r0);
        r0 = r5.f25589a;
        r6 = r5.f25590b;
        r8 = r5.f25591c;
        r9 = r5.f25592d;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03c1, code lost:
    
        if (r10 >= r4) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x03d4, code lost:
    
        if (((r1[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= 128) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x03d6, code lost:
    
        r11 = r2[r10];
        r14 = java.lang.Long.hashCode(r11) * (-862048943);
        r14 = r14 ^ (r14 << 16);
        r7 = r5.c(r14 >>> 7);
        r18 = r1;
        r19 = r2;
        r1 = r14 & 127;
        r14 = r7 >> 3;
        r20 = (r7 & 7) << 3;
        r1 = (r1 << r20) | (r0[r14] & (~(255 << r20)));
        r0[r14] = r1;
        r0[(((r7 - 7) & r9) + (r9 & 7)) >> 3] = r1;
        r6[r7] = r11;
        r8[r7] = r3[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x041b, code lost:
    
        r18 = r1;
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0423, code lost:
    
        r10 = r10 + 1;
        r1 = r18;
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x042a, code lost:
    
        r1 = 1;
        r0 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x042d, code lost:
    
        r0 = r5.c(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0431, code lost:
    
        r5.f25593e += r1;
        r2 = r5.f25543f;
        r3 = r5.f25589a;
        r4 = r0 >> 3;
        r6 = r3[r4];
        r8 = (r0 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x044c, code lost:
    
        if (((r6 >> r8) & 255) != 128) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x044e, code lost:
    
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0450, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0451, code lost:
    
        r5.f25543f = r2 - r9;
        r1 = r5.f25592d;
        r6 = (r6 & (~(255 << r8))) | (r34 << r8);
        r3[r4] = r6;
        r3[(((r0 - 7) & r1) + (r1 & 7)) >> 3] = r6;
        r0 = ~r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01fb, code lost:
    
        if (((((~r5) << 6) & r5) & (-9187201950435737472L)) == 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01fd, code lost:
    
        r0 = r3.c(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0205, code lost:
    
        if (r3.f25543f != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0218, code lost:
    
        if (((r3.f25589a[r0 >> 3] >> ((r0 & 7) << 3)) & 255) != 254) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x021a, code lost:
    
        r17 = r2;
        r5 = r3;
        r37 = r7;
        r34 = r12;
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0224, code lost:
    
        r0 = r3.f25592d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0226, code lost:
    
        if (r0 <= 8) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0228, code lost:
    
        r14 = r3.f25593e;
        r4 = kotlin.w0.f410662c;
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x023c, code lost:
    
        if (java.lang.Long.compareUnsigned(r14 * 32, r0 * 25) > 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x023e, code lost:
    
        r0 = r3.f25589a;
        r1 = r3.f25592d;
        r2 = r3.f25590b;
        r4 = r3.f25591c;
        r11 = 7;
        r14 = (r1 + 7) >> 3;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x024c, code lost:
    
        if (r15 >= r14) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x024e, code lost:
    
        r5 = r0[r15] & (-9187201950435737472L);
        r0[r15] = (-72340172838076674L) & ((~r5) + (r5 >>> r11));
        r15 = r15 + 1;
        r11 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0268, code lost:
    
        r6 = r0.length;
        r9 = r6 - 1;
        r6 = r6 - 2;
        r0[r6] = (r0[r6] & 72057594037927935L) | (-72057594037927936L);
        r0[r9] = r0[0];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0282, code lost:
    
        if (r5 == r1) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0284, code lost:
    
        r6 = r5 >> 3;
        r11 = (r5 & 7) << 3;
        r9 = (r0[r6] >> r11) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0296, code lost:
    
        if (r9 != 128) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x029a, code lost:
    
        r5 = r5 + 1;
     */
    @Override // androidx.compose.foundation.text.selection.InterfaceC21041v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(@Y61.k androidx.compose.foundation.text.selection.C21025m0 r41) {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C21035s.h(androidx.compose.foundation.text.selection.m0):void");
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21041v
    public final long i(int i12) {
        androidx.compose.ui.text.o0 o0VarInvoke = this.f32126c.invoke();
        if (o0VarInvoke == null) {
            androidx.compose.ui.text.v0.f42734b.getClass();
            return androidx.compose.ui.text.v0.f42735c;
        }
        int iK2 = k(o0VarInvoke);
        if (iK2 < 1) {
            androidx.compose.ui.text.v0.f42734b.getClass();
            return androidx.compose.ui.text.v0.f42735c;
        }
        int iG2 = kotlin.ranges.s.g(i12, 0, iK2 - 1);
        androidx.compose.ui.text.G g12 = o0VarInvoke.f42527b;
        int iD2 = g12.d(iG2);
        return androidx.compose.ui.text.w0.a(o0VarInvoke.i(iD2), g12.c(iD2, true));
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21041v
    @Y61.l
    public final C21045x j() {
        androidx.compose.ui.text.o0 o0VarInvoke = this.f32126c.invoke();
        if (o0VarInvoke == null) {
            return null;
        }
        int length = o0VarInvoke.f42526a.f42506a.f42127c.length();
        ResolvedTextDirection resolvedTextDirectionA = o0VarInvoke.a(0);
        long j12 = this.f32124a;
        return new C21045x(new C21045x.a(resolvedTextDirectionA, 0, j12), new C21045x.a(o0VarInvoke.a(Math.max(length - 1, 0)), length, j12), false);
    }

    public final int k(androidx.compose.ui.text.o0 o0Var) {
        int i12;
        int iE2;
        synchronized (this.f32127d) {
            try {
                if (this.f32128e != o0Var) {
                    if (o0Var.d()) {
                        androidx.compose.ui.text.G g12 = o0Var.f42527b;
                        if (g12.f41918c) {
                            iE2 = o0Var.f42527b.f41921f - 1;
                            this.f32129f = o0Var.f42527b.c(iE2, true);
                            this.f32128e = o0Var;
                        } else {
                            iE2 = g12.e((int) (o0Var.f42528c & 4294967295L));
                            int i13 = o0Var.f42527b.f41921f - 1;
                            if (iE2 > i13) {
                                iE2 = i13;
                            }
                            while (iE2 >= 0 && o0Var.f42527b.f(iE2) >= ((int) (o0Var.f42528c & 4294967295L))) {
                                iE2--;
                            }
                            if (iE2 < 0) {
                                iE2 = 0;
                            }
                            this.f32129f = o0Var.f42527b.c(iE2, true);
                            this.f32128e = o0Var;
                        }
                    } else {
                        iE2 = o0Var.f42527b.f41921f - 1;
                        this.f32129f = o0Var.f42527b.c(iE2, true);
                        this.f32128e = o0Var;
                    }
                }
                i12 = this.f32129f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i12;
    }
}
