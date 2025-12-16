package com.avito.android.advert_multi_items.param_chips.modification_chip;

import Qa.InterfaceC14873a;
import Y61.k;
import android.content.Context;
import android.view.View;
import com.avito.android.R;
import com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g;
import com.avito.android.advert_multi_items.model.ModificationViewState;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import m.C43852a;

/* compiled from: ModificationChipView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_multi_items/param_chips/modification_chip/c;", "Lcom/avito/android/advert_multi_items/param_chips/modification_chip/b;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-multi-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c extends com.avito.konveyor.adapter.b implements b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f85930e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC14873a f85931b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Button f85932c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f85933d;

    /* compiled from: ModificationChipView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ModificationViewState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ModificationViewState modificationViewState = ModificationViewState.f85896b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ModificationViewState modificationViewState2 = ModificationViewState.f85896b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public c(@k InterfaceC14873a interfaceC14873a, @k View view) {
        super(view);
        this.f85931b = interfaceC14873a;
        this.f85932c = (Button) view.findViewById(R.id.chip);
        this.f85933d = view.getContext();
    }

    @Override // com.avito.konveyor.util.d
    public final void kD(TV0.a aVar) {
        ModificationChipItem modificationChipItem = (ModificationChipItem) aVar;
        boolean zG2 = this.f85931b.g2();
        String str = modificationChipItem.f85925e;
        Button button = this.f85932c;
        button.setText(str);
        ModificationViewState modificationViewState = ModificationViewState.f85897c;
        ModificationViewState modificationViewState2 = modificationChipItem.f85924d;
        button.setSelected(modificationViewState2 == modificationViewState);
        int iOrdinal = modificationViewState2.ordinal();
        if (iOrdinal == 0) {
            button.setAppearanceFromAttr(R.attr.buttonSecondaryMedium);
            button.setForeground(null);
        } else if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                button.setAppearanceFromAttr(R.attr.buttonNotActiveMedium);
                button.setForeground(null);
            }
        } else if (zG2) {
            button.setAppearanceFromAttr(R.attr.buttonSecondaryMedium);
            button.setForeground(C43852a.a(this.f85933d, R.drawable.fg_multi_item_chip_selected));
        } else {
            button.setAppearanceFromAttr(R.attr.buttonPrimaryMedium);
            button.setForeground(null);
        }
        button.setOnClickListener(new g(26, modificationChipItem, this));
    }
}
