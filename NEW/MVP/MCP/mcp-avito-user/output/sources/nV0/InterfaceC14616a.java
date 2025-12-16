package Nv0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.remote.model.Location;
import com.avito.android.replace_main.toggle.d;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SettingsAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LNv0/a;", "", "a", "b", "c", "d", "e", "f", "g", "LNv0/a$a;", "LNv0/a$b;", "LNv0/a$c;", "LNv0/a$d;", "LNv0/a$e;", "LNv0/a$f;", "LNv0/a$g;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Nv0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC14616a {

    /* compiled from: SettingsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNv0/a$a;", "LNv0/a;", "<init>", "()V", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0770a implements InterfaceC14616a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0770a f11810a = new C0770a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0770a);
        }

        public final int hashCode() {
            return -1989225908;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: SettingsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNv0/a$b;", "LNv0/a;", "<init>", "()V", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.a$b */
    public static final /* data */ class b implements InterfaceC14616a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f11811a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1086174280;
        }

        @k
        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: SettingsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNv0/a$c;", "LNv0/a;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.a$c */
    public static final /* data */ class c implements InterfaceC14616a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f11812a;

        public c(@k String str) {
            this.f11812a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f11812a, ((c) obj).f11812a);
        }

        public final int hashCode() {
            return this.f11812a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ItemClickAction(stringId="), this.f11812a, ')');
        }
    }

    /* compiled from: SettingsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNv0/a$d;", "LNv0/a;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.a$d */
    public static final /* data */ class d implements InterfaceC14616a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Location f11813a;

        public d(@l Location location) {
            this.f11813a = location;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f11813a, ((d) obj).f11813a);
        }

        public final int hashCode() {
            Location location = this.f11813a;
            if (location == null) {
                return 0;
            }
            return location.hashCode();
        }

        @k
        public final String toString() {
            return "OnLocationSelected(location=" + this.f11813a + ')';
        }
    }

    /* compiled from: SettingsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNv0/a$e;", "LNv0/a;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.a$e */
    public static final /* data */ class e implements InterfaceC14616a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BottomNavigationSpace f11814a;

        public e(@k BottomNavigationSpace bottomNavigationSpace) {
            this.f11814a = bottomNavigationSpace;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f11814a == ((e) obj).f11814a;
        }

        public final int hashCode() {
            return this.f11814a.hashCode();
        }

        @k
        public final String toString() {
            return "OnReplaceMainStartSpaceSelected(bottomNavigationSpace=" + this.f11814a + ')';
        }
    }

    /* compiled from: SettingsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNv0/a$f;", "LNv0/a;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.a$f */
    public static final /* data */ class f implements InterfaceC14616a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final d.c f11815a;

        public f(@k d.c cVar) {
            this.f11815a = cVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f11815a, ((f) obj).f11815a);
        }

        public final int hashCode() {
            return this.f11815a.hashCode();
        }

        @k
        public final String toString() {
            return "ReplaceMainSuccessToastClicked(toast=" + this.f11815a + ')';
        }
    }

    /* compiled from: SettingsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNv0/a$g;", "LNv0/a;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nv0.a$g */
    public static final /* data */ class g implements InterfaceC14616a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final d.c f11816a;

        public g(@k d.c cVar) {
            this.f11816a = cVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f11816a, ((g) obj).f11816a);
        }

        public final int hashCode() {
            return this.f11816a.hashCode();
        }

        @k
        public final String toString() {
            return "ReplaceMainSuccessToastShown(toast=" + this.f11816a + ')';
        }
    }
}
