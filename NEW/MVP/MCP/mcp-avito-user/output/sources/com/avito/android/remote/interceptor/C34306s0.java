package com.avito.android.remote.interceptor;

import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SchemaCheckHeaderProvider.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/interceptor/s0;", "Lcom/avito/android/remote/interceptor/r0;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.interceptor.s0, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public class C34306s0 implements InterfaceC34304r0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.C f253540a;

    @Inject
    public C34306s0(@Y61.k com.avito.android.P p12, @Y61.k com.avito.android.util.C c12) {
        this.f253540a = c12;
    }

    @Override // hd.InterfaceC40915a
    /* renamed from: b */
    public final boolean getF253498b() {
        return true;
    }

    @Override // hd.InterfaceC40915a
    @Y61.k
    public final String getKey() {
        return "Schema-Check";
    }

    @Override // hd.InterfaceC40915a
    @Y61.k
    /* renamed from: getValue */
    public final String getF6495a() {
        this.f253540a.getF125491k().getClass();
        return "0";
    }
}
