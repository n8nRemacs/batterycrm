package com.avito.android.home;

import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.T;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: HomeTooltipRelay.kt */
@Singleton
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/home/q;", "Lcom/avito/android/home/p;", "Lcom/avito/android/home/o;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ContributesBinding.b
/* loaded from: classes13.dex */
public final class q implements p, o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e2 f162473a = f2.b(0, 1, BufferOverflow.f410778c, 1);

    @Inject
    public q() {
    }

    @Override // com.avito.android.home.p
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final e2 getF162473a() {
        return this.f162473a;
    }

    @Override // com.avito.android.home.o
    public final void b(@Y61.k NavigationTab navigationTab, @Y61.k String str, @Y61.l Integer num, @Y61.l Integer num2) {
        this.f162473a.K5(new T(navigationTab, null, com.avito.android.printable_text.b.f(str), null, Boolean.FALSE, null, -2, Integer.valueOf(num2 != null ? num2.intValue() : 0), num, 42, null));
    }
}
