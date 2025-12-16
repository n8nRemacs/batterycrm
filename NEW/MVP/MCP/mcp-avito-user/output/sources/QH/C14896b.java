package Qh;

import Ui.InterfaceC15523b;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IconTokenMapper_Factory.java */
@e
@y
@x
/* renamed from: Qh.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14896b implements h<com.avito.android.beduin.common.component.label.joiner.token_mapper.iconToken.a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f13983a;

    public C14896b(f fVar) {
        this.f13983a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.beduin.common.component.label.joiner.token_mapper.iconToken.a((InterfaceC15523b) this.f13983a.get());
    }
}
