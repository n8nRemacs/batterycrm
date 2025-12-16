package d60;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PassportMergeAccountsLinkResultConverter_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: d60.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C39516e implements h<C39514c> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f393666a;

    public C39516e(C30102l3 c30102l3) {
        this.f393666a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C39514c((Context) this.f393666a.get());
    }
}
