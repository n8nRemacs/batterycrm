package com.avito.android.iac_problems.impl_module.problems_bottom_sheet.view.items;

import com.avito.android.remote.model.UniversalImage;
import eM.InterfaceC40021a;
import l40.InterfaceC43542a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class V implements androidx.compose.ui.text.D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168992a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l f168993b;

    public /* synthetic */ V(int i12, Y41.l lVar) {
        this.f168992a = i12;
        this.f168993b = lVar;
    }

    @Override // androidx.compose.ui.text.D
    public final void onClick() {
        Y41.l lVar = this.f168993b;
        switch (this.f168992a) {
            case 0:
                UniversalImage universalImage = a0.f169002a;
                lVar.invoke(InterfaceC40021a.f.f395121a);
                break;
            case 1:
                lVar.invoke(InterfaceC43542a.k.f413459a);
                break;
            default:
                lVar.invoke(InterfaceC43542a.j.f413458a);
                break;
        }
    }
}
