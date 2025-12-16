package com.avito.android.forceupdate.screens.forceupdaterequired.mvi;

import com.avito.android.di.module.C30134o2;
import com.avito.android.permissions.u;
import com.avito.android.permissions.w;
import com.avito.android.util.C;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ForceUpdateRequiredActor_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/f;", "Ldagger/internal/h;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/e;", "a", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f158517d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final w f158518a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C30134o2 f158519b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<C> f158520c;

    /* compiled from: ForceUpdateRequiredActor_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/f$a;", "", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@Y61.k w wVar, @Y61.k C30134o2 c30134o2, @Y61.k Provider provider) {
        this.f158518a = wVar;
        this.f158519b = c30134o2;
        this.f158520c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        u uVar = (u) this.f158518a.get();
        Bw0.i iVar = (Bw0.i) this.f158519b.get();
        C c12 = this.f158520c.get();
        f158517d.getClass();
        return new e(uVar, iVar, c12);
    }
}
