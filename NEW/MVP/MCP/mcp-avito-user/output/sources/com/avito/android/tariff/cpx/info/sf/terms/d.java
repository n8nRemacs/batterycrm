package com.avito.android.tariff.cpx.info.sf.terms;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TariffCpxInfoSfTermsDialogFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class d extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TariffCpxInfoSfTermsDialogFragment f296841l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AttributedText f296842m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f296843n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f296844o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TariffCpxInfoSfTermsDialogFragment tariffCpxInfoSfTermsDialogFragment, AttributedText attributedText, v vVar, int i12) {
        super(2);
        this.f296841l = tariffCpxInfoSfTermsDialogFragment;
        this.f296842m = attributedText;
        this.f296843n = vVar;
        this.f296844o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f296844o | 1);
        TariffCpxInfoSfTermsDialogFragment.g5(this.f296841l, this.f296842m, a12, iA2);
        return G0.f406611a;
    }
}
