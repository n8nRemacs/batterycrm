package com.avito.android.publish.analytics;

import com.avito.android.publish.analytics.InterfaceC33535v;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishInputsAnalyticTracker.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement;", "T", "", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
public final class K<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f232174b;

    public K(F f12) {
        this.f232174b = f12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InterfaceC33535v.a.b(this.f232174b.f232143a, "observeSelectValueChanges failed", (Throwable) obj, 4);
    }
}
