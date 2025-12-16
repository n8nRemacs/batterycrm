package com.avito.android.categories_global.mvi;

import Kn.C14332b;
import Kn.InterfaceC14331a;
import androidx.compose.runtime.internal.P;
import dagger.internal.l;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CategoriesActor_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/categories_global/mvi/b;", "Ldagger/internal/h;", "Lcom/avito/android/categories_global/mvi/a;", "a", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<com.avito.android.categories_global.mvi.a> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f116404c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC14331a> f116405a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l f116406b;

    /* compiled from: CategoriesActor_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/categories_global/mvi/b$a;", "", "<init>", "()V", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@Y61.k l lVar, @Y61.k Provider provider) {
        this.f116405a = provider;
        this.f116406b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14331a interfaceC14331a = this.f116405a.get();
        C14332b c14332b = (C14332b) this.f116406b.f393949a;
        f116404c.getClass();
        return new com.avito.android.categories_global.mvi.a(interfaceC14331a, c14332b);
    }
}
