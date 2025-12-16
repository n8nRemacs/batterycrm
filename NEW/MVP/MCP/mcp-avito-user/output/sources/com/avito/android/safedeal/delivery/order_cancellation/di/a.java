package com.avito.android.safedeal.delivery.order_cancellation.di;

import com.avito.android.safedeal.delivery.order_cancellation.RdsOrderCancellationActivity;
import com.avito.android.safedeal.delivery.order_cancellation.di.b;
import dagger.internal.e;

/* compiled from: DaggerRdsOrderCancellationActivityComponent.java */
@e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerRdsOrderCancellationActivityComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.safedeal.delivery.order_cancellation.di.b.a
        public final com.avito.android.safedeal.delivery.order_cancellation.di.b a(com.avito.android.safedeal.delivery.di.component.b bVar) {
            return new c(bVar, null);
        }
    }

    /* compiled from: DaggerRdsOrderCancellationActivityComponent.java */
    public static final class c implements com.avito.android.safedeal.delivery.order_cancellation.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.safedeal.delivery.di.component.b f256284a;

        public c(com.avito.android.safedeal.delivery.di.component.b bVar, C7677a c7677a) {
            this.f256284a = bVar;
        }

        @Override // com.avito.android.safedeal.delivery.order_cancellation.di.b
        public final void a(RdsOrderCancellationActivity rdsOrderCancellationActivity) {
            this.f256284a.Yh();
            rdsOrderCancellationActivity.getClass();
        }
    }

    public static b.a a() {
        return new b();
    }
}
