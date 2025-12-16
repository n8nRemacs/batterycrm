package com.avito.android.blueprints.publish.reg_number;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.ui.view.RestrictedSelectionEditText;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VehicleRegNumberInputItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/publish/reg_number/t;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/blueprints/publish/reg_number/r;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class t extends com.avito.konveyor.adapter.b implements r {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f106434b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RestrictedSelectionEditText f106435c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AppCompatEditText f106436d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final View f106437e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f106438f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f106439g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public ue.d f106440h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.input.s f106441i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public TextWatcher f106442j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.input.s f106443k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f106444l;

    /* compiled from: VehicleRegNumberInputItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f106445l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super String, G0> lVar) {
            super(1);
            this.f106445l = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            this.f106445l.invoke(str);
            return G0.f406611a;
        }
    }

    /* compiled from: VehicleRegNumberInputItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f106446l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super String, G0> lVar) {
            super(1);
            this.f106446l = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            this.f106446l.invoke(str);
            return G0.f406611a;
        }
    }

    public t(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        ComponentContainer componentContainer = (ComponentContainer) viewFindViewById;
        this.f106434b = componentContainer;
        View viewFindViewById2 = componentContainer.findViewById(R.id.vehicle_reg_number);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.number);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.ui.view.RestrictedSelectionEditText");
        }
        this.f106435c = (RestrictedSelectionEditText) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.region);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.AppCompatEditText");
        }
        this.f106436d = (AppCompatEditText) viewFindViewById4;
        this.f106437e = viewGroup.findViewById(R.id.border);
        View viewFindViewById5 = viewGroup.findViewById(R.id.divider);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f106438f = viewFindViewById5;
        View viewFindViewById6 = viewGroup.findViewById(R.id.country_code);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f106439g = (TextView) viewFindViewById6;
        final int i12 = 0;
        view.findViewById(R.id.number_container).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.blueprints.publish.reg_number.s

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ t f106433c;

            {
                this.f106433c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        K2.i(this.f106433c.f106435c);
                        break;
                    default:
                        K2.i(this.f106433c.f106436d);
                        break;
                }
            }
        });
        final int i13 = 1;
        view.findViewById(R.id.region_container).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.blueprints.publish.reg_number.s

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ t f106433c;

            {
                this.f106433c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        K2.i(this.f106433c.f106435c);
                        break;
                    default:
                        K2.i(this.f106433c.f106436d);
                        break;
                }
            }
        });
    }

    @Override // com.avito.android.blueprints.publish.reg_number.r
    public final void A10(@Y61.l String str) {
        this.f106436d.setText(str);
    }

    @Override // com.avito.android.blueprints.publish.reg_number.r
    public final void Ch(@Y61.k ue.d dVar) {
        this.f106440h = dVar;
        this.f106435c.addTextChangedListener(dVar);
    }

    @Override // com.avito.android.blueprints.publish.reg_number.r
    public final void D60(@Y61.l String str) {
        String string;
        AppCompatEditText appCompatEditText = this.f106436d;
        Editable text = appCompatEditText.getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        if (L.f(str, string)) {
            return;
        }
        appCompatEditText.setText(str);
    }

    @Override // com.avito.android.blueprints.publish.reg_number.r
    public final void Ef(boolean z12) {
        View view = this.f106437e;
        if (view == null) {
            return;
        }
        if (z12) {
            D6.H(view);
        } else {
            D6.g(view);
        }
    }

    @Override // com.avito.android.blueprints.publish.reg_number.r
    public final void F10(@Y61.k TextWatcher textWatcher) {
        this.f106442j = textWatcher;
        this.f106436d.addTextChangedListener(textWatcher);
    }

    @Override // com.avito.android.blueprints.publish.reg_number.r
    public final void H(@Y61.l CharSequence charSequence) {
        ComponentContainer.n(this.f106434b, charSequence, 2);
    }

    @Override // com.avito.android.blueprints.publish.reg_number.r
    public final void I60() {
        ue.d dVar = this.f106440h;
        if (dVar == null) {
            return;
        }
        this.f106435c.removeTextChangedListener(dVar);
    }

    @Override // com.avito.android.blueprints.publish.reg_number.r
    public final void K7(@Y61.l String str) {
        this.f106435c.setText(str);
    }

    @Override // com.avito.android.blueprints.publish.reg_number.r
    public final void L10() {
        com.avito.android.lib.design.input.s sVar = this.f106443k;
        if (sVar == null) {
            return;
        }
        this.f106436d.removeTextChangedListener(sVar);
    }

    @Override // com.avito.android.blueprints.publish.reg_number.r
    public final void R8(@Y61.l Integer num, @Y61.l Integer num2) {
        ComponentContainer componentContainer = this.f106434b;
        D6.f(componentContainer, 0, num != null ? y6.b(num.intValue()) : componentContainer.getPaddingTop(), 0, num2 != null ? y6.b(num2.intValue()) : this.f106434b.getPaddingBottom(), 5);
    }

    @Override // com.avito.android.blueprints.publish.reg_number.r
    public final void VC() {
        TextWatcher textWatcher = this.f106442j;
        if (textWatcher == null) {
            return;
        }
        this.f106436d.removeTextChangedListener(textWatcher);
    }

    @Override // com.avito.android.blueprints.publish.reg_number.r
    public final void aN(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f106441i = com.avito.android.lib.design.input.n.b(this.f106435c, new a(lVar));
    }

    @Override // com.avito.android.blueprints.publish.reg_number.r
    public final void fN() {
        this.f106435c.requestFocus();
    }

    @Override // com.avito.android.blueprints.publish.reg_number.r
    public final void gO() {
        if (this.f106435c.isFocused()) {
            this.f106436d.requestFocus();
        }
    }

    @Override // com.avito.android.blueprints.publish.reg_number.r
    @Y61.k
    public final Context getContext() {
        return this.itemView.getContext();
    }

    @Override // com.avito.android.blueprints.publish.reg_number.r
    public final void ir(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f106443k = com.avito.android.lib.design.input.n.b(this.f106436d, new b(lVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f106444l;
        if (aVar != null) {
            ((f) aVar).invoke();
        }
        this.f106444l = null;
        I60();
        lH();
        VC();
        L10();
        K2.d(this.f106434b, true);
    }

    @Override // com.avito.android.blueprints.publish.reg_number.r
    public final void lH() {
        com.avito.android.lib.design.input.s sVar = this.f106441i;
        if (sVar == null) {
            return;
        }
        this.f106435c.removeTextChangedListener(sVar);
    }

    @Override // com.avito.android.blueprints.publish.reg_number.r
    public final void oE(@Y61.l String str) {
        String string;
        RestrictedSelectionEditText restrictedSelectionEditText = this.f106435c;
        Editable text = restrictedSelectionEditText.getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        if (L.f(str, string)) {
            return;
        }
        restrictedSelectionEditText.setText(str);
    }

    @Override // com.avito.android.blueprints.publish.reg_number.r
    public final void setEnabled(boolean z12) {
        this.f106439g.setEnabled(z12);
        this.f106434b.setEnabled(z12);
        RestrictedSelectionEditText restrictedSelectionEditText = this.f106435c;
        restrictedSelectionEditText.setEnabled(z12);
        AppCompatEditText appCompatEditText = this.f106436d;
        appCompatEditText.setEnabled(z12);
        restrictedSelectionEditText.setFocusable(z12);
        appCompatEditText.setFocusable(z12);
    }

    @Override // com.avito.android.blueprints.publish.reg_number.r
    public final void setTitle(@Y61.k String str) {
        this.f106434b.setTitle(str);
    }

    @Override // com.avito.android.blueprints.publish.reg_number.r
    public final void t(@Y61.k Y41.a<G0> aVar) {
        this.f106444l = aVar;
    }

    @Override // com.avito.android.blueprints.publish.reg_number.r
    public final void u(@Y61.l CharSequence charSequence) {
        this.f106434b.q(charSequence);
    }
}
