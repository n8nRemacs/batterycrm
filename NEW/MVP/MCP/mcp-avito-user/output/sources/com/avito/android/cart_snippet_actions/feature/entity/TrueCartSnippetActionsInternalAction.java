package com.avito.android.cart_snippet_actions.feature.entity;

import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.remote.error.ApiError;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import tn.InterfaceC48693b;
import vn.C49355b;

/* compiled from: TrueCartSnippetActionsInternalAction.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction;", "Ltn/b;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "UpdateItemsError", "UpdateItemsLoadingStarted", "l", "UpdateItemsSuccess", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$a;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$b;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$c;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$d;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$e;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$f;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$g;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$h;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$i;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$j;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$k;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$UpdateItemsError;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$UpdateItemsLoadingStarted;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$l;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$UpdateItemsSuccess;", "_avito_cart-snippet-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface TrueCartSnippetActionsInternalAction extends InterfaceC48693b {

    /* compiled from: TrueCartSnippetActionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$UpdateItemsError;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_cart-snippet-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateItemsError implements TrueCartSnippetActionsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ApiError f116188b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final J.a f116189c;

        public UpdateItemsError(@Y61.k ApiError apiError) {
            this.f116188b = apiError;
            this.f116189c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @Y61.k
        /* renamed from: d */
        public final String getF200214d() {
            return "update-items";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @Y61.l
        /* renamed from: e */
        public final String getF112001c() {
            return "update-items";
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateItemsError) && L.f(this.f116188b, ((UpdateItemsError) obj).f116188b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @Y61.k
        /* renamed from: g, reason: from getter */
        public final J.a getF114166c() {
            return this.f116189c;
        }

        public final int hashCode() {
            return this.f116188b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.n(new StringBuilder("UpdateItemsError(error="), this.f116188b, ')');
        }
    }

    /* compiled from: TrueCartSnippetActionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$UpdateItemsLoadingStarted;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction;", "<init>", "()V", "_avito_cart-snippet-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpdateItemsLoadingStarted extends TrackableLoadingStarted implements TrueCartSnippetActionsInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f116190d = "update-items";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getF200214d() {
            return this.f116190d;
        }
    }

    /* compiled from: TrueCartSnippetActionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$UpdateItemsSuccess;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "<init>", "()V", "_avito_cart-snippet-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpdateItemsSuccess implements TrueCartSnippetActionsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final UpdateItemsSuccess f116191b = new UpdateItemsSuccess();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final String f116192c = "update-items";

        private UpdateItemsSuccess() {
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @Y61.k
        /* renamed from: d */
        public final String getF200214d() {
            return f116192c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @Y61.l
        /* renamed from: e */
        public final String getF112001c() {
            return f116192c;
        }
    }

    /* compiled from: TrueCartSnippetActionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$a;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction;", "_avito_cart-snippet-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements TrueCartSnippetActionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f116193b;

        /* renamed from: c, reason: collision with root package name */
        public final int f116194c;

        public a(@Y61.k String str, int i12) {
            this.f116193b = str;
            this.f116194c = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f116193b, aVar.f116193b) && this.f116194c == aVar.f116194c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f116194c) + (this.f116193b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeItemQuantity(itemId=");
            sb2.append(this.f116193b);
            sb2.append(", newQuantity=");
            return r.t(sb2, this.f116194c, ')');
        }
    }

    /* compiled from: TrueCartSnippetActionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$b;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction;", "_avito_cart-snippet-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements TrueCartSnippetActionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f116195b;

        public b(@Y61.k LinkedHashMap linkedHashMap) {
            this.f116195b = linkedHashMap;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f116195b.equals(((b) obj).f116195b);
        }

        public final int hashCode() {
            return this.f116195b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return org.webrtc.h.e(new StringBuilder("InitializeStocks(stocks="), this.f116195b, ')');
        }
    }

    /* compiled from: TrueCartSnippetActionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$c;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction;", "_avito_cart-snippet-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements TrueCartSnippetActionsInternalAction {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeepLink(deepLink="), null, ')');
        }
    }

    /* compiled from: TrueCartSnippetActionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$d;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction;", "_avito_cart-snippet-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements TrueCartSnippetActionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f116196b;

        public d(@Y61.k LinkedHashMap linkedHashMap) {
            this.f116196b = linkedHashMap;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f116196b.equals(((d) obj).f116196b);
        }

        public final int hashCode() {
            return this.f116196b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return org.webrtc.h.e(new StringBuilder("RevertItemsStocks(initialStocks="), this.f116196b, ')');
        }
    }

    /* compiled from: TrueCartSnippetActionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$e;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction;", "_avito_cart-snippet-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements TrueCartSnippetActionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Map<String, Object> f116197b;

        public e(@Y61.l Map<String, ? extends Object> map) {
            this.f116197b = map;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f116197b, ((e) obj).f116197b);
        }

        public final int hashCode() {
            Map<String, Object> map = this.f116197b;
            if (map == null) {
                return 0;
            }
            return map.hashCode();
        }

        @Y61.k
        public final String toString() {
            return r.w(new StringBuilder("SetAnalyticsData(analyticsData="), this.f116197b, ')');
        }
    }

    /* compiled from: TrueCartSnippetActionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$f;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction;", "_avito_cart-snippet-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements TrueCartSnippetActionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f116198b;

        public f(@Y61.k LinkedHashMap linkedHashMap) {
            this.f116198b = linkedHashMap;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f116198b.equals(((f) obj).f116198b);
        }

        public final int hashCode() {
            return this.f116198b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return org.webrtc.h.e(new StringBuilder("SetBundleInfo(bundleInfo="), this.f116198b, ')');
        }
    }

    /* compiled from: TrueCartSnippetActionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$g;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction;", "_avito_cart-snippet-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements TrueCartSnippetActionsInternalAction {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            ((g) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        @Y61.k
        public final String toString() {
            return "SetBundlesSupport(supportBundles=false)";
        }
    }

    /* compiled from: TrueCartSnippetActionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$h;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction;", "_avito_cart-snippet-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements TrueCartSnippetActionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final C49355b f116199b;

        public h(@Y61.l C49355b c49355b) {
            this.f116199b = c49355b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f116199b, ((h) obj).f116199b);
        }

        public final int hashCode() {
            C49355b c49355b = this.f116199b;
            if (c49355b == null) {
                return 0;
            }
            return c49355b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SetDiscountOnDelivery(discountOnDelivery=" + this.f116199b + ')';
        }
    }

    /* compiled from: TrueCartSnippetActionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$i;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction;", "_avito_cart-snippet-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements TrueCartSnippetActionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f116200b;

        public i(boolean z12) {
            this.f116200b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f116200b == ((i) obj).f116200b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f116200b);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("SetDiscountOnDeliverySupport(supportDiscountOnDelivery="), this.f116200b, ')');
        }
    }

    /* compiled from: TrueCartSnippetActionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$j;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction;", "_avito_cart-snippet-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements TrueCartSnippetActionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f116201b;

        public j(@Y61.k LinkedHashMap linkedHashMap) {
            this.f116201b = linkedHashMap;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f116201b.equals(((j) obj).f116201b);
        }

        public final int hashCode() {
            return this.f116201b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return org.webrtc.h.e(new StringBuilder("SetStocksFromStorage(stocksFromStorage="), this.f116201b, ')');
        }
    }

    /* compiled from: TrueCartSnippetActionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$k;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction;", "_avito_cart-snippet-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements TrueCartSnippetActionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f116202b;

        public k(int i12) {
            this.f116202b = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f116202b == ((k) obj).f116202b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f116202b);
        }

        @Y61.k
        public final String toString() {
            return r.t(new StringBuilder("UpdateCartIconQuantity(newQuantity="), this.f116202b, ')');
        }
    }

    /* compiled from: TrueCartSnippetActionsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction$l;", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction;", "<init>", "()V", "_avito_cart-snippet-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements TrueCartSnippetActionsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final l f116203b = new l();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -1486023186;
        }

        @Y61.k
        public final String toString() {
            return "UpdateItemsLoadingStartedFromDebounce";
        }
    }
}
