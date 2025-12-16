package com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: PositionInfoBanner.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/model/PositionInfoBanner;", "", "Style", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PositionInfoBanner {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f220414a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f220415b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f220416c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f220417d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final PositionInfoButton f220418e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Style f220419f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PositionInfoBanner.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/model/PositionInfoBanner$Style;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        /* renamed from: b, reason: collision with root package name */
        public static final Style f220420b;

        /* renamed from: c, reason: collision with root package name */
        public static final Style f220421c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Style[] f220422d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a f220423e;

        static {
            Style style = new Style("GREY", 0);
            f220420b = style;
            Style style2 = new Style("BLUE", 1);
            f220421c = style2;
            Style[] styleArr = {style, style2};
            f220422d = styleArr;
            f220423e = c.a(styleArr);
        }

        public Style() {
            throw null;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f220422d.clone();
        }
    }

    public PositionInfoBanner(@k String str, @k String str2, @k String str3, boolean z12, @l PositionInfoButton positionInfoButton, @k Style style) {
        this.f220414a = str;
        this.f220415b = str2;
        this.f220416c = str3;
        this.f220417d = z12;
        this.f220418e = positionInfoButton;
        this.f220419f = style;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PositionInfoBanner)) {
            return false;
        }
        PositionInfoBanner positionInfoBanner = (PositionInfoBanner) obj;
        return L.f(this.f220414a, positionInfoBanner.f220414a) && L.f(this.f220415b, positionInfoBanner.f220415b) && L.f(this.f220416c, positionInfoBanner.f220416c) && this.f220417d == positionInfoBanner.f220417d && L.f(this.f220418e, positionInfoBanner.f220418e) && this.f220419f == positionInfoBanner.f220419f;
    }

    public final int hashCode() {
        int i12 = r.i(H.d(H.d(this.f220414a.hashCode() * 31, 31, this.f220415b), 31, this.f220416c), 31, this.f220417d);
        PositionInfoButton positionInfoButton = this.f220418e;
        return this.f220419f.hashCode() + ((i12 + (positionInfoButton == null ? 0 : positionInfoButton.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "PositionInfoBanner(id=" + this.f220414a + ", title=" + this.f220415b + ", description=" + this.f220416c + ", closable=" + this.f220417d + ", button=" + this.f220418e + ", bannerStyle=" + this.f220419f + ')';
    }
}
