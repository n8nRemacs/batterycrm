package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import android.text.Editable;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.mlkit_common.zzbj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdf;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi;
import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzbx;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzut;
import com.google.android.material.shape.q;
import com.google.android.material.textfield.TextInputLayout;
import com.google.common.base.InterfaceC37276u;
import com.google.common.collect.A1;
import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.encoders.c;
import com.google.firebase.platforminfo.h;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Collection;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class P0 implements q.c, TextInputLayout.h, InterfaceC37276u, h.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f349366b;

    public /* synthetic */ P0(int i12) {
        this.f349366b = i12;
    }

    public static int d(int i12, int i13, int i14) {
        return zzdi.zzD(i12) + i13 + i14;
    }

    public static int e(int i12, int i13, int i14, int i15) {
        return zzdi.zzD(i12) + i13 + i14 + i15;
    }

    public static com.google.android.gms.dynamic.d f(Parcel parcel) {
        com.google.android.gms.dynamic.d dVarF4 = d.a.f4(parcel.readStrongBinder());
        parcel.recycle();
        return dVarF4;
    }

    public static c.b g(int i12, c.b bVar, String str) {
        zzbj zzbjVar = new zzbj();
        zzbjVar.zza(i12);
        bVar.b(zzbjVar.zzb());
        bVar.a();
        return new c.b(str);
    }

    public static com.google.firebase.encoders.c h(int i12, c.b bVar) {
        zzbj zzbjVar = new zzbj();
        zzbjVar.zza(i12);
        bVar.b(zzbjVar.zzb());
        return bVar.a();
    }

    public static void i(int i12, c.b bVar) {
        zzbj zzbjVar = new zzbj();
        zzbjVar.zza(i12);
        bVar.b(zzbjVar.zzb());
        bVar.a();
    }

    public static int j(int i12, int i13, int i14) {
        return zzut.zzw(i12) + i13 + i14;
    }

    public static int k(int i12, int i13, int i14, int i15) {
        return CodedOutputStream.computeUInt32SizeNoTag(i12) + i13 + i14 + i15;
    }

    public static c.b l(int i12, c.b bVar, String str) {
        zzdf zzdfVar = new zzdf();
        zzdfVar.zza(i12);
        bVar.b(zzdfVar.zzb());
        bVar.a();
        return new c.b(str);
    }

    public static com.google.firebase.encoders.c m(int i12, c.b bVar) {
        zzdf zzdfVar = new zzdf();
        zzdfVar.zza(i12);
        bVar.b(zzdfVar.zzb());
        return bVar.a();
    }

    public static void n(int i12, c.b bVar) {
        zzdf zzdfVar = new zzdf();
        zzdfVar.zza(i12);
        bVar.b(zzdfVar.zzb());
        bVar.a();
    }

    public static c.b o(int i12, c.b bVar, String str) {
        zzae zzaeVar = new zzae();
        zzaeVar.zza(i12);
        bVar.b(zzaeVar.zzb());
        bVar.a();
        return new c.b(str);
    }

    public static com.google.firebase.encoders.c p(int i12, c.b bVar) {
        zzae zzaeVar = new zzae();
        zzaeVar.zza(i12);
        bVar.b(zzaeVar.zzb());
        return bVar.a();
    }

    public static void q(int i12, c.b bVar) {
        zzae zzaeVar = new zzae();
        zzaeVar.zza(i12);
        bVar.b(zzaeVar.zzb());
        bVar.a();
    }

    public static c.b r(int i12, c.b bVar, String str) {
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(i12);
        bVar.b(zzcqVar.zzb());
        bVar.a();
        return new c.b(str);
    }

    public static com.google.firebase.encoders.c s(int i12, c.b bVar) {
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(i12);
        bVar.b(zzcqVar.zzb());
        return bVar.a();
    }

    public static void t(int i12, c.b bVar) {
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(i12);
        bVar.b(zzcqVar.zzb());
        bVar.a();
    }

    public static c.b u(int i12, c.b bVar, String str) {
        zzbx zzbxVar = new zzbx();
        zzbxVar.zza(i12);
        bVar.b(zzbxVar.zzb());
        bVar.a();
        return new c.b(str);
    }

    public static com.google.firebase.encoders.c v(int i12, c.b bVar) {
        zzbx zzbxVar = new zzbx();
        zzbxVar.zza(i12);
        bVar.b(zzbxVar.zzb());
        return bVar.a();
    }

    public static void w(int i12, c.b bVar) {
        zzbx zzbxVar = new zzbx();
        zzbxVar.zza(i12);
        bVar.b(zzbxVar.zzb());
        bVar.a();
    }

    @Override // com.google.android.material.shape.q.c
    public com.google.android.material.shape.e a(com.google.android.material.shape.e eVar) {
        int i12 = com.google.android.material.carousel.g.f356173e;
        return eVar instanceof com.google.android.material.shape.a ? new com.google.android.material.shape.c(((com.google.android.material.shape.a) eVar).f357027a) : eVar;
    }

    @Override // com.google.common.base.InterfaceC37276u
    public Object apply(Object obj) {
        switch (this.f349366b) {
            case 21:
                return ((Iterable) obj).iterator();
            case 22:
                return ((Map) obj).keySet().iterator();
            case 23:
                String str = (String) obj;
                if (com.google.common.net.g.f360353g.n(str) && !str.isEmpty()) {
                    return str;
                }
                StringBuilder sb2 = new StringBuilder(str.length() + 16);
                sb2.append('\"');
                for (int i12 = 0; i12 < str.length(); i12++) {
                    char cCharAt = str.charAt(i12);
                    if (cCharAt == '\r' || cCharAt == '\\' || cCharAt == '\"') {
                        sb2.append('\\');
                    }
                    sb2.append(cCharAt);
                }
                sb2.append('\"');
                return sb2.toString();
            default:
                return A1.r((Collection) obj);
        }
    }

    @Override // com.google.firebase.platforminfo.h.a
    public String b(Context context) {
        switch (this.f349366b) {
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                return applicationInfo2 != null ? String.valueOf(applicationInfo2.minSdkVersion) : "";
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout.h
    public int c(Editable editable) {
        return TextInputLayout.lambda$new$0(editable);
    }
}
