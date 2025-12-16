package ge;

import Y61.k;
import Y61.l;
import com.avito.android.authorization.confirm_3fa.adapter.email.EmailItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConfirmEmailListAction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lge/a;", "", "a", "Lge/a$a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ge.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC40665a {

    /* compiled from: ConfirmEmailListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lge/a$a;", "Lge/a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ge.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11215a implements InterfaceC40665a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final EmailItem f396645a;

        public C11215a(@k EmailItem emailItem) {
            this.f396645a = emailItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11215a) && L.f(this.f396645a, ((C11215a) obj).f396645a);
        }

        public final int hashCode() {
            return this.f396645a.hashCode();
        }

        @k
        public final String toString() {
            return "ClickEmail(email=" + this.f396645a + ')';
        }
    }
}
