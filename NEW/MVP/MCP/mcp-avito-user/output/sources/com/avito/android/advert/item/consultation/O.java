package com.avito.android.advert.item.consultation;

import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ConsultationButtonView.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/consultation/O;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/consultation/N;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class O extends com.avito.konveyor.adapter.b implements N {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f74685c = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Button f74686b;

    public O(@Y61.k View view) {
        super(view);
        this.f74686b = (Button) view.findViewById(R.id.contact_block_button);
    }

    @Override // com.avito.android.advert.item.consultation.N
    public final void aT(@Y61.l String str, @Y61.l Y41.l<? super View, G0> lVar) {
        Button button = this.f74686b;
        com.avito.android.lib.design.button.b.a(button, str, false);
        button.setOnClickListener(new com.avito.android.advert.closed.b(16, lVar, this));
    }
}
