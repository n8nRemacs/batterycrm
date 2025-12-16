package com.yandex.metrica.impl.ob;

import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.hh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38857hh {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final String f380718a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final List<String> f380719b;

    public C38857hh(@j.N String str, @j.N List<String> list) {
        this.f380718a = str;
        this.f380719b = list;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SdkItem{name='");
        sb2.append(this.f380718a);
        sb2.append("', classes=");
        return androidx.compose.foundation.H.p(sb2, this.f380719b, '}');
    }
}
