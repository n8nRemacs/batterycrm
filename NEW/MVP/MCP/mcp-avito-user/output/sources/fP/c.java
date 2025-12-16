package fp;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.client_room.model.PartnerStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ClientRoomState.kt */
@P
@J41.b
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lfp/c;", "", "<init>", "()V", "a", "b", "c", "Lfp/c$a;", "Lfp/c$b;", "Lfp/c$c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class c {

    /* compiled from: ClientRoomState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfp/c$a;", "Lfp/c;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f396091a = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -511696957;
        }

        @k
        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: ClientRoomState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfp/c$b;", "Lfp/c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C40461b f396092a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final C40460a f396093b;

        public b(@k C40461b c40461b, @l C40460a c40460a) {
            super(null);
            this.f396092a = c40461b;
            this.f396093b = c40460a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f396092a, bVar.f396092a) && L.f(this.f396093b, bVar.f396093b);
        }

        public final int hashCode() {
            int iHashCode = this.f396092a.hashCode() * 31;
            C40460a c40460a = this.f396093b;
            return iHashCode + (c40460a == null ? 0 : c40460a.hashCode());
        }

        @k
        public final String toString() {
            return "NewViewPresentation(agentState=" + this.f396092a + ", agencyState=" + this.f396093b + ')';
        }
    }

    /* compiled from: ClientRoomState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfp/c$c;", "Lfp/c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fp.c$c, reason: collision with other inner class name */
    public static final /* data */ class C11172c extends c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PartnerStatus f396094a;

        public C11172c(@k PartnerStatus partnerStatus) {
            super(null);
            this.f396094a = partnerStatus;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11172c) && L.f(this.f396094a, ((C11172c) obj).f396094a);
        }

        public final int hashCode() {
            return this.f396094a.hashCode();
        }

        @k
        public final String toString() {
            return "OldViewPresentation(partner=" + this.f396094a + ')';
        }
    }

    public /* synthetic */ c(C42822w c42822w) {
        this();
    }

    public c() {
    }
}
