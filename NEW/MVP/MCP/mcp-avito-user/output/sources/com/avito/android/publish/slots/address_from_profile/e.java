package com.avito.android.publish.slots.address_from_profile;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DeleteAddressDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/address_from_profile/e;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f242833H = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public final TextView f242834E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public final TextView f242835F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public final Button f242836G;

    public e(@Y61.k Context context) {
        super(context, 0, 2, null);
        View viewInflate = View.inflate(context, R.layout.delete_address_dialog_layout, null);
        View viewFindViewById = viewInflate.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f242834E = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f242835F = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.action);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f242836G = (Button) viewFindViewById3;
        setContentView(viewInflate);
    }

    public final void V(@Y61.k AddressParameter.SellerAddresses.DeleteAddressSheet deleteAddressSheet, @Y61.k Y41.a<G0> aVar) {
        TextView textView = this.f242834E;
        if (textView != null) {
            com.avito.android.util.text.j.a(textView, deleteAddressSheet.getTitle(), null);
        }
        Button button = this.f242836G;
        if (button != null) {
            button.setText(deleteAddressSheet.getButtonText());
        }
        if (button != null) {
            button.setOnClickListener(new com.avito.android.profile_settings_extended.adapter.phones.l(8, aVar));
        }
        TextView textView2 = this.f242835F;
        if (textView2 != null) {
            I5.a(textView2, deleteAddressSheet.getDescription(), false);
        }
    }
}
