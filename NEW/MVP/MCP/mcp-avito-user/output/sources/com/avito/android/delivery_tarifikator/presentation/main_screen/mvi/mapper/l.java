package com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.mapper;

import Uv.InterfaceC15572a;
import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TarifikatorMainContentMapperImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/mapper/l;", "Ldagger/internal/h;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/mapper/k;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f135693d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC15572a> f135694a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f135695b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C30102l3 f135696c;

    /* compiled from: TarifikatorMainContentMapperImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/mapper/l$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public l(@Y61.k C30102l3 c30102l3, @Y61.k u uVar, @Y61.k Provider provider) {
        this.f135694a = provider;
        this.f135695b = uVar;
        this.f135696c = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC15572a interfaceC15572a = this.f135694a.get();
        e eVar = (e) this.f135695b.get();
        Context context = (Context) this.f135696c.get();
        f135693d.getClass();
        return new k(interfaceC15572a, eVar, context);
    }
}
