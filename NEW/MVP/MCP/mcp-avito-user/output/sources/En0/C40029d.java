package eN0;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VideoPickerModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: eN0.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40029d implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.video_picker.ui.item.video_card.b f395164a;

    public C40029d(com.avito.android.video_picker.ui.item.video_card.b bVar) {
        this.f395164a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.video_picker.ui.item.video_card.a aVar = (com.avito.android.video_picker.ui.item.video_card.a) this.f395164a.get();
        C40027b.f395162a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
