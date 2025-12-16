package YQ;

import com.avito.android.language_selector.LanguageSyncBackgroundTask;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LanguageSyncBackgroundTask_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements h<LanguageSyncBackgroundTask> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.language_selector.domain.f f19471a;

    public e(com.avito.android.language_selector.domain.f fVar) {
        this.f19471a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new LanguageSyncBackgroundTask((com.avito.android.language_selector.domain.d) this.f19471a.get());
    }
}
