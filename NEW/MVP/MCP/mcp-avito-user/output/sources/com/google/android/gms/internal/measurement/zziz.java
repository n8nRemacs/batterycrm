package com.google.android.gms.internal.measurement;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
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
public final class zziz {

    /* renamed from: c, reason: collision with root package name */
    public static final zziz[] f350884c;

    /* renamed from: d, reason: collision with root package name */
    public static final Type[] f350885d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ zziz[] f350886e;
    public static final zziz zza;
    public static final zziz zzb;

    /* renamed from: b, reason: collision with root package name */
    public final int f350887b;

    /* JADX INFO: Fake field, exist only in values array */
    zziz EF0;

    static {
        zzjb zzjbVar = zzjb.zza;
        zzjs zzjsVar = zzjs.DOUBLE;
        zziz zzizVar = new zziz("DOUBLE", 0, 0, zzjbVar, zzjsVar);
        zzjs zzjsVar2 = zzjs.FLOAT;
        zziz zzizVar2 = new zziz("FLOAT", 1, 1, zzjbVar, zzjsVar2);
        zzjs zzjsVar3 = zzjs.LONG;
        zziz zzizVar3 = new zziz("INT64", 2, 2, zzjbVar, zzjsVar3);
        zziz zzizVar4 = new zziz("UINT64", 3, 3, zzjbVar, zzjsVar3);
        zzjs zzjsVar4 = zzjs.INT;
        zziz zzizVar5 = new zziz("INT32", 4, 4, zzjbVar, zzjsVar4);
        zziz zzizVar6 = new zziz("FIXED64", 5, 5, zzjbVar, zzjsVar3);
        zziz zzizVar7 = new zziz("FIXED32", 6, 6, zzjbVar, zzjsVar4);
        zzjs zzjsVar5 = zzjs.BOOLEAN;
        zziz zzizVar8 = new zziz("BOOL", 7, 7, zzjbVar, zzjsVar5);
        zzjs zzjsVar6 = zzjs.STRING;
        zziz zzizVar9 = new zziz("STRING", 8, 8, zzjbVar, zzjsVar6);
        zzjs zzjsVar7 = zzjs.MESSAGE;
        zziz zzizVar10 = new zziz("MESSAGE", 9, 9, zzjbVar, zzjsVar7);
        zzjs zzjsVar8 = zzjs.BYTE_STRING;
        zziz zzizVar11 = new zziz("BYTES", 10, 10, zzjbVar, zzjsVar8);
        zziz zzizVar12 = new zziz("UINT32", 11, 11, zzjbVar, zzjsVar4);
        zzjs zzjsVar9 = zzjs.ENUM;
        zziz zzizVar13 = new zziz("ENUM", 12, 12, zzjbVar, zzjsVar9);
        zziz zzizVar14 = new zziz("SFIXED32", 13, 13, zzjbVar, zzjsVar4);
        zziz zzizVar15 = new zziz("SFIXED64", 14, 14, zzjbVar, zzjsVar3);
        zziz zzizVar16 = new zziz("SINT32", 15, 15, zzjbVar, zzjsVar4);
        zziz zzizVar17 = new zziz("SINT64", 16, 16, zzjbVar, zzjsVar3);
        zziz zzizVar18 = new zziz("GROUP", 17, 17, zzjbVar, zzjsVar7);
        zzjb zzjbVar2 = zzjb.zzb;
        zziz zzizVar19 = new zziz("DOUBLE_LIST", 18, 18, zzjbVar2, zzjsVar);
        zziz zzizVar20 = new zziz("FLOAT_LIST", 19, 19, zzjbVar2, zzjsVar2);
        zziz zzizVar21 = new zziz("INT64_LIST", 20, 20, zzjbVar2, zzjsVar3);
        zziz zzizVar22 = new zziz("UINT64_LIST", 21, 21, zzjbVar2, zzjsVar3);
        zziz zzizVar23 = new zziz("INT32_LIST", 22, 22, zzjbVar2, zzjsVar4);
        zziz zzizVar24 = new zziz("FIXED64_LIST", 23, 23, zzjbVar2, zzjsVar3);
        zziz zzizVar25 = new zziz("FIXED32_LIST", 24, 24, zzjbVar2, zzjsVar4);
        zziz zzizVar26 = new zziz("BOOL_LIST", 25, 25, zzjbVar2, zzjsVar5);
        zziz zzizVar27 = new zziz("STRING_LIST", 26, 26, zzjbVar2, zzjsVar6);
        zziz zzizVar28 = new zziz("MESSAGE_LIST", 27, 27, zzjbVar2, zzjsVar7);
        zziz zzizVar29 = new zziz("BYTES_LIST", 28, 28, zzjbVar2, zzjsVar8);
        zziz zzizVar30 = new zziz("UINT32_LIST", 29, 29, zzjbVar2, zzjsVar4);
        zziz zzizVar31 = new zziz("ENUM_LIST", 30, 30, zzjbVar2, zzjsVar9);
        zziz zzizVar32 = new zziz("SFIXED32_LIST", 31, 31, zzjbVar2, zzjsVar4);
        zziz zzizVar33 = new zziz("SFIXED64_LIST", 32, 32, zzjbVar2, zzjsVar3);
        zziz zzizVar34 = new zziz("SINT32_LIST", 33, 33, zzjbVar2, zzjsVar4);
        zziz zzizVar35 = new zziz("SINT64_LIST", 34, 34, zzjbVar2, zzjsVar3);
        zzjb zzjbVar3 = zzjb.zzc;
        zziz zzizVar36 = new zziz("DOUBLE_LIST_PACKED", 35, 35, zzjbVar3, zzjsVar);
        zza = zzizVar36;
        zziz zzizVar37 = new zziz("FLOAT_LIST_PACKED", 36, 36, zzjbVar3, zzjsVar2);
        zziz zzizVar38 = new zziz("INT64_LIST_PACKED", 37, 37, zzjbVar3, zzjsVar3);
        zziz zzizVar39 = new zziz("UINT64_LIST_PACKED", 38, 38, zzjbVar3, zzjsVar3);
        zziz zzizVar40 = new zziz("INT32_LIST_PACKED", 39, 39, zzjbVar3, zzjsVar4);
        zziz zzizVar41 = new zziz("FIXED64_LIST_PACKED", 40, 40, zzjbVar3, zzjsVar3);
        zziz zzizVar42 = new zziz("FIXED32_LIST_PACKED", 41, 41, zzjbVar3, zzjsVar4);
        zziz zzizVar43 = new zziz("BOOL_LIST_PACKED", 42, 42, zzjbVar3, zzjsVar5);
        zziz zzizVar44 = new zziz("UINT32_LIST_PACKED", 43, 43, zzjbVar3, zzjsVar4);
        zziz zzizVar45 = new zziz("ENUM_LIST_PACKED", 44, 44, zzjbVar3, zzjsVar9);
        zziz zzizVar46 = new zziz("SFIXED32_LIST_PACKED", 45, 45, zzjbVar3, zzjsVar4);
        zziz zzizVar47 = new zziz("SFIXED64_LIST_PACKED", 46, 46, zzjbVar3, zzjsVar3);
        zziz zzizVar48 = new zziz("SINT32_LIST_PACKED", 47, 47, zzjbVar3, zzjsVar4);
        zziz zzizVar49 = new zziz("SINT64_LIST_PACKED", 48, 48, zzjbVar3, zzjsVar3);
        zzb = zzizVar49;
        f350886e = new zziz[]{zzizVar, zzizVar2, zzizVar3, zzizVar4, zzizVar5, zzizVar6, zzizVar7, zzizVar8, zzizVar9, zzizVar10, zzizVar11, zzizVar12, zzizVar13, zzizVar14, zzizVar15, zzizVar16, zzizVar17, zzizVar18, zzizVar19, zzizVar20, zzizVar21, zzizVar22, zzizVar23, zzizVar24, zzizVar25, zzizVar26, zzizVar27, zzizVar28, zzizVar29, zzizVar30, zzizVar31, zzizVar32, zzizVar33, zzizVar34, zzizVar35, zzizVar36, zzizVar37, zzizVar38, zzizVar39, zzizVar40, zzizVar41, zzizVar42, zzizVar43, zzizVar44, zzizVar45, zzizVar46, zzizVar47, zzizVar48, zzizVar49, new zziz("GROUP_LIST", 49, 49, zzjbVar2, zzjsVar7), new zziz("MAP", 50, 50, zzjb.zzd, zzjs.VOID)};
        f350885d = new Type[0];
        zziz[] zzizVarArrValues = values();
        f350884c = new zziz[zzizVarArrValues.length];
        for (zziz zzizVar50 : zzizVarArrValues) {
            f350884c[zzizVar50.f350887b] = zzizVar50;
        }
    }

    public zziz(String str, int i12, int i13, zzjb zzjbVar, zzjs zzjsVar) {
        this.f350887b = i13;
        int iOrdinal = zzjbVar.ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            zzjsVar.zza();
        }
        if (zzjbVar == zzjb.zza) {
            int i14 = zzjc.f350889a[zzjsVar.ordinal()];
        }
    }

    public static zziz[] values() {
        return (zziz[]) f350886e.clone();
    }

    public final int zza() {
        return this.f350887b;
    }
}
