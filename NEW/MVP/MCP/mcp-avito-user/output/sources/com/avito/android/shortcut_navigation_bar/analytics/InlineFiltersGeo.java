package com.avito.android.shortcut_navigation_bar.analytics;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InlineFiltersGeo.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/analytics/InlineFiltersGeo;", "", "FromPage", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InlineFiltersGeo {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f283362a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final FromPage f283363b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InlineFiltersGeo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/analytics/InlineFiltersGeo$FromPage;", "", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FromPage {

        /* renamed from: b, reason: collision with root package name */
        public static final FromPage f283364b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ FromPage[] f283365c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a f283366d;

        static {
            FromPage fromPage = new FromPage();
            f283364b = fromPage;
            FromPage[] fromPageArr = {fromPage};
            f283365c = fromPageArr;
            f283366d = c.a(fromPageArr);
        }

        public static FromPage valueOf(String str) {
            return (FromPage) Enum.valueOf(FromPage.class, str);
        }

        public static FromPage[] values() {
            return (FromPage[]) f283365c.clone();
        }
    }

    public InlineFiltersGeo(@k String str, @l FromPage fromPage) {
        this.f283362a = str;
        this.f283363b = fromPage;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InlineFiltersGeo)) {
            return false;
        }
        InlineFiltersGeo inlineFiltersGeo = (InlineFiltersGeo) obj;
        return L.f(this.f283362a, inlineFiltersGeo.f283362a) && this.f283363b == inlineFiltersGeo.f283363b;
    }

    public final int hashCode() {
        int iHashCode = this.f283362a.hashCode() * 31;
        FromPage fromPage = this.f283363b;
        return iHashCode + (fromPage == null ? 0 : fromPage.hashCode());
    }

    @k
    public final String toString() {
        return "InlineFiltersGeo(filterId=" + this.f283362a + ", fromPage=" + this.f283363b + ')';
    }

    public /* synthetic */ InlineFiltersGeo(String str, FromPage fromPage, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : fromPage);
    }
}
