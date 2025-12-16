package Rc;

import Qc.c;
import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FirebaseModule_ProvideFirebaseAnalyticsFacadeFactory.java */
@e
@y
@x
/* renamed from: Rc.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15029b implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final C15028a f14527a;

    /* renamed from: b, reason: collision with root package name */
    public final C30102l3 f14528b;

    public C15029b(C15028a c15028a, C30102l3 c30102l3) {
        this.f14527a = c15028a;
        this.f14528b = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f14528b.get();
        this.f14527a.getClass();
        return new c(context);
    }
}
