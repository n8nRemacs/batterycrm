package YQ;

import com.avito.android.language_selector.LanguageSyncForegroundTask;
import com.avito.android.language_selector.domain.i;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LanguageSyncForegroundTask_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements h<LanguageSyncForegroundTask> {

    /* renamed from: a, reason: collision with root package name */
    public final i f19472a;

    /* renamed from: b, reason: collision with root package name */
    public final l f19473b;

    public f(i iVar, l lVar) {
        this.f19472a = iVar;
        this.f19473b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new LanguageSyncForegroundTask((com.avito.android.language_selector.domain.g) this.f19472a.get(), dagger.internal.g.b(this.f19473b));
    }
}
