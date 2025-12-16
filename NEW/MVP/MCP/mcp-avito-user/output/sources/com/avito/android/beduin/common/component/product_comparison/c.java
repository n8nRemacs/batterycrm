package com.avito.android.beduin.common.component.product_comparison;

import Ui.InterfaceC15523b;
import Y61.k;
import com.avito.android.AbstractC35201t;
import com.avito.android.beduin.common.utils.m;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinProductComparisonComponentFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/product_comparison/c;", "Lej/b;", "Lcom/avito/android/beduin/common/component/product_comparison/BeduinProductComparisonModel;", "Lcom/avito/android/beduin/common/component/product_comparison/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements InterfaceC40113b<BeduinProductComparisonModel, a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Th.a f102133a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final m f102134b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AbstractC35201t f102135c;

    @Inject
    public c(@k Th.a aVar, @k m mVar, @k AbstractC35201t abstractC35201t) {
        this.f102133a = aVar;
        this.f102134b = mVar;
        this.f102135c = abstractC35201t;
    }

    @Override // ej.InterfaceC40113b
    public final AbstractC40112a a(BeduinModel beduinModel, lj.e eVar, InterfaceC15523b interfaceC15523b) {
        return new a(interfaceC15523b, (BeduinProductComparisonModel) beduinModel, this.f102133a, this.f102134b, this.f102135c);
    }
}
