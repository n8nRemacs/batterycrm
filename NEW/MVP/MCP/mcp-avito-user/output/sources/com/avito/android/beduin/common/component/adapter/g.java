package com.avito.android.beduin.common.component.adapter;

import Y61.k;
import com.avito.android.beduin.common.component.adapter.a;
import kotlin.Metadata;

/* compiled from: BeduinSliderAdapter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/adapter/g;", "Lcom/avito/android/beduin/common/component/adapter/a;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class g extends a {

    /* renamed from: k, reason: collision with root package name */
    public int f100618k = -1;

    @Override // com.avito.android.beduin.common.component.adapter.a, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: r */
    public final void onBindViewHolder(@k a.C3019a c3019a, int i12) {
        c3019a.itemView.getLayoutParams().width = this.f100618k;
        super.onBindViewHolder(c3019a, i12);
    }

    @Override // com.avito.android.beduin.common.component.adapter.a
    public final int t() {
        return -1;
    }

    @Override // com.avito.android.beduin.common.component.adapter.a
    /* renamed from: u, reason: from getter */
    public final int getF100618k() {
        return this.f100618k;
    }
}
