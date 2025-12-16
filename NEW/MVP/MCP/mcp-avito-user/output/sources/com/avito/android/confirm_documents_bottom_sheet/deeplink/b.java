package com.avito.android.confirm_documents_bottom_sheet.deeplink;

import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.confirm_documents_bottom_sheet.ConfirmDocumentsBottomSheetDeeplink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
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

/* compiled from: ConfirmDocumentsBottomSheetDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/deeplink/b;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/confirm_documents_bottom_sheet/ConfirmDocumentsBottomSheetDeeplink;", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends com.avito.android.deeplink_handler.handler.base.coroutines.a<ConfirmDocumentsBottomSheetDeeplink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.d f125510g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C25719a f125511h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.f f125512i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final R0 f125513j;

    /* compiled from: ConfirmDocumentsBottomSheetDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/b;", "it", "Lkotlin/G0;", "<anonymous>", "(Lrv/b;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.confirm_documents_bottom_sheet.deeplink.ConfirmDocumentationBottomSheetDeeplinkHandler$onCreateSuspend$2", f = "ConfirmDocumentsBottomSheetDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<C47919b, Continuation<? super G0>, Object> {
        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            return ((a) create(c47919b, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            b.this.j(ConfirmDocumentsBottomSheetDeeplink.b.a.f125507b);
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k C25719a c25719a, @k a.d dVar, @k a.f fVar, @k R0 r02) {
        super(r02);
        this.f125510g = dVar;
        this.f125511h = c25719a;
        this.f125512i = fVar;
        this.f125513j = r02;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        ConfirmDocumentsBottomSheetDeeplink confirmDocumentsBottomSheetDeeplink = (ConfirmDocumentsBottomSheetDeeplink) deepLink;
        this.f125511h.a(confirmDocumentsBottomSheetDeeplink, this, AuthSource.f92736z, new com.avito.android.confirm_documents_bottom_sheet.deeplink.a(this, confirmDocumentsBottomSheetDeeplink));
        return G0.f406611a;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    @l
    public final Object n(@k Continuation<? super G0> continuation) {
        C43175k.K(new C43197r1(new a(null), C40483b.b(this.f125512i, this.f395444b)), this.f134492f);
        return G0.f406611a;
    }
}
