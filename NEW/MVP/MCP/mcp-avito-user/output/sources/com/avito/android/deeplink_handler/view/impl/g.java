package com.avito.android.deeplink_handler.view.impl;

import X41.n;
import com.avito.android.util.C;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PermissionManager_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/view/impl/g;", "Ldagger/internal/h;", "Lcom/avito/android/deeplink_handler/view/impl/f;", "a", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f134623b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f134624a;

    /* compiled from: PermissionManager_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/view/impl/g$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@Y61.k u uVar) {
        this.f134624a = uVar;
    }

    @n
    @Y61.k
    public static final g a(@Y61.k u uVar) {
        f134623b.getClass();
        return new g(uVar);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = (C) this.f134624a.get();
        f134623b.getClass();
        return new f(c12);
    }
}
