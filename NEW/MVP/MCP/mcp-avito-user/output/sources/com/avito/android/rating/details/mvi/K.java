package com.avito.android.rating.details.mvi;

import Ju.InterfaceC14249c;
import com.avito.android.R;
import com.avito.android.deep_linking.RevertRatingsDeletionLink;
import com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction;
import com.avito.android.rating.details.mvi.entity.a;
import com.avito.android.rating_form.deep_link.RatingFormLink;
import java.io.Serializable;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kv.C43501a;

/* compiled from: RatingDetailsBootstrap.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "<anonymous>", "(Lkv/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating.details.mvi.RatingDetailsBootstrap$deeplinkResultsFlow$2", f = "RatingDetailsBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class K extends SuspendLambda implements Y41.p<C43501a, Continuation<? super InterfaceC43160i<? extends RatingDetailsInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f247239q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I f247240r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(I i12, Continuation<? super K> continuation) {
        super(2, continuation);
        this.f247240r = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        K k12 = new K(this.f247240r, continuation);
        k12.f247239q = obj;
        return k12;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super InterfaceC43160i<? extends RatingDetailsInternalAction>> continuation) {
        return ((K) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        C43210w c43210w;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C43501a c43501a = (C43501a) this.f247239q;
        InterfaceC14249c interfaceC14249c = c43501a.f413261b;
        com.avito.android.deeplink_handler.handler.bundle.a aVar = c43501a.f413260a;
        String str = aVar.f134521b;
        boolean zF2 = kotlin.jvm.internal.L.f(str, "req_key_rating_details_revert_answer");
        I i12 = this.f247240r;
        if (zF2) {
            int i13 = I.f247222g;
            i12.getClass();
            InterfaceC14249c interfaceC14249c2 = c43501a.f413261b;
            if (interfaceC14249c2 instanceof RevertRatingsDeletionLink.b.C3982b) {
                return C43175k.I(i12.f247225c.a(), C43175k.G(new L(c43501a, i12, null)));
            }
            if (!(interfaceC14249c2 instanceof RevertRatingsDeletionLink.b.a)) {
                return C43175k.w();
            }
            RevertRatingsDeletionLink.b.a aVar2 = (RevertRatingsDeletionLink.b.a) interfaceC14249c2;
            String message = aVar2.f132873b.getMessage();
            if (message != null) {
                return new C43210w(new RatingDetailsInternalAction.ShowErrorToastBar(com.avito.android.printable_text.b.f(message), aVar2.f132873b, com.avito.android.printable_text.b.c(R.string.review_revert_retry_button, new Serializable[0]), new a.u(aVar.f134520a), null, 0, 48, null));
            }
            c43210w = new C43210w(new RatingDetailsInternalAction.ShowErrorToastBar(com.avito.android.printable_text.b.c(R.string.review_unknown_error, new Serializable[0]), aVar2.f132873b, null, null, null, 0, 60, null));
        } else {
            if (kotlin.jvm.internal.L.f(str, "req_key_rating_details_revert_review")) {
                return I.c(i12, c43501a);
            }
            if (interfaceC14249c instanceof RevertRatingsDeletionLink.b) {
                return I.c(i12, c43501a);
            }
            if (interfaceC14249c instanceof RatingFormLink.b.d.a) {
                return I.d(i12, ((RatingFormLink.b.d.a) interfaceC14249c).f248041b);
            }
            if (interfaceC14249c instanceof RatingFormLink.b.d.C7459b) {
                return I.d(i12, ((RatingFormLink.b.d.C7459b) interfaceC14249c).f248042b);
            }
            if (!(interfaceC14249c instanceof RatingFormLink.b.d.c)) {
                return C43175k.w();
            }
            int i14 = I.f247222g;
            i12.getClass();
            c43210w = new C43210w(new RatingDetailsInternalAction.RefreshScreen());
        }
        return c43210w;
    }
}
