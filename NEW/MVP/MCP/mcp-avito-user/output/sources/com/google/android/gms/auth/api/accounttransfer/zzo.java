package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzo extends zzbz {
    public static final Parcelable.Creator<zzo> CREATOR = new s();

    /* renamed from: g, reason: collision with root package name */
    public static final HashMap f348562g;

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.d
    public final HashSet f348563b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.h
    public final int f348564c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public ArrayList f348565d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final int f348566e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public zzs f348567f;

    static {
        HashMap map = new HashMap();
        f348562g = map;
        map.put("authenticatorData", new FastJsonResponse.Field(11, true, 11, true, "authenticatorData", 2, zzu.class));
        map.put("progress", new FastJsonResponse.Field(11, false, 11, false, "progress", 4, zzs.class));
    }

    public zzo() {
        this.f348563b = new HashSet(1);
        this.f348564c = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object a(FastJsonResponse.Field field) {
        int i12 = field.f349562h;
        if (i12 == 1) {
            return Integer.valueOf(this.f348564c);
        }
        if (i12 == 2) {
            return this.f348565d;
        }
        if (i12 == 4) {
            return this.f348567f;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + field.f349562h);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeArrayInternal(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        int i12 = field.f349562h;
        if (i12 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(i12), arrayList.getClass().getCanonicalName()));
        }
        this.f348565d = arrayList;
        this.f348563b.add(Integer.valueOf(i12));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeInternal(FastJsonResponse.Field field, String str, FastJsonResponse fastJsonResponse) {
        int i12 = field.f349562h;
        if (i12 != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i12), fastJsonResponse.getClass().getCanonicalName()));
        }
        this.f348567f = (zzs) fastJsonResponse;
        this.f348563b.add(Integer.valueOf(i12));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean b(FastJsonResponse.Field field) {
        return this.f348563b.contains(Integer.valueOf(field.f349562h));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map getFieldMappings() {
        return f348562g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        HashSet hashSet = this.f348563b;
        if (hashSet.contains(1)) {
            TX0.a.q(parcel, 1, 4);
            parcel.writeInt(this.f348564c);
        }
        if (hashSet.contains(2)) {
            TX0.a.n(parcel, 2, this.f348565d, true);
        }
        if (hashSet.contains(3)) {
            TX0.a.q(parcel, 3, 4);
            parcel.writeInt(this.f348566e);
        }
        if (hashSet.contains(4)) {
            TX0.a.i(parcel, 4, this.f348567f, i12, true);
        }
        TX0.a.p(parcel, iO2);
    }

    @SafeParcelable.b
    public zzo(@SafeParcelable.d HashSet hashSet, @SafeParcelable.e int i12, @SafeParcelable.e ArrayList arrayList, @SafeParcelable.e int i13, @SafeParcelable.e zzs zzsVar) {
        this.f348563b = hashSet;
        this.f348564c = i12;
        this.f348565d = arrayList;
        this.f348566e = i13;
        this.f348567f = zzsVar;
    }
}
