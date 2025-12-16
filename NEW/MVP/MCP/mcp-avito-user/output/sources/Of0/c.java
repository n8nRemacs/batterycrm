package OF0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.lib.design.picker.m;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.trx_promo_goods.screens.date_picker.data.local.TrxPromoGoodsDatePickerValidator;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoGoodsDatePickerState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LOF0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c extends q {

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final a f12107k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final c f12108l;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f12109b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<Q<List<com.avito.android.lib.design.picker.k<?>>, m>> f12110c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final com.avito.android.lib.design.picker.k<?> f12111d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final com.avito.android.lib.design.picker.k<?> f12112e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final com.avito.android.lib.design.picker.k<?> f12113f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<TrxPromoGoodsDatePickerValidator> f12114g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ButtonAction f12115h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final AttributedText f12116i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final LocalDate f12117j;

    /* compiled from: TrxPromoGoodsDatePickerState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOF0/c$a;", "", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f12108l = new c("", c42784z0, null, null, null, c42784z0, new ButtonAction("", null, null, null, 12, null), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k String str, @k List<? extends Q<? extends List<? extends com.avito.android.lib.design.picker.k<?>>, m>> list, @l com.avito.android.lib.design.picker.k<?> kVar, @l com.avito.android.lib.design.picker.k<?> kVar2, @l com.avito.android.lib.design.picker.k<?> kVar3, @k List<? extends TrxPromoGoodsDatePickerValidator> list2, @k ButtonAction buttonAction, @l AttributedText attributedText, @l LocalDate localDate) {
        this.f12109b = str;
        this.f12110c = list;
        this.f12111d = kVar;
        this.f12112e = kVar2;
        this.f12113f = kVar3;
        this.f12114g = list2;
        this.f12115h = buttonAction;
        this.f12116i = attributedText;
        this.f12117j = localDate;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f12109b, cVar.f12109b) && L.f(this.f12110c, cVar.f12110c) && L.f(this.f12111d, cVar.f12111d) && L.f(this.f12112e, cVar.f12112e) && L.f(this.f12113f, cVar.f12113f) && L.f(this.f12114g, cVar.f12114g) && L.f(this.f12115h, cVar.f12115h) && L.f(this.f12116i, cVar.f12116i) && L.f(this.f12117j, cVar.f12117j);
    }

    public final int hashCode() {
        int iE2 = H.e(this.f12109b.hashCode() * 31, 31, this.f12110c);
        com.avito.android.lib.design.picker.k<?> kVar = this.f12111d;
        int iHashCode = (iE2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        com.avito.android.lib.design.picker.k<?> kVar2 = this.f12112e;
        int iHashCode2 = (iHashCode + (kVar2 == null ? 0 : kVar2.hashCode())) * 31;
        com.avito.android.lib.design.picker.k<?> kVar3 = this.f12113f;
        int iHashCode3 = (this.f12115h.hashCode() + H.e((iHashCode2 + (kVar3 == null ? 0 : kVar3.hashCode())) * 31, 31, this.f12114g)) * 31;
        AttributedText attributedText = this.f12116i;
        int iHashCode4 = (iHashCode3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        LocalDate localDate = this.f12117j;
        return iHashCode4 + (localDate != null ? localDate.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrxPromoGoodsDatePickerState(screenTitle=");
        sb2.append(this.f12109b);
        sb2.append(", pickerWheels=");
        sb2.append(this.f12110c);
        sb2.append(", dayWheelValue=");
        sb2.append(this.f12111d);
        sb2.append(", monthWheelValue=");
        sb2.append(this.f12112e);
        sb2.append(", yearWheelValue=");
        sb2.append(this.f12113f);
        sb2.append(", validators=");
        sb2.append(this.f12114g);
        sb2.append(", button=");
        sb2.append(this.f12115h);
        sb2.append(", infoText=");
        sb2.append(this.f12116i);
        sb2.append(", date=");
        return AK.c.t(sb2, this.f12117j, ')');
    }
}
