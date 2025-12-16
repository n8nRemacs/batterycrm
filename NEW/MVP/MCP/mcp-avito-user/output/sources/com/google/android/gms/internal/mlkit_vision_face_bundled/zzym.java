package com.google.android.gms.internal.mlkit_vision_face_bundled;

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
/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzym {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ zzym[] f354155c;
    public static final zzym zza;
    public static final zzym zzb;
    public static final zzym zzc;
    public static final zzym zzd;
    public static final zzym zze;
    public static final zzym zzf;
    public static final zzym zzg;
    public static final zzym zzh;
    public static final zzym zzi;
    public static final zzym zzj;
    public static final zzym zzk;
    public static final zzym zzl;
    public static final zzym zzm;
    public static final zzym zzn;
    public static final zzym zzo;
    public static final zzym zzp;
    public static final zzym zzq;
    public static final zzym zzr;

    /* renamed from: b, reason: collision with root package name */
    public final zzyn f354156b;

    static {
        zzym zzymVar = new zzym("DOUBLE", 0, zzyn.DOUBLE);
        zza = zzymVar;
        zzym zzymVar2 = new zzym("FLOAT", 1, zzyn.FLOAT);
        zzb = zzymVar2;
        zzyn zzynVar = zzyn.LONG;
        zzym zzymVar3 = new zzym("INT64", 2, zzynVar);
        zzc = zzymVar3;
        zzym zzymVar4 = new zzym("UINT64", 3, zzynVar);
        zzd = zzymVar4;
        zzyn zzynVar2 = zzyn.INT;
        zzym zzymVar5 = new zzym("INT32", 4, zzynVar2);
        zze = zzymVar5;
        zzym zzymVar6 = new zzym("FIXED64", 5, zzynVar);
        zzf = zzymVar6;
        zzym zzymVar7 = new zzym("FIXED32", 6, zzynVar2);
        zzg = zzymVar7;
        zzym zzymVar8 = new zzym("BOOL", 7, zzyn.BOOLEAN);
        zzh = zzymVar8;
        zzym zzymVar9 = new zzym("STRING", 8, zzyn.STRING);
        zzi = zzymVar9;
        zzyn zzynVar3 = zzyn.MESSAGE;
        zzym zzymVar10 = new zzym("GROUP", 9, zzynVar3);
        zzj = zzymVar10;
        zzym zzymVar11 = new zzym("MESSAGE", 10, zzynVar3);
        zzk = zzymVar11;
        zzym zzymVar12 = new zzym("BYTES", 11, zzyn.BYTE_STRING);
        zzl = zzymVar12;
        zzym zzymVar13 = new zzym("UINT32", 12, zzynVar2);
        zzm = zzymVar13;
        zzym zzymVar14 = new zzym("ENUM", 13, zzyn.ENUM);
        zzn = zzymVar14;
        zzym zzymVar15 = new zzym("SFIXED32", 14, zzynVar2);
        zzo = zzymVar15;
        zzym zzymVar16 = new zzym("SFIXED64", 15, zzynVar);
        zzp = zzymVar16;
        zzym zzymVar17 = new zzym("SINT32", 16, zzynVar2);
        zzq = zzymVar17;
        zzym zzymVar18 = new zzym("SINT64", 17, zzynVar);
        zzr = zzymVar18;
        f354155c = new zzym[]{zzymVar, zzymVar2, zzymVar3, zzymVar4, zzymVar5, zzymVar6, zzymVar7, zzymVar8, zzymVar9, zzymVar10, zzymVar11, zzymVar12, zzymVar13, zzymVar14, zzymVar15, zzymVar16, zzymVar17, zzymVar18};
    }

    public zzym(String str, int i12, zzyn zzynVar) {
        this.f354156b = zzynVar;
    }

    public static zzym[] values() {
        return (zzym[]) f354155c.clone();
    }

    public final zzyn zza() {
        return this.f354156b;
    }
}
