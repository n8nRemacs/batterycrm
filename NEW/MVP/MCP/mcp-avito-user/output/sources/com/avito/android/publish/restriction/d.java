package com.avito.android.publish.restriction;

import com.avito.android.remote.R0;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RestrictionApi_Module_ProvideRestrictionApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/restriction/d;", "Ldagger/internal/h;", "Lcom/avito/android/publish/restriction/b;", "a", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f239077b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f239078a;

    /* compiled from: RestrictionApi_Module_ProvideRestrictionApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/restriction/d$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@Y61.k dagger.internal.f fVar) {
        this.f239078a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f239078a.get();
        f239077b.getClass();
        c.f239076a.getClass();
        b bVar = (b) r02.create(b.class);
        t.b(bVar, "Cannot return null from a non-@Nullable @Provides method");
        return bVar;
    }
}
