package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SearchPositionBottomBarState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/widget/bottom_bar/e;", "", "a", "b", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/widget/bottom_bar/e$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/widget/bottom_bar/e$b;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface e {

    /* compiled from: SearchPositionBottomBarState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/widget/bottom_bar/e$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/widget/bottom_bar/e;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f221292a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f221293b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Image f221294c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final SearchPositionBottomButtonState f221295d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final SearchPositionBottomButtonState f221296e;

        public a(@k PrintableText printableText, @k PrintableText printableText2, @l Image image, @l SearchPositionBottomButtonState searchPositionBottomButtonState, @l SearchPositionBottomButtonState searchPositionBottomButtonState2) {
            this.f221292a = printableText;
            this.f221293b = printableText2;
            this.f221294c = image;
            this.f221295d = searchPositionBottomButtonState;
            this.f221296e = searchPositionBottomButtonState2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f221292a, aVar.f221292a) && L.f(this.f221293b, aVar.f221293b) && L.f(this.f221294c, aVar.f221294c) && L.f(this.f221295d, aVar.f221295d) && L.f(this.f221296e, aVar.f221296e);
        }

        public final int hashCode() {
            int iF2 = com.avito.android.actions_sheet.a.f(this.f221293b, this.f221292a.hashCode() * 31, 31);
            Image image = this.f221294c;
            int iHashCode = (iF2 + (image == null ? 0 : image.hashCode())) * 31;
            SearchPositionBottomButtonState searchPositionBottomButtonState = this.f221295d;
            int iHashCode2 = (iHashCode + (searchPositionBottomButtonState == null ? 0 : searchPositionBottomButtonState.hashCode())) * 31;
            SearchPositionBottomButtonState searchPositionBottomButtonState2 = this.f221296e;
            return iHashCode2 + (searchPositionBottomButtonState2 != null ? searchPositionBottomButtonState2.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Content(advertPrice=" + this.f221292a + ", advertTitle=" + this.f221293b + ", advertImage=" + this.f221294c + ", leftButton=" + this.f221295d + ", rightButton=" + this.f221296e + ')';
        }
    }

    /* compiled from: SearchPositionBottomBarState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/widget/bottom_bar/e$b;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/widget/bottom_bar/e;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f221297a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -484652696;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }
}
