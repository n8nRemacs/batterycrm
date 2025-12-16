package com.avito.android.tariff_lf_constructor.configure.setting.viewmodel;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import wD0.C49488b;

/* compiled from: ConstructorSettingViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class u<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f300232b;

    public u(m mVar) {
        this.f300232b = mVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m mVar = this.f300232b;
        mVar.f300222g0 = zBooleanValue;
        Iterable iterable = (Iterable) mVar.f300221f0;
        ArrayList arrayList = new ArrayList();
        for (T t12 : iterable) {
            if (t12 instanceof com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.c) {
                arrayList.add(t12);
            }
        }
        com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.c cVar = (com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.c) C42745f0.G(arrayList);
        C49488b c49488b = cVar != null ? cVar.f300150i : null;
        if (c49488b == null) {
            return;
        }
        c49488b.c(zBooleanValue);
    }
}
