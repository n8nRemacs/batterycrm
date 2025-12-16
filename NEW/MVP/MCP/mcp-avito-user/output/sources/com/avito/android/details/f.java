package com.avito.android.details;

import com.avito.android.select.Arguments;
import com.avito.android.select.auto_early_access_select.AutoEarlyAccessSelectParams;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f135904b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SelectItemBaseFragment f135905c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f135906d;

    public /* synthetic */ f(SelectItemBaseFragment selectItemBaseFragment, Object obj, int i12) {
        this.f135904b = i12;
        this.f135905c = selectItemBaseFragment;
        this.f135906d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f135904b) {
            case 0:
                com.avito.android.blueprints.selector_card_group_bottom_sheet.k kVar = (com.avito.android.blueprints.selector_card_group_bottom_sheet.k) this.f135906d;
                SelectItemBaseFragment selectItemBaseFragment = this.f135905c;
                selectItemBaseFragment.getClass();
                new com.avito.android.blueprints.selector_card_group_bottom_sheet.d(selectItemBaseFragment.requireContext(), kVar, new g(selectItemBaseFragment, kVar)).V();
                break;
            case 1:
                this.f135905c.q5((AutoEarlyAccessSelectParams) this.f135906d);
                break;
            default:
                this.f135905c.r5((Arguments) this.f135906d);
                break;
        }
    }
}
