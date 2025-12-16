package com.avito.android.authorization.gorelkin;

import androidx.compose.runtime.C22026a;
import androidx.view.AbstractC22991Y;
import androidx.view.C23038g0;
import com.avito.android.remote.model.Profile;
import com.avito.android.remote.model.Session;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ParsingPermissionViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/gorelkin/m;", "", "a", "b", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface m {

    /* compiled from: ParsingPermissionViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/gorelkin/m$a;", "", "a", "Lcom/avito/android/authorization/gorelkin/m$a$a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: ParsingPermissionViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/gorelkin/m$a$a;", "Lcom/avito/android/authorization/gorelkin/m$a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.authorization.gorelkin.m$a$a, reason: collision with other inner class name */
        public static final /* data */ class C2781a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Profile f93931a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Session f93932b;

            public C2781a(@Y61.k Profile profile, @Y61.k Session session) {
                this.f93931a = profile;
                this.f93932b = session;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2781a)) {
                    return false;
                }
                C2781a c2781a = (C2781a) obj;
                return L.f(this.f93931a, c2781a.f93931a) && L.f(this.f93932b, c2781a.f93932b);
            }

            public final int hashCode() {
                return this.f93932b.hashCode() + (this.f93931a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                return "Success(profile=" + this.f93931a + ", session=" + this.f93932b + ')';
            }
        }
    }

    /* compiled from: ParsingPermissionViewModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/authorization/gorelkin/m$b;", "", "a", "b", "c", "d", "Lcom/avito/android/authorization/gorelkin/m$b$a;", "Lcom/avito/android/authorization/gorelkin/m$b$b;", "Lcom/avito/android/authorization/gorelkin/m$b$c;", "Lcom/avito/android/authorization/gorelkin/m$b$d;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: ParsingPermissionViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/gorelkin/m$b$a;", "Lcom/avito/android/authorization/gorelkin/m$b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final String f93933a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f93934b;

            public a(@Y61.l String str, @Y61.l String str2) {
                this.f93933a = str;
                this.f93934b = str2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f93933a, aVar.f93933a) && L.f(this.f93934b, aVar.f93934b);
            }

            public final int hashCode() {
                String str = this.f93933a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f93934b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("InputError(fioError=");
                sb2.append(this.f93933a);
                sb2.append(", phoneError=");
                return C22026a.c(sb2, this.f93934b, ')');
            }
        }

        /* compiled from: ParsingPermissionViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/gorelkin/m$b$b;", "Lcom/avito/android/authorization/gorelkin/m$b;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.authorization.gorelkin.m$b$b, reason: collision with other inner class name */
        public static final class C2782b implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C2782b f93935a = new C2782b();
        }

        /* compiled from: ParsingPermissionViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/gorelkin/m$b$c;", "Lcom/avito/android/authorization/gorelkin/m$b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final String f93936a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Throwable f93937b;

            public c(@Y61.l String str, @Y61.k Throwable th2) {
                this.f93936a = str;
                this.f93937b = th2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return L.f(this.f93936a, cVar.f93936a) && L.f(this.f93937b, cVar.f93937b);
            }

            public final int hashCode() {
                String str = this.f93936a;
                return this.f93937b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("SnackbarError(message=");
                sb2.append(this.f93936a);
                sb2.append(", error=");
                return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f93937b, ')');
            }
        }

        /* compiled from: ParsingPermissionViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/gorelkin/m$b$d;", "Lcom/avito/android/authorization/gorelkin/m$b;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final d f93938a = new d();
        }
    }

    @Y61.k
    /* renamed from: Db */
    C23038g0 getF93946P();

    void I3(@Y61.k ParsingAllowance parsingAllowance);

    void a3(@Y61.k CharSequence charSequence, @Y61.k CharSequence charSequence2, @Y61.k PpFlow ppFlow);

    @Y61.k
    /* renamed from: la */
    C23038g0 getF93947Q();

    @Y61.k
    AbstractC22991Y<b> o0();
}
