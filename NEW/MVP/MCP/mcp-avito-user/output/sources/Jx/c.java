package JX;

import com.avito.android.C36135w2;
import com.avito.android.C36168y2;
import com.avito.android.account.E;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MainStartOnboardingAuthorizationCheckerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<E> f9014a;

    /* renamed from: b, reason: collision with root package name */
    public final C36168y2 f9015b;

    public c(Provider provider, C36168y2 c36168y2) {
        this.f9014a = provider;
        this.f9015b = c36168y2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f9014a.get(), (C36135w2) this.f9015b.get());
    }
}
