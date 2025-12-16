package zH0;

import android.content.res.Resources;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MyAdvertDetailsFeatureTeaserResourceProvider_Factory.java */
@e
@y
@x
/* renamed from: zH0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50467b implements h<C50466a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f444005a;

    public C50467b(l lVar) {
        this.f444005a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C50466a((Resources) this.f444005a.f393949a);
    }
}
