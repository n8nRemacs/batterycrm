package com.avito.android.realty_agency.checkerboard.bottom_sheet;

import di0.C39735e;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CheckerboardSectionSelectorBottomSheet.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.realty_agency.checkerboard.bottom_sheet.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34209e extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C39735e f251010l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34209e(C39735e c39735e) {
        super(2);
        this.f251010l = c39735e;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            String sectionsLotsCount = this.f251010l.getSectionsLotsCount();
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(sectionsLotsCount, com.akita.compose.theme.re23.b.f63988f.f65245p, null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
        }
        return G0.f406611a;
    }
}
