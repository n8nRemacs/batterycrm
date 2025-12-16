package com.vk.id.captcha.web;

import Y41.l;
import Y61.k;
import android.os.Handler;
import android.webkit.JavascriptInterface;
import com.vk.id.captcha.api.VKCaptcha;
import com.vk.id.captcha.sensors.SensorsDataRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VKCaptchaJSInterface.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001c\u0010\u000b\u001a\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0017\u0010\u0014R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR*\u0010\u000b\u001a\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\n\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001f¨\u0006!"}, d2 = {"Lcom/vk/id/captcha/web/VKCaptchaJSInterface;", "Lcom/vk/id/captcha/web/VKCaptchaBridge;", "Landroid/os/Handler;", "handler", "Lkotlin/Function0;", "Lkotlin/G0;", "onClose", "Lkotlin/Function1;", "", "Lcom/vk/id/captcha/sensors/model/SensorData;", "Lcom/vk/id/captcha/sensors/model/SensorsData;", "onDataUpdate", "Lcom/vk/id/captcha/sensors/SensorsDataRepository;", "sensorsDataRepository", "", "domain", "<init>", "(Landroid/os/Handler;LY41/a;LY41/l;Lcom/vk/id/captcha/sensors/SensorsDataRepository;Ljava/lang/String;)V", "data", "VKCaptchaCloseCaptcha", "(Ljava/lang/String;)V", "VKCaptchaGetResult", "VKCaptchaListenSensorsStart", "VKCaptchaListenSensorsStop", "Ljava/lang/String;", "Landroid/os/Handler;", "", "isClosedByUser", "Z", "LY41/a;", "LY41/l;", "Lcom/vk/id/captcha/sensors/SensorsDataRepository;", "Companion", "captcha_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.vk.id.captcha.web.e, reason: from Kotlin metadata */
/* loaded from: classes7.dex */
public final class VKCaptchaJSInterface {

    /* renamed from: a, reason: collision with root package name */
    @k
    private final Handler f366858a;

    /* renamed from: b, reason: collision with root package name */
    @k
    private Y41.a<G0> f366859b;

    /* renamed from: c, reason: collision with root package name */
    @k
    private final l<List<? extends com.vk.id.captcha.sensors.a.a>, G0> f366860c;

    /* renamed from: d, reason: collision with root package name */
    @k
    private final SensorsDataRepository f366861d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    private final String f366862e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f366863f = true;

    /* compiled from: VKCaptchaJSInterface.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/vk/id/captcha/sensors/model/SensorData;", "Lcom/vk/id/captcha/sensors/model/SensorsData;", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.vk.id.captcha.web.e$b */
    public static final class b extends N implements l<List<? extends com.vk.id.captcha.sensors.a.a>, G0> {
        public b() {
            super(1);
        }

        public final void a(@k List<? extends com.vk.id.captcha.sensors.a.a> list) {
            VKCaptchaJSInterface.this.f366860c.invoke(list);
        }

        @Override // Y41.l
        public final /* synthetic */ G0 invoke(List<? extends com.vk.id.captcha.sensors.a.a> list) {
            a(list);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VKCaptchaJSInterface(@k Handler handler, @k Y41.a<G0> aVar, @k l<? super List<? extends com.vk.id.captcha.sensors.a.a>, G0> lVar, @k SensorsDataRepository sensorsDataRepository, @Y61.l String str) {
        this.f366858a = handler;
        this.f366859b = aVar;
        this.f366860c = lVar;
        this.f366861d = sensorsDataRepository;
        this.f366862e = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(JSONObject jSONObject, VKCaptchaJSInterface vKCaptchaJSInterface) {
        VKCaptcha.INSTANCE.setResult$captcha_release(jSONObject.getString("token"), vKCaptchaJSInterface.f366862e);
    }

    @JavascriptInterface
    public final void VKCaptchaCloseCaptcha(@k String data) {
        if (this.f366863f) {
            VKCaptcha.INSTANCE.closeCaptcha();
        }
        this.f366859b.invoke();
    }

    @JavascriptInterface
    public final void VKCaptchaGetResult(@k String data) {
        try {
            JSONObject jSONObject = new JSONObject(data);
            this.f366863f = false;
            this.f366858a.post(new h(0, jSONObject, this));
            this.f366861d.a();
        } catch (JSONException e12) {
            e12.toString();
        }
    }

    @JavascriptInterface
    public final void VKCaptchaListenSensorsStart(@k String data) throws JSONException {
        com.vk.id.captcha.sensors.a.b bVar;
        try {
            JSONObject jSONObject = new JSONObject(data);
            int iOptInt = jSONObject.optInt("period", -1);
            JSONArray jSONArray = jSONObject.getJSONArray("bridge_sensors_list");
            if (iOptInt == -1) {
                throw new IllegalStateException("No period value was provided from WebView");
            }
            SensorsDataRepository sensorsDataRepository = this.f366861d;
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i12 = 0; i12 < length; i12++) {
                String string = jSONArray.get(i12).toString();
                int iHashCode = string.hashCode();
                if (iHashCode != -1068318794) {
                    if (iHashCode != 325741829) {
                        bVar = (iHashCode == 697872463 && string.equals("accelerometer")) ? com.vk.id.captcha.sensors.a.b.f366810a : null;
                    } else if (string.equals("gyroscope")) {
                        bVar = com.vk.id.captcha.sensors.a.b.f366811b;
                    }
                } else if (string.equals("motion")) {
                    bVar = com.vk.id.captcha.sensors.a.b.f366812c;
                }
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
            sensorsDataRepository.a(arrayList, iOptInt, new b());
        } catch (JSONException e12) {
            e12.toString();
        }
    }

    @JavascriptInterface
    public final void VKCaptchaListenSensorsStop(@k String data) {
        this.f366861d.a();
    }
}
