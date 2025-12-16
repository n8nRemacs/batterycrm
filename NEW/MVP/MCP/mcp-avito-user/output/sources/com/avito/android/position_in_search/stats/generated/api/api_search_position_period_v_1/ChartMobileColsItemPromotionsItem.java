package com.avito.android.position_in_search.stats.generated.api.api_search_position_period_v_1;

import Q80.C14872c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ApiSearchPositionPeriodV1Response.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/ChartMobileColsItemPromotionsItem;", "", "LQ80/c;", "bgColor", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "iconUrl", "Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/ChartMobileColsItemPromotionsItem$Type;", "type", "<init>", "(LQ80/c;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/ChartMobileColsItemPromotionsItem$Type;)V", "LQ80/c;", "a", "()LQ80/c;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/ChartMobileColsItemPromotionsItem$Type;", "d", "()Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/ChartMobileColsItemPromotionsItem$Type;", "Type", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChartMobileColsItemPromotionsItem {

    @c("bgColor")
    @l
    private final C14872c bgColor;

    @c(ContextActionHandler.Link.DEEPLINK)
    @l
    private final DeepLink deepLink;

    @c("iconUrl")
    @l
    private final String iconUrl;

    @c("type")
    @k
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiSearchPositionPeriodV1Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/ChartMobileColsItemPromotionsItem$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "START", "END", "CENTER", "STARTEND", "EMPTY", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("CENTER")
        public static final Type CENTER;

        @c("EMPTY")
        public static final Type EMPTY;

        @c("END")
        public static final Type END;

        @c("START")
        public static final Type START;

        @c("START_END")
        public static final Type STARTEND;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f220346b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f220347c;

        static {
            Type type = new Type("START", 0, "START");
            START = type;
            Type type2 = new Type("END", 1, "END");
            END = type2;
            Type type3 = new Type("CENTER", 2, "CENTER");
            CENTER = type3;
            Type type4 = new Type("STARTEND", 3, "START_END");
            STARTEND = type4;
            Type type5 = new Type("EMPTY", 4, "EMPTY");
            EMPTY = type5;
            Type[] typeArr = {type, type2, type3, type4, type5};
            f220346b = typeArr;
            f220347c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f220346b.clone();
        }
    }

    public ChartMobileColsItemPromotionsItem(@l C14872c c14872c, @l DeepLink deepLink, @l String str, @k Type type) {
        this.bgColor = c14872c;
        this.deepLink = deepLink;
        this.iconUrl = str;
        this.type = type;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C14872c getBgColor() {
        return this.bgColor;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final Type getType() {
        return this.type;
    }
}
