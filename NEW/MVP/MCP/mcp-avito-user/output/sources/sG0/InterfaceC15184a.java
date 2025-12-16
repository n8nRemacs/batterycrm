package Sg0;

import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserContactsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LSg0/a;", "", "a", "b", "LSg0/a$a;", "LSg0/a$b;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Sg0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC15184a {

    /* compiled from: UserContactsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSg0/a$a;", "LSg0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sg0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1029a implements InterfaceC15184a {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1029a)) {
                return false;
            }
            ((C1029a) obj).getClass();
            return L.f(null, null) && L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "HandleDeeplink(deeplink=null, requestKey=null)";
        }
    }

    /* compiled from: UserContactsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSg0/a$b;", "LSg0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sg0.a$b */
    public static final /* data */ class b implements InterfaceC15184a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f15108a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f15109b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final com.avito.android.rating.user_contacts.mvi.entity.a f15110c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final com.avito.android.rating.user_contacts.mvi.entity.a f15111d;

        public b(@k Throwable th2, @k PrintableText printableText, @l com.avito.android.rating.user_contacts.mvi.entity.a aVar, @l com.avito.android.rating.user_contacts.mvi.entity.a aVar2) {
            this.f15108a = th2;
            this.f15109b = printableText;
            this.f15110c = aVar;
            this.f15111d = aVar2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f15108a, bVar.f15108a) && L.f(this.f15109b, bVar.f15109b) && L.f(this.f15110c, bVar.f15110c) && L.f(this.f15111d, bVar.f15111d);
        }

        public final int hashCode() {
            int iF2 = com.avito.android.actions_sheet.a.f(this.f15109b, this.f15108a.hashCode() * 31, 31);
            com.avito.android.rating.user_contacts.mvi.entity.a aVar = this.f15110c;
            int iHashCode = (iF2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            com.avito.android.rating.user_contacts.mvi.entity.a aVar2 = this.f15111d;
            return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ShowErrorToast(error=" + this.f15108a + ", message=" + this.f15109b + ", onClickedAction=" + this.f15110c + ", onDismissedAction=" + this.f15111d + ')';
        }

        public /* synthetic */ b(Throwable th2, PrintableText printableText, com.avito.android.rating.user_contacts.mvi.entity.a aVar, com.avito.android.rating.user_contacts.mvi.entity.a aVar2, int i12, C42822w c42822w) {
            this(th2, printableText, (i12 & 4) != 0 ? null : aVar, (i12 & 8) != 0 ? null : aVar2);
        }
    }
}
