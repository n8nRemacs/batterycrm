package com.avito.android.ai_assistant.model;

import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.BeduinV2;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.text.AttributedText;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AssistantChatResponse.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem;", "", "a", "b", "c", "BadgeStyle", "d", "e", "f", "g", "h", "i", "j", "k", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$a;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$d;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$f;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$g;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$h;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$i;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$j;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$k;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface OkRespDataSuccessElementsItemMessageSegmentsItem {

    /* compiled from: AssistantChatResponse.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0012B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$BadgeStyle;", "", "LTb/c;", "backgroundColor", "fontColor", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$BadgeStyle$EdgeType;", "leftEdgeStyle", "rightEdgeStyle", "<init>", "(LTb/c;LTb/c;Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$BadgeStyle$EdgeType;Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$BadgeStyle$EdgeType;)V", "LTb/c;", "a", "()LTb/c;", "b", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$BadgeStyle$EdgeType;", "c", "()Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$BadgeStyle$EdgeType;", "d", "EdgeType", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BadgeStyle {

        @com.google.gson.annotations.c("backgroundColor")
        @Y61.k
        private final Tb.c backgroundColor;

        @com.google.gson.annotations.c("fontColor")
        @Y61.k
        private final Tb.c fontColor;

        @com.google.gson.annotations.c("leftEdgeStyle")
        @Y61.k
        private final EdgeType leftEdgeStyle;

        @com.google.gson.annotations.c("rightEdgeStyle")
        @Y61.k
        private final EdgeType rightEdgeStyle;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AssistantChatResponse.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$BadgeStyle$EdgeType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Square", "Flag", "Pipka", "Pyramid", "AntiPyramid", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class EdgeType {

            @com.google.gson.annotations.c("antiPyramid")
            public static final EdgeType AntiPyramid;

            @com.google.gson.annotations.c("flag")
            public static final EdgeType Flag;

            @com.google.gson.annotations.c("pipka")
            public static final EdgeType Pipka;

            @com.google.gson.annotations.c("pyramid")
            public static final EdgeType Pyramid;

            @com.google.gson.annotations.c("square")
            public static final EdgeType Square;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public static final a f89120c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ EdgeType[] f89121d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f89122e;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f89123b;

            /* compiled from: AssistantChatResponse.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$BadgeStyle$EdgeType$a;", "", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class a {
                public /* synthetic */ a(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public static EdgeType a(@l String str) {
                    Object next;
                    if (str != null) {
                        Iterator it = ((AbstractC42738c) EdgeType.f89122e).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (L.f(((EdgeType) next).f89123b, str)) {
                                break;
                            }
                        }
                        EdgeType edgeType = (EdgeType) next;
                        if (edgeType != null) {
                            return edgeType;
                        }
                    }
                    return EdgeType.Square;
                }

                public a() {
                }
            }

            static {
                EdgeType edgeType = new EdgeType("Square", 0, "square");
                Square = edgeType;
                EdgeType edgeType2 = new EdgeType("Flag", 1, "flag");
                Flag = edgeType2;
                EdgeType edgeType3 = new EdgeType("Pipka", 2, "pipka");
                Pipka = edgeType3;
                EdgeType edgeType4 = new EdgeType("Pyramid", 3, "pyramid");
                Pyramid = edgeType4;
                EdgeType edgeType5 = new EdgeType("AntiPyramid", 4, "antiPyramid");
                AntiPyramid = edgeType5;
                EdgeType[] edgeTypeArr = {edgeType, edgeType2, edgeType3, edgeType4, edgeType5};
                f89121d = edgeTypeArr;
                f89122e = kotlin.enums.c.a(edgeTypeArr);
                f89120c = new a(null);
            }

            private EdgeType(String str, int i12, String str2) {
                this.f89123b = str2;
            }

            public static EdgeType valueOf(String str) {
                return (EdgeType) Enum.valueOf(EdgeType.class, str);
            }

            public static EdgeType[] values() {
                return (EdgeType[]) f89121d.clone();
            }
        }

        public BadgeStyle(@Y61.k Tb.c cVar, @Y61.k Tb.c cVar2, @Y61.k EdgeType edgeType, @Y61.k EdgeType edgeType2) {
            this.backgroundColor = cVar;
            this.fontColor = cVar2;
            this.leftEdgeStyle = edgeType;
            this.rightEdgeStyle = edgeType2;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final Tb.c getBackgroundColor() {
            return this.backgroundColor;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final Tb.c getFontColor() {
            return this.fontColor;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final EdgeType getLeftEdgeStyle() {
            return this.leftEdgeStyle;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final EdgeType getRightEdgeStyle() {
            return this.rightEdgeStyle;
        }
    }

    /* compiled from: AssistantChatResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$a;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem;", "", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$e;", "actions", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements OkRespDataSuccessElementsItemMessageSegmentsItem {

        @com.google.gson.annotations.c("actions")
        @Y61.k
        private final List<e> actions;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k List<? extends e> list) {
            this.actions = list;
        }

        @Y61.k
        public final List<e> a() {
            return this.actions;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.actions, ((a) obj).actions);
        }

        public final int hashCode() {
            return this.actions.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.p(new StringBuilder("Actions(actions="), this.actions, ')');
        }
    }

    /* compiled from: AssistantChatResponse.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$b;", "", "", "id", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$BadgeStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "title", "version", "<init>", "(JLcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$BadgeStyle;Ljava/lang/String;J)V", "J", "getId", "()J", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$BadgeStyle;", "a", "()Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$BadgeStyle;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "getVersion", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        @com.google.gson.annotations.c("id")
        private final long id;

        @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @Y61.k
        private final BadgeStyle style;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        @com.google.gson.annotations.c("version")
        private final long version;

        public b(long j12, @Y61.k BadgeStyle badgeStyle, @Y61.k String str, long j13) {
            this.id = j12;
            this.style = badgeStyle;
            this.title = str;
            this.version = j13;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final BadgeStyle getStyle() {
            return this.style;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: AssistantChatResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$c;", "", "", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$b;", "badges", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {

        @com.google.gson.annotations.c("badges")
        @Y61.k
        private final List<b> badges;

        public c(@Y61.k List<b> list) {
            this.badges = list;
        }

        @Y61.k
        public final List<b> a() {
            return this.badges;
        }
    }

    /* compiled from: AssistantChatResponse.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$d;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements OkRespDataSuccessElementsItemMessageSegmentsItem {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BeduinV2 f89125a;

        public d(@Y61.k BeduinV2 beduinV2) {
            this.f89125a = beduinV2;
        }
    }

    /* compiled from: AssistantChatResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$e;", "", "a", "b", "c", "d", "e", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$e$a;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$e$b;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$e$c;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$e$d;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$e$e;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface e {

        /* compiled from: AssistantChatResponse.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$e$a;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$e;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements e {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final DeepLink f89126a;

            public a(@Y61.k DeepLink deepLink) {
                this.f89126a = deepLink;
            }
        }

        /* compiled from: AssistantChatResponse.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$e$b;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$e;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements e {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f89127a;

            public b(@Y61.k String str) {
                this.f89127a = str;
            }
        }

        /* compiled from: AssistantChatResponse.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$e$c;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$e;", "", "isSelected", "<init>", "(Z)V", "Z", "a", "()Z", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements e {

            @com.google.gson.annotations.c("isSelected")
            private final boolean isSelected;

            public c(boolean z12) {
                this.isSelected = z12;
            }

            /* renamed from: a, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }
        }

        /* compiled from: AssistantChatResponse.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$e$d;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$e;", "", "isSelected", "<init>", "(Z)V", "Z", "a", "()Z", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d implements e {

            @com.google.gson.annotations.c("isSelected")
            private final boolean isSelected;

            public d(boolean z12) {
                this.isSelected = z12;
            }

            /* renamed from: a, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }
        }

        /* compiled from: AssistantChatResponse.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$e$e;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$e;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.ai_assistant.model.OkRespDataSuccessElementsItemMessageSegmentsItem$e$e, reason: collision with other inner class name */
        public static final /* data */ class C2641e implements e {
            static {
                new C2641e();
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C2641e);
            }

            public final int hashCode() {
                return -1791855585;
            }

            @Y61.k
            public final String toString() {
                return "Unknown";
            }
        }
    }

    /* compiled from: AssistantChatResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$f;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem;", "", "LTb/h;", "elements", "Lcom/avito/android/deep_linking/links/DeepLink;", "onShowClickstreamDeeplink", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements OkRespDataSuccessElementsItemMessageSegmentsItem {

        @com.google.gson.annotations.c("elements")
        @Y61.k
        private final List<Tb.h> elements;

        @com.google.gson.annotations.c("onShowClickstreamDeeplink")
        @l
        private final DeepLink onShowClickstreamDeeplink;

        @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @Y61.k
        private final String style;

        public f(@Y61.k List<Tb.h> list, @l DeepLink deepLink, @Y61.k String str) {
            this.elements = list;
            this.onShowClickstreamDeeplink = deepLink;
            this.style = str;
        }

        @Y61.k
        public final List<Tb.h> a() {
            return this.elements;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final DeepLink getOnShowClickstreamDeeplink() {
            return this.onShowClickstreamDeeplink;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final String getStyle() {
            return this.style;
        }
    }

    /* compiled from: AssistantChatResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$g;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem;", "", "Lcom/avito/android/remote/model/Image;", "elements", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "getElements", "()Ljava/util/List;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements OkRespDataSuccessElementsItemMessageSegmentsItem {

        @com.google.gson.annotations.c("elements")
        @Y61.k
        private final List<Image> elements;

        public g(@Y61.k List<Image> list) {
            this.elements = list;
        }
    }

    /* compiled from: AssistantChatResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$h;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem;", "", "Lcom/avito/android/ai_assistant/model/a;", "elements", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "getElements", "()Ljava/util/List;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h implements OkRespDataSuccessElementsItemMessageSegmentsItem {

        @com.google.gson.annotations.c("elements")
        @Y61.k
        private final List<com.avito.android.ai_assistant.model.a> elements;

        /* JADX WARN: Multi-variable type inference failed */
        public h(@Y61.k List<? extends com.avito.android.ai_assistant.model.a> list) {
            this.elements = list;
        }
    }

    /* compiled from: AssistantChatResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$i;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem;", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedText", "", "markdownText", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "getMarkdownText", "()Ljava/lang/String;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements OkRespDataSuccessElementsItemMessageSegmentsItem {

        @com.google.gson.annotations.c("attributedText")
        @Y61.k
        private final AttributedText attributedText;

        @com.google.gson.annotations.c("markdownText")
        @Y61.k
        private final String markdownText;

        public i(@Y61.k AttributedText attributedText, @Y61.k String str) {
            this.attributedText = attributedText;
            this.markdownText = str;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final AttributedText getAttributedText() {
            return this.attributedText;
        }
    }

    /* compiled from: AssistantChatResponse.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001f\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b)\u0010\"R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b*\u0010\"R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b+\u0010\u001fR\u001a\u0010\u0011\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010 \u001a\u0004\b,\u0010\"R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u0014\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b0\u0010\"¨\u00061"}, d2 = {"Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$j;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem;", "", "id", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$c;", AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR, "Lcom/avito/android/remote/model/text/AttributedText;", "additionalInfo", "", "discountString", "Lcom/avito/android/remote/model/Image;", "imageBySizes", "", "isFavorite", MessageBody.SystemMessageBody.Platform.Bubble.Item.OLD_PRICE_STRING, "priceString", "priceAttributed", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", MessageBody.SystemMessageBody.Platform.Bubble.Item.URI_PATH, "urlPath", "<init>", "(JLcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$c;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "J", "d", "()J", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$c;", "b", "()Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$c;", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Image;", "e", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/Boolean;", "j", "()Ljava/lang/Boolean;", "f", "getPriceString", "g", "h", "Lcom/avito/android/deep_linking/links/DeepLink;", "i", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getUrlPath", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j implements OkRespDataSuccessElementsItemMessageSegmentsItem {

        @com.google.gson.annotations.c("additionalInfo")
        @l
        private final AttributedText additionalInfo;

        @com.google.gson.annotations.c(AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR)
        @l
        private final c badgeBar;

        @com.google.gson.annotations.c("discountString")
        @l
        private final String discountString;

        @com.google.gson.annotations.c("id")
        private final long id;

        @com.google.gson.annotations.c("imageBySizes")
        @l
        private final Image imageBySizes;

        @com.google.gson.annotations.c("isFavourite")
        @l
        private final Boolean isFavorite;

        @com.google.gson.annotations.c(MessageBody.SystemMessageBody.Platform.Bubble.Item.OLD_PRICE_STRING)
        @l
        private final String oldPriceString;

        @com.google.gson.annotations.c("priceAttributed")
        @l
        private final AttributedText priceAttributed;

        @com.google.gson.annotations.c("priceString")
        @l
        private final String priceString;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        @com.google.gson.annotations.c(MessageBody.SystemMessageBody.Platform.Bubble.Item.URI_PATH)
        @Y61.k
        private final DeepLink uriPath;

        @com.google.gson.annotations.c("urlPath")
        @Y61.k
        private final String urlPath;

        public j(long j12, @l c cVar, @l AttributedText attributedText, @l String str, @l Image image, @l Boolean bool, @l String str2, @l String str3, @l AttributedText attributedText2, @Y61.k String str4, @Y61.k DeepLink deepLink, @Y61.k String str5) {
            this.id = j12;
            this.badgeBar = cVar;
            this.additionalInfo = attributedText;
            this.discountString = str;
            this.imageBySizes = image;
            this.isFavorite = bool;
            this.oldPriceString = str2;
            this.priceString = str3;
            this.priceAttributed = attributedText2;
            this.title = str4;
            this.uriPath = deepLink;
            this.urlPath = str5;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final AttributedText getAdditionalInfo() {
            return this.additionalInfo;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final c getBadgeBar() {
            return this.badgeBar;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getDiscountString() {
            return this.discountString;
        }

        /* renamed from: d, reason: from getter */
        public final long getId() {
            return this.id;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final Image getImageBySizes() {
            return this.imageBySizes;
        }

        @l
        /* renamed from: f, reason: from getter */
        public final String getOldPriceString() {
            return this.oldPriceString;
        }

        @l
        /* renamed from: g, reason: from getter */
        public final AttributedText getPriceAttributed() {
            return this.priceAttributed;
        }

        @Y61.k
        /* renamed from: h, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Y61.k
        /* renamed from: i, reason: from getter */
        public final DeepLink getUriPath() {
            return this.uriPath;
        }

        @l
        /* renamed from: j, reason: from getter */
        public final Boolean getIsFavorite() {
            return this.isFavorite;
        }
    }

    /* compiled from: AssistantChatResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem$k;", "Lcom/avito/android/ai_assistant/model/OkRespDataSuccessElementsItemMessageSegmentsItem;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements OkRespDataSuccessElementsItemMessageSegmentsItem {
        static {
            new k();
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -2049218400;
        }

        @Y61.k
        public final String toString() {
            return "Unknown";
        }
    }
}
