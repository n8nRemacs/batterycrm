package com.avito.android.advert.icebreakerseditor.mvi;

import b4.C25408d;
import com.avito.android.advert.icebreakerseditor.C27798a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import java.util.ArrayList;
import java.util.List;

/* compiled from: IcebreakersEditorFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f71256a;

    /* renamed from: b, reason: collision with root package name */
    public final b f71257b;

    /* renamed from: c, reason: collision with root package name */
    public final i f71258c;

    /* renamed from: d, reason: collision with root package name */
    public final k f71259d;

    /* renamed from: e, reason: collision with root package name */
    public final l f71260e;

    /* renamed from: f, reason: collision with root package name */
    public final l f71261f;

    public g(d dVar, b bVar, i iVar, k kVar, l lVar, l lVar2) {
        this.f71256a = dVar;
        this.f71257b = bVar;
        this.f71258c = iVar;
        this.f71259d = kVar;
        this.f71260e = lVar;
        this.f71261f = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f71256a.get();
        a aVar = (a) this.f71257b.get();
        this.f71258c.getClass();
        h hVar = new h();
        j jVar = (j) this.f71259d.get();
        List list = (List) this.f71260e.f393949a;
        int iIntValue = ((Integer) this.f71261f.f393949a).intValue();
        C25408d.f56890g.getClass();
        ArrayList arrayListA = C27798a.a(list);
        return new f("IcebreakersEditor", new C25408d(arrayListA, new C25408d.b(0, null, "", false), arrayListA.size() < iIntValue, arrayListA.size() > 1, null, iIntValue), new e(cVar, aVar, jVar, hVar));
    }
}
