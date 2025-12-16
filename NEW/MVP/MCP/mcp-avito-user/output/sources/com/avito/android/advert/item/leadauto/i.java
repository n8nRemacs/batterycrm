package com.avito.android.advert.item.leadauto;

import android.view.ContextThemeWrapper;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AutoNewCarsLeadFormItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "result", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class i extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f77290l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ContextThemeWrapper f77291m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d dVar, AutoNewCarsLeadFormItem autoNewCarsLeadFormItem, ContextThemeWrapper contextThemeWrapper) {
        super(1);
        this.f77290l = dVar;
        this.f77291m = contextThemeWrapper;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        if (str2 != null) {
            int i12 = d.f77271f;
            com.avito.android.util.concurrent.b.a(new l(this.f77290l, str2, this.f77291m));
        }
        return G0.f406611a;
    }
}
