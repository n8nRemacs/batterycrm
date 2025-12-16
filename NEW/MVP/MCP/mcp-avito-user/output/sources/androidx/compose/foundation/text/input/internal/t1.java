package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.v0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: TransformedTextFieldState.kt */
@F3
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/internal/t1;", "", "a", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final a f31451h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.text.input.p f31452a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public androidx.compose.foundation.text.input.c f31453b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final r f31454c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.foundation.text.input.h f31455d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final I3<b> f31456e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final I3<b> f31457f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31458g;

    /* compiled from: TransformedTextFieldState.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/internal/t1$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: TransformedTextFieldState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.text.input.internal.t1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1623a {
            static {
                int[] iArr = new int[WedgeAffinity.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    WedgeAffinity wedgeAffinity = WedgeAffinity.f31012b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static final b a(a aVar, androidx.compose.foundation.text.input.l lVar, androidx.compose.foundation.text.input.h hVar, F0 f02) {
            aVar.getClass();
            C20954z0 c20954z0 = new C20954z0();
            androidx.compose.foundation.text.input.i iVar = new androidx.compose.foundation.text.input.i(lVar, null, null, c20954z0, 6, null);
            hVar.a();
            androidx.compose.ui.text.v0 v0VarA = null;
            if (iVar.a().f31175a.f38262d == 0) {
                return null;
            }
            long jC2 = c(lVar.f31512d, c20954z0, f02);
            androidx.compose.ui.text.v0 v0Var = lVar.f31513e;
            if (v0Var != null) {
                t1.f31451h.getClass();
                v0VarA = androidx.compose.ui.text.v0.a(c(v0Var.f42736a, c20954z0, f02));
            }
            return new b(androidx.compose.foundation.text.input.i.h(iVar, jC2, v0VarA, 4), c20954z0);
        }

        public static final long b(a aVar, long j12, C20954z0 c20954z0) {
            aVar.getClass();
            v0.a aVar2 = androidx.compose.ui.text.v0.f42734b;
            long jA2 = c20954z0.a((int) (j12 >> 32), false);
            long jA3 = androidx.compose.ui.text.v0.d(j12) ? jA2 : c20954z0.a((int) (4294967295L & j12), false);
            int iMin = Math.min(androidx.compose.ui.text.v0.g(jA2), androidx.compose.ui.text.v0.g(jA3));
            int iMax = Math.max(androidx.compose.ui.text.v0.f(jA2), androidx.compose.ui.text.v0.f(jA3));
            return androidx.compose.ui.text.v0.h(j12) ? androidx.compose.ui.text.w0.a(iMax, iMin) : androidx.compose.ui.text.w0.a(iMin, iMax);
        }

        @X41.n
        public static long c(long j12, C20954z0 c20954z0, F0 f02) {
            long jA2;
            v0.a aVar = androidx.compose.ui.text.v0.f42734b;
            long jA3 = c20954z0.a((int) (j12 >> 32), true);
            long jA4 = androidx.compose.ui.text.v0.d(j12) ? jA3 : c20954z0.a((int) (j12 & 4294967295L), true);
            WedgeAffinity wedgeAffinity = null;
            WedgeAffinity wedgeAffinity2 = f02 != null ? f02.f30818a : null;
            if (androidx.compose.ui.text.v0.d(j12)) {
                wedgeAffinity = wedgeAffinity2;
            } else if (f02 != null) {
                wedgeAffinity = f02.f30819b;
            }
            if (wedgeAffinity2 != null && !androidx.compose.ui.text.v0.d(jA3)) {
                int iOrdinal = wedgeAffinity2.ordinal();
                if (iOrdinal == 0) {
                    int i12 = (int) (jA3 >> 32);
                    jA3 = androidx.compose.ui.text.w0.a(i12, i12);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i13 = (int) (jA3 & 4294967295L);
                    jA3 = androidx.compose.ui.text.w0.a(i13, i13);
                }
            }
            if (wedgeAffinity != null && !androidx.compose.ui.text.v0.d(jA4)) {
                int iOrdinal2 = wedgeAffinity.ordinal();
                if (iOrdinal2 == 0) {
                    int i14 = (int) (jA4 >> 32);
                    jA2 = androidx.compose.ui.text.w0.a(i14, i14);
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i15 = (int) (jA4 & 4294967295L);
                    jA2 = androidx.compose.ui.text.w0.a(i15, i15);
                }
                jA4 = jA2;
            }
            int iMin = Math.min(androidx.compose.ui.text.v0.g(jA3), androidx.compose.ui.text.v0.g(jA4));
            int iMax = Math.max(androidx.compose.ui.text.v0.f(jA3), androidx.compose.ui.text.v0.f(jA4));
            return androidx.compose.ui.text.v0.h(j12) ? androidx.compose.ui.text.w0.a(iMax, iMin) : androidx.compose.ui.text.w0.a(iMin, iMax);
        }

        public a() {
        }
    }

    /* compiled from: TransformedTextFieldState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/t1$b;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final androidx.compose.foundation.text.input.l f31459a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C20954z0 f31460b;

        public b(@Y61.k androidx.compose.foundation.text.input.l lVar, @Y61.k C20954z0 c20954z0) {
            this.f31459a = lVar;
            this.f31460b = c20954z0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.L.f(this.f31459a, bVar.f31459a) && kotlin.jvm.internal.L.f(this.f31460b, bVar.f31460b);
        }

        public final int hashCode() {
            return this.f31460b.hashCode() + (this.f31459a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "TransformedText(text=" + ((Object) this.f31459a) + ", offsetMapping=" + this.f31460b + ')';
        }
    }

    public t1(androidx.compose.foundation.text.input.p pVar, androidx.compose.foundation.text.input.c cVar, r rVar, androidx.compose.foundation.text.input.h hVar, int i12, C42822w c42822w) {
        cVar = (i12 & 2) != 0 ? null : cVar;
        rVar = (i12 & 4) != 0 ? null : rVar;
        hVar = (i12 & 8) != 0 ? null : hVar;
        this.f31452a = pVar;
        this.f31453b = cVar;
        this.f31454c = rVar;
        this.f31455d = hVar;
        this.f31456e = hVar != null ? C22126m3.d(new x1(this, hVar)) : null;
        this.f31457f = rVar != null ? C22126m3.d(new u1(this, rVar)) : null;
        WedgeAffinity wedgeAffinity = WedgeAffinity.f31012b;
        this.f31458g = C22126m3.g(new F0(wedgeAffinity, wedgeAffinity));
    }

    public static void i(t1 t1Var, CharSequence charSequence, boolean z12, int i12) {
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f31478c;
        boolean z13 = (i12 & 2) == 0;
        if ((i12 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f31477b;
        }
        if ((i12 & 8) != 0) {
            z12 = true;
        }
        androidx.compose.foundation.text.input.c cVar = t1Var.f31453b;
        androidx.compose.foundation.text.input.p pVar = t1Var.f31452a;
        pVar.f31519b.a().b();
        androidx.compose.foundation.text.input.i iVar = pVar.f31519b;
        if (z13) {
            iVar.f(null);
        }
        long j12 = iVar.f30759f;
        iVar.c(androidx.compose.ui.text.v0.g(j12), androidx.compose.ui.text.v0.f(j12), charSequence);
        int length = charSequence.length() + androidx.compose.ui.text.v0.g(j12);
        androidx.compose.foundation.text.input.k.b(iVar, length, length);
        t1Var.m(iVar);
        androidx.compose.foundation.text.input.p.a(pVar, cVar, z12, textFieldEditUndoBehavior);
    }

    public static void j(t1 t1Var, String str, long j12, boolean z12, int i12) {
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f31477b;
        if ((i12 & 8) != 0) {
            z12 = true;
        }
        androidx.compose.foundation.text.input.c cVar = t1Var.f31453b;
        androidx.compose.foundation.text.input.p pVar = t1Var.f31452a;
        pVar.f31519b.a().b();
        androidx.compose.foundation.text.input.i iVar = pVar.f31519b;
        long jF2 = t1Var.f(j12);
        iVar.c(androidx.compose.ui.text.v0.g(jF2), androidx.compose.ui.text.v0.f(jF2), str);
        int length = str.length() + androidx.compose.ui.text.v0.g(jF2);
        androidx.compose.foundation.text.input.k.b(iVar, length, length);
        t1Var.m(iVar);
        androidx.compose.foundation.text.input.p.a(pVar, cVar, z12, textFieldEditUndoBehavior);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v5, types: [androidx.compose.foundation.text.input.internal.s1] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k final androidx.compose.foundation.text.input.internal.C20891g r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.text.input.internal.v1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.text.input.internal.v1 r0 = (androidx.compose.foundation.text.input.internal.v1) r0
            int r1 = r0.f31498t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31498t = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.v1 r0 = new androidx.compose.foundation.text.input.internal.v1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f31496r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f31498t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            kotlin.C42729a0.b(r6)
            goto L6d
        L31:
            kotlin.C42729a0.b(r6)
            androidx.compose.foundation.text.input.h r6 = r4.f31455d
            if (r6 == 0) goto L3e
            androidx.compose.foundation.text.input.internal.s1 r6 = new androidx.compose.foundation.text.input.internal.s1
            r6.<init>()
            r5 = r6
        L3e:
            r0.f31495q = r5
            r0.f31498t = r3
            kotlinx.coroutines.r r6 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r6.<init>(r3, r2)
            r6.p()
            androidx.compose.foundation.text.input.p r2 = r4.f31452a
            androidx.compose.runtime.collection.e<androidx.compose.foundation.text.input.p$a> r2 = r2.f31523f
            r2.b(r5)
            androidx.compose.foundation.text.input.internal.w1 r2 = new androidx.compose.foundation.text.input.internal.w1
            r2.<init>(r4, r5)
            r6.r(r2)
            java.lang.Object r5 = r6.o()
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r5 != r6) goto L6a
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L6a:
            if (r5 != r1) goto L6d
            return r1
        L6d:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.t1.a(androidx.compose.foundation.text.input.internal.g, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Y61.k
    public final androidx.compose.foundation.text.input.l b() {
        b f42167b;
        I3<b> i32 = this.f31456e;
        return (i32 == null || (f42167b = i32.getF42167b()) == null) ? this.f31452a.b() : f42167b.f31459a;
    }

    @Y61.k
    public final F0 c() {
        return (F0) ((C22082i3) this.f31458g).getF42167b();
    }

    @Y61.k
    public final androidx.compose.foundation.text.input.l d() {
        b f42167b;
        I3<b> i32 = this.f31457f;
        return (i32 == null || (f42167b = i32.getF42167b()) == null) ? b() : f42167b.f31459a;
    }

    public final long e(int i12) {
        b f42167b;
        b f42167b2;
        I3<b> i32 = this.f31456e;
        C20954z0 c20954z0 = null;
        C20954z0 c20954z02 = (i32 == null || (f42167b2 = i32.getF42167b()) == null) ? null : f42167b2.f31460b;
        I3<b> i33 = this.f31457f;
        if (i33 != null && (f42167b = i33.getF42167b()) != null) {
            c20954z0 = f42167b.f31460b;
        }
        long jA2 = c20954z0 != null ? c20954z0.a(i12, false) : androidx.compose.ui.text.w0.a(i12, i12);
        return c20954z02 != null ? a.b(f31451h, jA2, c20954z02) : jA2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        if (kotlin.jvm.internal.L.f(this.f31452a, t1Var.f31452a) && kotlin.jvm.internal.L.f(this.f31454c, t1Var.f31454c)) {
            return kotlin.jvm.internal.L.f(this.f31455d, t1Var.f31455d);
        }
        return false;
    }

    public final long f(long j12) {
        b f42167b;
        b f42167b2;
        I3<b> i32 = this.f31456e;
        C20954z0 c20954z0 = null;
        C20954z0 c20954z02 = (i32 == null || (f42167b2 = i32.getF42167b()) == null) ? null : f42167b2.f31460b;
        I3<b> i33 = this.f31457f;
        if (i33 != null && (f42167b = i33.getF42167b()) != null) {
            c20954z0 = f42167b.f31460b;
        }
        a aVar = f31451h;
        if (c20954z0 != null) {
            j12 = a.b(aVar, j12, c20954z0);
        }
        return c20954z02 != null ? a.b(aVar, j12, c20954z02) : j12;
    }

    public final long g(long j12) {
        b f42167b;
        b f42167b2;
        I3<b> i32 = this.f31456e;
        C20954z0 c20954z0 = (i32 == null || (f42167b2 = i32.getF42167b()) == null) ? null : f42167b2.f31460b;
        I3<b> i33 = this.f31457f;
        C20954z0 c20954z02 = (i33 == null || (f42167b = i33.getF42167b()) == null) ? null : f42167b.f31460b;
        a aVar = f31451h;
        if (c20954z0 != null) {
            aVar.getClass();
            j12 = a.c(j12, c20954z0, null);
        }
        if (c20954z02 == null) {
            return j12;
        }
        F0 f0C = c();
        aVar.getClass();
        return a.c(j12, c20954z02, f0C);
    }

    public final void h(@Y61.k C22602e c22602e) {
        androidx.compose.foundation.text.input.c cVar = this.f31453b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f31477b;
        androidx.compose.foundation.text.input.p pVar = this.f31452a;
        pVar.f31519b.a().b();
        androidx.compose.foundation.text.input.i iVar = pVar.f31519b;
        iVar.d(0, iVar.f30757d.length(), "", 0, 0);
        iVar.append(c22602e.f42127c);
        m(iVar);
        androidx.compose.foundation.text.input.p.a(pVar, cVar, true, textFieldEditUndoBehavior);
    }

    public final int hashCode() {
        int iHashCode = this.f31452a.hashCode() * 31;
        r rVar = this.f31454c;
        int iHashCode2 = (iHashCode + (rVar != null ? rVar.hashCode() : 0)) * 31;
        androidx.compose.foundation.text.input.h hVar = this.f31455d;
        return iHashCode2 + (hVar != null ? hVar.hashCode() : 0);
    }

    public final void k(long j12) {
        l(f(j12));
    }

    public final void l(long j12) {
        androidx.compose.foundation.text.input.c cVar = this.f31453b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f31477b;
        androidx.compose.foundation.text.input.p pVar = this.f31452a;
        pVar.f31519b.a().b();
        androidx.compose.foundation.text.input.i iVar = pVar.f31519b;
        v0.a aVar = androidx.compose.ui.text.v0.f42734b;
        androidx.compose.foundation.text.input.k.b(iVar, (int) (j12 >> 32), (int) (j12 & 4294967295L));
        androidx.compose.foundation.text.input.p.a(pVar, cVar, true, textFieldEditUndoBehavior);
    }

    public final void m(androidx.compose.foundation.text.input.i iVar) {
        if (iVar.a().f31175a.f38262d <= 0 || !androidx.compose.ui.text.v0.d(iVar.f30759f)) {
            return;
        }
        WedgeAffinity wedgeAffinity = WedgeAffinity.f31012b;
        ((C22082i3) this.f31458g).setValue(new F0(wedgeAffinity, wedgeAffinity));
    }

    @Y61.k
    public final String toString() {
        return "TransformedTextFieldState(textFieldState=" + this.f31452a + ", outputTransformation=" + this.f31455d + ", outputTransformedText=" + this.f31456e + ", codepointTransformation=" + this.f31454c + ", codepointTransformedText=" + this.f31457f + ", outputText=\"" + ((Object) b()) + "\", visualText=\"" + ((Object) d()) + "\")";
    }
}
