package com.avito.android.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CodeConfirmationApi_Module_ProvideCodeConfirmationApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/t;", "Ldagger/internal/h;", "Lcom/avito/android/remote/r;", "a", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.t, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34388t implements dagger.internal.h<r> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f254370b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f254371a;

    /* compiled from: CodeConfirmationApi_Module_ProvideCodeConfirmationApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/t$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.t$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C34388t(@Y61.k dagger.internal.f fVar) {
        this.f254371a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f254371a.get();
        f254370b.getClass();
        C34386s.f254337a.getClass();
        r rVar = (r) r02.create(r.class);
        dagger.internal.t.b(rVar, "Cannot return null from a non-@Nullable @Provides method");
        return rVar;
    }
}
