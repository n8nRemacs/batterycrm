package ge;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.UserDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConfirmEmailListEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lge/b;", "", "a", "b", "c", "Lge/b$a;", "Lge/b$b;", "Lge/b$c;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ge.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC40666b {

    /* compiled from: ConfirmEmailListEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lge/b$a;", "Lge/b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ge.b$a */
    public static final /* data */ class a implements InterfaceC40666b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f396646a;

        public a(@k DeepLink deepLink) {
            this.f396646a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f396646a, ((a) obj).f396646a);
        }

        public final int hashCode() {
            return this.f396646a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("FollowLink(link="), this.f396646a, ')');
        }
    }

    /* compiled from: ConfirmEmailListEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lge/b$b;", "Lge/b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ge.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11216b implements InterfaceC40666b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UserDialog f396647a;

        public C11216b(@k UserDialog userDialog) {
            this.f396647a = userDialog;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11216b) && L.f(this.f396647a, ((C11216b) obj).f396647a);
        }

        public final int hashCode() {
            return this.f396647a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowDialog(dialog=" + this.f396647a + ')';
        }
    }

    /* compiled from: ConfirmEmailListEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lge/b$c;", "Lge/b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ge.b$c */
    public static final /* data */ class c implements InterfaceC40666b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f396648a;

        public c(@k PrintableText printableText) {
            this.f396648a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f396648a, ((c) obj).f396648a);
        }

        public final int hashCode() {
            return this.f396648a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowToast(text="), this.f396648a, ')');
        }
    }
}
