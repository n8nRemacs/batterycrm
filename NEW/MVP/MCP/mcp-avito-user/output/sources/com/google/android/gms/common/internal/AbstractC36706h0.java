package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import j.InterfaceC42151g;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* renamed from: com.google.android.gms.common.internal.h0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC36706h0 extends u0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f349438d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public final Bundle f349439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC36699e f349440f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC42151g
    public AbstractC36706h0(AbstractC36699e abstractC36699e, @j.P int i12, Bundle bundle) {
        super(abstractC36699e);
        this.f349440f = abstractC36699e;
        this.f349438d = i12;
        this.f349439e = bundle;
    }

    @Override // com.google.android.gms.common.internal.u0
    public final /* bridge */ /* synthetic */ void a() {
        AbstractC36699e abstractC36699e = this.f349440f;
        int i12 = this.f349438d;
        if (i12 != 0) {
            abstractC36699e.l(1, null);
            Bundle bundle = this.f349439e;
            c(new ConnectionResult(i12, bundle != null ? (PendingIntent) bundle.getParcelable(AbstractC36699e.KEY_PENDING_INTENT) : null));
        } else {
            if (d()) {
                return;
            }
            abstractC36699e.l(1, null);
            c(new ConnectionResult(8, null));
        }
    }

    public abstract void c(ConnectionResult connectionResult);

    public abstract boolean d();
}
