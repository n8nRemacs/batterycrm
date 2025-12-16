package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public final class E0 implements Parcelable.Creator {
    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(getServiceRequest.f349328b);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(getServiceRequest.f349329c);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(getServiceRequest.f349330d);
        TX0.a.j(parcel, 4, getServiceRequest.f349331e, false);
        TX0.a.e(parcel, 5, getServiceRequest.f349332f);
        TX0.a.m(parcel, 6, getServiceRequest.f349333g, i12);
        TX0.a.a(parcel, 7, getServiceRequest.f349334h, false);
        TX0.a.i(parcel, 8, getServiceRequest.f349335i, i12, false);
        TX0.a.m(parcel, 10, getServiceRequest.f349336j, i12);
        TX0.a.m(parcel, 11, getServiceRequest.f349337k, i12);
        TX0.a.q(parcel, 12, 4);
        parcel.writeInt(getServiceRequest.f349338l ? 1 : 0);
        TX0.a.q(parcel, 13, 4);
        parcel.writeInt(getServiceRequest.f349339m);
        boolean z12 = getServiceRequest.f349340n;
        TX0.a.q(parcel, 14, 4);
        parcel.writeInt(z12 ? 1 : 0);
        TX0.a.j(parcel, 15, getServiceRequest.f349341o, false);
        TX0.a.p(parcel, iO2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        Scope[] scopeArr = GetServiceRequest.f349326p;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f349327q;
        Feature[] featureArr2 = featureArr;
        String strF = null;
        IBinder iBinderR = null;
        Account account = null;
        String strF2 = null;
        int iS2 = 0;
        int iS3 = 0;
        int iS4 = 0;
        boolean zL2 = false;
        int iS5 = 0;
        boolean zL3 = false;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    iS2 = SafeParcelReader.s(parcel, i12);
                    break;
                case 2:
                    iS3 = SafeParcelReader.s(parcel, i12);
                    break;
                case 3:
                    iS4 = SafeParcelReader.s(parcel, i12);
                    break;
                case 4:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 5:
                    iBinderR = SafeParcelReader.r(parcel, i12);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.i(parcel, i12, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.b(parcel, i12);
                    break;
                case '\b':
                    account = (Account) SafeParcelReader.e(parcel, i12, Account.CREATOR);
                    break;
                case '\t':
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
                case '\n':
                    featureArr = (Feature[]) SafeParcelReader.i(parcel, i12, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.i(parcel, i12, Feature.CREATOR);
                    break;
                case '\f':
                    zL2 = SafeParcelReader.l(parcel, i12);
                    break;
                case '\r':
                    iS5 = SafeParcelReader.s(parcel, i12);
                    break;
                case 14:
                    zL3 = SafeParcelReader.l(parcel, i12);
                    break;
                case 15:
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new GetServiceRequest(iS2, iS3, iS4, strF, iBinderR, scopeArr, bundle, account, featureArr, featureArr2, zL2, iS5, zL3, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new GetServiceRequest[i12];
    }
}
