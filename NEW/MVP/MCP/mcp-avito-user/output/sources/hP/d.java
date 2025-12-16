package Hp;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.F3;
import com.avito.android.comfortable_deal.common.view.CommissionData;
import com.avito.android.comfortable_deal.end_deal.model.CommissionInfo;
import com.avito.android.comfortable_deal.end_deal.model.EndDealField;
import com.avito.android.remote.model.text.AttributedText;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EndDealState.kt */
@F3
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LHp/d;", "", "a", "b", "c", "LHp/d$a;", "LHp/d$b;", "LHp/d$c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface d {

    /* compiled from: EndDealState.kt */
    @F3
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHp/d$a;", "LHp/d;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f7742a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final CommissionData f7743b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Map<String, EndDealField> f7744c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final AttributedText f7745d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final CommissionInfo f7746e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z12, @l CommissionData commissionData, @k Map<String, ? extends EndDealField> map, @k AttributedText attributedText, @k CommissionInfo commissionInfo) {
            this.f7742a = z12;
            this.f7743b = commissionData;
            this.f7744c = map;
            this.f7745d = attributedText;
            this.f7746e = commissionInfo;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f7742a == aVar.f7742a && L.f(this.f7743b, aVar.f7743b) && L.f(this.f7744c, aVar.f7744c) && L.f(this.f7745d, aVar.f7745d) && L.f(this.f7746e, aVar.f7746e);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f7742a) * 31;
            CommissionData commissionData = this.f7743b;
            return this.f7746e.hashCode() + com.avito.android.actions_sheet.a.b(AK.c.c((iHashCode + (commissionData == null ? 0 : commissionData.hashCode())) * 31, 31, this.f7744c), 31, this.f7745d);
        }

        @k
        public final String toString() {
            return "Content(showButtonLoader=" + this.f7742a + ", commissionData=" + this.f7743b + ", fields=" + this.f7744c + ", title=" + this.f7745d + ", commissionInfo=" + this.f7746e + ')';
        }
    }

    /* compiled from: EndDealState.kt */
    @F3
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHp/d$b;", "LHp/d;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f7747a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -432992324;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: EndDealState.kt */
    @F3
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHp/d$c;", "LHp/d;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f7748a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 293656876;
        }

        @k
        public final String toString() {
            return "Placeholders";
        }
    }
}
