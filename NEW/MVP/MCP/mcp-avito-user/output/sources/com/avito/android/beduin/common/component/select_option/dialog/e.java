package com.avito.android.beduin.common.component.select_option.dialog;

import Y41.l;
import Y61.k;
import com.avito.android.beduin.common.component.select_option.Option;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: OptionItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/select_option/dialog/e;", "LTV0/d;", "Lcom/avito/android/beduin/common/component/select_option/dialog/f;", "Lcom/avito/android/beduin/common/component/select_option/dialog/OptionItem;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements TV0.d<f, OptionItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final N f102486b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k l<? super Option, G0> lVar) {
        this.f102486b = (N) lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        OptionItem optionItem = (OptionItem) aVar;
        Option option = optionItem.f102479d;
        fVar.setText(option.getName());
        fVar.Np(L.f(optionItem.f102478c, option.getId()));
        fVar.c(new d(this, optionItem));
    }
}
