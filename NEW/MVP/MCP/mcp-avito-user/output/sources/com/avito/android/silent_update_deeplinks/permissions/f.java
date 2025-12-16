package com.avito.android.silent_update_deeplinks.permissions;

import X41.n;
import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: SilentUpdatePermissionsHandlerModule_ProvideSilentUpdatePermissionsLinkMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/silent_update_deeplinks/permissions/f;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_silent-update-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f283756b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f283757a;

    /* compiled from: SilentUpdatePermissionsHandlerModule_ProvideSilentUpdatePermissionsLinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/silent_update_deeplinks/permissions/f$a;", "", "<init>", "()V", "_avito_silent-update-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @n
        @k
        public static C43834a a(@k h hVar) {
            e.f283755a.getClass();
            C43834a.C11807a c11807a = C43834a.f414235d;
            return new C43834a(SilentUpdatePermissionsLink.class, new j(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SilentUpdatePermissionsLink.class), hVar));
        }

        public a() {
        }
    }

    public f(@k h hVar) {
        this.f283757a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = this.f283757a;
        f283756b.getClass();
        return a.a(hVar);
    }
}
