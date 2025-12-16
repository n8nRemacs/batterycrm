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
final class g extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f167285l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l<String, G0> f167286m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f167287n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f167288o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, l lVar, v vVar, int i12) {
        super(2);
        this.f167285l = kVar;
        this.f167286m = lVar;
        this.f167287n = vVar;
        this.f167288o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f167288o | 1);
        j.a(this.f167285l, this.f167286m, this.f167287n, a12, iA2);
        return G0.f406611a;
    }
}
