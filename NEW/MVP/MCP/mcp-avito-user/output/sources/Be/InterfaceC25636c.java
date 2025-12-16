package be;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.UserDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AuthSocialsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lbe/c;", "", "a", "b", "Lbe/c$a;", "Lbe/c$b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: be.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC25636c {

    /* compiled from: AuthSocialsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbe/c$a;", "Lbe/c;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: be.c$a */
    public static final /* data */ class a implements InterfaceC25636c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f57307a;

        public a(@k String str) {
            this.f57307a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f57307a, ((a) obj).f57307a);
        }

        public final int hashCode() {
            return this.f57307a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenSocial(socialType="), this.f57307a, ')');
        }
    }

    /* compiled from: AuthSocialsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbe/c$b;", "Lbe/c;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: be.c$b */
    public static final /* data */ class b implements InterfaceC25636c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UserDialog f57308a;

        public b(@k UserDialog userDialog) {
            this.f57308a = userDialog;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f57308a, ((b) obj).f57308a);
        }

        public final int hashCode() {
            return this.f57308a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowUserDialog(userDialog=" + this.f57308a + ')';
        }
    }
}
