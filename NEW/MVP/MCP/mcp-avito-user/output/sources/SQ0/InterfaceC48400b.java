package sq0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.select.Arguments;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectFieldOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lsq0/b;", "", "a", "b", "c", "d", "Lsq0/b$a;", "Lsq0/b$b;", "Lsq0/b$c;", "Lsq0/b$d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sq0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC48400b {

    /* compiled from: SelectFieldOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsq0/b$a;", "Lsq0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sq0.b$a */
    public static final /* data */ class a implements InterfaceC48400b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f438883a;

        public a(boolean z12) {
            this.f438883a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f438883a == ((a) obj).f438883a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f438883a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("CloseWithResult(isChanged="), this.f438883a, ')');
        }
    }

    /* compiled from: SelectFieldOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsq0/b$b;", "Lsq0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sq0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12647b implements InterfaceC48400b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Arguments f438884a;

        public C12647b(@k Arguments arguments) {
            this.f438884a = arguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12647b) && L.f(this.f438884a, ((C12647b) obj).f438884a);
        }

        public final int hashCode() {
            return this.f438884a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.p(new StringBuilder("OpenSelector(arguments="), this.f438884a, ')');
        }
    }

    /* compiled from: SelectFieldOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsq0/b$c;", "Lsq0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sq0.b$c */
    public static final /* data */ class c implements InterfaceC48400b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f438885a;

        public c(@k Throwable th2) {
            this.f438885a = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f438885a, ((c) obj).f438885a);
        }

        public final int hashCode() {
            return this.f438885a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ShowCommonErrorToastBar(throwable="), this.f438885a, ')');
        }
    }

    /* compiled from: SelectFieldOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsq0/b$d;", "Lsq0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sq0.b$d */
    public static final /* data */ class d implements InterfaceC48400b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f438886a;

        public d(@k String str) {
            this.f438886a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f438886a, ((d) obj).f438886a);
        }

        public final int hashCode() {
            return this.f438886a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorToastBar(message="), this.f438886a, ')');
        }
    }
}
