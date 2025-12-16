package uR;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LfLevelsDeeplinkHandler_Factory.java */
@e
@y
@x
/* renamed from: uR.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48941d implements h<C48939b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f439965a;

    public C48941d(dv.b bVar) {
        this.f439965a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C48939b((a.d) this.f439965a.get());
    }
}
