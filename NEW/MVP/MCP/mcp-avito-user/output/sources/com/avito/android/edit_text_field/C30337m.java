package com.avito.android.edit_text_field;

import com.avito.android.edit_text_field.EditTextFieldFragment;
import com.avito.android.remote.D0;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import javax.inject.Provider;

/* compiled from: EditTextFieldInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.edit_text_field.m, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30337m implements dagger.internal.h<C30336l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f147005a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<D0> f147006b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Gson> f147007c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f147008d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f147009e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f147010f;

    public C30337m(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f147005a = lVar;
        this.f147006b = provider;
        this.f147007c = provider2;
        this.f147008d = provider3;
        this.f147009e = provider4;
        this.f147010f = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C30336l((EditTextFieldFragment.Mode) this.f147005a.f393949a, dagger.internal.g.a(dagger.internal.w.a(this.f147006b)), dagger.internal.g.a(dagger.internal.w.a(this.f147007c)), this.f147008d.get(), this.f147009e.get(), this.f147010f.get());
    }
}
