package com.avito.android.comfortable_deal.deal.item.mortgage;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MortgageBannerBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/mortgage/a;", "LTV0/b;", "Lcom/avito/android/comfortable_deal/deal/item/mortgage/i;", "Lcom/avito/android/comfortable_deal/deal/item/mortgage/c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements TV0.b<i, c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f121429a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<k> f121430b = new g.a<>(R.layout.deal_item_mortgage_banner, C3587a.f121431l);

    /* compiled from: MortgageBannerBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/comfortable_deal/deal/item/mortgage/k;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/comfortable_deal/deal/item/mortgage/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.comfortable_deal.deal.item.mortgage.a$a, reason: collision with other inner class name */
    public static final class C3587a extends N implements p<ViewGroup, View, k> {

        /* renamed from: l, reason: collision with root package name */
        public static final C3587a f121431l = new C3587a();

        public C3587a() {
            super(2);
        }

        @Override // Y41.p
        public final k invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            final k kVar = new k(view2);
            View viewFindViewById = view2.findViewById(R.id.consultation_button);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            Button button = (Button) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.close);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            ImageView imageView = (ImageView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.mortgage_button);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            final int i12 = 0;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.comfortable_deal.deal.item.mortgage.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i12) {
                        case 0:
                            Y41.a<G0> aVar = kVar.f121447b;
                            if (aVar != null) {
                                aVar.invoke();
                                break;
                            }
                            break;
                        case 1:
                            Y41.a<G0> aVar2 = kVar.f121448c;
                            if (aVar2 != null) {
                                aVar2.invoke();
                                break;
                            }
                            break;
                        default:
                            Y41.a<G0> aVar3 = kVar.f121449d;
                            if (aVar3 != null) {
                                aVar3.invoke();
                                break;
                            }
                            break;
                    }
                }
            });
            final int i13 = 1;
            ((Button) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.comfortable_deal.deal.item.mortgage.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i13) {
                        case 0:
                            Y41.a<G0> aVar = kVar.f121447b;
                            if (aVar != null) {
                                aVar.invoke();
                                break;
                            }
                            break;
                        case 1:
                            Y41.a<G0> aVar2 = kVar.f121448c;
                            if (aVar2 != null) {
                                aVar2.invoke();
                                break;
                            }
                            break;
                        default:
                            Y41.a<G0> aVar3 = kVar.f121449d;
                            if (aVar3 != null) {
                                aVar3.invoke();
                                break;
                            }
                            break;
                    }
                }
            });
            final int i14 = 2;
            button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.comfortable_deal.deal.item.mortgage.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i14) {
                        case 0:
                            Y41.a<G0> aVar = kVar.f121447b;
                            if (aVar != null) {
                                aVar.invoke();
                                break;
                            }
                            break;
                        case 1:
                            Y41.a<G0> aVar2 = kVar.f121448c;
                            if (aVar2 != null) {
                                aVar2.invoke();
                                break;
                            }
                            break;
                        default:
                            Y41.a<G0> aVar3 = kVar.f121449d;
                            if (aVar3 != null) {
                                aVar3.invoke();
                                break;
                            }
                            break;
                    }
                }
            });
            return kVar;
        }
    }

    @Inject
    public a(@Y61.k g gVar) {
        this.f121429a = gVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f121429a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<k> b() {
        return this.f121430b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof c;
    }
}
