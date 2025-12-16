package com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: PositionInfoButton.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/model/PositionInfoButton;", "", "Style", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PositionInfoButton {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f220424a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f220425b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Style f220426c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PositionInfoButton.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/model/PositionInfoButton$Style;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        /* renamed from: b, reason: collision with root package name */
        public static final Style f220427b;

        /* renamed from: c, reason: collision with root package name */
        public static final Style f220428c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Style[] f220429d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a f220430e;

        static {
            Style style = new Style("PRIMARY", 0);
            f220427b = style;
            Style style2 = new Style("SECONDARY", 1);
            f220428c = style2;
            Style[] styleArr = {style, style2};
            f220429d = styleArr;
            f220430e = c.a(styleArr);
        }

        public Style() {
            throw null;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f220429d.clone();
        }
    }

    public PositionInfoButton(@k String str, @k DeepLink deepLink, @k Style style) {
        this.f220424a = str;
        this.f220425b = deepLink;
        this.f220426c = style;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PositionInfoButton)) {
            return false;
        }
        PositionInfoButton positionInfoButton = (PositionInfoButton) obj;
        return L.f(this.f220424a, positionInfoButton.f220424a) && L.f(this.f220425b, positionInfoButton.f220425b) && this.f220426c == positionInfoButton.f220426c;
    }

    public final int hashCode() {
        return this.f220426c.hashCode() + com.avito.android.actions_sheet.a.e(this.f220425b, this.f220424a.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        return "PositionInfoButton(title=" + this.f220424a + ", deepLink=" + this.f220425b + ", style=" + this.f220426c + ')';
    }
}
