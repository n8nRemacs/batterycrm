package com.huawei.agconnect.config.a;

import android.content.Context;
import com.huawei.agconnect.j;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class d extends XZ0.a {

    /* renamed from: c, reason: collision with root package name */
    public final Context f363145c;

    /* renamed from: d, reason: collision with root package name */
    public final String f363146d;

    /* renamed from: e, reason: collision with root package name */
    public volatile e f363147e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f363148f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public com.huawei.agconnect.a f363149g = com.huawei.agconnect.a.f363129b;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f363150h = new HashMap();

    public d(Context context, String str) {
        this.f363145c = context;
        this.f363146d = str;
    }

    @Override // com.huawei.agconnect.d
    public final String a() {
        return "DEFAULT_INSTANCE";
    }

    @Override // com.huawei.agconnect.d
    public final com.huawei.agconnect.a b() {
        if (this.f363149g == com.huawei.agconnect.a.f363129b && this.f363147e == null) {
            e();
        }
        return this.f363149g;
    }

    public final void e() {
        if (this.f363147e == null) {
            synchronized (this.f363148f) {
                try {
                    if (this.f363147e == null) {
                        this.f363147e = new j(this.f363145c, this.f363146d);
                    }
                    if (this.f363149g == com.huawei.agconnect.a.f363129b && this.f363147e != null) {
                        this.f363149g = k.a(this.f363147e.a("/region"), this.f363147e.a("/agcgw/url"));
                    }
                } finally {
                }
            }
        }
    }

    @Override // com.huawei.agconnect.d
    public final Context getContext() {
        return this.f363145c;
    }

    @Override // com.huawei.agconnect.d
    public final String getString(String str) {
        j.a aVar;
        if (this.f363147e == null) {
            e();
        }
        int i12 = 0;
        if (str.length() > 0) {
            while (str.charAt(i12) == '/') {
                i12++;
            }
        }
        String str2 = "/" + str.substring(i12);
        String str3 = (String) this.f363150h.get(str2);
        if (str3 != null) {
            return str3;
        }
        HashMap map = com.huawei.agconnect.j.f363171a;
        String strA = (map.containsKey(str2) && (aVar = (j.a) map.get(str2)) != null) ? aVar.a(this) : null;
        return strA != null ? strA : this.f363147e.a(str2);
    }
}
