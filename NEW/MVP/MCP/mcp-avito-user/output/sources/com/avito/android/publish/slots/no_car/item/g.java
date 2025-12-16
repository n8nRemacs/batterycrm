package com.avito.android.publish.slots.no_car.item;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: NoCarSlotView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/no_car/item/g;", "Lcom/avito/android/publish/slots/no_car/item/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f244662c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f244663b;

    public g(@k View view) {
        super(view);
        this.f244663b = (TextView) view.findViewById(R.id.text_view);
    }

    @Override // com.avito.android.publish.slots.no_car.item.f
    public final void c(@k Y41.a<G0> aVar) {
        this.itemView.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(6, aVar));
    }

    @Override // com.avito.android.publish.slots.no_car.item.f
    public final void setText(@k String str) {
        this.f244663b.setText(str);
    }
}
