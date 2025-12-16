package com.avito.android.publish.free_delivery.ui;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.akita.compose.component.tooltip.t;
import ge0.C40669a;
import he0.C40926c;
import he0.InterfaceC40924a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FreeDeliveryBottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class m extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C40926c f235928l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f235929m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C40669a f235930n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC40924a, G0> f235931o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f235932p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(C40926c c40926c, t tVar, C40669a c40669a, Y41.l<? super InterfaceC40924a, G0> lVar, int i12) {
        super(2);
        this.f235928l = c40926c;
        this.f235929m = tVar;
        this.f235930n = c40669a;
        this.f235931o = lVar;
        this.f235932p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) throws Throwable {
        num.intValue();
        int iA2 = C22066f2.a(this.f235932p | 1);
        C40669a c40669a = this.f235930n;
        Y41.l<InterfaceC40924a, G0> lVar = this.f235931o;
        e.e(this.f235928l, this.f235929m, c40669a, lVar, a12, iA2);
        return G0.f406611a;
    }
}
