package com.avito.android.service.short_task.metrics;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AccessibilityInfoProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service/short_task/metrics/a;", "Lcom/avito/android/service/short_task/metrics/n;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.service.short_task.metrics.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34905a implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f274074a;

    @Inject
    public C34905a(@Y61.k c cVar) {
        this.f274074a = cVar;
    }

    @Override // com.avito.android.service.short_task.metrics.n
    @Y61.k
    public final io.reactivex.rxjava3.core.z<m> a() {
        c cVar = this.f274074a;
        return io.reactivex.rxjava3.core.z.V(new m("accessibility_is_on", Boolean.valueOf(cVar.c())), new m("accessibility_talkback", Boolean.valueOf(cVar.a())), new m("accessibility_haptic", Boolean.valueOf(cVar.b())), new m("accessibility_visual", Boolean.valueOf(cVar.d())));
    }
}
