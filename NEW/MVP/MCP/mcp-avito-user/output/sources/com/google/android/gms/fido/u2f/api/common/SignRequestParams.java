package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
@SafeParcelable.g
@Deprecated
/* loaded from: classes6.dex */
public class SignRequestParams extends RequestParams {

    @N
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new m();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final Integer f349930b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final Double f349931c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final Uri f349932d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final byte[] f349933e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final ArrayList f349934f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final ChannelIdValue f349935g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    public final String f349936h;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static final class a {
    }

    @SafeParcelable.b
    public SignRequestParams(@SafeParcelable.e Integer num, @SafeParcelable.e @P Double d12, @SafeParcelable.e Uri uri, @SafeParcelable.e byte[] bArr, @SafeParcelable.e ArrayList arrayList, @SafeParcelable.e ChannelIdValue channelIdValue, @SafeParcelable.e String str) {
        this.f349930b = num;
        this.f349931c = d12;
        this.f349932d = uri;
        this.f349933e = bArr;
        this.f349934f = arrayList;
        this.f349935g = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                RegisteredKey registeredKey = (RegisteredKey) it.next();
                C36729v.a("registered key has null appId and no request appId is provided", (registeredKey.f349928c == null && uri == null) ? false : true);
                String str2 = registeredKey.f349928c;
                if (str2 != null) {
                    hashSet.add(Uri.parse(str2));
                }
            }
        }
        C36729v.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f349936h = str;
    }

    public final boolean equals(@N Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        if (C36727t.a(this.f349930b, signRequestParams.f349930b) && C36727t.a(this.f349931c, signRequestParams.f349931c) && C36727t.a(this.f349932d, signRequestParams.f349932d) && Arrays.equals(this.f349933e, signRequestParams.f349933e)) {
            ArrayList arrayList = this.f349934f;
            ArrayList arrayList2 = signRequestParams.f349934f;
            if (arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList) && C36727t.a(this.f349935g, signRequestParams.f349935g) && C36727t.a(this.f349936h, signRequestParams.f349936h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(Arrays.hashCode(this.f349933e));
        return Arrays.hashCode(new Object[]{this.f349930b, this.f349932d, this.f349931c, this.f349934f, this.f349935g, this.f349936h, numValueOf});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.g(parcel, 2, this.f349930b);
        TX0.a.c(parcel, 3, this.f349931c);
        TX0.a.i(parcel, 4, this.f349932d, i12, false);
        TX0.a.b(parcel, 5, this.f349933e, false);
        TX0.a.n(parcel, 6, this.f349934f, false);
        TX0.a.i(parcel, 7, this.f349935g, i12, false);
        TX0.a.j(parcel, 8, this.f349936h, false);
        TX0.a.p(parcel, iO2);
    }
}
