package com.avito.android.loyalty.remote.model.quality_service;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import dX.C39634a;
import dX.f;
import dX.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: QualityServiceGradeInfo.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0016\u0018\u0013B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo;", "", "Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$b;", "progress", "Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$a;", "description", "Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$GradeAdvices;", "advices", "LdX/f;", "action", "<init>", "(Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$b;Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$a;Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$GradeAdvices;LdX/f;)V", "Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$b;", "d", "()Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$b;", "Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$a;", "c", "()Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$a;", "Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$GradeAdvices;", "b", "()Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$GradeAdvices;", "LdX/f;", "a", "()LdX/f;", "GradeAdvices", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class QualityServiceGradeInfo {

    @c("action")
    @l
    private final f action;

    @c("advices")
    @l
    private final GradeAdvices advices;

    @c("description")
    @l
    private final a description;

    @c("progress")
    @l
    private final b progress;

    /* compiled from: QualityServiceGradeInfo.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0019\u0017B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$GradeAdvices;", "", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "", "Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$GradeAdvices$AdviceItem;", "items", "Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$GradeAdvices$a;", "counter", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$GradeAdvices$a;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$GradeAdvices$a;", "a", "()Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$GradeAdvices$a;", "AdviceItem", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GradeAdvices {

        @c("counter")
        @l
        private final a counter;

        @c("items")
        @l
        private final List<AdviceItem> items;

        @c("subtitle")
        @l
        private final AttributedText subtitle;

        @c("title")
        @l
        private final String title;

        /* compiled from: QualityServiceGradeInfo.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0018B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$GradeAdvices$AdviceItem;", "", "", "score", "", "title", "Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$GradeAdvices$AdviceItem$Color;", "color", "LdX/a;", "badge", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$GradeAdvices$AdviceItem$Color;LdX/a;)V", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$GradeAdvices$AdviceItem$Color;", "a", "()Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$GradeAdvices$AdviceItem$Color;", "LdX/a;", "getBadge", "()LdX/a;", "Color", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AdviceItem {

            @c("badge")
            @l
            private final C39634a badge;

            @c("color")
            @l
            private final Color color;

            @c("score")
            @l
            private final Integer score;

            @c("title")
            @l
            private final String title;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: QualityServiceGradeInfo.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$GradeAdvices$AdviceItem$Color;", "", "(Ljava/lang/String;I)V", "DEFAULT", "RED", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Color {

                @c("default")
                public static final Color DEFAULT;

                @c("red")
                public static final Color RED;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ Color[] f183241b;

                /* renamed from: c, reason: collision with root package name */
                public static final /* synthetic */ kotlin.enums.a f183242c;

                static {
                    Color color = new Color("DEFAULT", 0);
                    DEFAULT = color;
                    Color color2 = new Color("RED", 1);
                    RED = color2;
                    Color[] colorArr = {color, color2};
                    f183241b = colorArr;
                    f183242c = kotlin.enums.c.a(colorArr);
                }

                private Color(String str, int i12) {
                }

                public static Color valueOf(String str) {
                    return (Color) Enum.valueOf(Color.class, str);
                }

                public static Color[] values() {
                    return (Color[]) f183241b.clone();
                }
            }

            public AdviceItem(@l Integer num, @l String str, @l Color color, @l C39634a c39634a) {
                this.score = num;
                this.title = str;
                this.color = color;
                this.badge = c39634a;
            }

            @l
            /* renamed from: a, reason: from getter */
            public final Color getColor() {
                return this.color;
            }

            @l
            /* renamed from: b, reason: from getter */
            public final Integer getScore() {
                return this.score;
            }

            @l
            /* renamed from: c, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AdviceItem)) {
                    return false;
                }
                AdviceItem adviceItem = (AdviceItem) obj;
                return L.f(this.score, adviceItem.score) && L.f(this.title, adviceItem.title) && this.color == adviceItem.color && L.f(this.badge, adviceItem.badge);
            }

            public final int hashCode() {
                Integer num = this.score;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                String str = this.title;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                Color color = this.color;
                int iHashCode3 = (iHashCode2 + (color != null ? color.hashCode() : 0)) * 31;
                C39634a c39634a = this.badge;
                if (c39634a == null) {
                    return iHashCode3;
                }
                c39634a.getClass();
                throw null;
            }

            @k
            public final String toString() {
                return "AdviceItem(score=" + this.score + ", title=" + this.title + ", color=" + this.color + ", badge=" + this.badge + ')';
            }
        }

        /* compiled from: QualityServiceGradeInfo.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$GradeAdvices$a;", "", "", "value", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/Integer;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            @c(TooltipAttribute.PARAM_DEEP_LINK)
            @k
            private final DeepLink uri;

            @c("total")
            @l
            private final Integer value;

            public a(@l Integer num, @k DeepLink deepLink) {
                this.value = num;
                this.uri = deepLink;
            }

            @k
            /* renamed from: a, reason: from getter */
            public final DeepLink getUri() {
                return this.uri;
            }

            @l
            /* renamed from: b, reason: from getter */
            public final Integer getValue() {
                return this.value;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.value, aVar.value) && L.f(this.uri, aVar.uri);
            }

            public final int hashCode() {
                Integer num = this.value;
                return this.uri.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Counter(value=");
                sb2.append(this.value);
                sb2.append(", uri=");
                return com.avito.android.actions_sheet.a.v(sb2, this.uri, ')');
            }
        }

        public GradeAdvices(@l String str, @l AttributedText attributedText, @l List<AdviceItem> list, @l a aVar) {
            this.title = str;
            this.subtitle = attributedText;
            this.items = list;
            this.counter = aVar;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final a getCounter() {
            return this.counter;
        }

        @l
        public final List<AdviceItem> b() {
            return this.items;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final AttributedText getSubtitle() {
            return this.subtitle;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GradeAdvices)) {
                return false;
            }
            GradeAdvices gradeAdvices = (GradeAdvices) obj;
            return L.f(this.title, gradeAdvices.title) && L.f(this.subtitle, gradeAdvices.subtitle) && L.f(this.items, gradeAdvices.items) && L.f(this.counter, gradeAdvices.counter);
        }

        public final int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AttributedText attributedText = this.subtitle;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            List<AdviceItem> list = this.items;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            a aVar = this.counter;
            return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "GradeAdvices(title=" + this.title + ", subtitle=" + this.subtitle + ", items=" + this.items + ", counter=" + this.counter + ')';
        }
    }

    /* compiled from: QualityServiceGradeInfo.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$a;", "", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        @c("subtitle")
        @l
        private final AttributedText subtitle;

        @c("title")
        @l
        private final String title;

        public a(@l String str, @l AttributedText attributedText) {
            this.title = str;
            this.subtitle = attributedText;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final AttributedText getSubtitle() {
            return this.subtitle;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.title, aVar.title) && L.f(this.subtitle, aVar.subtitle);
        }

        public final int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AttributedText attributedText = this.subtitle;
            return iHashCode + (attributedText != null ? attributedText.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Description(title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            return com.avito.android.actions_sheet.a.w(sb2, this.subtitle, ')');
        }
    }

    /* compiled from: QualityServiceGradeInfo.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceGradeInfo$b;", "", "", "value", "Lcom/avito/android/remote/model/text/AttributedText;", "valueHint", "threshold", "LdX/j;", "popup", "<init>", "(Ljava/lang/Integer;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Integer;LdX/j;)V", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "b", "LdX/j;", "a", "()LdX/j;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        @c("popup")
        @l
        private final j popup;

        @c("greenThreshold")
        @l
        private final Integer threshold;

        @c("value")
        @l
        private final Integer value;

        @c("valueHint")
        @l
        private final AttributedText valueHint;

        public b(@l Integer num, @l AttributedText attributedText, @l Integer num2, @l j jVar) {
            this.value = num;
            this.valueHint = attributedText;
            this.threshold = num2;
            this.popup = jVar;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final j getPopup() {
            return this.popup;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final Integer getThreshold() {
            return this.threshold;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final Integer getValue() {
            return this.value;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final AttributedText getValueHint() {
            return this.valueHint;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.value, bVar.value) && L.f(this.valueHint, bVar.valueHint) && L.f(this.threshold, bVar.threshold) && L.f(this.popup, bVar.popup);
        }

        public final int hashCode() {
            Integer num = this.value;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            AttributedText attributedText = this.valueHint;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            Integer num2 = this.threshold;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            j jVar = this.popup;
            return iHashCode3 + (jVar != null ? jVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Progress(value=" + this.value + ", valueHint=" + this.valueHint + ", threshold=" + this.threshold + ", popup=" + this.popup + ')';
        }
    }

    public QualityServiceGradeInfo(@l b bVar, @l a aVar, @l GradeAdvices gradeAdvices, @l f fVar) {
        this.progress = bVar;
        this.description = aVar;
        this.advices = gradeAdvices;
        this.action = fVar;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final f getAction() {
        return this.action;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final GradeAdvices getAdvices() {
        return this.advices;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final a getDescription() {
        return this.description;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final b getProgress() {
        return this.progress;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QualityServiceGradeInfo)) {
            return false;
        }
        QualityServiceGradeInfo qualityServiceGradeInfo = (QualityServiceGradeInfo) obj;
        return L.f(this.progress, qualityServiceGradeInfo.progress) && L.f(this.description, qualityServiceGradeInfo.description) && L.f(this.advices, qualityServiceGradeInfo.advices) && L.f(this.action, qualityServiceGradeInfo.action);
    }

    public final int hashCode() {
        b bVar = this.progress;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        a aVar = this.description;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        GradeAdvices gradeAdvices = this.advices;
        int iHashCode3 = (iHashCode2 + (gradeAdvices == null ? 0 : gradeAdvices.hashCode())) * 31;
        f fVar = this.action;
        return iHashCode3 + (fVar != null ? fVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "QualityServiceGradeInfo(progress=" + this.progress + ", description=" + this.description + ", advices=" + this.advices + ", action=" + this.action + ')';
    }
}
