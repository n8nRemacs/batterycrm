package com.avito.android.lib.util;

import android.view.View;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EdgeToEdgeHelper.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class l extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f181405l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(View view) {
        super(1);
        this.f181405l = view;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        View view = this.f181405l;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), iIntValue);
        return G0.f406611a;
    }
}
