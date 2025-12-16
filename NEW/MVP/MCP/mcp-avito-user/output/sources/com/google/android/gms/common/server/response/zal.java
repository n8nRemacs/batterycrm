package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.InterfaceC36733z;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import j.P;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
@InterfaceC36733z
/* loaded from: classes6.dex */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new m();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f349574b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final String f349575c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final ArrayList f349576d;

    @SafeParcelable.b
    public zal(@SafeParcelable.e int i12, @SafeParcelable.e String str, @SafeParcelable.e ArrayList arrayList) {
        this.f349574b = i12;
        this.f349575c = str;
        this.f349576d = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349574b);
        TX0.a.j(parcel, 2, this.f349575c, false);
        TX0.a.n(parcel, 3, this.f349576d, false);
        TX0.a.p(parcel, iO2);
    }

    public zal(String str, Map map) {
        ArrayList arrayList;
        this.f349574b = 1;
        this.f349575c = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam((FastJsonResponse.Field) map.get(str2), str2));
            }
        }
        this.f349576d = arrayList;
    }
}
