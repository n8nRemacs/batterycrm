package com.avito.android.profile_phones.phones_list;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.lib.design.picker.k;
import com.avito.android.util.V2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: IacTimeIntervalPicker.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/e;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.profile_phones.phones_list.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class DialogC33420e extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ int f227734K = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public final l41.g<Y> f227735E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final X f227736F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public final Y41.l<Y, G0> f227737G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public final Button f227738H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f227739I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final ListItemSwitcher f227740J;

    /* compiled from: IacTimeIntervalPicker.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/picker/k;", "leftInterval", "rightInterval", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/picker/k;Lcom/avito/android/lib/design/picker/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.profile_phones.phones_list.e$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.avito.android.lib.design.picker.k<?>, com.avito.android.lib.design.picker.k<?>, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Picker f227742m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.picker.k<?> f227743n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.picker.k<?> f227744o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Picker picker, com.avito.android.lib.design.picker.k<?> kVar, com.avito.android.lib.design.picker.k<?> kVar2) {
            super(2);
            this.f227742m = picker;
            this.f227743n = kVar;
            this.f227744o = kVar2;
        }

        @Override // Y41.p
        public final G0 invoke(com.avito.android.lib.design.picker.k<?> kVar, com.avito.android.lib.design.picker.k<?> kVar2) {
            com.avito.android.lib.design.picker.k<?> kVar3 = kVar2;
            DialogC33420e dialogC33420e = DialogC33420e.this;
            Picker picker = this.f227742m;
            DialogC33420e.V(dialogC33420e, picker);
            if (kotlin.jvm.internal.L.f(kVar, this.f227743n) && kotlin.jvm.internal.L.f(kVar3, this.f227744o)) {
                picker.f();
            }
            return G0.f406611a;
        }
    }

    public DialogC33420e() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC33420e(Context context, l41.g gVar, X x12, Y41.l lVar, int i12, C42822w c42822w) {
        super(context, 0, 2, null);
        l41.g gVar2 = (i12 & 2) != 0 ? null : gVar;
        Y41.l lVar2 = (i12 & 8) != 0 ? null : lVar;
        this.f227735E = gVar2;
        this.f227736F = x12;
        this.f227737G = lVar2;
        this.f227739I = new io.reactivex.rxjava3.disposables.c();
        D(R.layout.time_picker_interval, true);
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 7);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.timePickerContainer);
        Button button = (Button) findViewById(R.id.timePickerApply);
        this.f227738H = button;
        ListItemSwitcher listItemSwitcher = (ListItemSwitcher) findViewById(R.id.timePickerAnyTimeSwitcher);
        this.f227740J = listItemSwitcher;
        final Picker picker = new Picker(getContext(), null, 0, 0, 14, null);
        com.avito.android.lib.design.picker.k.f180042c.getClass();
        Picker.d(picker, k.a.c(), null, 14);
        com.avito.android.lib.design.picker.l lVar3 = new com.avito.android.lib.design.picker.l(picker.getContext(), null, R.drawable.design_interval_divider, 2, null);
        lVar3.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        picker.f179979c.addView(lVar3);
        Picker.d(picker, k.a.c(), new com.avito.android.lib.design.picker.m(null, false, 0, 7, null), 12);
        picker.setOnScrollFinishedCallback(new C33415c(this, picker));
        picker.setOnSecondScrollFinishedCallback(new C33416d(this, picker));
        Z(picker, x12.f227426a, x12.f227427b);
        final int i13 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.profile_phones.phones_list.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DialogC33420e f227511c;

            {
                this.f227511c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        DialogC33420e dialogC33420e = this.f227511c;
                        Y41.l<Y, G0> lVar4 = dialogC33420e.f227737G;
                        Picker picker2 = picker;
                        if (lVar4 != null) {
                            lVar4.invoke(dialogC33420e.W(picker2));
                        }
                        l41.g<Y> gVar3 = dialogC33420e.f227735E;
                        if (gVar3 != null) {
                            gVar3.accept(dialogC33420e.W(picker2));
                            break;
                        }
                        break;
                    default:
                        DialogC33420e dialogC33420e2 = this.f227511c;
                        boolean zIsChecked = dialogC33420e2.f227740J.isChecked();
                        Picker picker3 = picker;
                        X x13 = dialogC33420e2.f227736F;
                        if (!zIsChecked) {
                            org.threeten.bp.g gVar4 = x13.f227426a;
                            org.threeten.bp.g gVar5 = x13.f227428c;
                            boolean zF2 = kotlin.jvm.internal.L.f(gVar4, gVar5);
                            org.threeten.bp.g gVar6 = x13.f227427b;
                            if (!zF2 || !kotlin.jvm.internal.L.f(gVar6, gVar5)) {
                                dialogC33420e2.Z(picker3, x13.f227426a, gVar6);
                                break;
                            } else {
                                dialogC33420e2.Z(picker3, x13.f227429d, x13.f227430e);
                                break;
                            }
                        } else {
                            org.threeten.bp.g gVar7 = x13.f227428c;
                            dialogC33420e2.Z(picker3, gVar7, gVar7);
                            break;
                        }
                        break;
                }
            }
        });
        viewGroup.addView(picker, viewGroup.indexOfChild(findViewById(R.id.timePickerAnyTimeSwitcher)) + 1);
        ((ImageView) findViewById(R.id.timePickerCloseButton)).setOnClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(this, 4));
        final int i14 = 1;
        listItemSwitcher.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.profile_phones.phones_list.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DialogC33420e f227511c;

            {
                this.f227511c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        DialogC33420e dialogC33420e = this.f227511c;
                        Y41.l<Y, G0> lVar4 = dialogC33420e.f227737G;
                        Picker picker2 = picker;
                        if (lVar4 != null) {
                            lVar4.invoke(dialogC33420e.W(picker2));
                        }
                        l41.g<Y> gVar3 = dialogC33420e.f227735E;
                        if (gVar3 != null) {
                            gVar3.accept(dialogC33420e.W(picker2));
                            break;
                        }
                        break;
                    default:
                        DialogC33420e dialogC33420e2 = this.f227511c;
                        boolean zIsChecked = dialogC33420e2.f227740J.isChecked();
                        Picker picker3 = picker;
                        X x13 = dialogC33420e2.f227736F;
                        if (!zIsChecked) {
                            org.threeten.bp.g gVar4 = x13.f227426a;
                            org.threeten.bp.g gVar5 = x13.f227428c;
                            boolean zF2 = kotlin.jvm.internal.L.f(gVar4, gVar5);
                            org.threeten.bp.g gVar6 = x13.f227427b;
                            if (!zF2 || !kotlin.jvm.internal.L.f(gVar6, gVar5)) {
                                dialogC33420e2.Z(picker3, x13.f227426a, gVar6);
                                break;
                            } else {
                                dialogC33420e2.Z(picker3, x13.f227429d, x13.f227430e);
                                break;
                            }
                        } else {
                            org.threeten.bp.g gVar7 = x13.f227428c;
                            dialogC33420e2.Z(picker3, gVar7, gVar7);
                            break;
                        }
                        break;
                }
            }
        });
    }

    public static final void V(DialogC33420e dialogC33420e, Picker picker) {
        ListItemSwitcher listItemSwitcher = dialogC33420e.f227740J;
        if (listItemSwitcher.isChecked() && !dialogC33420e.X(picker)) {
            listItemSwitcher.setChecked(false);
        }
        if (listItemSwitcher.isChecked() || !dialogC33420e.X(picker)) {
            return;
        }
        listItemSwitcher.setChecked(true);
    }

    public static org.threeten.bp.g Y(int i12) {
        int i13 = i12 % 2 != 0 ? 1 : 0;
        return org.threeten.bp.g.u((i12 - i13) / 2, i13 != 0 ? 30 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Y W(Picker picker) {
        com.avito.android.lib.design.picker.k<?> firstWheelValue = picker.getFirstWheelValue();
        if (firstWheelValue == null) {
            firstWheelValue = null;
        }
        com.avito.android.lib.design.picker.k<?> secondWheelValue = picker.getSecondWheelValue();
        com.avito.android.lib.design.picker.k<?> kVar = secondWheelValue != null ? secondWheelValue : null;
        if (firstWheelValue != null && kVar != null) {
            return new Y(Y(((Number) firstWheelValue.f180046a).intValue()), Y(((Number) kVar.f180046a).intValue()));
        }
        X x12 = this.f227736F;
        org.threeten.bp.g gVar = x12.f227426a;
        org.threeten.bp.g gVar2 = x12.f227427b;
        gVar.toString();
        x12.f227426a.toString();
        return new Y(gVar, gVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean X(Picker picker) {
        com.avito.android.lib.design.picker.k<?> firstWheelValue = picker.getFirstWheelValue();
        if (firstWheelValue == null) {
            firstWheelValue = null;
        }
        com.avito.android.lib.design.picker.k<?> secondWheelValue = picker.getSecondWheelValue();
        if (secondWheelValue == null) {
            secondWheelValue = null;
        }
        V2.f318762a.c("IacTimeIntervalPicker", "checkIsAnyTime", null);
        if (firstWheelValue == null || secondWheelValue == null) {
            return false;
        }
        org.threeten.bp.g gVarY = Y(((Number) firstWheelValue.f180046a).intValue());
        org.threeten.bp.g gVarY2 = Y(((Number) secondWheelValue.f180046a).intValue());
        X x12 = this.f227736F;
        return (gVarY.equals(x12.f227428c) && gVarY2.equals(x12.f227428c)) || (x12.f227431f && gVarY.equals(x12.f227429d) && gVarY2.equals(x12.f227430e));
    }

    public final void Z(Picker picker, org.threeten.bp.g gVar, org.threeten.bp.g gVar2) {
        com.avito.android.lib.design.picker.k.f180042c.getClass();
        com.avito.android.lib.design.picker.k<?> kVar = (com.avito.android.lib.design.picker.k) k.a.c().get((gVar.f422072b * 2) + (gVar.f422073c == 0 ? 0 : 1));
        com.avito.android.lib.design.picker.k<?> kVar2 = (com.avito.android.lib.design.picker.k) k.a.c().get((gVar2.f422072b * 2) + (gVar2.f422073c == 0 ? 0 : 1));
        picker.setFirstWheelValue(kVar);
        picker.setSecondWheelValue(kVar2);
        picker.setOnSelection(new a(picker, kVar, kVar2));
    }

    @Override // com.avito.android.lib.design.bottom_sheet.d, android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f227739I.dispose();
        super.onDetachedFromWindow();
    }
}
