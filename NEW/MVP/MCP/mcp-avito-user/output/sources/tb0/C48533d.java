package tB0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoAdvanceState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LtB0/d;", "", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tB0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C48533d {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f439195d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C48533d f439196e = new C48533d("", new AttributedText("", C42784z0.f406748b, 0, 4, null), new ButtonAction("", null, null, Boolean.FALSE, 4, null));

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AttributedText f439197a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ButtonAction f439198b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f439199c;

    /* compiled from: TariffCpxInfoAdvanceState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LtB0/d$a;", "", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tB0.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C48533d(@k String str, @k AttributedText attributedText, @k ButtonAction buttonAction) {
        this.f439197a = attributedText;
        this.f439198b = buttonAction;
        this.f439199c = str;
    }

    public static C48533d a(C48533d c48533d, AttributedText attributedText, ButtonAction buttonAction, String str, int i12) {
        if ((i12 & 1) != 0) {
            attributedText = c48533d.f439197a;
        }
        if ((i12 & 4) != 0) {
            str = c48533d.f439199c;
        }
        c48533d.getClass();
        return new C48533d(str, attributedText, buttonAction);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48533d)) {
            return false;
        }
        C48533d c48533d = (C48533d) obj;
        return L.f(this.f439197a, c48533d.f439197a) && L.f(this.f439198b, c48533d.f439198b) && L.f(this.f439199c, c48533d.f439199c);
    }

    public final int hashCode() {
        return this.f439199c.hashCode() + ((this.f439198b.hashCode() + (this.f439197a.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCpxInfoAdvanceState(title=");
        sb2.append(this.f439197a);
        sb2.append(", button=");
        sb2.append(this.f439198b);
        sb2.append(", amount=");
        return C22026a.c(sb2, this.f439199c, ')');
    }
}
