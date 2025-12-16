package com.avito.android.profile_settings_extended.adapter.count;

import Rb0.C15027c;
import Rb0.InterfaceC15026b;
import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CountItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/count/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_extended/adapter/count/f;", "LRb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f, InterfaceC15026b {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f229381f = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C15027c f229382b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f229383c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f229384d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f229385e;

    public g(@k View view) {
        super(view);
        this.f229382b = new C15027c(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229383c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229384d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.edit_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f229385e = (Button) viewFindViewById3;
    }

    @Override // com.avito.android.profile_settings_extended.adapter.count.f
    public final void I7(@l String str) {
        this.f229384d.setText(str);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.count.f
    public final void b(@k String str) {
        this.f229383c.setText(str);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.count.f
    public final void ec(@k Y41.a<G0> aVar) {
        this.f229385e.setOnClickListener(new com.avito.android.profile_phones.phones_list.phone_item.g(8, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f229385e.setOnClickListener(null);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.count.f
    public final void le(int i12) {
        this.f229385e.setText(i12);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.count.f
    public final void ob(int i12) {
        this.f229384d.setText(String.valueOf(i12));
    }

    @Override // Rb0.InterfaceC15026b
    public final void xT(boolean z12) {
        this.f229382b.xT(z12);
    }
}
