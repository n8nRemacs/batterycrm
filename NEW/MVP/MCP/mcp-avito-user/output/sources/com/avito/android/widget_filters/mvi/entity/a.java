package com.avito.android.widget_filters.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import j.InterfaceC42150f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/a;", "", "a", "b", "c", "d", "e", "Lcom/avito/android/widget_filters/mvi/entity/a$b;", "Lcom/avito/android/widget_filters/mvi/entity/a$c;", "Lcom/avito/android/widget_filters/mvi/entity/a$d;", "Lcom/avito/android/widget_filters/mvi/entity/a$e;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C10252a f330076a = C10252a.f330077a;

    /* compiled from: WidgetFiltersState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/a$a;", "", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.widget_filters.mvi.entity.a$a, reason: collision with other inner class name */
    public static final class C10252a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C10252a f330077a = new C10252a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final e f330078b = new e(LoadingType.f329980b);
    }

    /* compiled from: WidgetFiltersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/a$b;", "Lcom/avito/android/widget_filters/mvi/entity/a;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f330079b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<com.avito.conveyor_item.a> f330080c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z12, @k List<? extends com.avito.conveyor_item.a> list) {
            this.f330079b = z12;
            this.f330080c = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f330079b == bVar.f330079b && L.f(this.f330080c, bVar.f330080c);
        }

        public final int hashCode() {
            return this.f330080c.hashCode() + (Boolean.hashCode(this.f330079b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(isScrollEnabled=");
            sb2.append(this.f330079b);
            sb2.append(", items=");
            return H.p(sb2, this.f330080c, ')');
        }
    }

    /* compiled from: WidgetFiltersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/a$c;", "Lcom/avito/android/widget_filters/mvi/entity/a;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f330081b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f330082c;

        public c(@k PrintableText printableText, @k PrintableText printableText2) {
            this.f330081b = printableText;
            this.f330082c = printableText2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            return this.f330081b.equals(cVar.f330081b) && this.f330082c.equals(cVar.f330082c);
        }

        public final int hashCode() {
            return this.f330082c.hashCode() + com.avito.android.actions_sheet.a.f(this.f330081b, Integer.hashCode(R.attr.img_unknownError) * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Empty(image=2130972595, title=");
            sb2.append(this.f330081b);
            sb2.append(", subtitle=");
            return AK.c.m(sb2, this.f330082c, ')');
        }
    }

    /* compiled from: WidgetFiltersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/a$d;", "Lcom/avito/android/widget_filters/mvi/entity/a;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: b, reason: collision with root package name */
        public final int f330083b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f330084c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final PrintableText f330085d;

        public d(@InterfaceC42150f int i12, @k PrintableText printableText, @k PrintableText printableText2) {
            this.f330083b = i12;
            this.f330084c = printableText;
            this.f330085d = printableText2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f330083b == dVar.f330083b && this.f330084c.equals(dVar.f330084c) && this.f330085d.equals(dVar.f330085d);
        }

        public final int hashCode() {
            return this.f330085d.hashCode() + com.avito.android.actions_sheet.a.f(this.f330084c, Integer.hashCode(this.f330083b) * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(image=");
            sb2.append(this.f330083b);
            sb2.append(", title=");
            sb2.append(this.f330084c);
            sb2.append(", subtitle=");
            return AK.c.m(sb2, this.f330085d, ')');
        }
    }

    /* compiled from: WidgetFiltersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/a$e;", "Lcom/avito/android/widget_filters/mvi/entity/a;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LoadingType f330086b;

        public e(@k LoadingType loadingType) {
            this.f330086b = loadingType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f330086b == ((e) obj).f330086b;
        }

        public final int hashCode() {
            return this.f330086b.hashCode();
        }

        @k
        public final String toString() {
            return "Loading(loadingType=" + this.f330086b + ')';
        }
    }
}
