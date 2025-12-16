package JF0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoGoodsConfigureResult.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"LJF0/c;", "", "LJF0/d;", "commission", "LJF0/f;", "singleDate", "Lcom/avito/android/remote/model/text/AttributedText;", "extraInfo", "", "Lcom/avito/android/remote/model/ButtonAction;", "buttons", "agreement", "<init>", "(LJF0/d;LJF0/f;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;)V", "LJF0/d;", "c", "()LJF0/d;", "LJF0/f;", "e", "()LJF0/f;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "b", "()Ljava/util/List;", "a", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c {

    @com.google.gson.annotations.c("agreement")
    @l
    private final AttributedText agreement;

    @com.google.gson.annotations.c("buttons")
    @l
    private final List<ButtonAction> buttons;

    @com.google.gson.annotations.c("commission")
    @l
    private final d commission;

    @com.google.gson.annotations.c("extraInfo")
    @l
    private final AttributedText extraInfo;

    @com.google.gson.annotations.c("singleDate")
    @l
    private final f singleDate;

    public c(@l d dVar, @l f fVar, @l AttributedText attributedText, @l List<ButtonAction> list, @l AttributedText attributedText2) {
        this.commission = dVar;
        this.singleDate = fVar;
        this.extraInfo = attributedText;
        this.buttons = list;
        this.agreement = attributedText2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final AttributedText getAgreement() {
        return this.agreement;
    }

    @l
    public final List<ButtonAction> b() {
        return this.buttons;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final d getCommission() {
        return this.commission;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getExtraInfo() {
        return this.extraInfo;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final f getSingleDate() {
        return this.singleDate;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.commission, cVar.commission) && L.f(this.singleDate, cVar.singleDate) && L.f(this.extraInfo, cVar.extraInfo) && L.f(this.buttons, cVar.buttons) && L.f(this.agreement, cVar.agreement);
    }

    public final int hashCode() {
        d dVar = this.commission;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        f fVar = this.singleDate;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        AttributedText attributedText = this.extraInfo;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        List<ButtonAction> list = this.buttons;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        AttributedText attributedText2 = this.agreement;
        return iHashCode4 + (attributedText2 != null ? attributedText2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrxPromoGoodsConfigureChangedState(commission=");
        sb2.append(this.commission);
        sb2.append(", singleDate=");
        sb2.append(this.singleDate);
        sb2.append(", extraInfo=");
        sb2.append(this.extraInfo);
        sb2.append(", buttons=");
        sb2.append(this.buttons);
        sb2.append(", agreement=");
        return com.avito.android.actions_sheet.a.w(sb2, this.agreement, ')');
    }
}
