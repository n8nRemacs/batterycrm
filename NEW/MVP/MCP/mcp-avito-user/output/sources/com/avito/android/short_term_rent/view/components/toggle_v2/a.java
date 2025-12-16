package com.avito.android.short_term_rent.view.components.toggle_v2;

import Y41.l;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.short_term_rent.view.components.toggle_v2.ToggleV2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import tw0.InterfaceC48733a;

/* compiled from: ToggleV2.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class a extends H implements l<Integer, G0> {
    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        ToggleV2 toggleV2 = (ToggleV2) this.receiver;
        RecyclerView.Adapter adapter = toggleV2.f283061f.getAdapter();
        c cVar = adapter instanceof c ? (c) adapter : null;
        if (cVar != null) {
            cVar.notifyItemChanged(iIntValue);
            ToggleV2.a aVar = toggleV2.selectedListener;
            if (aVar != null) {
                aVar.a((InterfaceC48733a) cVar.f283070d.get(iIntValue));
            }
        }
        return G0.f406611a;
    }
}
