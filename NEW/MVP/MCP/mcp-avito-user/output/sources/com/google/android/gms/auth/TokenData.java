package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.InterfaceC36733z;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@SafeParcelable.a
@InterfaceC36733z
/* loaded from: classes6.dex */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {

    @N
    public static final Parcelable.Creator<TokenData> CREATOR = new p();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f348542b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final String f348543c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final Long f348544d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f348545e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f348546f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final ArrayList f348547g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348548h;

    @SafeParcelable.b
    public TokenData(@SafeParcelable.e int i12, @SafeParcelable.e String str, @SafeParcelable.e @P Long l12, @SafeParcelable.e boolean z12, @SafeParcelable.e boolean z13, @SafeParcelable.e @P ArrayList arrayList, @SafeParcelable.e @P String str2) {
        this.f348542b = i12;
        C36729v.f(str);
        this.f348543c = str;
        this.f348544d = l12;
        this.f348545e = z12;
        this.f348546f = z13;
        this.f348547g = arrayList;
        this.f348548h = str2;
    }

    public final boolean equals(@P Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f348543c, tokenData.f348543c) && C36727t.a(this.f348544d, tokenData.f348544d) && this.f348545e == tokenData.f348545e && this.f348546f == tokenData.f348546f && C36727t.a(this.f348547g, tokenData.f348547g) && C36727t.a(this.f348548h, tokenData.f348548h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f348543c, this.f348544d, Boolean.valueOf(this.f348545e), Boolean.valueOf(this.f348546f), this.f348547g, this.f348548h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f348542b);
        TX0.a.j(parcel, 2, this.f348543c, false);
        TX0.a.h(parcel, 3, this.f348544d);
        TX0.a.q(parcel, 4, 4);
        parcel.writeInt(this.f348545e ? 1 : 0);
        TX0.a.q(parcel, 5, 4);
        parcel.writeInt(this.f348546f ? 1 : 0);
        TX0.a.l(this.f348547g, parcel, 6);
        TX0.a.j(parcel, 7, this.f348548h, false);
        TX0.a.p(parcel, iO2);
    }
}
