package com.avito.android.sx_address.selectaddresslist.view.recycler;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.toggle.RadioButton;
import com.avito.android.lib.design.toggle.Toggle;
import com.avito.android.sx_address.selectaddresslist.domain.AddressListViewItem;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AddressItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/selectaddresslist/view/recycler/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/sx_address/selectaddresslist/view/recycler/g;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f294208f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f294209b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f294210c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f294211d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final RadioButton f294212e;

    public i(@k View view) {
        super(view);
        this.f294209b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f294210c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.text_location);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f294211d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.radio_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.RadioButton");
        }
        this.f294212e = (RadioButton) viewFindViewById3;
    }

    @Override // com.avito.android.sx_address.selectaddresslist.view.recycler.g
    public final void zR(@k AddressListViewItem addressListViewItem, @k Y41.a<G0> aVar) {
        I5.a(this.f294210c, addressListViewItem.f294067e, false);
        this.f294209b.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(3, aVar));
        String str = addressListViewItem.f294065c;
        if (str != null) {
            String strConcat = ", ".concat(str);
            String strS = AK.c.s(new StringBuilder(), addressListViewItem.f294066d, strConcat);
            TextView textView = this.f294211d;
            I5.a(textView, strS, false);
            D6.C(new h(textView, strConcat), textView);
        }
        boolean z12 = addressListViewItem.f294069g;
        RadioButton radioButton = this.f294212e;
        radioButton.setChecked(z12);
        if (addressListViewItem.f294071i) {
            Toggle.f181152k.getClass();
            radioButton.setState(Toggle.f181154m);
        } else {
            Toggle.f181152k.getClass();
            radioButton.setState(Toggle.f181153l);
        }
    }
}
