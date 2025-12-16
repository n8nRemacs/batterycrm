package com.akita.compose.component.chips;

import androidx.compose.runtime.internal.C22096n;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Chips.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class n extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<InterfaceC27333b> f60949l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f60950m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(List list, C22096n c22096n) {
        super(2);
        this.f60949l = list;
        this.f60950m = c22096n;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            int i12 = 0;
            for (Object obj : this.f60949l) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                InterfaceC27333b interfaceC27333b = (InterfaceC27333b) obj;
                this.f60950m.invoke(Integer.valueOf(i12), interfaceC27333b, androidx.compose.ui.v.f42878y1, a13, 384);
                i12 = i13;
            }
        }
        return G0.f406611a;
    }
}
