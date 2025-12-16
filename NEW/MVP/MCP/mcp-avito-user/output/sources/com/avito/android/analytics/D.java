package com.avito.android.analytics;

import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import com.avito.android.util.V2;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: MobileNetworkSignalStrengthProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/D;", "Landroid/telephony/PhoneStateListener;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class D extends PhoneStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F f89646a;

    public D(F f12) {
        this.f89646a = f12;
    }

    @Override // android.telephony.PhoneStateListener
    @InterfaceC42830m
    public final void onSignalStrengthsChanged(@Y61.k SignalStrength signalStrength) {
        this.f89646a.getClass();
        try {
            signalStrength.getLevel();
        } catch (SecurityException e12) {
            V2.f318762a.a("DEFAULT_TAG", "Unexpected security exception during signal strength acquiring", e12);
        }
    }
}
