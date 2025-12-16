package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.h0;
import java.net.InetAddress;
import java.net.URL;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class l0 {

    /* renamed from: b, reason: collision with root package name */
    final String f365690b;

    /* renamed from: c, reason: collision with root package name */
    final MyTrackerConfig.OkHttpClientProvider f365691c;

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<byte[]> f365689a = new AtomicReference<>();

    /* renamed from: d, reason: collision with root package name */
    boolean f365692d = false;

    public l0(f2 f2Var) {
        this.f365690b = a(f2Var.m());
        this.f365691c = f2Var.k();
    }

    public static String a(String str) {
        try {
            URL url = new URL(str);
            return url.getProtocol() + "://ip4." + url.getAuthority();
        } catch (Throwable th2) {
            e2.a("Ipv4DataProvider: error occurred while creating IPv4 url", th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        e2.a("Ipv4DataProvider: get IPv4 address");
        byte[] bArr = C37838l.f365688a;
        try {
            h0.b<String> bVarA = h0.a(this.f365691c).a(this.f365690b);
            if (!bVarA.b()) {
                e2.a("Ipv4DataProvider: unsuccessful response from server");
                synchronized (this.f365689a) {
                    this.f365689a.set(bArr);
                    this.f365689a.notify();
                }
                return;
            }
            String strA = bVarA.a();
            if (TextUtils.isEmpty(strA)) {
                e2.a("Ipv4DataProvider: empty response from server");
                synchronized (this.f365689a) {
                    this.f365689a.set(bArr);
                    this.f365689a.notify();
                }
                return;
            }
            String strOptString = new JSONObject(strA).optString("ip");
            if (TextUtils.isEmpty(strOptString)) {
                e2.a("Ipv4DataProvider: IP is empty");
                synchronized (this.f365689a) {
                    this.f365689a.set(bArr);
                    this.f365689a.notify();
                }
                return;
            }
            e2.a("Ipv4DataProvider: IPv4 address is received " + strOptString);
            byte[] address = InetAddress.getByName(strOptString).getAddress();
            synchronized (this.f365689a) {
                this.f365689a.set(address);
                this.f365689a.notify();
            }
        } catch (Throwable th2) {
            try {
                e2.b("Ipv4DataProvider: failed to get IPv4 address", th2);
                synchronized (this.f365689a) {
                    this.f365689a.set(bArr);
                    this.f365689a.notify();
                }
            } catch (Throwable th3) {
                synchronized (this.f365689a) {
                    this.f365689a.set(bArr);
                    this.f365689a.notify();
                    throw th3;
                }
            }
        }
    }

    public void a(Context context) {
        if (this.f365692d) {
            return;
        }
        this.f365692d = true;
        if (TextUtils.isEmpty(this.f365690b)) {
            e2.a("Ipv4DataProvider: no IPv4 url");
            this.f365689a.set(C37838l.f365688a);
        } else {
            C37835i.b(new J(this, 2));
            this.f365692d = true;
        }
    }

    public void a(a1 a1Var, Context context) {
        String str;
        byte[] bArr = this.f365689a.get();
        if (bArr == null) {
            try {
                e2.a("Ipv4DataProvider: waiting for collecting data");
                synchronized (this.f365689a) {
                    this.f365689a.wait(1000L);
                }
                e2.a("Ipv4DataProvider: timeout for collecting IPv4 has exceeded");
                bArr = this.f365689a.get();
            } catch (Throwable unused) {
                e2.a("Ipv4DataProvider: attempt to block thread retrieving IPv4 finished unsuccessfully");
            }
        }
        if (bArr == null) {
            str = "Ipv4DataProvider: data hasn't been collected yet";
        } else {
            if (bArr != C37838l.f365688a) {
                a1Var.b(bArr);
                return;
            }
            str = "Ipv4DataProvider: error occurred while collecting data";
        }
        e2.a(str);
    }

    public void b(Context context) {
    }
}
