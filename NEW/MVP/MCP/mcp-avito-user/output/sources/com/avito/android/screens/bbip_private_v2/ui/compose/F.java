package com.avito.android.screens.bbip_private_v2.ui.compose;

import androidx.compose.runtime.C22066f2;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import kotlin.G0;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;
import tp0.InterfaceC48700a;
import tp0.InterfaceC48701b;

/* compiled from: BbipPrivateV2Screen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class F extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BbipPrivateV2State f261147l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<InterfaceC48701b> f261148m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC48700a, G0> f261149n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f261150o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f261151p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f261152q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f261153r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(BbipPrivateV2State bbipPrivateV2State, InterfaceC43160i interfaceC43160i, Y41.l lVar, Y41.l lVar2, Y41.l lVar3, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f261147l = bbipPrivateV2State;
        this.f261148m = interfaceC43160i;
        this.f261149n = lVar;
        this.f261150o = lVar2;
        this.f261151p = lVar3;
        this.f261152q = vVar;
        this.f261153r = i12;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.l, java.lang.Object] */
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f261153r | 1);
        ?? r42 = this.f261151p;
        Y41.l<InterfaceC48700a, G0> lVar = this.f261149n;
        Y41.l<DeepLink, G0> lVar2 = this.f261150o;
        G.a(this.f261147l, this.f261148m, lVar, lVar2, r42, a12, iA2);
        return G0.f406611a;
    }
}
