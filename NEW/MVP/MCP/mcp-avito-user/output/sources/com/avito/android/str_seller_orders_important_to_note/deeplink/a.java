package com.avito.android.str_seller_orders_important_to_note.deeplink;

import Ju.AbstractC14250d;
import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.str_seller_orders_important_to_note.ImportantToNoteOpenParams;
import com.avito.android.str_seller_orders_important_to_note.StrSellerImportantToNoteDeeplink;
import com.avito.android.str_seller_orders_important_to_note.StrSellerImportantToNoteFragment;
import com.avito.android.util.R0;
import fv.C40483b;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import rv.C47919b;

/* compiled from: StrSellerImportantToNoteDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/deeplink/a;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/str_seller_orders_important_to_note/StrSellerImportantToNoteDeeplink;", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends com.avito.android.deeplink_handler.handler.base.coroutines.a<StrSellerImportantToNoteDeeplink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.d f291255g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.f f291256h;

    /* compiled from: StrSellerImportantToNoteDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/b;", "it", "Lkotlin/G0;", "<anonymous>", "(Lrv/b;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders_important_to_note.deeplink.StrSellerImportantToNoteDeeplinkHandler$onCreateSuspend$2", f = "StrSellerImportantToNoteDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.str_seller_orders_important_to_note.deeplink.a$a, reason: collision with other inner class name */
    public static final class C8814a extends SuspendLambda implements p<C47919b, Continuation<? super G0>, Object> {
        public C8814a(Continuation<? super C8814a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return a.this.new C8814a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            return ((C8814a) create(c47919b, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            a.this.j(AbstractC14250d.c.f9171c);
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k a.d dVar, @k a.f fVar, @k R0 r02) {
        super(r02);
        this.f291255g = dVar;
        this.f291256h = fVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        StrSellerImportantToNoteFragment.a aVar = StrSellerImportantToNoteFragment.f291216p0;
        ImportantToNoteOpenParams importantToNoteOpenParams = new ImportantToNoteOpenParams(((StrSellerImportantToNoteDeeplink) deepLink).f291215b);
        aVar.getClass();
        StrSellerImportantToNoteFragment strSellerImportantToNoteFragment = new StrSellerImportantToNoteFragment();
        strSellerImportantToNoteFragment.f291225o0.setValue(strSellerImportantToNoteFragment, StrSellerImportantToNoteFragment.f291217q0[0], importantToNoteOpenParams);
        this.f291255g.w1(strSellerImportantToNoteFragment, "StrSellerImportantToNoteFragment");
        return G0.f406611a;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    @l
    public final Object n(@k Continuation<? super G0> continuation) {
        C43175k.K(new C43197r1(new C8814a(null), C40483b.b(this.f291256h, "StrSellerImportantToNoteFragment")), this.f134492f);
        return G0.f406611a;
    }
}
