package ru.cyberity.cbr.core.theme;

import Y61.k;
import com.adjust.sdk.Constants;
import kotlin.Metadata;
import ru.cyberity.cbr.core.PublicApi;

/* compiled from: CBRTheme.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/theme/CBRThemeMetric;", "", "CardStyle", "Size", "TextAlignment", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@PublicApi
/* loaded from: classes9.dex */
public interface CBRThemeMetric {

    /* compiled from: CBRTheme.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/cyberity/cbr/core/theme/CBRThemeMetric$CardStyle;", "", "Lru/cyberity/cbr/core/theme/CBRThemeMetric;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BORDERED", "PLAIN", "DEFAULT", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @PublicApi
    public enum CardStyle implements CBRThemeMetric {
        BORDERED("bordered"),
        PLAIN("plain"),
        DEFAULT("default");


        @k
        private final String value;

        CardStyle(String str) {
            this.value = str;
        }

        @k
        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: CBRTheme.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/cyberity/cbr/core/theme/CBRThemeMetric$Size;", "", "Lru/cyberity/cbr/core/theme/CBRThemeMetric;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SMALL", "MEDIUM", "LARGE", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @PublicApi
    public enum Size implements CBRThemeMetric {
        SMALL(Constants.SMALL),
        MEDIUM("medium"),
        LARGE(Constants.LARGE);


        @k
        private final String value;

        Size(String str) {
            this.value = str;
        }

        @k
        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: CBRTheme.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/cyberity/cbr/core/theme/CBRThemeMetric$TextAlignment;", "", "Lru/cyberity/cbr/core/theme/CBRThemeMetric;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "LEFT", "CENTER", "RIGHT", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @PublicApi
    public enum TextAlignment implements CBRThemeMetric {
        LEFT("left"),
        CENTER("center"),
        RIGHT("right");


        @k
        private final String value;

        TextAlignment(String str) {
            this.value = str;
        }

        @k
        public final String getValue() {
            return this.value;
        }
    }
}
