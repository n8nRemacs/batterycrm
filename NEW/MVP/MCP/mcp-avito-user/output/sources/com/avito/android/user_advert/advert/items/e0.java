package com.avito.android.user_advert.advert.items;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_advert.advert.u1;
import com.avito.android.util.V2;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MyDetailsDeeplinkStreamHandler.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/e0;", "Lcom/avito/android/user_advert/advert/items/d0;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u1 f309371a;

    /* compiled from: MyDetailsDeeplinkStreamHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "link", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            e0.this.f309371a.a((DeepLink) obj);
        }
    }

    /* compiled from: MyDetailsDeeplinkStreamHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f309373b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    @Inject
    public e0(@Y61.k u1 u1Var, @Y61.k Set<TV0.d<?, ?>> set) {
        this.f309371a = u1Var;
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            if (dVar instanceof com.avito.android.deep_linking.K) {
                io.reactivex.rxjava3.core.z<DeepLink> zVarK = ((com.avito.android.deep_linking.K) dVar).k();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                zVarK.getClass();
                zVarK.C0(300L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b).u0(new a(), b.f309373b);
            }
        }
    }
}
