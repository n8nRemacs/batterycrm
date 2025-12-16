package l90;

import android.app.Application;
import com.avito.android.L;
import com.avito.android.O;
import com.avito.android.photo_picker.C33272x;
import com.avito.android.photo_picker.C33273y;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InternalProfileIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f413551a;

    /* renamed from: b, reason: collision with root package name */
    public final O f413552b;

    /* renamed from: c, reason: collision with root package name */
    public final C33273y f413553c;

    public e(dagger.internal.l lVar, O o12, C33273y c33273y) {
        this.f413551a = lVar;
        this.f413552b = o12;
        this.f413553c = c33273y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f413551a.f393949a;
        L l12 = (L) this.f413552b.get();
        this.f413553c.getClass();
        return new d(application, l12, new C33272x());
    }
}
