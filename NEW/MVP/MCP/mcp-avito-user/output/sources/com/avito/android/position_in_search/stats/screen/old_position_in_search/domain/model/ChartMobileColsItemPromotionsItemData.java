package com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: PositionChart.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/model/ChartMobileColsItemPromotionsItemData;", "", "Type", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ChartMobileColsItemPromotionsItemData {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final UniversalColor f220398a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final DeepLink f220399b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f220400c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Type f220401d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PositionChart.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/model/ChartMobileColsItemPromotionsItemData$Type;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f220402b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f220403c;

        /* renamed from: d, reason: collision with root package name */
        public static final Type f220404d;

        /* renamed from: e, reason: collision with root package name */
        public static final Type f220405e;

        /* renamed from: f, reason: collision with root package name */
        public static final Type f220406f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ Type[] f220407g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ a f220408h;

        static {
            Type type = new Type("START", 0);
            f220402b = type;
            Type type2 = new Type("END", 1);
            f220403c = type2;
            Type type3 = new Type("CENTER", 2);
            f220404d = type3;
            Type type4 = new Type("START_END", 3);
            f220405e = type4;
            Type type5 = new Type("EMPTY", 4);
            f220406f = type5;
            Type[] typeArr = {type, type2, type3, type4, type5};
            f220407g = typeArr;
            f220408h = c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f220407g.clone();
        }
    }

    public ChartMobileColsItemPromotionsItemData(@l UniversalColor universalColor, @l DeepLink deepLink, @l String str, @k Type type) {
        this.f220398a = universalColor;
        this.f220399b = deepLink;
        this.f220400c = str;
        this.f220401d = type;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChartMobileColsItemPromotionsItemData)) {
            return false;
        }
        ChartMobileColsItemPromotionsItemData chartMobileColsItemPromotionsItemData = (ChartMobileColsItemPromotionsItemData) obj;
        return L.f(this.f220398a, chartMobileColsItemPromotionsItemData.f220398a) && L.f(this.f220399b, chartMobileColsItemPromotionsItemData.f220399b) && L.f(this.f220400c, chartMobileColsItemPromotionsItemData.f220400c) && this.f220401d == chartMobileColsItemPromotionsItemData.f220401d;
    }

    public final int hashCode() {
        UniversalColor universalColor = this.f220398a;
        int iHashCode = (universalColor == null ? 0 : universalColor.hashCode()) * 31;
        DeepLink deepLink = this.f220399b;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str = this.f220400c;
        return this.f220401d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "ChartMobileColsItemPromotionsItemData(bgColor=" + this.f220398a + ", deepLink=" + this.f220399b + ", iconUrl=" + this.f220400c + ", type=" + this.f220401d + ')';
    }
}
