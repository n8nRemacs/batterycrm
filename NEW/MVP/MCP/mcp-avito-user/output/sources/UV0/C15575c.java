package Uv0;

import com.avito.android.shift_list.ShiftListDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ShiftListDeeplinkHandlerModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: Uv0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15575c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f16779a;

    public C15575c(d dVar) {
        this.f16779a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C15574b.f16778a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ShiftListDeeplink.class, new e(), new C43834a.b.C11809b(this.f16779a));
    }
}
