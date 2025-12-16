package com.avito.android.tariff_cpt.common.ui.compose;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.v;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TariffCptImage.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Image f297546l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f297547m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f297548n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f297549o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f297550p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22374n.a.e f297551q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Image image, float f12, float f13, v vVar, i iVar, InterfaceC22374n.a.e eVar, int i12) {
        super(2);
        this.f297546l = image;
        this.f297547m = f12;
        this.f297548n = f13;
        this.f297549o = vVar;
        this.f297550p = iVar;
        this.f297551q = eVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(2362809);
        v vVar = this.f297549o;
        h.a(this.f297546l, this.f297547m, this.f297548n, vVar, this.f297550p, this.f297551q, a12, iA2);
        return G0.f406611a;
    }
}
