package com.avito.android.verification.common.list.button_default;

import Y61.k;
import android.view.View;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;

/* compiled from: ButtonDefaultItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/common/list/button_default/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i extends com.avito.konveyor.adapter.b {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f323413c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f323414b;

    public i(@k View view) {
        super(view);
        this.f323414b = (Button) this.itemView;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f323414b.setOnClickListener(null);
    }
}
