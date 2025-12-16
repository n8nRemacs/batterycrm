package Vd0;

import com.avito.android.publish.C0;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import nF.C44245a;

/* compiled from: HistoricalSuggestNewItemFactory_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: Vd0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C15668c implements h<C15666a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f17322a;

    /* renamed from: b, reason: collision with root package name */
    public final u f17323b;

    public C15668c(u uVar, u uVar2) {
        this.f17322a = uVar;
        this.f17323b = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C15666a((C0) this.f17322a.get(), (C44245a) this.f17323b.get());
    }
}
