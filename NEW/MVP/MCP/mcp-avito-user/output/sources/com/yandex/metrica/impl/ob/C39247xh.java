package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.xh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39247xh {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39232x2 f382205a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39223wh f382206b;

    public C39247xh(@j.N C39223wh c39223wh) {
        this(c39223wh, new C39232x2());
    }

    public long a(int i12) {
        return a().optLong(String.valueOf(i12));
    }

    @j.k0
    public C39247xh(@j.N C39223wh c39223wh, @j.N C39232x2 c39232x2) {
        this.f382206b = c39223wh;
        this.f382205a = c39232x2;
    }

    public void a(int i12, long j12) {
        JSONObject jSONObjectA = a();
        try {
            jSONObjectA.put(String.valueOf(i12), j12);
        } catch (Throwable unused) {
        }
        this.f382206b.a(jSONObjectA.toString());
    }

    public void a(long j12) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectA = a();
        Iterator<String> itKeys = jSONObjectA.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (this.f382205a.b(jSONObjectA.optLong(next), j12, androidx.camera.camera2.internal.G.f("last socket open on ", next))) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONObjectA.remove((String) it.next());
        }
        this.f382206b.a(jSONObjectA.toString());
    }

    @j.N
    private JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        String strA = this.f382206b.a();
        if (TextUtils.isEmpty(strA)) {
            return jSONObject;
        }
        try {
            return new JSONObject(strA);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }
}
