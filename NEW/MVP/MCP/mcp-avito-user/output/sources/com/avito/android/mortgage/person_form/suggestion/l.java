package com.avito.android.mortgage.person_form.suggestion;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SuggestionFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class l extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f201406l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SuggestionFragment f201407m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InterfaceC22204y1 interfaceC22204y1, SuggestionFragment suggestionFragment) {
        super(2);
        this.f201406l = interfaceC22204y1;
        this.f201407m = suggestionFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            H00.c cVar = (H00.c) this.f201406l.getF42167b();
            SuggestionFragment suggestionFragment = this.f201407m;
            u.a(cVar, new C32673g(suggestionFragment), new C32674h(suggestionFragment), new C32675i(suggestionFragment), new C32676j(suggestionFragment), new k(suggestionFragment), a13, 0);
        }
        return G0.f406611a;
    }
}
