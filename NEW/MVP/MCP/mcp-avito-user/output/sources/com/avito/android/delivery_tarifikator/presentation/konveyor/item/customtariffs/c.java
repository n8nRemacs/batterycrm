package com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs;

import Sv.C15244c;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CustomTariffsBlueprint_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/customtariffs/c;", "Ldagger/internal/h;", "Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/customtariffs/b;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f135360d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f135361a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Sv.d f135362b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C15244c f135363c;

    /* compiled from: CustomTariffsBlueprint_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/customtariffs/c$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@Y61.k i iVar, @Y61.k Sv.d dVar, @Y61.k C15244c c15244c) {
        this.f135361a = iVar;
        this.f135362b = dVar;
        this.f135363c = c15244c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f135361a.get();
        RecyclerView.l lVar = (RecyclerView.l) this.f135363c.get();
        f135360d.getClass();
        return new b(gVar, this.f135362b, lVar);
    }
}
