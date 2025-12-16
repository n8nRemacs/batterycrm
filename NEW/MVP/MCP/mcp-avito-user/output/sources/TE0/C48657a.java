package te0;

import androidx.fragment.app.FragmentManager;
import androidx.view.InterfaceC22983P;
import com.avito.android.publish.objects.result.ObjectsFragmentResultImpl;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ObjectsFragmentResultImpl_Factory.java */
@e
@y
@x
/* renamed from: te0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C48657a implements h<ObjectsFragmentResultImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<FragmentManager> f439368a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC22983P> f439369b;

    public C48657a(Provider<FragmentManager> provider, Provider<InterfaceC22983P> provider2) {
        this.f439368a = provider;
        this.f439369b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new ObjectsFragmentResultImpl(this.f439368a.get(), this.f439369b.get());
    }
}
