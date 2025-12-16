package com.avito.android.forceupdate.screens.forceupdateroot;

import Y61.k;
import com.avito.android.forceupdate.screens.forceupdateroot.mvi.i;
import com.avito.android.forceupdate.screens.forceupdateroot.mvi.j;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ForceUpdateRootViewModel_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/f;", "Ldagger/internal/h;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/e;", "a", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements h<e> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f158562b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f158563a;

    /* compiled from: ForceUpdateRootViewModel_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/f$a;", "", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@k j jVar) {
        this.f158563a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f158563a.get();
        f158562b.getClass();
        return new e(iVar, null, 2, null);
    }
}
