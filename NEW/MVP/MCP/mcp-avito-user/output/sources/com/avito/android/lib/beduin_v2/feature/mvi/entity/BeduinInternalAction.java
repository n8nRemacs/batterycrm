package com.avito.android.lib.beduin_v2.feature.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.TrackablePreloadedContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.beduin.v2.engine.exception.AbstractBeduinException;
import com.avito.beduin.v2.handler.flow.m;
import com.avito.beduin.v2.interaction.navigation.flow.t;
import dU0.InterfaceC39628a;
import dU0.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "DisplayScreenErrorException", "FinishLoadingContent", "ForOneTimeEventProducer", "ForReducer", "OnBeduinException", "OnBeduinScreen", "Reload", "SendComponentInteraction", "SendPlatformInteraction", "ShowContent", "ShowError", "ShowToastError", "StartLoadingContent", "StartParsing", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$FinishLoadingContent;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$ForOneTimeEventProducer;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$ForReducer;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface BeduinInternalAction extends n {

    /* compiled from: BeduinInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$DisplayScreenErrorException;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$ForReducer;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DisplayScreenErrorException implements ForReducer {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AbstractBeduinException f176254b;

        public DisplayScreenErrorException(@k AbstractBeduinException abstractBeduinException) {
            this.f176254b = abstractBeduinException;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayScreenErrorException) && L.f(this.f176254b, ((DisplayScreenErrorException) obj).f176254b);
        }

        public final int hashCode() {
            return this.f176254b.hashCode();
        }

        @k
        public final String toString() {
            return "DisplayScreenErrorException(exception=" + this.f176254b + ')';
        }
    }

    /* compiled from: BeduinInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$FinishLoadingContent;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishLoadingContent implements BeduinInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FinishLoadingContent f176255b = new FinishLoadingContent();

        private FinishLoadingContent() {
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF111994d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof FinishLoadingContent);
        }

        public final int hashCode() {
            return -1567351251;
        }

        @k
        public final String toString() {
            return "FinishLoadingContent";
        }
    }

    /* compiled from: BeduinInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$ForOneTimeEventProducer;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$OnBeduinException;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$Reload;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$SendComponentInteraction;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$SendPlatformInteraction;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$ShowToastError;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ForOneTimeEventProducer extends BeduinInternalAction {
    }

    /* compiled from: BeduinInternalAction.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$ForReducer;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$DisplayScreenErrorException;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$OnBeduinScreen;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$ShowContent;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$ShowError;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$StartLoadingContent;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$StartParsing;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ForReducer extends BeduinInternalAction {
    }

    /* compiled from: BeduinInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$OnBeduinException;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$ForOneTimeEventProducer;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnBeduinException implements ForOneTimeEventProducer {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AbstractBeduinException f176256b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f176257c;

        public OnBeduinException(@k AbstractBeduinException abstractBeduinException, @k String str) {
            this.f176256b = abstractBeduinException;
            this.f176257c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBeduinException)) {
                return false;
            }
            OnBeduinException onBeduinException = (OnBeduinException) obj;
            return L.f(this.f176256b, onBeduinException.f176256b) && L.f(this.f176257c, onBeduinException.f176257c);
        }

        public final int hashCode() {
            return this.f176257c.hashCode() + (this.f176256b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnBeduinException(exception=");
            sb2.append(this.f176256b);
            sb2.append(", id=");
            return C22026a.c(sb2, this.f176257c, ')');
        }
    }

    /* compiled from: BeduinInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$OnBeduinScreen;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$ForReducer;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnBeduinScreen implements ForReducer {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final t f176258b;

        public OnBeduinScreen(@k t tVar) {
            this.f176258b = tVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnBeduinScreen) && L.f(this.f176258b, ((OnBeduinScreen) obj).f176258b);
        }

        public final int hashCode() {
            return this.f176258b.hashCode();
        }

        @k
        public final String toString() {
            return "OnBeduinScreen(screen=" + this.f176258b + ')';
        }
    }

    /* compiled from: BeduinInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$Reload;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$ForOneTimeEventProducer;", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Reload implements ForOneTimeEventProducer {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Reload f176259b = new Reload();

        private Reload() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Reload);
        }

        public final int hashCode() {
            return -96732298;
        }

        @k
        public final String toString() {
            return "Reload";
        }
    }

    /* compiled from: BeduinInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$SendComponentInteraction;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$ForOneTimeEventProducer;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SendComponentInteraction implements ForOneTimeEventProducer {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC39628a f176260b;

        public SendComponentInteraction(@k InterfaceC39628a interfaceC39628a) {
            this.f176260b = interfaceC39628a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SendComponentInteraction) && L.f(this.f176260b, ((SendComponentInteraction) obj).f176260b);
        }

        public final int hashCode() {
            return this.f176260b.hashCode();
        }

        @k
        public final String toString() {
            return "SendComponentInteraction(componentInteraction=" + this.f176260b + ')';
        }
    }

    /* compiled from: BeduinInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$SendPlatformInteraction;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$ForOneTimeEventProducer;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SendPlatformInteraction implements ForOneTimeEventProducer {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final b f176261b;

        public SendPlatformInteraction(@k b bVar) {
            this.f176261b = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SendPlatformInteraction) && L.f(this.f176261b, ((SendPlatformInteraction) obj).f176261b);
        }

        public final int hashCode() {
            return this.f176261b.hashCode();
        }

        @k
        public final String toString() {
            return "SendPlatformInteraction(platformInteraction=" + this.f176261b + ')';
        }
    }

    /* compiled from: BeduinInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$ShowContent;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$ForReducer;", "Lcom/avito/android/analytics/screens/mvi/TrackablePreloadedContent;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements ForReducer, TrackablePreloadedContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final m f176262b;

        public ShowContent(@k m mVar) {
            this.f176262b = mVar;
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
            return (obj instanceof ShowContent) && L.f(this.f176262b, ((ShowContent) obj).f176262b);
        }

        public final int hashCode() {
            return this.f176262b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowContent(state=" + this.f176262b + ')';
        }
    }

    /* compiled from: BeduinInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$ShowError;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$ForReducer;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowError implements ForReducer, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f176263b;

        public ShowError(@k Throwable th2) {
            this.f176263b = th2;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF111994d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF124443d() {
            return new J.a(this.f176263b);
        }
    }

    /* compiled from: BeduinInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$ShowToastError;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$ForOneTimeEventProducer;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToastError implements ForOneTimeEventProducer {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AbstractBeduinException f176264b;

        public ShowToastError(@k AbstractBeduinException abstractBeduinException) {
            this.f176264b = abstractBeduinException;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowToastError) && L.f(this.f176264b, ((ShowToastError) obj).f176264b);
        }

        public final int hashCode() {
            return this.f176264b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowToastError(exception=" + this.f176264b + ')';
        }
    }

    /* compiled from: BeduinInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$StartLoadingContent;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$ForReducer;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartLoadingContent extends TrackableLoadingStarted implements ForReducer {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final G0 f176265d;

        public StartLoadingContent() {
            this(null, 1, null);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartLoadingContent) && L.f(this.f176265d, ((StartLoadingContent) obj).f176265d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f176265d.hashCode();
        }

        @k
        public final String toString() {
            return c.v(new StringBuilder("StartLoadingContent(stub="), this.f176265d, ')');
        }

        public StartLoadingContent(G0 g02, int i12, C42822w c42822w) {
            this.f176265d = (i12 & 1) != 0 ? G0.f406611a : g02;
        }
    }

    /* compiled from: BeduinInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$StartParsing;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction$ForReducer;", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartParsing implements ForReducer {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final StartParsing f176266b = new StartParsing();

        private StartParsing() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof StartParsing);
        }

        public final int hashCode() {
            return 2125248523;
        }

        @k
        public final String toString() {
            return "StartParsing";
        }
    }
}
