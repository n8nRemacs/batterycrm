package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class CloudMessage extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<CloudMessage> CREATOR = new e();

    /* renamed from: b, reason: collision with root package name */
    @N
    @SafeParcelable.c
    public final Intent f348804b;

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @SafeParcelable.b
    public CloudMessage(@SafeParcelable.e @N Intent intent) {
        this.f348804b = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.i(parcel, 1, this.f348804b, i12, false);
        TX0.a.p(parcel, iO2);
    }
}
