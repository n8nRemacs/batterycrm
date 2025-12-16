package Cm;

import Bm.C13162b;
import Bm.c;
import com.avito.android.car_navigator.link.CarNavigatorLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CarNavigatorLinkHandlerModule_ProvideCarNavigatorLinkMappingFactory.java */
@e
@y
@x
/* renamed from: Cm.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13323b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C13162b f2653a;

    public C13323b(C13162b c13162b) {
        this.f2653a = c13162b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C13162b c13162b = this.f2653a;
        C13322a.f2652a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CarNavigatorLink.class, new c(), new C43834a.b.C11809b(c13162b));
    }
}
