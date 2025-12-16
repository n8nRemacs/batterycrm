package com.avito.android.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: InfoApi_Module_ProvideInfoApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/l0;", "Ldagger/internal/h;", "Lcom/avito/android/remote/j0;", "a", "_avito-discouraged_avito-api_info"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.l0, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34326l0 implements dagger.internal.h<InterfaceC34322j0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f253566b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f253567a;

    /* compiled from: InfoApi_Module_ProvideInfoApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/l0$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_info"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.l0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C34326l0(@Y61.k dagger.internal.f fVar) {
        this.f253567a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f253567a.get();
        f253566b.getClass();
        C34324k0.f253563a.getClass();
        InterfaceC34322j0 interfaceC34322j0 = (InterfaceC34322j0) r02.create(InterfaceC34322j0.class);
        dagger.internal.t.b(interfaceC34322j0, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC34322j0;
    }
}
