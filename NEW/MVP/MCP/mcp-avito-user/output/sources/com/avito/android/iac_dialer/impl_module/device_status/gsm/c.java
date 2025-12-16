package com.avito.android.iac_dialer.impl_module.device_status.gsm;

import Y61.l;
import android.telephony.PhoneStateListener;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: IacGsmCallStateProviderImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/device_status/gsm/c;", "Landroid/telephony/PhoneStateListener;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends PhoneStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f165979a;

    public c(b bVar) {
        this.f165979a = bVar;
    }

    @Override // android.telephony.PhoneStateListener
    @InterfaceC42830m
    public final void onCallStateChanged(int i12, @l String str) {
        boolean z12 = i12 != 0;
        c cVar = b.f165970f;
        this.f165979a.d(z12);
    }
}
