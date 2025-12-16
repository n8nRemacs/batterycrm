package com.avito.android.publish.slots.contact_method.info_item;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ContactMethodInfoBlockItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/contact_method/info_item/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/contact_method/info_item/g;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f243282c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f243283b;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.contact_method_info_btn);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f243283b = (Button) viewFindViewById;
    }

    @Override // com.avito.android.publish.slots.contact_method.info_item.g
    public final void g60(@k Y41.a<G0> aVar) {
        this.f243283b.setOnClickListener(new com.avito.android.publish.details.adapter.edit_category.h(29, aVar));
    }
}
