package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public class AccountChangeEventsResponse extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new f();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f348540b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final ArrayList f348541c;

    @SafeParcelable.b
    public AccountChangeEventsResponse(@SafeParcelable.e int i12, @SafeParcelable.e ArrayList arrayList) {
        this.f348540b = i12;
        C36729v.j(arrayList);
        this.f348541c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f348540b);
        TX0.a.n(parcel, 2, this.f348541c, false);
        TX0.a.p(parcel, iO2);
    }
}
