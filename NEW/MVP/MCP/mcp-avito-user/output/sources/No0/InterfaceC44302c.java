package nO0;

import Y61.k;
import Y61.l;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import iO0.C41327b;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InviteOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LnO0/c;", "", "a", "b", "c", "d", "e", "LnO0/c$a;", "LnO0/c$b;", "LnO0/c$c;", "LnO0/c$d;", "LnO0/c$e;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nO0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC44302c {

    /* compiled from: InviteOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LnO0/c$a;", "LnO0/c;", "<init>", "()V", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nO0.c$a */
    public static final /* data */ class a implements InterfaceC44302c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f415102a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 123745991;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: InviteOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnO0/c$b;", "LnO0/c;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nO0.c$b */
    public static final /* data */ class b implements InterfaceC44302c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C41327b f415103a;

        public b(@k C41327b c41327b) {
            this.f415103a = c41327b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f415103a, ((b) obj).f415103a);
        }

        public final int hashCode() {
            return this.f415103a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenDeclinePopup(popup=" + this.f415103a + ')';
        }
    }

    /* compiled from: InviteOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnO0/c$c;", "LnO0/c;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nO0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C11858c implements InterfaceC44302c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f415104a;

        public C11858c(@k DeepLink deepLink) {
            this.f415104a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11858c) && L.f(this.f415104a, ((C11858c) obj).f415104a);
        }

        public final int hashCode() {
            return this.f415104a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f415104a, ')');
        }
    }

    /* compiled from: InviteOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnO0/c$d;", "LnO0/c;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nO0.c$d */
    public static final /* data */ class d implements InterfaceC44302c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Fragment f415105a;

        public d(@k Fragment fragment) {
            this.f415105a = fragment;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f415105a, ((d) obj).f415105a);
        }

        public final int hashCode() {
            return this.f415105a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenFragment(fragment=" + this.f415105a + ')';
        }
    }

    /* compiled from: InviteOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnO0/c$e;", "LnO0/c;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nO0.c$e */
    public static final /* data */ class e implements InterfaceC44302c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f415106a;

        public e(@k PrintableText printableText) {
            this.f415106a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f415106a, ((e) obj).f415106a);
        }

        public final int hashCode() {
            return this.f415106a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowError(error="), this.f415106a, ')');
        }
    }
}
