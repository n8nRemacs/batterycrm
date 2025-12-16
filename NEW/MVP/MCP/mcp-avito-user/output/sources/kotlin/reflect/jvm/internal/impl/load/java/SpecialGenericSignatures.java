package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.compose.runtime.C22026a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.P0;
import kotlin.collections.b1;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* compiled from: SpecialGenericSignatures.kt */
@s0
/* loaded from: classes8.dex */
public class SpecialGenericSignatures {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f407963a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final ArrayList f407964b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final ArrayList f407965c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final Object f407966d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final LinkedHashMap f407967e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final Set<kotlin.reflect.jvm.internal.impl.name.f> f407968f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final Set<String> f407969g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final a.C11656a f407970h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final Object f407971i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final LinkedHashMap f407972j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final ArrayList f407973k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final LinkedHashMap f407974l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SpecialGenericSignatures.kt */
    public static final class SpecialSignatureInfo {

        /* renamed from: b, reason: collision with root package name */
        public static final SpecialSignatureInfo f407975b;

        /* renamed from: c, reason: collision with root package name */
        public static final SpecialSignatureInfo f407976c;

        /* renamed from: d, reason: collision with root package name */
        public static final SpecialSignatureInfo f407977d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ SpecialSignatureInfo[] f407978e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f407979f;

        static {
            SpecialSignatureInfo specialSignatureInfo = new SpecialSignatureInfo("ONE_COLLECTION_PARAMETER", 0);
            f407975b = specialSignatureInfo;
            SpecialSignatureInfo specialSignatureInfo2 = new SpecialSignatureInfo("OBJECT_PARAMETER_NON_GENERIC", 1);
            f407976c = specialSignatureInfo2;
            SpecialSignatureInfo specialSignatureInfo3 = new SpecialSignatureInfo("OBJECT_PARAMETER_GENERIC", 2);
            f407977d = specialSignatureInfo3;
            SpecialSignatureInfo[] specialSignatureInfoArr = {specialSignatureInfo, specialSignatureInfo2, specialSignatureInfo3};
            f407978e = specialSignatureInfoArr;
            f407979f = kotlin.enums.c.a(specialSignatureInfoArr);
        }

        public SpecialSignatureInfo() {
            throw null;
        }

        public static SpecialSignatureInfo valueOf(String str) {
            return (SpecialSignatureInfo) Enum.valueOf(SpecialSignatureInfo.class, str);
        }

        public static SpecialSignatureInfo[] values() {
            return (SpecialSignatureInfo[]) f407978e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SpecialGenericSignatures.kt */
    public static final class TypeSafeBarrierDescription {

        /* renamed from: c, reason: collision with root package name */
        public static final TypeSafeBarrierDescription f407980c;

        /* renamed from: d, reason: collision with root package name */
        public static final TypeSafeBarrierDescription f407981d;

        /* renamed from: e, reason: collision with root package name */
        public static final TypeSafeBarrierDescription f407982e;

        /* renamed from: f, reason: collision with root package name */
        public static final TypeSafeBarrierDescription f407983f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ TypeSafeBarrierDescription[] f407984g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f407985h;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Object f407986b;

        /* compiled from: SpecialGenericSignatures.kt */
        public static final class a extends TypeSafeBarrierDescription {
            public a() {
                throw null;
            }
        }

        static {
            C42822w c42822w = null;
            TypeSafeBarrierDescription typeSafeBarrierDescription = new TypeSafeBarrierDescription("NULL", 0, null);
            f407980c = typeSafeBarrierDescription;
            TypeSafeBarrierDescription typeSafeBarrierDescription2 = new TypeSafeBarrierDescription("INDEX", 1, -1);
            f407981d = typeSafeBarrierDescription2;
            TypeSafeBarrierDescription typeSafeBarrierDescription3 = new TypeSafeBarrierDescription("FALSE", 2, Boolean.FALSE);
            f407982e = typeSafeBarrierDescription3;
            a aVar = new a("MAP_GET_OR_DEFAULT", 3, c42822w, c42822w);
            f407983f = aVar;
            TypeSafeBarrierDescription[] typeSafeBarrierDescriptionArr = {typeSafeBarrierDescription, typeSafeBarrierDescription2, typeSafeBarrierDescription3, aVar};
            f407984g = typeSafeBarrierDescriptionArr;
            f407985h = kotlin.enums.c.a(typeSafeBarrierDescriptionArr);
        }

        public /* synthetic */ TypeSafeBarrierDescription(String str, int i12, Object obj, C42822w c42822w) {
            this(str, i12, obj);
        }

        public static TypeSafeBarrierDescription valueOf(String str) {
            return (TypeSafeBarrierDescription) Enum.valueOf(TypeSafeBarrierDescription.class, str);
        }

        public static TypeSafeBarrierDescription[] values() {
            return (TypeSafeBarrierDescription[]) f407984g.clone();
        }

        public TypeSafeBarrierDescription(String str, int i12, Object obj) {
            this.f407986b = obj;
        }
    }

    /* compiled from: SpecialGenericSignatures.kt */
    public static final class a {

        /* compiled from: SpecialGenericSignatures.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a, reason: collision with other inner class name */
        public static final class C11656a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f407987a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final kotlin.reflect.jvm.internal.impl.name.f f407988b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f407989c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final String f407990d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final String f407991e;

            public C11656a(@Y61.k String str, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k String str2, @Y61.k String str3) {
                this.f407987a = str;
                this.f407988b = fVar;
                this.f407989c = str2;
                this.f407990d = str3;
                kotlin.reflect.jvm.internal.impl.load.kotlin.H.f408434a.getClass();
                this.f407991e = kotlin.reflect.jvm.internal.impl.load.kotlin.H.f(str, fVar + '(' + str2 + ')' + str3);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C11656a)) {
                    return false;
                }
                C11656a c11656a = (C11656a) obj;
                return L.f(this.f407987a, c11656a.f407987a) && L.f(this.f407988b, c11656a.f407988b) && L.f(this.f407989c, c11656a.f407989c) && L.f(this.f407990d, c11656a.f407990d);
            }

