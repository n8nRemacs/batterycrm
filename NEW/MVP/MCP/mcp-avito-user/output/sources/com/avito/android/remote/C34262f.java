package com.avito.android.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AuthApi_Module_ProvideAuthApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/f;", "Ldagger/internal/h;", "Lcom/avito/android/remote/d;", "a", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.f, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34262f implements dagger.internal.h<InterfaceC34258d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f253438b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f253439a;

    /* compiled from: AuthApi_Module_ProvideAuthApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/f$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.f$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C34262f(@Y61.k dagger.internal.f fVar) {
        this.f253439a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f253439a.get();
        f253438b.getClass();
        C34260e.f253383a.getClass();
        InterfaceC34258d interfaceC34258d = (InterfaceC34258d) r02.create(InterfaceC34258d.class);
        dagger.internal.t.b(interfaceC34258d, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC34258d;
    }
}
