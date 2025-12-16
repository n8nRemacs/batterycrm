package com.avito.android.passport.profile_add.merge.code_confirm.view_state;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.passport.profile_add.merge.code_confirm.view_state.a;
import com.avito.android.passport.profile_add.merge.code_confirm.view_state.e;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CodeConfirmViewState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_confirm/view_state/b;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class b extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f212812b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final PrintableText f212813c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final e f212814d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a f212815e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f212816f;

    public b() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f212812b, bVar.f212812b) && L.f(this.f212813c, bVar.f212813c) && L.f(this.f212814d, bVar.f212814d) && L.f(this.f212815e, bVar.f212815e);
    }

    public final int hashCode() {
        int iHashCode = this.f212812b.hashCode() * 31;
        PrintableText printableText = this.f212813c;
        return this.f212815e.hashCode() + ((this.f212814d.hashCode() + ((iHashCode + (printableText == null ? 0 : printableText.hashCode())) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "CodeConfirmViewState(phone=" + this.f212812b + ", codeValidationError=" + this.f212813c + ", codeRequestBtnState=" + this.f212814d + ", codeConfirmBtnState=" + this.f212815e + ')';
    }

    public /* synthetic */ b(String str, PrintableText printableText, e eVar, a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? null : printableText, (i12 & 4) != 0 ? new e.a(0L, 1, null) : eVar, (i12 & 8) != 0 ? a.C6365a.f212809a : aVar);
    }

    public b(@k String str, @l PrintableText printableText, @k e eVar, @k a aVar) {
        this.f212812b = str;
        this.f212813c = printableText;
        this.f212814d = eVar;
        this.f212815e = aVar;
        this.f212816f = ((eVar instanceof e.b) || (aVar instanceof a.b)) ? false : true;
    }
}
