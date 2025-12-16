package com.avito.android.bbl.screens.configure.v4.ui.compose;

import Bh.C13148c;
import Bh.InterfaceC13146a;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BblConfigureV4ScreenContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class b extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C13148c f99532l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC13146a, G0> f99533m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f99534n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f99535o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f99536p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C13148c c13148c, Y41.l lVar, Y41.l lVar2, float f12, v vVar, int i12) {
        super(2);
        this.f99532l = c13148c;
        this.f99533m = lVar;
        this.f99534n = lVar2;
        this.f99535o = f12;
        this.f99536p = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        Y41.l<InterfaceC13146a, G0> lVar = this.f99533m;
        Y41.l<DeepLink, G0> lVar2 = this.f99534n;
        d.a(this.f99532l, lVar, lVar2, this.f99535o, a12, iA2);
        return G0.f406611a;
    }
}
