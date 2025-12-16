package VP;

import com.avito.android.job.cv_info_actualization.mvi.j;
import com.avito.android.job.cv_info_actualization.mvi.k;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JsxCvInfoActualizationMviViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final k f17130a;

    public b(k kVar) {
        this.f17130a = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((j) this.f17130a.get(), null, 2, null);
    }
}
