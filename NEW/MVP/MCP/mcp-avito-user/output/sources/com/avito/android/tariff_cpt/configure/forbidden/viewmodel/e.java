package com.avito.android.tariff_cpt.configure.forbidden.viewmodel;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.internal.operators.single.W;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CptForbiddenRepository.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/forbidden/viewmodel/e;", "Lcom/avito/android/tariff_cpt/configure/forbidden/viewmodel/d;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final JC0.a f297630a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f297631b;

    @Inject
    public e(@Y61.k JC0.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f297630a = aVar;
        this.f297631b = interfaceC35745a5;
    }

    @Override // com.avito.android.tariff_cpt.configure.forbidden.viewmodel.d
    @Y61.k
    public final W a(@l String str) {
        return g1.a(this.f297630a.e(str)).z(this.f297631b.a());
    }
}
