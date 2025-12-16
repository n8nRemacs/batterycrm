package Gt;

import Bx0.C13204e;
import Bx0.InterfaceC13200a;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CvUploadedOpenDraftDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<C13915a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f6763a;

    /* renamed from: b, reason: collision with root package name */
    public final C13204e f6764b;

    public b(f fVar, C13204e c13204e) {
        this.f6763a = fVar;
        this.f6764b = c13204e;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C13915a((com.avito.android.deeplink_handler.handler.composite.a) this.f6763a.get(), (InterfaceC13200a) this.f6764b.get());
    }
}
