package ru.tinkoff.core.tinkoffId;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.verify.domain.DomainVerificationUserState;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import j.X;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okio.C44805o;
import shark.AndroidResourceIdNames;
import zb1.C50544a;

/* compiled from: TinkoffIdAuth.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/tinkoff/core/tinkoffId/g;", "", "tinkoff-id_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f437035a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437036b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f437037c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final o f437038d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ru.tinkoff.core.tinkoffId.codeVerifier.a f437039e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a f437040f;

    public g(@Y61.k Context context, @Y61.k String str, @Y61.k String str2) throws NoSuchAlgorithmException, KeyManagementException {
        this.f437035a = str;
        this.f437036b = str2;
        Context applicationContext = context.getApplicationContext();
        this.f437037c = applicationContext;
        this.f437039e = new ru.tinkoff.core.tinkoffId.codeVerifier.a(applicationContext);
        this.f437040f = new a(context);
        C50544a.f444088c.getClass();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        int i12 = yb1.b.f443208a;
        ru.tinkoff.core.components.security.ssltrusted.certs.enrich.e eVar = new ru.tinkoff.core.components.security.ssltrusted.certs.enrich.e(context);
        ru.tinkoff.core.components.security.ssltrusted.certs.enrich.g gVar = ru.tinkoff.core.components.security.ssltrusted.certs.enrich.g.f437019a;
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, new TrustManager[]{eVar}, null);
        OkHttpClient.Builder builderSslSocketFactory = builder.sslSocketFactory(sSLContext.getSocketFactory(), eVar);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f437038d = new o(new C50544a(builderSslSocketFactory.readTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).connectTimeout(60L, timeUnit).build(), null, 2, null));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.C] */
    @X
    public final Intent a(Y41.p<? super String, ? super String, ? extends Intent> pVar) throws NoSuchAlgorithmException {
        String strEncodeToString;
        String str;
        ru.tinkoff.core.tinkoffId.codeVerifier.b.f437029a.getClass();
        byte[] bArr = new byte[64];
        new SecureRandom().nextBytes(bArr);
        String strEncodeToString2 = Base64.encodeToString(bArr, 11);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(strEncodeToString2.getBytes(Charset.forName("ISO_8859_1")));
            strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
        } catch (UnsupportedEncodingException e12) {
            throw new IllegalStateException("ISO-8859-1 encoding not supported", e12);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = strEncodeToString2;
        }
        ru.tinkoff.core.tinkoffId.codeVerifier.b.f437029a.getClass();
        try {
            MessageDigest.getInstance("SHA-256");
            str = "S256";
        } catch (NoSuchAlgorithmException unused2) {
            str = "plain";
        }
        ((SharedPreferences) this.f437039e.f437027a.getValue()).edit().putString("code_verifier", strEncodeToString2).apply();
        return pVar.invoke(strEncodeToString, str);
    }

    @Y61.k
    @X
    public final Intent b(@Y61.k Uri uri) {
        return d() ? a(new e(this, uri)) : a(new f(this, uri));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.C] */
    @Y61.k
    public final l c(@Y61.k Uri uri) {
        this.f437040f.getClass();
        String queryParameter = uri.getQueryParameter("code");
        if (queryParameter == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String string = ((SharedPreferences) this.f437039e.f437027a.getValue()).getString("code_verifier", "");
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        o oVar = this.f437038d;
        C50544a c50544a = oVar.f437047a;
        FormBody.Builder builderAdd = new FormBody.Builder(null, 1, 0 == true ? 1 : 0).add("grant_type", "authorization_code").add("code", queryParameter).add("redirect_uri", this.f437036b).add("vendor", "tinkoff_android").add("code_verifier", string);
        String str = this.f437035a;
        FormBody formBodyBuild = builderAdd.add("client_id", str).add("client_version", "1.1.2").build();
        HttpUrl httpUrlBuild = c50544a.f444090b.newBuilder().addPathSegments("auth/token").build();
        Request.Builder builder = new Request.Builder();
        C44805o.a aVar = C44805o.f420139e;
        String strConcat = str.concat(":");
        aVar.getClass();
        return new l(c50544a.f444089a.newCall(builder.addHeader("Authorization", "Basic " + C44805o.a.c(strConcat).a()).addHeader("Accept", "application/json").addHeader("X-SSO-No-Adapter", "true").url(httpUrlBuild).post(formBodyBuild).build()), oVar, new n(oVar), m.f437045l);
    }

    public final boolean d() throws PackageManager.NameNotFoundException, NoSuchAlgorithmException {
        String str;
        Set setKeySet;
        Map hostToStateMap;
        int i12 = Build.VERSION.SDK_INT;
        a aVar = this.f437040f;
        aVar.getClass();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(aVar.f437024b);
        Context context = this.f437037c;
        List<ResolveInfo> listQueryIntentActivities = i12 >= 33 ? context.getPackageManager().queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR)) : context.getPackageManager().queryIntentActivities(intent, AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);
        if (!(listQueryIntentActivities instanceof Collection) || !listQueryIntentActivities.isEmpty()) {
            Iterator<T> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                String str2 = ((ResolveInfo) it.next()).activityInfo.packageName;
                if (Build.VERSION.SDK_INT >= 31) {
                    DomainVerificationUserState domainVerificationUserState = androidx.media3.exoplayer.audio.n.a(aVar.f437023a.getSystemService(androidx.media3.exoplayer.audio.n.j())).getDomainVerificationUserState(str2);
                    if (domainVerificationUserState == null || (hostToStateMap = domainVerificationUserState.getHostToStateMap()) == null) {
                        setKeySet = null;
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : hostToStateMap.entrySet()) {
                            Integer num = (Integer) entry.getValue();
                            if ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 1)) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        setKeySet = linkedHashMap.keySet();
                    }
                    if (setKeySet != null) {
                        Set set = setKeySet;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            Iterator it2 = set.iterator();
                            while (it2.hasNext()) {
                                if (L.f((String) it2.next(), "www.tinkoff.ru")) {
                                }
                            }
                        }
                    }
                }
                ru.tinkoff.core.tinkoffId.codeVerifier.b.f437029a.getClass();
                try {
                    MessageDigest.getInstance("SHA-256");
                    str = "S256";
                } catch (NoSuchAlgorithmException unused) {
                    str = "plain";
                }
                if (!str.equals("plain")) {
                    return true;
                }
            }
        }
        return false;
    }
}
