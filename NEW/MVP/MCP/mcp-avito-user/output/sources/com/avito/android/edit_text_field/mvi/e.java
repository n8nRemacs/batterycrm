package com.avito.android.edit_text_field.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EditTextFieldFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final b f147023a;

    /* renamed from: b, reason: collision with root package name */
    public final g f147024b;

    /* renamed from: c, reason: collision with root package name */
    public final i f147025c;

    public e(b bVar, g gVar, i iVar) {
        this.f147023a = bVar;
        this.f147024b = gVar;
        this.f147025c = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f147023a.get();
        this.f147024b.getClass();
        f fVar = new f();
        this.f147025c.getClass();
        h hVar = new h();
        Ay.d.f756g.getClass();
        return new d("EditTextField", Ay.d.f757h, new c(aVar, hVar, fVar));
    }
}
