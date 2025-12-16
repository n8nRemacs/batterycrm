package com.avito.android.comfortable_deal.deeplink;

import Ju.AbstractC14250d;
import com.avito.android.comfortable_deal.domain.d;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: ComfortableDealClientRoomDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.deeplink.ComfortableDealClientRoomDeeplinkHandler$doHandle$1", f = "ComfortableDealClientRoomDeeplinkHandler.kt", i = {}, l = {43, 55}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.comfortable_deal.deeplink.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29460a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f121891q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C29462c f121892r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ComfortableDealClientRoomDeeplink f121893s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29460a(C29462c c29462c, ComfortableDealClientRoomDeeplink comfortableDealClientRoomDeeplink, Continuation<? super C29460a> continuation) {
        super(2, continuation);
        this.f121892r = c29462c;
        this.f121893s = comfortableDealClientRoomDeeplink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C29460a(this.f121892r, this.f121893s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C29460a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object objA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f121891q;
        C29462c c29462c = this.f121892r;
        a.g gVar = c29462c.f121900g;
        if (i12 == 0) {
            C42729a0.b(obj);
            gVar.g(c29462c.d(), true);
            this.f121891q = 1;
            objA = c29462c.f121905l.a(this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            C42729a0.b(obj);
            objA = obj;
        }
        com.avito.android.comfortable_deal.domain.d dVar = (com.avito.android.comfortable_deal.domain.d) objA;
        if (dVar instanceof d.b) {
            d.b bVar = (d.b) dVar;
            PrintableText printableTextF = com.avito.android.printable_text.b.f(com.avito.android.error.z.k(bVar.f122011a));
            ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
            a.i.C4057a.d(c29462c.f121901h, printableTextF, null, null, new f.c(bVar.f122011a), 0, toastBarPosition, null, null, 1966);
            gVar.g(c29462c.d(), false);
            c29462c.j(AbstractC14250d.b.f9170c);
        } else {
            boolean z12 = dVar instanceof d.c;
            ComfortableDealClientRoomDeeplink comfortableDealClientRoomDeeplink = this.f121893s;
            if (z12) {
                this.f121891q = 2;
                if (C29462c.k(c29462c, comfortableDealClientRoomDeeplink, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (dVar instanceof d.a) {
                c29462c.f121899f.R(c29462c.f121903j.a(comfortableDealClientRoomDeeplink.f121844b), com.avito.android.deeplink_handler.view.b.f134588l);
                gVar.g(c29462c.d(), false);
                c29462c.j(AbstractC14250d.c.f9171c);
            }
        }
        return G0.f406611a;
    }
}
