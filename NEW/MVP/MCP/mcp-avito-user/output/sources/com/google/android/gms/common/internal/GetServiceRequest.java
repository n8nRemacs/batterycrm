package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.InterfaceC36717n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.a
@RX0.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class GetServiceRequest extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new E0();

    /* renamed from: p, reason: collision with root package name */
    public static final Scope[] f349326p = new Scope[0];

    /* renamed from: q, reason: collision with root package name */
    public static final Feature[] f349327q = new Feature[0];

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f349328b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349329c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349330d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public String f349331e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public IBinder f349332f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public Scope[] f349333g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    public Bundle f349334h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public Account f349335i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    public Feature[] f349336j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.c
    public Feature[] f349337k;

    /* renamed from: l, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f349338l;

    /* renamed from: m, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349339m;

    /* renamed from: n, reason: collision with root package name */
    @SafeParcelable.c
    public boolean f349340n;

    /* renamed from: o, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f349341o;

    @SafeParcelable.b
    public GetServiceRequest(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e int i14, @SafeParcelable.e String str, @SafeParcelable.e @j.P IBinder iBinder, @SafeParcelable.e Scope[] scopeArr, @SafeParcelable.e Bundle bundle, @SafeParcelable.e @j.P Account account, @SafeParcelable.e Feature[] featureArr, @SafeParcelable.e Feature[] featureArr2, @SafeParcelable.e boolean z12, @SafeParcelable.e int i15, @SafeParcelable.e boolean z13, @SafeParcelable.e @j.P String str2) {
        scopeArr = scopeArr == null ? f349326p : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        Feature[] featureArr3 = f349327q;
        featureArr = featureArr == null ? featureArr3 : featureArr;
        featureArr2 = featureArr2 == null ? featureArr3 : featureArr2;
        this.f349328b = i12;
        this.f349329c = i13;
        this.f349330d = i14;
        if ("com.google.android.gms".equals(str)) {
            this.f349331e = "com.google.android.gms";
        } else {
            this.f349331e = str;
        }
        if (i12 < 2) {
            Account accountZzb = null;
            if (iBinder != null) {
                int i16 = InterfaceC36717n.a.f349450a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                InterfaceC36717n n02 = iInterfaceQueryLocalInterface instanceof InterfaceC36717n ? (InterfaceC36717n) iInterfaceQueryLocalInterface : new N0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                int i17 = BinderC36691a.f349392b;
                if (n02 != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        accountZzb = n02.zzb();
                    } catch (RemoteException unused) {
                    } catch (Throwable th2) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th2;
                    }
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            }
            this.f349335i = accountZzb;
        } else {
            this.f349332f = iBinder;
            this.f349335i = account;
        }
        this.f349333g = scopeArr;
        this.f349334h = bundle;
        this.f349336j = featureArr;
        this.f349337k = featureArr2;
        this.f349338l = z12;
        this.f349339m = i15;
        this.f349340n = z13;
        this.f349341o = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        E0.a(this, parcel, i12);
    }
}
