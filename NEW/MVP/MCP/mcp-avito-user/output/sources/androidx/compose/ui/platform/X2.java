package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: Wrapper.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class X2 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y2 f41329l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f41330m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X2(Y2 y22, C22096n c22096n) {
        super(2);
        this.f41329l = y22;
        this.f41330m = c22096n;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    @Override // Y41.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.runtime.A r7, java.lang.Integer r8) {
        /*
            r6 = this;
            androidx.compose.runtime.A r7 = (androidx.compose.runtime.A) r7
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r0 = r8 & 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L11
            r0 = r2
            goto L12
        L11:
            r0 = r3
        L12:
            r8 = r8 & r2
            boolean r8 = r7.p(r8, r0)
            if (r8 == 0) goto Lc5
            androidx.compose.ui.platform.Y2 r8 = r6.f41329l
            androidx.compose.ui.platform.AndroidComposeView r0 = r8.f41337b
            r1 = 2131367239(0x7f0a1547, float:1.8354394E38)
            java.lang.Object r0 = r0.getTag(r1)
            boolean r4 = r0 instanceof java.util.Set
            if (r4 == 0) goto L31
            boolean r4 = r0 instanceof Z41.a
            if (r4 == 0) goto L32
            boolean r4 = r0 instanceof Z41.h
            if (r4 == 0) goto L31
            goto L32
        L31:
            r2 = r3
        L32:
            r3 = 0
            if (r2 == 0) goto L38
            java.util.Set r0 = (java.util.Set) r0
            goto L39
        L38:
            r0 = r3
        L39:
            androidx.compose.ui.platform.AndroidComposeView r2 = r8.f41337b
            if (r0 != 0) goto L61
            android.view.ViewParent r0 = r2.getParent()
            boolean r4 = r0 instanceof android.view.View
            if (r4 == 0) goto L48
            android.view.View r0 = (android.view.View) r0
            goto L49
        L48:
            r0 = r3
        L49:
            if (r0 == 0) goto L50
            java.lang.Object r0 = r0.getTag(r1)
            goto L51
        L50:
            r0 = r3
        L51:
            boolean r1 = r0 instanceof java.util.Set
            if (r1 == 0) goto L60
            boolean r1 = r0 instanceof Z41.a
            if (r1 == 0) goto L5d
            boolean r1 = r0 instanceof Z41.h
            if (r1 == 0) goto L60
        L5d:
            java.util.Set r0 = (java.util.Set) r0
            goto L61
        L60:
            r0 = r3
        L61:
            if (r0 == 0) goto L6d
            androidx.compose.runtime.tooling.a r1 = r7.J()
            r0.add(r1)
            r7.q()
        L6d:
            boolean r1 = r7.u(r8)
            java.lang.Object r4 = r7.t()
            androidx.compose.runtime.A$a r5 = androidx.compose.runtime.A.f37866a
            if (r1 != 0) goto L80
            r5.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r4 != r1) goto L88
        L80:
            androidx.compose.ui.platform.U2 r4 = new androidx.compose.ui.platform.U2
            r4.<init>(r8, r3)
            r7.H(r4)
        L88:
            Y41.p r4 = (Y41.p) r4
            androidx.compose.runtime.C22187u0.d(r4, r7, r2)
            boolean r1 = r7.u(r8)
            java.lang.Object r4 = r7.t()
            if (r1 != 0) goto L9e
            r5.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r4 != r1) goto La6
        L9e:
            androidx.compose.ui.platform.V2 r4 = new androidx.compose.ui.platform.V2
            r4.<init>(r8, r3)
            r7.H(r4)
        La6:
            Y41.p r4 = (Y41.p) r4
            androidx.compose.runtime.C22187u0.d(r4, r7, r2)
            androidx.compose.runtime.J3 r1 = androidx.compose.runtime.tooling.i.f38773a
            androidx.compose.runtime.Y1 r0 = r1.b(r0)
            androidx.compose.ui.platform.W2 r1 = new androidx.compose.ui.platform.W2
            androidx.compose.runtime.internal.n r2 = r6.f41330m
            r1.<init>(r8, r2)
            r8 = -1193460702(0xffffffffb8dd3c22, float:-1.0549302E-4)
            androidx.compose.runtime.internal.n r8 = androidx.compose.runtime.internal.r.c(r8, r1, r7)
            r1 = 56
            androidx.compose.runtime.S.a(r0, r8, r7, r1)
            goto Lc8
        Lc5:
            r7.f()
        Lc8:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.X2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
