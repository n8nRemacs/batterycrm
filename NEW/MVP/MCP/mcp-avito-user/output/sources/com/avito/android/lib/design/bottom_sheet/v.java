package com.avito.android.lib.design.bottom_sheet;

import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ModalBottomSheetView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class v extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f178606l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(u uVar) {
        super(0);
        this.f178606l = uVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        u uVar = this.f178606l;
        int iF2 = C35835l0.f(R.attr.bottomSheet_titleMarginRight, uVar.f178581h.getContext());
        int iB2 = y6.b(8);
        TextView textView = uVar.f178586m;
        int iMax = Math.max(iF2, Math.max(uVar.f178582i.getWidth() + C35835l0.f(R.attr.bottomSheet_closeMarginLeft, textView.getContext()) + iB2, textView.getWidth() + C35835l0.f(R.attr.bottomSheet_actionButtonMarginRight, textView.getContext()) + iB2));
        D6.c(uVar.f178581h, Integer.valueOf(iMax), null, Integer.valueOf(iMax), null, 10);
        return G0.f406611a;
    }
}
