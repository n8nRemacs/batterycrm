package com.avito.android.advert.item.early_access_fakedoor.konveyor;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.B;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EarlyAccessAdvertView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/early_access_fakedoor/konveyor/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/early_access_fakedoor/konveyor/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Banner f75311b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f75312c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f75313d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.a<G0> f75314e;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.banner);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.banner.Banner");
        }
        this.f75311b = (Banner) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75312c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.accept);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById3;
        this.f75313d = button;
        button.setOnClickListener(new B(this, 2));
    }

    @Override // com.avito.android.advert.item.early_access_fakedoor.konveyor.g
    public final void V0(@l String str) {
        com.avito.android.lib.design.button.b.a(this.f75313d, str, false);
    }

    @Override // com.avito.android.advert.item.early_access_fakedoor.konveyor.g
    public final void Y(@l Y41.a<G0> aVar) {
        this.f75314e = aVar;
    }

    @Override // com.avito.android.advert.item.early_access_fakedoor.konveyor.g
    public final void b(@l String str) {
        this.f75311b.setTitle(str);
    }

    @Override // com.avito.android.advert.item.early_access_fakedoor.konveyor.g
    public final void j(@l String str) {
        I5.a(this.f75312c, str, false);
    }
}
