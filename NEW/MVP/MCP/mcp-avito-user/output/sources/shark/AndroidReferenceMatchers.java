package shark;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import shark.i3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AndroidReferenceMatchers.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lshark/AndroidReferenceMatchers;", "", "D", "shark-android"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public abstract class AndroidReferenceMatchers {

    /* JADX INFO: Fake field, exist only in values array */
    AndroidReferenceMatchers EF23;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AndroidReferenceMatchers[] f437997b = {new C48206i0("PERMISSION_CONTROLLER_MANAGER", 0, null), new S("IREQUEST_FINISH_CALLBACK", 1, null), new C48201g("ACTIVITY_THREAD__M_NEW_ACTIVITIES", 2, null), new u0("SPAN_CONTROLLER", 3, null), new C48198e0("MEDIA_SESSION_LEGACY_HELPER__SINSTANCE", 4, null), new B0("TEXT_LINE__SCACHED", 5, null), new C48223u("BLOCKING_QUEUE", 6, null), new Q("INPUT_METHOD_MANAGER_IS_TERRIBLE", 7, null), new P("INPUT_MANAGER__M_LATE_INIT_CONTEXT", 8, null), new U("LAYOUT_TRANSITION", 9, null), new x0("SPELL_CHECKER_SESSION", 10, null), new w0("SPELL_CHECKER", 11, null), new C48197e("ACTIVITY_CHOOSE_MODEL", 12, null), new C48194c0("MEDIA_PROJECTION_CALLBACK", 13, null), new v0("SPEECH_RECOGNIZER", 14, null), new C48195d("ACCOUNT_MANAGER__AMS_TASK__RESPONSE", 15, null), new C48196d0("MEDIA_SCANNER_CONNECTION", 16, null), new G0("USER_MANAGER__SINSTANCE", 17, null), new C48211l("APP_WIDGET_HOST_CALLBACKS", 18, null), new C48215n("AUDIO_MANAGER", 19, null), new G("EDITTEXT_BLINK_MESSAGEQUEUE", 20, null), new A("CONNECTIVITY_MANAGER__SINSTANCE", 21, null), new C48193c("ACCESSIBILITY_NODE_INFO__MORIGINALTEXT", 22, null), new C48213m("ASSIST_STRUCTURE", 23, null), new C48189a("ACCESSIBILITY_ITERATORS", 24, null), new C48222t("BIOMETRIC_PROMPT", 25, null), new Z("MAGNIFIER", 26, null), new C48221s("BACKDROP_FRAME_RENDERER__MDECORVIEW", 27, null), new H0("VIEWLOCATIONHOLDER_ROOT", 28, null), new C48191b("ACCESSIBILITY_NODE_ID_MANAGER", 29, null), new C0("TEXT_TO_SPEECH", 30, null), new B("CONTROLLED_INPUT_CONNECTION_WRAPPER", 31, null), new E0("TOAST_TN", 32, null), new C48207j("APPLICATION_PACKAGE_MANAGER__HAS_SYSTEM_FEATURE_QUERY", 33, null), new C48227y("COMPANION_DEVICE_SERVICE__STUB", 34, null), new C48216n0("RENDER_NODE_ANIMATOR", 35, null), new C48210k0("PLAYER_BASE", 36, null), new M0("WINDOW_ON_BACK_INVOKED_DISPATCHER__STUB", 37, null), new C48228z("CONNECTIVITY_MANAGER_CALLBACK_HANDLER", 38, null), new M("HOST_ADPU_SERVICE_MSG_HANDLER", 39, null), new C48209k("APP_OPS_MANAGER__CALLBACK_STUB", 40, null), new K0("VIEW_GROUP__M_PRE_SORTED_CHILDREN", 41, null), new J0("VIEW_GROUP__M_CURRENT_DRAG_CHILD", 42, null), new L0("VIEW_TOOLTIP_CALLBACK", 43, null), new C48203h("ACTIVITY_TRANSITION_STATE__M_EXITING_TO_VIEW", 44, null), new C48205i("ANIMATION_HANDLER__ANIMATOR_REQUESTORS", 45, null), new K("FLIPPER__APPLICATION_DESCRIPTOR", 46, null), new C48219q("AW_CONTENTS__A0", 47, null), new C48218p("AW_CONTENTS_POSTED_CALLBACK", 48, null), new T("JOB_SERVICE", 49, null), new F("DREAM_SERVICE", 50, null), new F0("UI_MODE_MANAGER", 51, null), new y0("SPEN_GESTURE_MANAGER", 52, null), new C48226x("CLIPBOARD_UI_MANAGER__SINSTANCE", 53, null), new q0("SEM_CLIPBOARD_MANAGER__MCONTEXT", 54, null), new C48225w("CLIPBOARD_EX_MANAGER", 55, null), new r0("SEM_EMERGENCY_MANAGER__MCONTEXT", 56, null), new s0("SEM_PERSONA_MANAGER", 57, null), new p0("SEM_APP_ICON_SOLUTION", 58, null), new C48220r("AW_RESOURCE__SRESOURCES", 59, null), new D0("TEXT_VIEW__MLAST_HOVERED_VIEW", 60, null), new C48208j0("PERSONA_MANAGER", 61, null), new o0("RESOURCES__MCONTEXT", 62, null), new I0("VIEW_CONFIGURATION__MCONTEXT", 63, null), new C48217o("AUDIO_MANAGER__MCONTEXT_STATIC", 64, null), new C48199f("ACTIVITY_MANAGER_MCONTEXT", 65, null), new z0("STATIC_MTARGET_VIEW", 66, null), new C48200f0("MULTI_WINDOW_DECOR_SUPPORT__MWINDOW", 67, null), new N("IMM_CURRENT_INPUT_CONNECTION", 68, null), new L("GESTURE_BOOST_MANAGER", 69, null), new C48224v("BUBBLE_POPUP_HELPER__SHELPER", 70, null), new Y("LGCONTEXT__MCONTEXT", 71, null), new t0("SMART_COVER_MANAGER", 72, null), new O("IMM_LAST_FOCUS_VIEW", 73, null), new C48192b0("MAPPER_CLIENT", 74, null), new A0("SYSTEM_SENSOR_MANAGER__MAPPCONTEXTIMPL", 75, null), new R("INSTRUMENTATION_RECOMMEND_ACTIVITY", 76, null), new E("DEVICE_POLICY_MANAGER__SETTINGS_OBSERVER", 77, null), new I("EXTENDED_STATUS_BAR_MANAGER", 78, null), new C48202g0("OEM_SCENE_CALL_BLOCKER", 79, null), new C48204h0("PERF_MONITOR_LAST_CALLBACK", 80, null), new C48212l0("RAZER_TEXT_KEY_LISTENER__MCONTEXT", 81, null), new N0("XIAMI__RESOURCES_IMPL", 82, null), new C48214m0("REFERENCES", 83, null), new J("FINALIZER_WATCHDOG_DAEMON", 84, null), new C48190a0("MAIN", 85, null), new X("LEAK_CANARY_THREAD", 86, null), new V("LEAK_CANARY_HEAP_DUMPER", 87, null), new W("LEAK_CANARY_INTERNAL", 88, null), new H("EVENT_RECEIVER__MMESSAGE_QUEUE", 89, null)};

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final D f437999d = new D(null);

    /* renamed from: c, reason: collision with root package name */
    public static final Y41.l<C48233b, Boolean> f437998c = C.f438000l;

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$A;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class A extends AndroidReferenceMatchers {
        public A() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.Y y12 = shark.Y.f438229l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.net.ConnectivityManager", "sInstance", "ConnectivityManager has a sInstance field that is set when the first ConnectivityManager instance is created. ConnectivityManager has a mContext field. When calling activity.getSystemService(Context.CONNECTIVITY_SERVICE) , the first ConnectivityManager instance is created with the activity context and stored in sInstance. That activity context then leaks forever. Until this is fixed, app developers can prevent this leak by making sure the ConnectivityManager is first created with an App Context. E.g. in some static init do: context.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE) Tracked here: https://code.google.com/p/android/issues/detail?id=198852 Introduced here: https://github.com/android/platform_frameworks_base/commit/e0bef71662d81caaaa0d7214fb0bef5d39996a69", y12));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$A0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class A0 extends AndroidReferenceMatchers {
        public A0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            V0 v02 = V0.f438220l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.e("android.hardware.SystemSensorManager", "mAppContextImpl", "SystemSensorManager stores a reference to context in a static field in its constructor. Fix: use application context to get SensorManager", v02));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$B;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class B extends AndroidReferenceMatchers {
        public B() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            Y41.l<C48233b, Boolean> lVar = AndroidReferenceMatchers.f437998c;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.d(lVar, "android.view.inputmethod.InputMethodManager$ControlledInputConnectionWrapper", "ControlledInputConnectionWrapper is held by a global variable in native code."));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$B0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class B0 extends AndroidReferenceMatchers {
        public B0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            W0 w02 = W0.f438223l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.e("android.text.TextLine", "sCached", "TextLine.sCached is a pool of 3 TextLine instances. TextLine.recycle() has had at least two bugs that created memory leaks by not correctly clearing the recycled TextLine instances. The first was fixed in android-5.1.0_r1: https://github.com/android/platform_frameworks_base/commit/893d6fe48d37f71e683f722457bea646994a10 The second was fixed, not released yet: https://github.com/android/platform_frameworks_base/commit/b3a9bc038d3a218b1dbdf7b5668e3d6c12be5e To fix this, you could access TextLine.sCached and clear the pool every now and then (e.g. on activity destroy).", w02));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lshark/b;", "", "invoke", "(Lshark/b;)Z", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class C extends kotlin.jvm.internal.N implements Y41.l<C48233b, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final C f438000l = new C();

        public C() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(C48233b c48233b) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$C0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class C0 extends AndroidReferenceMatchers {
        public C0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            X0 x02 = X0.f438226l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.speech.tts.TextToSpeech", "mContext", "TextToSpeech.shutdown() does not release its references to context objects. Furthermore, TextToSpeech instances cannot be garbage collected due to other process keeping the references, resulting the context objects leaked. Developers might be able to mitigate the issue by passing application context to TextToSpeech constructor. Tracked at: https://github.com/square/leakcanary/issues/1210 and https://issuetracker.google.com/issues/129250419", x02));
            arrayList.add(D.b("android.speech.tts.TtsEngines", "mContext", "TextToSpeech.shutdown() does not release its references to context objects. Furthermore, TextToSpeech instances cannot be garbage collected due to other process keeping the references, resulting the context objects leaked. Developers might be able to mitigate the issue by passing application context to TextToSpeech constructor. Tracked at: https://github.com/square/leakcanary/issues/1210 and https://issuetracker.google.com/issues/129250419", Y0.f438230l));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0014\u0010\u0014\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u0014\u0010\u0016\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u0014\u0010\u0018\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u0014\u0010\u0019\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u0014\u0010\u001a\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u0014\u0010\u001b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\fR\u0014\u0010\u001c\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lshark/AndroidReferenceMatchers$D;", "", "<init>", "()V", "Lkotlin/Function1;", "Lshark/b;", "", "Lkotlin/w;", "ALWAYS", "LY41/l;", "", "HMD_GLOBAL", "Ljava/lang/String;", "HUAWEI", "INFINIX", "LEAK_CANARY_THREAD_NAME", "LENOVO", "LG", "MEIZU", "MOTOROLA", "NVIDIA", "ONE_PLUS", "RAZER", "REALME", "SAMSUNG", "SHARP", "TES", "VIVO", "XIAOMI", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class D {
        public D() {
        }

        @X41.n
        @Y61.k
        public static C48369z2 a(@Y61.k String str, @Y61.k String str2) {
            return new C48369z2(new i3.b(str, str2));
        }

        @X41.n
        @Y61.k
        public static N2 b(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k Y41.l lVar) {
            return new N2(new i3.b(str, str2), str3, new shark.Z(lVar));
        }

        public static /* synthetic */ N2 c(D d12, String str, String str2, String str3, Y41.l lVar, int i12) {
            if ((i12 & 4) != 0) {
                str3 = "";
            }
            if ((i12 & 8) != 0) {
                lVar = AndroidReferenceMatchers.f437998c;
            }
            d12.getClass();
            return b(str, str2, str3, lVar);
        }

        @X41.n
        @Y61.k
        public static N2 d(@Y61.k Y41.l lVar, @Y61.k String str, @Y61.k String str2) {
            return new N2(new i3.d(str), str2, new shark.Z(lVar));
        }

        @X41.n
        @Y61.k
        public static N2 e(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k Y41.l lVar) {
            return new N2(new i3.e(str, str2), str3, new shark.Z(lVar));
        }

        public static /* synthetic */ N2 f(D d12, String str, String str2, String str3, Y41.l lVar, int i12) {
            if ((i12 & 4) != 0) {
                str3 = "";
            }
            if ((i12 & 8) != 0) {
                lVar = AndroidReferenceMatchers.f437998c;
            }
            d12.getClass();
            return e(str, str2, str3, lVar);
        }

        public /* synthetic */ D(C42822w c42822w) {
            this();
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$D0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class D0 extends AndroidReferenceMatchers {
        public D0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            Z0 z02 = Z0.f438232l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.e("android.widget.TextView", "mLastHoveredView", "mLastHoveredView is a static field in TextView that leaks the last hovered view.", z02));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$E;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class E extends AndroidReferenceMatchers {
        public E() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48230a0 c48230a0 = C48230a0.f438234l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.app.admin.DevicePolicyManager$SettingsObserver", "this$0", "DevicePolicyManager keeps a reference to the context it has been created with instead of extracting the application context. In this Motorola build, DevicePolicyManager has an inner SettingsObserver class that is a content observer, which is held into memory by a binder transport object.", c48230a0));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$E0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class E0 extends AndroidReferenceMatchers {
        public E0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            Y41.l<C48233b, Boolean> lVar = AndroidReferenceMatchers.f437998c;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.d(lVar, "android.widget.Toast$TN", "Toast.TN is held by a global variable in native code due to an IPC call to show the toast."));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$F;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class F extends AndroidReferenceMatchers {
        public F() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48234b0 c48234b0 = C48234b0.f438241l;
            AndroidReferenceMatchers.f437999d.getClass();
            D.d(c48234b0, "android.service.dreams.DreamService$1", "DreamService leaks a binder stub.\nhttps://github.com/square/leakcanary/issues/2534");
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$F0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class F0 extends AndroidReferenceMatchers {
        public F0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48231a1 c48231a1 = C48231a1.f438235l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.d(c48231a1, "android.app.UiModeManager$1", "UiModeManager$1 is an anonymous class of the IUiModeManagerCallback.Stub that is\nstored in memory native code. `this$0` is an instance of the UiModeManager that\ncontains the `mContext` field, which is why retain this reference.\nIntroduced in Android 14.0.0_r11: https://cs.android.com/android/_/android/platform/frameworks/base/+/cbbc772a41d20645ae434d74c482f3f4ad377e2c\nFixed in Android 14.0.0_r16: https://cs.android.com/android/_/android/platform/frameworks/base/+/2bc364179327022d0f60224a1f2420349074c5d2"));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$G;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class G extends AndroidReferenceMatchers {
        public G() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48238c0 c48238c0 = C48238c0.f438249l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.widget.Editor$Blink", "this$0", "The EditText Blink of the Cursor is implemented using a callback and Messages, which trigger the display of the Cursor. If an AlertDialog or DialogFragment that contains a blinking cursor is detached, a message is posted with a delay after the dialog has been closed and as a result leaks the Activity. This can be fixed manually by calling TextView.setCursorVisible(false) in the dismiss() method of the dialog. Tracked here: https://code.google.com/p/android/issues/detail?id=188551 Fixed in AOSP: https://android.googlesource.com/platform/frameworks/base/+/5b734f2430e9f26c769d6af8ea5645e390fcf5af%5E%21/", c48238c0));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$G0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class G0 extends AndroidReferenceMatchers {
        public G0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48235b1 c48235b1 = C48235b1.f438242l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.os.UserManager", "mContext", "UserManager has a static sInstance field that creates an instance and caches it the first time UserManager.get() is called. This instance is created with the outer context (which is an activity base context). Tracked here: https://code.google.com/p/android/issues/detail?id=173789 Introduced by: https://github.com/android/platform_frameworks_base/commit/27db46850b708070452c0ce49daf5f79503fbde6 Fix: trigger a call to UserManager.get() in Application.onCreate(), so that the UserManager instance gets cached with a reference to the application context.", c48235b1));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$H;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class H extends AndroidReferenceMatchers {
        public H() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.a("android.view.Choreographer$FrameDisplayEventReceiver", "mMessageQueue"));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$H0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class H0 extends AndroidReferenceMatchers {
        public H0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48239c1 c48239c1 = C48239c1.f438250l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.view.ViewGroup$ViewLocationHolder", "mRoot", "In Android P, ViewLocationHolder has an mRoot field that is not cleared in its clear() method. Introduced in https://github.com/aosp-mirror/platform_frameworks_base/commit/86b326012813f09d8f1de7d6d26c986a909d Bug report: https://issuetracker.google.com/issues/112792715", c48239c1));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$I;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class I extends AndroidReferenceMatchers {
        public I() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48242d0 c48242d0 = C48242d0.f438267l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.app.ExtendedStatusBarManager", "mContext", "ExtendedStatusBarManager has a mContext field which references a decor context which\nreferences a destroyed activity.", c48242d0));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$I0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class I0 extends AndroidReferenceMatchers {
        public I0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48243d1 c48243d1 = C48243d1.f438268l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.view.ViewConfiguration", "mContext", "In AOSP the ViewConfiguration class does not have a context. Here we have ViewConfiguration.sConfigurations (static field) holding on to a ViewConfiguration instance that has a context that is the activity. Observed here: https://github.com/square/leakcanary/issues/1#issuecomment-100324683", c48243d1));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$J;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class J extends AndroidReferenceMatchers {
        public J() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(new C48369z2(new i3.c("FinalizerWatchdogDaemon")));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$J0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class J0 extends AndroidReferenceMatchers {
        public J0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48247e1 c48247e1 = C48247e1.f438273l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.view.ViewGroup", "mCurrentDragChild", "ViewGroup.mCurrentDragChild keeps a reference to a view that was dragged after that view\nhas been detached.\nReport: https://issuetracker.google.com/issues/170276524", c48247e1));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$K;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class K extends AndroidReferenceMatchers {
        public K() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            arrayList.add(D.f(AndroidReferenceMatchers.f437999d, "com.facebook.flipper.plugins.inspector.descriptors.ApplicationDescriptor", "editedDelegates", "Flipper's ApplicationDescriptor leaks root views after they've been detached.\nhttps://github.com/facebook/flipper/issues/4270", null, 8));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$K0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class K0 extends AndroidReferenceMatchers {
        public K0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48251f1 c48251f1 = C48251f1.f438276l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.view.ViewGroup", "mPreSortedChildren", "ViewGroup.mPreSortedChildren is used as a temporary list but not cleared after being\nused.\nReport: https://issuetracker.google.com/issues/178029590\nFix: https://cs.android.com/android/_/android/platform/frameworks/base/+/73590c7751b9185137de962ba9ad9ff5a6e11e5d", c48251f1));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$L;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class L extends AndroidReferenceMatchers {
        public L() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48246e0 c48246e0 = C48246e0.f438272l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.e("android.gestureboost.GestureBoostManager", "mContext", "GestureBoostManager is a static singleton that leaks an activity context. Fix: https://github.com/square/leakcanary/issues/696#issuecomment-296420756", c48246e0));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$L0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class L0 extends AndroidReferenceMatchers {
        public L0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48255g1 c48255g1 = C48255g1.f438281l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.view.View$$ExternalSyntheticLambda3", "f$0", "When a View has tooltip text set, every hover event will fire a callback\nto hide the tooltip after a 15 second timeout. Since the callback holds\na reference to the View, it will leak the View for that duration after\nthe Activity is finished or the View is removed.\nhttps://cs.android.com/android/_/android/platform/frameworks/base/+/708dbe80902b963388c412f670c56ae00953273a", c48255g1));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$M;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class M extends AndroidReferenceMatchers {
        public M() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48250f0 c48250f0 = C48250f0.f438275l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.nfc.cardemulation.HostApduService$MsgHandler", "this$0", "Destroyed HostApduService instances are held by a handler instance that lives longer\nthan the service.\nReport: https://github.com/square/leakcanary/issues/2390", c48250f0));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$M0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class M0 extends AndroidReferenceMatchers {
        public M0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48259h1 c48259h1 = C48259h1.f438284l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.window.WindowOnBackInvokedDispatcher$OnBackInvokedCallbackWrapper", "mCallback", "WindowOnBackInvokedDispatcher.OnBackInvokedCallbackWrapper is an IPC stub that holds a\nreference to a callback which itself holds a view root. Another process is keeping the\nstub alive long after the view root has been detached.\nTracked here: https://issuetracker.google.com/issues/229007483", c48259h1));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$N;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class N extends AndroidReferenceMatchers {
        public N() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48254g0 c48254g0 = C48254g0.f438280l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.view.inputmethod.InputMethodManager", "mCurrentInputConnection", "InputMethodManager keeps its EditableInputConnection after the activity has been\ndestroyed.\nFiled here: https://github.com/square/leakcanary/issues/2300", c48254g0));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$N0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class N0 extends AndroidReferenceMatchers {
        public N0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48263i1 c48263i1 = C48263i1.f438289l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.e("android.content.res.ResourcesImpl", "mAppContext", "A fork of Android added a static mAppContext field to the ResourcesImpl class\nand that field ends up referencing lower contexts (e.g. service). Several Android\nmanufacturers seem to be using the same broken Android fork sources.", c48263i1));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$O;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class O extends AndroidReferenceMatchers {
        public O() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48258h0 c48258h0 = C48258h0.f438283l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.view.inputmethod.InputMethodManager", "mLastFocusView", "InputMethodManager has a mLastFocusView field that doesn't get cleared when the last\nfocused view becomes detached.", c48258h0));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$P;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class P extends AndroidReferenceMatchers {
        public P() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48262i0 c48262i0 = C48262i0.f438288l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.hardware.input.InputManager", "mLateInitContext", "InputManager singleton leaks its init context which is an activity", c48262i0));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$Q;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class Q extends AndroidReferenceMatchers {
        public Q() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48304j0 c48304j0 = C48304j0.f438635l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.view.inputmethod.InputMethodManager", "mNextServedView", "When we detach a view that receives keyboard input, the InputMethodManager leaks a reference to it until a new view asks for keyboard input. Tracked here: https://code.google.com/p/android/issues/detail?id=171190 Hack: https://gist.github.com/pyricau/4df64341cc978a7de414", c48304j0));
            arrayList.add(D.b("android.view.inputmethod.InputMethodManager", "mServedView", "When we detach a view that receives keyboard input, the InputMethodManager leaks a reference to it until a new view asks for keyboard input. Tracked here: https://code.google.com/p/android/issues/detail?id=171190 Hack: https://gist.github.com/pyricau/4df64341cc978a7de414", C48308k0.f438641l));
            arrayList.add(D.b("android.view.inputmethod.InputMethodManager", "mServedInputConnection", "When we detach a view that receives keyboard input, the InputMethodManager leaks a reference to it until a new view asks for keyboard input. Tracked here: https://code.google.com/p/android/issues/detail?id=171190 Hack: https://gist.github.com/pyricau/4df64341cc978a7de414", C48312l0.f438648l));
            arrayList.add(D.b("android.view.inputmethod.InputMethodManager", "mLastSrvView", "HUAWEI added a mLastSrvView field to InputMethodManager that leaks a reference to the last served view.", C48316m0.f438653l));
            arrayList.add(D.b("android.view.inputmethod.InputMethodManager", "mCurRootView", "The singleton InputMethodManager is holding a reference to mCurRootView long after the activity has been destroyed. Observed on ICS MR1: https://github.com/square/leakcanary/issues/1#issuecomment-100579429 Hack: https://gist.github.com/pyricau/4df64341cc978a7de414", C48320n0.f438657l));
            arrayList.add(D.b("android.view.inputmethod.InputMethodManager", "mImeInsetsConsumer", "InputMethodManager.mImeInsetsConsumer isn't set to null when the activity is destroyed.", C48324o0.f438661l));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$R;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class R extends AndroidReferenceMatchers {
        public R() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48328p0 c48328p0 = C48328p0.f438665l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.e("android.app.Instrumentation", "mRecommendActivity", "Instrumentation would leak com.android.internal.app.RecommendActivity (in framework.jar) in Meizu FlymeOS 4.5 and above, which is based on Android 5.0 and  above", c48328p0));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$S;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class S extends AndroidReferenceMatchers {
        public S() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48332q0 c48332q0 = C48332q0.f438678l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.app.Activity$1", "this$0", "Android Q added a new android.app.IRequestFinishCallback$Stub class. android.app.Activity creates an implementation of that interface as an anonymous subclass. That anonymous subclass has a reference to the activity. Another process is keeping the android.app.IRequestFinishCallback$Stub reference alive long after Activity.onDestroyed() has been called, causing the activity to leak. Fix: You can \"fix\" this leak by overriding Activity.onBackPressed() and calling Activity.finishAfterTransition(); instead of super if the activity is task root and the fragment stack is empty. Tracked here: https://issuetracker.google.com/issues/139738913", c48332q0));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$T;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class T extends AndroidReferenceMatchers {
        public T() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48335r0 c48335r0 = C48335r0.f438691l;
            AndroidReferenceMatchers.f437999d.getClass();
            D.d(c48335r0, "android.app.job.JobService$1", "JobService used to be leaked via a binder stub.\nFix: https://cs.android.com/android/_/android/platform/frameworks/base/+/0796e9fb3dc2dd03fa5ff2053c63f14861cffa2f");
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$U;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class U extends AndroidReferenceMatchers {
        public U() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48339s0 c48339s0 = C48339s0.f438695l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.animation.LayoutTransition$1", "val$parent", "LayoutTransition leaks parent ViewGroup through ViewTreeObserver.OnPreDrawListener When triggered, this leaks stays until the window is destroyed. Tracked here: https://code.google.com/p/android/issues/detail?id=171830", c48339s0));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$V;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class V extends AndroidReferenceMatchers {
        public V() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.a("leakcanary.internal.InternalLeakCanary", "resumedActivity"));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$W;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class W extends AndroidReferenceMatchers {
        public W() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.a("leakcanary.internal.InternalLeakCanary", "application"));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$X;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class X extends AndroidReferenceMatchers {
        public X() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(new C48369z2(new i3.c("LeakCanary-Heap-Dump")));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$Y;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class Y extends AndroidReferenceMatchers {
        public Y() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48343t0 c48343t0 = C48343t0.f438697l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("com.lge.systemservice.core.LGContext", "mContext", "LGContext is a static singleton that leaks an activity context.", c48343t0));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$Z;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class Z extends AndroidReferenceMatchers {
        public Z() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48347u0 c48347u0 = C48347u0.f438767l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.widget.Magnifier$InternalPopupWindow", "mCallback", "android.widget.Magnifier.InternalPopupWindow registers a frame callback on android.view.ThreadedRenderer.SimpleRenderer which holds it as a native reference. android.widget.Editor$InsertionHandleView registers an OnOperationCompleteCallback on Magnifier.InternalPopupWindow. These references are held after the activity has been destroyed.", c48347u0));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$a;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$a, reason: case insensitive filesystem */
    public static final class C48189a extends AndroidReferenceMatchers {
        public C48189a() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48358x c48358x = C48358x.f438800l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.widget.AccessibilityIterators$LineTextSegmentIterator", "mLayout", "AccessibilityIterators holds on to text layouts which can hold on to spans TextView.ChangeWatcher and android.widget.Editor end up in spans and typically hold on to the view hierarchy", c48358x));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$a0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$a0, reason: case insensitive filesystem */
    public static final class C48190a0 extends AndroidReferenceMatchers {
        public C48190a0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(new C48369z2(new i3.c("main")));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$b;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$b, reason: case insensitive filesystem */
    public static final class C48191b extends AndroidReferenceMatchers {
        public C48191b() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48362y c48362y = C48362y.f438805l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.view.accessibility.AccessibilityNodeIdManager", "mIdsToViews", "Android Q Beta added AccessibilityNodeIdManager which stores all views from their\nonAttachedToWindow() call, until detached. Unfortunately it's possible to trigger\nthe view framework to call detach before attach (by having a view removing itself\nfrom its parent in onAttach, which then causes AccessibilityNodeIdManager to keep\nchildren view forever. Future releases of Q will hold weak references.", c48362y));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$b0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$b0, reason: case insensitive filesystem */
    public static final class C48192b0 extends AndroidReferenceMatchers {
        public C48192b0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48351v0 c48351v0 = C48351v0.f438787l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("com.nvidia.ControllerMapper.MapperClient$ServiceClient", "this$0", "Not sure exactly what ControllerMapper is about, but there is an anonymous Handler in ControllerMapper.MapperClient.ServiceClient, which leaks ControllerMapper.MapperClient which leaks the activity context.", c48351v0));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$c;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$c, reason: case insensitive filesystem */
    public static final class C48193c extends AndroidReferenceMatchers {
        public C48193c() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48366z c48366z = C48366z.f438810l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.view.accessibility.AccessibilityNodeInfo", "mOriginalText", "AccessibilityNodeInfo has a static sPool of AccessibilityNodeInfo. When AccessibilityNodeInfo instances are released back in the pool, AccessibilityNodeInfo.clear() does not clear the mOriginalText field, which causes spans to leak which in turns causes TextView.ChangeWatcher to leak and the whole view hierarchy. Introduced here: https://android.googlesource.com/platform/frameworks/base/+/193520e3dff5248ddcf8435203bf99d2ba667219%5E%21/core/java/android/view/accessibility/AccessibilityNodeInfo.java", c48366z));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$c0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$c0, reason: case insensitive filesystem */
    public static final class C48194c0 extends AndroidReferenceMatchers {
        public C48194c0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48355w0 c48355w0 = C48355w0.f438796l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.media.projection.MediaProjection$MediaProjectionCallback", "this$0", "MediaProjectionCallback is held by another process, and holds on to MediaProjection\nwhich has an activity as its context.", c48355w0));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$d;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$d, reason: case insensitive filesystem */
    public static final class C48195d extends AndroidReferenceMatchers {
        public C48195d() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.A a12 = shark.A.f437942l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.d(a12, "android.accounts.AccountManager$AmsTask$Response", "AccountManager.AmsTask.Response is a stub, and as all stubs it's held in memory by a\nnative ref until the calling side gets GCed, which can happen long after the stub is no\nlonger of use.\nhttps://issuetracker.google.com/issues/318303120"));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$d0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$d0, reason: case insensitive filesystem */
    public static final class C48196d0 extends AndroidReferenceMatchers {
        public C48196d0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48359x0 c48359x0 = C48359x0.f438801l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.media.MediaScannerConnection", "mContext", "The static method MediaScannerConnection.scanFile() takes an activity context but the service might not disconnect after the activity has been destroyed. Tracked here: https://code.google.com/p/android/issues/detail?id=173788 Fix: Create an instance of MediaScannerConnection yourself and pass in the application context. Call connect() and disconnect() manually.", c48359x0));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$e;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$e, reason: case insensitive filesystem */
    public static final class C48197e extends AndroidReferenceMatchers {
        public C48197e() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.B b12 = shark.B.f438001l;
            D d12 = AndroidReferenceMatchers.f437999d;
            d12.getClass();
            arrayList.add(D.b("android.support.v7.internal.widget.ActivityChooserModel", "mActivityChoserModelPolicy", "ActivityChooserModel holds a static reference to the last set ActivityChooserModelPolicy which can be an activity context. Tracked here: https://code.google.com/p/android/issues/detail?id=172659 Hack: https://gist.github.com/andaag/b05ab66ed0f06167d6e0", b12));
            arrayList.add(D.c(d12, "android.widget.ActivityChooserModel", "mActivityChoserModelPolicy", "ActivityChooserModel holds a static reference to the last set ActivityChooserModelPolicy which can be an activity context. Tracked here: https://code.google.com/p/android/issues/detail?id=172659 Hack: https://gist.github.com/andaag/b05ab66ed0f06167d6e0", null, 8));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$e0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$e0, reason: case insensitive filesystem */
    public static final class C48198e0 extends AndroidReferenceMatchers {
        public C48198e0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48363y0 c48363y0 = C48363y0.f438806l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.e("android.media.session.MediaSessionLegacyHelper", "sInstance", "MediaSessionLegacyHelper is a static singleton that is lazily instantiated and keeps a reference to the context it's given the first time MediaSessionLegacyHelper.getHelper() is called. This leak was introduced in android-5.0.1_r1 and fixed in Android 5.1.0_r1 by calling context.getApplicationContext(). Fix: https://github.com/android/platform_frameworks_base/commit/9b5257c9c99c4cb541d8e8e78fb04f008b1a9091 To fix this, you could call MediaSessionLegacyHelper.getHelper() early in Application.onCreate() and pass it the application context.", c48363y0));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$f;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$f, reason: case insensitive filesystem */
    public static final class C48199f extends AndroidReferenceMatchers {
        public C48199f() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.C c12 = shark.C.f438004l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.e("android.app.ActivityManager", "mContext", "Samsung added a static mContext field to ActivityManager, holds a reference to the activity. Observed here: https://github.com/square/leakcanary/issues/177 Fix in comment: https://github.com/square/leakcanary/issues/177#issuecomment-222724283", c12));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$f0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$f0, reason: case insensitive filesystem */
    public static final class C48200f0 extends AndroidReferenceMatchers {
        public C48200f0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            C48367z0 c48367z0 = C48367z0.f438811l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("com.android.internal.policy.MultiWindowDecorSupport", "mWindow", "DecorView isn't leaking but its mDecorViewSupport field holds\na MultiWindowDecorSupport which has a mWindow field which holds a leaking PhoneWindow.\nDecorView.mDecorViewSupport doesn't exist in AOSP.\nFiled here: https://github.com/square/leakcanary/issues/1819", c48367z0));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$g;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$g, reason: case insensitive filesystem */
    public static final class C48201g extends AndroidReferenceMatchers {
        public C48201g() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.D d12 = shark.D.f438013l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.app.ActivityThread", "mNewActivities", "New activities are leaked by ActivityThread until the main thread becomes idle.\nTracked here: https://issuetracker.google.com/issues/258390457", d12));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$g0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$g0, reason: case insensitive filesystem */
    public static final class C48202g0 extends AndroidReferenceMatchers {
        public C48202g0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.A0 a02 = shark.A0.f437943l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.e("com.oneplus.util.OemSceneCallBlocker", "sContext", "OemSceneCallBlocker has a sContext static field which holds on to an activity instance.", a02));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$h;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$h, reason: case insensitive filesystem */
    public static final class C48203h extends AndroidReferenceMatchers {
        public C48203h() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.E e12 = shark.E.f438016l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.app.ActivityTransitionState", "mExitingToView", "Shared element transition leak the view that was used in the transition.\nReport: https://issuetracker.google.com/issues/141132765", e12));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$h0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$h0, reason: case insensitive filesystem */
    public static final class C48204h0 extends AndroidReferenceMatchers {
        public C48204h0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.B0 b02 = shark.B0.f438002l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.e("android.os.PerfMonitor", "mLastCallback", "PerfMonitor has a mLastCallback static field which holds on to View.PerformClick.", b02));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$i;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$i, reason: case insensitive filesystem */
    public static final class C48205i extends AndroidReferenceMatchers {
        public C48205i() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.F f12 = shark.F.f438026l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.animation.AnimationHandler", "mAnimatorRequestors", "AnimationHandler is a singleton holding an activity ViewRootImpl requestor after the\nactivity has been destroyed.\nReport: https://issuetracker.google.com/issues/258534826", f12));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$i0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$i0, reason: case insensitive filesystem */
    public static final class C48206i0 extends AndroidReferenceMatchers {
        public C48206i0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.C0 c02 = shark.C0.f438005l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.permission.PermissionControllerManager", "mContext", "On some devices PermissionControllerManager may be initialized with Activity as its Context field. Fix: you can \"fix\" this leak by calling getSystemService(\"permission_controller\") on an application context. Tracked here: https://issuetracker.google.com/issues/318415056", c02));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$j;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$j, reason: case insensitive filesystem */
    public static final class C48207j extends AndroidReferenceMatchers {
        public C48207j() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.G g12 = shark.G.f438043l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.app.ApplicationPackageManager$HasSystemFeatureQuery", "this$0", "In Android 11 DP 2 ApplicationPackageManager.HasSystemFeatureQuery was an inner class.\nIntroduced in https://cs.android.com/android/_/android/platform/frameworks/base/+/89608118192580ffca026b5dacafa637a556d578\nFixed in https://cs.android.com/android/_/android/platform/frameworks/base/+/1f771846c51148b7cb6283e6dc82a216ffaa5353\nRelated blog: https://dev.to/pyricau/beware-packagemanager-leaks-223g", g12));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$j0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$j0, reason: case insensitive filesystem */
    public static final class C48208j0 extends AndroidReferenceMatchers {
        public C48208j0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.D0 d02 = shark.D0.f438014l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.os.PersonaManager", "mContext", "android.app.LoadedApk.mResources has a reference to android.content.res.Resources.mPersonaManager which has a reference to android.os.PersonaManager.mContext which is an activity.", d02));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$k;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$k, reason: case insensitive filesystem */
    public static final class C48209k extends AndroidReferenceMatchers {
        public C48209k() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.H h12 = shark.H.f438045l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.d(h12, "android.app.AppOpsManager$3", "Fix: Update androidx.core:core to 1.10.0-alpha01 or greater as it includes an Android 12\nfix for this leak on Android 12, see https://github.com/androidx/androidx/pull/435 .\nAppOpsManager\\$3 implements IAppOpsActiveCallback.Stub and is held by a native ref long\nuntil the calling side gets GCed, which can happen long after the stub is no longer of\nuse."));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$k0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$k0, reason: case insensitive filesystem */
    public static final class C48210k0 extends AndroidReferenceMatchers {
        public C48210k0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.E0 e02 = shark.E0.f438017l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.d(e02, "android.media.PlayerBase$1", "PlayerBase$1 implements IAppOpsCallback as an inner class and is held by a native\nref, preventing subclasses of PlayerBase to be GC'd.\nIntroduced in API 24: https://cs.android.com/android/_/android/platform/frameworks/base/+/3c86a343dfca1b9e2e28c240dc894f60709e392c\nFixed in API 28: https://cs.android.com/android/_/android/platform/frameworks/base/+/aee6ee94675d56e71a42d52b16b8d8e5fa6ea3ff"));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$l;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$l, reason: case insensitive filesystem */
    public static final class C48211l extends AndroidReferenceMatchers {
        public C48211l() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.I i12 = shark.I.f438084l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.appwidget.AppWidgetHost$Callbacks", "this$0", "android.appwidget.AppWidgetHost$Callbacks is a stub and is held in memory native code. The reference to the `mContext` was not being cleared, which caused the Callbacks instance to retain this reference Fixed in AOSP: https://github.com/android/platform_frameworks_base/commit/7a96f3c917e0001ee739b65da37b2fadec7d7765", i12));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$l0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$l0, reason: case insensitive filesystem */
    public static final class C48212l0 extends AndroidReferenceMatchers {
        public C48212l0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.F0 f02 = shark.F0.f438027l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.text.method.TextKeyListener", "mContext", "In AOSP, TextKeyListener instances are held in a TextKeyListener.sInstances static\narray. The Razer implementation added a mContext field, creating activity leaks.", f02));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$m;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$m, reason: case insensitive filesystem */
    public static final class C48213m extends AndroidReferenceMatchers {
        public C48213m() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.J j12 = shark.J.f438087l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.app.assist.AssistStructure$ViewNodeText", "mText", "AssistStructure (google assistant / autofill) holds on to text spannables on the screen. TextView.ChangeWatcher and android.widget.Editor end up in spans and typically hold on to the view hierarchy", j12));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$m0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$m0, reason: case insensitive filesystem */
    public static final class C48214m0 extends AndroidReferenceMatchers {
        public C48214m0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            String name = WeakReference.class.getName();
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.a(name, "referent"));
            arrayList.add(D.a("leakcanary.KeyedWeakReference", "referent"));
            arrayList.add(D.a(SoftReference.class.getName(), "referent"));
            arrayList.add(D.a(PhantomReference.class.getName(), "referent"));
            arrayList.add(D.a("java.lang.ref.Finalizer", "prev"));
            arrayList.add(D.a("java.lang.ref.Finalizer", "element"));
            arrayList.add(D.a("java.lang.ref.Finalizer", "next"));
            arrayList.add(D.a("java.lang.ref.FinalizerReference", "prev"));
            arrayList.add(D.a("java.lang.ref.FinalizerReference", "element"));
            arrayList.add(D.a("java.lang.ref.FinalizerReference", "next"));
            arrayList.add(D.a("sun.misc.Cleaner", "prev"));
            arrayList.add(D.a("sun.misc.Cleaner", "next"));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$n;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$n, reason: case insensitive filesystem */
    public static final class C48215n extends AndroidReferenceMatchers {
        public C48215n() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.K k12 = shark.K.f438091l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.media.AudioManager$1", "this$0", "Prior to Android M, VideoView required audio focus from AudioManager and never abandoned it, which leaks the Activity context through the AudioManager. The root of the problem is that AudioManager uses whichever context it receives, which in the case of the VideoView example is an Activity, even though it only needs the application's context. The issue is fixed in Android M, and the AudioManager now uses the application's context. Tracked here: https://code.google.com/p/android/issues/detail?id=152173 Fix: https://gist.github.com/jankovd/891d96f476f7a9ce24e2", k12));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$n0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$n0, reason: case insensitive filesystem */
    public static final class C48216n0 extends AndroidReferenceMatchers {
        public C48216n0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.G0 g02 = shark.G0.f438044l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.d(g02, "android.graphics.animation.RenderNodeAnimator", "When a view is detached while a ripple animation is still playing on it, the native code\ndoesn't properly end the RenderNodeAnimator, i.e. it doesn't call\nRenderNodeAnimator.callOnFinished and doesn't let go of the native ref, leading to a\nleak of the detached animated view.\nTracked at: https://issuetracker.google.com/issues/229136453"));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$o;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$o, reason: case insensitive filesystem */
    public static final class C48217o extends AndroidReferenceMatchers {
        public C48217o() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.L l12 = shark.L.f438096l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.e("android.media.AudioManager", "mContext_static", "Samsung added a static mContext_static field to AudioManager, holds a reference to the activity. Observed here: https://github.com/square/leakcanary/issues/32", l12));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$o0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class o0 extends AndroidReferenceMatchers {
        public o0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.H0 h02 = shark.H0.f438046l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.content.res.Resources", "mContext", "In AOSP the Resources class does not have a context. Here we have ZygoteInit.mResources (static field) holding on to a Resources instance that has a context that is the activity. Observed here: https://github.com/square/leakcanary/issues/1#issue-74450184", h02));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$p;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$p, reason: case insensitive filesystem */
    public static final class C48218p extends AndroidReferenceMatchers {
        public C48218p() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            D d12 = AndroidReferenceMatchers.f437999d;
            D.c(d12, "WV.R9", "e", "Android System WebView leak: https://bugs.chromium.org/p/chromium/issues/detail?id=1499154", null, 8);
            D.c(d12, "WV.a6", "c", "Android System WebView leak: https://bugs.chromium.org/p/chromium/issues/detail?id=1499154", null, 8);
            D.c(d12, "WV.H5", "c", "Android System WebView leak: https://bugs.chromium.org/p/chromium/issues/detail?id=1499154", null, 8);
            D.c(d12, "WV.Y9", "e", "Android System WebView leak: https://bugs.chromium.org/p/chromium/issues/detail?id=1499154", null, 8);
            D.c(d12, "WV.U4", "c", "Android System WebView leak: https://bugs.chromium.org/p/chromium/issues/detail?id=1499154", null, 8);
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$p0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class p0 extends AndroidReferenceMatchers {
        public p0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            arrayList.add(D.c(AndroidReferenceMatchers.f437999d, "android.app.SemAppIconSolution", "mContext", null, shark.I0.f438085l, 4));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$q;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$q, reason: case insensitive filesystem */
    public static final class C48219q extends AndroidReferenceMatchers {
        public C48219q() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            D.f(AndroidReferenceMatchers.f437999d, "org.chromium.android_webview.AwContents", "A0", "WindowAndroidWrapper has a strong ref to the context key so this breaks the WeakHashMap\ncontracts and WeakHashMap is unable to perform its job of auto cleaning.\nhttps://github.com/square/leakcanary/issues/2538", null, 8);
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$q0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class q0 extends AndroidReferenceMatchers {
        public q0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.J0 j02 = shark.J0.f438088l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.d(j02, "com.samsung.android.content.clipboard.SemClipboardManager$1", "SemClipboardManager inner classes are held by native references due to IPC calls"));
            arrayList.add(D.d(shark.K0.f438092l, "com.samsung.android.content.clipboard.SemClipboardManager$3", "SemClipboardManager inner classes are held by native references due to IPC calls"));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$r;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$r, reason: case insensitive filesystem */
    public static final class C48220r extends AndroidReferenceMatchers {
        public C48220r() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            arrayList.add(D.f(AndroidReferenceMatchers.f437999d, "com.android.org.chromium.android_webview.AwResource", "sResources", null, shark.M.f438141l, 4));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$r0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class r0 extends AndroidReferenceMatchers {
        public r0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.L0 l02 = shark.L0.f438097l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("com.samsung.android.emergencymode.SemEmergencyManager", "mContext", "SemEmergencyManager is a static singleton that leaks a DecorContext. Fix: https://gist.github.com/jankovd/a210460b814c04d500eb12025902d60d", l02));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$s;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$s, reason: case insensitive filesystem */
    public static final class C48221s extends AndroidReferenceMatchers {
        public C48221s() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.N n12 = shark.N.f438161l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("com.android.internal.policy.BackdropFrameRenderer", "mDecorView", "When BackdropFrameRenderer.releaseRenderer() is called, there's an unknown case where mRenderer becomes null but mChoreographer doesn't and the thread doesn't stop and ends up leaking mDecorView which itself holds on to a destroyed activity", n12));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$s0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class s0 extends AndroidReferenceMatchers {
        public s0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            arrayList.add(D.c(AndroidReferenceMatchers.f437999d, "com.samsung.android.knox.SemPersonaManager", "mContext", null, shark.M0.f438142l, 4));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$t;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$t, reason: case insensitive filesystem */
    public static final class C48222t extends AndroidReferenceMatchers {
        public C48222t() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.O o12 = shark.O.f438168l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.hardware.biometrics.BiometricPrompt", "mFingerprintManager", "BiometricPrompt holds on to a FingerprintManager which holds on to a destroyed activity.", o12));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$t0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class t0 extends AndroidReferenceMatchers {
        public t0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.N0 n02 = shark.N0.f438162l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("com.lge.systemservice.core.SmartCoverManager", "mContext", "SmartCoverManager$CallbackRegister is a callback held by a native ref, and SmartCoverManager ends up leaking an activity context.", n02));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$u;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$u, reason: case insensitive filesystem */
    public static final class C48223u extends AndroidReferenceMatchers {
        public C48223u() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.P p12 = shark.P.f438190l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.os.Message", "obj", "A thread waiting on a blocking queue will leak the last dequeued object as a stack local reference. So when a HandlerThread becomes idle, it keeps a local reference to the last message it received. That message then gets recycled and can be used again. As long as all messages are recycled after being used, this won't be a problem, because these references are cleared when being recycled. However, dialogs create template Message instances to be copied when a message needs to be sent. These Message templates holds references to the dialog listeners, which most likely leads to holding a reference onto the activity in some way. Dialogs never recycle their template Message, assuming these Message instances will get GCed when the dialog is GCed. The combination of these two things creates a high potential for memory leaks as soon as you use dialogs. These memory leaks might be temporary, but some handler threads sleep for a long time. This leak is fixed by AndroidLeakFixes.FLUSH_HANDLER_THREADS in plumber-android. Bug report: https://issuetracker.google.com/issues/146144484 Fixed in Android 12: https://cs.android.com/android/_/android/platform/frameworks/base/+/d577e728e9bccbafc707af3060ea914caa73c14f", p12));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$u0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class u0 extends AndroidReferenceMatchers {
        public u0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            O0 o02 = O0.f438169l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.widget.Editor$SpanController", "this$0", "Editor inserts a special span, which has a reference to the EditText. That span is a NoCopySpan, which makes sure it gets dropped when creating a new SpannableStringBuilder from a given CharSequence. TextView.onSaveInstanceState() does a copy of its mText before saving it in the bundle. Prior to KitKat, that copy was done using the SpannableString constructor, instead of SpannableStringBuilder. The SpannableString constructor does not drop NoCopySpan spans. So we end up with a saved state that holds a reference to the textview and therefore the entire view hierarchy & activity context. Fix: https://github.com/android/platform_frameworks_base/commit/af7dcdf35a37d7a7dbaad7d9869c1c91bce2272b . To fix this, you could override TextView.onSaveInstanceState(), and then use reflection to access TextView.SavedState.mText and clear the NoCopySpan spans.", o02));
            arrayList.add(D.b("android.widget.Editor$EasyEditSpanController", "this$0", "Editor inserts a special span, which has a reference to the EditText. That span is a NoCopySpan, which makes sure it gets dropped when creating a new SpannableStringBuilder from a given CharSequence. TextView.onSaveInstanceState() does a copy of its mText before saving it in the bundle. Prior to KitKat, that copy was done using the SpannableString constructor, instead of SpannableStringBuilder. The SpannableString constructor does not drop NoCopySpan spans. So we end up with a saved state that holds a reference to the textview and therefore the entire view hierarchy & activity context. Fix: https://github.com/android/platform_frameworks_base/commit/af7dcdf35a37d7a7dbaad7d9869c1c91bce2272b . To fix this, you could override TextView.onSaveInstanceState(), and then use reflection to access TextView.SavedState.mText and clear the NoCopySpan spans.", P0.f438191l));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$v;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$v, reason: case insensitive filesystem */
    public static final class C48224v extends AndroidReferenceMatchers {
        public C48224v() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.Q q12 = shark.Q.f438198l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.e("android.widget.BubblePopupHelper", "sHelper", "A static helper for EditText bubble popups leaks a reference to the latest focused view.", q12));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$v0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class v0 extends AndroidReferenceMatchers {
        public v0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            Q0 q02 = Q0.f438199l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.speech.SpeechRecognizer$InternalListener", "this$0", "Prior to Android 5, SpeechRecognizer.InternalListener was a non static inner class and leaked the SpeechRecognizer which leaked an activity context. Fixed in AOSP: https://github.com/android/platform_frameworks_base/commit /b37866db469e81aca534ff6186bdafd44352329b", q02));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$w;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$w, reason: case insensitive filesystem */
    public static final class C48225w extends AndroidReferenceMatchers {
        public C48225w() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.S s5 = shark.S.f438202l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.sec.clipboard.ClipboardExManager", "mContext", "android.sec.clipboard.ClipboardExManager$IClipboardDataPasteEventImpl$1 is a native callback that holds IClipboardDataPasteEventImpl which holds ClipboardExManager which has a destroyed activity as mContext", s5));
            arrayList.add(D.b("android.sec.clipboard.ClipboardExManager", "mPersonaManager", "android.sec.clipboard.ClipboardExManager$IClipboardDataPasteEventImpl$1 is a native callback that holds IClipboardDataPasteEventImpl which holds ClipboardExManager which holds PersonaManager which has a destroyed activity as mContext", shark.T.f438206l));
            arrayList.add(D.b("android.widget.TextView$IClipboardDataPasteEventImpl", "this$0", "TextView$IClipboardDataPasteEventImpl$1 is held by a native ref, and IClipboardDataPasteEventImpl ends up leaking a detached textview", shark.U.f438211l));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$w0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class w0 extends AndroidReferenceMatchers {
        public w0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            R0 r02 = R0.f438200l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.widget.SpellChecker$1", "this$0", "SpellChecker holds on to a detached view that points to a destroyed activity. mSpellRunnable is being enqueued, and that callback should be removed when  closeSession() is called. Maybe closeSession() wasn't called, or maybe it was  called after the view was detached.", r02));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$x;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$x, reason: case insensitive filesystem */
    public static final class C48226x extends AndroidReferenceMatchers {
        public C48226x() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.V v12 = shark.V.f438219l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.sec.clipboard.ClipboardUIManager", "mContext", "ClipboardUIManager is a static singleton that leaks an activity context. Fix: trigger a call to ClipboardUIManager.getInstance() in Application.onCreate() , so that the ClipboardUIManager instance gets cached with a reference to the application context. Example: https://gist.github.com/cypressious/91c4fb1455470d803a602838dfcd5774", v12));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$x0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class x0 extends AndroidReferenceMatchers {
        public x0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            S0 s02 = S0.f438203l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.view.textservice.SpellCheckerSession$1", "this$0", "SpellCheckerSessionListenerImpl.mHandler is leaking destroyed Activity when the SpellCheckerSession is closed before the service is connected. Tracked here: https://code.google.com/p/android/issues/detail?id=172542", s02));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$y;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$y, reason: case insensitive filesystem */
    public static final class C48227y extends AndroidReferenceMatchers {
        public C48227y() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.W w12 = shark.W.f438222l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("android.companion.CompanionDeviceService$Stub", "this$0", "Android 12 added android.companion.CompanionDeviceService, a bounded service extended by\napplications to which the system binds. CompanionDeviceService.Stub is an inner class\nthat holds a reference to CompanionDeviceService, which itself holds a Stub instance\nthat's not nullified after the service is destroyed.\nIntroduced in https://android.googlesource.com/platform/frameworks/base/+/df69bbaf29e41d9df105612500c27be730feedfc\nSource code: https://android.googlesource.com/platform/frameworks/base/+/master/core/java/android/companion/CompanionDeviceService.java", w12));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$y0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class y0 extends AndroidReferenceMatchers {
        public y0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            T0 t02 = T0.f438207l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.e("com.samsung.android.smartclip.SpenGestureManager", "mContext", "SpenGestureManager has a static mContext field that leaks a reference to the activity. Yes, a STATIC mContext field.", t02));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$z;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidReferenceMatchers$z, reason: case insensitive filesystem */
    public static final class C48228z extends AndroidReferenceMatchers {
        public C48228z() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            shark.X x12 = shark.X.f438225l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.b("ConnectivityManager$CallbackHandler", "this$0", "ConnectivityManager.CallbackHandler instances can be held statically and hold\na reference to ConnectivityManager instances created with a local context (e.g. activity).\nFiled: https://issuetracker.google.com/issues/258053962\nFixed in API 34.", x12));
        }
    }

    /* compiled from: AndroidReferenceMatchers.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidReferenceMatchers$z0;", "Lshark/AndroidReferenceMatchers;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class z0 extends AndroidReferenceMatchers {
        public z0() {
            throw null;
        }

        @Override // shark.AndroidReferenceMatchers
        public final void a(@Y61.k ArrayList arrayList) {
            U0 u02 = U0.f438212l;
            AndroidReferenceMatchers.f437999d.getClass();
            arrayList.add(D.e("android.widget.TextView", "mTargetView", "Samsung added a static mTargetView field to TextView which holds on to detached views.", u02));
        }
    }

    public AndroidReferenceMatchers() {
        throw null;
    }

    public AndroidReferenceMatchers(String str, int i12, C42822w c42822w) {
    }

    public static AndroidReferenceMatchers valueOf(String str) {
        return (AndroidReferenceMatchers) Enum.valueOf(AndroidReferenceMatchers.class, str);
    }

    public static AndroidReferenceMatchers[] values() {
        return (AndroidReferenceMatchers[]) f437997b.clone();
    }

    public abstract void a(@Y61.k ArrayList arrayList);
}
