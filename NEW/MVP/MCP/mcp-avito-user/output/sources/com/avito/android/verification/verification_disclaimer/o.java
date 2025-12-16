package com.avito.android.verification.verification_disclaimer;

import com.avito.android.R;
import com.avito.android.mortgage.document_upload.B;
import com.avito.android.util.C35835l0;
import com.avito.android.verification.verification_disclaimer.VerificationDisclaimerScreenData;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationDisclaimerView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/bottom_sheet/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class o extends N implements Y41.l<com.avito.android.lib.design.bottom_sheet.o, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<VerificationDisclaimerScreenData.a> f325127l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ B f325128m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(List list, B b12) {
        super(1);
        this.f325127l = list;
        this.f325128m = b12;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.bottom_sheet.o oVar) {
        com.avito.android.lib.design.bottom_sheet.o oVar2 = oVar;
        for (VerificationDisclaimerScreenData.a aVar : this.f325127l) {
            com.avito.android.lib.design.bottom_sheet.o.W(oVar2, aVar.f325050a, Integer.valueOf(C35835l0.j(aVar.f325051b, oVar2.getContext())), Integer.valueOf(C35835l0.d(R.attr.black, oVar2.getContext())), null, null, new n(oVar2, this.f325128m, aVar), 24);
        }
        com.avito.android.lib.design.bottom_sheet.d.I(oVar2, true);
        return G0.f406611a;
    }
}
