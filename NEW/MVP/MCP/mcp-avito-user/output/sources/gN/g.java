package gn;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CartSheetAfterAddingState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgn/g;", "", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f396825a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f f396826b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f396827c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f396828d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f396829e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f396830f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f396831g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f396832h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f396833i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Stepper f396834j;

    public g() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f396825a, gVar.f396825a) && L.f(this.f396826b, gVar.f396826b) && L.f(this.f396827c, gVar.f396827c) && L.f(this.f396828d, gVar.f396828d) && L.f(this.f396829e, gVar.f396829e) && L.f(this.f396830f, gVar.f396830f) && L.f(this.f396831g, gVar.f396831g) && L.f(this.f396832h, gVar.f396832h) && L.f(this.f396833i, gVar.f396833i) && L.f(this.f396834j, gVar.f396834j);
    }

    public final int hashCode() {
        int iD2 = H.d(com.avito.android.actions_sheet.a.g(this.f396826b.f396824a, this.f396825a.hashCode() * 31, 31), 31, this.f396827c);
        String str = this.f396828d;
        int iD3 = H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f396829e);
        Integer num = this.f396830f;
        int iD4 = H.d((iD3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f396831g);
        String str2 = this.f396832h;
        return this.f396834j.hashCode() + H.d((iD4 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f396833i);
    }

    @k
    public final String toString() {
        return "MainSnippetItem(id=" + this.f396825a + ", image=" + this.f396826b + ", currentPrice=" + this.f396827c + ", oldPrice=" + this.f396828d + ", pricePer=" + this.f396829e + ", discount=" + this.f396830f + ", title=" + this.f396831g + ", multiItemParams=" + this.f396832h + ", sellerName=" + this.f396833i + ", stepper=" + this.f396834j + ')';
    }

    public g(@k String str, @k f fVar, @k String str2, @l String str3, @k String str4, @l Integer num, @k String str5, @l String str6, @k String str7, @k Stepper stepper) {
        this.f396825a = str;
        this.f396826b = fVar;
        this.f396827c = str2;
        this.f396828d = str3;
        this.f396829e = str4;
        this.f396830f = num;
        this.f396831g = str5;
        this.f396832h = str6;
        this.f396833i = str7;
        this.f396834j = stepper;
    }

    public /* synthetic */ g(String str, f fVar, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, Stepper stepper, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? new f(new Image(P0.c())) : fVar, (i12 & 4) != 0 ? "" : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? "" : str4, (i12 & 32) != 0 ? null : num, (i12 & 64) != 0 ? "" : str5, (i12 & 128) == 0 ? str6 : null, (i12 & 256) == 0 ? str7 : "", (i12 & 512) != 0 ? new Stepper(1, Integer.MAX_VALUE, null, null, false, 28, null) : stepper);
    }
}
