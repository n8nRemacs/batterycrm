package com.akita.compose.theme.re23.preview;

import androidx.compose.runtime.InterfaceC22196w1;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: SegmentedControlPreview.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/akita/compose/component/segmented_control/q;", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/segmented_control/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class U2 extends kotlin.jvm.internal.N implements Y41.l<com.akita.compose.component.segmented_control.q, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<kotlin.Q<String, Boolean>> f65524l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22196w1 f65525m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, kotlin.G0> f65526n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public U2(List<kotlin.Q<String, Boolean>> list, InterfaceC22196w1 interfaceC22196w1, Y41.l<? super String, kotlin.G0> lVar) {
        super(1);
        this.f65524l = list;
        this.f65525m = interfaceC22196w1;
        this.f65526n = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final kotlin.G0 invoke(com.akita.compose.component.segmented_control.q qVar) {
        com.akita.compose.component.segmented_control.q qVar2 = qVar;
        int i12 = 0;
        for (Object obj : this.f65524l) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            kotlin.Q q12 = (kotlin.Q) obj;
            qVar2.a(new S2(i12, this.f65525m), new T2(this.f65526n), (String) q12.f406619b, ((Boolean) q12.f406620c).booleanValue());
            i12 = i13;
        }
        return kotlin.G0.f406611a;
    }
}
