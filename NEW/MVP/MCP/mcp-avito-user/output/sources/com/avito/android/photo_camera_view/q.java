package com.avito.android.photo_camera_view;

import com.avito.android.util.rx3.C35896f0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: CameraItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "", "it", "Lkotlin/G0;", "invoke", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class q extends N implements Y41.l<Q<? extends Boolean, ? extends Boolean>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C33174e f216417l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(C33174e c33174e) {
        super(1);
        this.f216417l = c33174e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(Q<? extends Boolean, ? extends Boolean> q12) {
        x xVar;
        x xVar2;
        Q<? extends Boolean, ? extends Boolean> q13 = q12;
        boolean zBooleanValue = ((Boolean) q13.f406619b).booleanValue();
        boolean zBooleanValue2 = ((Boolean) q13.f406620c).booleanValue();
        boolean z12 = zBooleanValue2 || zBooleanValue;
        C33174e c33174e = this.f216417l;
        if (zBooleanValue2) {
            C35896f0.g(c33174e.f216392u, new k(c33174e));
            x xVar3 = c33174e.f216384m;
            if (xVar3 != null) {
                xVar3.z50();
            }
        } else {
            x xVar4 = c33174e.f216384m;
            if (xVar4 != null) {
                xVar4.yN();
            }
        }
        if (!zBooleanValue && (xVar2 = c33174e.f216384m) != null) {
            xVar2.tL();
        }
        if ((!c33174e.f216380i || !z12) && (xVar = c33174e.f216384m) != null) {
            xVar.uj();
        }
        x xVar5 = c33174e.f216384m;
        if (xVar5 != null) {
            xVar5.PY(z12);
        }
        x xVar6 = c33174e.f216384m;
        if (xVar6 != null) {
            xVar6.Wk(z12);
        }
        return G0.f406611a;
    }
}
