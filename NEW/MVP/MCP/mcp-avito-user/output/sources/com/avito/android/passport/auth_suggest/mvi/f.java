package com.avito.android.passport.auth_suggest.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.passport.auth_suggest.entity.PassportAuthSuggestInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PassportAuthSuggestFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LF50/a;", "Lcom/avito/android/passport/auth_suggest/entity/PassportAuthSuggestInternalAction;", "LF50/c;", "LF50/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f extends N implements Y41.l<q<F50.a, PassportAuthSuggestInternalAction, F50.c, F50.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f211037l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f211038m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f211039n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f211040o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f211041p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f211037l = dVar;
        this.f211038m = bVar;
        this.f211039n = screenPerformanceTracker;
        this.f211040o = kVar;
        this.f211041p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<F50.a, PassportAuthSuggestInternalAction, F50.c, F50.b> qVar) {
        q<F50.a, PassportAuthSuggestInternalAction, F50.c, F50.b> qVar2 = qVar;
        qVar2.f92008d = this.f211037l;
        qVar2.f92009e = this.f211038m;
        qVar2.f92011g = new o(this.f211039n, this.f211040o);
        qVar2.f92010f = this.f211041p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
