package iB;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.component.accordion.s;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel;
import j.InterfaceC42165v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SectionSettings.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LiB/a;", "", "a", "b", "c", "d", "e", "LiB/a$a;", "LiB/a$c;", "LiB/a$d;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iB.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC41263a {

    /* compiled from: SectionSettings.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"LiB/a$a;", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$a;", "T", "LiB/a;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iB.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11369a<T extends UniversalWidgetSectionModel.a> implements InterfaceC41263a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<b<T>> f398418a;

        /* renamed from: b, reason: collision with root package name */
        public final int f398419b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f398420c;

        public C11369a(int i12, @k String str, @k List list) {
            this.f398418a = list;
            this.f398419b = i12;
            this.f398420c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11369a)) {
                return false;
            }
            C11369a c11369a = (C11369a) obj;
            return L.f(this.f398418a, c11369a.f398418a) && this.f398419b == c11369a.f398419b && L.f(this.f398420c, c11369a.f398420c);
        }

        public final int hashCode() {
            return this.f398420c.hashCode() + r.e(this.f398419b, this.f398418a.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BottomSheetSelector(variants=");
            sb2.append(this.f398418a);
            sb2.append(", selected=");
            sb2.append(this.f398419b);
            sb2.append(", dialogTitle=");
            return C22026a.c(sb2, this.f398420c, ')');
        }
    }

    /* compiled from: SectionSettings.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"LiB/a$b;", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$a;", "T", "", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iB.a$b */
    public static final /* data */ class b<T extends UniversalWidgetSectionModel.a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UniversalWidgetSectionModel.TextTitlePosition f398421a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f398422b;

        /* renamed from: c, reason: collision with root package name */
        public final int f398423c;

        public b(@k UniversalWidgetSectionModel.TextTitlePosition textTitlePosition, @k String str, @InterfaceC42165v int i12) {
            this.f398421a = textTitlePosition;
            this.f398422b = str;
            this.f398423c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f398421a.equals(bVar.f398421a) && L.f(this.f398422b, bVar.f398422b) && this.f398423c == bVar.f398423c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f398423c) + H.d(this.f398421a.hashCode() * 31, 31, this.f398422b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BottomSheetSelectorVariant(value=");
            sb2.append(this.f398421a);
            sb2.append(", name=");
            sb2.append(this.f398422b);
            sb2.append(", icon=");
            return r.t(sb2, this.f398423c, ')');
        }
    }

    /* compiled from: SectionSettings.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LiB/a$c;", "LiB/a;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iB.a$c */
    public static final /* data */ class c implements InterfaceC41263a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f398424a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f398425b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f398426c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f398427d;

        public c(@k String str, @k String str2, @l Integer num, @l String str3) {
            this.f398424a = str;
            this.f398425b = str2;
            this.f398426c = num;
            this.f398427d = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f398424a, cVar.f398424a) && L.f(this.f398425b, cVar.f398425b) && L.f(this.f398426c, cVar.f398426c) && L.f(this.f398427d, cVar.f398427d);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f398424a.hashCode() * 31, 31, this.f398425b);
            Integer num = this.f398426c;
            int iHashCode = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f398427d;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SectionNameInput(text=");
            sb2.append(this.f398424a);
            sb2.append(", hint=");
            sb2.append(this.f398425b);
            sb2.append(", maxLength=");
            sb2.append(this.f398426c);
            sb2.append(", error=");
            return C22026a.c(sb2, this.f398427d, ')');
        }
    }

    /* compiled from: SectionSettings.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"LiB/a$d;", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$a;", "T", "LiB/a;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iB.a$d */
    public static final /* data */ class d<T extends UniversalWidgetSectionModel.a> implements InterfaceC41263a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<e<T>> f398428a;

        /* renamed from: b, reason: collision with root package name */
        public final int f398429b;

        public d(@k List<e<T>> list, int i12) {
            this.f398428a = list;
            this.f398429b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f398428a, dVar.f398428a) && this.f398429b == dVar.f398429b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f398429b) + (this.f398428a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Selector(variants=");
            sb2.append(this.f398428a);
            sb2.append(", selected=");
            return r.t(sb2, this.f398429b, ')');
        }
    }

    /* compiled from: SectionSettings.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"LiB/a$e;", "Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetSectionModel$a;", "T", "", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iB.a$e */
    public static final /* data */ class e<T extends UniversalWidgetSectionModel.a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final T f398430a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f398431b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f398432c;

        public e(@k T t12, @k String str, @InterfaceC42165v @l Integer num) {
            this.f398430a = t12;
            this.f398431b = str;
            this.f398432c = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f398430a, eVar.f398430a) && L.f(this.f398431b, eVar.f398431b) && L.f(this.f398432c, eVar.f398432c);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f398430a.hashCode() * 31, 31, this.f398431b);
            Integer num = this.f398432c;
            return iD2 + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectorVariant(value=");
            sb2.append(this.f398430a);
            sb2.append(", name=");
            sb2.append(this.f398431b);
            sb2.append(", image=");
            return s.j(sb2, this.f398432c, ')');
        }

        public /* synthetic */ e(UniversalWidgetSectionModel.a aVar, String str, Integer num, int i12, C42822w c42822w) {
            this(aVar, str, (i12 & 4) != 0 ? null : num);
        }
    }
}
