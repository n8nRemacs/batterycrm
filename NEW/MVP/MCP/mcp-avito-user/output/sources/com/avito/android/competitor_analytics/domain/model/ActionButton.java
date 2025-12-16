package com.avito.android.competitor_analytics.domain.model;

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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/competitor_analytics/domain/model/ActionButton;", "", "Style", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ActionButton {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f124315a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f124316b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Style f124317c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ActionButton.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/domain/model/ActionButton$Style;", "", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        /* renamed from: b, reason: collision with root package name */
        public static final Style f124318b;

        /* renamed from: c, reason: collision with root package name */
        public static final Style f124319c;

        /* renamed from: d, reason: collision with root package name */
        public static final Style f124320d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Style[] f124321e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ a f124322f;

        static {
            Style style = new Style("PRIMARY", 0);
            f124318b = style;
            Style style2 = new Style("SECONDARY", 1);
            f124319c = style2;
            Style style3 = new Style("OVERLAY", 2);
            f124320d = style3;
            Style[] styleArr = {style, style2, style3};
            f124321e = styleArr;
            f124322f = c.a(styleArr);
        }

        public Style() {
            throw null;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f124321e.clone();
        }
    }

    public ActionButton(@k String str, @k DeepLink deepLink, @k Style style) {
        this.f124315a = str;
        this.f124316b = deepLink;
        this.f124317c = style;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionButton)) {
            return false;
        }
        ActionButton actionButton = (ActionButton) obj;
        return L.f(this.f124315a, actionButton.f124315a) && L.f(this.f124316b, actionButton.f124316b) && this.f124317c == actionButton.f124317c;
    }

    public final int hashCode() {
        return this.f124317c.hashCode() + com.avito.android.actions_sheet.a.e(this.f124316b, this.f124315a.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        return "ActionButton(title=" + this.f124315a + ", uri=" + this.f124316b + ", style=" + this.f124317c + ')';
    }
}
