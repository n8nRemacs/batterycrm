package com.avito.android.payment.lib;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PaymentMethodsView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "position", "Lkotlin/G0;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class m extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C33021f f214684l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(C33021f c33021f) {
        super(1);
        this.f214684l = c33021f;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        View viewZ;
        Integer num2 = num;
        C33021f c33021f = this.f214684l;
        c33021f.f214673t = num2;
        RecyclerView recyclerView = c33021f.f214667n;
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null && (viewZ = layoutManager.Z(num2.intValue())) != null) {
            recyclerView.C0(c33021f.f214670q.c(layoutManager, viewZ)[0], 0);
            c33021f.f214673t = null;
        }
        return G0.f406611a;
    }
}
