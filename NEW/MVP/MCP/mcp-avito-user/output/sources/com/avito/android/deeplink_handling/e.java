package com.avito.android.deeplink_handling;

import Y61.k;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.w;
import gd.C40663c;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: JobApplyCreateDeeplinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handling/e;", "Ldagger/internal/h;", "Lcom/avito/android/deeplink_handling/d;", "a", "_avito_job_apply-only-with-cv_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements h<d> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f134728g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C25721c f134729a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final dagger.internal.f f134730b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final dv.b f134731c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final dv.b f134732d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Provider<R0> f134733e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C40663c f134734f;

    /* compiled from: JobApplyCreateDeeplinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handling/e$a;", "", "<init>", "()V", "_avito_job_apply-only-with-cv_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k C25721c c25721c, @k dagger.internal.f fVar, @k dv.b bVar, @k dv.b bVar2, @k Provider provider, @k C40663c c40663c) {
        this.f134729a = c25721c;
        this.f134730b = fVar;
        this.f134731c = bVar;
        this.f134732d = bVar2;
        this.f134733e = provider;
        this.f134734f = c40663c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C25719a c25719a = (C25719a) this.f134729a.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f134730b.get();
        a.g gVar = (a.g) this.f134731c.get();
        a.i iVar = (a.i) this.f134732d.get();
        R0 r02 = this.f134733e.get();
        h31.e eVarA = dagger.internal.g.a(w.a(this.f134734f));
        f134728g.getClass();
        return new d(c25719a, aVar, gVar, iVar, r02, eVarA);
    }
}
