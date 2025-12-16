package com.avito.android.screens.bbip_private_v2.ui.compose.dialog;

import androidx.compose.runtime.InterfaceC22196w1;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: BbipPrivateV2DurationPickerSheet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "idxVal", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class a extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<Integer> f261174l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22196w1 f261175m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(List<Integer> list, InterfaceC22196w1 interfaceC22196w1) {
        super(1);
        this.f261174l = list;
        this.f261175m = interfaceC22196w1;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        Integer numY0 = C43066x.y0(str);
        this.f261175m.L3((numY0 == null && (numY0 = (Integer) C42745f0.G(this.f261174l)) == null) ? 0 : numY0.intValue());
        return G0.f406611a;
    }
}
