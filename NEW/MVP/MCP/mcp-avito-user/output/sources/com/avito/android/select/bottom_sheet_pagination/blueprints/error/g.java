package com.avito.android.select.bottom_sheet_pagination.blueprints.error;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PaginationErrorItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/bottom_sheet_pagination/blueprints/error/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/select/bottom_sheet_pagination/blueprints/error/f;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f265341b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.a<G0> f265342c;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.action_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById;
        this.f265341b = button;
        button.setOnClickListener(new com.avito.android.review_gallery.g(this, 15));
    }

    @Override // com.avito.android.select.bottom_sheet_pagination.blueprints.error.f
    public final void lM(@k String str) {
        this.f265341b.setText(str);
    }

    @Override // com.avito.android.select.bottom_sheet_pagination.blueprints.error.f
    public final void u1(@l Y41.a<G0> aVar) {
        this.f265342c = aVar;
    }
}
