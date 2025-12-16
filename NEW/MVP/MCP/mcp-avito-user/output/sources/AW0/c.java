package Aw0;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ShortcutBarInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.shortcut_navigation_bar.splitter.features.d f707a;

    public c(com.avito.android.shortcut_navigation_bar.splitter.features.d dVar) {
        this.f707a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.shortcut_navigation_bar.splitter.features.a) this.f707a.get());
    }
}
