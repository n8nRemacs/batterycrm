package fi;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.p;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Map;

/* compiled from: BeduinParametersExtractor_Factory.java */
@e
@y
@x
/* renamed from: fi.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C40425b implements h<C40424a> {

    /* renamed from: a, reason: collision with root package name */
    public final p f396062a;

    public C40425b(p pVar) {
        this.f396062a = pVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C40424a((Map) this.f396062a.get());
    }
}
