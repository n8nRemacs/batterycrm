package com.avito.android.location_list;

import com.avito.android.R;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Location;
import com.avito.android.util.D6;
import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LocationListPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/Location;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class Z extends kotlin.jvm.internal.N implements Y41.l<P2<? super Location>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a0 f181899l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(a0 a0Var) {
        super(1);
        this.f181899l = a0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(P2<? super Location> p22) {
        P2<? super Location> p23 = p22;
        a0 a0Var = this.f181899l;
        a0Var.getClass();
        if (p23 instanceof P2.b) {
            a0Var.f181911k = (Location) ((P2.b) p23).f318720a;
            a0Var.s();
        } else if (p23 instanceof P2.c) {
            k0 k0Var = a0Var.f181920t;
            if (k0Var != null) {
                k0Var.f182061h.k(null);
                D6.w(k0Var.f182055b.findViewById(R.id.content));
            }
        } else if (p23 instanceof P2.a) {
            if (((P2.a) p23).f318719a instanceof ApiError.NetworkIOError) {
                k0 k0Var2 = a0Var.f181920t;
                if (k0Var2 != null) {
                    k0Var2.f182061h.a("");
                    D6.w(k0Var2.f182055b.findViewById(R.id.content));
                }
            } else {
                k0 k0Var3 = a0Var.f181920t;
                if (k0Var3 != null) {
                    k0Var3.f182061h.j();
                }
            }
        }
        return G0.f406611a;
    }
}
