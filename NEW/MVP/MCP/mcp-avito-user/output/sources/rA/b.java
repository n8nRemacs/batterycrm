package RA;

import RA.a;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.extended_profile_selection_create.name.ExtendedProfileSetSelectionNameConfig;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.search.filter.FilterAnalyticsData;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSelectionCreateOneTimeEvent.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LRA/b;", "", "a", "b", "c", "d", "e", "f", "LRA/b$a;", "LRA/b$b;", "LRA/b$c;", "LRA/b$d;", "LRA/b$e;", "LRA/b$f;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: ExtendedProfileSelectionCreateOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRA/b$a;", "LRA/b;", "<init>", "()V", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f14179a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -693327090;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRA/b$b;", "LRA/b;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: RA.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0944b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SearchParams f14180a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f14181b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final FilterAnalyticsData f14182c;

        public C0944b(@k SearchParams searchParams, @l String str, @k FilterAnalyticsData filterAnalyticsData) {
            this.f14180a = searchParams;
            this.f14181b = str;
            this.f14182c = filterAnalyticsData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0944b)) {
                return false;
            }
            C0944b c0944b = (C0944b) obj;
            return L.f(this.f14180a, c0944b.f14180a) && L.f(this.f14181b, c0944b.f14181b) && L.f(this.f14182c, c0944b.f14182c);
        }

        public final int hashCode() {
            int iHashCode = this.f14180a.hashCode() * 31;
            String str = this.f14181b;
            return this.f14182c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            return "OpenFiltersScreen(searchParams=" + this.f14180a + ", infoModelForm=" + this.f14181b + ", analyticsParams=" + this.f14182c + ')';
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRA/b$c;", "LRA/b;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ExtendedProfileSetSelectionNameConfig f14183a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f14184b;

        public c(@k ExtendedProfileSetSelectionNameConfig extendedProfileSetSelectionNameConfig, boolean z12) {
            this.f14183a = extendedProfileSetSelectionNameConfig;
            this.f14184b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f14183a, cVar.f14183a) && this.f14184b == cVar.f14184b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f14184b) + (this.f14183a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenSetSelectionNameScreen(config=");
            sb2.append(this.f14183a);
            sb2.append(", isSelectionCreated=");
            return r.x(sb2, this.f14184b, ')');
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRA/b$d;", "LRA/b;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "OpenShare(shareLink=null)";
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRA/b$e;", "LRA/b;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f14185a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final a.i f14186b;

        public e(@k Throwable th2, @l a.i iVar) {
            this.f14185a = th2;
            this.f14186b = iVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f14185a, eVar.f14185a) && L.f(this.f14186b, eVar.f14186b);
        }

        public final int hashCode() {
            int iHashCode = this.f14185a.hashCode() * 31;
            a.i iVar = this.f14186b;
            return iHashCode + (iVar == null ? 0 : iVar.hashCode());
        }

        @k
        public final String toString() {
            return "ShowCommonErrorToastBar(throwable=" + this.f14185a + ", reloadAction=" + this.f14186b + ')';
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRA/b$f;", "LRA/b;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f14187a;

        public f(@k String str) {
            this.f14187a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f14187a, ((f) obj).f14187a);
        }

        public final int hashCode() {
            return this.f14187a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorToastBar(message="), this.f14187a, ')');
        }
    }
}
