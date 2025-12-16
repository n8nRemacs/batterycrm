package dagger.internal;

import javax.inject.Provider;

/* compiled from: Providers.java */
/* loaded from: classes8.dex */
public final class w {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Providers.java */
    public class a<T> implements u<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Provider f393952a;

        public a(Provider provider) {
            this.f393952a = provider;
        }

        @Override // javax.inject.Provider
        public final T get() {
            return (T) this.f393952a.get();
        }
    }

    public static <T> u<T> a(Provider<T> provider) {
        provider.getClass();
        return new a(provider);
    }
}
