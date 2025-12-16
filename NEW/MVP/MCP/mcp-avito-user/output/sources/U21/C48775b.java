package u21;

import com.yandex.div.core.A;
import dagger.internal.e;
import dagger.internal.h;
import java.util.List;

/* compiled from: DivExtensionController_Factory.java */
@e
/* renamed from: u21.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C48775b implements h<C48774a> {

    /* renamed from: a, reason: collision with root package name */
    public final A f439735a;

    public C48775b(A a12) {
        this.f439735a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C48774a((List) this.f439735a.get());
    }
}
