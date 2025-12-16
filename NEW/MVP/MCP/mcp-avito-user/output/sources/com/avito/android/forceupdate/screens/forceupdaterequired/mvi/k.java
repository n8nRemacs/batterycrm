package com.avito.android.forceupdate.screens.forceupdaterequired.mvi;

import com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredState;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ForceUpdateRequiredFeatureBuilder_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/k;", "Ldagger/internal/h;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/j;", "a", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f158531e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f158532a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f f158533b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final m f158534c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final o f158535d;

    /* compiled from: ForceUpdateRequiredFeatureBuilder_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/k$a;", "", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k h hVar, @Y61.k f fVar, @Y61.k m mVar, @Y61.k o oVar) {
        this.f158532a = hVar;
        this.f158533b = fVar;
        this.f158534c = mVar;
        this.f158535d = oVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f158532a.get();
        e eVar = (e) this.f158533b.get();
        this.f158534c.getClass();
        l lVar = new l();
        this.f158535d.getClass();
        n nVar = new n();
        f158531e.getClass();
        ForceUpdateRequiredState.f158514c.getClass();
        return new j("ForceUpdateRequired", ForceUpdateRequiredState.f158515d, new i(gVar, eVar, lVar, nVar));
    }
}
