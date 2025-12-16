package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: com.yandex.metrica.impl.ob.d9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38749d9 {

    /* renamed from: a, reason: collision with root package name */
    private final S7 f380362a;

    /* renamed from: b, reason: collision with root package name */
    private final String f380363b;

    public AbstractC38749d9(S7 s72) {
        this(s72, null);
    }

    public long a(String str, long j12) {
        return this.f380362a.a(str, j12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractC38749d9> T b(String str, String str2) {
        synchronized (this) {
            this.f380362a.a(str, str2);
        }
        return this;
    }

    public boolean c(@j.N String str) {
        return this.f380362a.a(str);
    }

    public Rd d(String str) {
        return new Rd(str, this.f380363b);
    }

    @j.P
    public String e(@j.N String str) {
        return this.f380362a.b(str, (String) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractC38749d9> T f(String str) {
        synchronized (this) {
            this.f380362a.b(str);
        }
        return this;
    }

    public AbstractC38749d9(S7 s72, String str) {
        this.f380362a = s72;
        this.f380363b = str;
    }

    public int a(@j.N String str, int i12) {
        return this.f380362a.a(str, i12);
    }

    @j.N
    public Set<String> e() {
        return this.f380362a.a();
    }

    @j.P
    public String a(@j.N String str, @j.P String str2) {
        return this.f380362a.b(str, str2);
    }

    public boolean a(String str, boolean z12) {
        return this.f380362a.b(str, z12);
    }

    public void d() {
        synchronized (this) {
            this.f380362a.b();
        }
    }

    @j.P
    public List<String> a(@j.N String str, @j.P List<String> list) {
        String[] strArr = list == null ? null : (String[]) list.toArray(new String[list.size()]);
        String strB = this.f380362a.b(str, (String) null);
        if (!TextUtils.isEmpty(strB)) {
            try {
                JSONArray jSONArray = new JSONArray(strB);
                strArr = new String[jSONArray.length()];
                for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                    strArr[i12] = jSONArray.optString(i12);
                }
            } catch (Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractC38749d9> T b(String str, long j12) {
        synchronized (this) {
            this.f380362a.b(str, j12);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j.N
    public <T extends AbstractC38749d9> T b(String str, int i12) {
        synchronized (this) {
            this.f380362a.b(str, i12);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractC38749d9> T b(String str, boolean z12) {
        synchronized (this) {
            this.f380362a.a(str, z12);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractC38749d9> T b(String str, List<String> list) {
        String string;
        String[] strArr = (String[]) list.toArray(new String[list.size()]);
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : strArr) {
                jSONArray.put(str2);
            }
            string = jSONArray.toString();
        } catch (Throwable unused) {
            string = null;
        }
        this.f380362a.a(str, string);
        return this;
    }
}
