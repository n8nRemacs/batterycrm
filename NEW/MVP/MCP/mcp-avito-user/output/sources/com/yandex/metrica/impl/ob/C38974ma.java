package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.ma, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C38974ma implements S7 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final S7 f381036a;

    public C38974ma(@j.N Context context, @j.N W7 w72, @j.N S7 s72) {
        this.f381036a = s72;
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public int a(String str, int i12) {
        return this.f381036a.a(str, i12);
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public void b() {
        this.f381036a.b();
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public long a(String str, long j12) {
        return this.f381036a.a(str, j12);
    }

    @Override // com.yandex.metrica.impl.ob.S7
    @j.P
    public String b(String str, String str2) {
        return this.f381036a.b(str, str2);
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public S7 a(String str, String str2) {
        this.f381036a.a(str, str2);
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public boolean b(String str, boolean z12) {
        return this.f381036a.b(str, z12);
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public S7 a(String str, boolean z12) {
        this.f381036a.a(str, z12);
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public S7 b(String str) {
        this.f381036a.b(str);
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public boolean a(@j.N String str) {
        return this.f381036a.a(str);
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public S7 b(String str, long j12) {
        this.f381036a.b(str, j12);
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.S7
    @j.N
    public Set<String> a() {
        return this.f381036a.a();
    }

    @Override // com.yandex.metrica.impl.ob.S7
    public S7 b(String str, int i12) {
        this.f381036a.b(str, i12);
        return this;
    }
}
