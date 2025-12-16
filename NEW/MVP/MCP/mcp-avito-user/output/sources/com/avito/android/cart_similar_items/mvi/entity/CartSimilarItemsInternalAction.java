package com.avito.android.cart_similar_items.mvi.entity;

import Sq0.c;
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
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import com.avito.android.remote.error.ApiError;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import ln.C43800a;
import on.C44826b;
import org.webrtc.h;

/* compiled from: CartSimilarItemsInternalAction.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0016\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0082\u0001\u0016\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-¨\u0006."}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChangeItemQuantity", "CloseScreen", "Content", "HandleBeduinActions", "HandleError", "InternalError", "OpenAdvertDetails", "OpenDeepLink", "PageLoaded", "PageLoading", "PageLoadingError", "RevertItemsStocks", "ScreenLoading", "SetItemsFavorite", "TopFormChanged", "UpdateCartIconQuantity", "UpdateCartIconState", "UpdateItemsError", "UpdateItemsLoadingFinished", "UpdateItemsLoadingStarted", "UpdateItemsStocks", "UpdateItemsSuccess", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$ChangeItemQuantity;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$CloseScreen;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$Content;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$HandleBeduinActions;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$HandleError;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$InternalError;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$OpenAdvertDetails;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$OpenDeepLink;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$PageLoaded;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$PageLoading;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$PageLoadingError;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$RevertItemsStocks;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$ScreenLoading;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$SetItemsFavorite;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$TopFormChanged;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$UpdateCartIconQuantity;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$UpdateCartIconState;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$UpdateItemsError;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$UpdateItemsLoadingFinished;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$UpdateItemsLoadingStarted;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$UpdateItemsStocks;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$UpdateItemsSuccess;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CartSimilarItemsInternalAction extends n {

    /* compiled from: CartSimilarItemsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$ChangeItemQuantity;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeItemQuantity implements CartSimilarItemsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f116018b;

        /* renamed from: c, reason: collision with root package name */
        public final int f116019c;

        public ChangeItemQuantity(@k String str, int i12) {
            this.f116018b = str;
            this.f116019c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeItemQuantity)) {
                return false;
            }
            ChangeItemQuantity changeItemQuantity = (ChangeItemQuantity) obj;
            return L.f(this.f116018b, changeItemQuantity.f116018b) && this.f116019c == changeItemQuantity.f116019c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f116019c) + (this.f116018b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeItemQuantity(itemId=");
            sb2.append(this.f116018b);
            sb2.append(", newQuantity=");
            return r.t(sb2, this.f116019c, ')');
        }
    }

    /* compiled from: CartSimilarItemsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$CloseScreen;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "()V", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseScreen implements CartSimilarItemsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f116020b = new CloseScreen();

        private CloseScreen() {
        }
    }

    /* compiled from: CartSimilarItemsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$Content;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements CartSimilarItemsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f116021b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f116022c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f116023d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f116024e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final List<c> f116025f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f116026g;

        public Content(@k String str, @l String str2, @k String str3, @l String str4, @k List list, @k List list2) {
            this.f116021b = str;
            this.f116022c = str2;
            this.f116023d = str3;
            this.f116024e = list;
            this.f116025f = list2;
            this.f116026g = str4;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return L.f(this.f116021b, content.f116021b) && L.f(this.f116022c, content.f116022c) && L.f(this.f116023d, content.f116023d) && L.f(this.f116024e, content.f116024e) && L.f(this.f116025f, content.f116025f) && L.f(this.f116026g, content.f116026g);
        }

        public final int hashCode() {
            int iHashCode = this.f116021b.hashCode() * 31;
            String str = this.f116022c;
            int iE2 = H.e(H.e(H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f116023d), 31, this.f116024e), 31, this.f116025f);
            String str2 = this.f116026g;
            return iE2 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(title=");
            sb2.append(this.f116021b);
            sb2.append(", xHash=");
            sb2.append(this.f116022c);
            sb2.append(", topFormId=");
            sb2.append(this.f116023d);
            sb2.append(", topComponents=");
            sb2.append(this.f116024e);
            sb2.append(", mainItems=");
            sb2.append(this.f116025f);
            sb2.append(", paginationRequest=");
            return C22026a.c(sb2, this.f116026g, ')');
        }
    }

    /* compiled from: CartSimilarItemsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$HandleBeduinActions;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleBeduinActions implements CartSimilarItemsInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleBeduinActions)) {
                return false;
            }
            ((HandleBeduinActions) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "HandleBeduinActions(actions=null)";
        }
    }

    /* compiled from: CartSimilarItemsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$HandleError;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleError implements CartSimilarItemsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f116027b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f116028c;

        public HandleError(@k Throwable th2) {
            this.f116027b = th2;
            this.f116028c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF146467d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof HandleError) {
                return L.f(this.f116027b, ((HandleError) obj).f116027b) && L.f(null, null);
            }
            return false;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF327076d() {
            return this.f116028c;
        }

        public final int hashCode() {
            return this.f116027b.hashCode() * 31;
        }

        @k
        public final String toString() {
            return "HandleError(error=" + this.f116027b + ", contentType=null)";
        }
    }

    /* compiled from: CartSimilarItemsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$InternalError;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InternalError implements CartSimilarItemsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f116029b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f116030c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f116031d;

        public InternalError(Throwable th2, String str, int i12, C42822w c42822w) {
            str = (i12 & 2) != 0 ? null : str;
            this.f116029b = th2;
            this.f116030c = str;
            this.f116031d = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d, reason: from getter */
        public final String getF146467d() {
            return this.f116030c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return this.f116030c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InternalError)) {
                return false;
            }
            InternalError internalError = (InternalError) obj;
            return L.f(this.f116029b, internalError.f116029b) && L.f(this.f116030c, internalError.f116030c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF327076d() {
            return this.f116031d;
        }

        public final int hashCode() {
            int iHashCode = this.f116029b.hashCode() * 31;
            String str = this.f116030c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InternalError(throwable=");
            sb2.append(this.f116029b);
            sb2.append(", contentType=");
            return C22026a.c(sb2, this.f116030c, ')');
        }
    }

    /* compiled from: CartSimilarItemsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$OpenDeepLink;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeepLink implements CartSimilarItemsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f116035b;

        public OpenDeepLink(@k DeepLink deepLink) {
            this.f116035b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeepLink) && L.f(this.f116035b, ((OpenDeepLink) obj).f116035b);
        }

        public final int hashCode() {
            return this.f116035b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f116035b, ')');
        }
    }

    /* compiled from: CartSimilarItemsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$PageLoaded;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PageLoaded implements CartSimilarItemsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C44826b f116036b;

        public PageLoaded(@k C44826b c44826b) {
            this.f116036b = c44826b;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF146467d() {
            return "load-next-items";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "load-next-items";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PageLoaded) && L.f(this.f116036b, ((PageLoaded) obj).f116036b);
        }

        public final int hashCode() {
            return this.f116036b.hashCode();
        }

        @k
        public final String toString() {
            return "PageLoaded(pageData=" + this.f116036b + ')';
        }
    }

    /* compiled from: CartSimilarItemsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$PageLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "<init>", "()V", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PageLoading extends TrackableLoadingStarted implements CartSimilarItemsInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f116037d = "load-next-items";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF146467d() {
            return this.f116037d;
        }
    }

    /* compiled from: CartSimilarItemsInternalAction.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$PageLoadingError;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PageLoadingError implements CartSimilarItemsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f116038b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f116039c;

        public PageLoadingError(@k Throwable th2) {
            this.f116038b = th2;
            this.f116039c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF146467d() {
            return "load-next-items";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "load-next-items";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PageLoadingError) && L.f(this.f116038b, ((PageLoadingError) obj).f116038b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF327076d() {
            return this.f116039c;
        }

        public final int hashCode() {
            return this.f116038b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("PageLoadingError(throwable="), this.f116038b, ')');
        }
    }

    /* compiled from: CartSimilarItemsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$RevertItemsStocks;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RevertItemsStocks implements CartSimilarItemsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LinkedHashMap f116040b;

        public RevertItemsStocks(@k LinkedHashMap linkedHashMap) {
            this.f116040b = linkedHashMap;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RevertItemsStocks) && this.f116040b.equals(((RevertItemsStocks) obj).f116040b);
        }

        public final int hashCode() {
            return this.f116040b.hashCode();
        }

        @k
        public final String toString() {
            return h.e(new StringBuilder("RevertItemsStocks(initialStocks="), this.f116040b, ')');
        }
    }

    /* compiled from: CartSimilarItemsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$ScreenLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScreenLoading extends TrackableLoadingStarted implements CartSimilarItemsInternalAction {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f116041d;

        public ScreenLoading(boolean z12) {
            this.f116041d = z12;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScreenLoading) && this.f116041d == ((ScreenLoading) obj).f116041d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return Boolean.hashCode(this.f116041d);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ScreenLoading(fullScreen="), this.f116041d, ')');
        }
    }

    /* compiled from: CartSimilarItemsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$SetItemsFavorite;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetItemsFavorite implements CartSimilarItemsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<String> f116042b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f116043c;

        public SetItemsFavorite(@k List<String> list, boolean z12) {
            this.f116042b = list;
            this.f116043c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetItemsFavorite)) {
                return false;
            }
            SetItemsFavorite setItemsFavorite = (SetItemsFavorite) obj;
            return L.f(this.f116042b, setItemsFavorite.f116042b) && this.f116043c == setItemsFavorite.f116043c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f116043c) + (this.f116042b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SetItemsFavorite(itemIds=");
            sb2.append(this.f116042b);
            sb2.append(", isFavorite=");
            return r.x(sb2, this.f116043c, ')');
        }
    }

    /* compiled from: CartSimilarItemsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$TopFormChanged;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TopFormChanged implements CartSimilarItemsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f116044b;

        /* JADX WARN: Multi-variable type inference failed */
        public TopFormChanged(@k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list) {
            this.f116044b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TopFormChanged) && L.f(this.f116044b, ((TopFormChanged) obj).f116044b);
        }

        public final int hashCode() {
            return this.f116044b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("TopFormChanged(components="), this.f116044b, ')');
        }
    }

    /* compiled from: CartSimilarItemsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$UpdateCartIconQuantity;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateCartIconQuantity implements CartSimilarItemsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f116045b;

        public UpdateCartIconQuantity(int i12) {
            this.f116045b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateCartIconQuantity) && this.f116045b == ((UpdateCartIconQuantity) obj).f116045b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f116045b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("UpdateCartIconQuantity(newQuantity="), this.f116045b, ')');
        }
    }

    /* compiled from: CartSimilarItemsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$UpdateCartIconState;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateCartIconState implements CartSimilarItemsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC31171n f116046b;

        public UpdateCartIconState(@k InterfaceC31171n interfaceC31171n) {
            this.f116046b = interfaceC31171n;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateCartIconState) && L.f(this.f116046b, ((UpdateCartIconState) obj).f116046b);
        }

        public final int hashCode() {
            return this.f116046b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateCartIconState(state=" + this.f116046b + ')';
        }
    }

    /* compiled from: CartSimilarItemsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$UpdateItemsError;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateItemsError implements CartSimilarItemsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f116047b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f116048c;

        public UpdateItemsError(@k ApiError apiError) {
            this.f116047b = apiError;
            this.f116048c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF146467d() {
            return "update-items";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return "update-items";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateItemsError) && L.f(this.f116047b, ((UpdateItemsError) obj).f116047b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF327076d() {
            return this.f116048c;
        }

        public final int hashCode() {
            return this.f116047b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("UpdateItemsError(error="), this.f116047b, ')');
        }
    }

    /* compiled from: CartSimilarItemsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$UpdateItemsLoadingFinished;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "()V", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpdateItemsLoadingFinished implements CartSimilarItemsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final UpdateItemsLoadingFinished f116049b = new UpdateItemsLoadingFinished();

        private UpdateItemsLoadingFinished() {
        }
    }

    /* compiled from: CartSimilarItemsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$UpdateItemsLoadingStarted;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "<init>", "()V", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpdateItemsLoadingStarted extends TrackableLoadingStarted implements CartSimilarItemsInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f116050d = "update-items";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF146467d() {
            return this.f116050d;
        }
    }

    /* compiled from: CartSimilarItemsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$UpdateItemsStocks;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateItemsStocks implements CartSimilarItemsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LinkedHashMap f116051b;

        public UpdateItemsStocks(@k LinkedHashMap linkedHashMap) {
            this.f116051b = linkedHashMap;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateItemsStocks) && this.f116051b.equals(((UpdateItemsStocks) obj).f116051b);
        }

        public final int hashCode() {
            return this.f116051b.hashCode();
        }

        @k
        public final String toString() {
            return h.e(new StringBuilder("UpdateItemsStocks(stocks="), this.f116051b, ')');
        }
    }

    /* compiled from: CartSimilarItemsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$UpdateItemsSuccess;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "<init>", "()V", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpdateItemsSuccess implements CartSimilarItemsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final UpdateItemsSuccess f116052b = new UpdateItemsSuccess();

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final String f116053c = "update-items";

        private UpdateItemsSuccess() {
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF146467d() {
            return f116053c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return f116053c;
        }
    }

    /* compiled from: CartSimilarItemsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction$OpenAdvertDetails;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenAdvertDetails implements CartSimilarItemsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f116032b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f116033c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final C43800a f116034d;

        public OpenAdvertDetails(@k String str, @l String str2, @l C43800a c43800a) {
            this.f116032b = str;
            this.f116033c = str2;
            this.f116034d = c43800a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenAdvertDetails)) {
                return false;
            }
            OpenAdvertDetails openAdvertDetails = (OpenAdvertDetails) obj;
            return L.f(this.f116032b, openAdvertDetails.f116032b) && L.f(this.f116033c, openAdvertDetails.f116033c) && L.f(this.f116034d, openAdvertDetails.f116034d);
        }

        public final int hashCode() {
            int iHashCode = this.f116032b.hashCode() * 31;
            String str = this.f116033c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            C43800a c43800a = this.f116034d;
            return iHashCode2 + (c43800a != null ? c43800a.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "OpenAdvertDetails(itemId=" + this.f116032b + ", context=" + this.f116033c + ", args=" + this.f116034d + ')';
        }

        public /* synthetic */ OpenAdvertDetails(String str, String str2, C43800a c43800a, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : c43800a);
        }
    }
}
