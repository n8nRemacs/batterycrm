package com.yandex.div.core.dagger;

import android.content.Context;
import com.yandex.div.core.a0;
import com.yandex.div.core.dagger.InterfaceC37908b;
import h31.d;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: DivKitComponent.kt */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/dagger/q;", "", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@h31.d
/* loaded from: classes7.dex */
public interface q {

    /* compiled from: DivKitComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/dagger/q$a;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface a {
        @Y61.k
        a a(@Y61.k a0 a0Var);

        @h31.b
        @Y61.k
        a b(@Y61.k @Named("application_context") Context context);

        @Y61.k
        C37907a build();
    }

    @Y61.k
    com.yandex.div.histogram.r a();

    @Y61.k
    InterfaceC37908b.a b();
}
