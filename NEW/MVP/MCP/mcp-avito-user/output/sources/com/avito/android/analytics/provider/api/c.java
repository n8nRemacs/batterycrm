package com.avito.android.analytics.provider.api;

import Nc.InterfaceC14558a;
import Y61.k;
import ac.C19864a;
import bc.InterfaceC25627a;
import com.avito.android.analytics.InterfaceC28464o;
import com.avito.android.analytics.r;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35881r2;
import h31.e;
import io.reactivex.rxjava3.core.H;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.C43259k;
import zc.InterfaceC50545a;

/* compiled from: ApiEventTracker.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/provider/api/c;", "Lcom/avito/android/analytics/r;", "Lbc/a;", "Lcom/avito/android/util/r2;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements r<InterfaceC25627a>, InterfaceC35881r2 {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC50545a> f90237a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e<InterfaceC14558a> f90238b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f90239c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C19864a f90240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC35881r2.a f90241e = InterfaceC35881r2.a.f318986a;

    @Inject
    public c(@k e<InterfaceC50545a> eVar, @k e<InterfaceC14558a> eVar2, @k InterfaceC35745a5 interfaceC35745a5, @k C19864a c19864a) {
        this.f90237a = eVar;
        this.f90238b = eVar2;
        this.f90239c = interfaceC35745a5;
        this.f90240d = c19864a;
    }

    @Override // com.avito.android.util.InterfaceC35881r2
    public final void a() {
        this.f90241e.getClass();
    }

    @Override // com.avito.android.analytics.r
    public final void c(InterfaceC28464o interfaceC28464o) throws Throwable {
        InterfaceC25627a interfaceC25627a = (InterfaceC25627a) interfaceC28464o;
        if (this.f90240d.v().getValue().booleanValue()) {
            C43259k.e(EmptyCoroutineContext.INSTANCE, new b(interfaceC25627a, this, null));
        } else {
            C43259k.e(EmptyCoroutineContext.INSTANCE, new a(interfaceC25627a, this, null));
        }
    }

    @Override // com.avito.android.analytics.r
    @k
    /* renamed from: h */
    public final H getF91100h() {
        return this.f90239c.a();
    }

    @Override // com.avito.android.analytics.r
    @k
    public final Class<InterfaceC25627a> i() {
        return InterfaceC25627a.class;
    }

    @Override // com.avito.android.util.InterfaceC35881r2
    /* renamed from: isInitialized */
    public final boolean getF437917g() {
        this.f90241e.getClass();
        return true;
    }
}
