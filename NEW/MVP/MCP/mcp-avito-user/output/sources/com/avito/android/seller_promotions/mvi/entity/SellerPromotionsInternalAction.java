package com.avito.android.seller_promotions.mvi.entity;

import AK.c;
import Nq0.C14603a;
import Sq0.C15214a;
import Sq0.b;
import Sq0.f;
import Sq0.g;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.deep_linking.links.CartLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.seller_promotions.model.BeduinFormType;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: SellerPromotionsInternalAction.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0019\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u0082\u0001\u0019\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123¨\u00064"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BeduinFormLoaded", "ChangeItemQuantity", "CloseScreen", "HandleApiError", "HandleBeduinActions", "InternalError", "OpenAdvertDetails", "OpenDeepLink", "PageLoaded", "PageLoading", "PageLoadingError", "PromotionsLoaded", "PromotionsLoading", "RevertItemsStocks", "SetItemsFavorite", "SetXHash", "UpdateCartIconQuantity", "UpdateCartIconState", "UpdateDiscountPercents", "UpdateItemsStocks", "UpdatePromotionCondition", "UpdatePromotionConditionError", "UpdatePromotionConditionLoading", "UpdatePromotionItemsLoading", "UpdatePromotionsItemsError", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$BeduinFormLoaded;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$ChangeItemQuantity;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$CloseScreen;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$HandleApiError;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$HandleBeduinActions;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$InternalError;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$OpenAdvertDetails;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$OpenDeepLink;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$PageLoaded;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$PageLoading;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$PageLoadingError;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$PromotionsLoaded;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$PromotionsLoading;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$RevertItemsStocks;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$SetItemsFavorite;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$SetXHash;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$UpdateCartIconQuantity;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$UpdateCartIconState;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$UpdateDiscountPercents;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$UpdateItemsStocks;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$UpdatePromotionCondition;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$UpdatePromotionConditionError;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$UpdatePromotionConditionLoading;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$UpdatePromotionItemsLoading;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$UpdatePromotionsItemsError;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SellerPromotionsInternalAction extends n {

    /* compiled from: SellerPromotionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$BeduinFormLoaded;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BeduinFormLoaded implements SellerPromotionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BeduinFormType f267955b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f267956c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<BeduinModel> f267957d;

        /* JADX WARN: Multi-variable type inference failed */
        public BeduinFormLoaded(@k BeduinFormType beduinFormType, @k String str, @k List<? extends BeduinModel> list) {
            this.f267955b = beduinFormType;
            this.f267956c = str;
            this.f267957d = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BeduinFormLoaded)) {
                return false;
            }
            BeduinFormLoaded beduinFormLoaded = (BeduinFormLoaded) obj;
            return this.f267955b == beduinFormLoaded.f267955b && L.f(this.f267956c, beduinFormLoaded.f267956c) && L.f(this.f267957d, beduinFormLoaded.f267957d);
        }

        public final int hashCode() {
            return this.f267957d.hashCode() + H.d(this.f267955b.hashCode() * 31, 31, this.f267956c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BeduinFormLoaded(formType=");
            sb2.append(this.f267955b);
            sb2.append(", formId=");
            sb2.append(this.f267956c);
            sb2.append(", models=");
            return H.p(sb2, this.f267957d, ')');
        }
    }

    /* compiled from: SellerPromotionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$ChangeItemQuantity;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeItemQuantity implements SellerPromotionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f267958b;

        /* renamed from: c, reason: collision with root package name */
        public final int f267959c;

        public ChangeItemQuantity(@k String str, int i12) {
            this.f267958b = str;
            this.f267959c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeItemQuantity)) {
                return false;
            }
            ChangeItemQuantity changeItemQuantity = (ChangeItemQuantity) obj;
            return L.f(this.f267958b, changeItemQuantity.f267958b) && this.f267959c == changeItemQuantity.f267959c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f267959c) + (this.f267958b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeItemQuantity(itemId=");
            sb2.append(this.f267958b);
            sb2.append(", newQuantity=");
            return r.t(sb2, this.f267959c, ')');
        }
    }

    /* compiled from: SellerPromotionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$CloseScreen;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "()V", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseScreen implements SellerPromotionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f267960b = new CloseScreen();

        private CloseScreen() {
        }
    }

    /* compiled from: SellerPromotionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$HandleApiError;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleApiError implements SellerPromotionsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f267961b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f267962c;

        public HandleApiError(@k ApiError apiError) {
            this.f267961b = apiError;
            this.f267962c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF131216d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof HandleApiError) {
                return L.f(this.f267961b, ((HandleApiError) obj).f267961b) && L.f(null, null);
            }
            return false;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF97456c() {
            return this.f267962c;
        }

        public final int hashCode() {
            return this.f267961b.hashCode() * 31;
        }

        @k
        public final String toString() {
            return "HandleApiError(error=" + this.f267961b + ", contentType=null)";
        }
    }

    /* compiled from: SellerPromotionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$HandleBeduinActions;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleBeduinActions implements SellerPromotionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<BeduinAction> f267963b;

        /* JADX WARN: Multi-variable type inference failed */
        public HandleBeduinActions(@k List<? extends BeduinAction> list) {
            this.f267963b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleBeduinActions) && L.f(this.f267963b, ((HandleBeduinActions) obj).f267963b);
        }

        public final int hashCode() {
            return this.f267963b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("HandleBeduinActions(actions="), this.f267963b, ')');
        }
    }

    /* compiled from: SellerPromotionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$OpenDeepLink;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeepLink implements SellerPromotionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CartLink f267971b;

        public OpenDeepLink(@k CartLink cartLink) {
            this.f267971b = cartLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeepLink) && this.f267971b.equals(((OpenDeepLink) obj).f267971b);
        }

        public final int hashCode() {
            return this.f267971b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenDeepLink(deepLink=" + this.f267971b + ')';
        }
    }

    /* compiled from: SellerPromotionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$PageLoaded;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PageLoaded implements SellerPromotionsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final g f267972b;

        public PageLoaded(@k g gVar) {
            this.f267972b = gVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF131216d() {
            return "load-next-items";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return "load-next-items";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PageLoaded) && L.f(this.f267972b, ((PageLoaded) obj).f267972b);
        }

        public final int hashCode() {
            return this.f267972b.hashCode();
        }

        @k
        public final String toString() {
            return "PageLoaded(pageData=" + this.f267972b + ')';
        }
    }

    /* compiled from: SellerPromotionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$PageLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "<init>", "()V", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PageLoading extends TrackableLoadingStarted implements SellerPromotionsInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f267973d = "load-next-items";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF131216d() {
            return this.f267973d;
        }
    }

    /* compiled from: SellerPromotionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$PageLoadingError;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PageLoadingError implements SellerPromotionsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f267974b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f267975c;

        public PageLoadingError(@k ApiError apiError) {
            this.f267974b = apiError;
            this.f267975c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF131216d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PageLoadingError) && L.f(this.f267974b, ((PageLoadingError) obj).f267974b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF97456c() {
            return this.f267975c;
        }

        public final int hashCode() {
            return this.f267974b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("PageLoadingError(error="), this.f267974b, ')');
        }
    }

    /* compiled from: SellerPromotionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$PromotionsLoaded;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PromotionsLoaded implements SellerPromotionsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final f f267976b;

        public PromotionsLoaded(@k f fVar) {
            this.f267976b = fVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF131216d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PromotionsLoaded) && L.f(this.f267976b, ((PromotionsLoaded) obj).f267976b);
        }

        public final int hashCode() {
            return this.f267976b.hashCode();
        }

        @k
        public final String toString() {
            return "PromotionsLoaded(promotions=" + this.f267976b + ')';
        }
    }

    /* compiled from: SellerPromotionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$PromotionsLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PromotionsLoading extends TrackableLoadingStarted implements SellerPromotionsInternalAction {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f267977d;

        public PromotionsLoading(boolean z12) {
            this.f267977d = z12;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PromotionsLoading) && this.f267977d == ((PromotionsLoading) obj).f267977d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return Boolean.hashCode(this.f267977d);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("PromotionsLoading(fullScreen="), this.f267977d, ')');
        }
    }

    /* compiled from: SellerPromotionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$RevertItemsStocks;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RevertItemsStocks implements SellerPromotionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LinkedHashMap f267978b;

        public RevertItemsStocks(@k LinkedHashMap linkedHashMap) {
            this.f267978b = linkedHashMap;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RevertItemsStocks) && this.f267978b.equals(((RevertItemsStocks) obj).f267978b);
        }

        public final int hashCode() {
            return this.f267978b.hashCode();
        }

        @k
        public final String toString() {
            return h.e(new StringBuilder("RevertItemsStocks(initialStocks="), this.f267978b, ')');
        }
    }

    /* compiled from: SellerPromotionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$SetItemsFavorite;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetItemsFavorite implements SellerPromotionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<String> f267979b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f267980c;

        public SetItemsFavorite(@k List<String> list, boolean z12) {
            this.f267979b = list;
            this.f267980c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetItemsFavorite)) {
                return false;
            }
            SetItemsFavorite setItemsFavorite = (SetItemsFavorite) obj;
            return L.f(this.f267979b, setItemsFavorite.f267979b) && this.f267980c == setItemsFavorite.f267980c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f267980c) + (this.f267979b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SetItemsFavorite(itemIds=");
            sb2.append(this.f267979b);
            sb2.append(", isFavorite=");
            return r.x(sb2, this.f267980c, ')');
        }
    }

    /* compiled from: SellerPromotionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$SetXHash;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetXHash implements SellerPromotionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f267981b;

        public SetXHash(@l String str) {
            this.f267981b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetXHash) && L.f(this.f267981b, ((SetXHash) obj).f267981b);
        }

        public final int hashCode() {
            String str = this.f267981b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SetXHash(xHash="), this.f267981b, ')');
        }
    }

    /* compiled from: SellerPromotionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$UpdateCartIconQuantity;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateCartIconQuantity implements SellerPromotionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f267982b;

        public UpdateCartIconQuantity(int i12) {
            this.f267982b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateCartIconQuantity) && this.f267982b == ((UpdateCartIconQuantity) obj).f267982b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f267982b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("UpdateCartIconQuantity(newQuantity="), this.f267982b, ')');
        }
    }

    /* compiled from: SellerPromotionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$UpdateCartIconState;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateCartIconState implements SellerPromotionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC31171n f267983b;

        public UpdateCartIconState(@k InterfaceC31171n interfaceC31171n) {
            this.f267983b = interfaceC31171n;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateCartIconState) && L.f(this.f267983b, ((UpdateCartIconState) obj).f267983b);
        }

        public final int hashCode() {
            return this.f267983b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateCartIconState(state=" + this.f267983b + ')';
        }
    }

    /* compiled from: SellerPromotionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$UpdateDiscountPercents;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "LSq0/a;", "discountPercents", "<init>", "(ILkotlin/jvm/internal/w;)V", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateDiscountPercents implements SellerPromotionsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        public final int f267984b;

        public UpdateDiscountPercents(int i12, C42822w c42822w) {
            this.f267984b = i12;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF131216d() {
            return "update-items";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return "update-items";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UpdateDiscountPercents) {
                return this.f267984b == ((UpdateDiscountPercents) obj).f267984b;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f267984b);
        }

        @k
        public final String toString() {
            return "UpdateDiscountPercents(discountPercents=" + ((Object) C15214a.b(this.f267984b)) + ')';
        }
    }

    /* compiled from: SellerPromotionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$UpdateItemsStocks;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateItemsStocks implements SellerPromotionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LinkedHashMap f267985b;

        public UpdateItemsStocks(@k LinkedHashMap linkedHashMap) {
            this.f267985b = linkedHashMap;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateItemsStocks) && this.f267985b.equals(((UpdateItemsStocks) obj).f267985b);
        }

        public final int hashCode() {
            return this.f267985b.hashCode();
        }

        @k
        public final String toString() {
            return h.e(new StringBuilder("UpdateItemsStocks(stocks="), this.f267985b, ')');
        }
    }

    /* compiled from: SellerPromotionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$UpdatePromotionCondition;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "LSq0/b;", "promotionCondition", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lkotlin/jvm/internal/w;)V", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdatePromotionCondition implements SellerPromotionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AttributedText f267986b;

        public UpdatePromotionCondition(AttributedText attributedText, C42822w c42822w) {
            this.f267986b = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UpdatePromotionCondition) {
                return L.f(this.f267986b, ((UpdatePromotionCondition) obj).f267986b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f267986b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdatePromotionCondition(promotionCondition=" + ((Object) b.a(this.f267986b)) + ')';
        }
    }

    /* compiled from: SellerPromotionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$UpdatePromotionConditionError;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdatePromotionConditionError implements SellerPromotionsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f267987b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f267988c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f267989d = "update-promotion";

        public UpdatePromotionConditionError(@k ApiError apiError) {
            this.f267987b = apiError;
            this.f267988c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF131216d() {
            return this.f267989d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return this.f267989d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdatePromotionConditionError) && L.f(this.f267987b, ((UpdatePromotionConditionError) obj).f267987b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF97456c() {
            return this.f267988c;
        }

        public final int hashCode() {
            return this.f267987b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("UpdatePromotionConditionError(error="), this.f267987b, ')');
        }
    }

    /* compiled from: SellerPromotionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$UpdatePromotionConditionLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdatePromotionConditionLoading extends TrackableLoadingStarted implements SellerPromotionsInternalAction {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f267990d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f267991e = "update-promotion";

        public UpdatePromotionConditionLoading(boolean z12) {
            this.f267990d = z12;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF131216d() {
            return this.f267991e;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdatePromotionConditionLoading) && this.f267990d == ((UpdatePromotionConditionLoading) obj).f267990d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return Boolean.hashCode(this.f267990d);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("UpdatePromotionConditionLoading(isLoading="), this.f267990d, ')');
        }
    }

    /* compiled from: SellerPromotionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$UpdatePromotionItemsLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdatePromotionItemsLoading extends TrackableLoadingStarted implements SellerPromotionsInternalAction {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f267992d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f267993e = "update-items";

        public UpdatePromotionItemsLoading(boolean z12) {
            this.f267992d = z12;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF131216d() {
            return this.f267993e;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdatePromotionItemsLoading) && this.f267992d == ((UpdatePromotionItemsLoading) obj).f267992d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return Boolean.hashCode(this.f267992d);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("UpdatePromotionItemsLoading(isLoading="), this.f267992d, ')');
        }
    }

    /* compiled from: SellerPromotionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$UpdatePromotionsItemsError;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdatePromotionsItemsError implements SellerPromotionsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f267994b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f267995c;

        public UpdatePromotionsItemsError(@k ApiError apiError) {
            this.f267994b = apiError;
            this.f267995c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF131216d() {
            return "update-items";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return "update-items";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdatePromotionsItemsError) && L.f(this.f267994b, ((UpdatePromotionsItemsError) obj).f267994b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF97456c() {
            return this.f267995c;
        }

        public final int hashCode() {
            return this.f267994b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("UpdatePromotionsItemsError(error="), this.f267994b, ')');
        }
    }

    /* compiled from: SellerPromotionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$InternalError;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InternalError implements SellerPromotionsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f267964b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f267965c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f267966d;

        public InternalError(@k Throwable th2, @l String str) {
            this.f267964b = th2;
            this.f267965c = str;
            this.f267966d = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d, reason: from getter */
        public final String getF131216d() {
            return this.f267965c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return this.f267965c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InternalError)) {
                return false;
            }
            InternalError internalError = (InternalError) obj;
            return L.f(this.f267964b, internalError.f267964b) && L.f(this.f267965c, internalError.f267965c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF97456c() {
            return this.f267966d;
        }

        public final int hashCode() {
            int iHashCode = this.f267964b.hashCode() * 31;
            String str = this.f267965c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InternalError(throwable=");
            sb2.append(this.f267964b);
            sb2.append(", contentType=");
            return C22026a.c(sb2, this.f267965c, ')');
        }

        public /* synthetic */ InternalError(Throwable th2, String str, int i12, C42822w c42822w) {
            this(th2, (i12 & 2) != 0 ? null : str);
        }
    }

    /* compiled from: SellerPromotionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction$OpenAdvertDetails;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenAdvertDetails implements SellerPromotionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f267967b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f267968c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final DeepLink f267969d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final C14603a f267970e;

        public OpenAdvertDetails(@k String str, @l String str2, @k DeepLink deepLink, @l C14603a c14603a) {
            this.f267967b = str;
            this.f267968c = str2;
            this.f267969d = deepLink;
            this.f267970e = c14603a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenAdvertDetails)) {
                return false;
            }
            OpenAdvertDetails openAdvertDetails = (OpenAdvertDetails) obj;
            return L.f(this.f267967b, openAdvertDetails.f267967b) && L.f(this.f267968c, openAdvertDetails.f267968c) && L.f(this.f267969d, openAdvertDetails.f267969d) && L.f(this.f267970e, openAdvertDetails.f267970e);
        }

        public final int hashCode() {
            int iHashCode = this.f267967b.hashCode() * 31;
            String str = this.f267968c;
            int iE2 = a.e(this.f267969d, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            C14603a c14603a = this.f267970e;
            return iE2 + (c14603a != null ? c14603a.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "OpenAdvertDetails(itemId=" + this.f267967b + ", context=" + this.f267968c + ", onTapDeepLink=" + this.f267969d + ", args=" + this.f267970e + ')';
        }

        public /* synthetic */ OpenAdvertDetails(String str, String str2, DeepLink deepLink, C14603a c14603a, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2, deepLink, (i12 & 8) != 0 ? null : c14603a);
        }
    }
}
