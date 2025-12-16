package vp0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BbipV2OneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lvp0/b;", "", "a", "b", "c", "d", "Lvp0/b$a;", "Lvp0/b$b;", "Lvp0/b$c;", "Lvp0/b$d;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vp0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC49365b {

    /* compiled from: BbipV2OneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvp0/b$a;", "Lvp0/b;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vp0.b$a */
    public static final /* data */ class a implements InterfaceC49365b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f440980a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 164511685;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: BbipV2OneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvp0/b$b;", "Lvp0/b;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vp0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12793b implements InterfaceC49365b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f440981a;

        public C12793b(@k DeepLink deepLink) {
            this.f440981a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12793b) && L.f(this.f440981a, ((C12793b) obj).f440981a);
        }

        public final int hashCode() {
            return this.f440981a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f440981a, ')');
        }
    }

    /* compiled from: BbipV2OneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvp0/b$c;", "Lvp0/b;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vp0.b$c */
    public static final /* data */ class c implements InterfaceC49365b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f440982a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final InterfaceC49364a f440983b;

        public c(@k Throwable th2, @l InterfaceC49364a interfaceC49364a) {
            this.f440982a = th2;
            this.f440983b = interfaceC49364a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f440982a, cVar.f440982a) && L.f(this.f440983b, cVar.f440983b);
        }

        public final int hashCode() {
            int iHashCode = this.f440982a.hashCode() * 31;
            InterfaceC49364a interfaceC49364a = this.f440983b;
            return iHashCode + (interfaceC49364a == null ? 0 : interfaceC49364a.hashCode());
        }

        @k
        public final String toString() {
            return "ShowError(error=" + this.f440982a + ", retryAction=" + this.f440983b + ')';
        }

        public /* synthetic */ c(Throwable th2, InterfaceC49364a interfaceC49364a, int i12, C42822w c42822w) {
            this(th2, (i12 & 2) != 0 ? null : interfaceC49364a);
        }
    }

    /* compiled from: BbipV2OneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvp0/b$d;", "Lvp0/b;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vp0.b$d */
    public static final /* data */ class d implements InterfaceC49365b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f440984a;

        public d(@k PrintableText printableText) {
            this.f440984a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f440984a, ((d) obj).f440984a);
        }

        public final int hashCode() {
            return this.f440984a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowInfo(text="), this.f440984a, ')');
        }
    }
}
