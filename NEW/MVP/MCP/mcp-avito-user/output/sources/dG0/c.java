package DG0;

import com.avito.android.L;
import com.avito.android.O;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TransactionIntentFactoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final O f3127a;

    public c(O o12) {
        this.f3127a = o12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((L) this.f3127a.get());
    }
}
