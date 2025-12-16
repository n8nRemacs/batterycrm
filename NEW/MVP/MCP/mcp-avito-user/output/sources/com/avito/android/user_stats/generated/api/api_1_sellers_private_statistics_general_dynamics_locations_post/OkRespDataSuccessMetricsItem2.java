package com.avito.android.user_stats.generated.api.api_1_sellers_private_statistics_general_dynamics_locations_post;

import XJ0.e;
import XJ0.f;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.FontStyleKt;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api1SellersPrivateStatisticsGeneralDynamicsLocationsPostResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001\u001bB;\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_locations_post/OkRespDataSuccessMetricsItem2;", "", "", "LXJ0/e;", "hint", "", "slug", "symbol", "LXJ0/f;", "total", "Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_locations_post/OkRespDataSuccessMetricsItem2$Type;", "type", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;LXJ0/f;Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_locations_post/OkRespDataSuccessMetricsItem2$Type;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "LXJ0/f;", "d", "()LXJ0/f;", "Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_locations_post/OkRespDataSuccessMetricsItem2$Type;", "e", "()Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_locations_post/OkRespDataSuccessMetricsItem2$Type;", "Type", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OkRespDataSuccessMetricsItem2 {

    @c("hint")
    @l
    private final List<e> hint;

    @c("slug")
    @k
    private final String slug;

    @c("symbol")
    @l
    private final String symbol;

    @c("total")
    @l
    private final f total;

    @c("type")
    @k
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api1SellersPrivateStatisticsGeneralDynamicsLocationsPostResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_locations_post/OkRespDataSuccessMetricsItem2$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Regular", "Money", "Conversion", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("conversion")
        public static final Type Conversion;

        @c("money")
        public static final Type Money;

        @c(FontStyleKt.REGULAR)
        public static final Type Regular;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f318276b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f318277c;

        static {
            Type type = new Type("Regular", 0, FontStyleKt.REGULAR);
            Regular = type;
            Type type2 = new Type("Money", 1, "money");
            Money = type2;
            Type type3 = new Type("Conversion", 2, "conversion");
            Conversion = type3;
            Type[] typeArr = {type, type2, type3};
            f318276b = typeArr;
            f318277c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f318276b.clone();
        }
    }

    public OkRespDataSuccessMetricsItem2(@l List<e> list, @k String str, @l String str2, @l f fVar, @k Type type) {
        this.hint = list;
        this.slug = str;
        this.symbol = str2;
        this.total = fVar;
        this.type = type;
    }

    @l
    public final List<e> a() {
        return this.hint;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final f getTotal() {
        return this.total;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final Type getType() {
        return this.type;
    }
}
