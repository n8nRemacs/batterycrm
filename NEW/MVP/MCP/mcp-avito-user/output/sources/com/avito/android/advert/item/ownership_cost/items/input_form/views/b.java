package com.avito.android.advert.item.ownership_cost.items.input_form.views;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.InterfaceC35745a5;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.g;

/* compiled from: CalculateButton.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/items/input_form/views/b;", "Lcom/avito/android/advert/item/ownership_cost/items/input_form/views/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements com.avito.android.advert.item.ownership_cost.items.input_form.views.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f78017b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Button f78018c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public y f78019d;

    /* compiled from: CalculateButton.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f78020b;

        public a(Y41.a<G0> aVar) {
            this.f78020b = aVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f78020b.invoke();
        }
    }

    public b(@k View view, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f78017b = interfaceC35745a5;
        View viewFindViewById = view.findViewById(R.id.calculate_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f78018c = (Button) viewFindViewById;
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.input_form.views.a
    public final void GU(boolean z12) {
        Button button = this.f78018c;
        ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
        layoutParams.width = z12 ? -1 : -2;
        button.setLayoutParams(layoutParams);
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.input_form.views.a
    public final void e6(boolean z12) {
        Button button = this.f78018c;
        button.setLoading(z12);
        button.setClickable(!z12);
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.input_form.views.a
    public final void pk(@k String str, @l Y41.a<G0> aVar) {
        Button button = this.f78018c;
        button.setText(str);
        y yVar = this.f78019d;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f78019d = (y) C37722i.a(button).C0(300L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).j0(this.f78017b.e()).t0(new a(aVar));
    }
}
