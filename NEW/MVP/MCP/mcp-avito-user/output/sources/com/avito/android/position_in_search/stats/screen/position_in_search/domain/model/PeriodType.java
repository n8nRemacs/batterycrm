package com.avito.android.position_in_search.stats.screen.position_in_search.domain.model;

import Y61.k;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PeriodType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/domain/model/PeriodType;", "", "a", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PeriodType {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f221444c;

    /* renamed from: d, reason: collision with root package name */
    public static final PeriodType f221445d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ PeriodType[] f221446e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f221447f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f221448b;

    /* compiled from: PeriodType.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/domain/model/PeriodType$a;", "", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static PeriodType a(@k String str) {
            Object next;
            Iterator it = ((AbstractC42738c) PeriodType.f221447f).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((PeriodType) next).f221448b.equals(str)) {
                    break;
                }
            }
            PeriodType periodType = (PeriodType) next;
            return periodType == null ? PeriodType.f221445d : periodType;
        }

        public a() {
        }
    }

    static {
        PeriodType periodType = new PeriodType("INIT", 0, "INIT");
        PeriodType periodType2 = new PeriodType("YESTERDAY", 1, "YESTERDAY");
        PeriodType periodType3 = new PeriodType("WEEK", 2, "WEEK");
        f221445d = periodType3;
        PeriodType[] periodTypeArr = {periodType, periodType2, periodType3, new PeriodType("MONTH", 3, "MONTH")};
        f221446e = periodTypeArr;
        f221447f = c.a(periodTypeArr);
        f221444c = new a(null);
    }

    public PeriodType(String str, int i12, String str2) {
        this.f221448b = str2;
    }

    public static PeriodType valueOf(String str) {
        return (PeriodType) Enum.valueOf(PeriodType.class, str);
    }

    public static PeriodType[] values() {
        return (PeriodType[]) f221446e.clone();
    }
}
