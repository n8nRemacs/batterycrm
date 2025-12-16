package com.avito.android.remote;

import android.app.Application;
import com.avito.android.R;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CallAdapterFactoryResourceProviderImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/o;", "Lcom/avito/android/remote/n;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.o, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34354o implements InterfaceC34332n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f254134a;

    @Inject
    public C34354o(@Y61.k Application application) {
        this.f254134a = application;
    }

    @Override // com.avito.android.remote.InterfaceC34332n
    @Y61.k
    public final String a() {
        return this.f254134a.getString(R.string.unknown_server_error);
    }

    @Override // com.avito.android.remote.InterfaceC34332n
    @Y61.k
    public final String b() {
        return this.f254134a.getString(R.string.network_unavailable_snack);
    }

    @Override // com.avito.android.remote.InterfaceC34332n
    @Y61.k
    public final String c() {
        return this.f254134a.getString(R.string.parsing_server_error);
    }

    @Override // com.avito.android.remote.InterfaceC34332n
    @Y61.k
    public final String d() {
        return this.f254134a.getString(R.string.unsafe_network_message);
    }
}
