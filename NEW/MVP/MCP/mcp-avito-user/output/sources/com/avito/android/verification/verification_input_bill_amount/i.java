package com.avito.android.verification.verification_input_bill_amount;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import kotlin.Metadata;

/* compiled from: VerificationInputBillAmountView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_input_bill_amount/i;", "Landroidx/recyclerview/widget/RecyclerView$o;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i implements RecyclerView.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f325541b;

    public i(g gVar) {
        this.f325541b = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void j(@Y61.k View view) {
        g gVar = this.f325541b;
        Input input = (Input) gVar.f325534c.findViewById(R.id.verification_item_input);
        if (input != null) {
            input.v();
            gVar.f325534c.t0(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void d(@Y61.k View view) {
    }
}
