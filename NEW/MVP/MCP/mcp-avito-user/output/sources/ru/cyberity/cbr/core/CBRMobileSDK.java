package ru.cyberity.cbr.core;

import Y41.p;
import Y41.t;
import Y61.k;
import Y61.l;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.fragment.app.Fragment;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.android.gms.security.a;
import j.InterfaceC42153i;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.D0;
import ru.cyberity.cbr.core.analytics.Screen;
import ru.cyberity.cbr.core.common.CBRSession;
import ru.cyberity.cbr.core.common.m;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.common.p0;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.data.listener.CBRActionResultHandler;
import ru.cyberity.cbr.core.data.listener.CBRCompleteHandler;
import ru.cyberity.cbr.core.data.listener.CBRCountryPicker;
import ru.cyberity.cbr.core.data.listener.CBRDefaultCountryPicker;
import ru.cyberity.cbr.core.data.listener.CBRDefaultIconHandler;
import ru.cyberity.cbr.core.data.listener.CBRErrorHandler;
import ru.cyberity.cbr.core.data.listener.CBREvent;
import ru.cyberity.cbr.core.data.listener.CBREventHandler;
import ru.cyberity.cbr.core.data.listener.CBRIconHandler;
import ru.cyberity.cbr.core.data.listener.CBRInstructionsViewHandler;
import ru.cyberity.cbr.core.data.listener.CBRStateChangedHandler;
import ru.cyberity.cbr.core.data.listener.CBRUrlHandler;
import ru.cyberity.cbr.core.data.listener.TokenExpirationHandler;
import ru.cyberity.cbr.core.data.model.CBRCompletionResult;
import ru.cyberity.cbr.core.data.model.CBRDocumentDefinition;
import ru.cyberity.cbr.core.data.model.CBRException;
import ru.cyberity.cbr.core.data.model.CBRInitConfig;
import ru.cyberity.cbr.core.data.model.CBRInvalidParametersException;
import ru.cyberity.cbr.core.data.model.CBRSDKState;
import ru.cyberity.cbr.core.data.model.CBRSupportItem;
import ru.cyberity.cbr.core.data.model.LogParams;
import ru.cyberity.cbr.core.presentation.CBRAnalyticsScreenMapper;
import ru.cyberity.cbr.core.theme.CBRJsonCustomization;
import ru.cyberity.cbr.core.theme.CBRJsonCustomizationImpl;
import ru.cyberity.cbr.presentation.utils.AnalyticMapperKt;
import ru.cyberity.cbr.prooface.CBRProoface;
import ru.cyberity.log.LoggerType;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRMobileSDK.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004>?@AB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00178\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00048\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010\u0006R\u0014\u0010,\u001a\u00020)8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0016\u00100\u001a\u0004\u0018\u00010-8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00178\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b1\u0010\u001bR\u0014\u00104\u001a\u00020\u00048\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b3\u0010\u0006R\u0013\u00108\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020:098BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006B"}, d2 = {"Lru/cyberity/cbr/core/CBRMobileSDK;", "Lru/cyberity/cbr/core/MobileSdk;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "Lkotlin/G0;", "shutdown", "Lru/cyberity/cbr/core/CBRMobileSDK$SDK;", "sdk", "start", "(Lru/cyberity/cbr/core/CBRMobileSDK$SDK;)V", "initLogger", "initFeatures", "_sdk", "Lru/cyberity/cbr/core/CBRMobileSDK$SDK;", "Lru/cyberity/log/logger/Logger;", "<set-?>", "logTree", "Lru/cyberity/log/logger/Logger;", "getLogTree", "()Lru/cyberity/log/logger/Logger;", "", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "I", "getTheme", "()I", "Lru/cyberity/cbr/core/data/listener/CBREventHandler;", "getEventHandler", "()Lru/cyberity/cbr/core/data/listener/CBREventHandler;", "eventHandler", "", "isDebug", "()Z", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "locale", "getPackageName", "packageName", "Lru/cyberity/cbr/core/data/model/CBRSDKState;", "getState", "()Lru/cyberity/cbr/core/data/model/CBRSDKState;", VoiceInfo.STATE, "Lru/cyberity/cbr/core/data/listener/CBRUrlHandler;", "getUrlHandler", "()Lru/cyberity/cbr/core/data/listener/CBRUrlHandler;", "urlHandler", "getVersionCode", "versionCode", "getVersionName", "versionName", "Lru/cyberity/cbr/core/data/listener/CBRCompleteHandler;", "getCompleteHandler", "()Lru/cyberity/cbr/core/data/listener/CBRCompleteHandler;", "completeHandler", "", "Lru/cyberity/cbr/core/CBRModule;", "getModules", "()Ljava/util/List;", "modules", "Builder", "CBRExceptionHandler", "CBRSDK", "SDK", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRMobileSDK implements MobileSdk {

    @k
    public static final CBRMobileSDK INSTANCE = new CBRMobileSDK();

    @l
    private static SDK _sdk;

    @k
    private static Logger logTree;
    private static int theme;
    private final /* synthetic */ n0 $$delegate_0 = n0.f432787a;

    /* compiled from: CBRMobileSDK.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/cyberity/cbr/core/theme/CBRJsonCustomizationImpl;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.CBRMobileSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends N implements Y41.a<CBRJsonCustomizationImpl> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // Y41.a
        @k
        public final CBRJsonCustomizationImpl invoke() {
            return new CBRJsonCustomizationImpl();
        }
    }

    /* compiled from: CBRMobileSDK.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/cyberity/cbr/core/data/listener/CBRActionResultHandler;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.CBRMobileSDK$10, reason: invalid class name */
    public static final class AnonymousClass10 extends N implements Y41.a<CBRActionResultHandler> {
        public static final AnonymousClass10 INSTANCE = new AnonymousClass10();

        public AnonymousClass10() {
            super(0);
        }

        @Override // Y41.a
        @l
        public final CBRActionResultHandler invoke() {
            SDK sdk = CBRMobileSDK._sdk;
            if (sdk != null) {
                return sdk.getActionResultHandler();
            }
            return null;
        }
    }

    /* compiled from: CBRMobileSDK.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lru/cyberity/cbr/core/CBRModule;", "name", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.CBRMobileSDK$11, reason: invalid class name */
    public static final class AnonymousClass11 extends N implements Y41.l<String, CBRModule> {
        public static final AnonymousClass11 INSTANCE = new AnonymousClass11();

        public AnonymousClass11() {
            super(1);
        }

        @Override // Y41.l
        @l
        public final CBRModule invoke(@k String str) {
            Object objPrevious;
            List modules = CBRMobileSDK.INSTANCE.getModules();
            ListIterator listIterator = modules.listIterator(modules.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                if (((CBRModule) objPrevious).getClass().getName().equals(str)) {
                    break;
                }
            }
            return (CBRModule) objPrevious;
        }
    }

    /* compiled from: CBRMobileSDK.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/cyberity/cbr/core/data/listener/CBRIconHandler;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.CBRMobileSDK$12, reason: invalid class name */
    public static final class AnonymousClass12 extends N implements Y41.a<CBRIconHandler> {
        public static final AnonymousClass12 INSTANCE = new AnonymousClass12();

        public AnonymousClass12() {
            super(0);
        }

        @Override // Y41.a
        @k
        public final CBRIconHandler invoke() {
            CBRIconHandler iconHandler;
            SDK sdk = CBRMobileSDK._sdk;
            return (sdk == null || (iconHandler = sdk.getIconHandler()) == null) ? new CBRDefaultIconHandler() : iconHandler;
        }
    }

    /* compiled from: CBRMobileSDK.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.CBRMobileSDK$13, reason: invalid class name */
    public static final class AnonymousClass13 extends N implements Y41.a<CBRCountryPicker> {
        public static final AnonymousClass13 INSTANCE = new AnonymousClass13();

        public AnonymousClass13() {
            super(0);
        }

        @Override // Y41.a
        @k
        public final CBRCountryPicker invoke() {
            CBRCountryPicker countryPicker;
            SDK sdk = CBRMobileSDK._sdk;
            return (sdk == null || (countryPicker = sdk.getCountryPicker()) == null) ? new CBRDefaultCountryPicker() : countryPicker;
        }
    }

    /* compiled from: CBRMobileSDK.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lru/cyberity/cbr/core/data/model/CBRDocumentDefinition;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.CBRMobileSDK$14, reason: invalid class name */
    public static final class AnonymousClass14 extends N implements Y41.a<Map<String, ? extends CBRDocumentDefinition>> {
        public static final AnonymousClass14 INSTANCE = new AnonymousClass14();

        public AnonymousClass14() {
            super(0);
        }

        @Override // Y41.a
        @l
        public final Map<String, ? extends CBRDocumentDefinition> invoke() {
            SDK sdk = CBRMobileSDK._sdk;
            if (sdk != null) {
                return sdk.getPreferredDocumentsDefinitions$cyberity_mobile_sdk_release();
            }
            return null;
        }
    }

    /* compiled from: CBRMobileSDK.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.CBRMobileSDK$15, reason: invalid class name */
    public static final class AnonymousClass15 extends N implements Y41.a<Integer> {
        public static final AnonymousClass15 INSTANCE = new AnonymousClass15();

        public AnonymousClass15() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // Y41.a
        @l
        public final Integer invoke() {
            SDK sdk = CBRMobileSDK._sdk;
            if (sdk != null) {
                return sdk.getAutoCloseOnApproveTimeout();
            }
            return null;
        }
    }

    /* compiled from: CBRMobileSDK.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/cyberity/cbr/core/data/listener/CBRUrlHandler;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.CBRMobileSDK$16, reason: invalid class name */
    public static final class AnonymousClass16 extends N implements Y41.a<CBRUrlHandler> {
        public static final AnonymousClass16 INSTANCE = new AnonymousClass16();

        public AnonymousClass16() {
            super(0);
        }

        @Override // Y41.a
        @l
        public final CBRUrlHandler invoke() {
            SDK sdk = CBRMobileSDK._sdk;
            if (sdk != null) {
                return sdk.getCbrUrlHandler();
            }
            return null;
        }
    }

    /* compiled from: CBRMobileSDK.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/cyberity/cbr/core/data/model/CBRSupportItem;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.CBRMobileSDK$17, reason: invalid class name */
    public static final class AnonymousClass17 extends N implements Y41.a<List<? extends CBRSupportItem>> {
        public static final AnonymousClass17 INSTANCE = new AnonymousClass17();

        public AnonymousClass17() {
            super(0);
        }

        @Override // Y41.a
        @l
        public final List<? extends CBRSupportItem> invoke() {
            SDK sdk = CBRMobileSDK._sdk;
            if (sdk != null) {
                return sdk.getSupportItems$cyberity_mobile_sdk_release();
            }
            return null;
        }
    }

    /* compiled from: CBRMobileSDK.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lru/cyberity/cbr/core/data/model/CBRSupportItem;", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.CBRMobileSDK$18, reason: invalid class name */
    public static final class AnonymousClass18 extends N implements Y41.l<List<? extends CBRSupportItem>, G0> {
        public static final AnonymousClass18 INSTANCE = new AnonymousClass18();

        public AnonymousClass18() {
            super(1);
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(List<? extends CBRSupportItem> list) {
            invoke2((List<CBRSupportItem>) list);
            return G0.f406611a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@l List<CBRSupportItem> list) {
            SDK sdk = CBRMobileSDK._sdk;
            if (sdk == null) {
                return;
            }
            sdk.setSupportItems$cyberity_mobile_sdk_release(list);
        }
    }

    /* compiled from: CBRMobileSDK.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lru/cyberity/cbr/core/analytics/Screen;", "it", "Landroidx/fragment/app/Fragment;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.CBRMobileSDK$19, reason: invalid class name */
    public static final class AnonymousClass19 extends N implements Y41.l<Fragment, Screen> {
        public static final AnonymousClass19 INSTANCE = new AnonymousClass19();

        public AnonymousClass19() {
            super(1);
        }

        @Override // Y41.l
        @l
        public final Screen invoke(@k Fragment fragment) {
            return AnalyticMapperKt.getScreenByFragment(fragment);
        }
    }

    /* compiled from: CBRMobileSDK.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/cyberity/cbr/core/data/model/CBRInitConfig;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.CBRMobileSDK$2, reason: invalid class name */
    public static final class AnonymousClass2 extends N implements Y41.a<CBRInitConfig> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // Y41.a
        @l
        public final CBRInitConfig invoke() {
            SDK sdk = CBRMobileSDK._sdk;
            if (sdk != null) {
                return sdk.getConf();
            }
            return null;
        }
    }

    /* compiled from: CBRMobileSDK.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.CBRMobileSDK$3, reason: invalid class name */
    public static final class AnonymousClass3 extends N implements Y41.a<Map<String, ? extends String>> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        @Override // Y41.a
        @l
        public final Map<String, ? extends String> invoke() {
            SDK sdk = CBRMobileSDK._sdk;
            if (sdk != null) {
                return sdk.getSettings$cyberity_mobile_sdk_release();
            }
            return null;
        }
    }

    /* compiled from: CBRMobileSDK.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/cyberity/cbr/core/data/listener/TokenExpirationHandler;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.CBRMobileSDK$4, reason: invalid class name */
    public static final class AnonymousClass4 extends N implements Y41.a<TokenExpirationHandler> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(0);
        }

        @Override // Y41.a
        @l
        public final TokenExpirationHandler invoke() {
            SDK sdk = CBRMobileSDK._sdk;
            if (sdk != null) {
                return sdk.getOnTokenExpiration();
            }
            return null;
        }
    }

    /* compiled from: CBRMobileSDK.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/cyberity/cbr/core/data/listener/CBRStateChangedHandler;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.CBRMobileSDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends N implements Y41.a<CBRStateChangedHandler> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        @Override // Y41.a
        @l
        public final CBRStateChangedHandler invoke() {
            SDK sdk = CBRMobileSDK._sdk;
            CBRSDK cbrsdk = sdk instanceof CBRSDK ? (CBRSDK) sdk : null;
            if (cbrsdk != null) {
                return cbrsdk.getStateChangedHandler();
            }
            return null;
        }
    }

    /* compiled from: CBRMobileSDK.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/cyberity/cbr/core/data/listener/CBRErrorHandler;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.CBRMobileSDK$6, reason: invalid class name */
    public static final class AnonymousClass6 extends N implements Y41.a<CBRErrorHandler> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        public AnonymousClass6() {
            super(0);
        }

        @Override // Y41.a
        @l
        public final CBRErrorHandler invoke() {
            SDK sdk = CBRMobileSDK._sdk;
            if (sdk != null) {
                return sdk.getErrorHandler();
            }
            return null;
        }
    }

    /* compiled from: CBRMobileSDK.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/cyberity/cbr/core/data/listener/CBREventHandler;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.CBRMobileSDK$7, reason: invalid class name */
    public static final class AnonymousClass7 extends N implements Y41.a<CBREventHandler> {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        public AnonymousClass7() {
            super(0);
        }

        @Override // Y41.a
        @l
        public final CBREventHandler invoke() {
            SDK sdk = CBRMobileSDK._sdk;
            if (sdk != null) {
                return sdk.getEventHandler();
            }
            return null;
        }
    }

    /* compiled from: CBRMobileSDK.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/cyberity/cbr/core/theme/CBRJsonCustomization;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.CBRMobileSDK$8, reason: invalid class name */
    public static final class AnonymousClass8 extends N implements Y41.a<CBRJsonCustomization> {
        public static final AnonymousClass8 INSTANCE = new AnonymousClass8();

        public AnonymousClass8() {
            super(0);
        }

        @Override // Y41.a
        @l
        public final CBRJsonCustomization invoke() {
            SDK sdk = CBRMobileSDK._sdk;
            if (sdk != null) {
                return sdk.getCustomization();
            }
            return null;
        }
    }

    /* compiled from: CBRMobileSDK.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/cyberity/cbr/core/data/listener/CBRInstructionsViewHandler;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.CBRMobileSDK$9, reason: invalid class name */
    public static final class AnonymousClass9 extends N implements Y41.a<CBRInstructionsViewHandler> {
        public static final AnonymousClass9 INSTANCE = new AnonymousClass9();

        public AnonymousClass9() {
            super(0);
        }

        @Override // Y41.a
        @l
        public final CBRInstructionsViewHandler invoke() {
            SDK sdk = CBRMobileSDK._sdk;
            if (sdk != null) {
                return sdk.getInstructionsViewHandler();
            }
            return null;
        }
    }

    /* compiled from: CBRMobileSDK.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/cyberity/cbr/core/CBRMobileSDK$CBRExceptionHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "", "e", "Lru/cyberity/cbr/core/data/model/LogParams;", "prepareLogParams", "(Ljava/lang/Throwable;)Lru/cyberity/cbr/core/data/model/LogParams;", "ex", "", "isCyberityException", "(Ljava/lang/Throwable;)Z", "Ljava/lang/Thread;", "t", "Lkotlin/G0;", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lru/cyberity/log/cacher/c;", "sink", "Lru/cyberity/log/cacher/c;", "previousHandler", "Ljava/lang/Thread$UncaughtExceptionHandler;", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1})
    public static final class CBRExceptionHandler implements Thread.UncaughtExceptionHandler {

        @k
        private final Context context;

        @l
        private final Thread.UncaughtExceptionHandler previousHandler;

        @k
        private final ru.cyberity.log.cacher.c<LogParams> sink;

        private final boolean isCyberityException(Throwable ex2) {
            boolean z12 = false;
            if (ex2 == null) {
                return false;
            }
            StackTraceElement[] stackTrace = ex2.getStackTrace();
            int length = stackTrace.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (C43066x.h0(stackTrace[i12].getClassName(), "ru.cyberity", false)) {
                    z12 = true;
                    break;
                }
                i12++;
            }
            return !z12 ? isCyberityException(ex2.getCause()) : z12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final LogParams prepareLogParams(Throwable e12) {
            if (!isCyberityException(e12)) {
                return null;
            }
            StackTraceElement[] stackTrace = e12.getStackTrace();
            String string = this.context.getSharedPreferences("cyberity_mobile_sdk", 0).getString("applicant_id", "");
            String str = string == null ? "" : string;
            StringWriter stringWriter = new StringWriter();
            e12.printStackTrace(new PrintWriter(stringWriter));
            String strValueOf = String.valueOf(stackTrace[0].getLineNumber());
            String fileName = stackTrace[0].getFileName();
            String strI = H.i(':', fileName, strValueOf);
            String message = e12.getMessage();
            return new LogParams("uncaughtException", strI, (String) null, fileName, str, message == null ? "" : message, (String) null, stringWriter.toString(), 64, (C42822w) null);
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(@k Thread t12, @k Throwable e12) {
            try {
                C43259k.d(D0.f410691b, null, null, new CBRMobileSDK$CBRExceptionHandler$uncaughtException$1(this, e12, null), 3);
            } catch (Exception unused) {
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.previousHandler;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(t12, e12);
            }
        }
    }

    /* compiled from: CBRMobileSDK.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/cyberity/cbr/core/CBRMobileSDK$CBRSDK;", "Lru/cyberity/cbr/core/CBRMobileSDK$SDK;", "Lru/cyberity/cbr/core/CBRMobileSDK$Builder;", "builder", "<init>", "(Lru/cyberity/cbr/core/CBRMobileSDK$Builder;)V", "Lkotlin/G0;", "launch", "()V", "Lru/cyberity/cbr/core/data/listener/CBRStateChangedHandler;", "stateChangedHandler", "Lru/cyberity/cbr/core/data/listener/CBRStateChangedHandler;", "getStateChangedHandler$cyberity_mobile_sdk_release", "()Lru/cyberity/cbr/core/data/listener/CBRStateChangedHandler;", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class CBRSDK extends SDK {

        @l
        private final CBRStateChangedHandler stateChangedHandler;

        public CBRSDK(@k Builder builder) {
            super(builder);
            this.stateChangedHandler = builder.getStateChangedHandler();
        }

        @l
        /* renamed from: getStateChangedHandler$cyberity_mobile_sdk_release, reason: from getter */
        public final CBRStateChangedHandler getStateChangedHandler() {
            return this.stateChangedHandler;
        }

        @Override // ru.cyberity.cbr.core.CBRMobileSDK.SDK
        public void launch() {
            installUncaughtExceptionHandler$cyberity_mobile_sdk_release(getUrl());
            super.launch();
            CBRMobileSDK.INSTANCE.start(this);
        }
    }

    /* compiled from: CBRMobileSDK.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/cyberity/cbr/core/CBRModule;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.CBRMobileSDK$toString$1, reason: invalid class name and case insensitive filesystem */
    public static final class C478441 extends N implements Y41.l<CBRModule, CharSequence> {
        public static final C478441 INSTANCE = new C478441();

        public C478441() {
            super(1);
        }

        @Override // Y41.l
        @k
        public final CharSequence invoke(@k CBRModule cBRModule) {
            return cBRModule.getName();
        }
    }

    static {
        CBRJsonCustomization.INSTANCE.setDefaultJsonCustomizationProvider(AnonymousClass1.INSTANCE);
        n0 n0Var = n0.f432787a;
        n0Var.a(AnonymousClass2.INSTANCE, AnonymousClass3.INSTANCE, AnonymousClass4.INSTANCE, AnonymousClass5.INSTANCE, AnonymousClass6.INSTANCE, AnonymousClass7.INSTANCE, AnonymousClass8.INSTANCE, AnonymousClass9.INSTANCE, AnonymousClass10.INSTANCE, AnonymousClass11.INSTANCE, AnonymousClass12.INSTANCE, AnonymousClass13.INSTANCE, AnonymousClass14.INSTANCE, AnonymousClass15.INSTANCE, AnonymousClass16.INSTANCE);
        n0Var.a(AnonymousClass17.INSTANCE, AnonymousClass18.INSTANCE);
        CBRAnalyticsScreenMapper.INSTANCE.addMapping(AnonymousClass19.INSTANCE);
        logTree = ru.cyberity.log.logger.d.f436106a;
        theme = R.style.Theme_CBRCore;
    }

    private CBRMobileSDK() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CBRModule> getModules() {
        List<CBRModule> modules$cyberity_mobile_sdk_release;
        SDK sdk = _sdk;
        return (sdk == null || (modules$cyberity_mobile_sdk_release = sdk.getModules$cyberity_mobile_sdk_release()) == null) ? C42784z0.f406748b : modules$cyberity_mobile_sdk_release;
    }

    private final void initFeatures(SDK sdk) {
        ru.cyberity.ff.a.f435638a.x();
        for (CBRModule cBRModule : sdk.getModules$cyberity_mobile_sdk_release()) {
            if (cBRModule instanceof CBRProoface) {
                ru.cyberity.ff.a aVar = ru.cyberity.ff.a.f435638a;
                CBRProoface cBRProoface = (CBRProoface) cBRModule;
                ru.cyberity.ff.core.a.a(aVar.j(), cBRProoface.isDebug(), null, 2, null);
                ru.cyberity.ff.core.a.a(aVar.k(), cBRProoface.isShowSettingsDialog(), null, 2, null);
            }
            if (cBRModule instanceof CBRCoreModule) {
                ru.cyberity.ff.a aVar2 = ru.cyberity.ff.a.f435638a;
                CBRCoreModule cBRCoreModule = (CBRCoreModule) cBRModule;
                ru.cyberity.ff.core.a.a(aVar2.i(), cBRCoreModule.isFullScreenCamera(), null, 2, null);
                ru.cyberity.ff.core.a.a(aVar2.s(), cBRCoreModule.isSkipGeolocationForm(), null, 2, null);
            }
        }
    }

    private final void initLogger(SDK sdk) {
        ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
        aVar.a(sdk.getIsDebug());
        aVar.f();
        if (sdk.getIsDebug()) {
            if (sdk.getLogTree() instanceof ru.cyberity.log.logger.d) {
                aVar.a(LoggerType.LOG_CAT, sdk.getLogTree(), true);
            } else {
                aVar.a(LoggerType.LOG_CAT, ru.cyberity.log.logger.d.f436106a, true);
                aVar.a(LoggerType.SDK_CLIENT, sdk.getLogTree(), true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void start(SDK sdk) {
        CBRErrorHandler errorHandler;
        CBRJsonCustomization customization;
        Activity activity = sdk.getWeakActivity$cyberity_mobile_sdk_release().get();
        if (activity == null) {
            return;
        }
        initFeatures(sdk);
        initLogger(sdk);
        _sdk = sdk;
        n0.f432787a.a(sdk.getIsDebug(), sdk.getLocale());
        logTree = sdk.getLogTree();
        Integer theme2 = sdk.getTheme();
        theme = theme2 != null ? theme2.intValue() : theme;
        try {
            SDK sdk2 = _sdk;
            if (sdk2 != null && (customization = sdk2.getCustomization()) != null) {
                customization.loadResources(activity.getApplicationContext());
            }
            ru.cyberity.cbr.core.analytics.b.f432519a.a(sdk.getIsAnalyticsEnabled());
            Intent intent = new Intent();
            intent.setClassName(getPackageName(), "ru.cyberity.cbr.presentation.screen.CBRAppActivity");
            String url = sdk.getUrl();
            String accessToken = sdk.getAccessToken();
            if (accessToken == null) {
                accessToken = "";
            }
            intent.putExtra("sns_extra_session", new CBRSession(null, url, accessToken, getLocale(), isDebug(), getPackageName(), getVersionName(), getVersionCode(), sdk.getTheme(), 1, null));
            activity.startActivity(intent);
        } catch (Exception e12) {
            SDK sdk3 = _sdk;
            if (sdk3 != null && (errorHandler = sdk3.getErrorHandler()) != null) {
                errorHandler.onError(new CBRException.Unknown(e12));
            }
        }
        ru.cyberity.log.cacher.d.f436072a.b();
    }

    @l
    public final CBRCompleteHandler getCompleteHandler() {
        SDK sdk = _sdk;
        if (sdk != null) {
            return sdk.getCompleteHandler();
        }
        return null;
    }

    @l
    public CBREventHandler getEventHandler() {
        return this.$$delegate_0.getEventHandler();
    }

    @k
    public Locale getLocale() {
        return this.$$delegate_0.getLocale();
    }

    @k
    public String getPackageName() {
        return this.$$delegate_0.getPackageName();
    }

    @k
    public CBRSDKState getState() {
        return this.$$delegate_0.getState();
    }

    @l
    public CBRUrlHandler getUrlHandler() {
        return this.$$delegate_0.getUrlHandler();
    }

    public int getVersionCode() {
        return this.$$delegate_0.getVersionCode();
    }

    @k
    public String getVersionName() {
        return this.$$delegate_0.getVersionName();
    }

    public boolean isDebug() {
        return this.$$delegate_0.isDebug();
    }

    public final void shutdown() {
        ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
        aVar.flush();
        aVar.d();
        ru.cyberity.cbr.core.analytics.b.f432519a.j();
        ru.cyberity.log.cacher.d.f436072a.c();
        SDK sdk = _sdk;
        if (sdk != null) {
            sdk.removeUncaughtExceptionHandler$cyberity_mobile_sdk_release();
        }
        _sdk = null;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CBRMobileSDK: Api Url: ");
        SDK sdk = _sdk;
        sb2.append(sdk != null ? sdk.getUrl() : null);
        sb2.append(", Access Token: ");
        SDK sdk2 = _sdk;
        sb2.append(sdk2 != null ? sdk2.getAccessToken() : null);
        sb2.append(",Modules: ");
        sb2.append(getModules().isEmpty() ? "Empty" : C22026a.c(new StringBuilder("["), C42745f0.O(getModules(), null, null, null, C478441.INSTANCE, 31), ']'));
        sb2.append(", isDebug: ");
        sb2.append(isDebug());
        return sb2.toString();
    }

    /* compiled from: CBRMobileSDK.kt */
    @Metadata(d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJÉ\u0003\u00100\u001a\u00020\u00002%\b\u0002\u0010\u0014\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e2:\b\u0002\u0010\u0019\u001a4\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00152:\b\u0002\u0010\u001c\u001a4\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00152<\b\u0002\u0010 \u001a6\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001d\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00152%\b\u0002\u0010#\u001a\u001f\u0012\u0013\u0012\u00110!¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e2\u0097\u0001\b\u0002\u0010-\u001a\u0090\u0001\u0012\u0013\u0012\u00110%¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b('\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b((\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b()\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(*\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(+\u0012\u0006\u0012\u0004\u0018\u00010,\u0018\u00010$2\u001c\b\u0002\u0010/\u001a\u0016\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020.\u0018\u00010\u0015¢\u0006\u0004\b0\u00101J\u0015\u00104\u001a\u00020\u00002\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b6\u00107J\r\u00109\u001a\u000208¢\u0006\u0004\b9\u0010:R \u0010<\u001a\b\u0012\u0004\u0012\u00020\u00020;8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010CR(\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010@\u001a\u0004\u0018\u00010\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bD\u0010CR(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010@\u001a\u0004\u0018\u00010\n8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bF\u0010GR(\u0010I\u001a\u0004\u0018\u00010H2\b\u0010@\u001a\u0004\u0018\u00010H8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR(\u0010N\u001a\u0004\u0018\u00010M2\b\u0010@\u001a\u0004\u0018\u00010M8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR(\u0010S\u001a\u0004\u0018\u00010R2\b\u0010@\u001a\u0004\u0018\u00010R8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR(\u0010X\u001a\u0004\u0018\u00010W2\b\u0010@\u001a\u0004\u0018\u00010W8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R(\u0010]\u001a\u0004\u0018\u00010\\2\b\u0010@\u001a\u0004\u0018\u00010\\8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R$\u0010b\u001a\u0004\u0018\u00010a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR$\u0010i\u001a\u0004\u0018\u00010h8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR(\u0010p\u001a\u0004\u0018\u00010o2\b\u0010@\u001a\u0004\u0018\u00010o8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR$\u0010t\u001a\u00020.2\u0006\u0010@\u001a\u00020.8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR$\u0010y\u001a\u0004\u0018\u00010x8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R7\u0010\u0081\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u007f2\r\u0010@\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u007f8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R;\u0010\u0086\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0085\u0001\u0018\u00010\u007f2\u000f\u0010@\u001a\u000b\u0012\u0005\u0012\u00030\u0085\u0001\u0018\u00010\u007f8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0082\u0001\u001a\u0006\b\u0087\u0001\u0010\u0084\u0001R'\u0010\u0088\u0001\u001a\u00020.2\u0006\u0010@\u001a\u00020.8\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010u\u001a\u0005\b\u0089\u0001\u0010wR+\u0010\u008b\u0001\u001a\u00030\u008a\u00012\u0007\u0010@\u001a\u00030\u008a\u00018\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R+\u0010\u0090\u0001\u001a\u00030\u008f\u00012\u0007\u0010@\u001a\u00030\u008f\u00018\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R+\u00103\u001a\u0004\u0018\u0001022\b\u0010@\u001a\u0004\u0018\u0001028\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\b3\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R,\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R8\u0010\u009f\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u009e\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R9\u0010¦\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0005\u0012\u00030¥\u0001\u0018\u00010\u009e\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¦\u0001\u0010 \u0001\u001a\u0006\b§\u0001\u0010¢\u0001\"\u0006\b¨\u0001\u0010¤\u0001R+\u0010©\u0001\u001a\u0004\u0018\u0001028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b©\u0001\u0010\u0094\u0001\u001a\u0006\bª\u0001\u0010\u0096\u0001\"\u0006\b«\u0001\u0010¬\u0001R,\u0010®\u0001\u001a\u0005\u0018\u00010\u00ad\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001¨\u0006´\u0001"}, d2 = {"Lru/cyberity/cbr/core/CBRMobileSDK$Builder;", "", "Landroid/app/Activity;", "activity", "", ContextActionHandler.Link.URL, "<init>", "(Landroid/app/Activity;Ljava/lang/String;)V", "(Landroid/app/Activity;)V", "accessToken", "Lru/cyberity/cbr/core/data/listener/TokenExpirationHandler;", "onTokenExpiration", "withAccessToken", "(Ljava/lang/String;Lru/cyberity/cbr/core/data/listener/TokenExpirationHandler;)Lru/cyberity/cbr/core/CBRMobileSDK$Builder;", "Lkotlin/Function1;", "Lru/cyberity/cbr/core/data/model/CBRException;", "Lkotlin/S;", "name", "exception", "Lkotlin/G0;", "onError", "Lkotlin/Function2;", "Lru/cyberity/cbr/core/data/model/CBRSDKState;", VoiceInfo.STATE, "prevState", "onStateChanged", "Lru/cyberity/cbr/core/data/model/CBRCompletionResult;", "result", "onCompleted", "actionId", "answer", "Lru/cyberity/cbr/core/CBRActionResult;", "onActionResult", "Lru/cyberity/cbr/core/data/listener/CBREvent;", "event", "onEvent", "Lkotlin/Function6;", "Landroid/content/Context;", "context", "verificationStep", "idDocumentType", "scene", "position", "countryCode", "Landroid/view/View;", "onCBRInstructionsView", "", "onUrl", "withHandlers", "(LY41/l;LY41/p;LY41/p;LY41/p;LY41/l;LY41/t;LY41/p;)Lru/cyberity/cbr/core/CBRMobileSDK$Builder;", "", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "withTheme", "(I)Lru/cyberity/cbr/core/CBRMobileSDK$Builder;", "withBaseUrl", "(Ljava/lang/String;)Lru/cyberity/cbr/core/CBRMobileSDK$Builder;", "Lru/cyberity/cbr/core/CBRMobileSDK$SDK;", "build", "()Lru/cyberity/cbr/core/CBRMobileSDK$SDK;", "Ljava/lang/ref/WeakReference;", "weakActivity", "Ljava/lang/ref/WeakReference;", "getWeakActivity$cyberity_mobile_sdk_release", "()Ljava/lang/ref/WeakReference;", "<set-?>", "Ljava/lang/String;", "getUrl$cyberity_mobile_sdk_release", "()Ljava/lang/String;", "getAccessToken$cyberity_mobile_sdk_release", "Lru/cyberity/cbr/core/data/listener/TokenExpirationHandler;", "getOnTokenExpiration$cyberity_mobile_sdk_release", "()Lru/cyberity/cbr/core/data/listener/TokenExpirationHandler;", "Lru/cyberity/cbr/core/data/listener/CBRStateChangedHandler;", "stateChangedHandler", "Lru/cyberity/cbr/core/data/listener/CBRStateChangedHandler;", "getStateChangedHandler$cyberity_mobile_sdk_release", "()Lru/cyberity/cbr/core/data/listener/CBRStateChangedHandler;", "Lru/cyberity/cbr/core/data/listener/CBRCompleteHandler;", "completeHandler", "Lru/cyberity/cbr/core/data/listener/CBRCompleteHandler;", "getCompleteHandler$cyberity_mobile_sdk_release", "()Lru/cyberity/cbr/core/data/listener/CBRCompleteHandler;", "Lru/cyberity/cbr/core/data/listener/CBRErrorHandler;", "errorHandler", "Lru/cyberity/cbr/core/data/listener/CBRErrorHandler;", "getErrorHandler$cyberity_mobile_sdk_release", "()Lru/cyberity/cbr/core/data/listener/CBRErrorHandler;", "Lru/cyberity/cbr/core/data/listener/CBRActionResultHandler;", "actionResultHandler", "Lru/cyberity/cbr/core/data/listener/CBRActionResultHandler;", "getActionResultHandler$cyberity_mobile_sdk_release", "()Lru/cyberity/cbr/core/data/listener/CBRActionResultHandler;", "Lru/cyberity/cbr/core/data/listener/CBREventHandler;", "eventHandler", "Lru/cyberity/cbr/core/data/listener/CBREventHandler;", "getEventHandler$cyberity_mobile_sdk_release", "()Lru/cyberity/cbr/core/data/listener/CBREventHandler;", "Lru/cyberity/cbr/core/data/listener/CBRInstructionsViewHandler;", "instructionsHandler", "Lru/cyberity/cbr/core/data/listener/CBRInstructionsViewHandler;", "getInstructionsHandler$cyberity_mobile_sdk_release", "()Lru/cyberity/cbr/core/data/listener/CBRInstructionsViewHandler;", "setInstructionsHandler$cyberity_mobile_sdk_release", "(Lru/cyberity/cbr/core/data/listener/CBRInstructionsViewHandler;)V", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker;", "countryPicker", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker;", "getCountryPicker$cyberity_mobile_sdk_release", "()Lru/cyberity/cbr/core/data/listener/CBRCountryPicker;", "setCountryPicker$cyberity_mobile_sdk_release", "(Lru/cyberity/cbr/core/data/listener/CBRCountryPicker;)V", "Lru/cyberity/cbr/core/data/model/CBRInitConfig;", "conf", "Lru/cyberity/cbr/core/data/model/CBRInitConfig;", "getConf$cyberity_mobile_sdk_release", "()Lru/cyberity/cbr/core/data/model/CBRInitConfig;", "isAnalyticsEnabled", "Z", "isAnalyticsEnabled$cyberity_mobile_sdk_release", "()Z", "Lru/cyberity/cbr/core/data/listener/CBRIconHandler;", "iconHandler", "Lru/cyberity/cbr/core/data/listener/CBRIconHandler;", "getIconHandler$cyberity_mobile_sdk_release", "()Lru/cyberity/cbr/core/data/listener/CBRIconHandler;", "setIconHandler$cyberity_mobile_sdk_release", "(Lru/cyberity/cbr/core/data/listener/CBRIconHandler;)V", "", "Lru/cyberity/cbr/core/CBRModule;", "modules", "Ljava/util/List;", "getModules$cyberity_mobile_sdk_release", "()Ljava/util/List;", "Lru/cyberity/cbr/core/data/model/CBRSupportItem;", "supportItems", "getSupportItems$cyberity_mobile_sdk_release", "isDebug", "isDebug$cyberity_mobile_sdk_release", "Lru/cyberity/log/logger/Logger;", "logTree", "Lru/cyberity/log/logger/Logger;", "getLogTree$cyberity_mobile_sdk_release", "()Lru/cyberity/log/logger/Logger;", "Ljava/util/Locale;", "locale", "Ljava/util/Locale;", "getLocale$cyberity_mobile_sdk_release", "()Ljava/util/Locale;", "Ljava/lang/Integer;", "getTheme$cyberity_mobile_sdk_release", "()Ljava/lang/Integer;", "Lru/cyberity/cbr/core/theme/CBRJsonCustomization;", "customization", "Lru/cyberity/cbr/core/theme/CBRJsonCustomization;", "getCustomization$cyberity_mobile_sdk_release", "()Lru/cyberity/cbr/core/theme/CBRJsonCustomization;", "setCustomization$cyberity_mobile_sdk_release", "(Lru/cyberity/cbr/core/theme/CBRJsonCustomization;)V", "", "settings", "Ljava/util/Map;", "getSettings$cyberity_mobile_sdk_release", "()Ljava/util/Map;", "setSettings$cyberity_mobile_sdk_release", "(Ljava/util/Map;)V", "Lru/cyberity/cbr/core/data/model/CBRDocumentDefinition;", "preferredDocumentsDefinitions", "getPreferredDocumentsDefinitions$cyberity_mobile_sdk_release", "setPreferredDocumentsDefinitions$cyberity_mobile_sdk_release", "autoCloseOnApproveTimeout", "getAutoCloseOnApproveTimeout$cyberity_mobile_sdk_release", "setAutoCloseOnApproveTimeout$cyberity_mobile_sdk_release", "(Ljava/lang/Integer;)V", "Lru/cyberity/cbr/core/data/listener/CBRUrlHandler;", "urlHandler", "Lru/cyberity/cbr/core/data/listener/CBRUrlHandler;", "getUrlHandler$cyberity_mobile_sdk_release", "()Lru/cyberity/cbr/core/data/listener/CBRUrlHandler;", "setUrlHandler$cyberity_mobile_sdk_release", "(Lru/cyberity/cbr/core/data/listener/CBRUrlHandler;)V", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        @l
        private String accessToken;

        @l
        private CBRActionResultHandler actionResultHandler;

        @l
        private Integer autoCloseOnApproveTimeout;

        @l
        private CBRCompleteHandler completeHandler;

        @l
        private CBRInitConfig conf;

        @l
        private CBRCountryPicker countryPicker;

        @l
        private CBRJsonCustomization customization;

        @l
        private CBRErrorHandler errorHandler;

        @l
        private CBREventHandler eventHandler;

        @l
        private CBRIconHandler iconHandler;

        @l
        private CBRInstructionsViewHandler instructionsHandler;
        private boolean isAnalyticsEnabled;
        private boolean isDebug;

        @k
        private Locale locale;

        @k
        private Logger logTree;

        @k
        private List<? extends CBRModule> modules;

        @l
        private TokenExpirationHandler onTokenExpiration;

        @l
        private Map<String, CBRDocumentDefinition> preferredDocumentsDefinitions;

        @l
        private Map<String, String> settings;

        @l
        private CBRStateChangedHandler stateChangedHandler;

        @l
        private List<CBRSupportItem> supportItems;

        @l
        private Integer theme;

        @k
        private String url;

        @l
        private CBRUrlHandler urlHandler;

        @k
        private final WeakReference<Activity> weakActivity;

        public Builder(@k Activity activity, @l String str) {
            CBRMobileSDK.INSTANCE.isDebug();
            this.weakActivity = new WeakReference<>(activity);
            this.url = str == null ? "https://api.cyberity.ru/" : str;
            this.isAnalyticsEnabled = true;
            this.iconHandler = new CBRDefaultIconHandler();
            this.modules = C42784z0.f406748b;
            this.logTree = ru.cyberity.log.logger.d.f436106a;
            this.locale = s.a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder withHandlers$default(Builder builder, Y41.l lVar, p pVar, p pVar2, p pVar3, Y41.l lVar2, t tVar, p pVar4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                lVar = null;
            }
            if ((i12 & 2) != 0) {
                pVar = null;
            }
            if ((i12 & 4) != 0) {
                pVar2 = null;
            }
            if ((i12 & 8) != 0) {
                pVar3 = null;
            }
            if ((i12 & 16) != 0) {
                lVar2 = null;
            }
            if ((i12 & 32) != 0) {
                tVar = null;
            }
            if ((i12 & 64) != 0) {
                pVar4 = null;
            }
            return builder.withHandlers(lVar, pVar, pVar2, pVar3, lVar2, tVar, pVar4);
        }

        @k
        public final SDK build() {
            return new CBRSDK(this);
        }

        @l
        /* renamed from: getAccessToken$cyberity_mobile_sdk_release, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }

        @l
        /* renamed from: getActionResultHandler$cyberity_mobile_sdk_release, reason: from getter */
        public final CBRActionResultHandler getActionResultHandler() {
            return this.actionResultHandler;
        }

        @l
        /* renamed from: getAutoCloseOnApproveTimeout$cyberity_mobile_sdk_release, reason: from getter */
        public final Integer getAutoCloseOnApproveTimeout() {
            return this.autoCloseOnApproveTimeout;
        }

        @l
        /* renamed from: getCompleteHandler$cyberity_mobile_sdk_release, reason: from getter */
        public final CBRCompleteHandler getCompleteHandler() {
            return this.completeHandler;
        }

        @l
        /* renamed from: getConf$cyberity_mobile_sdk_release, reason: from getter */
        public final CBRInitConfig getConf() {
            return this.conf;
        }

        @l
        /* renamed from: getCountryPicker$cyberity_mobile_sdk_release, reason: from getter */
        public final CBRCountryPicker getCountryPicker() {
            return this.countryPicker;
        }

        @l
        /* renamed from: getCustomization$cyberity_mobile_sdk_release, reason: from getter */
        public final CBRJsonCustomization getCustomization() {
            return this.customization;
        }

        @l
        /* renamed from: getErrorHandler$cyberity_mobile_sdk_release, reason: from getter */
        public final CBRErrorHandler getErrorHandler() {
            return this.errorHandler;
        }

        @l
        /* renamed from: getEventHandler$cyberity_mobile_sdk_release, reason: from getter */
        public final CBREventHandler getEventHandler() {
            return this.eventHandler;
        }

        @l
        /* renamed from: getIconHandler$cyberity_mobile_sdk_release, reason: from getter */
        public final CBRIconHandler getIconHandler() {
            return this.iconHandler;
        }

        @l
        /* renamed from: getInstructionsHandler$cyberity_mobile_sdk_release, reason: from getter */
        public final CBRInstructionsViewHandler getInstructionsHandler() {
            return this.instructionsHandler;
        }

        @k
        /* renamed from: getLocale$cyberity_mobile_sdk_release, reason: from getter */
        public final Locale getLocale() {
            return this.locale;
        }

        @k
        /* renamed from: getLogTree$cyberity_mobile_sdk_release, reason: from getter */
        public final Logger getLogTree() {
            return this.logTree;
        }

        @k
        public final List<CBRModule> getModules$cyberity_mobile_sdk_release() {
            return this.modules;
        }

        @l
        /* renamed from: getOnTokenExpiration$cyberity_mobile_sdk_release, reason: from getter */
        public final TokenExpirationHandler getOnTokenExpiration() {
            return this.onTokenExpiration;
        }

        @l
        public final Map<String, CBRDocumentDefinition> getPreferredDocumentsDefinitions$cyberity_mobile_sdk_release() {
            return this.preferredDocumentsDefinitions;
        }

        @l
        public final Map<String, String> getSettings$cyberity_mobile_sdk_release() {
            return this.settings;
        }

        @l
        /* renamed from: getStateChangedHandler$cyberity_mobile_sdk_release, reason: from getter */
        public final CBRStateChangedHandler getStateChangedHandler() {
            return this.stateChangedHandler;
        }

        @l
        public final List<CBRSupportItem> getSupportItems$cyberity_mobile_sdk_release() {
            return this.supportItems;
        }

        @l
        /* renamed from: getTheme$cyberity_mobile_sdk_release, reason: from getter */
        public final Integer getTheme() {
            return this.theme;
        }

        @k
        /* renamed from: getUrl$cyberity_mobile_sdk_release, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @l
        /* renamed from: getUrlHandler$cyberity_mobile_sdk_release, reason: from getter */
        public final CBRUrlHandler getUrlHandler() {
            return this.urlHandler;
        }

        @k
        public final WeakReference<Activity> getWeakActivity$cyberity_mobile_sdk_release() {
            return this.weakActivity;
        }

        /* renamed from: isAnalyticsEnabled$cyberity_mobile_sdk_release, reason: from getter */
        public final boolean getIsAnalyticsEnabled() {
            return this.isAnalyticsEnabled;
        }

        /* renamed from: isDebug$cyberity_mobile_sdk_release, reason: from getter */
        public final boolean getIsDebug() {
            return this.isDebug;
        }

        @k
        public final Builder withAccessToken(@l String accessToken, @k TokenExpirationHandler onTokenExpiration) {
            this.accessToken = accessToken;
            this.onTokenExpiration = onTokenExpiration;
            return this;
        }

        @k
        public final Builder withBaseUrl(@k String url) {
            this.url = url;
            return this;
        }

        @k
        public final Builder withHandlers(@l final Y41.l<? super CBRException, G0> onError, @l final p<? super CBRSDKState, ? super CBRSDKState, G0> onStateChanged, @l final p<? super CBRCompletionResult, ? super CBRSDKState, G0> onCompleted, @l final p<? super String, ? super String, ? extends CBRActionResult> onActionResult, @l final Y41.l<? super CBREvent, G0> onEvent, @l final t<? super Context, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends View> onCBRInstructionsView, @l final p<? super Context, ? super String, Boolean> onUrl) {
            this.errorHandler = onError != null ? new CBRErrorHandler() { // from class: ru.cyberity.cbr.core.CBRMobileSDK$Builder$withHandlers$1$1$1
                @Override // ru.cyberity.cbr.core.data.listener.CBRErrorHandler
                public void onError(@k CBRException exception) {
                    onError.invoke(exception);
                }
            } : null;
            this.stateChangedHandler = onStateChanged != null ? new CBRStateChangedHandler() { // from class: ru.cyberity.cbr.core.CBRMobileSDK$Builder$withHandlers$1$2$1
                @Override // ru.cyberity.cbr.core.data.listener.CBRStateChangedHandler
                public void onStateChanged(@k CBRSDKState previousState, @k CBRSDKState currentState) {
                    onStateChanged.invoke(currentState, previousState);
                }
            } : null;
            this.completeHandler = onCompleted != null ? new CBRCompleteHandler() { // from class: ru.cyberity.cbr.core.CBRMobileSDK$Builder$withHandlers$1$3$1
                @Override // ru.cyberity.cbr.core.data.listener.CBRCompleteHandler
                public void onComplete(@k CBRCompletionResult result, @k CBRSDKState state) {
                    onCompleted.invoke(result, state);
                }
            } : null;
            this.actionResultHandler = onActionResult != null ? new CBRActionResultHandler() { // from class: ru.cyberity.cbr.core.CBRMobileSDK$Builder$withHandlers$1$4$1
                @Override // ru.cyberity.cbr.core.data.listener.CBRActionResultHandler
                @k
                public CBRActionResult onActionResult(@k String actionId, @k String actionType, @l String answer, boolean allowContinuing) {
                    return onActionResult.invoke(actionId, answer);
                }
            } : null;
            this.eventHandler = onEvent != null ? new CBREventHandler() { // from class: ru.cyberity.cbr.core.CBRMobileSDK$Builder$withHandlers$1$5$1
                @Override // ru.cyberity.cbr.core.data.listener.CBREventHandler
                public void onEvent(@k CBREvent event) {
                    onEvent.invoke(event);
                }
            } : null;
            this.instructionsHandler = onCBRInstructionsView != null ? new CBRInstructionsViewHandler() { // from class: ru.cyberity.cbr.core.CBRMobileSDK$Builder$withHandlers$1$6$1
                @Override // ru.cyberity.cbr.core.data.listener.CBRInstructionsViewHandler
                @l
                public View onVerificationStep(@k Context context, @k String verificationStep, @l String idDocumentType, @k String scene, @l String position, @l String countryCode) {
                    return onCBRInstructionsView.invoke(context, verificationStep, idDocumentType, scene, position, countryCode);
                }
            } : null;
            this.urlHandler = onUrl != null ? new CBRUrlHandler() { // from class: ru.cyberity.cbr.core.CBRMobileSDK$Builder$withHandlers$1$7$1
                @Override // ru.cyberity.cbr.core.data.listener.CBRUrlHandler
                public boolean onUrl(@k Context context, @k String url) {
                    return onUrl.invoke(context, url).booleanValue();
                }
            } : null;
            return this;
        }

        @k
        public final Builder withTheme(int theme) {
            this.theme = Integer.valueOf(theme);
            return this;
        }

        public Builder(@k Activity activity) {
            this(activity, null);
        }
    }

    /* compiled from: CBRMobileSDK.kt */
    @Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000f\u0010\bJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d\"\u0004\b \u0010\rR \u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0013R*\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010#\u001a\u0004\b'\u0010\u0013\"\u0004\b(\u0010)R\u001c\u0010+\u001a\u0004\u0018\u00010*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u00100\u001a\u0004\u0018\u00010/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u00105\u001a\u0004\u0018\u0001048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001c\u0010:\u001a\u0004\u0018\u0001098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010?\u001a\u0004\u0018\u00010>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010D\u001a\u0004\u0018\u00010C8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001c\u0010I\u001a\u0004\u0018\u00010H8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001c\u0010N\u001a\u0004\u0018\u00010M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010S\u001a\u00020R8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010W\u001a\u00020R8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u0010T\u001a\u0004\bX\u0010VR\u001a\u0010Z\u001a\u00020Y8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001a\u0010_\u001a\u00020^8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001c\u0010d\u001a\u0004\u0018\u00010c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u001c\u0010i\u001a\u0004\u0018\u00010h8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u001c\u0010n\u001a\u0004\u0018\u00010m8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR(\u0010s\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR(\u0010x\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020w\u0018\u00010r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bx\u0010t\u001a\u0004\by\u0010vR\u001c\u0010z\u001a\u0004\u0018\u00010h8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bz\u0010j\u001a\u0004\b{\u0010lR\u001d\u0010}\u001a\u0004\u0018\u00010|8\u0000X\u0080\u0004¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001c\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0084\u0001"}, d2 = {"Lru/cyberity/cbr/core/CBRMobileSDK$SDK;", "", "Lru/cyberity/cbr/core/CBRMobileSDK$Builder;", "builder", "<init>", "(Lru/cyberity/cbr/core/CBRMobileSDK$Builder;)V", "Lkotlin/G0;", "launch", "()V", "dismiss", "", "apiUrl", "installUncaughtExceptionHandler$cyberity_mobile_sdk_release", "(Ljava/lang/String;)V", "installUncaughtExceptionHandler", "removeUncaughtExceptionHandler$cyberity_mobile_sdk_release", "removeUncaughtExceptionHandler", "", "isParametersValid", "()Ljava/util/List;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "weakActivity", "Ljava/lang/ref/WeakReference;", "getWeakActivity$cyberity_mobile_sdk_release", "()Ljava/lang/ref/WeakReference;", ContextActionHandler.Link.URL, "Ljava/lang/String;", "getUrl$cyberity_mobile_sdk_release", "()Ljava/lang/String;", "accessToken", "getAccessToken$cyberity_mobile_sdk_release", "setAccessToken$cyberity_mobile_sdk_release", "Lru/cyberity/cbr/core/CBRModule;", "modules", "Ljava/util/List;", "getModules$cyberity_mobile_sdk_release", "Lru/cyberity/cbr/core/data/model/CBRSupportItem;", "supportItems", "getSupportItems$cyberity_mobile_sdk_release", "setSupportItems$cyberity_mobile_sdk_release", "(Ljava/util/List;)V", "Lru/cyberity/cbr/core/data/listener/TokenExpirationHandler;", "onTokenExpiration", "Lru/cyberity/cbr/core/data/listener/TokenExpirationHandler;", "getOnTokenExpiration$cyberity_mobile_sdk_release", "()Lru/cyberity/cbr/core/data/listener/TokenExpirationHandler;", "Lru/cyberity/cbr/core/data/listener/CBRCompleteHandler;", "completeHandler", "Lru/cyberity/cbr/core/data/listener/CBRCompleteHandler;", "getCompleteHandler$cyberity_mobile_sdk_release", "()Lru/cyberity/cbr/core/data/listener/CBRCompleteHandler;", "Lru/cyberity/cbr/core/data/listener/CBRErrorHandler;", "errorHandler", "Lru/cyberity/cbr/core/data/listener/CBRErrorHandler;", "getErrorHandler$cyberity_mobile_sdk_release", "()Lru/cyberity/cbr/core/data/listener/CBRErrorHandler;", "Lru/cyberity/cbr/core/data/listener/CBRActionResultHandler;", "actionResultHandler", "Lru/cyberity/cbr/core/data/listener/CBRActionResultHandler;", "getActionResultHandler$cyberity_mobile_sdk_release", "()Lru/cyberity/cbr/core/data/listener/CBRActionResultHandler;", "Lru/cyberity/cbr/core/data/listener/CBREventHandler;", "eventHandler", "Lru/cyberity/cbr/core/data/listener/CBREventHandler;", "getEventHandler$cyberity_mobile_sdk_release", "()Lru/cyberity/cbr/core/data/listener/CBREventHandler;", "Lru/cyberity/cbr/core/data/listener/CBRIconHandler;", "iconHandler", "Lru/cyberity/cbr/core/data/listener/CBRIconHandler;", "getIconHandler$cyberity_mobile_sdk_release", "()Lru/cyberity/cbr/core/data/listener/CBRIconHandler;", "Lru/cyberity/cbr/core/data/listener/CBRInstructionsViewHandler;", "instructionsViewHandler", "Lru/cyberity/cbr/core/data/listener/CBRInstructionsViewHandler;", "getInstructionsViewHandler$cyberity_mobile_sdk_release", "()Lru/cyberity/cbr/core/data/listener/CBRInstructionsViewHandler;", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker;", "countryPicker", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker;", "getCountryPicker$cyberity_mobile_sdk_release", "()Lru/cyberity/cbr/core/data/listener/CBRCountryPicker;", "", "isDebug", "Z", "isDebug$cyberity_mobile_sdk_release", "()Z", "isAnalyticsEnabled", "isAnalyticsEnabled$cyberity_mobile_sdk_release", "Lru/cyberity/log/logger/Logger;", "logTree", "Lru/cyberity/log/logger/Logger;", "getLogTree$cyberity_mobile_sdk_release", "()Lru/cyberity/log/logger/Logger;", "Ljava/util/Locale;", "locale", "Ljava/util/Locale;", "getLocale$cyberity_mobile_sdk_release", "()Ljava/util/Locale;", "Lru/cyberity/cbr/core/data/model/CBRInitConfig;", "conf", "Lru/cyberity/cbr/core/data/model/CBRInitConfig;", "getConf$cyberity_mobile_sdk_release", "()Lru/cyberity/cbr/core/data/model/CBRInitConfig;", "", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "Ljava/lang/Integer;", "getTheme$cyberity_mobile_sdk_release", "()Ljava/lang/Integer;", "Lru/cyberity/cbr/core/theme/CBRJsonCustomization;", "customization", "Lru/cyberity/cbr/core/theme/CBRJsonCustomization;", "getCustomization$cyberity_mobile_sdk_release", "()Lru/cyberity/cbr/core/theme/CBRJsonCustomization;", "", "settings", "Ljava/util/Map;", "getSettings$cyberity_mobile_sdk_release", "()Ljava/util/Map;", "Lru/cyberity/cbr/core/data/model/CBRDocumentDefinition;", "preferredDocumentsDefinitions", "getPreferredDocumentsDefinitions$cyberity_mobile_sdk_release", "autoCloseOnApproveTimeout", "getAutoCloseOnApproveTimeout$cyberity_mobile_sdk_release", "Lru/cyberity/cbr/core/data/listener/CBRUrlHandler;", "cbrUrlHandler", "Lru/cyberity/cbr/core/data/listener/CBRUrlHandler;", "getCbrUrlHandler$cyberity_mobile_sdk_release", "()Lru/cyberity/cbr/core/data/listener/CBRUrlHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "exceptionHandler", "Ljava/lang/Thread$UncaughtExceptionHandler;", "cyberity-mobile-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class SDK {

        @l
        private String accessToken;

        @l
        private final CBRActionResultHandler actionResultHandler;

        @l
        private final Integer autoCloseOnApproveTimeout;

        @l
        private final CBRUrlHandler cbrUrlHandler;

        @l
        private final CBRCompleteHandler completeHandler;

        @l
        private final CBRInitConfig conf;

        @l
        private final CBRCountryPicker countryPicker;

        @l
        private final CBRJsonCustomization customization;

        @l
        private final CBRErrorHandler errorHandler;

        @l
        private final CBREventHandler eventHandler;

        @l
        private Thread.UncaughtExceptionHandler exceptionHandler;

        @l
        private final CBRIconHandler iconHandler;

        @l
        private final CBRInstructionsViewHandler instructionsViewHandler;
        private final boolean isAnalyticsEnabled;
        private final boolean isDebug;

        @k
        private final Locale locale;

        @k
        private final Logger logTree;

        @k
        private final List<CBRModule> modules;

        @l
        private final TokenExpirationHandler onTokenExpiration;

        @l
        private final Map<String, CBRDocumentDefinition> preferredDocumentsDefinitions;

        @l
        private final Map<String, String> settings;

        @l
        private List<CBRSupportItem> supportItems;

        @l
        private final Integer theme;

        @k
        private final String url;

        @k
        private final WeakReference<Activity> weakActivity;

        /* JADX WARN: Type inference failed for: r0v32, types: [ru.cyberity.cbr.core.CBRMobileSDK$SDK$1$1] */
        public SDK(@k Builder builder) throws CBRInvalidParametersException {
            String url;
            Context applicationContext;
            String strC;
            this.weakActivity = builder.getWeakActivity$cyberity_mobile_sdk_release();
            if (C43066x.A(builder.getUrl(), '/')) {
                url = builder.getUrl();
            } else {
                url = builder.getUrl() + '/';
            }
            this.url = url;
            this.accessToken = builder.getAccessToken();
            this.modules = builder.getModules$cyberity_mobile_sdk_release();
            this.supportItems = builder.getSupportItems$cyberity_mobile_sdk_release();
            this.onTokenExpiration = builder.getOnTokenExpiration();
            this.completeHandler = builder.getCompleteHandler();
            this.errorHandler = builder.getErrorHandler();
            this.actionResultHandler = builder.getActionResultHandler();
            this.eventHandler = builder.getEventHandler();
            this.iconHandler = builder.getIconHandler();
            this.instructionsViewHandler = builder.getInstructionsHandler();
            this.countryPicker = builder.getCountryPicker();
            this.isDebug = builder.getIsDebug();
            this.isAnalyticsEnabled = builder.getIsAnalyticsEnabled();
            this.logTree = builder.getLogTree();
            this.locale = builder.getLocale();
            this.conf = builder.getConf();
            this.theme = builder.getTheme();
            this.customization = builder.getCustomization();
            this.settings = builder.getSettings$cyberity_mobile_sdk_release();
            this.preferredDocumentsDefinitions = builder.getPreferredDocumentsDefinitions$cyberity_mobile_sdk_release();
            this.autoCloseOnApproveTimeout = builder.getAutoCloseOnApproveTimeout();
            this.cbrUrlHandler = builder.getUrlHandler();
            List<String> listIsParametersValid = isParametersValid();
            if (!listIsParametersValid.isEmpty()) {
                throw new CBRInvalidParametersException(listIsParametersValid);
            }
            Activity activity = builder.getWeakActivity$cyberity_mobile_sdk_release().get();
            Context applicationContext2 = activity != null ? activity.getApplicationContext() : null;
            n0 n0Var = n0.f432787a;
            String packageName = applicationContext2 != null ? applicationContext2.getPackageName() : null;
            String str = "<unknown>";
            packageName = packageName == null ? "<unknown>" : packageName;
            if (applicationContext2 != null && (strC = s.c(applicationContext2)) != null) {
                str = strC;
            }
            n0Var.a(packageName, str, applicationContext2 != null ? s.b(applicationContext2) : -1);
            if (applicationContext2 == null || (applicationContext = applicationContext2.getApplicationContext()) == null) {
                return;
            }
            com.google.android.gms.security.a.b(applicationContext, new a.InterfaceC10635a() { // from class: ru.cyberity.cbr.core.CBRMobileSDK$SDK$1$1
                @Override // com.google.android.gms.security.a.InterfaceC10635a
                public void onProviderInstallFailed(int errorCode, @l Intent resolveIntent) {
                    Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), AK.c.g(errorCode, "onProviderInstallFailed: "), null, 4, null);
                }

                @Override // com.google.android.gms.security.a.InterfaceC10635a
                public void onProviderInstalled() {
                    Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "onProviderInstalled", null, 4, null);
                }
            });
        }

        private final List<String> isParametersValid() {
            ArrayList arrayList;
            ArrayList arrayList2 = new ArrayList();
            if (this.url.length() == 0) {
                arrayList2.add("Api url must be non-empty. url=" + this.url);
            }
            if (!p0.c(this.url)) {
                arrayList2.add("Api url must be valid. url=" + this.url);
            }
            List<CBRSupportItem> list = this.supportItems;
            if (list != null) {
                arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    String strIsValid = ((CBRSupportItem) it.next()).isValid();
                    if (strIsValid != null) {
                        arrayList.add(strIsValid);
                    }
                }
            } else {
                arrayList = null;
            }
            ArrayList arrayList3 = arrayList;
            if (arrayList3 != null && (!arrayList3.isEmpty())) {
                arrayList2.add("Support items have invalid support items. Why are support items invalid? (" + C42745f0.O(arrayList3, null, null, null, CBRMobileSDK$SDK$isParametersValid$1.INSTANCE, 31) + ')');
            }
            return arrayList2;
        }

        public final void dismiss() {
            Activity activity = this.weakActivity.get();
            if (activity != null) {
                Intent intent = new Intent("ru.cyberity.cbr.intent.ACTION_CLOSE");
                intent.setPackage(CBRMobileSDK.INSTANCE.getPackageName());
                activity.sendBroadcast(intent);
            }
        }

        @l
        /* renamed from: getAccessToken$cyberity_mobile_sdk_release, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }

        @l
        /* renamed from: getActionResultHandler$cyberity_mobile_sdk_release, reason: from getter */
        public final CBRActionResultHandler getActionResultHandler() {
            return this.actionResultHandler;
        }

        @l
        /* renamed from: getAutoCloseOnApproveTimeout$cyberity_mobile_sdk_release, reason: from getter */
        public final Integer getAutoCloseOnApproveTimeout() {
            return this.autoCloseOnApproveTimeout;
        }

        @l
        /* renamed from: getCbrUrlHandler$cyberity_mobile_sdk_release, reason: from getter */
        public final CBRUrlHandler getCbrUrlHandler() {
            return this.cbrUrlHandler;
        }

        @l
        /* renamed from: getCompleteHandler$cyberity_mobile_sdk_release, reason: from getter */
        public final CBRCompleteHandler getCompleteHandler() {
            return this.completeHandler;
        }

        @l
        /* renamed from: getConf$cyberity_mobile_sdk_release, reason: from getter */
        public final CBRInitConfig getConf() {
            return this.conf;
        }

        @l
        /* renamed from: getCountryPicker$cyberity_mobile_sdk_release, reason: from getter */
        public final CBRCountryPicker getCountryPicker() {
            return this.countryPicker;
        }

        @l
        /* renamed from: getCustomization$cyberity_mobile_sdk_release, reason: from getter */
        public final CBRJsonCustomization getCustomization() {
            return this.customization;
        }

        @l
        /* renamed from: getErrorHandler$cyberity_mobile_sdk_release, reason: from getter */
        public final CBRErrorHandler getErrorHandler() {
            return this.errorHandler;
        }

        @l
        /* renamed from: getEventHandler$cyberity_mobile_sdk_release, reason: from getter */
        public final CBREventHandler getEventHandler() {
            return this.eventHandler;
        }

        @l
        /* renamed from: getIconHandler$cyberity_mobile_sdk_release, reason: from getter */
        public final CBRIconHandler getIconHandler() {
            return this.iconHandler;
        }

        @l
        /* renamed from: getInstructionsViewHandler$cyberity_mobile_sdk_release, reason: from getter */
        public final CBRInstructionsViewHandler getInstructionsViewHandler() {
            return this.instructionsViewHandler;
        }

        @k
        /* renamed from: getLocale$cyberity_mobile_sdk_release, reason: from getter */
        public final Locale getLocale() {
            return this.locale;
        }

        @k
        /* renamed from: getLogTree$cyberity_mobile_sdk_release, reason: from getter */
        public final Logger getLogTree() {
            return this.logTree;
        }

        @k
        public final List<CBRModule> getModules$cyberity_mobile_sdk_release() {
            return this.modules;
        }

        @l
        /* renamed from: getOnTokenExpiration$cyberity_mobile_sdk_release, reason: from getter */
        public final TokenExpirationHandler getOnTokenExpiration() {
            return this.onTokenExpiration;
        }

        @l
        public final Map<String, CBRDocumentDefinition> getPreferredDocumentsDefinitions$cyberity_mobile_sdk_release() {
            return this.preferredDocumentsDefinitions;
        }

        @l
        public final Map<String, String> getSettings$cyberity_mobile_sdk_release() {
            return this.settings;
        }

        @l
        public final List<CBRSupportItem> getSupportItems$cyberity_mobile_sdk_release() {
            return this.supportItems;
        }

        @l
        /* renamed from: getTheme$cyberity_mobile_sdk_release, reason: from getter */
        public final Integer getTheme() {
            return this.theme;
        }

        @k
        /* renamed from: getUrl$cyberity_mobile_sdk_release, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @k
        public final WeakReference<Activity> getWeakActivity$cyberity_mobile_sdk_release() {
            return this.weakActivity;
        }

        public final void installUncaughtExceptionHandler$cyberity_mobile_sdk_release(@k String apiUrl) {
            Context applicationContext;
            this.exceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Activity activity = this.weakActivity.get();
            if (activity == null || (applicationContext = activity.getApplicationContext()) == null) {
                return;
            }
            ru.cyberity.log.cacher.e eVar = new ru.cyberity.log.cacher.e(new m(applicationContext, apiUrl), applicationContext.getCacheDir());
            eVar.a("_CBRExceptionSink");
            ru.cyberity.log.cacher.d.f436072a.a(eVar);
        }

        /* renamed from: isAnalyticsEnabled$cyberity_mobile_sdk_release, reason: from getter */
        public final boolean getIsAnalyticsEnabled() {
            return this.isAnalyticsEnabled;
        }

        /* renamed from: isDebug$cyberity_mobile_sdk_release, reason: from getter */
        public final boolean getIsDebug() {
            return this.isDebug;
        }

        public final void removeUncaughtExceptionHandler$cyberity_mobile_sdk_release() {
            Thread.setDefaultUncaughtExceptionHandler(this.exceptionHandler);
        }

        public final void setSupportItems$cyberity_mobile_sdk_release(@l List<CBRSupportItem> list) {
            this.supportItems = list;
        }

        @InterfaceC42153i
        public void launch() {
        }
    }
}
