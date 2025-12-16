package com.avito.android.lib.util;

import android.graphics.Rect;
import androidx.core.graphics.C22771k;
import androidx.core.view.J0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EdgeToEdgeHelper.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\t\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/core/view/J0;", "insets", "", "left", "top", "right", "bottom", "invoke", "(Landroidx/core/view/J0;IIII)Landroidx/core/view/J0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class o extends N implements Y41.s<J0, Integer, Integer, Integer, Integer, J0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f181417l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f181418m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Y41.r<? super Integer, ? super Integer, ? super Integer, ? super Integer, G0> rVar, boolean z12) {
        super(5);
        this.f181417l = rVar;
        this.f181418m = z12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.r, java.lang.Object] */
    @Override // Y41.s
    public final J0 invoke(J0 j02, Integer num, Integer num2, Integer num3, Integer num4) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        int iIntValue3 = num3.intValue();
        int iIntValue4 = num4.intValue();
        this.f181417l.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4));
        J0.b bVar = new J0.b(j02);
        i.f181373a.getClass();
        bVar.b(i.f181375c, C22771k.c(new Rect()));
        if (this.f181418m) {
            bVar.b(i.f181376d, C22771k.c(new Rect()));
        }
        return bVar.a();
    }
}
