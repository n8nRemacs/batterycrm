package com.avito.android.beduin.v2.page.impl.compose;

import androidx.compose.runtime.internal.P;
import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import com.avito.android.lib.beduin_v2.feature.di.C31151u0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.component.B;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinV2PageComposeViewModel_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/compose/i;", "Ldagger/internal/h;", "Lcom/avito/android/beduin/v2/page/impl/compose/d;", "a", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<d> {

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final a f104973i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<n.a> f104974a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<B> f104975b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<Set<FV0.h>> f104976c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C31144q0 f104977d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f104978e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f104979f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C31151u0 f104980g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.v2.page.impl.compose.mvi.e f104981h;

    /* compiled from: BeduinV2PageComposeViewModel_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/compose/i$a;", "", "<init>", "()V", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public i(@Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3, @Y61.k C31144q0 c31144q0, @Y61.k Provider provider4, @Y61.k dagger.internal.l lVar, @Y61.k C31151u0 c31151u0, @Y61.k com.avito.android.beduin.v2.page.impl.compose.mvi.e eVar) {
        this.f104974a = provider;
        this.f104975b = provider2;
        this.f104976c = provider3;
        this.f104977d = c31144q0;
        this.f104978e = provider4;
        this.f104979f = lVar;
        this.f104980g = c31151u0;
        this.f104981h = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        n.a aVar = this.f104974a.get();
        B b12 = this.f104975b.get();
        Set<FV0.h> set = this.f104976c.get();
        aU0.b bVar = (aU0.b) this.f104977d.get();
        R0 r02 = this.f104978e.get();
        String str = (String) this.f104979f.f393949a;
        ZS.b bVar2 = (ZS.b) this.f104980g.get();
        com.avito.android.beduin.v2.page.impl.compose.mvi.d dVar = (com.avito.android.beduin.v2.page.impl.compose.mvi.d) this.f104981h.get();
        f104973i.getClass();
        return new d(aVar, b12, set, bVar, r02, str, bVar2, dVar);
    }
}
