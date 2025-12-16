package com.avito.android.gig_shift_action.mvi;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.gig_shift_action.ui.GigShiftActionOpenParams;
import javax.inject.Provider;

/* compiled from: GigShiftActionFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final k f160496a;

    /* renamed from: b, reason: collision with root package name */
    public final t f160497b;

    /* renamed from: c, reason: collision with root package name */
    public final m f160498c;

    /* renamed from: d, reason: collision with root package name */
    public final v f160499d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f160500e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<Resources> f160501f;

    public p(k kVar, t tVar, m mVar, v vVar, dagger.internal.l lVar, Provider provider) {
        this.f160496a = kVar;
        this.f160497b = tVar;
        this.f160498c = mVar;
        this.f160499d = vVar;
        this.f160500e = lVar;
        this.f160501f = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f160496a.get();
        this.f160497b.getClass();
        s sVar = new s();
        l lVar = (l) this.f160498c.get();
        u uVar = (u) this.f160499d.get();
        GigShiftActionOpenParams gigShiftActionOpenParams = (GigShiftActionOpenParams) this.f160500e.f393949a;
        Resources resources = this.f160501f.get();
        return new o("GigShiftAction", gigShiftActionOpenParams.f160575b ? new w(false, true, false, resources.getString(R.string.scan_qr_error_title), resources.getString(R.string.scan_qr_error_description), false, null, false, null, null, resources.getString(R.string.retry_title), resources.getString(R.string.checkin_without_qr), 996, null) : new w(false, false, false, null, null, false, null, false, null, null, null, null, 4095, null), new n(iVar, sVar, lVar, uVar));
    }
}
