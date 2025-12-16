package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.G;
import androidx.collection.C20203c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzw extends zzbz {
    public static final Parcelable.Creator<zzw> CREATOR = new x();

    /* renamed from: i, reason: collision with root package name */
    public static final HashMap f348582i;

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.d
    public final Set f348583b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.h
    public final int f348584c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public String f348585d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public int f348586e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public byte[] f348587f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final PendingIntent f348588g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    public final DeviceMetaData f348589h;

    static {
        HashMap map = new HashMap();
        f348582i = map;
        map.put("accountType", new FastJsonResponse.Field(7, false, 7, false, "accountType", 2, null));
        map.put("status", new FastJsonResponse.Field(0, false, 0, false, "status", 3, null));
        map.put("transferBytes", new FastJsonResponse.Field(8, false, 8, false, "transferBytes", 4, null));
    }

    public zzw() {
        this.f348583b = new C20203c(3);
        this.f348584c = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object a(FastJsonResponse.Field field) {
        int i12 = field.f349562h;
        if (i12 == 1) {
            return Integer.valueOf(this.f348584c);
        }
        if (i12 == 2) {
            return this.f348585d;
        }
        if (i12 == 3) {
            return Integer.valueOf(this.f348586e);
        }
        if (i12 == 4) {
            return this.f348587f;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + field.f349562h);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean b(FastJsonResponse.Field field) {
        return this.f348583b.contains(Integer.valueOf(field.f349562h));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void d(FastJsonResponse.Field field, byte[] bArr) {
        int i12 = field.f349562h;
        if (i12 != 4) {
            throw new IllegalArgumentException(G.e(i12, "Field with id=", " is not known to be a byte array."));
        }
        this.f348587f = bArr;
        this.f348583b.add(Integer.valueOf(i12));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void e(FastJsonResponse.Field field, int i12) {
        int i13 = field.f349562h;
        if (i13 != 3) {
            throw new IllegalArgumentException(G.e(i13, "Field with id=", " is not known to be an int."));
        }
        this.f348586e = i12;
        this.f348583b.add(Integer.valueOf(i13));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void g(FastJsonResponse.Field field, String str) {
        int i12 = field.f349562h;
        if (i12 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i12)));
        }
        this.f348585d = str;
        this.f348583b.add(Integer.valueOf(i12));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map getFieldMappings() {
        return f348582i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        Set set = this.f348583b;
        if (set.contains(1)) {
            TX0.a.q(parcel, 1, 4);
            parcel.writeInt(this.f348584c);
        }
        if (set.contains(2)) {
            TX0.a.j(parcel, 2, this.f348585d, true);
        }
        if (set.contains(3)) {
            int i13 = this.f348586e;
            TX0.a.q(parcel, 3, 4);
            parcel.writeInt(i13);
        }
        if (set.contains(4)) {
            TX0.a.b(parcel, 4, this.f348587f, true);
        }
        if (set.contains(5)) {
            TX0.a.i(parcel, 5, this.f348588g, i12, true);
        }
        if (set.contains(6)) {
            TX0.a.i(parcel, 6, this.f348589h, i12, true);
        }
        TX0.a.p(parcel, iO2);
    }

    @SafeParcelable.b
    public zzw(@SafeParcelable.d HashSet hashSet, @SafeParcelable.e int i12, @SafeParcelable.e String str, @SafeParcelable.e int i13, @SafeParcelable.e byte[] bArr, @SafeParcelable.e PendingIntent pendingIntent, @SafeParcelable.e DeviceMetaData deviceMetaData) {
        this.f348583b = hashSet;
        this.f348584c = i12;
        this.f348585d = str;
        this.f348586e = i13;
        this.f348587f = bArr;
        this.f348588g = pendingIntent;
        this.f348589h = deviceMetaData;
    }
}
