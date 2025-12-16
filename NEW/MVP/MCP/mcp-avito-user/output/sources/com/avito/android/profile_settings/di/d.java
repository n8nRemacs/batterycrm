package com.avito.android.profile_settings.di;

import androidx.fragment.app.Fragment;
import com.avito.android.edit_text_field.p;
import com.avito.android.edit_text_field.q;
import com.avito.android.edit_text_field.s;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileSettingsModule_ProvideEditTextRouterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Boolean> f228423a;

    /* renamed from: b, reason: collision with root package name */
    public final l f228424b;

    /* renamed from: c, reason: collision with root package name */
    public final u f228425c;

    public d(l lVar, u uVar, Provider provider) {
        this.f228423a = provider;
        this.f228424b = lVar;
        this.f228425c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        boolean zBooleanValue = this.f228423a.get().booleanValue();
        Fragment fragment = (Fragment) this.f228424b.f393949a;
        int iIntValue = ((Integer) this.f228425c.get()).intValue();
        c cVar = c.f228422a;
        return zBooleanValue ? new s(fragment, iIntValue) : new q(fragment, iIntValue);
    }
}
