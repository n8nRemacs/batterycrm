package com.avito.android.user_stats.generated.api.api_1_sellers_private_statistics_general_dynamics_categories_post;

import WJ0.d;
import WJ0.e;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.FontStyleKt;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api1SellersPrivateStatisticsGeneralDynamicsCategoriesPostResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001\u001bB;\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_categories_post/OkRespDataSuccessMetricsItem;", "", "", "LWJ0/d;", "hint", "", "slug", "symbol", "LWJ0/e;", "total", "Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_categories_post/OkRespDataSuccessMetricsItem$Type;", "type", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;LWJ0/e;Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_categories_post/OkRespDataSuccessMetricsItem$Type;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "LWJ0/e;", "d", "()LWJ0/e;", "Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_categories_post/OkRespDataSuccessMetricsItem$Type;", "e", "()Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_categories_post/OkRespDataSuccessMetricsItem$Type;", "Type", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OkRespDataSuccessMetricsItem {

    @c("hint")
    @l
    private final List<d> hint;

    @c("slug")
    @k
    private final String slug;

    @c("symbol")
    @l
    private final String symbol;

    @c("total")
    @l
    private final e total;

    @c("type")
    @k
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api1SellersPrivateStatisticsGeneralDynamicsCategoriesPostResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_categories_post/OkRespDataSuccessMetricsItem$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Regular", "Money", "Conversion", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("conversion")
        public static final Type Conversion;

        @c("money")
        public static final Type Money;

        @c(FontStyleKt.REGULAR)
        public static final Type Regular;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f318271b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f318272c;

        static {
            Type type = new Type("Regular", 0, FontStyleKt.REGULAR);
            Regular = type;
            Type type2 = new Type("Money", 1, "money");
            Money = type2;
            Type type3 = new Type("Conversion", 2, "conversion");
            Conversion = type3;
            Type[] typeArr = {type, type2, type3};
            f318271b = typeArr;
            f318272c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f318271b.clone();
        }
    }

    public OkRespDataSuccessMetricsItem(@l List<d> list, @k String str, @l String str2, @l e eVar, @k Type type) {
        this.hint = list;
        this.slug = str;
        this.symbol = str2;
        this.total = eVar;
        this.type = type;
    }

    @l
    public final List<d> a() {
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
    public final e getTotal() {
        return this.total;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final Type getType() {
        return this.type;
    }
}
