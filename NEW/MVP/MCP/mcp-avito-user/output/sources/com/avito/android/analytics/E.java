package com.avito.android.analytics;

import android.telephony.SignalStrength;
import android.telephony.TelephonyCallback;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: MobileNetworkSignalStrengthProvider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/E;", "Landroid/telephony/TelephonyCallback;", "Landroid/telephony/TelephonyCallback$SignalStrengthsListener;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class E extends TelephonyCallback implements TelephonyCallback.SignalStrengthsListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F f89647a;

    public E(F f12) {
        this.f89647a = f12;
    }

    public final void onSignalStrengthsChanged(@Y61.k SignalStrength signalStrength) {
        this.f89647a.getClass();
        try {
            signalStrength.getLevel();
        } catch (SecurityException e12) {
            V2.f318762a.a("DEFAULT_TAG", "Unexpected security exception during signal strength acquiring", e12);
        }
    }
}
