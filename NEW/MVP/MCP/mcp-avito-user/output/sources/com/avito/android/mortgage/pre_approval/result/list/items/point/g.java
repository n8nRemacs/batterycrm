package com.avito.android.mortgage.pre_approval.result.list.items.point;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: PointView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/list/items/point/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/pre_approval/result/list/items/point/f;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f202064b;

    public g(@k View view) {
        super(view);
        this.f202064b = (TextView) view.findViewById(R.id.point);
    }

    @Override // com.avito.android.mortgage.pre_approval.result.list.items.point.f
    public final void D(@k PrintableText printableText) {
        this.f202064b.setText(printableText.k0(this.itemView.getContext()));
    }

    @Override // com.avito.android.mortgage.pre_approval.result.list.items.point.f
    public final void Lp(@k String str) {
        Integer numM = com.avito.android.lib.util.f.m(str);
        if (numM != null) {
            int iIntValue = numM.intValue();
            FV.a aVar = FV.a.f4720a;
            int iB2 = y6.b(6);
            aVar.getClass();
            FV.a.j(this.f202064b, iIntValue, iB2);
        }
    }
}
