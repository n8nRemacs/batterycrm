package com.avito.android.photo_gallery.grid_gallery.mvi;

import com.avito.android.photo_gallery.grid_gallery.GridGalleryOpenParams;
import com.avito.android.photo_gallery.grid_gallery.mvi.entity.GridGalleryInternalAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GridGalleryBootstrap.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/photo_gallery/grid_gallery/mvi/entity/GridGalleryInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.photo_gallery.grid_gallery.mvi.GridGalleryBootstrap$initScreenFlow$1", f = "GridGalleryBootstrap.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class t extends SuspendLambda implements Y41.p<InterfaceC43172j<? super GridGalleryInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f217394q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f217395r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v f217396s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, Continuation<? super t> continuation) {
        super(2, continuation);
        this.f217396s = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        t tVar = new t(this.f217396s, continuation);
        tVar.f217395r = obj;
        return tVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super GridGalleryInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((t) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Integer numA;
        Integer numA2;
        Integer numA3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f217394q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f217395r;
            v vVar = this.f217396s;
            GridGalleryOpenParams gridGalleryOpenParams = vVar.f217404a;
            vVar.f217407d.getClass();
            InterfaceC42726C interfaceC42726CC = C42727D.c(new k(gridGalleryOpenParams));
            InterfaceC42726C interfaceC42726CC2 = C42727D.c(new j(gridGalleryOpenParams));
            ArrayList arrayListB = com.avito.android.photo_gallery.adapter.p.b(gridGalleryOpenParams.f217130h, gridGalleryOpenParams.f217131i, gridGalleryOpenParams.f217125c, null, null, false, null, gridGalleryOpenParams.f217128f, null, null, 256);
            Integer numA4 = l.a(C33189a.f217317l, arrayListB);
            Integer numA5 = l.a(C33190b.f217318l, arrayListB);
            Integer numA6 = l.a(C33191c.f217319l, arrayListB);
            boolean z12 = gridGalleryOpenParams.f217143u;
            if (z12) {
                numA = l.a(C33192d.f217320l, (List) interfaceC42726CC2.getValue());
            } else {
                numA = l.a(C33193e.f217321l, (List) interfaceC42726CC.getValue());
            }
            Integer num = numA;
            if (z12) {
                numA2 = l.a(C33194f.f217335l, (List) interfaceC42726CC2.getValue());
            } else {
                numA2 = l.a(g.f217336l, (List) interfaceC42726CC.getValue());
            }
            Integer num2 = numA2;
            if (z12) {
                numA3 = l.a(h.f217337l, (List) interfaceC42726CC2.getValue());
            } else {
                numA3 = l.a(i.f217338l, (List) interfaceC42726CC.getValue());
            }
            GridGalleryInternalAction.ContentLoaded contentLoaded = new GridGalleryInternalAction.ContentLoaded(gridGalleryOpenParams, new T70.b(numA4, numA5, numA6, num, num2, numA3));
            this.f217394q = 1;
            if (interfaceC43172j.emit(contentLoaded, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
