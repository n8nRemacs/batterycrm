package com.avito.android.edit_text_field.mvi;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.edit_text_field.EditTextFieldFragment;
import com.avito.android.edit_text_field.InterfaceC30331g;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EditTextFieldActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f147015a;

    /* renamed from: b, reason: collision with root package name */
    public final u f147016b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<gD.f> f147017c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<E> f147018d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f147019e;

    public b(l lVar, u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f147015a = lVar;
        this.f147016b = uVar;
        this.f147017c = provider;
        this.f147018d = provider2;
        this.f147019e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        EditTextFieldFragment.Mode mode = (EditTextFieldFragment.Mode) this.f147015a.f393949a;
        InterfaceC30331g interfaceC30331g = (InterfaceC30331g) this.f147016b.get();
        this.f147017c.get();
        return new a(mode, interfaceC30331g, this.f147018d.get(), this.f147019e.get());
    }
}
