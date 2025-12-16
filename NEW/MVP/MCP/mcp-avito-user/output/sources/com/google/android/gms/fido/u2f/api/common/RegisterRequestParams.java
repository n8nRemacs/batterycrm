package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
@SafeParcelable.g
@Deprecated
/* loaded from: classes6.dex */
public class RegisterRequestParams extends RequestParams {

    @N
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new j();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final Integer f349917b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final Double f349918c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final Uri f349919d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final ArrayList f349920e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final ArrayList f349921f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final ChannelIdValue f349922g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    public final String f349923h;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static final class a {
    }

    @SafeParcelable.b
    public RegisterRequestParams(@SafeParcelable.e Integer num, @SafeParcelable.e Double d12, @SafeParcelable.e Uri uri, @SafeParcelable.e ArrayList arrayList, @SafeParcelable.e ArrayList arrayList2, @SafeParcelable.e ChannelIdValue channelIdValue, @SafeParcelable.e String str) {
        this.f349917b = num;
        this.f349918c = d12;
        this.f349919d = uri;
        C36729v.a("empty list of register requests is provided", (arrayList == null || arrayList.isEmpty()) ? false : true);
        this.f349920e = arrayList;
        this.f349921f = arrayList2;
        this.f349922g = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            RegisterRequest registerRequest = (RegisterRequest) it.next();
            C36729v.a("register request has null appId and no request appId is provided", (uri == null && registerRequest.f349916e == null) ? false : true);
            String str2 = registerRequest.f349916e;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it2.next();
            C36729v.a("registered key has null appId and no request appId is provided", (uri == null && registeredKey.f349928c == null) ? false : true);
            String str3 = registeredKey.f349928c;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        C36729v.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f349923h = str;
    }

    public final boolean equals(@N Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        if (C36727t.a(this.f349917b, registerRequestParams.f349917b) && C36727t.a(this.f349918c, registerRequestParams.f349918c) && C36727t.a(this.f349919d, registerRequestParams.f349919d) && C36727t.a(this.f349920e, registerRequestParams.f349920e)) {
            ArrayList arrayList = this.f349921f;
            ArrayList arrayList2 = registerRequestParams.f349921f;
            if (((arrayList == null && arrayList2 == null) || (arrayList != null && arrayList2 != null && arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList))) && C36727t.a(this.f349922g, registerRequestParams.f349922g) && C36727t.a(this.f349923h, registerRequestParams.f349923h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349917b, this.f349919d, this.f349918c, this.f349920e, this.f349921f, this.f349922g, this.f349923h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.g(parcel, 2, this.f349917b);
        TX0.a.c(parcel, 3, this.f349918c);
        TX0.a.i(parcel, 4, this.f349919d, i12, false);
        TX0.a.n(parcel, 5, this.f349920e, false);
        TX0.a.n(parcel, 6, this.f349921f, false);
        TX0.a.i(parcel, 7, this.f349922g, i12, false);
        TX0.a.j(parcel, 8, this.f349923h, false);
        TX0.a.p(parcel, iO2);
    }
}
