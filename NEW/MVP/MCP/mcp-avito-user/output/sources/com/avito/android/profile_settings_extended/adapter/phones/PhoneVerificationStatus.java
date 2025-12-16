package com.avito.android.profile_settings_extended.adapter.phones;

import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PhoneVerificationStatus.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/phones/PhoneVerificationStatus;", "Landroid/os/Parcelable;", "Lcom/avito/android/profile_settings_extended/adapter/phones/PhoneVerificationStatusConfirmed;", "Lcom/avito/android/profile_settings_extended/adapter/phones/PhoneVerificationStatusNotConfirmed;", "Lcom/avito/android/profile_settings_extended/adapter/phones/PhoneVerificationStatusPending;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class PhoneVerificationStatus implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f229695b;

    public PhoneVerificationStatus(String str, C42822w c42822w) {
        this.f229695b = str;
    }

    @Y61.k
    /* renamed from: getDescription, reason: from getter */
    public String getF229695b() {
        return this.f229695b;
    }
}
