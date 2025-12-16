package com.avito.android.forceupdate.screens.forceupdateroot.mvi;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ForceUpdateRootFeatureBuilder_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/j;", "Ldagger/internal/h;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/i;", "a", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f158610e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f158611a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c f158612b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l f158613c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final n f158614d;

    /* compiled from: ForceUpdateRootFeatureBuilder_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/j$a;", "", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public j(@Y61.k g gVar, @Y61.k c cVar, @Y61.k l lVar, @Y61.k n nVar) {
        this.f158611a = gVar;
        this.f158612b = cVar;
        this.f158613c = lVar;
        this.f158614d = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f158611a.get();
        b bVar = (b) this.f158612b.get();
        this.f158613c.getClass();
        k kVar = new k();
        this.f158614d.getClass();
        m mVar = new m();
        f158610e.getClass();
        OE.c.f12095c.getClass();
        return new i("ForceUpdateRoot", OE.c.f12096d, new h(eVar, bVar, kVar, mVar));
    }
}
