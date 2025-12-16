package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryIds.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/CategoryIds;", "", "()V", "AUTO", "BUSINESS", "ELECTRONICS", "HOBBY", "JOB", "PERSONAL_BELONGINGS", "PETS", "RE", "SE", "TRAVEL", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CategoryIds {

    @k
    public static final CategoryIds INSTANCE = new CategoryIds();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CategoryIds.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/CategoryIds$AUTO;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "ROOT", "CARS", "SPAREPARTS", "WATER", "MOTO", "TRUCKS", "BULLDOZERS", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AUTO {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AUTO[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE;

        @k
        private final String id;
        public static final AUTO ROOT = new AUTO("ROOT", 0, "1");
        public static final AUTO CARS = new AUTO("CARS", 1, "9");
        public static final AUTO SPAREPARTS = new AUTO("SPAREPARTS", 2, "10");
        public static final AUTO WATER = new AUTO("WATER", 3, "11");
        public static final AUTO MOTO = new AUTO("MOTO", 4, "14");
        public static final AUTO TRUCKS = new AUTO("TRUCKS", 5, "81");
        public static final AUTO BULLDOZERS = new AUTO("BULLDOZERS", 6, "200");

        /* compiled from: CategoryIds.kt */
        @s0
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/CategoryIds$AUTO$Companion;", "", "()V", "allIds", "", "", "isNotAutoWithoutSpareParts", "", "id", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @k
            public final List<String> allIds() {
                AUTO[] autoArrValues = AUTO.values();
                ArrayList arrayList = new ArrayList(autoArrValues.length);
                for (AUTO auto : autoArrValues) {
                    arrayList.add(auto.getId());
                }
                return arrayList;
            }

            public final boolean isNotAutoWithoutSpareParts(@l String id2) {
                return (L.f(id2, AUTO.CARS.getId()) || L.f(id2, AUTO.WATER.getId()) || L.f(id2, AUTO.MOTO.getId()) || L.f(id2, AUTO.TRUCKS.getId())) ? false : true;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ AUTO[] $values() {
            return new AUTO[]{ROOT, CARS, SPAREPARTS, WATER, MOTO, TRUCKS, BULLDOZERS};
        }

        static {
            AUTO[] autoArr$values = $values();
            $VALUES = autoArr$values;
            $ENTRIES = c.a(autoArr$values);
            INSTANCE = new Companion(null);
        }

        private AUTO(String str, int i12, String str2) {
            this.id = str2;
        }

        @k
        public static a<AUTO> getEntries() {
            return $ENTRIES;
        }

        public static AUTO valueOf(String str) {
            return (AUTO) Enum.valueOf(AUTO.class, str);
        }

        public static AUTO[] values() {
            return (AUTO[]) $VALUES.clone();
        }

        @k
        public final String getId() {
            return this.id;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CategoryIds.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/CategoryIds$BUSINESS;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "ROOT", "READY_BUSINESS", "BUSINESS_EQUIPMENT", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BUSINESS {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ BUSINESS[] $VALUES;

        @k
        private final String id;
        public static final BUSINESS ROOT = new BUSINESS("ROOT", 0, "8");
        public static final BUSINESS READY_BUSINESS = new BUSINESS("READY_BUSINESS", 1, "116");
        public static final BUSINESS BUSINESS_EQUIPMENT = new BUSINESS("BUSINESS_EQUIPMENT", 2, "40");

        private static final /* synthetic */ BUSINESS[] $values() {
            return new BUSINESS[]{ROOT, READY_BUSINESS, BUSINESS_EQUIPMENT};
        }

        static {
            BUSINESS[] businessArr$values = $values();
            $VALUES = businessArr$values;
            $ENTRIES = c.a(businessArr$values);
        }

        private BUSINESS(String str, int i12, String str2) {
            this.id = str2;
        }

        @k
        public static a<BUSINESS> getEntries() {
            return $ENTRIES;
        }

        public static BUSINESS valueOf(String str) {
            return (BUSINESS) Enum.valueOf(BUSINESS.class, str);
        }

        public static BUSINESS[] values() {
            return (BUSINESS[]) $VALUES.clone();
        }

        @k
        public final String getId() {
            return this.id;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CategoryIds.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/CategoryIds$ELECTRONICS;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "ROOT", "PHONES", "LAPTOPS", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ELECTRONICS {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ELECTRONICS[] $VALUES;

        @k
        private final String id;
        public static final ELECTRONICS ROOT = new ELECTRONICS("ROOT", 0, "6");
        public static final ELECTRONICS PHONES = new ELECTRONICS("PHONES", 1, "84");
        public static final ELECTRONICS LAPTOPS = new ELECTRONICS("LAPTOPS", 2, "98");

        private static final /* synthetic */ ELECTRONICS[] $values() {
            return new ELECTRONICS[]{ROOT, PHONES, LAPTOPS};
        }

        static {
            ELECTRONICS[] electronicsArr$values = $values();
            $VALUES = electronicsArr$values;
            $ENTRIES = c.a(electronicsArr$values);
        }

        private ELECTRONICS(String str, int i12, String str2) {
            this.id = str2;
        }

        @k
        public static a<ELECTRONICS> getEntries() {
            return $ENTRIES;
        }

        public static ELECTRONICS valueOf(String str) {
            return (ELECTRONICS) Enum.valueOf(ELECTRONICS.class, str);
        }

        public static ELECTRONICS[] values() {
            return (ELECTRONICS[]) $VALUES.clone();
        }

        @k
        public final String getId() {
            return this.id;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CategoryIds.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/CategoryIds$HOBBY;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "ROOT", "HUNTING_AND_FISHING", "SPORT_AND_RECREATION", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HOBBY {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ HOBBY[] $VALUES;

        @k
        private final String id;
        public static final HOBBY ROOT = new HOBBY("ROOT", 0, "7");
        public static final HOBBY HUNTING_AND_FISHING = new HOBBY("HUNTING_AND_FISHING", 1, "102");
        public static final HOBBY SPORT_AND_RECREATION = new HOBBY("SPORT_AND_RECREATION", 2, "39");

        private static final /* synthetic */ HOBBY[] $values() {
            return new HOBBY[]{ROOT, HUNTING_AND_FISHING, SPORT_AND_RECREATION};
        }

        static {
            HOBBY[] hobbyArr$values = $values();
            $VALUES = hobbyArr$values;
            $ENTRIES = c.a(hobbyArr$values);
        }

        private HOBBY(String str, int i12, String str2) {
            this.id = str2;
        }

        @k
        public static a<HOBBY> getEntries() {
            return $ENTRIES;
        }

        public static HOBBY valueOf(String str) {
            return (HOBBY) Enum.valueOf(HOBBY.class, str);
        }

        public static HOBBY[] values() {
            return (HOBBY[]) $VALUES.clone();
        }

        @k
        public final String getId() {
            return this.id;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CategoryIds.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/CategoryIds$JOB;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "ROOT", "VACANCY", "CV", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class JOB {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ JOB[] $VALUES;

        @k
        private final String id;
        public static final JOB ROOT = new JOB("ROOT", 0, "110");
        public static final JOB VACANCY = new JOB("VACANCY", 1, "111");

        /* renamed from: CV, reason: collision with root package name */
        public static final JOB f253588CV = new JOB("CV", 2, "112");

        private static final /* synthetic */ JOB[] $values() {
            return new JOB[]{ROOT, VACANCY, f253588CV};
        }

        static {
            JOB[] jobArr$values = $values();
            $VALUES = jobArr$values;
            $ENTRIES = c.a(jobArr$values);
        }

        private JOB(String str, int i12, String str2) {
            this.id = str2;
        }

        @k
        public static a<JOB> getEntries() {
            return $ENTRIES;
        }

        public static JOB valueOf(String str) {
            return (JOB) Enum.valueOf(JOB.class, str);
        }

        public static JOB[] values() {
            return (JOB[]) $VALUES.clone();
        }

        @k
        public final String getId() {
            return this.id;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CategoryIds.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/CategoryIds$PERSONAL_BELONGINGS;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "ROOT", "CLOTHES_SHOES_ACCESSORIES", "KIDS_CLOTHES_AND_SHOES", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PERSONAL_BELONGINGS {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ PERSONAL_BELONGINGS[] $VALUES;

        @k
        private final String id;
        public static final PERSONAL_BELONGINGS ROOT = new PERSONAL_BELONGINGS("ROOT", 0, "5");
        public static final PERSONAL_BELONGINGS CLOTHES_SHOES_ACCESSORIES = new PERSONAL_BELONGINGS("CLOTHES_SHOES_ACCESSORIES", 1, "27");
        public static final PERSONAL_BELONGINGS KIDS_CLOTHES_AND_SHOES = new PERSONAL_BELONGINGS("KIDS_CLOTHES_AND_SHOES", 2, "29");

        private static final /* synthetic */ PERSONAL_BELONGINGS[] $values() {
            return new PERSONAL_BELONGINGS[]{ROOT, CLOTHES_SHOES_ACCESSORIES, KIDS_CLOTHES_AND_SHOES};
        }

        static {
            PERSONAL_BELONGINGS[] personal_belongingsArr$values = $values();
            $VALUES = personal_belongingsArr$values;
            $ENTRIES = c.a(personal_belongingsArr$values);
        }

        private PERSONAL_BELONGINGS(String str, int i12, String str2) {
            this.id = str2;
        }

        @k
        public static a<PERSONAL_BELONGINGS> getEntries() {
            return $ENTRIES;
        }

        public static PERSONAL_BELONGINGS valueOf(String str) {
            return (PERSONAL_BELONGINGS) Enum.valueOf(PERSONAL_BELONGINGS.class, str);
        }

        public static PERSONAL_BELONGINGS[] values() {
            return (PERSONAL_BELONGINGS[]) $VALUES.clone();
        }

        @k
        public final String getId() {
            return this.id;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CategoryIds.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/CategoryIds$PETS;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "ROOT", "GOODS_FOR_PETS", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PETS {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ PETS[] $VALUES;

        @k
        private final String id;
        public static final PETS ROOT = new PETS("ROOT", 0, "35");
        public static final PETS GOODS_FOR_PETS = new PETS("GOODS_FOR_PETS", 1, "94");

        private static final /* synthetic */ PETS[] $values() {
            return new PETS[]{ROOT, GOODS_FOR_PETS};
        }

        static {
            PETS[] petsArr$values = $values();
            $VALUES = petsArr$values;
            $ENTRIES = c.a(petsArr$values);
        }

        private PETS(String str, int i12, String str2) {
            this.id = str2;
        }

        @k
        public static a<PETS> getEntries() {
            return $ENTRIES;
        }

        public static PETS valueOf(String str) {
            return (PETS) Enum.valueOf(PETS.class, str);
        }

        public static PETS[] values() {
            return (PETS[]) $VALUES.clone();
        }

        @k
        public final String getId() {
            return this.id;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CategoryIds.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/CategoryIds$RE;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "ROOT", "RE_ROOMS", "RE_FLATS", "RE_HOUSES", "RE_LANDS", "RE_GARAGES", "RE_COMMERCIAL", "RE_ABROAD", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RE {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ RE[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE;

        @k
        private final String id;
        public static final RE ROOT = new RE("ROOT", 0, "4");
        public static final RE RE_ROOMS = new RE("RE_ROOMS", 1, "23");
        public static final RE RE_FLATS = new RE("RE_FLATS", 2, "24");
        public static final RE RE_HOUSES = new RE("RE_HOUSES", 3, "25");
        public static final RE RE_LANDS = new RE("RE_LANDS", 4, "26");
        public static final RE RE_GARAGES = new RE("RE_GARAGES", 5, "85");
        public static final RE RE_COMMERCIAL = new RE("RE_COMMERCIAL", 6, "42");
        public static final RE RE_ABROAD = new RE("RE_ABROAD", 7, "86");

        /* compiled from: CategoryIds.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/CategoryIds$RE$Companion;", "", "()V", "allIds", "", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @k
            public final List<String> allIds() {
                RE[] reArrValues = RE.values();
                ArrayList arrayList = new ArrayList(reArrValues.length);
                for (RE re2 : reArrValues) {
                    arrayList.add(re2.getId());
                }
                return arrayList;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ RE[] $values() {
            return new RE[]{ROOT, RE_ROOMS, RE_FLATS, RE_HOUSES, RE_LANDS, RE_GARAGES, RE_COMMERCIAL, RE_ABROAD};
        }

        static {
            RE[] reArr$values = $values();
            $VALUES = reArr$values;
            $ENTRIES = c.a(reArr$values);
            INSTANCE = new Companion(null);
        }

        private RE(String str, int i12, String str2) {
            this.id = str2;
        }

        @k
        public static a<RE> getEntries() {
            return $ENTRIES;
        }

        public static RE valueOf(String str) {
            return (RE) Enum.valueOf(RE.class, str);
        }

        public static RE[] values() {
            return (RE[]) $VALUES.clone();
        }

        @k
        public final String getId() {
            return this.id;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CategoryIds.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/CategoryIds$SE;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "ROOT", "SERVICES_OFFER", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SE {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ SE[] $VALUES;
        public static final SE ROOT = new SE("ROOT", 0, "113");
        public static final SE SERVICES_OFFER = new SE("SERVICES_OFFER", 1, "114");

        @k
        private final String id;

        private static final /* synthetic */ SE[] $values() {
            return new SE[]{ROOT, SERVICES_OFFER};
        }

        static {
            SE[] seArr$values = $values();
            $VALUES = seArr$values;
            $ENTRIES = c.a(seArr$values);
        }

        private SE(String str, int i12, String str2) {
            this.id = str2;
        }

        @k
        public static a<SE> getEntries() {
            return $ENTRIES;
        }

        public static SE valueOf(String str) {
            return (SE) Enum.valueOf(SE.class, str);
        }

        public static SE[] values() {
            return (SE[]) $VALUES.clone();
        }

        @k
        public final String getId() {
            return this.id;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CategoryIds.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/CategoryIds$TRAVEL;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "ROOT", "RENT", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TRAVEL {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ TRAVEL[] $VALUES;

        @k
        private final String id;
        public static final TRAVEL ROOT = new TRAVEL("ROOT", 0, "337");
        public static final TRAVEL RENT = new TRAVEL("RENT", 1, "338");

        private static final /* synthetic */ TRAVEL[] $values() {
            return new TRAVEL[]{ROOT, RENT};
        }

        static {
            TRAVEL[] travelArr$values = $values();
            $VALUES = travelArr$values;
            $ENTRIES = c.a(travelArr$values);
        }

        private TRAVEL(String str, int i12, String str2) {
            this.id = str2;
        }

        @k
        public static a<TRAVEL> getEntries() {
            return $ENTRIES;
        }

        public static TRAVEL valueOf(String str) {
            return (TRAVEL) Enum.valueOf(TRAVEL.class, str);
        }

        public static TRAVEL[] values() {
            return (TRAVEL[]) $VALUES.clone();
        }

        @k
        public final String getId() {
            return this.id;
        }
    }

    private CategoryIds() {
    }
}
