package com.yandex.div.core.state;

import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.avito.android.publish.objects.C33947g;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import t21.InterfaceC48467b;

/* compiled from: DivStateChangeListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/state/a;", "Lcom/yandex/div/core/state/c;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@InterfaceC48467b
/* loaded from: classes7.dex */
public final class a implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<ViewGroup> f367652b;

    @X41.j
    public a(@Y61.k Provider<ViewGroup> provider, @Y61.k Interpolator interpolator) {
        this.f367652b = provider;
    }

    public /* synthetic */ a(Provider provider, Interpolator interpolator, int i12, C42822w c42822w) {
        this(provider, (i12 & 2) != 0 ? new com.yandex.div.core.animation.h() : interpolator);
    }

    public a(ViewGroup viewGroup, Interpolator interpolator, int i12, C42822w c42822w) {
        this(new C33947g(viewGroup, 2), (i12 & 2) != 0 ? new com.yandex.div.core.animation.h() : interpolator);
    }
}
