package com.avito.android.tariff_lf_constructor.configure.setting.viewmodel;

import com.avito.android.util.P2;
import kotlin.Metadata;
import wD0.C49488b;

/* compiled from: ConstructorSettingViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2$b;", "LwD0/e;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class q<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f300228b;

    public q(m mVar) {
        this.f300228b = mVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C49488b autoProlong;
        wD0.d totalInfo = ((wD0.e) ((P2.b) obj).f318720a).getTotalInfo();
        this.f300228b.f300222g0 = (totalInfo == null || (autoProlong = totalInfo.getAutoProlong()) == null) ? false : autoProlong.getEnabled();
    }
}
