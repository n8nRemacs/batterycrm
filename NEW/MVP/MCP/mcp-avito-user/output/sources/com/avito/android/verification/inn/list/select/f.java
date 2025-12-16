package com.avito.android.verification.inn.list.select;

import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.serp_advert_card.A;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f324082l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SelectItem f324083m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, SelectItem selectItem) {
        super(0);
        this.f324082l = kVar;
        this.f324083m = selectItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        k kVar = this.f324082l;
        kVar.f324096d = null;
        AttributedText attributedText = this.f324083m.f324064h;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(null);
        }
        kVar.f324094b.setOnClickListener(new A(23, e.f324081l));
        return G0.f406611a;
    }
}
