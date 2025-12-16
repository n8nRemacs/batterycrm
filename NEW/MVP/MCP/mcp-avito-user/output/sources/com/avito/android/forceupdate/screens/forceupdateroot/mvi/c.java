package com.avito.android.forceupdate.screens.forceupdateroot.mvi;

import cN0.C27074c;
import cN0.C27075d;
import com.avito.android.di.module.C30134o2;
import com.avito.android.permissions.u;
import com.avito.android.permissions.w;
import com.avito.android.util.C;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ForceUpdateRootActor_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/c;", "Ldagger/internal/h;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/b;", "a", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f158573e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final w f158574a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C30134o2 f158575b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<C> f158576c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C27075d f158577d;

    /* compiled from: ForceUpdateRootActor_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/c$a;", "", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@Y61.k w wVar, @Y61.k C30134o2 c30134o2, @Y61.k Provider provider, @Y61.k C27075d c27075d) {
        this.f158574a = wVar;
        this.f158575b = c30134o2;
        this.f158576c = provider;
        this.f158577d = c27075d;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        u uVar = (u) this.f158574a.get();
        Bw0.i iVar = (Bw0.i) this.f158575b.get();
        C c12 = this.f158576c.get();
        C27074c c27074c = (C27074c) this.f158577d.get();
        f158573e.getClass();
        return new b(uVar, iVar, c12, c27074c);
    }
}
