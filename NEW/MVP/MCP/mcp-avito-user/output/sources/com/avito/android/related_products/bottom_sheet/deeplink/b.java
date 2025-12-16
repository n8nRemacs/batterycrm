package com.avito.android.related_products.bottom_sheet.deeplink;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import bj0.C25661a;
import com.avito.android.analytics.screens.tracker.ScreenTransfer;
import com.avito.android.related_products.RelatedProductsEntryPointState;
import com.avito.android.related_products.bottom_sheet.RelatedProductsBottomSheetDeepLink;
import com.avito.android.related_products.bottom_sheet.RelatedProductsBottomSheetDeeplinkArgs;
import com.avito.android.related_products.generated.api.favorites_complementary_on_app.FavoritesComplementaryOnAppResponse;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.BeduinV2;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.T;
import sv.C48421d;

/* compiled from: RelatedProductsBottomSheetDeepLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.related_products.bottom_sheet.deeplink.RelatedProductsBottomSheetDeepLinkHandler$doHandleSuspend$2", f = "RelatedProductsBottomSheetDeepLinkHandler.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f252868q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Bundle f252869r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f252870s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f252871t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ RelatedProductsBottomSheetDeepLink f252872u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Bundle bundle, a aVar, long j12, RelatedProductsBottomSheetDeepLink relatedProductsBottomSheetDeepLink, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f252869r = bundle;
        this.f252870s = aVar;
        this.f252871t = j12;
        this.f252872u = relatedProductsBottomSheetDeepLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f252869r, this.f252870s, this.f252871t, this.f252872u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        RelatedProductsBottomSheetDeeplinkArgs relatedProductsBottomSheetDeeplinkArgs;
        Object objA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f252868q;
        RelatedProductsBottomSheetDeepLink relatedProductsBottomSheetDeepLink = this.f252872u;
        long j12 = this.f252871t;
        a aVar = this.f252870s;
        if (i12 == 0) {
            C42729a0.b(obj);
            Bundle bundle = this.f252869r;
            if (bundle != null) {
                relatedProductsBottomSheetDeeplinkArgs = (RelatedProductsBottomSheetDeeplinkArgs) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("related_products_bottom_sheet_deeplink_args", RelatedProductsBottomSheetDeeplinkArgs.class) : bundle.getParcelable("related_products_bottom_sheet_deeplink_args"));
            } else {
                relatedProductsBottomSheetDeeplinkArgs = null;
            }
            if (relatedProductsBottomSheetDeeplinkArgs == null) {
                aVar.f252852i.c("RelatedProductsBottomSheetDeepLinkHandler", "No args for RelatedProductsBottomSheetDeepLink were provided", null);
                aVar.j(RelatedProductsBottomSheetDeepLink.b.a.f252823b);
                return G0.f406611a;
            }
            RelatedProductsEntryPointState relatedProductsEntryPointState = RelatedProductsEntryPointState.f252815c;
            int i13 = a.f252849q;
            aVar.getClass();
            aVar.f252853j.b(new C25661a(j12, relatedProductsEntryPointState));
            aVar.f252859p.c();
            String strO = C42745f0.O(relatedProductsBottomSheetDeeplinkArgs.f252826b, ",", null, null, null, 62);
            String str = relatedProductsBottomSheetDeepLink.f252822d;
            this.f252868q = 1;
            objA = aVar.f252850g.a(this.f252871t, strO, str, this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            objA = obj;
        }
        TypedResult typedResult = (TypedResult) objA;
        aVar.f252859p.f();
        if (typedResult instanceof TypedResult.Success) {
            BeduinV2 result = ((FavoritesComplementaryOnAppResponse) ((TypedResult.Success) typedResult).getResult()).getResult();
            String json = result != null ? result.getJson() : null;
            if (json == null || C43066x.K(json)) {
                aVar.f252852i.c("RelatedProductsBottomSheetDeepLinkHandler", "Received null or empty json", null);
                aVar.o(j12, relatedProductsBottomSheetDeepLink.f252821c, true);
            } else {
                ScreenTransfer screenTransferD = aVar.f252859p.d();
                aVar.f252857n.get().a(json);
                Intent intentA = aVar.f252856m.a();
                intentA.putExtra("SCREEN_TRANSFER_KEY", screenTransferD);
                aVar.f252854k.J(intentA, C48421d.a(aVar), new c(aVar));
                aVar.f252853j.b(new C25661a(j12, RelatedProductsEntryPointState.f252814b));
            }
        } else if (typedResult instanceof TypedResult.Error) {
            aVar.o(j12, relatedProductsBottomSheetDeepLink.f252821c, !(((TypedResult.Error) typedResult).getError() instanceof ApiError.NetworkIOError));
        }
        return G0.f406611a;
    }
}
