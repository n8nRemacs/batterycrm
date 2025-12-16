package com.avito.android.newcars_mark_model_filter.presentation;

import Y41.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NewCarsBrandModelFilterFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c extends N implements l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ NewCarsBrandModelFilterFragment f207306l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(NewCarsBrandModelFilterFragment newCarsBrandModelFilterFragment) {
        super(1);
        this.f207306l = newCarsBrandModelFilterFragment;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        Button button = (Button) view.findViewById(R.id.brand_model_apply_button);
        NewCarsBrandModelFilterFragment newCarsBrandModelFilterFragment = this.f207306l;
        newCarsBrandModelFilterFragment.f207281l0 = button;
        if (button == null) {
            button = null;
        }
        button.setText(newCarsBrandModelFilterFragment.getString(R.string.new_cars_brandmodel_show_all_offers));
        button.setLoading(true);
        button.setOnClickListener(new ViewOnClickListenerC31873b(newCarsBrandModelFilterFragment, 24));
        return G0.f406611a;
    }
}
