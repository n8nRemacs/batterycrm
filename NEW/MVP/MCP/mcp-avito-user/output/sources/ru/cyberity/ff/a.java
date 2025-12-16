package ru.cyberity.ff;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import ru.cyberity.cbr.core.data.source.dynamic.c;
import ru.cyberity.ff.core.b;

/* compiled from: Features.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\rJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000b\u0010\u0010J\u0019\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR.\u0010 \u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010)\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R\u0017\u0010,\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\u0017\u0010/\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010%R\u0017\u00101\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b0\u0010%R\u0017\u00102\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b\u0018\u0010%R\u0017\u00104\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b3\u0010%R\u0017\u00106\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b5\u0010%R\u0017\u00108\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b7\u0010%R\u0017\u0010;\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b9\u0010#\u001a\u0004\b:\u0010%R\u0017\u0010<\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b:\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010>\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b=\u0010#\u001a\u0004\b*\u0010%R\u0017\u0010@\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b?\u0010#\u001a\u0004\b-\u0010%R\u0017\u0010B\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b5\u0010#\u001a\u0004\bA\u0010%R\u0017\u0010C\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bA\u0010#\u001a\u0004\b\u000b\u0010%R\u0017\u0010E\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\bD\u0010%R\u0017\u0010F\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b3\u0010#\u001a\u0004\b9\u0010%R\u0017\u0010G\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bD\u0010#\u001a\u0004\b?\u0010%R\u0017\u0010H\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b7\u0010#\u001a\u0004\b\"\u0010%R\u0017\u0010I\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b=\u0010%¨\u0006J"}, d2 = {"Lru/cyberity/ff/a;", "", "<init>", "()V", "Lkotlin/G0;", "x", "", "name", "", "isEnabled", "value", "a", "(Ljava/lang/String;ZLjava/lang/String;)V", "(Ljava/lang/String;)V", "Lru/cyberity/cbr/core/data/source/dynamic/c$b;", "featureFlags", "(Lru/cyberity/cbr/core/data/source/dynamic/c$b;)V", "", "c", "()Ljava/util/Map;", "Lru/cyberity/ff/model/a;", "w", "()Lru/cyberity/ff/model/a;", "Lru/cyberity/ff/core/b;", "b", "Lru/cyberity/ff/core/b;", "l", "()Lru/cyberity/ff/core/b;", "manager", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/Q;", "Ljava/util/concurrent/ConcurrentHashMap;", "overriddenValues", "Lru/cyberity/ff/core/a;", "d", "Lru/cyberity/ff/core/a;", "h", "()Lru/cyberity/ff/core/a;", "FaceDetector", "e", "s", "SkipGeolocationForm", "f", "i", "FullScreenCamera", "g", "j", "LivenessFaceDetectionDebug", "k", "LivenessShowSettings", "AllowCountryStateDropdownBecomeAutoRequired", "t", "StringResourcesKeys", "q", "ShowBadPhotosDebugInfo", "v", "unsatisfactoryPhotosMobileConfig", "m", "n", "msdkSeamlessDocapture", "documentAutocaptureMobileConfig", "o", "dontLimitCountriesOnAppDataStep", "p", "ekycMasksConfig", "r", "skipAgreementSigning", "agreementsCount", "u", "testIpHeader", "msdkEnableVerificationExitPopup", "overrideVerificationUrl", "androidAllowFaceScanFrameCalibration", "obligatoryNfcScan", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f435638a = new a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private static final b manager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private static final ConcurrentHashMap<String, Q<Boolean, String>> overriddenValues;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private static final ru.cyberity.ff.core.a FaceDetector;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    private static final ru.cyberity.ff.core.a SkipGeolocationForm;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    private static final ru.cyberity.ff.core.a FullScreenCamera;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @k
    private static final ru.cyberity.ff.core.a LivenessFaceDetectionDebug;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @k
    private static final ru.cyberity.ff.core.a LivenessShowSettings;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @k
    private static final ru.cyberity.ff.core.a AllowCountryStateDropdownBecomeAutoRequired;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @k
    private static final ru.cyberity.ff.core.a StringResourcesKeys;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @k
    private static final ru.cyberity.ff.core.a ShowBadPhotosDebugInfo;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @k
    private static final ru.cyberity.ff.core.a unsatisfactoryPhotosMobileConfig;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @k
    private static final ru.cyberity.ff.core.a msdkSeamlessDocapture;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @k
    private static final ru.cyberity.ff.core.a documentAutocaptureMobileConfig;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @k
    private static final ru.cyberity.ff.core.a dontLimitCountriesOnAppDataStep;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @k
    private static final ru.cyberity.ff.core.a ekycMasksConfig;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @k
    private static final ru.cyberity.ff.core.a skipAgreementSigning;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @k
    private static final ru.cyberity.ff.core.a agreementsCount;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @k
    private static final ru.cyberity.ff.core.a testIpHeader;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @k
    private static final ru.cyberity.ff.core.a msdkEnableVerificationExitPopup;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @k
    private static final ru.cyberity.ff.core.a overrideVerificationUrl;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @k
    private static final ru.cyberity.ff.core.a androidAllowFaceScanFrameCalibration;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @k
    private static final ru.cyberity.ff.core.a obligatoryNfcScan;

    static {
        b bVar = new b();
        manager = bVar;
        overriddenValues = new ConcurrentHashMap<>();
        FaceDetector = bVar.a("androidFaceDetector", "Face detector config in liveness step.\n\nEnable or disable MLKit face detector.\nKey: 'mlkit'. Values: 'true' or 'false'.\n\nAddition delay between frames in liveness.\nKey: 'frameDelay'. Values: any reasonable integer.", "{\"mlkit\":\"true\", \"frameDelay\":500}");
        SkipGeolocationForm = b.b(bVar, "skipGeolocationForm", "Skip address confirmation form", null, 4, null);
        FullScreenCamera = b.b(bVar, "livenessFullscreenCamera", "Full-screen camera in liveness check (transparent status bar)", null, 4, null);
        LivenessFaceDetectionDebug = b.b(bVar, "enableFaceDetectionDebug", "Draw a box around face during liveness", null, 4, null);
        LivenessShowSettings = b.b(bVar, "enableFaceShowSettings", "Display a dialog asking for edit settings, in order to change the brightness to full during liveness to highlight the face", null, 4, null);
        AllowCountryStateDropdownBecomeAutoRequired = b.a(bVar, "makeCountryStateDropdownRequiredIfNeeded", "On the Applicant Data screen, set the State (StateOfBirth) field required if the corresponding field (Country or CountryOfBirth) is required and there is a list of states for the selected country", null, 4, null);
        StringResourcesKeys = b.b(bVar, "stringResourcesKeys", "Show string key instead of empty value, or show only keys (value = key)", null, 4, null);
        ShowBadPhotosDebugInfo = b.b(bVar, "showBadPhotosDebugInfo", "Show technical info on screen after analyzing photo quality)", null, 4, null);
        unsatisfactoryPhotosMobileConfig = bVar.a("unsatisfactoryPhotosMobileConfig", "Config for unsatisfactory photos detector in document capture.                ", "{\n  \"android_v127\":{\n    \"enabled\":false,\n    \"model\":\"unsatisfactory_photos_v2.tflite\",\n    \"high_quality_threshold\":0.75,\n    \"low_quality_threshold\":0.2,\n    \"execution_timeout_ms\":3000,\n    \"allow_cache\":true,\n    \"max_blocked_attempts\": 1,\n    \"allowed_steps\":[\n      \"IDENTITY\",\n      \"IDENTITY2\",\n      \"IDENTITY3\",\n      \"IDENTITY4\"\n    ]\n  }\n}");
        msdkSeamlessDocapture = b.a(bVar, "msdkSeamlessDocapture", "Seamless docapture toggle", null, 4, null);
        documentAutocaptureMobileConfig = bVar.a("documentAutocaptureMobileConfig", "Json configuration documentAutocapture ....", "{\n    \"android\": {\n        \"enabled\": false,\n        \"showBounds\": false,\n        \"requiredFrameFillRatio\": 0.4,\n        \"requiredLargestSizeOffsetRatio\": 0.2,\n        \"frameAspectRatio\": 1.0,\n        \"autoCaptureModel\": {\n            \"name\": \"autocapture_v2.tflite\",\n            \"threshold\": 0.7,\n            \"allowCache\": true,\n            \"inputSize\": {\n                \"width\": 384,\n                \"height\": 640\n            },\n            \"outputSize\": 5040\n        },\n        \"badPhotosModel\": {\n            \"name\": \"unsatisfactory_photos_v2.tflite\",\n            \"threshold\": 0.75,\n            \"allowCache\": true\n        },\n        \"frameSize\": {\n            \"width\": 1080,\n            \"height\": 1920\n        },\n        \"imageCaptureUseCaseEnabled\": false\n    }\n}");
        dontLimitCountriesOnAppDataStep = b.a(bVar, "dontLimitCountriesOnAppDataStep", "Don't limit country field list on applicant data step", null, 4, null);
        ekycMasksConfig = b.b(bVar, "ekycTestMasks", "Ekyc masks configuration", null, 4, null);
        skipAgreementSigning = b.a(bVar, "msdkSkipAgreementSigning", "Don't show agreement selector screen if multiple agreements available, or skip signing the agreement on status screen if only one agreement available.", null, 4, null);
        agreementsCount = b.b(bVar, "agreementsCount", "Specify agreements count for the agreement selector screen. Random countries with random agreements will be generated.", null, 4, null);
        testIpHeader = bVar.b("testIpHeader", "value to pass X-Test-Ip over.", "85.214.132.117");
        msdkEnableVerificationExitPopup = b.a(bVar, "msdkEnableVerificationExitPopup", "Show confirmation dialog on closing VideoIdent flow and close the SDK", null, 4, null);
        overrideVerificationUrl = bVar.a("overrideVerificationUrl", "Override base URL and access token to emulate verificationUrl and accessToken on msdkInit", "{\n    \"verificationUrl\": \"http://dev-in.cyberity.ru/\",\n    \"accessToken\" : \"AAA\"\n}");
        androidAllowFaceScanFrameCalibration = b.a(bVar, "androidAllowFaceScanFrameCalibration", "Enable fingerprint collection with FaceScan segment", null, 4, null);
        obligatoryNfcScan = b.a(bVar, "obligatoryNfcScan", "Hide Skip NFC button", null, 4, null);
    }

    private a() {
    }

    public final void a(@k String name, boolean isEnabled, @l String value) {
        overriddenValues.put(name, new Q<>(Boolean.valueOf(isEnabled), value));
        ru.cyberity.ff.core.a aVarA = manager.a(name);
        if (aVarA != null) {
            aVarA.b(isEnabled, value);
        }
    }

    @k
    public final ru.cyberity.ff.core.a b() {
        return AllowCountryStateDropdownBecomeAutoRequired;
    }

    @k
    public final Map<String, Object> c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Collection<ru.cyberity.ff.core.a> collectionB = manager.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionB) {
            if (((ru.cyberity.ff.core.a) obj).g()) {
                arrayList.add(obj);
            }
        }
        Collection<ru.cyberity.ff.core.a> collectionA = manager.a();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : collectionA) {
            if (((ru.cyberity.ff.core.a) obj2).g()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayListH0 = C42745f0.h0(arrayList2, arrayList);
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayListH0, 10));
        Iterator it = arrayListH0.iterator();
        while (it.hasNext()) {
            arrayList3.add(((ru.cyberity.ff.core.a) it.next()).getName());
        }
        if (arrayList3.isEmpty()) {
            arrayList3 = null;
        }
        if (arrayList3 != null) {
            linkedHashMap.put("enabledFFs", arrayList3);
        }
        return linkedHashMap;
    }

    @k
    public final ru.cyberity.ff.core.a d() {
        return androidAllowFaceScanFrameCalibration;
    }

    @k
    public final ru.cyberity.ff.core.a e() {
        return documentAutocaptureMobileConfig;
    }

    @k
    public final ru.cyberity.ff.core.a f() {
        return dontLimitCountriesOnAppDataStep;
    }

    @k
    public final ru.cyberity.ff.core.a g() {
        return ekycMasksConfig;
    }

    @k
    public final ru.cyberity.ff.core.a h() {
        return FaceDetector;
    }

    @k
    public final ru.cyberity.ff.core.a i() {
        return FullScreenCamera;
    }

    @k
    public final ru.cyberity.ff.core.a j() {
        return LivenessFaceDetectionDebug;
    }

    @k
    public final ru.cyberity.ff.core.a k() {
        return LivenessShowSettings;
    }

    @k
    public final b l() {
        return manager;
    }

    @k
    public final ru.cyberity.ff.core.a m() {
        return msdkEnableVerificationExitPopup;
    }

    @k
    public final ru.cyberity.ff.core.a n() {
        return msdkSeamlessDocapture;
    }

    @k
    public final ru.cyberity.ff.core.a p() {
        return overrideVerificationUrl;
    }

    @k
    public final ru.cyberity.ff.core.a q() {
        return ShowBadPhotosDebugInfo;
    }

    @k
    public final ru.cyberity.ff.core.a r() {
        return skipAgreementSigning;
    }

    @k
    public final ru.cyberity.ff.core.a s() {
        return SkipGeolocationForm;
    }

    @k
    public final ru.cyberity.ff.core.a t() {
        return StringResourcesKeys;
    }

    @k
    public final ru.cyberity.ff.core.a u() {
        return testIpHeader;
    }

    @k
    public final ru.cyberity.ff.core.a v() {
        return unsatisfactoryPhotosMobileConfig;
    }

    @k
    public final ru.cyberity.ff.model.a w() {
        Collection<ru.cyberity.ff.core.a> collectionB = manager.b();
        ArrayList arrayList = new ArrayList(C42745f0.q(collectionB, 10));
        Iterator<T> it = collectionB.iterator();
        while (it.hasNext()) {
            arrayList.add(((ru.cyberity.ff.core.a) it.next()).getName());
        }
        return new ru.cyberity.ff.model.a(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x() {
        manager.c();
        Iterator<T> it = overriddenValues.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ru.cyberity.ff.core.a aVarA = manager.a((String) entry.getKey());
            if (aVarA != null) {
                aVarA.b(((Boolean) ((Q) entry.getValue()).f406619b).booleanValue(), (String) ((Q) entry.getValue()).f406620c);
            }
        }
    }

    public final void a(@k String name) {
        overriddenValues.remove(name);
        ru.cyberity.ff.core.a aVarA = manager.a(name);
        if (aVarA != null) {
            aVarA.a();
        }
    }

    public final void a(@k c.b featureFlags) {
        manager.a(featureFlags);
    }

    @k
    public final ru.cyberity.ff.core.a a() {
        return agreementsCount;
    }
}
