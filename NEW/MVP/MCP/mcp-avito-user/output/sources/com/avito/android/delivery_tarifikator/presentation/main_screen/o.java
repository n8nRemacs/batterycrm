package com.avito.android.delivery_tarifikator.presentation.main_screen;

import com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.u;
import com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.i2;

/* compiled from: TarifikatorMainViewModel_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/o;", "Ldagger/internal/h;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/n;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f135740b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final v f135741a;

    /* compiled from: TarifikatorMainViewModel_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/o$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public o(@Y61.k v vVar) {
        this.f135741a = vVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        u uVar = (u) this.f135741a.get();
        f135740b.getClass();
        i2.f411430a.getClass();
        return new n(uVar, i2.a.f411433c);
    }
}
