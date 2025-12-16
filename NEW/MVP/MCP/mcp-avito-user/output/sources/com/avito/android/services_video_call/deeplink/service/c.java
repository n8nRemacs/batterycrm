package com.avito.android.services_video_call.deeplink.service;

import Y61.k;
import com.avito.android.di.module.C30214v6;
import dagger.internal.g;
import dagger.internal.h;
import h31.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServicesVideoCallServiceImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_video_call/deeplink/service/c;", "Ldagger/internal/h;", "Lcom/avito/android/services_video_call/deeplink/service/b;", "a", "_avito_services-video-call_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f280693b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C30214v6 f280694a;

    /* compiled from: ServicesVideoCallServiceImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_video_call/deeplink/service/c$a;", "", "<init>", "()V", "_avito_services-video-call_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k C30214v6 c30214v6) {
        this.f280694a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVarB = g.b(this.f280694a);
        f280693b.getClass();
        return new b(eVarB);
    }
}
