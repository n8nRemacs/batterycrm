package com.huawei.agconnect.config.a;

import android.content.Context;
import com.huawei.agconnect.j;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b implements com.huawei.agconnect.d {

    /* renamed from: a, reason: collision with root package name */
    public final String f363137a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f363138b;

    /* renamed from: c, reason: collision with root package name */
    public final String f363139c;

    /* renamed from: d, reason: collision with root package name */
    public final com.huawei.agconnect.a f363140d;

    /* renamed from: e, reason: collision with root package name */
    public final e f363141e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f363142f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f363143g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f363144h = new HashMap();

    public b(Context context, InputStream inputStream, HashMap map, ArrayList arrayList) throws IOException {
        this.f363138b = context;
        String packageName = context.getPackageName();
        this.f363139c = packageName;
        if (inputStream != null) {
            this.f363141e = new g(inputStream);
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        } else {
            this.f363141e = new j(context, packageName);
        }
        "1.0".equals(this.f363141e.a("/configuration_version"));
        this.f363140d = k.a(this.f363141e.a("/region"), this.f363141e.a("/agcgw/url"));
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put(k.c((String) entry.getKey()), entry.getValue());
        }
        this.f363142f = map2;
        this.f363143g = arrayList;
        this.f363137a = String.valueOf(("{packageName='" + this.f363139c + "', routePolicy=" + this.f363140d + ", reader=" + this.f363141e.toString().hashCode() + ", customConfigMap=" + new JSONObject(map2).toString().hashCode() + '}').hashCode());
    }

    @Override // com.huawei.agconnect.d
    public final String a() {
        return this.f363137a;
    }

    @Override // com.huawei.agconnect.d
    public final com.huawei.agconnect.a b() {
        return this.f363140d;
    }

    @Override // com.huawei.agconnect.d
    public final Context getContext() {
        return this.f363138b;
    }

    @Override // com.huawei.agconnect.d
    public final String getString(String str) {
        String strA = null;
        if (str == null) {
            return null;
        }
        String strC = k.c(str);
        String str2 = (String) this.f363142f.get(strC);
        if (str2 != null) {
            return str2;
        }
        HashMap map = com.huawei.agconnect.j.f363171a;
        if (map.containsKey(strC)) {
            HashMap map2 = this.f363144h;
            if (map2.containsKey(strC)) {
                strA = (String) map2.get(strC);
            } else {
                j.a aVar = (j.a) map.get(strC);
                if (aVar != null) {
                    strA = aVar.a(this);
                    map2.put(strC, strA);
                }
            }
        }
        return strA != null ? strA : this.f363141e.a(strC);
    }
}
