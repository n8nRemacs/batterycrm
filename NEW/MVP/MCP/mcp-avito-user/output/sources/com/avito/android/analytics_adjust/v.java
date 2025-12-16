package com.avito.android.analytics_adjust;

import android.app.Application;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import io.reactivex.rxjava3.internal.operators.single.W;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GaidInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics_adjust/v;", "Lcom/avito/android/analytics_adjust/u;", "_common_analytics-adjust_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class v implements u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f91248a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f91249b;

    @Inject
    public v(@Y61.k Application application, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f91248a = application;
        this.f91249b = interfaceC35745a5;
    }

    @Override // com.avito.android.analytics_adjust.u
    @Y61.k
    public final W a() {
        return new C42006d(new Ae0.c(this, 22)).z(this.f91249b.a());
    }
}
