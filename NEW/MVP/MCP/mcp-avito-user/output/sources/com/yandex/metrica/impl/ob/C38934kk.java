package com.yandex.metrica.impl.ob;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.kk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38934kk {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final LinkedList<JSONObject> f380927a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38699b9 f380928b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final LinkedList<String> f380929c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Gk f380930d;

    /* renamed from: e, reason: collision with root package name */
    private int f380931e;

    public C38934kk(int i12, @j.N C38699b9 c38699b9) {
        this(i12, c38699b9, new C38810fk());
    }

    public void a(@j.N JSONObject jSONObject) {
        if (this.f380927a.size() == this.f380931e) {
            this.f380927a.removeLast();
            this.f380929c.removeLast();
        }
        String string = jSONObject.toString();
        this.f380927a.addFirst(jSONObject);
        this.f380929c.addFirst(string);
        if (this.f380929c.isEmpty()) {
            return;
        }
        this.f380928b.a(this.f380929c);
    }

    @j.N
    public List<JSONObject> b() {
        return this.f380927a;
    }

    @j.k0
    public C38934kk(int i12, @j.N C38699b9 c38699b9, @j.N Gk gk2) {
        this.f380927a = new LinkedList<>();
        this.f380929c = new LinkedList<>();
        this.f380931e = i12;
        this.f380928b = c38699b9;
        this.f380930d = gk2;
        a(c38699b9);
    }

    private void a(@j.N C38699b9 c38699b9) {
        List<String> listH = c38699b9.h();
        for (int iMax = Math.max(0, listH.size() - this.f380931e); iMax < listH.size(); iMax++) {
            String str = listH.get(iMax);
            try {
                this.f380927a.addLast(new JSONObject(str));
                this.f380929c.addLast(str);
            } catch (Throwable unused) {
            }
        }
    }

    @j.N
    public JSONObject a() {
        return this.f380930d.a(new JSONArray((Collection) this.f380927a));
    }
}
