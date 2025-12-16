package com.avito.android.imv_similiar_adverts.item.header;

import Y61.k;
import dagger.internal.h;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImvHeaderBlueprint_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/item/header/b;", "Ldagger/internal/h;", "Lcom/avito/android/imv_similiar_adverts/item/header/a;", "a", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements h<com.avito.android.imv_similiar_adverts.item.header.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f170871b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f170872a;

    /* compiled from: ImvHeaderBlueprint_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/item/header/b$a;", "", "<init>", "()V", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@k u uVar) {
        this.f170872a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f170872a.get();
        f170871b.getClass();
        return new com.avito.android.imv_similiar_adverts.item.header.a(cVar);
    }
}
