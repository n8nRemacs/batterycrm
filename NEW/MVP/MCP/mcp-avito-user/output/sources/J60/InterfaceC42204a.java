package j60;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PassportProfilesListAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lj60/a;", "", "a", "b", "c", "d", "Lj60/a$a;", "Lj60/a$b;", "Lj60/a$c;", "Lj60/a$d;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: j60.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC42204a {

    /* compiled from: PassportProfilesListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj60/a$a;", "Lj60/a;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: j60.a$a, reason: collision with other inner class name */
    public static final class C11547a implements InterfaceC42204a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11547a f405430a = new C11547a();
    }

    /* compiled from: PassportProfilesListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj60/a$b;", "Lj60/a;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: j60.a$b */
    public static final /* data */ class b implements InterfaceC42204a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f405431a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1643354243;
        }

        @k
        public final String toString() {
            return "LoadProfiles";
        }
    }

    /* compiled from: PassportProfilesListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lj60/a$c;", "Lj60/a;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: j60.a$c */
    public static final /* data */ class c implements InterfaceC42204a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f405432a;

        public c(@k String str) {
            this.f405432a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f405432a, ((c) obj).f405432a);
        }

        public final int hashCode() {
            return this.f405432a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("NewSearch(text="), this.f405432a, ')');
        }
    }

    /* compiled from: PassportProfilesListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lj60/a$d;", "Lj60/a;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: j60.a$d */
    public static final /* data */ class d implements InterfaceC42204a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f405433a;

        public d(@k String str) {
            this.f405433a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f405433a, ((d) obj).f405433a);
        }

        public final int hashCode() {
            return this.f405433a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ProfileClick(profileId="), this.f405433a, ')');
        }
    }
}
