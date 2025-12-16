package com.avito.android.publish.screen.step.params;

import Cd0.C;
import Cd0.C13292z;
import Ie0.InterfaceC14065a;
import Ju.InterfaceC14249c;
import android.content.Context;
import com.avito.android.R;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import com.avito.android.publish.screen.step.params.PublishDetailsFragment;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kv.C43501a;

/* compiled from: PublishDetailsDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "event", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.step.params.PublishDetailsDeeplinkHandlerImpl$observeJobMultiGeoDeeplinkResult$3", f = "PublishDetailsDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.publish.screen.step.params.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34049d extends SuspendLambda implements Y41.p<C43501a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f240484q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f240485r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34049d(p pVar, Continuation<? super C34049d> continuation) {
        super(2, continuation);
        this.f240485r = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34049d c34049d = new C34049d(this.f240485r, continuation);
        c34049d.f240484q = obj;
        return c34049d;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
        return ((C34049d) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String str;
        String f206980c;
        int i12;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C43501a c43501a = (C43501a) this.f240484q;
        InterfaceC14249c interfaceC14249c = c43501a.f413261b;
        boolean z12 = interfaceC14249c instanceof JobMultiGeoLink.a.d;
        p pVar = this.f240485r;
        if (z12) {
            ((PublishDetailsFragment.k) pVar.f241523h).invoke(new InterfaceC14065a.d.u(pVar.f241516a.requireContext().getString(R.string.address_error)));
            return G0.f406611a;
        }
        JobMultiGeoLink.a.h hVar = interfaceC14249c instanceof JobMultiGeoLink.a.h ? (JobMultiGeoLink.a.h) interfaceC14249c : null;
        if (hVar == null) {
            return G0.f406611a;
        }
        boolean z13 = hVar instanceof JobMultiGeoLink.a.C6170a;
        if (z13) {
            JobMultiGeoLink.a.C6170a c6170a = (JobMultiGeoLink.a.C6170a) hVar;
            pVar.f241519d.g(new C.a(String.valueOf(c6170a.f206974e), String.valueOf(c6170a.f206973d)));
        } else {
            if (hVar instanceof JobMultiGeoLink.a.c ? true : hVar instanceof JobMultiGeoLink.a.b) {
                JobMultiGeoLink.a.g gVar = hVar instanceof JobMultiGeoLink.a.g ? (JobMultiGeoLink.a.g) hVar : null;
                if (gVar != null) {
                    if (!(gVar instanceof JobMultiGeoLink.a.c)) {
                        str = gVar instanceof JobMultiGeoLink.a.b ? "delete" : "edit";
                    }
                    pVar.f241519d.u(new C13292z.a(String.valueOf(gVar.getF206982e()), String.valueOf(gVar.getF206981d()), str));
                }
            }
        }
        pVar.f241521f.J(hVar.getF206984b());
        InterfaceC14249c interfaceC14249c2 = c43501a.f413261b;
        JobMultiGeoLink.a.f fVar = interfaceC14249c2 instanceof JobMultiGeoLink.a.f ? (JobMultiGeoLink.a.f) interfaceC14249c2 : null;
        if (fVar == null || (f206980c = fVar.getF206980c()) == null) {
            return G0.f406611a;
        }
        Context contextRequireContext = pVar.f241516a.requireContext();
        if (z13) {
            i12 = R.string.address_added;
        } else if (hVar instanceof JobMultiGeoLink.a.c) {
            i12 = R.string.address_edited;
        } else {
            if (!(hVar instanceof JobMultiGeoLink.a.b)) {
                return G0.f406611a;
            }
            i12 = R.string.address_deleted;
        }
        ((PublishDetailsFragment.k) pVar.f241523h).invoke(new InterfaceC14065a.d.s(f206980c, contextRequireContext.getString(i12)));
        return G0.f406611a;
    }
}
