package com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.input;

import Dn0.InterfaceC13421a;
import Y41.l;
import com.avito.android.category_parameters.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InputItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "input", "Lkotlin/G0;", "invoke", "(Ljava/lang/CharSequence;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements l<CharSequence, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.p f256207l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f256208m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ParameterElement.p pVar, e eVar) {
        super(1);
        this.f256207l = pVar;
        this.f256208m = eVar;
    }

    @Override // Y41.l
    public final G0 invoke(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        this.f256207l.f117481f = charSequence2 != null ? charSequence2.toString() : null;
        this.f256208m.f256209b.a(new InterfaceC13421a.b(charSequence2));
        return G0.f406611a;
    }
}
