package com.avito.android.beduin.common.component.adapter;

import Y61.k;
import androidx.recyclerview.widget.C23413d;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import rV.InterfaceC47599c;

/* compiled from: BeduinSliderInfiniteAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/adapter/h;", "Lcom/avito/android/beduin/common/component/adapter/g;", "LrV/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class h extends g implements InterfaceC47599c {

    /* renamed from: l, reason: collision with root package name */
    public boolean f100619l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final i<AbstractC40112a<BeduinModel, InterfaceC40116e>> f100620m;

    public h(int i12) {
        super(0);
        this.f100618k = -1;
        this.f100619l = true;
        this.f100620m = new i<>(C42784z0.f406748b);
    }

    @Override // rV.InterfaceC47599c
    public final int f() {
        return super.getItemCount();
    }

    @Override // androidx.recyclerview.widget.B
    public final AbstractC40112a<BeduinModel, InterfaceC40116e> getItem(int i12) {
        throw null;
    }

    @Override // androidx.recyclerview.widget.B, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        int itemCount = super.getItemCount();
        if (itemCount == 0 || !this.f100619l) {
            return itemCount;
        }
        return Integer.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.B
    @k
    public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> j() {
        boolean z12 = this.f100619l;
        C23413d<T> c23413d = this.f53650c;
        if (!z12) {
            return c23413d.f53994f;
        }
        List list = c23413d.f53994f;
        i<AbstractC40112a<BeduinModel, InterfaceC40116e>> iVar = this.f100620m;
        iVar.f100621b = list;
        return iVar;
    }

    public h() {
        this.f100619l = true;
        this.f100620m = new i<>(C42784z0.f406748b);
    }
}
