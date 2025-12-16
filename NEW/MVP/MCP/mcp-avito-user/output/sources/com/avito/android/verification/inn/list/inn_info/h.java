package com.avito.android.verification.inn.list.inn_info;

import L91.q;
import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: InnInfoItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/inn/list/inn_info/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h extends com.avito.konveyor.adapter.b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f324028e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f324029b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f324030c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f324031d;

    public h(@k View view) {
        super(view);
        this.f324029b = (TextView) view.findViewById(R.id.verification_item_inn_info_title);
        this.f324030c = (TextView) view.findViewById(R.id.verification_item_inn_info_content);
        this.f324031d = (ImageView) view.findViewById(R.id.verification_item_inn_info_icon);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f324031d.setOnClickListener(new q(13));
    }
}
