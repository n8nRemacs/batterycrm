package com.avito.android.replace_main.onboarding.view;

import androidx.compose.runtime.internal.P;
import com.avito.android.O;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ReplaceMainOnboardingDeps_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/replace_main/onboarding/view/q;", "Ldagger/internal/h;", "Lcom/avito/android/replace_main/onboarding/view/p;", "a", "_avito_replace-main_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f254570e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f254571a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.navigation_config.manager.f f254572b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.onboarding_manager.f> f254573c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final O f254574d;

    /* compiled from: ReplaceMainOnboardingDeps_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/replace_main/onboarding/view/q$a;", "", "<init>", "()V", "_avito_replace-main_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public q(@Y61.k dagger.internal.f fVar, @Y61.k com.avito.android.navigation_config.manager.f fVar2, @Y61.k Provider provider, @Y61.k O o12) {
        this.f254571a = fVar;
        this.f254572b = fVar2;
        this.f254573c = provider;
        this.f254574d = o12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f254571a);
        h31.e eVarB2 = dagger.internal.g.b(this.f254572b);
        h31.e eVarB3 = dagger.internal.g.b(this.f254573c);
        h31.e eVarB4 = dagger.internal.g.b(this.f254574d);
        f254570e.getClass();
        return new p(eVarB, eVarB2, eVarB3, eVarB4);
    }
}
