package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzbx;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public abstract class K1 extends zzbx implements L1 {
    public K1() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
        ArrayList arrayList;
        switch (i12) {
            case 1:
                zzbe zzbeVar = (zzbe) zzbw.zza(parcel, zzbe.CREATOR);
                zzo zzoVar = (zzo) zzbw.zza(parcel, zzo.CREATOR);
                zzbw.zzb(parcel);
                ((M2) this).U1(zzbeVar, zzoVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zznb zznbVar = (zznb) zzbw.zza(parcel, zznb.CREATOR);
                zzo zzoVar2 = (zzo) zzbw.zza(parcel, zzo.CREATOR);
                zzbw.zzb(parcel);
                ((M2) this).Y0(zznbVar, zzoVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                zzo zzoVar3 = (zzo) zzbw.zza(parcel, zzo.CREATOR);
                zzbw.zzb(parcel);
                ((M2) this).B1(zzoVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbe zzbeVar2 = (zzbe) zzbw.zza(parcel, zzbe.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                zzbw.zzb(parcel);
                M2 m22 = (M2) this;
                C36729v.j(zzbeVar2);
                C36729v.f(string);
                m22.g4(string, true);
                m22.f4(new Z2(m22, zzbeVar2, string));
                parcel2.writeNoException();
                return true;
            case 6:
                zzo zzoVar4 = (zzo) zzbw.zza(parcel, zzo.CREATOR);
                zzbw.zzb(parcel);
                ((M2) this).t1(zzoVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                zzo zzoVar5 = (zzo) zzbw.zza(parcel, zzo.CREATOR);
                boolean zZzc = zzbw.zzc(parcel);
                zzbw.zzb(parcel);
                M2 m23 = (M2) this;
                m23.h4(zzoVar5);
                String str = zzoVar5.f355567b;
                C36729v.j(str);
                C36997w5 c36997w5 = m23.f354801a;
                try {
                    List<K5> list = (List) ((FutureTask) c36997w5.zzl().j(new CallableC36863d3(m23, str))).get();
                    arrayList = new ArrayList(list.size());
                    for (K5 k52 : list) {
                        if (zZzc || !N5.m0(k52.f354767c)) {
                            arrayList.add(new zznb(k52));
                        }
                    }
                } catch (InterruptedException e12) {
                    e = e12;
                    S1 s1Zzj = c36997w5.zzj();
                    s1Zzj.f354889f.a(S1.i(str), "Failed to get user properties. appId", e);
                    arrayList = null;
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                } catch (ExecutionException e13) {
                    e = e13;
                    S1 s1Zzj2 = c36997w5.zzj();
                    s1Zzj2.f354889f.a(S1.i(str), "Failed to get user properties. appId", e);
                    arrayList = null;
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                zzbe zzbeVar3 = (zzbe) zzbw.zza(parcel, zzbe.CREATOR);
                String string2 = parcel.readString();
                zzbw.zzb(parcel);
                byte[] bArrY1 = ((M2) this).Y1(zzbeVar3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrY1);
                return true;
            case 10:
                long j12 = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                zzbw.zzb(parcel);
                ((M2) this).J(j12, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                zzo zzoVar6 = (zzo) zzbw.zza(parcel, zzo.CREATOR);
                zzbw.zzb(parcel);
                String strX1 = ((M2) this).x1(zzoVar6);
                parcel2.writeNoException();
                parcel2.writeString(strX1);
                return true;
            case 12:
                zzae zzaeVar = (zzae) zzbw.zza(parcel, zzae.CREATOR);
                zzo zzoVar7 = (zzo) zzbw.zza(parcel, zzo.CREATOR);
                zzbw.zzb(parcel);
                ((M2) this).w2(zzaeVar, zzoVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                zzae zzaeVar2 = (zzae) zzbw.zza(parcel, zzae.CREATOR);
                zzbw.zzb(parcel);
                M2 m24 = (M2) this;
                C36729v.j(zzaeVar2);
                C36729v.j(zzaeVar2.f355523d);
                C36729v.f(zzaeVar2.f355521b);
                m24.g4(zzaeVar2.f355521b, true);
                m24.f4(new S2(m24, new zzae(zzaeVar2)));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                boolean zZzc2 = zzbw.zzc(parcel);
                zzo zzoVar8 = (zzo) zzbw.zza(parcel, zzo.CREATOR);
                zzbw.zzb(parcel);
                List<zznb> listW3 = ((M2) this).W3(string6, string7, zZzc2, zzoVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listW3);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                boolean zZzc3 = zzbw.zzc(parcel);
                zzbw.zzb(parcel);
                List<zznb> listX = ((M2) this).x(string8, string9, string10, zZzc3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listX);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                zzo zzoVar9 = (zzo) zzbw.zza(parcel, zzo.CREATOR);
                zzbw.zzb(parcel);
                List<zzae> listS1 = ((M2) this).S1(string11, string12, zzoVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listS1);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                zzbw.zzb(parcel);
                List<zzae> listC2 = ((M2) this).c2(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listC2);
                return true;
            case 18:
                zzo zzoVar10 = (zzo) zzbw.zza(parcel, zzo.CREATOR);
                zzbw.zzb(parcel);
                ((M2) this).q1(zzoVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                zzo zzoVar11 = (zzo) zzbw.zza(parcel, zzo.CREATOR);
                zzbw.zzb(parcel);
                ((M2) this).mo108m(bundle, zzoVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                zzo zzoVar12 = (zzo) zzbw.zza(parcel, zzo.CREATOR);
                zzbw.zzb(parcel);
                ((M2) this).s1(zzoVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                zzo zzoVar13 = (zzo) zzbw.zza(parcel, zzo.CREATOR);
                zzbw.zzb(parcel);
                zzaj zzajVarG1 = ((M2) this).g1(zzoVar13);
                parcel2.writeNoException();
                zzbw.zzb(parcel2, zzajVarG1);
                return true;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                zzo zzoVar14 = (zzo) zzbw.zza(parcel, zzo.CREATOR);
                Bundle bundle2 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                zzbw.zzb(parcel);
                List listM = ((M2) this).m(bundle2, zzoVar14);
                parcel2.writeNoException();
                parcel2.writeTypedList(listM);
                return true;
        }
    }
}
