package com.avito.android.beduin.v2.page.impl;

import androidx.compose.runtime.internal.P;
import com.avito.android.C29270c0;
import com.avito.android.C30276e0;
import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import com.avito.android.lib.beduin_v2.feature.di.C31151u0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.util.R0;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinV2PageViewModel_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/A;", "Ldagger/internal/h;", "Lcom/avito/android/beduin/v2/page/impl/y;", "a", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class A implements dagger.internal.h<y> {

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final a f104814i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<n.a> f104815a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.beduin.v2.engine.component.B> f104816b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<Set<FV0.h>> f104817c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C31144q0 f104818d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f104819e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f104820f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C31151u0 f104821g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C30276e0 f104822h;

    /* compiled from: BeduinV2PageViewModel_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/A$a;", "", "<init>", "()V", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public A(@Y61.k C30276e0 c30276e0, @Y61.k C31144q0 c31144q0, @Y61.k C31151u0 c31151u0, @Y61.k dagger.internal.l lVar, @Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3, @Y61.k Provider provider4) {
        this.f104815a = provider;
        this.f104816b = provider2;
        this.f104817c = provider3;
        this.f104818d = c31144q0;
        this.f104819e = provider4;
        this.f104820f = lVar;
        this.f104821g = c31151u0;
        this.f104822h = c30276e0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        n.a aVar = this.f104815a.get();
        com.avito.beduin.v2.engine.component.B b12 = this.f104816b.get();
        Set<FV0.h> set = this.f104817c.get();
        aU0.b bVar = (aU0.b) this.f104818d.get();
        R0 r02 = this.f104819e.get();
        String str = (String) this.f104820f.f393949a;
        ZS.b bVar2 = (ZS.b) this.f104821g.get();
        C29270c0 c29270c0 = (C29270c0) this.f104822h.get();
        f104814i.getClass();
        return new y(bVar2, bVar, c29270c0, aVar, r02, b12, str, set);
    }
}
