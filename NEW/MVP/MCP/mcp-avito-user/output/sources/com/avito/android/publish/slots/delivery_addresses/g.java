package com.avito.android.publish.slots.delivery_addresses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.lib.design.radio.RadioGroup;
import com.avito.android.remote.model.category_parameters.slot.delivery_addresses.AddressInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DeliveryAddressesListDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/delivery_addresses/g;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.delivery_addresses.item.c f243433E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final View f243434F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final RadioGroup f243435G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final Button f243436H;

    public g(@Y61.k Context context, @Y61.k com.avito.android.publish.slots.delivery_addresses.item.c cVar) {
        super(context, 0, 2, null);
        this.f243433E = cVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.delivery_addresses_list_dialog, (ViewGroup) null);
        this.f243434F = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.addresses_list);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.radio.RadioGroup");
        }
        RadioGroup radioGroup = (RadioGroup) viewFindViewById;
        this.f243435G = radioGroup;
        View viewFindViewById2 = viewInflate.findViewById(R.id.save_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f243436H = (Button) viewFindViewById2;
        setContentView(viewInflate);
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        com.avito.android.lib.design.bottom_sheet.d.M(this, cVar.f243444f, true, true, 2);
        List<AddressInfo> list = cVar.f243442d;
        if (list == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        radioGroup.b();
        radioGroup.a(-1);
        for (AddressInfo addressInfo : list) {
            ListItemRadio listItemRadio = new ListItemRadio(radioGroup.getContext(), null);
            listItemRadio.setTag(Long.valueOf(addressInfo.getF80718e()));
            listItemRadio.setId(addressInfo.getAddressId());
            listItemRadio.setTitle(addressInfo.getAddress());
            listItemRadio.setClickable(true);
            listItemRadio.setFocusable(true);
            listItemRadio.setEnabled(true);
            radioGroup.addView(listItemRadio);
        }
        this.f243435G.getF180133e();
        Integer num = this.f243433E.f243441c;
        if (num != null) {
            this.f243435G.a(num.intValue());
        }
    }
}
