package Bh;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BblConfigureV4Action.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LBh/a;", "", "a", "b", "c", "d", "e", "LBh/a$a;", "LBh/a$b;", "LBh/a$c;", "LBh/a$d;", "LBh/a$e;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Bh.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC13146a {

    /* compiled from: BblConfigureV4Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBh/a$a;", "LBh/a;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bh.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0066a implements InterfaceC13146a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f1590a;

        public C0066a(@l DeepLink deepLink) {
            this.f1590a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0066a) && L.f(this.f1590a, ((C0066a) obj).f1590a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f1590a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnButtonClicked(deepLink="), this.f1590a, ')');
        }
    }

    /* compiled from: BblConfigureV4Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBh/a$b;", "LBh/a;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bh.a$b */
    public static final /* data */ class b implements InterfaceC13146a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f1591a;

        public b(boolean z12) {
            this.f1591a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f1591a == ((b) obj).f1591a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f1591a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("OnDeeplinkLoadingStateChanged(isLoading="), this.f1591a, ')');
        }
    }

    /* compiled from: BblConfigureV4Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBh/a$c;", "LBh/a;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bh.a$c */
    public static final /* data */ class c implements InterfaceC13146a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f1592a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -2022781176;
        }

        @k
        public final String toString() {
            return "OnNavBarIconClicked";
        }
    }

    /* compiled from: BblConfigureV4Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBh/a$d;", "LBh/a;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bh.a$d */
    public static final /* data */ class d implements InterfaceC13146a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f1593a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -731744157;
        }

        @k
        public final String toString() {
            return "OnRetryButtonClicked";
        }
    }

    /* compiled from: BblConfigureV4Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBh/a$e;", "LBh/a;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bh.a$e */
    public static final /* data */ class e implements InterfaceC13146a {

        /* renamed from: a, reason: collision with root package name */
        public final int f1594a;

        public e(int i12) {
            this.f1594a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f1594a == ((e) obj).f1594a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f1594a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OnSelectorCardClicked(index="), this.f1594a, ')');
        }
    }
}
