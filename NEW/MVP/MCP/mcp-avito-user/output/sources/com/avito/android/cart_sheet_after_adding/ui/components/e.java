package com.avito.android.cart_sheet_after_adding.ui.components;

import android.os.Build;
import android.view.View;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CartSheetAfterAddingMainSnippet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f115529l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ View f115530m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(View view, Y41.l lVar) {
        super(1);
        this.f115529l = (N) lVar;
        this.f115530m = view;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(Integer num) {
        this.f115529l.invoke(Integer.valueOf(num.intValue()));
        float f12 = p.f115575a;
        if (Build.VERSION.SDK_INT >= 30) {
            this.f115530m.performHapticFeedback(16);
        }
        return G0.f406611a;
    }
}
