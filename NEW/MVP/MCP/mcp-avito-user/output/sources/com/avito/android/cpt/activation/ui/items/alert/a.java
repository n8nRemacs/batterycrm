package com.avito.android.cpt.activation.ui.items.alert;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42150f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CptActivationAlertItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpt/activation/ui/items/alert/a;", "Lcom/avito/conveyor_item/a;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f126319b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f126320c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f126321d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f126322e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f126323f;

    /* renamed from: g, reason: collision with root package name */
    public final int f126324g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final List<ButtonAction> f126325h;

    public a(@k String str, @l String str2, @l AttributedText attributedText, @InterfaceC42150f @l Integer num, @InterfaceC42150f @l Integer num2, @InterfaceC42150f int i12, @l List<ButtonAction> list) {
        this.f126319b = str;
        this.f126320c = str2;
        this.f126321d = attributedText;
        this.f126322e = num;
        this.f126323f = num2;
        this.f126324g = i12;
        this.f126325h = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f126319b, aVar.f126319b) && L.f(this.f126320c, aVar.f126320c) && L.f(this.f126321d, aVar.f126321d) && L.f(this.f126322e, aVar.f126322e) && L.f(this.f126323f, aVar.f126323f) && this.f126324g == aVar.f126324g && L.f(this.f126325h, aVar.f126325h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return getF126319b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF126319b() {
        return this.f126319b;
    }

    public final int hashCode() {
        int iHashCode = this.f126319b.hashCode() * 31;
        String str = this.f126320c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f126321d;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Integer num = this.f126322e;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f126323f;
        int iE2 = r.e(this.f126324g, (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
        List<ButtonAction> list = this.f126325h;
        return iE2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CptActivationAlertItem(stringId=");
        sb2.append(this.f126319b);
        sb2.append(", title=");
        sb2.append(this.f126320c);
        sb2.append(", description=");
        sb2.append(this.f126321d);
        sb2.append(", icon=");
        sb2.append(this.f126322e);
        sb2.append(", iconColor=");
        sb2.append(this.f126323f);
        sb2.append(", styleAttr=");
        sb2.append(this.f126324g);
        sb2.append(", actions=");
        return H.p(sb2, this.f126325h, ')');
    }

    public /* synthetic */ a(String str, String str2, AttributedText attributedText, Integer num, Integer num2, int i12, List list, int i13, C42822w c42822w) {
        this(str, str2, attributedText, (i13 & 8) != 0 ? null : num, (i13 & 16) != 0 ? null : num2, i12, list);
    }
}
