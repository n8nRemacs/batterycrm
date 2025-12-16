package com.avito.android.deeplink_handler.view.lifecycle;

import dagger.internal.A;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ActivityNavigatorLifecycleDeeplinkView_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/view/lifecycle/b;", "Ldagger/internal/h;", "Lcom/avito/android/deeplink_handler/view/lifecycle/a;", "a", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<com.avito.android.deeplink_handler.view.lifecycle.a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f134650b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A f134651a;

    /* compiled from: ActivityNavigatorLifecycleDeeplinkView_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/view/lifecycle/b$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@Y61.k A a12) {
        this.f134651a = a12;
    }

    @X41.n
    @Y61.k
    public static final b a(@Y61.k A a12) {
        f134650b.getClass();
        return new b(a12);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Set set = (Set) this.f134651a.get();
        f134650b.getClass();
        return new com.avito.android.deeplink_handler.view.lifecycle.a(set);
    }
}
