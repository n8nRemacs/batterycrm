package gn;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.cart_sheet_after_adding.ui.Q;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CartSheetAfterAddingState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgn/i;", "", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f396837a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f f396838b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f396839c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f396840d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f396841e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Q f396842f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Stepper f396843g;

    public i(@k String str, @k f fVar, @k String str2, @l String str3, @k String str4, @k Q q12, @k Stepper stepper) {
        this.f396837a = str;
        this.f396838b = fVar;
        this.f396839c = str2;
        this.f396840d = str3;
        this.f396841e = str4;
        this.f396842f = q12;
        this.f396843g = stepper;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f396837a, iVar.f396837a) && L.f(this.f396838b, iVar.f396838b) && L.f(this.f396839c, iVar.f396839c) && L.f(this.f396840d, iVar.f396840d) && L.f(this.f396841e, iVar.f396841e) && L.f(this.f396842f, iVar.f396842f) && L.f(this.f396843g, iVar.f396843g);
    }

    public final int hashCode() {
        int iD2 = H.d(com.avito.android.actions_sheet.a.g(this.f396838b.f396824a, this.f396837a.hashCode() * 31, 31), 31, this.f396839c);
        String str = this.f396840d;
        return this.f396843g.hashCode() + ((this.f396842f.hashCode() + H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f396841e)) * 31);
    }

    @k
    public final String toString() {
        return "SnippetItem(id=" + this.f396837a + ", image=" + this.f396838b + ", currentPrice=" + this.f396839c + ", oldPrice=" + this.f396840d + ", title=" + this.f396841e + ", seller=" + this.f396842f + ", stepper=" + this.f396843g + ')';
    }
}
