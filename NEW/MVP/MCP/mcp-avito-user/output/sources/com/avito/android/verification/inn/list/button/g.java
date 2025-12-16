package com.avito.android.verification.inn.list.button;

import Y61.k;
import android.content.Context;
import android.view.View;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;

/* compiled from: ButtonItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/inn/list/button/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f323930d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f323931b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f323932c;

    public g(@k View view) {
        super(view);
        View view2 = this.itemView;
        this.f323931b = (Button) view2;
        this.f323932c = view2.getContext();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f323931b.setOnClickListener(null);
    }
}
