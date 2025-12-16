package com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.iacForce;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacForceCallMethodsDialogFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ IacForceCallMethodsDialogFragment f168486l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AttributedText f168487m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f168488n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f168489o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f168490p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v f168491q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(IacForceCallMethodsDialogFragment iacForceCallMethodsDialogFragment, AttributedText attributedText, boolean z12, Y41.a aVar, Y41.a aVar2, v vVar, int i12) {
        super(2);
        this.f168486l = iacForceCallMethodsDialogFragment;
        this.f168487m = attributedText;
        this.f168488n = z12;
        this.f168489o = aVar;
        this.f168490p = aVar2;
        this.f168491q = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(262153);
        Y41.a<G0> aVar = this.f168490p;
        AttributedText attributedText = this.f168487m;
        Y41.a<G0> aVar2 = this.f168489o;
        this.f168486l.f5(attributedText, this.f168488n, aVar2, aVar, a12, iA2);
        return G0.f406611a;
    }
}
