package com.avito.android.spare_parts.bottom_sheet.mvi;

import com.avito.android.remote.models.SparePartsGroup;
import dagger.internal.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SparePartsBottomSheetBootstrap_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/mvi/d;", "Ldagger/internal/h;", "Lcom/avito/android/spare_parts/bottom_sheet/mvi/c;", "a", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f284797b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l f284798a;

    /* compiled from: SparePartsBottomSheetBootstrap_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/mvi/d$a;", "", "<init>", "()V", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@Y61.k l lVar) {
        this.f284798a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        SparePartsGroup sparePartsGroup = (SparePartsGroup) this.f284798a.f393949a;
        f284797b.getClass();
        return new c(sparePartsGroup);
    }
}
