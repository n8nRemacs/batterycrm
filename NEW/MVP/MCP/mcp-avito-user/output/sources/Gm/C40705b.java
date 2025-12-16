package gm;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SaleBlockItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgm/b;", "Lcom/avito/conveyor_item/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gm.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C40705b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f396773b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<Integer> f396774c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C40707d f396775d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f396776e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final List<Long> f396777f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final List<Image> f396778g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Integer f396779h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final List<Long> f396780i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final C40704a f396781j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f396782k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f396783l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f396784m;

    public C40705b(@k String str, @k List<Integer> list, @k C40707d c40707d, @l String str2, @l List<Long> list2, @l List<Image> list3, @l Integer num, @l List<Long> list4, @k C40704a c40704a, boolean z12, boolean z13, boolean z14) {
        this.f396773b = str;
        this.f396774c = list;
        this.f396775d = c40707d;
        this.f396776e = str2;
        this.f396777f = list2;
        this.f396778g = list3;
        this.f396779h = num;
        this.f396780i = list4;
        this.f396781j = c40704a;
        this.f396782k = z12;
        this.f396783l = z13;
        this.f396784m = z14;
    }

    public static C40705b a(C40705b c40705b, List list, C40707d c40707d, String str, List list2, List list3, Integer num, List list4, boolean z12, boolean z13, boolean z14, int i12) {
        String str2 = c40705b.f396773b;
        List list5 = (i12 & 2) != 0 ? c40705b.f396774c : list;
        C40707d c40707d2 = (i12 & 4) != 0 ? c40705b.f396775d : c40707d;
        String str3 = (i12 & 8) != 0 ? c40705b.f396776e : str;
        List list6 = (i12 & 16) != 0 ? c40705b.f396777f : list2;
        List list7 = (i12 & 32) != 0 ? c40705b.f396778g : list3;
        Integer num2 = (i12 & 64) != 0 ? c40705b.f396779h : num;
        List list8 = (i12 & 128) != 0 ? c40705b.f396780i : list4;
        C40704a c40704a = c40705b.f396781j;
        boolean z15 = (i12 & 512) != 0 ? c40705b.f396782k : z12;
        boolean z16 = (i12 & 1024) != 0 ? c40705b.f396783l : z13;
        boolean z17 = (i12 & 2048) != 0 ? c40705b.f396784m : z14;
        c40705b.getClass();
        return new C40705b(str2, list5, c40707d2, str3, list6, list7, num2, list8, c40704a, z15, z16, z17);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40705b)) {
            return false;
        }
        C40705b c40705b = (C40705b) obj;
        return L.f(this.f396773b, c40705b.f396773b) && L.f(this.f396774c, c40705b.f396774c) && L.f(this.f396775d, c40705b.f396775d) && L.f(this.f396776e, c40705b.f396776e) && L.f(this.f396777f, c40705b.f396777f) && L.f(this.f396778g, c40705b.f396778g) && L.f(this.f396779h, c40705b.f396779h) && L.f(this.f396780i, c40705b.f396780i) && L.f(this.f396781j, c40705b.f396781j) && this.f396782k == c40705b.f396782k && this.f396783l == c40705b.f396783l && this.f396784m == c40705b.f396784m;
    }

    @Override // TV0.a
    public final long getId() {
        return getF114560b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF114560b() {
        return this.f396773b;
    }

    public final int hashCode() {
        int iHashCode = (this.f396775d.hashCode() + H.e(this.f396773b.hashCode() * 31, 31, this.f396774c)) * 31;
        String str = this.f396776e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Long> list = this.f396777f;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Image> list2 = this.f396778g;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.f396779h;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List<Long> list3 = this.f396780i;
        return Boolean.hashCode(this.f396784m) + r.i(r.i((this.f396781j.hashCode() + ((iHashCode5 + (list3 != null ? list3.hashCode() : 0)) * 31)) * 31, 31, this.f396782k), 31, this.f396783l);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SaleBlockItem(stringId=");
        sb2.append(this.f396773b);
        sb2.append(", discounts=");
        sb2.append(this.f396774c);
        sb2.append(", validate=");
        sb2.append(this.f396775d);
        sb2.append(", warningText=");
        sb2.append(this.f396776e);
        sb2.append(", itemIds=");
        sb2.append(this.f396777f);
        sb2.append(", images=");
        sb2.append(this.f396778g);
        sb2.append(", discount=");
        sb2.append(this.f396779h);
        sb2.append(", availableItemIds=");
        sb2.append(this.f396780i);
        sb2.append(", info=");
        sb2.append(this.f396781j);
        sb2.append(", isBeingEdited=");
        sb2.append(this.f396782k);
        sb2.append(", failedValidation=");
        sb2.append(this.f396783l);
        sb2.append(", isActionIconVisible=");
        return r.x(sb2, this.f396784m, ')');
    }
}
