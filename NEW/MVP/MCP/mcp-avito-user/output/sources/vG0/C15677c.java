package Vg0;

import com.avito.android.remote.R0;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingFormApi_Module_ProvideRatingFormApiFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: Vg0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C15677c implements h<InterfaceC15675a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f17355a;

    public C15677c(dagger.internal.f fVar) {
        this.f17355a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f17355a.get();
        C15676b.f17354a.getClass();
        InterfaceC15675a interfaceC15675a = (InterfaceC15675a) r02.create(InterfaceC15675a.class);
        t.d(interfaceC15675a);
        return interfaceC15675a;
    }
}
