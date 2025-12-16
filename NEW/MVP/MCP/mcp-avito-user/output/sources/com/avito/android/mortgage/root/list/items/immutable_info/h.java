package com.avito.android.mortgage.root.list.items.immutable_info;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ImmutableInfoView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/immutable_info/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/root/list/items/immutable_info/g;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f202632b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f202633c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f202634d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.a<G0> f202635e;

    public h(@k View view) {
        super(view);
        this.f202632b = (TextView) view.findViewById(R.id.title);
        this.f202633c = (TextView) view.findViewById(R.id.content);
        Button button = (Button) view.findViewById(R.id.action);
        this.f202634d = button;
        button.setOnClickListener(new ViewOnClickListenerC31873b(this, 21));
    }

    @Override // com.avito.android.mortgage.root.list.items.immutable_info.g
    public final void QL(@k String str) {
        this.f202634d.setText(str);
    }

    @Override // com.avito.android.mortgage.root.list.items.immutable_info.g
    public final void XY(@k AttributedText attributedText) {
        j.c(this.f202633c, attributedText, null);
    }

    @Override // com.avito.android.mortgage.root.list.items.immutable_info.g
    public final void setEnabled(boolean z12) {
        this.f202634d.setEnabled(z12);
    }

    @Override // com.avito.android.mortgage.root.list.items.immutable_info.g
    public final void setTitle(@k String str) {
        this.f202632b.setText(str);
    }

    @Override // com.avito.android.mortgage.root.list.items.immutable_info.g
    public final void u1(@k Y41.a<G0> aVar) {
        this.f202635e = aVar;
    }
}
