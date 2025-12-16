package com.avito.android.messenger.channels.mvi.list_feature;

/* compiled from: ChannelsListFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class h1 implements dagger.internal.h<g1> {

    /* renamed from: a, reason: collision with root package name */
    public final a1 f188074a;

    /* renamed from: b, reason: collision with root package name */
    public final j1 f188075b;

    /* renamed from: c, reason: collision with root package name */
    public final n1 f188076c;

    public h1(a1 a1Var, j1 j1Var, n1 n1Var) {
        this.f188074a = a1Var;
        this.f188075b = j1Var;
        this.f188076c = n1Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C31772a c31772a = (C31772a) this.f188074a.get();
        this.f188075b.getClass();
        i1 i1Var = new i1();
        m1 m1Var = (m1) this.f188076c.get();
        HY.h.f7214l.getClass();
        return new g1("ChannelsList", HY.h.f7215m, new f1(c31772a, m1Var, i1Var));
    }
}
