package ww;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BigFiltersOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lww/b;", "", "a", "b", "c", "d", "e", "Lww/b$a;", "Lww/b$b;", "Lww/b$c;", "Lww/b$d;", "Lww/b$e;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ww.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC49691b {

    /* compiled from: BigFiltersOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lww/b$a;", "Lww/b;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ww.b$a */
    public static final /* data */ class a implements InterfaceC49691b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f441869a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1138980023;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: BigFiltersOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lww/b$b;", "Lww/b;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ww.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12837b implements InterfaceC49691b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12837b f441870a = new C12837b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12837b);
        }

        public final int hashCode() {
            return 567883754;
        }

        @k
        public final String toString() {
            return "RefreshSearchResultCount";
        }
    }

    /* compiled from: BigFiltersOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lww/b$c;", "Lww/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ww.b$c */
    public static final /* data */ class c implements InterfaceC49691b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SearchParams f441871a;

        public c(@k SearchParams searchParams) {
            this.f441871a = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f441871a, ((c) obj).f441871a);
        }

        public final int hashCode() {
            return this.f441871a.hashCode();
        }

        @k
        public final String toString() {
            return f.m(new StringBuilder("SendScreenResult(searchParams="), this.f441871a, ')');
        }
    }

    /* compiled from: BigFiltersOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lww/b$d;", "Lww/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ww.b$d */
    public static final /* data */ class d implements InterfaceC49691b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SearchParams f441872a;

        public d(@k SearchParams searchParams) {
            this.f441872a = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f441872a, ((d) obj).f441872a);
        }

        public final int hashCode() {
            return this.f441872a.hashCode();
        }

        @k
        public final String toString() {
            return f.m(new StringBuilder("ShowLocationGroupScreen(searchParams="), this.f441872a, ')');
        }
    }

    /* compiled from: BigFiltersOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lww/b$e;", "Lww/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ww.b$e */
    public static final /* data */ class e implements InterfaceC49691b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f441873a;

        public e(boolean z12) {
            this.f441873a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f441873a == ((e) obj).f441873a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f441873a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("UpdateApplyButtonVisibility(isVisible="), this.f441873a, ')');
        }
    }
}
