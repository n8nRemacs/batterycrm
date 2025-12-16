package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzu extends zzbz {
    public static final Parcelable.Creator<zzu> CREATOR = new w();

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f348575h;

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.d
    public final HashSet f348576b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.h
    public final int f348577c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public zzw f348578d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public String f348579e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public String f348580f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final String f348581g;

    static {
        HashMap map = new HashMap();
        f348575h = map;
        map.put("authenticatorInfo", new FastJsonResponse.Field(11, false, 11, false, "authenticatorInfo", 2, zzw.class));
        map.put("signature", new FastJsonResponse.Field(7, false, 7, false, "signature", 3, null));
        map.put("package", new FastJsonResponse.Field(7, false, 7, false, "package", 4, null));
    }

    public zzu() {
        this.f348576b = new HashSet(3);
        this.f348577c = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object a(FastJsonResponse.Field field) {
        int i12 = field.f349562h;
        if (i12 == 1) {
            return Integer.valueOf(this.f348577c);
        }
        if (i12 == 2) {
            return this.f348578d;
        }
        if (i12 == 3) {
            return this.f348579e;
        }
        if (i12 == 4) {
            return this.f348580f;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + field.f349562h);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeInternal(FastJsonResponse.Field field, String str, FastJsonResponse fastJsonResponse) {
        int i12 = field.f349562h;
        if (i12 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i12), fastJsonResponse.getClass().getCanonicalName()));
        }
        this.f348578d = (zzw) fastJsonResponse;
        this.f348576b.add(Integer.valueOf(i12));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean b(FastJsonResponse.Field field) {
        return this.f348576b.contains(Integer.valueOf(field.f349562h));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void g(FastJsonResponse.Field field, String str) {
        int i12 = field.f349562h;
        if (i12 == 3) {
            this.f348579e = str;
        } else {
            if (i12 != 4) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i12)));
            }
            this.f348580f = str;
        }
        this.f348576b.add(Integer.valueOf(i12));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map getFieldMappings() {
        return f348575h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        HashSet hashSet = this.f348576b;
        if (hashSet.contains(1)) {
            TX0.a.q(parcel, 1, 4);
            parcel.writeInt(this.f348577c);
        }
        if (hashSet.contains(2)) {
            TX0.a.i(parcel, 2, this.f348578d, i12, true);
        }
        if (hashSet.contains(3)) {
            TX0.a.j(parcel, 3, this.f348579e, true);
        }
        if (hashSet.contains(4)) {
            TX0.a.j(parcel, 4, this.f348580f, true);
        }
        if (hashSet.contains(5)) {
            TX0.a.j(parcel, 5, this.f348581g, true);
        }
        TX0.a.p(parcel, iO2);
    }

    @SafeParcelable.b
    public zzu(@SafeParcelable.d HashSet hashSet, @SafeParcelable.e int i12, @SafeParcelable.e zzw zzwVar, @SafeParcelable.e String str, @SafeParcelable.e String str2, @SafeParcelable.e String str3) {
        this.f348576b = hashSet;
        this.f348577c = i12;
        this.f348578d = zzwVar;
        this.f348579e = str;
        this.f348580f = str2;
        this.f348581g = str3;
    }
}
