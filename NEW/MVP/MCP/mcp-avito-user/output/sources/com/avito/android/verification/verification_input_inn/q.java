package com.avito.android.verification.verification_input_inn;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import kotlin.Metadata;

/* compiled from: VerificationInputInnView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_input_inn/q;", "Landroidx/recyclerview/widget/RecyclerView$o;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q implements RecyclerView.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f325643b;

    public q(p pVar) {
        this.f325643b = pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void j(@Y61.k View view) {
        p pVar = this.f325643b;
        Input input = (Input) pVar.f325637c.findViewById(R.id.verification_item_input);
        if (input != null) {
            input.v();
            pVar.f325637c.t0(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void d(@Y61.k View view) {
    }
}
