package com.avito.android.ux.feedback.impl;

import f90.C40263l;
import f90.InterfaceC40256e;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AppSessionStartTimeSaverTask_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ux/feedback/impl/a;", "Ldagger/internal/h;", "Lcom/avito/android/ux/feedback/impl/AppSessionStartTimeSaverTask;", "a", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements dagger.internal.h<AppSessionStartTimeSaverTask> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C9894a f319134b = new C9894a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C40263l f319135a;

    /* compiled from: AppSessionStartTimeSaverTask_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ux/feedback/impl/a$a;", "", "<init>", "()V", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.ux.feedback.impl.a$a, reason: collision with other inner class name */
    public static final class C9894a {
        public /* synthetic */ C9894a(C42822w c42822w) {
            this();
        }

        public C9894a() {
        }
    }

    public a(@Y61.k C40263l c40263l) {
        this.f319135a = c40263l;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40256e interfaceC40256e = (InterfaceC40256e) this.f319135a.get();
        f319134b.getClass();
        return new AppSessionStartTimeSaverTask(interfaceC40256e);
    }
}
