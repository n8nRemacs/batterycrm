package com.avito.android.comfortable_deal.end_deal;

import com.avito.android.comfortable_deal.end_deal.model.EndDealField;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: EndDealScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.comfortable_deal.end_deal.l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29482l extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EndDealField.Comment f122232l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f122233m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C29482l(EndDealField.Comment comment, Y41.l<? super String, G0> lVar) {
        super(3);
        this.f122232l = comment;
        this.f122233m = lVar;
    }

    @Override // Y41.q
    public final G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            String str = this.f122232l.f122268b;
            if (str == null) {
                str = "";
            }
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.input.u.b(str, com.akita.compose.theme.re23.b.l(a13).getF66388c(), this.f122233m, null, null, false, null, false, null, null, null, 6, false, 6, null, null, null, null, a13, 0, 3504, 247800);
        }
        return G0.f406611a;
    }
}
