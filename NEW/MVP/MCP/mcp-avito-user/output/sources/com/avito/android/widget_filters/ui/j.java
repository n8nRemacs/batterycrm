package com.avito.android.widget_filters.ui;

import Y61.l;
import androidx.appcompat.app.r;
import j.U;
import kotlin.Metadata;

/* compiled from: WidgetFiltersTooltipHelper.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/widget_filters/ui/j;", "", "a", "b", "Lcom/avito/android/widget_filters/ui/j$a;", "Lcom/avito/android/widget_filters/ui/j$b;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface j {

    /* compiled from: WidgetFiltersTooltipHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/ui/j$a;", "Lcom/avito/android/widget_filters/ui/j;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements j {

        /* renamed from: a, reason: collision with root package name */
        public final int f330539a;

        public a(@U int i12) {
            this.f330539a = i12;
        }

        @Override // com.avito.android.widget_filters.ui.j
        public final boolean a() {
            return true;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            return this.f330539a == aVar.f330539a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f330539a) + (Boolean.hashCode(true) * 31);
        }

        @Y61.k
        public final String toString() {
            return r.t(new StringBuilder("Bottom(centerLayout=true, verticalOffset="), this.f330539a, ')');
        }
    }

    /* compiled from: WidgetFiltersTooltipHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/ui/j$b;", "Lcom/avito/android/widget_filters/ui/j;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements j {

        /* renamed from: a, reason: collision with root package name */
        public final int f330540a;

        public b(@U int i12) {
            this.f330540a = i12;
        }

        @Override // com.avito.android.widget_filters.ui.j
        public final boolean a() {
            return false;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            bVar.getClass();
            return this.f330540a == bVar.f330540a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f330540a) + (Boolean.hashCode(false) * 31);
        }

        @Y61.k
        public final String toString() {
            return r.t(new StringBuilder("Top(centerLayout=false, horizontalOffset="), this.f330540a, ')');
        }
    }

    boolean a();
}
