package com.avito.android.remote.interceptor;

import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AppHeaderProvider.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/interceptor/k;", "Lcom/avito/android/remote/interceptor/j;", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.interceptor.k, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public class C34290k implements InterfaceC34288j {
    @Inject
    public C34290k() {
    }

    @Override // hd.InterfaceC40915a
    public final boolean b() {
        return true;
    }

    @Override // hd.InterfaceC40915a
    @Y61.k
    public final String getKey() {
        return "X-App";
    }

    @Override // hd.InterfaceC40915a
    @Y61.k
    public final String getValue() {
        return "avito";
    }
}
