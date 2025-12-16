package rp0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BbipPrivateOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lrp0/b;", "", "a", "b", "c", "d", "e", "Lrp0/b$a;", "Lrp0/b$b;", "Lrp0/b$c;", "Lrp0/b$d;", "Lrp0/b$e;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rp0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC47706b {

    /* compiled from: BbipPrivateOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrp0/b$a;", "Lrp0/b;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rp0.b$a */
    public static final class a implements InterfaceC47706b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f430239a = new a();
    }

    /* compiled from: BbipPrivateOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrp0/b$b;", "Lrp0/b;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rp0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12396b implements InterfaceC47706b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f430240a;

        public C12396b(@k DeepLink deepLink) {
            this.f430240a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12396b) && L.f(this.f430240a, ((C12396b) obj).f430240a);
        }

        public final int hashCode() {
            return this.f430240a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f430240a, ')');
        }
    }

    /* compiled from: BbipPrivateOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrp0/b$c;", "Lrp0/b;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rp0.b$c */
    public static final class c implements InterfaceC47706b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f430241a = new c();
    }

    /* compiled from: BbipPrivateOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrp0/b$d;", "Lrp0/b;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rp0.b$d */
    public static final /* data */ class d implements InterfaceC47706b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f430242a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final InterfaceC47705a f430243b;

        public d(@k Throwable th2, @l InterfaceC47705a interfaceC47705a) {
            this.f430242a = th2;
            this.f430243b = interfaceC47705a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f430242a, dVar.f430242a) && L.f(this.f430243b, dVar.f430243b);
        }

        public final int hashCode() {
            int iHashCode = this.f430242a.hashCode() * 31;
            InterfaceC47705a interfaceC47705a = this.f430243b;
            return iHashCode + (interfaceC47705a == null ? 0 : interfaceC47705a.hashCode());
        }

        @k
        public final String toString() {
            return "ShowError(error=" + this.f430242a + ", retryAction=" + this.f430243b + ')';
        }

        public /* synthetic */ d(Throwable th2, InterfaceC47705a interfaceC47705a, int i12, C42822w c42822w) {
            this(th2, (i12 & 2) != 0 ? null : interfaceC47705a);
        }
    }

    /* compiled from: BbipPrivateOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrp0/b$e;", "Lrp0/b;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rp0.b$e */
    public static final /* data */ class e implements InterfaceC47706b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f430244a;

        public e(@k String str) {
            this.f430244a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f430244a, ((e) obj).f430244a);
        }

        public final int hashCode() {
            return this.f430244a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowMnzUxFeedback(campaignName="), this.f430244a, ')');
        }
    }
}
