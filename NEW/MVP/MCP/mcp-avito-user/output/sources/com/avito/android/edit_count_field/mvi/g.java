package com.avito.android.edit_count_field.mvi;

import com.avito.android.edit_count_field.model.EditCountFieldArguments;
import com.avito.android.profile_settings_extended.adapter.count.CountItem;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import uy.C49127c;

/* compiled from: EditCountFieldFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f146649a;

    /* renamed from: b, reason: collision with root package name */
    public final i f146650b;

    /* renamed from: c, reason: collision with root package name */
    public final k f146651c;

    /* renamed from: d, reason: collision with root package name */
    public final l f146652d;

    public g(d dVar, i iVar, k kVar, l lVar) {
        this.f146649a = dVar;
        this.f146650b = iVar;
        this.f146651c = kVar;
        this.f146652d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f146649a.get();
        this.f146650b.getClass();
        h hVar = new h();
        this.f146651c.getClass();
        j jVar = new j();
        EditCountFieldArguments editCountFieldArguments = (EditCountFieldArguments) this.f146652d.f393949a;
        C49127c.f440355h.getClass();
        CountItem countItem = editCountFieldArguments.f146623b;
        Integer num = countItem.f229369n;
        String string = num != null ? num.toString() : null;
        if (string == null) {
            string = "";
        }
        return new f("EditCountField", new C49127c(string, countItem.f229365j, countItem.f229364i, null, false, true), new e(cVar, jVar, hVar));
    }
}
