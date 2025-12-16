package com.avito.android.remote.interceptor;

import com.squareup.anvil.annotations.ContributesBinding;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DateHeaderProviderImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/interceptor/A;", "Lcom/avito/android/remote/interceptor/z;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public class A implements InterfaceC34319z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.h f253481a;

    @Inject
    public A(@Y61.k com.avito.android.server_time.h hVar) {
        this.f253481a = hVar;
    }

    @Override // hd.InterfaceC40915a
    /* renamed from: b */
    public final boolean getF253513b() {
        return true;
    }

    @Override // hd.InterfaceC40915a
    @Y61.k
    public final String getKey() {
        return "X-Date";
    }

    @Override // hd.InterfaceC40915a
    @Y61.l
    /* renamed from: getValue */
    public final String getF253512a() {
        return String.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.f253481a.now()));
    }
}
