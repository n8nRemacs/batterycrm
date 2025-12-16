package com.avito.android.publish.slots.auto_group_block.item;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AutoGroupBlockView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/auto_group_block/item/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/auto_group_block/item/i;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f243112f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f243113b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f243114c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f243115d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f243116e;

    public j(@k View view) {
        super(view);
        this.f243113b = (TextView) view.findViewById(R.id.group_auto_title);
        this.f243114c = (TextView) view.findViewById(R.id.group_auto_badge);
        this.f243115d = (TextView) view.findViewById(R.id.group_auto_description);
        this.f243116e = (Button) view.findViewById(R.id.group_auto_button);
    }

    @Override // com.avito.android.publish.slots.auto_group_block.item.i
    public final void F4(@l String str) {
        I5.a(this.f243114c, str, false);
    }

    @Override // com.avito.android.publish.slots.auto_group_block.item.i
    public final void V0(@l String str) {
        com.avito.android.lib.design.button.b.a(this.f243116e, str, false);
    }

    @Override // com.avito.android.publish.slots.auto_group_block.item.i
    public final void a0(@k Y41.a<G0> aVar) {
        this.f243116e.setOnClickListener(new com.avito.android.publish.details.adapter.edit_category.h(27, aVar));
    }

    @Override // com.avito.android.publish.slots.auto_group_block.item.i
    public final void b(@l String str) {
        I5.a(this.f243113b, str, false);
    }

    @Override // com.avito.android.publish.slots.auto_group_block.item.i
    public final void n(@l String str) {
        I5.a(this.f243115d, str, false);
    }
}
