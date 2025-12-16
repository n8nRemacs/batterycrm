package com.avito.android.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AuthTrackerApi_Module_ProvideAuthTrackerApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/j;", "Ldagger/internal/h;", "Lcom/avito/android/remote/g;", "a", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.j, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34321j implements dagger.internal.h<InterfaceC34264g> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f253560b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f253561a;

    /* compiled from: AuthTrackerApi_Module_ProvideAuthTrackerApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/j$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.j$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C34321j(@Y61.k dagger.internal.f fVar) {
        this.f253561a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f253561a.get();
        f253560b.getClass();
        C34268i.f253480a.getClass();
        InterfaceC34264g interfaceC34264g = (InterfaceC34264g) r02.create(InterfaceC34264g.class);
        dagger.internal.t.b(interfaceC34264g, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC34264g;
    }
}
