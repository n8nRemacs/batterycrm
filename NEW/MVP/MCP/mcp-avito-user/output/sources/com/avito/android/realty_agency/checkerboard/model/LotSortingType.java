package com.avito.android.realty_agency.checkerboard.model;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LotSortingType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/realty_agency/checkerboard/model/LotSortingType;", "", "a", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class LotSortingType {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f251215b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final LotSortingType f251216c;

    /* renamed from: d, reason: collision with root package name */
    public static final LotSortingType f251217d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ LotSortingType[] f251218e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f251219f;

    /* compiled from: LotSortingType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/realty_agency/checkerboard/model/LotSortingType$a;", "", "<init>", "()V", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        LotSortingType lotSortingType = new LotSortingType("BY_PRICE_ASC", 0);
        LotSortingType lotSortingType2 = new LotSortingType("BY_PRICE_DESC", 1);
        f251217d = lotSortingType2;
        LotSortingType[] lotSortingTypeArr = {lotSortingType, lotSortingType2, new LotSortingType("BY_COMPLETION_QUARTER", 2)};
        f251218e = lotSortingTypeArr;
        f251219f = c.a(lotSortingTypeArr);
        f251215b = new a(null);
        f251216c = lotSortingType;
    }

    public LotSortingType() {
        throw null;
    }

    public static LotSortingType valueOf(String str) {
        return (LotSortingType) Enum.valueOf(LotSortingType.class, str);
    }

    public static LotSortingType[] values() {
        return (LotSortingType[]) f251218e.clone();
    }
}
