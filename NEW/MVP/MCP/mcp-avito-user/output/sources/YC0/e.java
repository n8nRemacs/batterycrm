package yc0;

import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.carousel.ExtendedSettingsCarouselItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSettingsAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lyc0/e;", "Lyc0/D;", "a", "b", "c", "d", "e", "f", "Lyc0/e$a;", "Lyc0/e$b;", "Lyc0/e$c;", "Lyc0/e$d;", "Lyc0/e$e;", "Lyc0/e$f;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface e extends D {

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/e$a;", "Lyc0/e;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ExtendedSettingsCarouselItem f443243a;

        public a(@Y61.k ExtendedSettingsCarouselItem extendedSettingsCarouselItem) {
            this.f443243a = extendedSettingsCarouselItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f443243a, ((a) obj).f443243a);
        }

        public final int hashCode() {
            return this.f443243a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "CarouselWidgetCreateButtonClick(item=" + this.f443243a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/e$b;", "Lyc0/e;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ExtendedSettingsCarouselItem f443244a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f443245b;

        public b(@Y61.k ExtendedSettingsCarouselItem extendedSettingsCarouselItem, boolean z12) {
            this.f443244a = extendedSettingsCarouselItem;
            this.f443245b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f443244a, bVar.f443244a) && this.f443245b == bVar.f443245b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f443245b) + (this.f443244a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CarouselWidgetEnableSwitcherChange(item=");
            sb2.append(this.f443244a);
            sb2.append(", isChecked=");
            return androidx.appcompat.app.r.x(sb2, this.f443245b, ')');
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/e$c;", "Lyc0/e;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ExtendedSettingsCarouselItem f443246a;

        public c(@Y61.k ExtendedSettingsCarouselItem extendedSettingsCarouselItem) {
            this.f443246a = extendedSettingsCarouselItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f443246a, ((c) obj).f443246a);
        }

        public final int hashCode() {
            return this.f443246a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "CarouselWidgetMoreButtonClick(item=" + this.f443246a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/e$d;", "Lyc0/e;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ExtendedSettingsCarouselItem f443247a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Parcelable f443248b;

        public d(@Y61.k ExtendedSettingsCarouselItem extendedSettingsCarouselItem, @Y61.k Parcelable parcelable) {
            this.f443247a = extendedSettingsCarouselItem;
            this.f443248b = parcelable;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f443247a, dVar.f443247a) && L.f(this.f443248b, dVar.f443248b);
        }

        public final int hashCode() {
            return this.f443248b.hashCode() + (this.f443247a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CarouselWidgetScrollStateChange(item=");
            sb2.append(this.f443247a);
            sb2.append(", scrollState=");
            return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.f443248b, ')');
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/e$e;", "Lyc0/e;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yc0.e$e, reason: collision with other inner class name */
    public static final /* data */ class C12911e implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ExtendedSettingsCarouselItem f443249a;

        public C12911e(@Y61.k ExtendedSettingsCarouselItem extendedSettingsCarouselItem) {
            this.f443249a = extendedSettingsCarouselItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12911e) && L.f(this.f443249a, ((C12911e) obj).f443249a);
        }

        public final int hashCode() {
            return this.f443249a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnCarouselShown(item=" + this.f443249a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/e$f;", "Lyc0/e;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ExtendedSettingsCarouselItem f443250a;

        public f(@Y61.k ExtendedSettingsCarouselItem extendedSettingsCarouselItem) {
            this.f443250a = extendedSettingsCarouselItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f443250a, ((f) obj).f443250a);
        }

        public final int hashCode() {
            return this.f443250a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenCarouselEditor(item=" + this.f443250a + ')';
        }
    }
}
