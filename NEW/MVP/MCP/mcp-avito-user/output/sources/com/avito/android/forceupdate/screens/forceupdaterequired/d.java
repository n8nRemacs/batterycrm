package com.avito.android.forceupdate.screens.forceupdaterequired;

import Y61.k;
import com.avito.android.forceupdate.screens.forceupdaterequired.mvi.j;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ForceUpdateRequiredViewModel_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/d;", "Ldagger/internal/h;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/c;", "a", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements h<c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f158488b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.forceupdate.screens.forceupdaterequired.mvi.k f158489a;

    /* compiled from: ForceUpdateRequiredViewModel_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/d$a;", "", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k com.avito.android.forceupdate.screens.forceupdaterequired.mvi.k kVar) {
        this.f158489a = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j jVar = (j) this.f158489a.get();
        f158488b.getClass();
        return new c(jVar, null, 2, null);
    }
}
