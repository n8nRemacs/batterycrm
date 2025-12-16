package k50;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GeneralTabModule_ProvideOrdersTabLabelFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: k50.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C42508b implements h<String> {

    /* renamed from: a, reason: collision with root package name */
    public final C42507a f406085a;

    public C42508b(C42507a c42507a) {
        this.f406085a = c42507a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f406085a.getClass();
        return "goods_orders";
    }
}