            public final int hashCode() {
                return this.f407990d.hashCode() + androidx.compose.foundation.H.d((this.f407988b.hashCode() + (this.f407987a.hashCode() * 31)) * 31, 31, this.f407989c);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("NameAndSignature(classInternalName=");
                sb2.append(this.f407987a);
                sb2.append(", name=");
                sb2.append(this.f407988b);
                sb2.append(", parameters=");
                sb2.append(this.f407989c);
                sb2.append(", returnType=");
                return C22026a.c(sb2, this.f407990d, ')');
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static final C11656a a(a aVar, String str, String str2, String str3, String str4) {
            aVar.getClass();
            return new C11656a(str, kotlin.reflect.jvm.internal.impl.name.f.e(str2), str3, str4);
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, java.util.Map] */
    static {
        Set setL0 = C42756l.l0(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(C42745f0.q(setL0, 10));
        Iterator it = setL0.iterator();
        while (it.hasNext()) {
            arrayList.add(a.a(f407963a, "java/util/Collection", (String) it.next(), "Ljava/util/Collection;", JvmPrimitiveType.BOOLEAN.c()));
        }
        f407964b = arrayList;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((a.C11656a) it2.next()).f407991e);
        }
        f407965c = arrayList2;
        ArrayList arrayList3 = f407964b;
        ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((a.C11656a) it3.next()).f407988b.b());
        }
        kotlin.reflect.jvm.internal.impl.load.kotlin.H h12 = kotlin.reflect.jvm.internal.impl.load.kotlin.H.f408434a;
        a aVar = f407963a;
        h12.getClass();
        String strConcat = "java/util/".concat("Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        a.C11656a c11656aA = a.a(aVar, strConcat, "contains", "Ljava/lang/Object;", jvmPrimitiveType.c());
        TypeSafeBarrierDescription typeSafeBarrierDescription = TypeSafeBarrierDescription.f407982e;
        Q q12 = new Q(c11656aA, typeSafeBarrierDescription);
        Q q13 = new Q(a.a(aVar, "java/util/".concat("Collection"), "remove", "Ljava/lang/Object;", jvmPrimitiveType.c()), typeSafeBarrierDescription);
        Q q14 = new Q(a.a(aVar, "java/util/".concat("Map"), "containsKey", "Ljava/lang/Object;", jvmPrimitiveType.c()), typeSafeBarrierDescription);
        Q q15 = new Q(a.a(aVar, "java/util/".concat("Map"), "containsValue", "Ljava/lang/Object;", jvmPrimitiveType.c()), typeSafeBarrierDescription);
        Q q16 = new Q(a.a(aVar, "java/util/".concat("Map"), "remove", "Ljava/lang/Object;Ljava/lang/Object;", jvmPrimitiveType.c()), typeSafeBarrierDescription);
        Q q17 = new Q(a.a(aVar, "java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.f407983f);
        a.C11656a c11656aA2 = a.a(aVar, "java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        TypeSafeBarrierDescription typeSafeBarrierDescription2 = TypeSafeBarrierDescription.f407980c;
        Q q18 = new Q(c11656aA2, typeSafeBarrierDescription2);
        Q q19 = new Q(a.a(aVar, "java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), typeSafeBarrierDescription2);
        String strConcat2 = "java/util/".concat("List");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        a.C11656a c11656aA3 = a.a(aVar, strConcat2, "indexOf", "Ljava/lang/Object;", jvmPrimitiveType2.c());
        TypeSafeBarrierDescription typeSafeBarrierDescription3 = TypeSafeBarrierDescription.f407981d;
        Map mapG = P0.g(q12, q13, q14, q15, q16, q17, q18, q19, new Q(c11656aA3, typeSafeBarrierDescription3), new Q(a.a(aVar, "java/util/".concat("List"), "lastIndexOf", "Ljava/lang/Object;", jvmPrimitiveType2.c()), typeSafeBarrierDescription3));
        f407966d = mapG;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(mapG.size()));
        for (Map.Entry entry : mapG.entrySet()) {
            linkedHashMap.put(((a.C11656a) entry.getKey()).f407991e, entry.getValue());
        }
        f407967e = linkedHashMap;
        LinkedHashSet linkedHashSetH = b1.h(f407966d.keySet(), f407964b);
        ArrayList arrayList5 = new ArrayList(C42745f0.q(linkedHashSetH, 10));
        Iterator it4 = linkedHashSetH.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((a.C11656a) it4.next()).f407988b);
        }
        f407968f = C42745f0.P0(arrayList5);
        ArrayList arrayList6 = new ArrayList(C42745f0.q(linkedHashSetH, 10));
        Iterator it5 = linkedHashSetH.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((a.C11656a) it5.next()).f407991e);
        }
        f407969g = C42745f0.P0(arrayList6);
        a aVar2 = f407963a;
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        a.C11656a c11656aA4 = a.a(aVar2, "java/util/List", "removeAt", jvmPrimitiveType3.c(), "Ljava/lang/Object;");
        f407970h = c11656aA4;
        kotlin.reflect.jvm.internal.impl.load.kotlin.H.f408434a.getClass();
        Map mapG2 = P0.g(new Q(a.a(aVar2, "java/lang/".concat("Number"), "toByte", "", JvmPrimitiveType.BYTE.c()), kotlin.reflect.jvm.internal.impl.name.f.e("byteValue")), new Q(a.a(aVar2, "java/lang/".concat("Number"), "toShort", "", JvmPrimitiveType.SHORT.c()), kotlin.reflect.jvm.internal.impl.name.f.e("shortValue")), new Q(a.a(aVar2, "java/lang/".concat("Number"), "toInt", "", jvmPrimitiveType3.c()), kotlin.reflect.jvm.internal.impl.name.f.e("intValue")), new Q(a.a(aVar2, "java/lang/".concat("Number"), "toLong", "", JvmPrimitiveType.LONG.c()), kotlin.reflect.jvm.internal.impl.name.f.e("longValue")), new Q(a.a(aVar2, "java/lang/".concat("Number"), "toFloat", "", JvmPrimitiveType.FLOAT.c()), kotlin.reflect.jvm.internal.impl.name.f.e("floatValue")), new Q(a.a(aVar2, "java/lang/".concat("Number"), "toDouble", "", JvmPrimitiveType.DOUBLE.c()), kotlin.reflect.jvm.internal.impl.name.f.e("doubleValue")), new Q(c11656aA4, kotlin.reflect.jvm.internal.impl.name.f.e("remove")), new Q(a.a(aVar2, "java/lang/".concat("CharSequence"), "get", jvmPrimitiveType3.c(), JvmPrimitiveType.CHAR.c()), kotlin.reflect.jvm.internal.impl.name.f.e("charAt")));
        f407971i = mapG2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(mapG2.size()));
        for (Map.Entry entry2 : mapG2.entrySet()) {
            linkedHashMap2.put(((a.C11656a) entry2.getKey()).f407991e, entry2.getValue());
        }
        f407972j = linkedHashMap2;
        ?? r02 = f407971i;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r02.entrySet()) {
            a.C11656a c11656a = (a.C11656a) entry3.getKey();
            linkedHashSet.add(new a.C11656a(c11656a.f407987a, (kotlin.reflect.jvm.internal.impl.name.f) entry3.getValue(), c11656a.f407989c, c11656a.f407990d).f407991e);
        }
        Set setKeySet = f407971i.keySet();
        ArrayList arrayList7 = new ArrayList(C42745f0.q(setKeySet, 10));
        Iterator it6 = setKeySet.iterator();
        while (it6.hasNext()) {
            arrayList7.add(((a.C11656a) it6.next()).f407988b);
        }
        f407973k = arrayList7;
        Set<Map.Entry> setEntrySet = f407971i.entrySet();
        ArrayList arrayList8 = new ArrayList(C42745f0.q(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList8.add(new Q(((a.C11656a) entry4.getKey()).f407988b, entry4.getValue()));
        }
        int iF2 = P0.f(C42745f0.q(arrayList8, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iF2);
        Iterator it7 = arrayList8.iterator();
        while (it7.hasNext()) {
            Q q22 = (Q) it7.next();
            linkedHashMap3.put((kotlin.reflect.jvm.internal.impl.name.f) q22.f406620c, (kotlin.reflect.jvm.internal.impl.name.f) q22.f406619b);
        }
        f407974l = linkedHashMap3;
    }
}
