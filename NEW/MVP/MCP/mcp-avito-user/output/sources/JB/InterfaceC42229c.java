package jB;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetEditBlockArguments;
import iB.InterfaceC41263a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetEditOneTimeEvent.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LjB/c;", "", "a", "b", "c", "d", "e", "f", "LjB/c$a;", "LjB/c$b;", "LjB/c$c;", "LjB/c$d;", "LjB/c$e;", "LjB/c$f;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jB.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC42229c {

    /* compiled from: UniversalWidgetEditOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjB/c$a;", "LjB/c;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.c$a */
    public static final /* data */ class a implements InterfaceC42229c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InterfaceC41263a.C11369a<?> f405495a;

        public a(@k InterfaceC41263a.C11369a<?> c11369a) {
            this.f405495a = c11369a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f405495a, ((a) obj).f405495a);
        }

        public final int hashCode() {
            return this.f405495a.hashCode();
        }

        @k
        public final String toString() {
            return "ApplyBottomSheetSelectorVariant(selector=" + this.f405495a + ')';
        }
    }

    /* compiled from: UniversalWidgetEditOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjB/c$b;", "LjB/c;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.c$b */
    public static final /* data */ class b implements InterfaceC42229c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f405496a;

        public b(boolean z12) {
            this.f405496a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f405496a == ((b) obj).f405496a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f405496a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("CloseWithResult(success="), this.f405496a, ')');
        }
    }

    /* compiled from: UniversalWidgetEditOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjB/c$c;", "LjB/c;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.c$c, reason: collision with other inner class name */
    public static final /* data */ class C11552c implements InterfaceC42229c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UniversalWidgetEditBlockArguments f405497a;

        public C11552c(@k UniversalWidgetEditBlockArguments universalWidgetEditBlockArguments) {
            this.f405497a = universalWidgetEditBlockArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11552c) && L.f(this.f405497a, ((C11552c) obj).f405497a);
        }

        public final int hashCode() {
            return this.f405497a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenBlockEditor(args=" + this.f405497a + ')';
        }
    }

    /* compiled from: UniversalWidgetEditOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LjB/c$d;", "LjB/c;", "<init>", "()V", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.c$d */
    public static final /* data */ class d implements InterfaceC42229c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f405498a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -671618024;
        }

        @k
        public final String toString() {
            return "ScrollToTop";
        }
    }

    /* compiled from: UniversalWidgetEditOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjB/c$e;", "LjB/c;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.c$e */
    public static final /* data */ class e implements InterfaceC42229c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f405499a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC42227a f405500b;

        public e(@k Throwable th2, @k InterfaceC42227a interfaceC42227a) {
            this.f405499a = th2;
            this.f405500b = interfaceC42227a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f405499a, eVar.f405499a) && L.f(this.f405500b, eVar.f405500b);
        }

        public final int hashCode() {
            return this.f405500b.hashCode() + (this.f405499a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowCommonErrorToastBar(throwable=" + this.f405499a + ", buttonAction=" + this.f405500b + ')';
        }
    }

    /* compiled from: UniversalWidgetEditOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjB/c$f;", "LjB/c;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jB.c$f */
    public static final /* data */ class f implements InterfaceC42229c {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            ((f) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ShowErrorToastBar(message=null)";
        }
    }
}
