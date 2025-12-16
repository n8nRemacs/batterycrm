package com.avito.android.vas_union.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.akita.compose.component.accordion.s;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.ApiException;
import com.avito.android.vas_union.ui.items.tabs.c;
import com.avito.android.vas_union.ui.items.vas_bundle.c;
import com.avito.android.vas_union.ui.items.vas_performance_select.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import tM0.g;

/* compiled from: VasUnionV2InternalAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChangeOnScreenLoading", "Close", "Content", "Error", "FinishFlow", "HandleDeeplink", "Loading", "SelectBundleCard", "SelectPerformanceCard", "SelectPerformanceChip", "SelectTab", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction$ChangeOnScreenLoading;", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction$Close;", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction$Content;", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction$Error;", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction$FinishFlow;", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction$HandleDeeplink;", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction$Loading;", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction$SelectBundleCard;", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction$SelectPerformanceCard;", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction$SelectPerformanceChip;", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction$SelectTab;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface VasUnionV2InternalAction extends n {

    /* compiled from: VasUnionV2InternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction$ChangeOnScreenLoading;", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeOnScreenLoading implements VasUnionV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f323216b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f323217c;

        public ChangeOnScreenLoading(boolean z12, @l Integer num) {
            this.f323216b = z12;
            this.f323217c = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeOnScreenLoading)) {
                return false;
            }
            ChangeOnScreenLoading changeOnScreenLoading = (ChangeOnScreenLoading) obj;
            return this.f323216b == changeOnScreenLoading.f323216b && L.f(this.f323217c, changeOnScreenLoading.f323217c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f323216b) * 31;
            Integer num = this.f323217c;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeOnScreenLoading(isLoading=");
            sb2.append(this.f323216b);
            sb2.append(", buttonId=");
            return s.j(sb2, this.f323217c, ')');
        }
    }

    /* compiled from: VasUnionV2InternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction$Close;", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction;", "<init>", "()V", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements VasUnionV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f323218b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -632972868;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: VasUnionV2InternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction$Content;", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements VasUnionV2InternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final g f323219b;

        public Content(@k g gVar) {
            this.f323219b = gVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF294761d() {
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
            return (obj instanceof Content) && L.f(this.f323219b, ((Content) obj).f323219b);
        }

        public final int hashCode() {
            return this.f323219b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f323219b + ')';
        }
    }

    /* compiled from: VasUnionV2InternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction$Error;", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements VasUnionV2InternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f323220b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f323221c;

        public Error(@k ApiException apiException) {
            this.f323220b = apiException;
            this.f323221c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF294761d() {
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
            return (obj instanceof Error) && this.f323220b.equals(((Error) obj).f323220b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF319540c() {
            return this.f323221c;
        }

        public final int hashCode() {
            return this.f323220b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(error="), this.f323220b, ')');
        }
    }

    /* compiled from: VasUnionV2InternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction$FinishFlow;", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction;", "<init>", "()V", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishFlow implements VasUnionV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FinishFlow f323222b = new FinishFlow();

        private FinishFlow() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof FinishFlow);
        }

        public final int hashCode() {
            return -468746467;
        }

        @k
        public final String toString() {
            return "FinishFlow";
        }
    }

    /* compiled from: VasUnionV2InternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction;", "()V", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements VasUnionV2InternalAction {
    }

    /* compiled from: VasUnionV2InternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction$SelectBundleCard;", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectBundleCard implements VasUnionV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final c.a f323227b;

        public SelectBundleCard(@k c.a aVar) {
            this.f323227b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectBundleCard) && L.f(this.f323227b, ((SelectBundleCard) obj).f323227b);
        }

        public final int hashCode() {
            return this.f323227b.hashCode();
        }

        @k
        public final String toString() {
            return "SelectBundleCard(item=" + this.f323227b + ')';
        }
    }

    /* compiled from: VasUnionV2InternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction$SelectPerformanceCard;", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectPerformanceCard implements VasUnionV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final c.a f323228b;

        public SelectPerformanceCard(@k c.a aVar) {
            this.f323228b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectPerformanceCard) && L.f(this.f323228b, ((SelectPerformanceCard) obj).f323228b);
        }

        public final int hashCode() {
            return this.f323228b.hashCode();
        }

        @k
        public final String toString() {
            return "SelectPerformanceCard(item=" + this.f323228b + ')';
        }
    }

    /* compiled from: VasUnionV2InternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction$SelectPerformanceChip;", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectPerformanceChip implements VasUnionV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f323229b;

        public SelectPerformanceChip(int i12) {
            this.f323229b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectPerformanceChip) && this.f323229b == ((SelectPerformanceChip) obj).f323229b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f323229b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("SelectPerformanceChip(id="), this.f323229b, ')');
        }
    }

    /* compiled from: VasUnionV2InternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction$SelectTab;", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectTab implements VasUnionV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final c.a f323230b;

        public SelectTab(@k c.a aVar) {
            this.f323230b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectTab) && L.f(this.f323230b, ((SelectTab) obj).f323230b);
        }

        public final int hashCode() {
            return this.f323230b.hashCode();
        }

        @k
        public final String toString() {
            return "SelectTab(tab=" + this.f323230b + ')';
        }
    }

    /* compiled from: VasUnionV2InternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction$HandleDeeplink;", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements VasUnionV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f323223b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f323224c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f323225d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Integer f323226e;

        public HandleDeeplink(@k DeepLink deepLink, @l Integer num, @l String str, @l Integer num2) {
            this.f323223b = deepLink;
            this.f323224c = num;
            this.f323225d = str;
            this.f323226e = num2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleDeeplink)) {
                return false;
            }
            HandleDeeplink handleDeeplink = (HandleDeeplink) obj;
            return L.f(this.f323223b, handleDeeplink.f323223b) && L.f(this.f323224c, handleDeeplink.f323224c) && L.f(this.f323225d, handleDeeplink.f323225d) && L.f(this.f323226e, handleDeeplink.f323226e);
        }

        public final int hashCode() {
            int iHashCode = this.f323223b.hashCode() * 31;
            Integer num = this.f323224c;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f323225d;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num2 = this.f323226e;
            return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f323223b);
            sb2.append(", buttonId=");
            sb2.append(this.f323224c);
            sb2.append(", slug=");
            sb2.append(this.f323225d);
            sb2.append(", bundleId=");
            return s.j(sb2, this.f323226e, ')');
        }

        public /* synthetic */ HandleDeeplink(DeepLink deepLink, Integer num, String str, Integer num2, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? null : num2);
        }
    }
}
