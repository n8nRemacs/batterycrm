package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
public class zzmv {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ zzmv[] f351005d;
    public static final zzmv zza;
    public static final zzmv zzb;
    public static final zzmv zzc;
    public static final zzmv zzd;
    public static final zzmv zze;
    public static final zzmv zzf;
    public static final zzmv zzg;
    public static final zzmv zzh;
    public static final zzmv zzi;
    public static final zzmv zzj;
    public static final zzmv zzk;
    public static final zzmv zzl;
    public static final zzmv zzm;
    public static final zzmv zzn;
    public static final zzmv zzo;
    public static final zzmv zzp;
    public static final zzmv zzq;
    public static final zzmv zzr;

    /* renamed from: b, reason: collision with root package name */
    public final zznf f351006b;

    /* renamed from: c, reason: collision with root package name */
    public final int f351007c;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        zzmv zzmvVar = new zzmv("DOUBLE", 0, zznf.DOUBLE, 1);
        zza = zzmvVar;
        zzmv zzmvVar2 = new zzmv("FLOAT", 1, zznf.FLOAT, 5);
        zzb = zzmvVar2;
        zznf zznfVar = zznf.LONG;
        zzmv zzmvVar3 = new zzmv("INT64", 2, zznfVar, 0);
        zzc = zzmvVar3;
        zzmv zzmvVar4 = new zzmv("UINT64", 3, zznfVar, 0);
        zzd = zzmvVar4;
        zznf zznfVar2 = zznf.INT;
        zzmv zzmvVar5 = new zzmv("INT32", 4, zznfVar2, 0);
        zze = zzmvVar5;
        zzmv zzmvVar6 = new zzmv("FIXED64", 5, zznfVar, 1);
        zzf = zzmvVar6;
        zzmv zzmvVar7 = new zzmv("FIXED32", 6, zznfVar2, 5);
        zzg = zzmvVar7;
        zzmv zzmvVar8 = new zzmv("BOOL", 7, zznf.BOOLEAN, 0);
        zzh = zzmvVar8;
        final zznf zznfVar3 = zznf.STRING;
        final int i12 = 2;
        final zzmx zzmxVar = null;
        final String str = "STRING";
        final int i13 = 8;
        zzmv zzmvVar9 = new zzmv(str, i13, zznfVar3, i12, zzmxVar) { // from class: com.google.android.gms.internal.measurement.zzmu
            {
                int i14 = 8;
                int i15 = 2;
            }
        };
        zzi = zzmvVar9;
        final zznf zznfVar4 = zznf.MESSAGE;
        final int i14 = 3;
        final zzmz zzmzVar = null;
        final String str2 = "GROUP";
        final int i15 = 9;
        zzmv zzmvVar10 = new zzmv(str2, i15, zznfVar4, i14, zzmzVar) { // from class: com.google.android.gms.internal.measurement.zzmw
            {
                int i16 = 9;
                int i17 = 3;
            }
        };
        zzj = zzmvVar10;
        final String str3 = "MESSAGE";
        final int i16 = 10;
        final Object[] objArr = 0 == true ? 1 : 0;
        zzmv zzmvVar11 = new zzmv(str3, i16, zznfVar4, i12, objArr) { // from class: com.google.android.gms.internal.measurement.zzmy
            {
                int i17 = 10;
                int i18 = 2;
            }
        };
        zzk = zzmvVar11;
        final zznf zznfVar5 = zznf.BYTE_STRING;
        final int i17 = 2;
        final zznd zzndVar = null;
        final String str4 = "BYTES";
        final int i18 = 11;
        zzmv zzmvVar12 = new zzmv(str4, i18, zznfVar5, i17, zzndVar) { // from class: com.google.android.gms.internal.measurement.zzna
            {
                int i19 = 11;
                int i22 = 2;
            }
        };
        zzl = zzmvVar12;
        zzmv zzmvVar13 = new zzmv("UINT32", 12, zznfVar2, 0);
        zzm = zzmvVar13;
        zzmv zzmvVar14 = new zzmv("ENUM", 13, zznf.ENUM, 0);
        zzn = zzmvVar14;
        zzmv zzmvVar15 = new zzmv("SFIXED32", 14, zznfVar2, 5);
        zzo = zzmvVar15;
        zzmv zzmvVar16 = new zzmv("SFIXED64", 15, zznfVar, 1);
        zzp = zzmvVar16;
        zzmv zzmvVar17 = new zzmv("SINT32", 16, zznfVar2, 0);
        zzq = zzmvVar17;
        zzmv zzmvVar18 = new zzmv("SINT64", 17, zznfVar, 0);
        zzr = zzmvVar18;
        f351005d = new zzmv[]{zzmvVar, zzmvVar2, zzmvVar3, zzmvVar4, zzmvVar5, zzmvVar6, zzmvVar7, zzmvVar8, zzmvVar9, zzmvVar10, zzmvVar11, zzmvVar12, zzmvVar13, zzmvVar14, zzmvVar15, zzmvVar16, zzmvVar17, zzmvVar18};
    }

    public static zzmv[] values() {
        return (zzmv[]) f351005d.clone();
    }

    public final int zza() {
        return this.f351007c;
    }

    public final zznf zzb() {
        return this.f351006b;
    }

    public zzmv(String str, int i12, zznf zznfVar, int i13) {
        this.f351006b = zznfVar;
        this.f351007c = i13;
    }
}
