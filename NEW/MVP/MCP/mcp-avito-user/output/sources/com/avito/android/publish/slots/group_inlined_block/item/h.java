package com.avito.android.publish.slots.group_inlined_block.item;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: GroupInlinedBlockItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/group_inlined_block/item/h;", "Lcom/avito/android/publish/slots/group_inlined_block/item/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f244036b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f244037c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RecyclerView f244038d;

    public h(@k View view) {
        super(view);
        this.f244036b = (TextView) view.findViewById(R.id.title);
        this.f244037c = (TextView) view.findViewById(R.id.group_auto_badge);
        this.f244038d = (RecyclerView) view.findViewById(R.id.params_recycler);
    }

    @Override // com.avito.android.publish.slots.group_inlined_block.item.g
    public final void I1(@l String str) {
        I5.a(this.f244037c, str, false);
    }

    @Override // com.avito.android.publish.slots.group_inlined_block.item.g
    public final void setAdapter(@k RecyclerView.Adapter<?> adapter) {
        this.f244038d.setAdapter(adapter);
    }

    @Override // com.avito.android.publish.slots.group_inlined_block.item.g
    public final void setTitle(@l String str) {
        I5.a(this.f244036b, str, false);
    }
}
