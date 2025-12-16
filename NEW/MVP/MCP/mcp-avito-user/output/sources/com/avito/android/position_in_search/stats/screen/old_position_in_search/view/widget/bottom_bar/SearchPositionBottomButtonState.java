package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar;

import Y41.l;
import Y61.k;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SearchPositionBottomButtonState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/widget/bottom_bar/SearchPositionBottomButtonState;", "", "ButtonStyle", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SearchPositionBottomButtonState {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f221280a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CharSequence f221281b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ButtonStyle f221282c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l<String, G0> f221283d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchPositionBottomButtonState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/widget/bottom_bar/SearchPositionBottomButtonState$ButtonStyle;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ButtonStyle {

        /* renamed from: b, reason: collision with root package name */
        public static final ButtonStyle f221284b;

        /* renamed from: c, reason: collision with root package name */
        public static final ButtonStyle f221285c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ ButtonStyle[] f221286d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f221287e;

        static {
            ButtonStyle buttonStyle = new ButtonStyle("PRIMARY", 0);
            f221284b = buttonStyle;
            ButtonStyle buttonStyle2 = new ButtonStyle("SECONDARY", 1);
            f221285c = buttonStyle2;
            ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2};
            f221286d = buttonStyleArr;
            f221287e = kotlin.enums.c.a(buttonStyleArr);
        }

        public ButtonStyle() {
            throw null;
        }

        public static ButtonStyle valueOf(String str) {
            return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
        }

        public static ButtonStyle[] values() {
            return (ButtonStyle[]) f221286d.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchPositionBottomButtonState(@k String str, @k CharSequence charSequence, @k ButtonStyle buttonStyle, @k l<? super String, G0> lVar) {
        this.f221280a = str;
        this.f221281b = charSequence;
        this.f221282c = buttonStyle;
        this.f221283d = lVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchPositionBottomButtonState)) {
            return false;
        }
        SearchPositionBottomButtonState searchPositionBottomButtonState = (SearchPositionBottomButtonState) obj;
        return L.f(this.f221280a, searchPositionBottomButtonState.f221280a) && L.f(this.f221281b, searchPositionBottomButtonState.f221281b) && this.f221282c == searchPositionBottomButtonState.f221282c && L.f(this.f221283d, searchPositionBottomButtonState.f221283d);
    }

    public final int hashCode() {
        return this.f221283d.hashCode() + ((this.f221282c.hashCode() + com.avito.android.advert.item.delivery_suggests.l.c(this.f221280a.hashCode() * 31, 31, this.f221281b)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchPositionBottomButtonState(buttonId=");
        sb2.append(this.f221280a);
        sb2.append(", title=");
        sb2.append((Object) this.f221281b);
        sb2.append(", style=");
        sb2.append(this.f221282c);
        sb2.append(", onClick=");
        return H.l(sb2, this.f221283d, ')');
    }

    public /* synthetic */ SearchPositionBottomButtonState(String str, String str2, ButtonStyle buttonStyle, l lVar, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) != 0 ? ButtonStyle.f221284b : buttonStyle, lVar);
    }
}
