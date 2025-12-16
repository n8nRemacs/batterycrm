package com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.dialog_items.bed_type;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BedTypeItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/dialog_items/bed_type/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/dialog_items/bed_type/g;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f245006b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f245007c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f245008d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f245009e;

    public h(@k View view) {
        super(view);
        this.f245006b = view;
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f245007c = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f245008d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f245009e = (TextView) viewFindViewById3;
    }

    @Override // com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.dialog_items.bed_type.g
    public final void A50(@l String str) {
        I5.a(this.f245008d, str, false);
    }

    @Override // com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.dialog_items.bed_type.g
    public final void JU(@l com.avito.android.image_loader.a aVar) {
        C35949t5.c(this.f245007c, aVar, null, null, null, 14);
    }

    @Override // com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.dialog_items.bed_type.g
    public final void O3(@l String str) {
        I5.a(this.f245009e, str, false);
    }

    @Override // com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.dialog_items.bed_type.g
    public final void X(@l Y41.a<G0> aVar) {
        D6.a(aVar, this.f245006b);
    }

    @Override // com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.dialog_items.bed_type.g
    public final void setSelected(boolean z12) {
        this.f245006b.setSelected(z12);
    }
}
