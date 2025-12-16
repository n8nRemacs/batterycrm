package com.avito.android.tariff.cpa.configure_info;

import Y41.l;
import com.avito.android.tariff.cpa.configure_info.CpaConfigureInfoFragment;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CpaConfigureInfoFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class d extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CpaConfigureInfoFragment f294457l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CpaConfigureInfoFragment cpaConfigureInfoFragment) {
        super(1);
        this.f294457l = cpaConfigureInfoFragment;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        CpaConfigureInfoFragment.a aVar = CpaConfigureInfoFragment.f294438y0;
        CpaConfigureInfoFragment cpaConfigureInfoFragment = this.f294457l;
        D6.G(cpaConfigureInfoFragment.q5(), true);
        cpaConfigureInfoFragment.q5().setText(str);
        return G0.f406611a;
    }
}
