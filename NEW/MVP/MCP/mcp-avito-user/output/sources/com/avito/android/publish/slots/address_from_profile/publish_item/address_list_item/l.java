package com.avito.android.publish.slots.address_from_profile.publish_item.address_list_item;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.toggle.RadioButton;
import com.avito.android.lib.design.toggle.Toggle;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectAddressItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/address_from_profile/publish_item/address_list_item/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/address_from_profile/publish_item/address_list_item/j;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f242873f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f242874b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f242875c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f242876d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RadioButton f242877e;

    public l(@Y61.k View view) {
        super(view);
        this.f242874b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f242875c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.text_location);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f242876d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.radio_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.RadioButton");
        }
        this.f242877e = (RadioButton) viewFindViewById3;
    }

    @Override // com.avito.android.publish.slots.address_from_profile.publish_item.address_list_item.j
    public final void Hh(@Y61.k com.avito.android.publish.slots.address_from_profile.publish_item.k kVar, @Y61.k Y41.a<G0> aVar) {
        int[] iArr;
        I5.a(this.f242875c, kVar.f242925e, false);
        com.avito.android.publish.details.adapter.edit_category.h hVar = new com.avito.android.publish.details.adapter.edit_category.h(25, aVar);
        View view = this.f242874b;
        view.setOnClickListener(hVar);
        String str = kVar.f242923c;
        if (str != null) {
            String string = view.getContext().getString(R.string.select_address_location, str);
            String strS = AK.c.s(new StringBuilder(), kVar.f242924d, string);
            TextView textView = this.f242876d;
            I5.a(textView, strS, false);
            D6.C(new k(textView, string), textView);
        }
        boolean z12 = kVar.f242928h;
        RadioButton radioButton = this.f242877e;
        radioButton.setChecked(z12);
        if (kVar.f242927g) {
            Toggle.f181152k.getClass();
            iArr = Toggle.f181154m;
        } else {
            Toggle.f181152k.getClass();
            iArr = Toggle.f181153l;
        }
        radioButton.setState(iArr);
    }
}
