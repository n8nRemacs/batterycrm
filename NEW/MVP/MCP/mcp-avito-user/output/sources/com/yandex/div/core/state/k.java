package com.yandex.div.core.state;

import androidx.collection.C20199a;
import j.N;
import j.P;

/* compiled from: DivViewState.java */
/* loaded from: classes7.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f367666a;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final C20199a f367667b;

    /* compiled from: DivViewState.java */
    public interface a {
    }

    public k(long j12) {
        this(j12, new C20199a());
    }

    @P
    public final <T extends a> T a(@N String str) {
        return (T) this.f367667b.get(str);
    }

    public k(long j12, @N C20199a c20199a) {
        this.f367666a = j12;
        this.f367667b = c20199a;
    }
}
