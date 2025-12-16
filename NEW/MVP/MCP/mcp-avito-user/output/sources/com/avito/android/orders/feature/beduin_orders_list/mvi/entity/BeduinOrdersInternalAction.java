package com.avito.android.orders.feature.beduin_orders_list.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.progress_overlay.b;
import com.avito.android.remote.error.ApiError;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinOrdersInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ApplyNewContentPlaceholderState", "ContentChanged", "ContentLoaded", "ExecuteRequestStateChanged", "LoadingFailed", "LoadingStarted", "RefreshScreenFailed", "RefreshingScreenStateChanged", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction$ApplyNewContentPlaceholderState;", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction$ContentChanged;", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction$ContentLoaded;", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction$ExecuteRequestStateChanged;", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction$LoadingFailed;", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction$LoadingStarted;", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction$RefreshScreenFailed;", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction$RefreshingScreenStateChanged;", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface BeduinOrdersInternalAction extends n {

    /* compiled from: BeduinOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction$ApplyNewContentPlaceholderState;", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction;", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplyNewContentPlaceholderState implements BeduinOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final b.a f210091b;

        public ApplyNewContentPlaceholderState(@l b.a aVar) {
            this.f210091b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApplyNewContentPlaceholderState) && L.f(this.f210091b, ((ApplyNewContentPlaceholderState) obj).f210091b);
        }

        public final int hashCode() {
            b.a aVar = this.f210091b;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        @k
        public final String toString() {
            return "ApplyNewContentPlaceholderState(contentPlaceholderData=" + this.f210091b + ')';
        }
    }

    /* compiled from: BeduinOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction$ContentChanged;", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction;", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentChanged implements BeduinOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f210092b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f210093c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f210094d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f210095e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f210096f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f210097g;

        /* JADX WARN: Multi-variable type inference failed */
        public ContentChanged(@k String str, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @k String str2, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, @k String str3, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list3) {
            this.f210092b = str;
            this.f210093c = list;
            this.f210094d = str2;
            this.f210095e = list2;
            this.f210096f = str3;
            this.f210097g = list3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentChanged)) {
                return false;
            }
            ContentChanged contentChanged = (ContentChanged) obj;
            return L.f(this.f210092b, contentChanged.f210092b) && L.f(this.f210093c, contentChanged.f210093c) && L.f(this.f210094d, contentChanged.f210094d) && L.f(this.f210095e, contentChanged.f210095e) && L.f(this.f210096f, contentChanged.f210096f) && L.f(this.f210097g, contentChanged.f210097g);
        }

        public final int hashCode() {
            return this.f210097g.hashCode() + H.d(H.e(H.d(H.e(this.f210092b.hashCode() * 31, 31, this.f210093c), 31, this.f210094d), 31, this.f210095e), 31, this.f210096f);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentChanged(topFormId=");
            sb2.append(this.f210092b);
            sb2.append(", topComponents=");
            sb2.append(this.f210093c);
            sb2.append(", mainFormId=");
            sb2.append(this.f210094d);
            sb2.append(", mainComponents=");
            sb2.append(this.f210095e);
            sb2.append(", bottomFormId=");
            sb2.append(this.f210096f);
            sb2.append(", bottomComponents=");
            return H.p(sb2, this.f210097g, ')');
        }
    }

    /* compiled from: BeduinOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction$ContentLoaded;", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements BeduinOrdersInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f210098b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f210099c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f210100d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final List<BeduinAction> f210101e;

        /* JADX WARN: Multi-variable type inference failed */
        public ContentLoaded(@l String str, @k String str2, @l String str3, @k List<? extends BeduinAction> list) {
            this.f210098b = str;
            this.f210099c = str2;
            this.f210100d = str3;
            this.f210101e = list;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF206205d() {
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
            if (!(obj instanceof ContentLoaded)) {
                return false;
            }
            ContentLoaded contentLoaded = (ContentLoaded) obj;
            return L.f(this.f210098b, contentLoaded.f210098b) && L.f(this.f210099c, contentLoaded.f210099c) && L.f(this.f210100d, contentLoaded.f210100d) && L.f(this.f210101e, contentLoaded.f210101e);
        }

        public final int hashCode() {
            String str = this.f210098b;
            int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f210099c);
            String str2 = this.f210100d;
            return this.f210101e.hashCode() + ((iD2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentLoaded(topFormId=");
            sb2.append(this.f210098b);
            sb2.append(", mainFormId=");
            sb2.append(this.f210099c);
            sb2.append(", bottomFormId=");
            sb2.append(this.f210100d);
            sb2.append(", onRefreshActions=");
            return H.p(sb2, this.f210101e, ')');
        }
    }

    /* compiled from: BeduinOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction$ExecuteRequestStateChanged;", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction;", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ExecuteRequestStateChanged implements BeduinOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f210102b;

        public ExecuteRequestStateChanged(boolean z12) {
            this.f210102b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExecuteRequestStateChanged) && this.f210102b == ((ExecuteRequestStateChanged) obj).f210102b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f210102b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ExecuteRequestStateChanged(isExecuting="), this.f210102b, ')');
        }
    }

    /* compiled from: BeduinOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction$LoadingFailed;", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingFailed implements BeduinOrdersInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f210103b;

        public LoadingFailed(@k ApiError apiError) {
            this.f210103b = apiError;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF206205d() {
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
            return (obj instanceof LoadingFailed) && L.f(this.f210103b, ((LoadingFailed) obj).f210103b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF99367c() {
            return new J.a(this.f210103b);
        }

        public final int hashCode() {
            return this.f210103b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LoadingFailed(error="), this.f210103b, ')');
        }
    }

    /* compiled from: BeduinOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction$LoadingStarted;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction;", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingStarted extends TrackableLoadingStarted implements BeduinOrdersInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final G0 f210104d;

        public LoadingStarted() {
            this(null, 1, null);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingStarted) && L.f(this.f210104d, ((LoadingStarted) obj).f210104d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f210104d.hashCode();
        }

        @k
        public final String toString() {
            return c.v(new StringBuilder("LoadingStarted(stub="), this.f210104d, ')');
        }

        public LoadingStarted(G0 g02, int i12, C42822w c42822w) {
            this.f210104d = (i12 & 1) != 0 ? G0.f406611a : g02;
        }
    }

    /* compiled from: BeduinOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction$RefreshScreenFailed;", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction;", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RefreshScreenFailed implements BeduinOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f210105b;

        public RefreshScreenFailed(@k ApiError apiError) {
            this.f210105b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RefreshScreenFailed) && L.f(this.f210105b, ((RefreshScreenFailed) obj).f210105b);
        }

        public final int hashCode() {
            return this.f210105b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("RefreshScreenFailed(error="), this.f210105b, ')');
        }
    }

    /* compiled from: BeduinOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction$RefreshingScreenStateChanged;", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction;", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RefreshingScreenStateChanged implements BeduinOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f210106b;

        public RefreshingScreenStateChanged(boolean z12) {
            this.f210106b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RefreshingScreenStateChanged) && this.f210106b == ((RefreshingScreenStateChanged) obj).f210106b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f210106b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("RefreshingScreenStateChanged(isRefreshing="), this.f210106b, ')');
        }
    }
}
