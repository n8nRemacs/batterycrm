package com.avito.android.tariff_lf_constructor.configure.vertical.items.profile_selector;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.component.user_hat.items.C29574b;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ConstructorConfigureVerticalProfileSelectorItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/vertical/items/profile_selector/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_lf_constructor/configure/vertical/items/profile_selector/h;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f300649e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f300650b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f300651c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f300652d;

    public i(@k View view) {
        super(view);
        this.f300650b = view.findViewById(R.id.root_view);
        this.f300651c = (TextView) view.findViewById(R.id.profile_name);
        this.f300652d = (SimpleDraweeView) view.findViewById(R.id.profile_avatar);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.vertical.items.profile_selector.h
    public final void J(@k String str) {
        TextView textView = this.f300651c;
        I5.a(textView, str, false);
        textView.requestLayout();
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.vertical.items.profile_selector.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f300650b.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(25, aVar));
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.vertical.items.profile_selector.h
    public final void h1(@l Image image) {
        if (image != null) {
            C29574b.a(this.f300652d);
            C35949t5.c(this.f300652d, com.avito.android.image_loader.b.b(image), null, null, null, 14);
        }
    }
}
