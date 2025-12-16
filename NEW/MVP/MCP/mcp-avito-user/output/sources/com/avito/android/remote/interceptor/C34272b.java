package com.avito.android.remote.interceptor;

import com.squareup.anvil.annotations.ContributesBinding;
import jJ.InterfaceC42261a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AcceptLanguageHeaderProviderImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/interceptor/b;", "Lcom/avito/android/remote/interceptor/a;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.interceptor.b, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34272b implements InterfaceC34270a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42261a f253521a;

    @Inject
    public C34272b(@Y61.k InterfaceC42261a interfaceC42261a) {
        this.f253521a = interfaceC42261a;
    }

    @Override // hd.InterfaceC40915a
    /* renamed from: b */
    public final boolean getF253513b() {
        return true;
    }

    @Override // hd.InterfaceC40915a
    @Y61.k
    public final String getKey() {
        return "Accept-Language";
    }

    @Override // hd.InterfaceC40915a
    @Y61.l
    /* renamed from: getValue */
    public final String getF253512a() {
        return this.f253521a.P4().getLanguage();
    }
}
