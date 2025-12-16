package com.avito.android.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ValidateAdvertApi_Module_ProvideValidateAdvertApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/w1;", "Ldagger/internal/h;", "Lcom/avito/android/remote/u1;", "a", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class w1 implements dagger.internal.h<u1> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f254404b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f254405a;

    /* compiled from: ValidateAdvertApi_Module_ProvideValidateAdvertApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/w1$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public w1(@Y61.k dagger.internal.f fVar) {
        this.f254405a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f254405a.get();
        f254404b.getClass();
        v1.f254399a.getClass();
        u1 u1Var = (u1) r02.create(u1.class);
        dagger.internal.t.b(u1Var, "Cannot return null from a non-@Nullable @Provides method");
        return u1Var;
    }
}
