package com.avito.android.category;

import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.MainSearchResult;
import com.avito.android.remote.model.TypedResult;
import com.facebook.imageutils.JfifUtil;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.category.CategoryFlowInteractorImpl$loadMainSearch$$inlined$flatMapLatest$1", f = "CategoryFlowInteractor.kt", i = {1}, l = {JfifUtil.MARKER_RST7, JfifUtil.MARKER_EOI, 189}, m = "invokeSuspend", n = {"loc"}, s = {"L$1"})
/* loaded from: classes12.dex */
public final class e extends SuspendLambda implements Y41.q<InterfaceC43172j<? super Q<? extends TypedResult<MainSearchResult>, ? extends Location>>, z<Location>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f116590q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f116591r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f116592s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f116593t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f116594u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Continuation continuation, g gVar, String str) {
        super(3, continuation);
        this.f116593t = gVar;
        this.f116594u = str;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super Q<? extends TypedResult<MainSearchResult>, ? extends Location>> interfaceC43172j, z<Location> zVar, Continuation<? super G0> continuation) {
        e eVar = new e(continuation, this.f116593t, this.f116594u);
        eVar.f116591r = interfaceC43172j;
        eVar.f116592s = zVar;
        return eVar.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0083 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f116590q
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2e
            if (r1 == r4) goto L28
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.C42729a0.b(r8)
            goto L84
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            java.lang.Object r1 = r7.f116592s
            com.avito.android.remote.model.Location r1 = (com.avito.android.remote.model.Location) r1
            kotlinx.coroutines.flow.j r3 = r7.f116591r
            kotlin.C42729a0.b(r8)
            goto L6c
        L28:
            kotlinx.coroutines.flow.j r1 = r7.f116591r
            kotlin.C42729a0.b(r8)
            goto L49
        L2e:
            kotlin.C42729a0.b(r8)
            kotlinx.coroutines.flow.j r8 = r7.f116591r
            java.lang.Object r1 = r7.f116592s
            io.reactivex.rxjava3.core.z r1 = (io.reactivex.rxjava3.core.z) r1
            kotlinx.coroutines.flow.i r1 = kotlinx.coroutines.rx3.y.a(r1)
            r7.f116591r = r8
            r7.f116590q = r4
            java.lang.Object r1 = kotlinx.coroutines.flow.C43175k.y(r1, r7)
            if (r1 != r0) goto L46
            return r0
        L46:
            r6 = r1
            r1 = r8
            r8 = r6
        L49:
            com.avito.android.remote.model.Location r8 = (com.avito.android.remote.model.Location) r8
            com.avito.android.category.g r4 = r7.f116593t
            h31.e<com.avito.android.remote.V0> r4 = r4.f116636b
            java.lang.Object r4 = r4.get()
            com.avito.android.remote.V0 r4 = (com.avito.android.remote.V0) r4
            java.lang.String r5 = r8.getId()
            r7.f116591r = r1
            r7.f116592s = r8
            r7.f116590q = r3
            java.lang.String r3 = r7.f116594u
            java.lang.Object r3 = r4.a(r3, r5, r7)
            if (r3 != r0) goto L68
            return r0
        L68:
            r6 = r1
            r1 = r8
            r8 = r3
            r3 = r6
        L6c:
            kotlin.Q r4 = new kotlin.Q
            r4.<init>(r8, r1)
            kotlinx.coroutines.flow.w r8 = new kotlinx.coroutines.flow.w
            r8.<init>(r4)
            r1 = 0
            r7.f116591r = r1
            r7.f116592s = r1
            r7.f116590q = r2
            java.lang.Object r8 = kotlinx.coroutines.flow.C43175k.u(r7, r8, r3)
            if (r8 != r0) goto L84
            return r0
        L84:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.category.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
