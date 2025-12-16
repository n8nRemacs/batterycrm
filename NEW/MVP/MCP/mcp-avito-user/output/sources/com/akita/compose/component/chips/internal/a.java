package com.akita.compose.component.chips.internal;

import androidx.compose.ui.layout.K0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MultiLineLayout.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class a extends N implements Y41.a<Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f60904l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar) {
        super(0);
        this.f60904l = cVar;
    }

    @Override // Y41.a
    public final Integer invoke() {
        Integer num;
        ArrayList arrayList = this.f60904l.f60906a;
        if (arrayList.isEmpty()) {
            num = null;
        } else {
            Integer numValueOf = Integer.valueOf(((K0) arrayList.get(0)).f40346c);
            int i12 = 1;
            int size = arrayList.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((K0) arrayList.get(i12)).f40346c);
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i12 == size) {
                        break;
                    }
                    i12++;
                }
            }
            num = numValueOf;
        }
        return Integer.valueOf(num != null ? num.intValue() : 0);
    }
}
