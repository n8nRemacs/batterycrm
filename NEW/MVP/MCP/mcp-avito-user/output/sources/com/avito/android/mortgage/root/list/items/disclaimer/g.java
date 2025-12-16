package com.avito.android.mortgage.root.list.items.disclaimer;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DisclaimerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/disclaimer/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/root/list/items/disclaimer/f;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f202546b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f202547c;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202546b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202547c = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.mortgage.root.list.items.disclaimer.f
    public final void Z(@k String str) {
        Integer numM = com.avito.android.lib.util.f.m(str);
        if (numM != null) {
            int iIntValue = numM.intValue();
            FV.a aVar = FV.a.f4720a;
            int iB2 = y6.b(8);
            aVar.getClass();
            FV.a.j(this.f202546b, iIntValue, iB2);
        }
    }

    @Override // com.avito.android.mortgage.root.list.items.disclaimer.f
    public final void f(@k String str) {
        this.f202547c.setText(str);
    }

    @Override // com.avito.android.mortgage.root.list.items.disclaimer.f
    public final void setEnabled(boolean z12) {
        if (z12) {
            this.itemView.setEnabled(true);
            this.itemView.setAlpha(1.0f);
        } else {
            this.itemView.setAlpha(0.4f);
            this.itemView.setEnabled(false);
        }
    }

    @Override // com.avito.android.mortgage.root.list.items.disclaimer.f
    public final void setTitle(@k String str) {
        this.f202546b.setText(str);
    }
}
