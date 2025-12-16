package com.avito.android.iac_dialer_ui.pub.call_screen.dtmf_buttons.keys;

import Y41.l;
import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacUIDtmfButtonsKey.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f167279l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l<String, G0> f167280m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f167281n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f167282o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, l lVar, v vVar, int i12) {
        super(2);
        this.f167279l = kVar;
        this.f167280m = lVar;
        this.f167281n = vVar;
        this.f167282o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f167282o | 1);
        v vVar = this.f167281n;
        j.a(this.f167279l, this.f167280m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
