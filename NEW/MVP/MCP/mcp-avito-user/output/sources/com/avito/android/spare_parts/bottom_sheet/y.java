package com.avito.android.spare_parts.bottom_sheet;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SparePartsBottomSheetViewModel_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/y;", "Ldagger/internal/h;", "Lcom/avito/android/spare_parts/bottom_sheet/x;", "a", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class y implements dagger.internal.h<x> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f284834b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.spare_parts.bottom_sheet.mvi.g f284835a;

    /* compiled from: SparePartsBottomSheetViewModel_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/y$a;", "", "<init>", "()V", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public y(@Y61.k com.avito.android.spare_parts.bottom_sheet.mvi.g gVar) {
        this.f284835a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.spare_parts.bottom_sheet.mvi.f fVar = (com.avito.android.spare_parts.bottom_sheet.mvi.f) this.f284835a.get();
        f284834b.getClass();
        return new x(fVar, null, 2, null);
    }
}
