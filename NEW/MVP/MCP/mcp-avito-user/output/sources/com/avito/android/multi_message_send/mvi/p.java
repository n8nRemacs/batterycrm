package com.avito.android.multi_message_send.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MultiMessageSendFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final m f206796a;

    /* renamed from: b, reason: collision with root package name */
    public final k f206797b;

    /* renamed from: c, reason: collision with root package name */
    public final r f206798c;

    /* renamed from: d, reason: collision with root package name */
    public final t f206799d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f206800e;

    public p(m mVar, k kVar, r rVar, t tVar, dagger.internal.l lVar) {
        this.f206796a = mVar;
        this.f206797b = kVar;
        this.f206798c = rVar;
        this.f206799d = tVar;
        this.f206800e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = (l) this.f206796a.get();
        j jVar = (j) this.f206797b.get();
        this.f206798c.getClass();
        q qVar = new q();
        this.f206799d.getClass();
        s sVar = new s();
        String str = (String) this.f206800e.f393949a;
        G20.d.f6246l.getClass();
        return new o("MultiMessageSend", G20.d.a(G20.d.f6247m, null, false, false, null, false, str, null, false, null, 479), new n(lVar, jVar, sVar, qVar));
    }
}
