package com.avito.android.tariff.cpx.info.sf.menu;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;
import zB0.C50434c;
import zB0.InterfaceC50432a;
import zB0.InterfaceC50433b;

/* compiled from: TariffCpxInfoSfMenuDialogFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TariffCpxInfoSfMenuDialogFragment f296785l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C50434c f296786m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<InterfaceC50433b> f296787n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f296788o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC50432a, G0> f296789p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v f296790q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f296791r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TariffCpxInfoSfMenuDialogFragment tariffCpxInfoSfMenuDialogFragment, C50434c c50434c, InterfaceC43160i interfaceC43160i, Y41.l lVar, Y41.l lVar2, v vVar, int i12) {
        super(2);
        this.f296785l = tariffCpxInfoSfMenuDialogFragment;
        this.f296786m = c50434c;
        this.f296787n = interfaceC43160i;
        this.f296788o = lVar;
        this.f296789p = lVar2;
        this.f296790q = vVar;
        this.f296791r = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f296791r | 1);
        TariffCpxInfoSfMenuDialogFragment tariffCpxInfoSfMenuDialogFragment = this.f296785l;
        InterfaceC43160i<InterfaceC50433b> interfaceC43160i = this.f296787n;
        Y41.l<DeepLink, G0> lVar = this.f296788o;
        TariffCpxInfoSfMenuDialogFragment.f5(tariffCpxInfoSfMenuDialogFragment, this.f296786m, interfaceC43160i, lVar, this.f296789p, a12, iA2);
        return G0.f406611a;
    }
}
