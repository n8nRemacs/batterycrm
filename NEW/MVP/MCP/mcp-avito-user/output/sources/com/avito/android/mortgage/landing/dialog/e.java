package com.avito.android.mortgage.landing.dialog;

import Y41.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageProgramsInfoDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e extends N implements l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f199630l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar) {
        super(1);
        this.f199630l = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        View viewFindViewById = view.findViewById(R.id.footer_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById;
        button.setText(R.string.landing_select_program);
        button.setOnClickListener(new ViewOnClickListenerC31873b(this.f199630l, 12));
        return G0.f406611a;
    }
}
