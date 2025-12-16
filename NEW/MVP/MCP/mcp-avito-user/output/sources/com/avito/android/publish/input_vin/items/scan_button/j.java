package com.avito.android.publish.input_vin.items.scan_button;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ScanVinButtonItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/input_vin/items/scan_button/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/input_vin/items/scan_button/i;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f236595d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f236596b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final TextView f236597c;

    public j(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.sts_scan_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f236596b = (Button) viewFindViewById;
        this.f236597c = (TextView) view.findViewById(R.id.manual_link);
    }

    @Override // com.avito.android.publish.input_vin.items.scan_button.i
    public final void Ib(@k Y41.a<G0> aVar) {
        this.f236596b.setOnClickListener(new com.avito.android.publish.details.adapter.edit_category.h(11, aVar));
    }

    @Override // com.avito.android.publish.input_vin.items.scan_button.i
    public final void YJ(@k Y41.a<G0> aVar) {
        TextView textView = this.f236597c;
        if (textView != null) {
            textView.setOnClickListener(new com.avito.android.publish.details.adapter.edit_category.h(10, aVar));
        }
    }
}
