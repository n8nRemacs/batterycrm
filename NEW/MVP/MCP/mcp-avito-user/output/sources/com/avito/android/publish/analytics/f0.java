package com.avito.android.publish.analytics;

import Cd0.C13267i0;
import Cd0.O0;
import Cd0.P0;
import Cd0.Q0;
import com.avito.android.analytics.InterfaceC28373a;
import jN0.C42289a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import nc.C44375a;
import nc.C44376b;
import yc.C50213a;

/* compiled from: PublishVideoEventTracker.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/analytics/f0;", "Lcom/avito/android/publish/analytics/e0;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f232240a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C50213a f232241b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.H f232242c;

    /* compiled from: PublishVideoEventTracker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/publish/analytics/f0$a;", "", "<init>", "()V", "", "CANCEL_BY_USER", "Ljava/lang/String;", "EDIT_FROM_PAGE", "PUBLISH_FROM_PAGE", "WIDGET_NAME", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public f0(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a, @Y61.k com.avito.android.remote.H h12) {
        this.f232240a = interfaceC28373a;
        this.f232241b = c50213a;
        this.f232242c = h12;
    }

    @Override // com.avito.android.publish.analytics.e0
    public final void A(@Y61.l String str) {
        this.f232240a.c(new C13267i0(this.f232241b.f443213e, str));
    }

    @Override // com.avito.android.publish.analytics.e0
    public final void B(@Y61.l String str) {
        this.f232240a.c(new O0(str));
    }

    @Override // com.avito.android.publish.analytics.e0
    public final void I0(@Y61.l Float f12, @Y61.l String str, @Y61.l Long l12) {
        this.f232240a.c(new Q0(f12, str, l12, "cancel_by_user", this.f232241b));
    }

    @Override // com.avito.android.publish.analytics.e0
    public final void X(@Y61.l Integer num, @Y61.l String str, @Y61.l String str2) {
        InterfaceC28373a interfaceC28373a = this.f232240a;
        this.f232242c.getClass();
        String str3 = this.f232241b.f443213e;
        interfaceC28373a.c(new C44376b());
    }

    @Override // com.avito.android.publish.analytics.e0
    public final void a(@Y61.l Integer num, @Y61.l String str, @Y61.l String str2) {
        InterfaceC28373a interfaceC28373a = this.f232240a;
        this.f232242c.getClass();
        String str3 = this.f232241b.f443213e;
        interfaceC28373a.c(new C44375a());
    }

    @Override // com.avito.android.publish.analytics.e0
    public final void g0(@Y61.l Integer num, boolean z12) {
        this.f232240a.c(new C42289a(num, this.f232241b.f443213e, this.f232241b.b(), z12 ? "item_edit" : "item_add"));
    }

    @Override // com.avito.android.publish.analytics.e0
    public final void h(@Y61.l String str, boolean z12) {
        this.f232240a.c(new P0(str, this.f232241b.f443213e, z12 ? "item_edit" : "item_add"));
    }

    @Override // com.avito.android.publish.analytics.e0
    public final void t0(@Y61.l Float f12, @Y61.l String str, @Y61.l Long l12) {
        this.f232240a.c(new Q0(f12, str, l12, null, this.f232241b));
    }

    @Override // com.avito.android.publish.analytics.e0
    public final void v(@Y61.l Float f12, @Y61.l String str, @Y61.l Long l12, @Y61.k Throwable th2) {
        this.f232240a.c(new Q0(f12, str, l12, th2.toString(), this.f232241b));
    }
}
