package com.yandex.metrica.impl.ob;

import com.yandex.metrica.networktasks.api.ConfigProvider;
import com.yandex.metrica.networktasks.api.FullUrlFormer;
import com.yandex.metrica.networktasks.api.NetworkResponseHandler;
import com.yandex.metrica.networktasks.api.RequestDataHolder;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import com.yandex.metrica.networktasks.api.UnderlyingNetworkTask;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.yandex.metrica.impl.ob.q2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39065q2 implements UnderlyingNetworkTask {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39104ri f381440a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private Ui f381441b;

    /* renamed from: c, reason: collision with root package name */
    private EnumC38833gi f381442c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final RequestDataHolder f381443d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final ConfigProvider f381444e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final ResponseDataHolder f381445f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final FullUrlFormer f381446g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final NetworkResponseHandler f381447h;

    public C39065q2(@j.N C39104ri c39104ri, @j.N FullUrlFormer fullUrlFormer, @j.N RequestDataHolder requestDataHolder, @j.N ResponseDataHolder responseDataHolder, @j.N ConfigProvider configProvider) {
        this(c39104ri, new C39041p2(), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider);
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    @j.N
    public String description() {
        return "Startup task for component: " + this.f381440a.a().toString();
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    @j.N
    public FullUrlFormer getFullUrlFormer() {
        return this.f381446g;
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    @j.N
    public RequestDataHolder getRequestDataHolder() {
        return this.f381443d;
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    @j.N
    public ResponseDataHolder getResponseDataHolder() {
        return this.f381445f;
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    @j.P
    public RetryPolicyConfig getRetryPolicyConfig() {
        return ((Mg) this.f381444e.getConfig()).q();
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    @j.P
    public SSLSocketFactory getSslSocketFactory() {
        F0.g().t().getClass();
        return null;
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public boolean onCreateTask() {
        this.f381443d.f382431b.put("Accept-Encoding", Arrays.asList("encrypted"));
        return this.f381440a.e();
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onPostRequestComplete(boolean z12) {
        if (z12) {
            return;
        }
        this.f381442c = EnumC38833gi.PARSE;
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public boolean onRequestComplete() {
        Ui ui2 = (Ui) this.f381447h.handle(this.f381445f);
        this.f381441b = ui2;
        return ui2 != null;
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onRequestError(@j.P Throwable th2) {
        this.f381442c = EnumC38833gi.NETWORK;
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onShouldNotExecute() {
        this.f381442c = EnumC38833gi.NETWORK;
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onSuccessfulTaskFinished() {
        Ui ui2 = this.f381441b;
        if (ui2 == null || this.f381445f.f382437c == null) {
            return;
        }
        this.f381440a.a(ui2, (Mg) this.f381444e.getConfig(), this.f381445f.f382437c);
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onUnsuccessfulTaskFinished() {
        if (this.f381442c == null) {
            this.f381442c = EnumC38833gi.UNKNOWN;
        }
        this.f381440a.a(this.f381442c);
    }

    @j.k0
    public C39065q2(@j.N C39104ri c39104ri, @j.N C39041p2 c39041p2, @j.N FullUrlFormer fullUrlFormer, @j.N RequestDataHolder requestDataHolder, @j.N ResponseDataHolder responseDataHolder, @j.N ConfigProvider configProvider) {
        this.f381440a = c39104ri;
        this.f381447h = c39041p2;
        this.f381443d = requestDataHolder;
        this.f381445f = responseDataHolder;
        this.f381444e = configProvider;
        this.f381446g = fullUrlFormer;
        List<String> listI = ((Mg) configProvider.getConfig()).I();
        if (listI == null) {
            fullUrlFormer.getClass();
            listI = new ArrayList<>();
        }
        fullUrlFormer.f382405a = listI;
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onPerformRequest() {
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
}
