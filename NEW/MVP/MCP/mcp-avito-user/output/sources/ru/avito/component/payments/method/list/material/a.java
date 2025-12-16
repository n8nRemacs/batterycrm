package ru.avito.component.payments.method.list.material;

import TV0.g;
import Y41.p;
import Y61.k;
import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.avito.android.R;
import hw.InterfaceC41178c;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MaterialPaymentMethodBlueprint.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lru/avito/component/payments/method/list/material/a;", "LTV0/b;", "Lru/avito/component/payments/method/list/material/e;", "LO81/b;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a implements TV0.b<e, O81.b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f430398a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f f430399b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<b> f430400c = new g.a<>(R.layout.payment_method_list_card_material_horizontal, new C12399a());

    /* compiled from: MaterialPaymentMethodBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lru/avito/component/payments/method/list/material/b;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lru/avito/component/payments/method/list/material/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.avito.component.payments.method.list.material.a$a, reason: collision with other inner class name */
    public static final class C12399a extends N implements p<ViewGroup, View, b> {
        public C12399a() {
            super(2);
        }

        @Override // Y41.p
        public final b invoke(ViewGroup viewGroup, View view) throws Resources.NotFoundException {
            View view2 = view;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            Activity activity = a.this.f430399b.f430409a;
            int width = ((LinearLayout) activity.findViewById(R.id.content_container)).getWidth();
            int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.payment_method_list_button_bar_padding);
            int dimensionPixelSize2 = activity.getResources().getDimensionPixelSize(R.dimen.payment_method_list_space_between_blocks_size);
            layoutParams.width = (int) ((4 * (((width - (dimensionPixelSize * 2)) - (dimensionPixelSize2 * 6)) / 7.0f)) + (dimensionPixelSize2 * 3));
            view2.setLayoutParams(layoutParams);
            return new b(view2);
        }
    }

    public a(@k d dVar, @k f fVar) {
        this.f430398a = dVar;
        this.f430399b = fVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f430398a;
    }

    @Override // TV0.b
    @k
    public final g.a<b> b() {
        return this.f430400c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof O81.b;
    }
}
