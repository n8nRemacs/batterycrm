package com.avito.android.error_reporting.app_state;

import com.adjust.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: AppStateCollectorLogcat.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class r extends N implements Y41.l<String, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final r f147837l = new r();

    public r() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(String str) {
        String str2 = str;
        return Boolean.valueOf(C43066x.q(str2, "W/Resources", false) || C43066x.q(str2, "W/unknown:WrappingUtils", false) || C43066x.q(str2, "E/SpannableStringBuilder", false) || C43066x.q(str2, "E/WindowManager", false) || C43066x.q(str2, "D/UXFeedback", false) || C43066x.q(str2, "W/CrashlyticsEventTracker", false) || C43066x.q(str2, "D/AB_TEST", false) || C43066x.q(str2, "ClickStream", false) || C43066x.q(str2, Constants.LOGTAG, false) || C43066x.q(str2, "Statsd", false) || C43066x.q(str2, "AppMetrica-Attribution", false) || C43066x.q(str2, "E/SchedPolicy", false) || C43066x.q(str2, "ScrollView", false) || C43066x.q(str2, "OpenGLRenderer", false) || C43066x.q(str2, "DecorView", false) || C43066x.q(str2, "ViewRootImpl", false) || C43066x.q(str2, "Choreographer", false) || C43066x.q(str2, "InputMethodManager", false) || C43066x.q(str2, "RecyclerView", false) || C43066x.q(str2, "ConnectivityManager", false) || C43066x.q(str2, "E/Parcels", false) || C43066x.q(str2, "D/FrescoLoggingListener", false) || C43066x.q(str2, "D/ScreenFlowTrackerProvider", false) || C43066x.q(str2, "D/Messenger", false) || C43066x.q(str2, "D/PendingMessageHandler", false) || C43066x.q(str2, "D/MsgConnectionHolder", false) || C43066x.q(str2, "D/IacAvailabilityUpdater", false));
    }
}
