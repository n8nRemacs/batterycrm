package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufStateStorage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.gh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38832gh {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ProtobufStateStorage f380652a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38807fh f380653b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final M0 f380654c;

    public C38832gh(@j.N ProtobufStateStorage protobufStateStorage) {
        this(protobufStateStorage, new C38807fh(), C39031oh.a());
    }

    public void a() {
        M0 m02 = this.f380654c;
        C38807fh c38807fh = this.f380653b;
        List<C38857hh> list = ((C38782eh) this.f380652a.read()).f380491a;
        c38807fh.getClass();
        ArrayList arrayList = new ArrayList();
        for (C38857hh c38857hh : list) {
            ArrayList arrayList2 = new ArrayList(c38857hh.f380719b.size());
            for (String str : c38857hh.f380719b) {
                if (C38842h2.a(str)) {
                    arrayList2.add(str);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new C38857hh(c38857hh.f380718a, arrayList2));
            }
        }
        JSONObject jSONObject = new JSONObject();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C38857hh c38857hh2 = (C38857hh) it.next();
            try {
                jSONObject.put(c38857hh2.f380718a, new JSONObject().put("classes", new JSONArray((Collection) c38857hh2.f380719b)));
            } catch (Throwable unused) {
            }
        }
        m02.reportEvent("sdk_list", jSONObject.toString());
    }

    public C38832gh(@j.N ProtobufStateStorage protobufStateStorage, @j.N C38807fh c38807fh, @j.N M0 m02) {
        this.f380652a = protobufStateStorage;
        this.f380653b = c38807fh;
        this.f380654c = m02;
    }
}
