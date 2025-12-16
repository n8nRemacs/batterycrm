package androidx.compose.foundation.gestures;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C42822w;
import kotlin.sequences.C43033p;
import kotlinx.coroutines.channels.C43108m;
import l0.g;

/* compiled from: MouseWheelScrollable.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/g1;", "", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.gestures.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20456g1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C20433a2 f27713a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC20524z1 f27714b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.p<androidx.compose.ui.unit.B, Continuation<? super kotlin.G0>, Object> f27715c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public androidx.compose.ui.unit.d f27716d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27718f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public kotlinx.coroutines.N0 f27719g;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C43108m f27717e = kotlinx.coroutines.channels.A.a(Integer.MAX_VALUE, null, null, 6);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C20503s1 f27720h = new C20503s1();

    /* compiled from: MouseWheelScrollable.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/gestures/g1$a;", "", "Ll0/g;", "value", "", "timeMillis", "", "shouldApplyImmediately", "<init>", "(JJZLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.g1$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f27721a;

        /* renamed from: b, reason: collision with root package name */
        public final long f27722b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f27723c;

        public a(long j12, long j13, boolean z12, C42822w c42822w) {
            this.f27721a = j12;
            this.f27722b = j13;
            this.f27723c = z12;
        }

        @Y61.k
        public final a a(@Y61.k a aVar) {
            return new a(l0.g.j(this.f27721a, aVar.f27721a), Math.max(this.f27722b, aVar.f27722b), this.f27723c, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l0.g.d(this.f27721a, aVar.f27721a) && this.f27722b == aVar.f27722b && this.f27723c == aVar.f27723c;
        }

        public final int hashCode() {
            g.a aVar = l0.g.f413384b;
            return Boolean.hashCode(this.f27723c) + androidx.appcompat.app.r.g(Long.hashCode(this.f27721a) * 31, 31, this.f27722b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MouseWheelScrollDelta(value=");
            sb2.append((Object) l0.g.l(this.f27721a));
            sb2.append(", timeMillis=");
            sb2.append(this.f27722b);
            sb2.append(", shouldApplyImmediately=");
            return androidx.appcompat.app.r.x(sb2, this.f27723c, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20456g1(@Y61.k C20433a2 c20433a2, @Y61.k InterfaceC20524z1 interfaceC20524z1, @Y61.k Y41.p<? super androidx.compose.ui.unit.B, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, @Y61.k androidx.compose.ui.unit.d dVar) {
        this.f27713a = c20433a2;
        this.f27714b = interfaceC20524z1;
        this.f27715c = pVar;
        this.f27716d = dVar;
    }

    public static final float a(C20456g1 c20456g1, InterfaceC20506t1 interfaceC20506t1, float f12) {
        C20433a2 c20433a2 = c20456g1.f27713a;
        long jH2 = c20433a2.h(c20433a2.d(f12));
        androidx.compose.ui.input.nestedscroll.i.f40105b.getClass();
        return c20433a2.g(c20433a2.e(interfaceC20506t1.b(androidx.compose.ui.input.nestedscroll.i.f40106c, jH2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, androidx.compose.animation.core.r] */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, androidx.compose.foundation.gestures.g1$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(androidx.compose.foundation.gestures.C20456g1 r17, androidx.compose.foundation.gestures.C20433a2 r18, androidx.compose.foundation.gestures.C20456g1.a r19, float r20, float r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20456g1.b(androidx.compose.foundation.gestures.g1, androidx.compose.foundation.gestures.a2, androidx.compose.foundation.gestures.g1$a, float, float, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, androidx.compose.animation.core.r] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.compose.foundation.gestures.g1$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(androidx.compose.foundation.gestures.C20456g1 r14, kotlin.jvm.internal.l0.h r15, kotlin.jvm.internal.l0.e r16, androidx.compose.foundation.gestures.C20433a2 r17, kotlin.jvm.internal.l0.h r18, long r19, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            r0 = r14
            r1 = r19
            r3 = r21
            boolean r4 = r3 instanceof androidx.compose.foundation.gestures.C20476l1
            if (r4 == 0) goto L18
            r4 = r3
            androidx.compose.foundation.gestures.l1 r4 = (androidx.compose.foundation.gestures.C20476l1) r4
            int r5 = r4.f27844w
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L18
            int r5 = r5 - r6
            r4.f27844w = r5
            goto L1d
        L18:
            androidx.compose.foundation.gestures.l1 r4 = new androidx.compose.foundation.gestures.l1
            r4.<init>(r3)
        L1d:
            java.lang.Object r3 = r4.f27843v
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r4.f27844w
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L45
            if (r6 != r8) goto L3d
            kotlin.jvm.internal.l0$h r0 = r4.f27842u
            androidx.compose.foundation.gestures.a2 r1 = r4.f27841t
            kotlin.jvm.internal.l0$e r2 = r4.f27840s
            kotlin.jvm.internal.l0$h r5 = r4.f27839r
            androidx.compose.foundation.gestures.g1 r4 = r4.f27838q
            kotlin.C42729a0.b(r3)
            r11 = r0
            r10 = r1
            r9 = r2
            r0 = r4
            goto L74
        L3d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L45:
            kotlin.C42729a0.b(r3)
            r9 = 0
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 >= 0) goto L53
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r7)
            goto Lb6
        L53:
            androidx.compose.foundation.gestures.m1 r3 = new androidx.compose.foundation.gestures.m1
            r6 = 0
            r3.<init>(r14, r6)
            r4.f27838q = r0
            r6 = r15
            r4.f27839r = r6
            r9 = r16
            r4.f27840s = r9
            r10 = r17
            r4.f27841t = r10
            r11 = r18
            r4.f27842u = r11
            r4.f27844w = r8
            java.lang.Object r3 = kotlinx.coroutines.D1.c(r1, r3, r4)
            if (r3 != r5) goto L73
            goto Lb6
        L73:
            r5 = r6
        L74:
            androidx.compose.foundation.gestures.g1$a r3 = (androidx.compose.foundation.gestures.C20456g1.a) r3
            if (r3 == 0) goto Lb2
            T r1 = r5.f406842b
            androidx.compose.foundation.gestures.g1$a r1 = (androidx.compose.foundation.gestures.C20456g1.a) r1
            boolean r1 = r1.f27723c
            androidx.compose.foundation.gestures.g1$a r2 = new androidx.compose.foundation.gestures.g1$a
            long r6 = r3.f27722b
            r4 = 0
            long r12 = r3.f27721a
            r14 = r2
            r15 = r12
            r17 = r6
            r19 = r1
            r20 = r4
            r14.<init>(r15, r17, r19, r20)
            r5.f406842b = r2
            long r1 = r2.f27721a
            long r1 = r10.e(r1)
            float r1 = r10.g(r1)
            r9.f406839b = r1
            r1 = 30
            r2 = 0
            androidx.compose.animation.core.r r1 = androidx.compose.animation.core.C20315s.a(r2, r2, r1)
            r11.f406842b = r1
            r0.e(r3)
            float r0 = r9.f406839b
            boolean r0 = androidx.compose.foundation.gestures.C20452f1.a(r0)
            r7 = r0 ^ 1
        Lb2:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r7)
        Lb6:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20456g1.c(androidx.compose.foundation.gestures.g1, kotlin.jvm.internal.l0$h, kotlin.jvm.internal.l0$e, androidx.compose.foundation.gestures.a2, kotlin.jvm.internal.l0$h, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static a d(C43108m c43108m) {
        a aVar = null;
        Iterator itV = C43033p.v(new C20492p1(new C20488o1(c43108m), null));
        while (itV.hasNext()) {
            a aVarA = (a) itV.next();
            if (aVar != null) {
                aVarA = aVar.a(aVarA);
            }
            aVar = aVarA;
        }
        return aVar;
    }

    public final void e(a aVar) {
        long j12 = aVar.f27722b;
        C20503s1 c20503s1 = this.f27720h;
        c20503s1.getClass();
        long j13 = aVar.f27721a;
        c20503s1.f27998a.a(j12, Float.intBitsToFloat((int) (j13 >> 32)));
        c20503s1.f27999b.a(j12, Float.intBitsToFloat((int) (j13 & 4294967295L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(androidx.compose.foundation.gestures.C20433a2 r5, Y41.p r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.C20496q1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.q1 r0 = (androidx.compose.foundation.gestures.C20496q1) r0
            int r1 = r0.f27925t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27925t = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.q1 r0 = new androidx.compose.foundation.gestures.q1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f27923r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27925t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            androidx.compose.foundation.gestures.g1 r5 = r0.f27922q
            kotlin.C42729a0.b(r7)
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r7)
            r4.f27718f = r3
            androidx.compose.foundation.gestures.r1 r7 = new androidx.compose.foundation.gestures.r1
            r2 = 0
            r7.<init>(r6, r5, r2)
            r0.f27922q = r4
            r0.f27925t = r3
            java.lang.Object r5 = kotlinx.coroutines.t1.c(r7, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            r5 = r4
        L4a:
            r6 = 0
            r5.f27718f = r6
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20456g1.f(androidx.compose.foundation.gestures.a2, Y41.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
