package com.avito.android.mortgage.verification_flow;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.api.model.ActionButton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VerificationFlowScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class l extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ActionButton f203889l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ActionButton f203890m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f203891n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f203892o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f203893p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f203894q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ActionButton actionButton, ActionButton actionButton2, Y41.l lVar, Y41.l lVar2, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f203889l = actionButton;
        this.f203890m = actionButton2;
        this.f203891n = lVar;
        this.f203892o = lVar2;
        this.f203893p = vVar;
        this.f203894q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f203894q | 1);
        ActionButton actionButton = this.f203890m;
        Y41.l<DeepLink, G0> lVar = this.f203891n;
        t.b(this.f203889l, actionButton, lVar, this.f203892o, a12, iA2);
        return G0.f406611a;
    }
}
