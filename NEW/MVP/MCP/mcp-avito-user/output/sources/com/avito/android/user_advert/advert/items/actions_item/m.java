package com.avito.android.user_advert.advert.items.actions_item;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.o;
import com.avito.android.lib.design.tooltip.p;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.serp.adapter.serp_advert_card.A;
import com.avito.android.user_advert.advert.items.actions_item.ActionsItem;
import com.avito.android.util.D6;
import com.avito.android.util.p6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;

/* compiled from: ActionsItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/actions_item/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/actions_item/l;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f309046f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f309047b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f309048c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f309049d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.tooltip.k f309050e;

    /* compiled from: ActionsItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ActionsItem.Action.Style.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ActionsItem.Action.Style style = ActionsItem.Action.Style.f309007b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: ActionsItemView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<o, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f309051l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z12) {
            super(1);
            this.f309051l = z12;
        }

        @Override // Y41.l
        public final G0 invoke(o oVar) {
            oVar.a(this.f309051l ? R.string.item_promotion_sbc_trx_onboarding_text : R.string.item_promotion_sbc_default_onboarding_text);
            return G0.f406611a;
        }
    }

    /* compiled from: ActionsItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Boolean> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ View f309053m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(0);
            this.f309053m = view;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            com.avito.android.lib.design.tooltip.k kVar = m.this.f309050e;
            if (kVar != null) {
                kVar.f(this.f309053m);
            }
            return Boolean.TRUE;
        }
    }

    public m(@Y61.k View view) {
        super(view);
        this.f309047b = view;
        this.f309048c = LayoutInflater.from(view.getContext());
        this.f309049d = (ViewGroup) view.findViewById(R.id.actions_container);
    }

    public final Button B80(String str, ActionsItem.Action.Style style, Y41.a aVar) {
        int i12;
        Button button = (Button) this.f309048c.inflate(R.layout.my_advert_action_button, (ViewGroup) null, false);
        button.setText(str);
        int iOrdinal = style.ordinal();
        if (iOrdinal == 0) {
            i12 = R.attr.buttonPrimaryLarge;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.attr.buttonSecondaryLarge;
        }
        button.setAppearanceFromAttr(i12);
        button.setOnClickListener(new A(21, aVar));
        return button;
    }

    @Override // com.avito.android.user_advert.advert.items.actions_item.l
    public final void N00(@Y61.k String str, @Y61.k ActionsItem.Action.Style style, @Y61.k Y41.a<G0> aVar, @Y61.k String str2, @Y61.k ActionsItem.Action.Style style2, @Y61.k Y41.a<G0> aVar2) {
        LinearLayout linearLayout = (LinearLayout) this.f309048c.inflate(R.layout.my_advert_actions_item_line, (ViewGroup) null, false);
        linearLayout.addView(B80(str, style, aVar));
        linearLayout.addView(B80(str2, style2, aVar2));
        p6 p6Var = new p6(linearLayout);
        while (p6Var.hasNext()) {
            View view = (View) p6Var.next();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams.weight = 1.0f;
            layoutParams.width = 0;
            view.setLayoutParams(layoutParams);
        }
        this.f309049d.addView(linearLayout);
    }

    @Override // com.avito.android.user_advert.advert.items.actions_item.l
    public final void QX(@Y61.k Y41.a aVar, boolean z12) {
        com.avito.android.lib.design.tooltip.k kVar = this.f309050e;
        if (kVar != null) {
            kVar.setOnDismissListener(null);
        }
        com.avito.android.lib.design.tooltip.k kVar2 = this.f309050e;
        if (kVar2 != null) {
            kVar2.dismiss();
        }
        com.avito.android.lib.design.tooltip.k kVar3 = new com.avito.android.lib.design.tooltip.k(this.f309047b.getContext(), 0, 0, 6, null);
        int iB2 = y6.b(241);
        int i12 = kVar3.f181229o;
        kVar3.f181228n = iB2;
        kVar3.f181229o = i12;
        kVar3.f181224j = new r.a(new i.a(new b.a()));
        p.a(kVar3, new b(z12));
        kVar3.setOnDismissListener(new com.avito.android.campaigns_sale.konveyor.editBlock.o(3, aVar));
        this.f309050e = kVar3;
        View view = (View) C43033p.x(C43033p.b(new p6(this.f309049d)));
        D6.C(new c(view), this.itemView);
    }

    @Override // com.avito.android.user_advert.advert.items.actions_item.l
    public final void Qm() {
        this.f309049d.removeAllViews();
    }

    @Override // com.avito.android.user_advert.advert.items.actions_item.l
    public final void hB(@Y61.k String str, @Y61.k ActionsItem.Action.Style style, @Y61.k Y41.a<G0> aVar) {
        this.f309049d.addView(B80(str, style, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        com.avito.android.lib.design.tooltip.k kVar = this.f309050e;
        if (kVar != null) {
            kVar.setOnDismissListener(null);
        }
        com.avito.android.lib.design.tooltip.k kVar2 = this.f309050e;
        if (kVar2 != null) {
            kVar2.dismiss();
        }
        this.f309050e = null;
    }

    @Override // com.avito.android.user_advert.advert.items.actions_item.l
    public final void jn(@Y61.k String str, @Y61.k ActionsItem.Action.Style style, @Y61.l String str2, @Y61.k Y41.a<G0> aVar) {
        int i12;
        ViewGroup viewGroup = (ViewGroup) this.f309048c.inflate(R.layout.my_advert_action_with_badge_item, (ViewGroup) null, false);
        Button button = (Button) viewGroup.findViewById(R.id.action_button);
        Badge badge = (Badge) viewGroup.findViewById(R.id.my_advert_action_with_badge_item_badge);
        button.setState(new UU.a(str, null, false, false, false, aVar, null, null, null, false, 990, null));
        int iOrdinal = style.ordinal();
        if (iOrdinal == 0) {
            i12 = R.attr.buttonPrimaryLarge;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.attr.buttonSecondaryLarge;
        }
        button.setAppearanceFromAttr(i12);
        if (str2 == null) {
            D6.w(badge);
        } else {
            badge.setState(new com.avito.android.lib.design.badge.f(str2, null, false, 6, null));
            D6.H(badge);
        }
        this.f309049d.addView(viewGroup);
    }
}
