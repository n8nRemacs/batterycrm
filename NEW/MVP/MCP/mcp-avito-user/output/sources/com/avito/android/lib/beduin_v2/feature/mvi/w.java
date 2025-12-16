package com.avito.android.lib.beduin_v2.feature.mvi;

import com.avito.android.C29270c0;
import com.avito.android.C30276e0;
import com.avito.beduin.v2.engine.InterfaceC36238a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinReducer_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/w;", "Ldagger/internal/h;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/v;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class w implements dagger.internal.h<v> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f176359d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC36238a> f176360a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.beduin.v2.handler.flow.processor.b> f176361b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C30276e0 f176362c;

    /* compiled from: BeduinReducer_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/w$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public w(@Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k C30276e0 c30276e0) {
        this.f176360a = provider;
        this.f176361b = provider2;
        this.f176362c = c30276e0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC36238a interfaceC36238a = this.f176360a.get();
        com.avito.beduin.v2.handler.flow.processor.b bVar = this.f176361b.get();
        C29270c0 c29270c0 = (C29270c0) this.f176362c.get();
        f176359d.getClass();
        return new v(interfaceC36238a, bVar, c29270c0);
    }
}
