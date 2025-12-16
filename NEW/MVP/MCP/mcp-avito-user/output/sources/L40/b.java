package l40;

import Y61.k;
import Y61.l;
import android.content.Intent;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OAuthOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Ll40/b;", "", "a", "b", "c", "d", "Ll40/b$a;", "Ll40/b$b;", "Ll40/b$c;", "Ll40/b$d;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: OAuthOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll40/b$a;", "Ll40/b;", "<init>", "()V", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f413469a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1884868771;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: OAuthOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll40/b$b;", "Ll40/b;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: l40.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11771b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f413470a;

        public C11771b(@k String str) {
            this.f413470a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11771b) && L.f(this.f413470a, ((C11771b) obj).f413470a);
        }

        public final int hashCode() {
            return this.f413470a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Redirect(url="), this.f413470a, ')');
        }
    }

    /* compiled from: OAuthOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll40/b$c;", "Ll40/b;", "<init>", "()V", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f413471a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -260482236;
        }

        @k
        public final String toString() {
            return "RestartWithLogout";
        }
    }

    /* compiled from: OAuthOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll40/b$d;", "Ll40/b;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Intent f413472a;

        public d(@k Intent intent) {
            this.f413472a = intent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f413472a, ((d) obj).f413472a);
        }

        public final int hashCode() {
            return this.f413472a.hashCode();
        }

        @k
        public final String toString() {
            return "StartActivity(intent=" + this.f413472a + ')';
        }
    }
}
