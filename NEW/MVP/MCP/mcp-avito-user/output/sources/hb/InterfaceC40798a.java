package hB;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.extended.UniversalWidget;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetCreateAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LhB/a;", "", "a", "b", "LhB/a$a;", "LhB/a$b;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hB.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC40798a {

    /* compiled from: UniversalWidgetCreateAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LhB/a$a;", "LhB/a;", "<init>", "()V", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hB.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11245a implements InterfaceC40798a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11245a f397092a = new C11245a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11245a);
        }

        public final int hashCode() {
            return 348160501;
        }

        @k
        public final String toString() {
            return "OnCloseClick";
        }
    }

    /* compiled from: UniversalWidgetCreateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LhB/a$b;", "LhB/a;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hB.a$b */
    public static final /* data */ class b implements InterfaceC40798a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UniversalWidget.OrderedSectionType f397093a;

        public b(@k UniversalWidget.OrderedSectionType orderedSectionType) {
            this.f397093a = orderedSectionType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f397093a, ((b) obj).f397093a);
        }

        public final int hashCode() {
            return this.f397093a.hashCode();
        }

        @k
        public final String toString() {
            return "OnSectionClick(sectionType=" + this.f397093a + ')';
        }
    }
}
