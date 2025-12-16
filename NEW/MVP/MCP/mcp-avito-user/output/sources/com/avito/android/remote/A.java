package com.avito.android.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DealConfirmationApi_Module_ProvideDealConfirmationApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/A;", "Ldagger/internal/h;", "Lcom/avito/android/remote/y;", "a", "_avito-discouraged_avito-api_deal-confirmation"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class A implements dagger.internal.h<InterfaceC34398y> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f253006b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f253007a;

    /* compiled from: DealConfirmationApi_Module_ProvideDealConfirmationApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/A$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_deal-confirmation"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public A(@Y61.k dagger.internal.f fVar) {
        this.f253007a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f253007a.get();
        f253006b.getClass();
        C34400z.f254411a.getClass();
        InterfaceC34398y interfaceC34398y = (InterfaceC34398y) r02.create(InterfaceC34398y.class);
        dagger.internal.t.b(interfaceC34398y, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC34398y;
    }
}
