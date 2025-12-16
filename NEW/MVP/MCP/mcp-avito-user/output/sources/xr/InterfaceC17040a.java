package Xr;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PreActivationAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LXr/a;", "", "a", "b", "c", "d", "e", "LXr/a$a;", "LXr/a$b;", "LXr/a$c;", "LXr/a$d;", "LXr/a$e;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xr.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC17040a {

    /* compiled from: PreActivationAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXr/a$a;", "LXr/a;", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xr.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1352a implements InterfaceC17040a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1352a f19081a = new C1352a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1352a);
        }

        public final int hashCode() {
            return 2035093604;
        }

        @k
        public final String toString() {
            return "ButtonClick";
        }
    }

    /* compiled from: PreActivationAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXr/a$b;", "LXr/a;", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xr.a$b */
    public static final /* data */ class b implements InterfaceC17040a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f19082a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -28567264;
        }

        @k
        public final String toString() {
            return "OnCancelled";
        }
    }

    /* compiled from: PreActivationAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXr/a$c;", "LXr/a;", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xr.a$c */
    public static final /* data */ class c implements InterfaceC17040a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f19083a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -567608191;
        }

        @k
        public final String toString() {
            return "OnCloseClick";
        }
    }

    /* compiled from: PreActivationAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXr/a$d;", "LXr/a;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xr.a$d */
    public static final /* data */ class d implements InterfaceC17040a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f19084a;

        public d(@k DeepLink deepLink) {
            this.f19084a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f19084a, ((d) obj).f19084a);
        }

        public final int hashCode() {
            return this.f19084a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f19084a, ')');
        }
    }

    /* compiled from: PreActivationAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXr/a$e;", "LXr/a;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xr.a$e */
    public static final /* data */ class e implements InterfaceC17040a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f19085a;

        public e(@k String str) {
            this.f19085a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f19085a, ((e) obj).f19085a);
        }

        public final int hashCode() {
            return this.f19085a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SelectOption(id="), this.f19085a, ')');
        }
    }
}
