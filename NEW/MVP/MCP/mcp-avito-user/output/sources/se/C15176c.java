package Se;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.auto_contact_models.Benefit;
import com.avito.android.remote.model.auto_contact_models.Button;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BuyContactsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LSe/c;", "", "a", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Se.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C15176c {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f15098f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C15176c f15099g = new C15176c(null, null, null, null, null, 31, null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f15100a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<Benefit> f15101b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Button f15102c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f15103d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f15104e;

    /* compiled from: BuyContactsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSe/c$a;", "", "<init>", "()V", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Se.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C15176c() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15176c)) {
            return false;
        }
        C15176c c15176c = (C15176c) obj;
        return L.f(this.f15100a, c15176c.f15100a) && L.f(this.f15101b, c15176c.f15101b) && L.f(this.f15102c, c15176c.f15102c) && L.f(this.f15103d, c15176c.f15103d) && L.f(this.f15104e, c15176c.f15104e);
    }

    public final int hashCode() {
        String str = this.f15100a;
        int iE2 = H.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f15101b);
        Button button = this.f15102c;
        int iHashCode = (iE2 + (button == null ? 0 : button.hashCode())) * 31;
        String str2 = this.f15103d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AttributedText attributedText = this.f15104e;
        return iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuyContactsState(benefitTitle=");
        sb2.append(this.f15100a);
        sb2.append(", benefitsList=");
        sb2.append(this.f15101b);
        sb2.append(", actionButton=");
        sb2.append(this.f15102c);
        sb2.append(", description=");
        sb2.append(this.f15103d);
        sb2.append(", footerText=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f15104e, ')');
    }

    public C15176c(@l String str, @k List<Benefit> list, @l Button button, @l String str2, @l AttributedText attributedText) {
        this.f15100a = str;
        this.f15101b = list;
        this.f15102c = button;
        this.f15103d = str2;
        this.f15104e = attributedText;
    }

    public C15176c(String str, List list, Button button, String str2, AttributedText attributedText, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? C42784z0.f406748b : list, (i12 & 4) != 0 ? null : button, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : attributedText);
    }
}
