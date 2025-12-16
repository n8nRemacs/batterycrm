package com.avito.android.shortcut_navigation_bar;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OnboardingData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/i;", "", "a", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.shortcut_navigation_bar.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C34992i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Integer f283412a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f283413b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f283414c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f283415d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f283416e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final a f283417f;

    /* compiled from: OnboardingData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/i$a;", "", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.shortcut_navigation_bar.i$a */
    public static final /* data */ class a {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(null, null);
        }

        public final int hashCode() {
            return 0;
        }

        @Y61.k
        public final String toString() {
            return "OnTapAction(deeplink=null, nextOnboardingId=null)";
        }
    }

    public C34992i() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34992i)) {
            return false;
        }
        C34992i c34992i = (C34992i) obj;
        return kotlin.jvm.internal.L.f(this.f283412a, c34992i.f283412a) && kotlin.jvm.internal.L.f(this.f283413b, c34992i.f283413b) && kotlin.jvm.internal.L.f(this.f283414c, c34992i.f283414c) && kotlin.jvm.internal.L.f(this.f283415d, c34992i.f283415d) && kotlin.jvm.internal.L.f(this.f283416e, c34992i.f283416e) && kotlin.jvm.internal.L.f(this.f283417f, c34992i.f283417f);
    }

    public final int hashCode() {
        Integer num = this.f283412a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f283413b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f283414c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f283415d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f283416e;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        a aVar = this.f283417f;
        if (aVar != null) {
            aVar.getClass();
        }
        return iHashCode5;
    }

    @Y61.k
    public final String toString() {
        return "OnboardingData(priority=" + this.f283412a + ", title=" + this.f283413b + ", text=" + this.f283414c + ", buttonTitle=" + this.f283415d + ", onceShowId=" + this.f283416e + ", onTapAction=" + this.f283417f + ')';
    }

    public C34992i(Integer num, String str, String str2, String str3, String str4, a aVar, int i12, C42822w c42822w) {
        num = (i12 & 1) != 0 ? null : num;
        str = (i12 & 2) != 0 ? null : str;
        str2 = (i12 & 4) != 0 ? null : str2;
        str3 = (i12 & 8) != 0 ? null : str3;
        str4 = (i12 & 16) != 0 ? null : str4;
        aVar = (i12 & 32) != 0 ? null : aVar;
        this.f283412a = num;
        this.f283413b = str;
        this.f283414c = str2;
        this.f283415d = str3;
        this.f283416e = str4;
        this.f283417f = aVar;
    }
}
