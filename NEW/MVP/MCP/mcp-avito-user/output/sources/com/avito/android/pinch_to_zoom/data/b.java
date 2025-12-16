package com.avito.android.pinch_to_zoom.data;

import AK0.l;
import Y61.k;
import com.avito.android.di.module.C30214v6;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PinchToZoomStorageImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/pinch_to_zoom/data/b;", "Ldagger/internal/h;", "Lcom/avito/android/pinch_to_zoom/data/a;", "a", "_avito_pinch-to-zoom_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements h<com.avito.android.pinch_to_zoom.data.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f220004b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C30214v6 f220005a;

    /* compiled from: PinchToZoomStorageImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/pinch_to_zoom/data/b$a;", "", "<init>", "()V", "_avito_pinch-to-zoom_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@k C30214v6 c30214v6) {
        this.f220005a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = (l) this.f220005a.get();
        f220004b.getClass();
        return new com.avito.android.pinch_to_zoom.data.a(lVar);
    }
}
