package com.avito.android.iac_dialer.impl_module.call_id_provider;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: CallIdProvider.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/call_id_provider/a;", "LMK/a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class a implements MK.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final IJ.a f165931a;

    @Inject
    public a(@k IJ.a aVar) {
        this.f165931a = aVar;
    }

    @Override // MK.a
    @k
    public final String a() {
        return this.f165931a.a();
    }
}
