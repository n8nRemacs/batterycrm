package TW;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BadgeBarShowV3LinkSyncHandler_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f15695a;

    public c(dv.b bVar) {
        this.f15695a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.d) this.f15695a.get());
    }
}
