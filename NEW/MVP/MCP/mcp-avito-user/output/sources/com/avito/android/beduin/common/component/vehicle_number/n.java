package com.avito.android.beduin.common.component.vehicle_number;

import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.InputField;
import com.avito.android.lib.design.input.s;
import com.avito.android.ui.view.RestrictedSelectionEditText;
import com.avito.android.util.K2;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VehicleRegNumberInputItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/vehicle_number/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/beduin/common/component/vehicle_number/j;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f102867b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RestrictedSelectionEditText f102868c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InputField f102869d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final View f102870e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public ue.d f102871f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public s f102872g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public ue.e f102873h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public s f102874i;

    public n(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        ComponentContainer componentContainer = (ComponentContainer) viewFindViewById;
        this.f102867b = componentContainer;
        View viewFindViewById2 = componentContainer.findViewById(R.id.vehicle_reg_number);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.number);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.ui.view.RestrictedSelectionEditText");
        }
        this.f102868c = (RestrictedSelectionEditText) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.region);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.InputField");
        }
        this.f102869d = (InputField) viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.divider);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f102870e = viewFindViewById5;
        final int i12 = 0;
        view.findViewById(R.id.number_container).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.beduin.common.component.vehicle_number.k

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n f102864c;

            {
                this.f102864c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        K2.i(this.f102864c.f102868c);
                        break;
                    default:
                        K2.i(this.f102864c.f102869d);
                        break;
                }
            }
        });
        final int i13 = 1;
        view.findViewById(R.id.region_container).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.beduin.common.component.vehicle_number.k

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n f102864c;

            {
                this.f102864c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        K2.i(this.f102864c.f102868c);
                        break;
                    default:
                        K2.i(this.f102864c.f102869d);
                        break;
                }
            }
        });
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        ue.d dVar = this.f102871f;
        RestrictedSelectionEditText restrictedSelectionEditText = this.f102868c;
        if (dVar != null) {
            restrictedSelectionEditText.removeTextChangedListener(dVar);
        }
        s sVar = this.f102872g;
        if (sVar != null) {
            restrictedSelectionEditText.removeTextChangedListener(sVar);
        }
        ue.e eVar = this.f102873h;
        InputField inputField = this.f102869d;
        if (eVar != null) {
            inputField.removeTextChangedListener(eVar);
        }
        s sVar2 = this.f102874i;
        if (sVar2 != null) {
            inputField.removeTextChangedListener(sVar2);
        }
        K2.d(this.f102867b, true);
    }
}
