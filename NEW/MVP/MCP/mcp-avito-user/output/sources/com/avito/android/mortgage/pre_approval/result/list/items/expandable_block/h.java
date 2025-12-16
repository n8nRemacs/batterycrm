package com.avito.android.mortgage.pre_approval.result.list.items.expandable_block;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ExpandableBlockView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/list/items/expandable_block/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/pre_approval/result/list/items/expandable_block/g;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f202050e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f202051b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f202052c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f202053d;

    public h(@k View view) {
        super(view);
        this.f202051b = (TextView) view.findViewById(R.id.expandable_title);
        this.f202052c = (TextView) view.findViewById(R.id.expandable_description);
        this.f202053d = (ImageView) view.findViewById(R.id.expandable_arrow);
    }

    @Override // com.avito.android.mortgage.pre_approval.result.list.items.expandable_block.g
    public final void Ae(@k Y41.a<G0> aVar) {
        this.f202051b.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(19, aVar));
        this.f202053d.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(20, aVar));
    }

    @Override // com.avito.android.mortgage.pre_approval.result.list.items.expandable_block.g
    public final void b80(boolean z12) {
        this.f202053d.setRotation(z12 ? -90.0f : 90.0f);
        D6.G(this.f202052c, z12);
    }

    @Override // com.avito.android.mortgage.pre_approval.result.list.items.expandable_block.g
    public final void h(@k String str) {
        this.f202052c.setText(str);
    }

    @Override // com.avito.android.mortgage.pre_approval.result.list.items.expandable_block.g
    public final void setTitle(@k String str) {
        this.f202051b.setText(str);
    }

    @Override // com.avito.android.mortgage.pre_approval.result.list.items.expandable_block.g
    public final void zd(boolean z12) {
        this.f202053d.animate().rotation(z12 ? -90.0f : 90.0f).setDuration(150L).withEndAction(new D.b(11, this, z12)).start();
    }
}
