package com.avito.android.services_transportation_widget.cargo_capacity_sheet;

import Y41.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: ServiceTransportationCardSelectSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class h extends H implements l<View, G0> {
    @Override // Y41.l
    public final G0 invoke(View view) {
        j jVar = (j) this.receiver;
        int i12 = j.f280488J;
        jVar.getClass();
        Button button = (Button) view.findViewById(R.id.selectButton);
        jVar.f280492H = button;
        if (button != null) {
            com.avito.android.lib.design.button.b.a(button, jVar.f280489E, false);
        }
        Button button2 = jVar.f280492H;
        if (button2 != null) {
            button2.setOnClickListener(new com.avito.android.review_gallery.g(jVar, 29));
        }
        return G0.f406611a;
    }
}
