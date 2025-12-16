package ru.ok.android.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.compose.foundation.H;
import com.avito.android.R;
import com.avito.android.social.C35031x;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Odnoklassniki.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/android/sdk/f;", "", "a", "odnoklassniki-android-sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public class f {

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    @SuppressLint({"StaticFieldLeak"})
    public static volatile f f436688h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f436689i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public String f436690a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public String f436691b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public String f436692c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ru.ok.android.sdk.util.a f436693d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f436694e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f436695f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f436696g;

    /* compiled from: Odnoklassniki.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/android/sdk/f$a;", "", "<init>", "()V", "odnoklassniki-android-sdk_release"}, k = 1, mv = {1, 4, 0})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    public f(@Y61.k Context context, @Y61.l String str, @Y61.l String str2) {
        this.f436696g = context;
        if (str == null || str2 == null) {
            t.f436705a.getClass();
            SharedPreferences sharedPreferences = context.getSharedPreferences("oksdkprefs", 0);
            String string = sharedPreferences.getString(HiAnalyticsConstant.BI_KEY_APP_ID, null);
            String string2 = sharedPreferences.getString("app_key", null);
            if (string == null || string2 == null) {
                throw new IllegalStateException("No instance available. Odnoklassniki.createInstance() needs to be called");
            }
            this.f436694e = string;
            this.f436695f = string2;
        } else {
            this.f436694e = str;
            this.f436695f = str2;
            t.f436705a.getClass();
            context.getSharedPreferences("oksdkprefs", 0).edit().putString(HiAnalyticsConstant.BI_KEY_APP_ID, str).putString("app_key", str2).apply();
        }
        t.f436705a.getClass();
        this.f436690a = context.getSharedPreferences("oksdkprefs", 0).getString("acctkn", null);
        this.f436691b = context.getSharedPreferences("oksdkprefs", 0).getString("ssk", null);
        this.f436692c = context.getSharedPreferences("oksdkprefs", 0).getString("ok_sdk_tkn", null);
        this.f436693d = new ru.ok.android.sdk.util.a(context);
        f436688h = this;
    }

    public static void b(@Y61.l C35031x c35031x, @Y61.l String str) {
        ru.ok.android.sdk.util.e eVar = ru.ok.android.sdk.util.e.f436721b;
        h hVar = new h(c35031x, str);
        eVar.getClass();
        ru.ok.android.sdk.util.e.a(hVar);
    }

    public final void a(@Y61.k C35031x c35031x) {
        if (this.f436690a == null || this.f436691b == null) {
            b(c35031x, this.f436696g.getString(R.string.no_valid_token));
        } else {
            new Thread(new g(this, c35031x)).start();
        }
    }

    @Y61.l
    public final String c(@Y61.k String str, @Y61.l HashMap map, @Y61.k Set set) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(this.f436696g.getString(R.string.api_method_cant_be_empty));
        }
        TreeMap treeMap = new TreeMap();
        if (map != null && !map.isEmpty()) {
            treeMap.putAll(map);
        }
        treeMap.put("application_key", this.f436695f);
        treeMap.put("method", str);
        if (!set.contains(OkRequestMode.f436669d)) {
            treeMap.put("platform", "ANDROID");
        }
        if (set.contains(OkRequestMode.f436668c)) {
            String str3 = this.f436692c;
            if (str3 == null) {
                throw new IllegalArgumentException("SDK token is required for method call, have not forget to call sdkInit?");
            }
            treeMap.put("sdkToken", str3);
        }
        if (set.contains(OkRequestMode.f436667b) && (str2 = this.f436690a) != null && str2.length() != 0) {
            StringBuilder sb2 = new StringBuilder(100);
            for (Map.Entry entry : treeMap.entrySet()) {
                sb2.append((String) entry.getKey());
                sb2.append('=');
                sb2.append((String) entry.getValue());
            }
            String string = sb2.toString();
            ru.ok.android.sdk.util.e eVar = ru.ok.android.sdk.util.e.f436721b;
            StringBuilder sbR = H.r(string);
            sbR.append(this.f436691b);
            String string2 = sbR.toString();
            eVar.getClass();
            treeMap.put("sig", ru.ok.android.sdk.util.e.b(string2));
            String str4 = this.f436690a;
            if (str4 == null) {
                L.k();
                throw null;
            }
            treeMap.put("access_token", str4);
        }
        return ru.ok.android.sdk.util.c.a(treeMap);
    }

    public /* synthetic */ f(Context context, String str, String str2, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2);
    }
}
