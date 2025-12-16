package aq0;

import com.avito.android.select.i;
import com.avito.android.select.j;
import com.google.gson.Gson;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectDialogLogoStorageModule_ProvideSelectDialogLogoStorageInteractorFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: aq0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23656e implements h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Gson> f56255a;

    /* renamed from: b, reason: collision with root package name */
    public final u f56256b;

    public C23656e(u uVar, Provider provider) {
        this.f56255a = provider;
        this.f56256b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Gson gson = this.f56255a.get();
        h31.e eVarA = g.a(w.a(this.f56256b));
        C23654c c23654c = C23654c.f56253a;
        return new j(gson, eVarA);
    }
}
