package com.avito.android.publish;

import androidx.view.P0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import dl0.InterfaceC39749a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublishPriceAbuseInteractor.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/M;", "Landroidx/lifecycle/P0$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class M implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39749a f231935a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f231936b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f231937c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.Z0 f231938d;

    @Inject
    public M(@Y61.k InterfaceC39749a interfaceC39749a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.Z0 z02) {
        this.f231935a = interfaceC39749a;
        this.f231936b = interfaceC35745a5;
        this.f231937c = interfaceC28373a;
        this.f231938d = z02;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends androidx.view.M0> T create(@Y61.k Class<T> cls) {
        if (cls.isAssignableFrom(C34152x0.class)) {
            return new C34152x0(this.f231935a, this.f231936b, this.f231937c, this.f231938d);
        }
        throw new IllegalArgumentException(cls.toString());
    }
}
