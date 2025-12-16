package com.avito.android.vas_performance.screens.stickers.buy.mvi.entity;

import AK.c;
import FL0.d;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StickersBuyInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChangeButtonState", "CloseScreen", "Content", "Error", "Loading", "OpenDeepLink", "ShowStickerDescription", "StickerSelected", "Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction$ChangeButtonState;", "Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction$CloseScreen;", "Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction$Content;", "Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction$Error;", "Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction$Loading;", "Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction$OpenDeepLink;", "Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction$ShowStickerDescription;", "Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction$StickerSelected;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface StickersBuyInternalAction extends n {

    /* compiled from: StickersBuyInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction$ChangeButtonState;", "Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeButtonState implements StickersBuyInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f320731b;

        /* renamed from: c, reason: collision with root package name */
        public final int f320732c;

        public ChangeButtonState(boolean z12, int i12) {
            this.f320731b = z12;
            this.f320732c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeButtonState)) {
                return false;
            }
            ChangeButtonState changeButtonState = (ChangeButtonState) obj;
            return this.f320731b == changeButtonState.f320731b && this.f320732c == changeButtonState.f320732c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f320732c) + (Boolean.hashCode(this.f320731b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeButtonState(isLoading=");
            sb2.append(this.f320731b);
            sb2.append(", buttonId=");
            return r.t(sb2, this.f320732c, ')');
        }
    }

    /* compiled from: StickersBuyInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction$CloseScreen;", "Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements StickersBuyInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f320733b;

        public CloseScreen() {
            this(false, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseScreen) && this.f320733b == ((CloseScreen) obj).f320733b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f320733b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("CloseScreen(forceFinishFlow="), this.f320733b, ')');
        }

        public CloseScreen(boolean z12) {
            this.f320733b = z12;
        }

        public /* synthetic */ CloseScreen(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12);
        }
    }

    /* compiled from: StickersBuyInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction$Content;", "Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements StickersBuyInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final d f320734b;

        public Content(@k d dVar) {
            this.f320734b = dVar;
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
            return (obj instanceof Content) && L.f(this.f320734b, ((Content) obj).f320734b);
        }

        public final int hashCode() {
            return this.f320734b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f320734b + ')';
        }
    }

    /* compiled from: StickersBuyInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction$Error;", "Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements StickersBuyInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f320735b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f320736c;

        public Error(@k ApiError apiError) {
            this.f320735b = apiError;
            this.f320736c = new J.a(apiError);
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
            return (obj instanceof Error) && L.f(this.f320735b, ((Error) obj).f320735b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF206204c() {
            return this.f320736c;
        }

        public final int hashCode() {
            return this.f320735b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(apiError="), this.f320735b, ')');
        }
    }

    /* compiled from: StickersBuyInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction$Loading;", "Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements StickersBuyInternalAction {
    }

    /* compiled from: StickersBuyInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction$OpenDeepLink;", "Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeepLink implements StickersBuyInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f320737b;

        public OpenDeepLink(@l DeepLink deepLink) {
            this.f320737b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeepLink) && L.f(this.f320737b, ((OpenDeepLink) obj).f320737b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f320737b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f320737b, ')');
        }
    }

    /* compiled from: StickersBuyInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction$ShowStickerDescription;", "Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowStickerDescription implements StickersBuyInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a f320738b;

        public ShowStickerDescription(@k com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a aVar) {
            this.f320738b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowStickerDescription) && L.f(this.f320738b, ((ShowStickerDescription) obj).f320738b);
        }

        public final int hashCode() {
            return this.f320738b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowStickerDescription(sticker=" + this.f320738b + ')';
        }
    }

    /* compiled from: StickersBuyInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction$StickerSelected;", "Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StickerSelected implements StickersBuyInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a f320739b;

        public StickerSelected(@k com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a aVar) {
            this.f320739b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StickerSelected) && L.f(this.f320739b, ((StickerSelected) obj).f320739b);
        }

        public final int hashCode() {
            return this.f320739b.hashCode();
        }

        @k
        public final String toString() {
            return "StickerSelected(sticker=" + this.f320739b + ')';
        }
    }
}
