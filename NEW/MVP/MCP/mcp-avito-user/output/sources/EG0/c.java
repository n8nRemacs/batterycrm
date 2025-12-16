package Eg0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.review_action_network_request.ReviewActionNetworkRequestResult;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TextSheetOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LEg0/c;", "", "a", "b", "c", "d", "LEg0/c$a;", "LEg0/c$b;", "LEg0/c$c;", "LEg0/c$d;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface c {

    /* compiled from: TextSheetOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEg0/c$a;", "LEg0/c;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ReviewActionNetworkRequestResult.Info f4153a;

        public a(@k ReviewActionNetworkRequestResult.Info info) {
            this.f4153a = info;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f4153a, ((a) obj).f4153a);
        }

        public final int hashCode() {
            return this.f4153a.hashCode();
        }

        @k
        public final String toString() {
            return "CloseWithInfoResult(result=" + this.f4153a + ')';
        }
    }

    /* compiled from: TextSheetOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEg0/c$b;", "LEg0/c;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f4154a = new b();
    }

    /* compiled from: TextSheetOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEg0/c$c;", "LEg0/c;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eg0.c$c, reason: collision with other inner class name */
    public static final class C0245c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0245c f4155a = new C0245c();
    }

    /* compiled from: TextSheetOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEg0/c$d;", "LEg0/c;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f4156a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f4157b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final InterfaceC13484a f4158c;

        public d(@k String str, @l String str2, @l InterfaceC13484a interfaceC13484a) {
            this.f4156a = str;
            this.f4157b = str2;
            this.f4158c = interfaceC13484a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f4156a, dVar.f4156a) && L.f(this.f4157b, dVar.f4157b) && L.f(this.f4158c, dVar.f4158c);
        }

        public final int hashCode() {
            int iHashCode = this.f4156a.hashCode() * 31;
            String str = this.f4157b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            InterfaceC13484a interfaceC13484a = this.f4158c;
            return iHashCode2 + (interfaceC13484a != null ? interfaceC13484a.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ShowErrorToastBar(message=" + this.f4156a + ", actionText=" + this.f4157b + ", action=" + this.f4158c + ')';
        }

        public /* synthetic */ d(String str, String str2, InterfaceC13484a interfaceC13484a, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2, interfaceC13484a);
        }
    }
}
