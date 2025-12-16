package com.avito.android.select_field.mvi;

import com.avito.android.profile_settings_extended.adapter.select.SelectItem;
import com.avito.android.select_field.model.SelectFieldArguments;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import sq0.C48401c;

/* compiled from: SelectFieldFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f267202a;

    /* renamed from: b, reason: collision with root package name */
    public final i f267203b;

    /* renamed from: c, reason: collision with root package name */
    public final k f267204c;

    /* renamed from: d, reason: collision with root package name */
    public final l f267205d;

    public g(d dVar, i iVar, k kVar, l lVar) {
        this.f267202a = dVar;
        this.f267203b = iVar;
        this.f267204c = kVar;
        this.f267205d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Object next;
        c cVar = (c) this.f267202a.get();
        this.f267203b.getClass();
        h hVar = new h();
        this.f267204c.getClass();
        j jVar = new j();
        SelectFieldArguments selectFieldArguments = (SelectFieldArguments) this.f267205d.f393949a;
        C48401c.f438887e.getClass();
        SelectItem selectItem = selectFieldArguments.f267179b;
        Iterator<T> it = selectItem.f229819i.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int i12 = ((SelectItem.Option) next).f229827c;
            Integer num = selectItem.f229822l;
            if (num != null && i12 == num.intValue()) {
                break;
            }
        }
        return new f("SelectField", new C48401c((SelectItem.Option) next, selectItem.f229819i, false), new e(cVar, jVar, hVar));
    }
}
