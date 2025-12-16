package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.InterfaceC36753g;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzgg;
import com.google.android.gms.internal.measurement.zzgs;
import com.google.android.gms.internal.measurement.zzgv;
import com.google.android.gms.internal.measurement.zzis;
import com.google.android.gms.internal.measurement.zzjf;
import com.google.android.gms.internal.measurement.zzku;
import com.google.android.gms.internal.measurement.zznr;
import com.google.android.gms.internal.measurement.zzns;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpt;
import com.google.android.gms.measurement.internal.zzif;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class G5 extends AbstractC36990v5 {
    public static void B(int i12, StringBuilder sb2) {
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append("  ");
        }
    }

    public static void C(Uri.Builder builder, String str, String str2, Set<String> set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static void D(Uri.Builder builder, String[] strArr, Bundle bundle, Set<String> set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                C(builder, str3, string, set);
            }
        }
    }

    public static void E(zzfi.zze.zza zzaVar, String str, Long l12) {
        List<zzfi.zzg> listZzf = zzaVar.zzf();
        int i12 = 0;
        while (true) {
            if (i12 >= listZzf.size()) {
                i12 = -1;
                break;
            } else if (str.equals(listZzf.get(i12).zzg())) {
                break;
            } else {
                i12++;
            }
        }
        zzfi.zzg.zza zzaVarZza = zzfi.zzg.zze().zza(str);
        if (l12 != null) {
            zzaVarZza.zza(l12.longValue());
        }
        if (i12 >= 0) {
            zzaVar.zza(i12, zzaVarZza);
        } else {
            zzaVar.zza(zzaVarZza);
        }
    }

    public static void J(StringBuilder sb2, int i12, String str, zzew.zzd zzdVar) {
        if (zzdVar == null) {
            return;
        }
        B(i12, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzdVar.zzh()) {
            K(sb2, i12, "comparison_type", zzdVar.zza().name());
        }
        if (zzdVar.zzj()) {
            K(sb2, i12, "match_as_float", Boolean.valueOf(zzdVar.zzg()));
        }
        if (zzdVar.zzi()) {
            K(sb2, i12, "comparison_value", zzdVar.zzd());
        }
        if (zzdVar.zzl()) {
            K(sb2, i12, "min_comparison_value", zzdVar.zzf());
        }
        if (zzdVar.zzk()) {
            K(sb2, i12, "max_comparison_value", zzdVar.zze());
        }
        B(i12, sb2);
        sb2.append("}\n");
    }

    public static void K(StringBuilder sb2, int i12, String str, Object obj) {
        if (obj == null) {
            return;
        }
        B(i12 + 1, sb2);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static void M(StringBuilder sb2, String str, zzfi.zzl zzlVar) {
        if (zzlVar == null) {
            return;
        }
        B(3, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzlVar.zzb() != 0) {
            B(4, sb2);
            sb2.append("results: ");
            int i12 = 0;
            for (Long l12 : zzlVar.zzi()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l12);
                i12 = i13;
            }
            sb2.append('\n');
        }
        if (zzlVar.zzd() != 0) {
            B(4, sb2);
            sb2.append("status: ");
            int i14 = 0;
            for (Long l13 : zzlVar.zzk()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l13);
                i14 = i15;
            }
            sb2.append('\n');
        }
        if (zzlVar.zza() != 0) {
            B(4, sb2);
            sb2.append("dynamic_filter_timestamps: {");
            int i16 = 0;
            for (zzfi.zzd zzdVar : zzlVar.zzh()) {
                int i17 = i16 + 1;
                if (i16 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzdVar.zzf() ? Integer.valueOf(zzdVar.zza()) : null);
                sb2.append(":");
                sb2.append(zzdVar.zze() ? Long.valueOf(zzdVar.zzb()) : null);
                i16 = i17;
            }
            sb2.append("}\n");
        }
        if (zzlVar.zzc() != 0) {
            B(4, sb2);
            sb2.append("sequence_filter_timestamps: {");
            int i18 = 0;
            for (zzfi.zzm zzmVar : zzlVar.zzj()) {
                int i19 = i18 + 1;
                if (i18 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzmVar.zzf() ? Integer.valueOf(zzmVar.zzb()) : null);
                sb2.append(": [");
                Iterator<Long> it = zzmVar.zze().iterator();
                int i22 = 0;
                while (it.hasNext()) {
                    long jLongValue = it.next().longValue();
                    int i23 = i22 + 1;
                    if (i22 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jLongValue);
                    i22 = i23;
                }
                sb2.append("]");
                i18 = i19;
            }
            sb2.append("}\n");
        }
        B(3, sb2);
        sb2.append("}\n");
    }

    public static boolean N(int i12, List list) {
        if (i12 < (list.size() << 6)) {
            return ((1 << (i12 % 64)) & ((Long) list.get(i12 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static Bundle P(List<zzfi.zzg> list) {
        Bundle bundle = new Bundle();
        for (zzfi.zzg zzgVar : list) {
            String strZzg = zzgVar.zzg();
            if (zzgVar.zzj()) {
                bundle.putString(strZzg, String.valueOf(zzgVar.zza()));
            } else if (zzgVar.zzk()) {
                bundle.putString(strZzg, String.valueOf(zzgVar.zzb()));
            } else if (zzgVar.zzn()) {
                bundle.putString(strZzg, zzgVar.zzh());
            } else if (zzgVar.zzl()) {
                bundle.putString(strZzg, String.valueOf(zzgVar.zzd()));
            }
        }
        return bundle;
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [android.os.Bundle[], java.io.Serializable] */
    public static Serializable Q(zzfi.zze zzeVar, String str) {
        zzfi.zzg zzgVarR = r(zzeVar, str);
        if (zzgVarR == null) {
            return null;
        }
        if (zzgVarR.zzn()) {
            return zzgVarR.zzh();
        }
        if (zzgVarR.zzl()) {
            return Long.valueOf(zzgVarR.zzd());
        }
        if (zzgVarR.zzj()) {
            return Double.valueOf(zzgVarR.zza());
        }
        if (zzgVarR.zzc() <= 0) {
            return null;
        }
        List<zzfi.zzg> listZzi = zzgVarR.zzi();
        ArrayList arrayList = new ArrayList();
        for (zzfi.zzg zzgVar : listZzi) {
            if (zzgVar != null) {
                Bundle bundle = new Bundle();
                for (zzfi.zzg zzgVar2 : zzgVar.zzi()) {
                    if (zzgVar2.zzn()) {
                        bundle.putString(zzgVar2.zzg(), zzgVar2.zzh());
                    } else if (zzgVar2.zzl()) {
                        bundle.putLong(zzgVar2.zzg(), zzgVar2.zzd());
                    } else if (zzgVar2.zzj()) {
                        bundle.putDouble(zzgVar2.zzg(), zzgVar2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static boolean R(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static Bundle T(List<zzfi.zzn> list) {
        Bundle bundle = new Bundle();
        for (zzfi.zzn zznVar : list) {
            String strZzg = zznVar.zzg();
            if (zznVar.zzi()) {
                bundle.putString(strZzg, String.valueOf(zznVar.zza()));
            } else if (zznVar.zzj()) {
                bundle.putString(strZzg, String.valueOf(zznVar.zzb()));
            } else if (zznVar.zzm()) {
                bundle.putString(strZzg, zznVar.zzh());
            } else if (zznVar.zzk()) {
                bundle.putString(strZzg, String.valueOf(zznVar.zzc()));
            }
        }
        return bundle;
    }

    public static int l(zzfi.zzj.zza zzaVar, String str) {
        if (zzaVar == null) {
            return -1;
        }
        for (int i12 = 0; i12 < zzaVar.zzd(); i12++) {
            if (str.equals(zzaVar.zzj(i12).zzg())) {
                return i12;
            }
        }
        return -1;
    }

    public static Bundle n(List<zzfi.zzg> list) {
        Bundle bundle = new Bundle();
        for (zzfi.zzg zzgVar : list) {
            String strZzg = zzgVar.zzg();
            if (zzgVar.zzj()) {
                bundle.putDouble(strZzg, zzgVar.zza());
            } else if (zzgVar.zzk()) {
                bundle.putFloat(strZzg, zzgVar.zzb());
            } else if (zzgVar.zzn()) {
                bundle.putString(strZzg, zzgVar.zzh());
            } else if (zzgVar.zzl()) {
                bundle.putLong(strZzg, zzgVar.zzd());
            }
        }
        return bundle;
    }

    public static Bundle o(Map map, boolean z12) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z12) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj2 = arrayList.get(i12);
                    i12++;
                    arrayList2.add(o((Map) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static zzfi.zzg r(zzfi.zze zzeVar, String str) {
        for (zzfi.zzg zzgVar : zzeVar.zzh()) {
            if (zzgVar.zzg().equals(str)) {
                return zzgVar;
            }
        }
        return null;
    }

    public static zzku s(zzjf.zzb zzbVar, byte[] bArr) {
        zzis zzisVarZza = zzis.zza();
        return zzisVarZza != null ? zzbVar.zza(bArr, zzisVarZza) : zzbVar.zza(bArr);
    }

    public static zzbe t(zzad zzadVar) {
        Object obj;
        Bundle bundleO = o(zzadVar.zzc(), true);
        String string = (!bundleO.containsKey("_o") || (obj = bundleO.get("_o")) == null) ? "app" : obj.toString();
        String strA = C36920l4.a(zzadVar.zzb(), C36912k3.f355240a, C36912k3.f355242c);
        if (strA == null) {
            strA = zzadVar.zzb();
        }
        return new zzbe(strA, new zzaz(bundleO), string, zzadVar.zza());
    }

    public static String x(boolean z12, boolean z13, boolean z14) {
        StringBuilder sb2 = new StringBuilder();
        if (z12) {
            sb2.append("Dynamic ");
        }
        if (z13) {
            sb2.append("Sequence ");
        }
        if (z14) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    public static ArrayList y(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i12 = 0; i12 < length; i12++) {
            long j12 = 0;
            for (int i13 = 0; i13 < 64; i13++) {
                int i14 = (i12 << 6) + i13;
                if (i14 < bitSet.length()) {
                    if (bitSet.get(i14)) {
                        j12 |= 1 << i13;
                    }
                }
            }
            arrayList.add(Long.valueOf(j12));
        }
        return arrayList;
    }

    public static HashMap z(Bundle bundle, boolean z12) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z13 = obj instanceof Parcelable[];
            if (z13 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z12) {
                    ArrayList arrayList = new ArrayList();
                    if (z13) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(z((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj2 = arrayList2.get(i12);
                            i12++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(z((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(z((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public final List<Long> A(List<Long> list, List<Integer> list2) {
        int i12;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                super.zzj().f354892i.c("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    super.zzj().f354892i.a(num, "Ignoring bit index greater than bitSet size", Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i13 = size2;
            i12 = size;
            size = i13;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i12);
    }

    public final void F(zzfi.zzg.zza zzaVar, Object obj) {
        zzaVar.zze().zzc().zzb().zzd();
        if (obj instanceof String) {
            zzaVar.zzb((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzaVar.zza(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzaVar.zza(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            super.zzj().f354889f.c("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                zzfi.zzg.zza zzaVarZze = zzfi.zzg.zze();
                for (String str : bundle.keySet()) {
                    zzfi.zzg.zza zzaVarZza = zzfi.zzg.zze().zza(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        zzaVarZza.zza(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        zzaVarZza.zzb((String) obj2);
                    } else if (obj2 instanceof Double) {
                        zzaVarZza.zza(((Double) obj2).doubleValue());
                    }
                    zzaVarZze.zza(zzaVarZza);
                }
                if (zzaVarZze.zza() > 0) {
                    arrayList.add((zzfi.zzg) ((zzjf) zzaVarZze.zzah()));
                }
            }
        }
        zzaVar.zza(arrayList);
    }

    public final void G(zzfi.zzj.zza zzaVar) {
        super.zzj().f354897n.b("Checking account type status for ad personalization signals");
        if (U(zzaVar.zzt())) {
            super.zzj().f354896m.b("Turning off ad personalization due to account type");
            zzfi.zzn.zza zzaVarZza = zzfi.zzn.zze().zza("_npa");
            I2 i22 = this.f355183a;
            zzfi.zzn zznVar = (zzfi.zzn) ((zzjf) zzaVarZza.zzb(i22.j().i()).zza(1L).zzah());
            int i12 = 0;
            while (true) {
                if (i12 >= zzaVar.zzd()) {
                    zzaVar.zza(zznVar);
                    break;
                } else {
                    if ("_npa".equals(zzaVar.zzj(i12).zzg())) {
                        zzaVar.zza(i12, zznVar);
                        break;
                    }
                    i12++;
                }
            }
            if (zzns.zza()) {
                if (i22.f354715g.o(null, E.f354581K0)) {
                    C36887h c36887hA = C36887h.a(zzaVar.zzv());
                    c36887hA.c(zzif.zza.AD_PERSONALIZATION, EnumC36901j.CHILD_ACCOUNT);
                    zzaVar.zzf(c36887hA.toString());
                }
            }
        }
    }

    public final void H(zzfi.zzn.zza zzaVar, Object obj) {
        C36729v.j(obj);
        zzaVar.zzc().zzb().zza();
        if (obj instanceof String) {
            zzaVar.zzb((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzaVar.zza(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzaVar.zza(((Double) obj).doubleValue());
        } else {
            super.zzj().f354889f.c("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final void I(StringBuilder sb2, int i12, zzew.zzc zzcVar) {
        if (zzcVar == null) {
            return;
        }
        B(i12, sb2);
        sb2.append("filter {\n");
        if (zzcVar.zzg()) {
            K(sb2, i12, "complement", Boolean.valueOf(zzcVar.zzf()));
        }
        if (zzcVar.zzi()) {
            K(sb2, i12, "param_name", this.f355183a.f354721m.f(zzcVar.zze()));
        }
        if (zzcVar.zzj()) {
            int i13 = i12 + 1;
            zzew.zzf zzfVarZzd = zzcVar.zzd();
            if (zzfVarZzd != null) {
                B(i13, sb2);
                sb2.append("string_filter");
                sb2.append(" {\n");
                if (zzfVarZzd.zzj()) {
                    K(sb2, i13, "match_type", zzfVarZzd.zzb().name());
                }
                if (zzfVarZzd.zzi()) {
                    K(sb2, i13, "expression", zzfVarZzd.zze());
                }
                if (zzfVarZzd.zzh()) {
                    K(sb2, i13, "case_sensitive", Boolean.valueOf(zzfVarZzd.zzg()));
                }
                if (zzfVarZzd.zza() > 0) {
                    B(i12 + 2, sb2);
                    sb2.append("expression_list {\n");
                    for (String str : zzfVarZzd.zzf()) {
                        B(i12 + 3, sb2);
                        sb2.append(str);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                B(i13, sb2);
                sb2.append("}\n");
            }
        }
        if (zzcVar.zzh()) {
            J(sb2, i12 + 1, "number_filter", zzcVar.zzc());
        }
        B(i12, sb2);
        sb2.append("}\n");
    }

    public final void L(StringBuilder sb2, int i12, List<zzfi.zzg> list) {
        if (list == null) {
            return;
        }
        int i13 = i12 + 1;
        for (zzfi.zzg zzgVar : list) {
            if (zzgVar != null) {
                B(i13, sb2);
                sb2.append("param {\n");
                K(sb2, i13, "name", zzgVar.zzm() ? this.f355183a.f354721m.f(zzgVar.zzg()) : null);
                K(sb2, i13, "string_value", zzgVar.zzn() ? zzgVar.zzh() : null);
                K(sb2, i13, "int_value", zzgVar.zzl() ? Long.valueOf(zzgVar.zzd()) : null);
                K(sb2, i13, "double_value", zzgVar.zzj() ? Double.valueOf(zzgVar.zza()) : null);
                if (zzgVar.zzc() > 0) {
                    L(sb2, i13, zzgVar.zzi());
                }
                B(i13, sb2);
                sb2.append("}\n");
            }
        }
    }

    public final boolean O(long j12, long j13) {
        if (j12 == 0 || j13 <= 0) {
            return true;
        }
        this.f355183a.f354722n.getClass();
        return Math.abs(System.currentTimeMillis() - j12) > j13;
    }

    public final byte[] S(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e12) {
            super.zzj().f354889f.c("Failed to gzip content", e12);
            throw e12;
        }
    }

    public final boolean U(String str) {
        boolean zZza = zznr.zza();
        I2 i22 = this.f355183a;
        if (zZza && i22.f354715g.o(null, E.f354597S0)) {
            return false;
        }
        C36729v.j(str);
        C36862d2 c36862d2S = super.g().S(str);
        return c36862d2S != null && i22.j().m() && c36862d2S.h() && super.h().G(str);
    }

    public final byte[] V(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int i12 = gZIPInputStream.read(bArr2);
                if (i12 <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, i12);
            }
        } catch (IOException e12) {
            super.zzj().f354889f.c("Failed to ungzip content", e12);
            throw e12;
        }
    }

    public final ArrayList W() throws NumberFormatException {
        Context context = this.f355380b.f355449l.f354709a;
        List<J1<?>> list = E.f354607a;
        zzgg zzggVarZza = zzgg.zza(context.getContentResolver(), zzgs.zza("com.google.android.gms.measurement"), new Runnable() { // from class: com.google.android.gms.measurement.internal.D
            @Override // java.lang.Runnable
            public final void run() {
                zzgv.zzc();
            }
        });
        Map<String, String> mapEmptyMap = zzggVarZza == null ? Collections.emptyMap() : zzggVarZza.zza();
        if (mapEmptyMap == null || mapEmptyMap.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iIntValue = E.f354592Q.a(null).intValue();
        for (Map.Entry<String, String> entry : mapEmptyMap.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int i12 = Integer.parseInt(entry.getValue());
                    if (i12 != 0) {
                        arrayList.add(Integer.valueOf(i12));
                        if (arrayList.size() >= iIntValue) {
                            super.zzj().f354892i.c("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e12) {
                    super.zzj().f354892i.c("Experiment ID NumberFormatException", e12);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3
    @Pure
    public final /* bridge */ /* synthetic */ C36876f2 b() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3
    @Pure
    public final /* bridge */ /* synthetic */ N5 c() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3
    public final /* bridge */ /* synthetic */ void e() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.C36969s5
    public final /* bridge */ /* synthetic */ G5 f() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.C36969s5
    public final /* bridge */ /* synthetic */ C36908k g() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC36990v5
    public final boolean k() {
        return false;
    }

    @j.l0
    public final long m(byte[] bArr) throws NoSuchAlgorithmException {
        C36729v.j(bArr);
        super.c().e();
        MessageDigest messageDigestT0 = N5.t0();
        if (messageDigestT0 != null) {
            return N5.n(messageDigestT0.digest(bArr));
        }
        super.zzj().f354889f.b("Failed to get MD5");
        return 0L;
    }

    public final <T extends Parcelable> T p(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } catch (SafeParcelReader.ParseException unused) {
            super.zzj().f354889f.b("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    public final zzfi.zze q(C36991w c36991w) {
        zzfi.zze.zza zzaVarZza = zzfi.zze.zze().zza(c36991w.f355416e);
        zzaz zzazVar = c36991w.f355417f;
        zzazVar.getClass();
        B b12 = new B(zzazVar);
        while (b12.f354532b.hasNext()) {
            String str = (String) b12.next();
            zzfi.zzg.zza zzaVarZza2 = zzfi.zzg.zze().zza(str);
            Object obj = zzazVar.f355533b.get(str);
            C36729v.j(obj);
            F(zzaVarZza2, obj);
            zzaVarZza.zza(zzaVarZza2);
        }
        return (zzfi.zze) ((zzjf) zzaVarZza.zzah());
    }

    @TargetApi(30)
    public final zzmh u(String str, zzfi.zzj.zza zzaVar, zzfi.zze.zza zzaVar2, String str2) {
        int iIndexOf;
        if (zzph.zza()) {
            I2 i22 = this.f355183a;
            if (i22.f354715g.o(str, E.f354565C0)) {
                i22.f354722n.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                J1<String> j12 = E.f354614d0;
                C36880g c36880g = i22.f354715g;
                Set setA = J5.a(c36880g.m(str, j12).split(","));
                Uri.Builder builderI = this.f355380b.f355447j.i(str);
                C(builderI, "gmp_app_id", zzaVar.zzx(), setA);
                C(builderI, "gmp_version", "84002", setA);
                String strZzu = zzaVar.zzu();
                J1<Boolean> j13 = E.f354571F0;
                String str3 = "";
                if (c36880g.o(str, j13) && super.h().I(str)) {
                    strZzu = "";
                }
                C(builderI, "app_instance_id", strZzu, setA);
                C(builderI, "rdid", zzaVar.zzz(), setA);
                C(builderI, "bundle_id", zzaVar.zzt(), setA);
                String strZze = zzaVar2.zze();
                String strA = C36920l4.a(strZze, C36912k3.f355242c, C36912k3.f355240a);
                if (!TextUtils.isEmpty(strA)) {
                    strZze = strA;
                }
                C(builderI, "app_event_name", strZze, setA);
                C(builderI, "app_version", String.valueOf(zzaVar.zzb()), setA);
                String strZzy = zzaVar.zzy();
                if (!c36880g.o(str, j13) || !super.h().M(str)) {
                    str3 = strZzy;
                } else if (c36880g.o(str, E.f354648u0)) {
                    if (!TextUtils.isEmpty(strZzy) && (iIndexOf = strZzy.indexOf(".")) != -1) {
                        strZzy = strZzy.substring(0, iIndexOf);
                    }
                    str3 = strZzy;
                }
                C(builderI, "os_version", str3, setA);
                C(builderI, "timestamp", String.valueOf(zzaVar2.zzc()), setA);
                if (zzaVar.zzad()) {
                    C(builderI, "lat", "1", setA);
                }
                C(builderI, "privacy_sandbox_version", String.valueOf(zzaVar.zza()), setA);
                C(builderI, "trigger_uri_source", "1", setA);
                C(builderI, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setA);
                C(builderI, "request_uuid", str2, setA);
                D(builderI, c36880g.m(str, E.f354612c0).split("\\|"), P(zzaVar2.zzf()), setA);
                D(builderI, c36880g.m(str, E.f354610b0).split("\\|"), T(zzaVar.zzab()), setA);
                if (c36880g.o(null, E.f354581K0)) {
                    C(builderI, "dma", zzaVar.zzac() ? "1" : "0", setA);
                    if (!zzaVar.zzw().isEmpty()) {
                        C(builderI, "dma_cps", zzaVar.zzw(), setA);
                    }
                }
                return new zzmh(builderI.build().toString(), jCurrentTimeMillis, 1);
            }
        }
        return null;
    }

    @TargetApi(30)
    public final zzmh v(String str, zzfi.zzj zzjVar, zzfi.zze.zza zzaVar, String str2) {
        int iIndexOf;
        if (zzph.zza()) {
            I2 i22 = this.f355183a;
            if (i22.f354715g.o(str, E.f354565C0)) {
                i22.f354722n.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                J1<String> j12 = E.f354614d0;
                C36880g c36880g = i22.f354715g;
                Set setA = J5.a(c36880g.m(str, j12).split(","));
                Uri.Builder builderI = this.f355380b.f355447j.i(str);
                C(builderI, "gmp_app_id", zzjVar.zzah(), setA);
                C(builderI, "gmp_version", "84002", setA);
                String strZzy = zzjVar.zzy();
                J1<Boolean> j13 = E.f354571F0;
                String str3 = "";
                if (c36880g.o(str, j13) && super.h().I(str)) {
                    strZzy = "";
                }
                C(builderI, "app_instance_id", strZzy, setA);
                C(builderI, "rdid", zzjVar.zzal(), setA);
                C(builderI, "bundle_id", zzjVar.zzx(), setA);
                String strZze = zzaVar.zze();
                String strA = C36920l4.a(strZze, C36912k3.f355242c, C36912k3.f355240a);
                if (!TextUtils.isEmpty(strA)) {
                    strZze = strA;
                }
                C(builderI, "app_event_name", strZze, setA);
                C(builderI, "app_version", String.valueOf(zzjVar.zzb()), setA);
                String strZzaj = zzjVar.zzaj();
                if (!c36880g.o(str, j13) || !super.h().M(str)) {
                    str3 = strZzaj;
                } else if (c36880g.o(str, E.f354648u0)) {
                    if (!TextUtils.isEmpty(strZzaj) && (iIndexOf = strZzaj.indexOf(".")) != -1) {
                        strZzaj = strZzaj.substring(0, iIndexOf);
                    }
                    str3 = strZzaj;
                }
                C(builderI, "os_version", str3, setA);
                C(builderI, "timestamp", String.valueOf(zzaVar.zzc()), setA);
                if (zzjVar.zzat()) {
                    C(builderI, "lat", "1", setA);
                }
                C(builderI, "privacy_sandbox_version", String.valueOf(zzjVar.zza()), setA);
                C(builderI, "trigger_uri_source", "1", setA);
                C(builderI, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setA);
                C(builderI, "request_uuid", str2, setA);
                D(builderI, c36880g.m(str, E.f354612c0).split("\\|"), P(zzaVar.zzf()), setA);
                D(builderI, c36880g.m(str, E.f354610b0).split("\\|"), T(zzjVar.zzaq()), setA);
                if (c36880g.o(null, E.f354581K0)) {
                    C(builderI, "dma", zzjVar.zzas() ? "1" : "0", setA);
                    if (!zzjVar.zzad().isEmpty()) {
                        C(builderI, "dma_cps", zzjVar.zzad(), setA);
                    }
                }
                return new zzmh(builderI.build().toString(), jCurrentTimeMillis, 1);
            }
        }
        return null;
    }

    public final String w(zzfi.zzi zziVar) {
        zzfi.zzb zzbVarZzt;
        if (zziVar == null) {
            return "";
        }
        StringBuilder sbR = androidx.compose.foundation.H.r("\nbatch {\n");
        for (zzfi.zzj zzjVar : zziVar.zzd()) {
            if (zzjVar != null) {
                B(1, sbR);
                sbR.append("bundle {\n");
                if (zzjVar.zzbk()) {
                    K(sbR, 1, "protocol_version", Integer.valueOf(zzjVar.zze()));
                }
                boolean zZza = zzpt.zza();
                I2 i22 = this.f355183a;
                if (zZza && i22.f354715g.o(zzjVar.zzx(), E.f354642r0) && zzjVar.zzbn()) {
                    K(sbR, 1, "session_stitching_token", zzjVar.zzam());
                }
                K(sbR, 1, "platform", zzjVar.zzak());
                if (zzjVar.zzbf()) {
                    K(sbR, 1, "gmp_version", Long.valueOf(zzjVar.zzm()));
                }
                if (zzjVar.zzbs()) {
                    K(sbR, 1, "uploading_gmp_version", Long.valueOf(zzjVar.zzs()));
                }
                if (zzjVar.zzbd()) {
                    K(sbR, 1, "dynamite_version", Long.valueOf(zzjVar.zzk()));
                }
                if (zzjVar.zzay()) {
                    K(sbR, 1, "config_version", Long.valueOf(zzjVar.zzi()));
                }
                K(sbR, 1, "gmp_app_id", zzjVar.zzah());
                K(sbR, 1, "admob_app_id", zzjVar.zzw());
                K(sbR, 1, HiAnalyticsConstant.BI_KEY_APP_ID, zzjVar.zzx());
                K(sbR, 1, "app_version", zzjVar.zzaa());
                if (zzjVar.zzav()) {
                    K(sbR, 1, "app_version_major", Integer.valueOf(zzjVar.zzb()));
                }
                K(sbR, 1, "firebase_instance_id", zzjVar.zzag());
                if (zzjVar.zzbc()) {
                    K(sbR, 1, "dev_cert_hash", Long.valueOf(zzjVar.zzj()));
                }
                K(sbR, 1, "app_store", zzjVar.zzz());
                if (zzjVar.zzbr()) {
                    K(sbR, 1, "upload_timestamp_millis", Long.valueOf(zzjVar.zzr()));
                }
                if (zzjVar.zzbo()) {
                    K(sbR, 1, "start_timestamp_millis", Long.valueOf(zzjVar.zzp()));
                }
                if (zzjVar.zzbe()) {
                    K(sbR, 1, "end_timestamp_millis", Long.valueOf(zzjVar.zzl()));
                }
                if (zzjVar.zzbj()) {
                    K(sbR, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzjVar.zzo()));
                }
                if (zzjVar.zzbi()) {
                    K(sbR, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzjVar.zzn()));
                }
                K(sbR, 1, "app_instance_id", zzjVar.zzy());
                K(sbR, 1, "resettable_device_id", zzjVar.zzal());
                K(sbR, 1, "ds_id", zzjVar.zzaf());
                if (zzjVar.zzbh()) {
                    K(sbR, 1, "limited_ad_tracking", Boolean.valueOf(zzjVar.zzat()));
                }
                K(sbR, 1, "os_version", zzjVar.zzaj());
                K(sbR, 1, "device_model", zzjVar.zzae());
                K(sbR, 1, "user_default_language", zzjVar.zzan());
                if (zzjVar.zzbq()) {
                    K(sbR, 1, "time_zone_offset_minutes", Integer.valueOf(zzjVar.zzg()));
                }
                if (zzjVar.zzax()) {
                    K(sbR, 1, "bundle_sequential_index", Integer.valueOf(zzjVar.zzc()));
                }
                if (zzjVar.zzbm()) {
                    K(sbR, 1, "service_upload", Boolean.valueOf(zzjVar.zzau()));
                }
                K(sbR, 1, "health_monitor", zzjVar.zzai());
                if (zzjVar.zzbl()) {
                    K(sbR, 1, "retry_counter", Integer.valueOf(zzjVar.zzf()));
                }
                if (zzjVar.zzba()) {
                    K(sbR, 1, "consent_signals", zzjVar.zzac());
                }
                if (zzjVar.zzbg()) {
                    K(sbR, 1, "is_dma_region", Boolean.valueOf(zzjVar.zzas()));
                }
                if (zzjVar.zzbb()) {
                    K(sbR, 1, "core_platform_services", zzjVar.zzad());
                }
                if (zzjVar.zzaz()) {
                    K(sbR, 1, "consent_diagnostics", zzjVar.zzab());
                }
                if (zzjVar.zzbp()) {
                    K(sbR, 1, "target_os_version", Long.valueOf(zzjVar.zzq()));
                }
                if (zzph.zza() && i22.f354715g.o(zzjVar.zzx(), E.f354565C0)) {
                    K(sbR, 1, "ad_services_version", Integer.valueOf(zzjVar.zza()));
                    if (zzjVar.zzaw() && (zzbVarZzt = zzjVar.zzt()) != null) {
                        B(2, sbR);
                        sbR.append("attribution_eligibility_status {\n");
                        K(sbR, 2, "eligible", Boolean.valueOf(zzbVarZzt.zzf()));
                        K(sbR, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzbVarZzt.zzh()));
                        K(sbR, 2, "pre_r", Boolean.valueOf(zzbVarZzt.zzi()));
                        K(sbR, 2, "r_extensions_too_old", Boolean.valueOf(zzbVarZzt.zzj()));
                        K(sbR, 2, "adservices_extension_too_old", Boolean.valueOf(zzbVarZzt.zze()));
                        K(sbR, 2, "ad_storage_not_allowed", Boolean.valueOf(zzbVarZzt.zzd()));
                        K(sbR, 2, "measurement_manager_disabled", Boolean.valueOf(zzbVarZzt.zzg()));
                        B(2, sbR);
                        sbR.append("}\n");
                    }
                }
                List<zzfi.zzn> listZzaq = zzjVar.zzaq();
                if (listZzaq != null) {
                    for (zzfi.zzn zznVar : listZzaq) {
                        if (zznVar != null) {
                            B(2, sbR);
                            sbR.append("user_property {\n");
                            K(sbR, 2, "set_timestamp_millis", zznVar.zzl() ? Long.valueOf(zznVar.zzd()) : null);
                            K(sbR, 2, "name", i22.f354721m.g(zznVar.zzg()));
                            K(sbR, 2, "string_value", zznVar.zzh());
                            K(sbR, 2, "int_value", zznVar.zzk() ? Long.valueOf(zznVar.zzc()) : null);
                            K(sbR, 2, "double_value", zznVar.zzi() ? Double.valueOf(zznVar.zza()) : null);
                            B(2, sbR);
                            sbR.append("}\n");
                        }
                    }
                }
                List<zzfi.zzc> listZzao = zzjVar.zzao();
                zzjVar.zzx();
                if (listZzao != null) {
                    for (zzfi.zzc zzcVar : listZzao) {
                        if (zzcVar != null) {
                            B(2, sbR);
                            sbR.append("audience_membership {\n");
                            if (zzcVar.zzg()) {
                                K(sbR, 2, "audience_id", Integer.valueOf(zzcVar.zza()));
                            }
                            if (zzcVar.zzh()) {
                                K(sbR, 2, "new_audience", Boolean.valueOf(zzcVar.zzf()));
                            }
                            M(sbR, "current_data", zzcVar.zzd());
                            if (zzcVar.zzi()) {
                                M(sbR, "previous_data", zzcVar.zze());
                            }
                            B(2, sbR);
                            sbR.append("}\n");
                        }
                    }
                }
                List<zzfi.zze> listZzap = zzjVar.zzap();
                if (listZzap != null) {
                    for (zzfi.zze zzeVar : listZzap) {
                        if (zzeVar != null) {
                            B(2, sbR);
                            sbR.append("event {\n");
                            K(sbR, 2, "name", i22.f354721m.c(zzeVar.zzg()));
                            if (zzeVar.zzk()) {
                                K(sbR, 2, "timestamp_millis", Long.valueOf(zzeVar.zzd()));
                            }
                            if (zzeVar.zzj()) {
                                K(sbR, 2, "previous_timestamp_millis", Long.valueOf(zzeVar.zzc()));
                            }
                            if (zzeVar.zzi()) {
                                K(sbR, 2, "count", Integer.valueOf(zzeVar.zza()));
                            }
                            if (zzeVar.zzb() != 0) {
                                L(sbR, 2, zzeVar.zzh());
                            }
                            B(2, sbR);
                            sbR.append("}\n");
                        }
                    }
                }
                B(1, sbR);
                sbR.append("}\n");
            }
        }
        sbR.append("}\n");
        return sbR.toString();
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final Context zza() {
        return this.f355183a.f354709a;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final InterfaceC36753g zzb() {
        return this.f355183a.f354722n;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final C36852c zzd() {
        return this.f355183a.f354714f;
    }
}
