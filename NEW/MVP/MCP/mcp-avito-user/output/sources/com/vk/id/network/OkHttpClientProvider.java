package com.vk.id.network;

import Y61.k;
import android.content.Context;
import com.vk.id.captcha.okhttp.api.CaptchaHandlingInterceptor;
import com.vk.id.common.InternalVKIDApi;
import com.vk.id.logger.InternalVKIDLog;
import com.vk.id.logger.InternalVKIDLogger;
import com.vk.id.network.useragent.UserAgentInterceptor;
import com.vk.id.network.useragent.UserAgentProvider;
import j.k0;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.io.w;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43047d;
import okhttp3.CertificatePinner;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.tls.Certificates;
import okhttp3.tls.HandshakeCertificates;

/* compiled from: OkHttpClientProvider.kt */
@s0
@InternalVKIDApi
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\f\u0010\u000b\u001a\u00020\f*\u00020\fH\u0002J\r\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0002\b\u000eJ\f\u0010\u000f\u001a\u00020\f*\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/vk/id/network/OkHttpClientProvider;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "provide", "Lokhttp3/OkHttpClient;", "additionalInterceptors", "", "Lokhttp3/Interceptor;", "addRussianTrustedRootCA", "Lokhttp3/OkHttpClient$Builder;", "provideBuilderWithSslPinning", "provideBuilderWithSslPinning$network_release", "addVKPins", "isDebuggable", "", "loggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "Companion", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OkHttpClientProvider {

    @k
    private static final Companion Companion = new Companion(null);

    @k
    private final Context context;

    /* compiled from: OkHttpClientProvider.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/vk/id/network/OkHttpClientProvider$Companion;", "", "<init>", "()V", "HOST_NAME_API", "", "OKHTTP_TIMEOUT_SECONDS", "", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        private Companion() {
        }
    }

    public OkHttpClientProvider(@k Context context) {
        this.context = context;
    }

    private final OkHttpClient.Builder addRussianTrustedRootCA(OkHttpClient.Builder builder) {
        HandshakeCertificates.Builder builderAddTrustedCertificate = new HandshakeCertificates.Builder().addTrustedCertificate(Certificates.decodeCertificatePem("-----BEGIN CERTIFICATE-----\nMIIFwjCCA6qgAwIBAgICEAAwDQYJKoZIhvcNAQELBQAwcDELMAkGA1UEBhMCUlUx\nPzA9BgNVBAoMNlRoZSBNaW5pc3RyeSBvZiBEaWdpdGFsIERldmVsb3BtZW50IGFu\nZCBDb21tdW5pY2F0aW9uczEgMB4GA1UEAwwXUnVzc2lhbiBUcnVzdGVkIFJvb3Qg\nQ0EwHhcNMjIwMzAxMjEwNDE1WhcNMzIwMjI3MjEwNDE1WjBwMQswCQYDVQQGEwJS\nVTE/MD0GA1UECgw2VGhlIE1pbmlzdHJ5IG9mIERpZ2l0YWwgRGV2ZWxvcG1lbnQg\nYW5kIENvbW11bmljYXRpb25zMSAwHgYDVQQDDBdSdXNzaWFuIFRydXN0ZWQgUm9v\ndCBDQTCCAiIwDQYJKoZIhvcNAQEBBQADggIPADCCAgoCggIBAMfFOZ8pUAL3+r2n\nqqE0Zp52selXsKGFYoG0GM5bwz1bSFtCt+AZQMhkWQheI3poZAToYJu69pHLKS6Q\nXBiwBC1cvzYmUYKMYZC7jE5YhEU2bSL0mX7NaMxMDmH2/NwuOVRj8OImVa5s1F4U\nzn4Kv3PFlDBjjSjXKVY9kmjUBsXQrIHeaqmUIsPIlNWUnimXS0I0abExqkbdrXbX\nYwCOXhOO2pDUx3ckmJlCMUGacUTnylyQW2VsJIyIGA8V0xzdaeUXg0VZ6ZmNUr5Y\nBer/EAOLPb8NYpsAhJe2mXjMB/J9HNsoFMBFJ0lLOT/+dQvjbdRZoOT8eqJpWnVD\nU+QL/qEZnz57N88OWM3rabJkRNdU/Z7x5SFIM9FrqtN8xewsiBWBI0K6XFuOBOTD\n4V08o4TzJ8+Ccq5XlCUW2L48pZNCYuBDfBh7FxkB7qDgGDiaftEkZZfApRg2E+M9\nG8wkNKTPLDc4wH0FDTijhgxR3Y4PiS1HL2Zhw7bD3CbslmEGgfnnZojNkJtcLeBH\nBLa52/dSwNU4WWLubaYSiAmA9IUMX1/RpfpxOxd4Ykmhz97oFbUaDJFipIggx5sX\nePAlkTdWnv+RWBxlJwMQ25oEHmRguNYf4Zr/Rxr9cS93Y+mdXIZaBEE0KS2iLRqa\nOiWBki9IMQU4phqPOBAaG7A+eP8PAgMBAAGjZjBkMB0GA1UdDgQWBBTh0YHlzlpf\nBKrS6badZrHF+qwshzAfBgNVHSMEGDAWgBTh0YHlzlpfBKrS6badZrHF+qwshzAS\nBgNVHRMBAf8ECDAGAQH/AgEEMA4GA1UdDwEB/wQEAwIBhjANBgkqhkiG9w0BAQsF\nAAOCAgEAALIY1wkilt/urfEVM5vKzr6utOeDWCUczmWX/RX4ljpRdgF+5fAIS4vH\ntmXkqpSCOVeWUrJV9QvZn6L227ZwuE15cWi8DCDal3Ue90WgAJJZMfTshN4OI8cq\nW9E4EG9wglbEtMnObHlms8F3CHmrw3k6KmUkWGoa+/ENmcVl68u/cMRl1JbW2bM+\n/3A+SAg2c6iPDlehczKx2oa95QW0SkPPWGuNA/CE8CpyANIhu9XFrj3RQ3EqeRcS\nAQQod1RNuHpfETLU/A2gMmvn/w/sx7TB3W5BPs6rprOA37tutPq9u6FTZOcG1Oqj\nC/B7yTqgI7rbyvox7DEXoX7rIiEqyNNUguTk/u3SZ4VXE2kmxdmSh3TQvybfbnXV\n4JbCZVaqiZraqc7oZMnRoWrXRG3ztbnbes/9qhRGI7PqXqeKJBztxRTEVj8ONs1d\nWN5szTwaPIvhkhO3CO5ErU2rVdUr89wKpNXbBODFKRtgxUT70YpmJ46VVaqdAhOZ\nD9EUUn4YaeLaS8AjSF/h7UkjOibNc4qVDiPP+rkehFWM66PVnP1Msh93tc+taIfC\nEYVMxjh8zNbFuoc7fzvvrFILLe7ifvEIUqSVIC/AzplM/Jxw7buXFeGP1qVCBEHq\n391d/9RAfaZ12zkwFsl+IKwE/OZxW8AHa9i1p4GO0YSNuczzEm4=\n-----END CERTIFICATE-----"));
        try {
            builderAddTrustedCertificate.addPlatformTrustedCertificates();
        } catch (NullPointerException unused) {
        }
        HandshakeCertificates handshakeCertificatesBuild = builderAddTrustedCertificate.build();
        return builder.sslSocketFactory(handshakeCertificatesBuild.sslSocketFactory(), handshakeCertificatesBuild.trustManager());
    }

    private final OkHttpClient.Builder addVKPins(OkHttpClient.Builder builder) {
        CertificatePinner.Builder builder2 = new CertificatePinner.Builder();
        ArrayList arrayListB = w.b(new InputStreamReader(new BufferedInputStream(this.context.getResources().openRawResource(R.raw.vkid_cacerts_pins)), C43047d.f410589b));
        ArrayList arrayList = new ArrayList(C42745f0.q(arrayListB, 10));
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            arrayList.add("sha256/" + ((String) it.next()));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            builder2.add("*.vk.ru", (String) it2.next());
        }
        builder.certificatePinner(builder2.build());
        return builder;
    }

    private final boolean isDebuggable() {
        return (this.context.getApplicationInfo().flags & 2) != 0;
    }

    private final HttpLoggingInterceptor loggingInterceptor() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() { // from class: com.vk.id.network.OkHttpClientProvider$loggingInterceptor$logging$1
            private final InternalVKIDLogger logger = InternalVKIDLog.INSTANCE.createLoggerForTag("");

            @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
            public void log(String message) {
                this.logger.debug(message);
            }
        });
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
        return httpLoggingInterceptor;
    }

    @k
    public final OkHttpClient provide(@k List<? extends Interceptor> additionalInterceptors) {
        OkHttpClient.Builder builderAddRussianTrustedRootCA = addRussianTrustedRootCA(provideBuilderWithSslPinning$network_release());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderAddInterceptor = builderAddRussianTrustedRootCA.readTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).connectTimeout(60L, timeUnit).addInterceptor(new CaptchaHandlingInterceptor(null, 1, null));
        Iterator<T> it = additionalInterceptors.iterator();
        while (it.hasNext()) {
            builderAddInterceptor.addInterceptor((Interceptor) it.next());
        }
        OkHttpClient.Builder builderAddInterceptor2 = builderAddInterceptor.addInterceptor(new UserAgentInterceptor(new UserAgentProvider(this.context)));
        Interceptor interceptor = InternalVKIDAdditionalInterceptors.INSTANCE.getInterceptor();
        if (interceptor != null) {
            builderAddInterceptor2.addNetworkInterceptor(interceptor);
        }
        return builderAddInterceptor2.addInterceptor(loggingInterceptor()).build();
    }

    @k0
    @k
    public final OkHttpClient.Builder provideBuilderWithSslPinning$network_release() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        if (!isDebuggable()) {
            addVKPins(builder);
        }
        return builder;
    }
}
