package com.avito.android.competitor_analytics.generated.api.api_2_competitor_analytics_general;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api2CompetitorAnalyticsGeneralResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/OkResponseSuccessLayoutPeriodsItem;", "", "", "isSelected", "Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/OkResponseSuccessLayoutPeriodsItem$Slug;", "slug", "", "title", "unavailableHint", "<init>", "(ZLcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/OkResponseSuccessLayoutPeriodsItem$Slug;Ljava/lang/String;Ljava/lang/String;)V", "Z", "d", "()Z", "Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/OkResponseSuccessLayoutPeriodsItem$Slug;", "a", "()Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/OkResponseSuccessLayoutPeriodsItem$Slug;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Slug", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OkResponseSuccessLayoutPeriodsItem {

    @c("isSelected")
    private final boolean isSelected;

    @c("slug")
    @k
    private final Slug slug;

    @c("title")
    @k
    private final String title;

    @c("unavailableHint")
    @l
    private final String unavailableHint;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api2CompetitorAnalyticsGeneralResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/OkResponseSuccessLayoutPeriodsItem$Slug;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Day", "Week", "Month", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Slug {

        @c(SelectionType.TYPE_DAY)
        public static final Slug Day;

        @c(SelectionType.TYPE_MONTH)
        public static final Slug Month;

        @c("week")
        public static final Slug Week;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Slug[] f124373b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f124374c;

        static {
            Slug slug = new Slug("Day", 0, SelectionType.TYPE_DAY);
            Day = slug;
            Slug slug2 = new Slug("Week", 1, "week");
            Week = slug2;
            Slug slug3 = new Slug("Month", 2, SelectionType.TYPE_MONTH);
            Month = slug3;
            Slug[] slugArr = {slug, slug2, slug3};
            f124373b = slugArr;
            f124374c = kotlin.enums.c.a(slugArr);
        }

        private Slug(String str, int i12, String str2) {
        }

        public static Slug valueOf(String str) {
            return (Slug) Enum.valueOf(Slug.class, str);
        }

        public static Slug[] values() {
            return (Slug[]) f124373b.clone();
        }
    }

    public OkResponseSuccessLayoutPeriodsItem(boolean z12, @k Slug slug, @k String str, @l String str2) {
        this.isSelected = z12;
        this.slug = slug;
        this.title = str;
        this.unavailableHint = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Slug getSlug() {
        return this.slug;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getUnavailableHint() {
        return this.unavailableHint;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }
}
