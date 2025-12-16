package com.avito.android.remote.interceptor;

import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImageAcceptHeaderProvider.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/interceptor/j0;", "Lcom/avito/android/remote/interceptor/i0;", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.interceptor.j0, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34289j0 implements InterfaceC34287i0 {
    @Inject
    public C34289j0() {
    }

    @Override // hd.InterfaceC40915a
    public final boolean b() {
        return true;
    }

    @Override // hd.InterfaceC40915a
    @Y61.k
    public final String getKey() {
        return "Accept";
    }

    @Override // hd.InterfaceC40915a
    @Y61.k
    public final String getValue() {
        return "image/webp, image/png, image/jpeg";
    }
}
