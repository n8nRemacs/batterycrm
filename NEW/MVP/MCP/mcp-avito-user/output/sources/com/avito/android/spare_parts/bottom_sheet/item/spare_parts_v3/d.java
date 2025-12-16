package com.avito.android.spare_parts.bottom_sheet.item.spare_parts_v3;

import Y61.k;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SparePartsV3Blueprint_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/item/spare_parts_v3/d;", "Ldagger/internal/h;", "Lcom/avito/android/spare_parts/bottom_sheet/item/spare_parts_v3/c;", "a", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements h<c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f284780b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final b f284781a;

    /* compiled from: SparePartsV3Blueprint_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/item/spare_parts_v3/d$a;", "", "<init>", "()V", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k b bVar) {
        this.f284781a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.spare_parts.bottom_sheet.item.spare_parts_v3.a aVar = (com.avito.android.spare_parts.bottom_sheet.item.spare_parts_v3.a) this.f284781a.get();
        f284780b.getClass();
        return new c(aVar);
    }
}
