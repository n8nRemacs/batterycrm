package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.C20199a;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import j.P;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzs extends zzbz {
    public static final Parcelable.Creator<zzs> CREATOR = new v();

    /* renamed from: h, reason: collision with root package name */
    public static final C20199a f348568h;

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f348569b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public ArrayList f348570c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public ArrayList f348571d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public ArrayList f348572e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public ArrayList f348573f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public ArrayList f348574g;

    static {
        C20199a c20199a = new C20199a();
        f348568h = c20199a;
        c20199a.put("registered", FastJsonResponse.Field.h(2, "registered"));
        c20199a.put("in_progress", FastJsonResponse.Field.h(3, "in_progress"));
        c20199a.put("success", FastJsonResponse.Field.h(4, "success"));
        c20199a.put(PaymentStateKt.PAYMENT_STATE_FAILED, FastJsonResponse.Field.h(5, PaymentStateKt.PAYMENT_STATE_FAILED));
        c20199a.put("escrowed", FastJsonResponse.Field.h(6, "escrowed"));
    }

    public zzs() {
        this.f348569b = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object a(FastJsonResponse.Field field) {
        switch (field.f349562h) {
            case 1:
                return Integer.valueOf(this.f348569b);
            case 2:
                return this.f348570c;
            case 3:
                return this.f348571d;
            case 4:
                return this.f348572e;
            case 5:
                return this.f348573f;
            case 6:
                return this.f348574g;
            default:
                throw new IllegalStateException("Unknown SafeParcelable id=" + field.f349562h);
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean b(FastJsonResponse.Field field) {
        return true;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map getFieldMappings() {
        return f348568h;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void i(FastJsonResponse.Field field, ArrayList arrayList) {
        int i12 = field.f349562h;
        if (i12 == 2) {
            this.f348570c = arrayList;
            return;
        }
        if (i12 == 3) {
            this.f348571d = arrayList;
            return;
        }
        if (i12 == 4) {
            this.f348572e = arrayList;
        } else if (i12 == 5) {
            this.f348573f = arrayList;
        } else {
            if (i12 != 6) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(i12)));
            }
            this.f348574g = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f348569b);
        TX0.a.l(this.f348570c, parcel, 2);
        TX0.a.l(this.f348571d, parcel, 3);
        TX0.a.l(this.f348572e, parcel, 4);
        TX0.a.l(this.f348573f, parcel, 5);
        TX0.a.l(this.f348574g, parcel, 6);
        TX0.a.p(parcel, iO2);
    }

    @SafeParcelable.b
    public zzs(@SafeParcelable.e int i12, @SafeParcelable.e @P ArrayList arrayList, @SafeParcelable.e @P ArrayList arrayList2, @SafeParcelable.e @P ArrayList arrayList3, @SafeParcelable.e @P ArrayList arrayList4, @SafeParcelable.e @P ArrayList arrayList5) {
        this.f348569b = i12;
        this.f348570c = arrayList;
        this.f348571d = arrayList2;
        this.f348572e = arrayList3;
        this.f348573f = arrayList4;
        this.f348574g = arrayList5;
    }
}
