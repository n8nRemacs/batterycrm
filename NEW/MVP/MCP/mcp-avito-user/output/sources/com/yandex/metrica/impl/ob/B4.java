package com.yandex.metrica.impl.ob;

import com.yandex.metrica.networktasks.api.ConfigProvider;
import com.yandex.metrica.networktasks.api.DefaultResponseParser;
import com.yandex.metrica.networktasks.api.FullUrlFormer;
import com.yandex.metrica.networktasks.api.NetworkResponseHandler;
import com.yandex.metrica.networktasks.api.NetworkTask;
import com.yandex.metrica.networktasks.api.RequestDataHolder;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import com.yandex.metrica.networktasks.api.UnderlyingNetworkTask;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes7.dex */
public class B4 implements UnderlyingNetworkTask {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ConfigProvider f377808a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38715c0 f377809b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final E4 f377810c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.coreutils.services.f f377811d = new com.yandex.metrica.coreutils.services.e();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final Ql f377812e = new Ql();

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final String f377813f = B4.class.getName() + "@" + Integer.toHexString(hashCode());

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final C38698b8 f377814g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final FullUrlFormer f377815h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final RequestDataHolder f377816i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final ResponseDataHolder f377817j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    private final NetworkResponseHandler f377818k;

    public B4(@j.N ConfigProvider configProvider, @j.N C38715c0 c38715c0, @j.N E4 e42, @j.N C38698b8 c38698b8, @j.N NetworkResponseHandler networkResponseHandler, @j.N RequestDataHolder requestDataHolder, @j.N ResponseDataHolder responseDataHolder, @j.N FullUrlFormer fullUrlFormer) {
        this.f377808a = configProvider;
        this.f377809b = c38715c0;
        this.f377810c = e42;
        this.f377814g = c38698b8;
        this.f377816i = requestDataHolder;
        this.f377817j = responseDataHolder;
        this.f377818k = networkResponseHandler;
        this.f377815h = fullUrlFormer;
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    @j.N
    public String description() {
        return this.f377813f;
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    @j.N
    public FullUrlFormer getFullUrlFormer() {
        return this.f377815h;
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    @j.N
    public RequestDataHolder getRequestDataHolder() {
        return this.f377816i;
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    @j.N
    public ResponseDataHolder getResponseDataHolder() {
        return this.f377817j;
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    @j.P
    public RetryPolicyConfig getRetryPolicyConfig() {
        return null;
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    @j.P
    public SSLSocketFactory getSslSocketFactory() {
        F0.g().t().getClass();
        return null;
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public boolean onCreateTask() throws UnsupportedEncodingException {
        byte[] bArrCompress;
        D4 d42 = (D4) this.f377808a.getConfig();
        boolean zX2 = d42.x();
        boolean zB2 = A2.b(d42.C());
        if (!zX2 || zB2) {
            return false;
        }
        FullUrlFormer fullUrlFormer = this.f377815h;
        List<String> listC = d42.C();
        if (listC == null) {
            fullUrlFormer.getClass();
            listC = new ArrayList<>();
        }
        fullUrlFormer.f382405a = listC;
        byte[] bArrA = new C4(this.f377809b, d42, this.f377810c, new O3(this.f377814g), new C38738cn(1024, "diagnostic event name"), new C38738cn(204800, "diagnostic event value"), new com.yandex.metrica.coreutils.services.e()).a();
        try {
            bArrCompress = this.f377812e.compress(bArrA);
        } catch (Throwable unused) {
            bArrCompress = null;
        }
        if (!A2.a(bArrCompress)) {
            this.f377816i.f382431b.put("Content-Encoding", Arrays.asList("gzip"));
            bArrA = bArrCompress;
        }
        RequestDataHolder requestDataHolder = this.f377816i;
        requestDataHolder.f382430a = NetworkTask.Method.f382425c;
        requestDataHolder.f382432c = bArrA;
        return true;
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onPerformRequest() {
        this.f377816i.a(this.f377811d.b());
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public boolean onRequestComplete() {
        DefaultResponseParser.Response response = (DefaultResponseParser.Response) this.f377818k.handle(this.f377817j);
        return response != null && "accepted".equals(response.f382399a);
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onShouldNotExecute() {
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onSuccessfulTaskFinished() {
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onTaskAdded() {
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onTaskFinished() {
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onTaskRemoved() {
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onUnsuccessfulTaskFinished() {
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onPostRequestComplete(boolean z12) {
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onRequestError(@j.P Throwable th2) {
    }
}
