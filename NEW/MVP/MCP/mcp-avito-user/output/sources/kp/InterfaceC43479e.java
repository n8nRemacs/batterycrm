package kp;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.F3;
import com.akita.compose.component.accordion.s;
import com.avito.android.comfortable_deal.common.view.client.ClientCardData;
import com.avito.android.comfortable_deal.paging.PagingState;
import j.e0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ClientsState.kt */
@F3
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lkp/e;", "", "a", "b", "c", "d", "Lkp/e$a;", "Lkp/e$b;", "Lkp/e$c;", "Lkp/e$d;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kp.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC43479e {

    /* compiled from: ClientsState.kt */
    @F3
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkp/e$a;", "Lkp/e;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kp.e$a */
    public static final /* data */ class a implements InterfaceC43479e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<ClientCardData> f413196a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PagingState f413197b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f413198c;

        public a(@k List<ClientCardData> list, @k PagingState pagingState) {
            this.f413196a = list;
            this.f413197b = pagingState;
            this.f413198c = pagingState == PagingState.f122408b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f413196a, aVar.f413196a) && this.f413197b == aVar.f413197b;
        }

        public final int hashCode() {
            return this.f413197b.hashCode() + (this.f413196a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "Content(clients=" + this.f413196a + ", pagingState=" + this.f413197b + ')';
        }
    }

    /* compiled from: ClientsState.kt */
    @F3
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkp/e$c;", "Lkp/e;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kp.e$c */
    public static final class c implements InterfaceC43479e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f413203a = new c();
    }

    /* compiled from: ClientsState.kt */
    @F3
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkp/e$d;", "Lkp/e;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kp.e$d */
    public static final class d implements InterfaceC43479e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f413204a = new d();
    }

    /* compiled from: ClientsState.kt */
    @F3
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkp/e$b;", "Lkp/e;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kp.e$b */
    public static final /* data */ class b implements InterfaceC43479e {

        /* renamed from: a, reason: collision with root package name */
        public final int f413199a;

        /* renamed from: b, reason: collision with root package name */
        public final int f413200b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f413201c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Integer f413202d;

        public b(@e0 int i12, @l @e0 Integer num, @l Integer num2, @e0 int i13) {
            this.f413199a = i12;
            this.f413200b = i13;
            this.f413201c = num;
            this.f413202d = num2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f413199a == bVar.f413199a && this.f413200b == bVar.f413200b && L.f(this.f413201c, bVar.f413201c) && L.f(this.f413202d, bVar.f413202d);
        }

        public final int hashCode() {
            int iE2 = r.e(this.f413200b, Integer.hashCode(this.f413199a) * 31, 31);
            Integer num = this.f413201c;
            int iHashCode = (iE2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f413202d;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Empty(title=");
            sb2.append(this.f413199a);
            sb2.append(", message=");
            sb2.append(this.f413200b);
            sb2.append(", actionText=");
            sb2.append(this.f413201c);
            sb2.append(", goToTabIndex=");
            return s.j(sb2, this.f413202d, ')');
        }

        public /* synthetic */ b(int i12, int i13, Integer num, Integer num2, int i14, C42822w c42822w) {
            this(i12, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : num2, i13);
        }
    }
}
