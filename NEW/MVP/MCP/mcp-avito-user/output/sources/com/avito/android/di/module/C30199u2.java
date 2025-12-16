package com.avito.android.di.module;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.C36135w2;
import javax.inject.Provider;

/* compiled from: CarouselItemModule_ProvideItemsCarouselRecycledViewPoolFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.u2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30199u2 implements dagger.internal.h<RecyclerView.t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C36135w2> f144611a;

    public C30199u2(Provider<C36135w2> provider) {
        this.f144611a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C36135w2 c36135w2 = this.f144611a.get();
        C30188t2.f144587a.getClass();
        kotlin.reflect.n<Object> nVar = C36135w2.f327457X[26];
        if (((Boolean) c36135w2.f327502w.a().getValue()).booleanValue()) {
            return new RecyclerView.t();
        }
        return null;
    }
}
