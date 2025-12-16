package com.avito.android.replace_main.exit_onboarding;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.w;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ReplaceMainExitOnboardingInteractorImpl_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/replace_main/exit_onboarding/f;", "Ldagger/internal/h;", "Lcom/avito/android/replace_main/exit_onboarding/c;", "a", "_avito_replace-main_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements h<c> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f254512e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final W20.g f254513a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.navigation_config.manager.f f254514b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Provider<R0> f254515c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final u f254516d;

    /* compiled from: ReplaceMainExitOnboardingInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/replace_main/exit_onboarding/f$a;", "", "<init>", "()V", "_avito_replace-main_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@k W20.g gVar, @k com.avito.android.navigation_config.manager.f fVar, @k Provider provider, @k u uVar) {
        this.f254513a = gVar;
        this.f254514b = fVar;
        this.f254515c = provider;
        this.f254516d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        U20.d dVar = (U20.d) this.f254513a.get();
        U20.c cVar = (U20.c) this.f254514b.get();
        R0 r02 = this.f254515c.get();
        h31.e eVarA = dagger.internal.g.a(w.a(this.f254516d));
        f254512e.getClass();
        return new c(dVar, cVar, r02, eVarA);
    }
}
