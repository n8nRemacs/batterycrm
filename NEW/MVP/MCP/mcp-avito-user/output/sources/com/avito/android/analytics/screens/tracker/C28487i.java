package com.avito.android.analytics.screens.tracker;

import Fc1.G3;
import android.os.Handler;
import androidx.view.C23050m0;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import j.InterfaceC42148d;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ContentLoadingInterruptedMonitor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/i;", "Lcom/avito/android/analytics/screens/tracker/g;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.screens.tracker.i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28487i implements InterfaceC28485g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Handler f90887a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22983P f90888b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f90889c;

    /* compiled from: ContentLoadingInterruptedMonitor.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/analytics/screens/tracker/i$a", "Landroidx/lifecycle/q;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.analytics.screens.tracker.i$a */
    public static final class a implements InterfaceC23057q {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22983P f90891c;

        public a(InterfaceC22983P interfaceC22983P) {
            this.f90891c = interfaceC22983P;
        }

        @Override // androidx.view.InterfaceC23057q
        public final void onDestroy(@Y61.k InterfaceC22983P interfaceC22983P) {
            C28487i c28487i = C28487i.this;
            c28487i.f90887a.post(new G3(c28487i, 28));
            this.f90891c.getLifecycle().c(this);
        }
    }

    public C28487i(Handler handler, InterfaceC22983P interfaceC22983P, int i12, C42822w c42822w) {
        if ((i12 & 2) != 0) {
            C23050m0.f46822j.getClass();
            interfaceC22983P = C23050m0.f46823k;
        }
        this.f90887a = handler;
        this.f90888b = interfaceC22983P;
        this.f90889c = new LinkedHashMap();
    }

    @Override // com.avito.android.analytics.screens.tracker.InterfaceC28485g
    @InterfaceC42148d
    public final void a(@Y61.k String str) {
        this.f90887a.post(new J11.c(27, this, str, false));
    }

    @Override // com.avito.android.analytics.screens.tracker.InterfaceC28485g
    @j.K
    public final void b(@Y61.k InterfaceC22983P interfaceC22983P) {
        interfaceC22983P.getLifecycle().a(new a(interfaceC22983P));
    }

    @Override // com.avito.android.analytics.screens.tracker.InterfaceC28485g
    @InterfaceC42148d
    public final void c(@Y61.k String str, @Y61.k InterfaceC28489k interfaceC28489k) {
        this.f90887a.post(new Me.m(this, str, interfaceC28489k, 15));
    }
}
