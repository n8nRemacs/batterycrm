package androidx.view;

import Y41.p;
import Y61.l;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.K;
import kotlinx.coroutines.scheduling.c;
import kotlinx.coroutines.t1;

/* compiled from: CoroutineLiveData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/n;", "T", "Landroidx/lifecycle/e0;", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23051n<T> extends C23034e0<T> {

    /* renamed from: b, reason: collision with root package name */
    @l
    public C23035f<T> f46833b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public C23063t f46834c;

    public C23051n() {
        throw null;
    }

    public C23051n(CoroutineContext coroutineContext, long j12, p pVar, int i12, C42822w c42822w) {
        coroutineContext = (i12 & 1) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext;
        long j13 = (i12 & 2) != 0 ? 5000L : j12;
        C cA2 = t1.a((N0) coroutineContext.get(N0.f410716u2));
        c cVar = C43262l0.f411945a;
        this.f46833b = new C23035f<>(this, pVar, j13, U.a(K.f411877a.y().plus(coroutineContext).plus(cA2)), new C23045k(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.view.C23047l
            if (r0 == 0) goto L13
            r0 = r6
            androidx.lifecycle.l r0 = (androidx.view.C23047l) r0
            int r1 = r0.f46817t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46817t = r1
            goto L18
        L13:
            androidx.lifecycle.l r0 = new androidx.lifecycle.l
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f46815r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f46817t
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            androidx.lifecycle.n r0 = r0.f46814q
            kotlin.C42729a0.b(r6)
            goto L5d
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.C42729a0.b(r6)
            androidx.lifecycle.t r6 = r5.f46834c
            if (r6 == 0) goto L5c
            r0.f46814q = r5
            r0.f46817t = r4
            kotlinx.coroutines.scheduling.c r2 = kotlinx.coroutines.C43262l0.f411945a
            kotlinx.coroutines.d1 r2 = kotlinx.coroutines.internal.K.f411877a
            kotlinx.coroutines.d1 r2 = r2.y()
            androidx.lifecycle.u r4 = new androidx.lifecycle.u
            r4.<init>(r6, r3)
            java.lang.Object r6 = kotlinx.coroutines.C43259k.g(r2, r4, r0)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r6 != r0) goto L57
            goto L59
        L57:
            kotlin.G0 r6 = kotlin.G0.f406611a
        L59:
            if (r6 != r1) goto L5c
            return r1
        L5c:
            r0 = r5
        L5d:
            r0.f46834c = r3
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.view.C23051n.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.view.C23034e0, androidx.view.AbstractC22991Y
    public final void onActive() {
        super.onActive();
        C23035f<T> c23035f = this.f46833b;
        if (c23035f != null) {
            N0 n02 = c23035f.f46792g;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
            c23035f.f46792g = null;
            if (c23035f.f46791f != null) {
                return;
            }
            c23035f.f46791f = C43259k.d(c23035f.f46789d, null, null, new C23033e(c23035f, null), 3);
        }
    }

    @Override // androidx.view.C23034e0, androidx.view.AbstractC22991Y
    public final void onInactive() {
        super.onInactive();
        C23035f<T> c23035f = this.f46833b;
        if (c23035f != null) {
            if (c23035f.f46792g != null) {
                throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
            }
            c cVar = C43262l0.f411945a;
            c23035f.f46792g = C43259k.d(c23035f.f46789d, K.f411877a.y(), null, new C23031d(c23035f, null), 2);
        }
    }
}
