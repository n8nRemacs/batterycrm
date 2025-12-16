package com.avito.android.inline_filters.dialog.numeric_range_select;

import com.avito.android.lib.design.input.Input;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NumericRangeSelectFilterDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class r extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x f171931l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(x xVar) {
        super(1);
        this.f171931l = xVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        x xVar = this.f171931l;
        if (str2 == null) {
            str2 = "";
        }
        Input.t(xVar.f171938e, str2, false, 6);
        return G0.f406611a;
    }
}
