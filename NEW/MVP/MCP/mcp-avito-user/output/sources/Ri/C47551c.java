package rI;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HistoricalSuggestsApi_Module_ProvideHistoricalSuggestsApiFactory.java */
@e
@y
@x
/* renamed from: rI.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C47551c implements h<InterfaceC47549a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f429723a;

    public C47551c(f fVar) {
        this.f429723a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f429723a.get();
        C47550b.f429722a.getClass();
        InterfaceC47549a interfaceC47549a = (InterfaceC47549a) r02.create(InterfaceC47549a.class);
        t.d(interfaceC47549a);
        return interfaceC47549a;
    }
}
