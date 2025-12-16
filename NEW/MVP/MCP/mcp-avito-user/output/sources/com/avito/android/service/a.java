package com.avito.android.service;

import Y41.l;
import Y41.p;
import Y61.k;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.view.InterfaceC22982O;
import androidx.view.InterfaceC23042i0;
import androidx.view.Lifecycle;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: DelayedServiceBindingHelper.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service/a;", "Landroidx/lifecycle/O;", "Lkotlin/G0;", "onStop", "()V", "onDestroy", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements InterfaceC22982O {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Lifecycle f274003b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final p<ComponentName, IBinder, G0> f274004c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l<ComponentName, G0> f274005d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Y41.a<G0> f274006e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f274007f;

    /* compiled from: DelayedServiceBindingHelper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/content/ComponentName;", "<anonymous parameter 0>", "Landroid/os/IBinder;", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.service.a$a, reason: collision with other inner class name */
    public static final class C8132a extends N implements p<ComponentName, IBinder, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8132a f274008l = new C8132a();

        public C8132a() {
            super(2);
        }

        @Override // Y41.p
        public final /* bridge */ /* synthetic */ G0 invoke(ComponentName componentName, IBinder iBinder) {
            return G0.f406611a;
        }
    }

    /* compiled from: DelayedServiceBindingHelper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/ComponentName;", "it", "Lkotlin/G0;", "invoke", "(Landroid/content/ComponentName;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<ComponentName, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f274009l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(ComponentName componentName) {
            return G0.f406611a;
        }
    }

    /* compiled from: DelayedServiceBindingHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f274010l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    public a() {
        throw null;
    }

    public a(Context context, Lifecycle lifecycle, Intent intent, ServiceConnection serviceConnection, p pVar, l lVar, Y41.a aVar, int i12, C42822w c42822w) {
        pVar = (i12 & 16) != 0 ? C8132a.f274008l : pVar;
        lVar = (i12 & 32) != 0 ? b.f274009l : lVar;
        aVar = (i12 & 64) != 0 ? c.f274010l : aVar;
        this.f274003b = lifecycle;
        this.f274004c = pVar;
        this.f274005d = lVar;
        this.f274006e = aVar;
        this.f274007f = new io.reactivex.rxjava3.disposables.c();
        lifecycle.a(this);
    }

    @InterfaceC23042i0(Lifecycle.Event.ON_DESTROY)
    private final void onDestroy() {
        this.f274003b.c(this);
    }

    @InterfaceC23042i0(Lifecycle.Event.ON_STOP)
    private final void onStop() {
        this.f274007f.e();
    }
}
