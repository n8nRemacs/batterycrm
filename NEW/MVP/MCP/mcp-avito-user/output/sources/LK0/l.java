package LK0;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FormatterV1Module_ProvideTextIconAttributeFormatterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class l implements dagger.internal.h<CK0.a<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<IK0.a> f9916a;

    public l(Provider<IK0.a> provider) {
        this.f9916a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        IK0.a aVar = this.f9916a.get();
        b.f9902a.getClass();
        return new com.avito.android.util.text.attribute_formatter.text_icon.c(aVar);
    }
}
