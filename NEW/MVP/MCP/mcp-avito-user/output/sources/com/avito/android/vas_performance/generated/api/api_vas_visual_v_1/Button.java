package com.avito.android.vas_performance.generated.api.api_vas_visual_v_1;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ApiVasVisualV1Response.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/vas_performance/generated/api/api_vas_visual_v_1/Button;", "", "Lcom/avito/android/vas_performance/generated/api/api_vas_visual_v_1/Button$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "title", "<init>", "(Lcom/avito/android/vas_performance/generated/api/api_vas_visual_v_1/Button$Style;Ljava/lang/String;)V", "Lcom/avito/android/vas_performance/generated/api/api_vas_visual_v_1/Button$Style;", "a", "()Lcom/avito/android/vas_performance/generated/api/api_vas_visual_v_1/Button$Style;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Style", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Button {

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @k
    private final Style style;

    @c("title")
    @k
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiVasVisualV1Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/vas_performance/generated/api/api_vas_visual_v_1/Button$Style;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Primary", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        @c("primary")
        public static final Style Primary;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Style[] f320215b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f320216c;

        static {
            Style style = new Style("Primary", 0, "primary");
            Primary = style;
            Style[] styleArr = {style};
            f320215b = styleArr;
            f320216c = kotlin.enums.c.a(styleArr);
        }

        private Style(String str, int i12, String str2) {
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f320215b.clone();
        }
    }

    public Button(@k Style style, @k String str) {
        this.style = style;
        this.title = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
