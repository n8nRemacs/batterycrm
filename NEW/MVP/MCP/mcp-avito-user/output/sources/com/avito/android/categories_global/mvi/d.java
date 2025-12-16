package com.avito.android.categories_global.mvi;

import Kn.C14332b;
import Kn.InterfaceC14331a;
import androidx.compose.runtime.internal.P;
import dagger.internal.l;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CategoriesBootstrap_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/categories_global/mvi/d;", "Ldagger/internal/h;", "Lcom/avito/android/categories_global/mvi/c;", "a", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f116410d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l f116411a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l f116412b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC14331a> f116413c;

    /* compiled from: CategoriesBootstrap_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/categories_global/mvi/d$a;", "", "<init>", "()V", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@Y61.k l lVar, @Y61.k l lVar2, @Y61.k Provider provider) {
        this.f116411a = lVar;
        this.f116412b = lVar2;
        this.f116413c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        boolean zBooleanValue = ((Boolean) this.f116411a.f393949a).booleanValue();
        C14332b c14332b = (C14332b) this.f116412b.f393949a;
        InterfaceC14331a interfaceC14331a = this.f116413c.get();
        f116410d.getClass();
        return new c(zBooleanValue, c14332b, interfaceC14331a);
    }
}
