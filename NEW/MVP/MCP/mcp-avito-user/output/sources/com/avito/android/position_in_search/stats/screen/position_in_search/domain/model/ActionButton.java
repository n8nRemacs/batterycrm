package com.avito.android.position_in_search.stats.screen.position_in_search.domain.model;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: ActionButton.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/domain/model/ActionButton;", "", "Style", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ActionButton {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f221437a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f221438b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Style f221439c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ActionButton.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/domain/model/ActionButton$Style;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        /* renamed from: b, reason: collision with root package name */
        public static final Style f221440b;

        /* renamed from: c, reason: collision with root package name */
        public static final Style f221441c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Style[] f221442d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a f221443e;

        static {
            Style style = new Style("PRIMARY", 0);
            f221440b = style;
            Style style2 = new Style("SECONDARY", 1);
            f221441c = style2;
            Style[] styleArr = {style, style2};
            f221442d = styleArr;
            f221443e = c.a(styleArr);
        }

        public Style() {
            throw null;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f221442d.clone();
        }
    }

    public ActionButton(@k String str, @k DeepLink deepLink, @k Style style) {
        this.f221437a = str;
        this.f221438b = deepLink;
        this.f221439c = style;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionButton)) {
            return false;
        }
        ActionButton actionButton = (ActionButton) obj;
        return L.f(this.f221437a, actionButton.f221437a) && L.f(this.f221438b, actionButton.f221438b) && this.f221439c == actionButton.f221439c;
    }

    public final int hashCode() {
        return this.f221439c.hashCode() + com.avito.android.actions_sheet.a.e(this.f221438b, this.f221437a.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        return "ActionButton(title=" + this.f221437a + ", uri=" + this.f221438b + ", style=" + this.f221439c + ')';
    }
}
