package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.networktasks.api.ConfigProvider;
import com.yandex.metrica.networktasks.api.DefaultNetworkResponseHandler;
import com.yandex.metrica.networktasks.api.DefaultResponseParser;
import com.yandex.metrica.networktasks.api.FullUrlFormer;
import com.yandex.metrica.networktasks.api.RequestBodyEncrypter;
import com.yandex.metrica.networktasks.api.RequestDataHolder;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import com.yandex.metrica.networktasks.api.SendingDataTaskHelper;
import com.yandex.metrica.networktasks.api.UnderlyingNetworkTask;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.yandex.metrica.impl.ob.cd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38728cd implements UnderlyingNetworkTask {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39112s2 f380313a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38976mc f380314b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38673a8 f380315c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C38778ed f380316d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final Fc f380317e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final Pg f380318f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final FullUrlFormer f380319g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final ConfigProvider f380320h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final RequestDataHolder f380321i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final ResponseDataHolder f380322j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    private final SendingDataTaskHelper f380323k;

    /* renamed from: l, reason: collision with root package name */
    private long f380324l;

    /* renamed from: m, reason: collision with root package name */
    private C38753dd f380325m;

    public C38728cd(@j.N Context context, @j.N C39112s2 c39112s2, @j.N Fc fc2, @j.N Pg pg2, @j.N ConfigProvider configProvider, @j.N RequestDataHolder requestDataHolder, @j.N ResponseDataHolder responseDataHolder, @j.N FullUrlFormer fullUrlFormer, @j.N RequestBodyEncrypter requestBodyEncrypter) {
        this(c39112s2, fc2, F0.g().w().a(), pg2, new C38778ed(context), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider, new SendingDataTaskHelper(requestBodyEncrypter, new Ql(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler()));
    }

    private boolean a() {
        C38753dd c38753ddA = this.f380316d.a(this.f380314b.f381040d);
        this.f380325m = c38753ddA;
        C39054pf c39054pf = c38753ddA.f380371c;
        if (c39054pf.f381296b.length == 0 && c39054pf.f381295a.length == 0) {
            return false;
        }
        return this.f380323k.a(MessageNano.toByteArray(c39054pf));
    }

    private void b() {
        long jF2 = this.f380315c.f() + 1;
        this.f380324l = jF2;
        this.f380318f.a(jF2);
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    @j.N
    public String description() {
        return "LocationTask";
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    @j.N
    public FullUrlFormer getFullUrlFormer() {
        return this.f380319g;
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    @j.N
    public RequestDataHolder getRequestDataHolder() {
        return this.f380321i;
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    @j.N
    public ResponseDataHolder getResponseDataHolder() {
        return this.f380322j;
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    @j.P
    public RetryPolicyConfig getRetryPolicyConfig() {
        return ((C38828gd) this.f380320h.getConfig()).q();
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    @j.P
    public SSLSocketFactory getSslSocketFactory() {
        F0.g().t().getClass();
        return null;
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public boolean onCreateTask() {
        C38828gd c38828gd = (C38828gd) this.f380320h.getConfig();
        if (this.f380313a.d() || TextUtils.isEmpty(c38828gd.g()) || TextUtils.isEmpty(c38828gd.w()) || A2.b(this.f380319g.f382405a)) {
            return false;
        }
        return a();
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onPerformRequest() {
        SendingDataTaskHelper sendingDataTaskHelper = this.f380323k;
        sendingDataTaskHelper.f382443c.getClass();
        sendingDataTaskHelper.f382444d.a(System.currentTimeMillis());
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onPostRequestComplete(boolean z12) {
        if (z12 || A2.b(this.f380322j.f382435a)) {
            this.f380316d.a(this.f380325m);
        }
        this.f380315c.c(this.f380324l);
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public boolean onRequestComplete() {
        SendingDataTaskHelper sendingDataTaskHelper = this.f380323k;
        DefaultResponseParser.Response response = (DefaultResponseParser.Response) sendingDataTaskHelper.f382446f.handle(sendingDataTaskHelper.f382445e);
        return response != null && "accepted".equals(response.f382399a);
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onRequestError(@j.P Throwable th2) {
        this.f380315c.c(this.f380324l);
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onSuccessfulTaskFinished() {
        this.f380317e.a();
    }

    @j.k0
    public C38728cd(@j.N C39112s2 c39112s2, @j.N Fc fc2, @j.N C38673a8 c38673a8, @j.N Pg pg2, @j.N C38778ed c38778ed, @j.N FullUrlFormer fullUrlFormer, @j.N RequestDataHolder requestDataHolder, @j.N ResponseDataHolder responseDataHolder, @j.N ConfigProvider configProvider, @j.N SendingDataTaskHelper sendingDataTaskHelper) {
        this.f380323k = sendingDataTaskHelper;
        this.f380313a = c39112s2;
        this.f380317e = fc2;
        this.f380320h = configProvider;
        C38828gd c38828gd = (C38828gd) configProvider.getConfig();
        this.f380314b = c38828gd.z();
        this.f380315c = c38673a8;
        this.f380316d = c38778ed;
        this.f380318f = pg2;
        this.f380321i = requestDataHolder;
        this.f380322j = responseDataHolder;
        this.f380319g = fullUrlFormer;
        b();
        List<String> listA = c38828gd.A();
        if (listA == null) {
            fullUrlFormer.getClass();
            listA = new ArrayList<>();
        }
        fullUrlFormer.f382405a = listA;
    }

    @Override // com.yandex.metrica.networktasks.api.UnderlyingNetworkTask
    public void onShouldNotExecute() {
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
}
