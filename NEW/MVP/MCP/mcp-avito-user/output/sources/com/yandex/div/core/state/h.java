package com.yandex.div.core.state;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.L;
import com.yandex.div.core.view2.C38029k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DivStateTransition.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class h extends N implements Y41.l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f367664l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f367665m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, boolean z12) {
        super(1);
        this.f367664l = iVar;
        this.f367665m = z12;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        View view2 = view;
        boolean z12 = view2 instanceof RecyclerView;
        i iVar = this.f367664l;
        if (z12) {
            iVar.f54672i = L.r(view2, iVar.f54672i);
        } else if (this.f367665m && (view2 instanceof C38029k)) {
            iVar.q(view2);
        }
        return G0.f406611a;
    }
}
