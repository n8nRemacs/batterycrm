package com.avito.android.async_phone.impl_module.splitter;

import Id.InterfaceC14060a;
import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: AsyncPhoneFeaturesImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/async_phone/impl_module/splitter/a;", "LId/a;", "_avito_async-phone_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements InterfaceC14060a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f92200a;

    @Inject
    public a(@k d dVar) {
        this.f92200a = dVar;
    }

    @Override // Id.InterfaceC14060a
    public final boolean a() {
        d dVar = this.f92200a;
        dVar.getClass();
        n<Object> nVar = d.f92202c[0];
        return ((Boolean) dVar.f92203b.a().invoke()).booleanValue();
    }
}
