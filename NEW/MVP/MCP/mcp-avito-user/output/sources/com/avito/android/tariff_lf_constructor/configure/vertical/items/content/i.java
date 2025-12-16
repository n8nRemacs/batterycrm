package com.avito.android.tariff_lf_constructor.configure.vertical.items.content;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ConstructorConfigureVerticalContentItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/vertical/items/content/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_lf_constructor/configure/vertical/items/content/h;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f300621h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f300622b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f300623c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f300624d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f300625e;

    /* renamed from: f, reason: collision with root package name */
    public final int f300626f;

    /* renamed from: g, reason: collision with root package name */
    public final int f300627g;

    public i(@k View view) {
        super(view);
        this.f300622b = view;
        this.f300623c = (TextView) view.findViewById(R.id.title);
        this.f300624d = (TextView) view.findViewById(R.id.description);
        this.f300625e = (SimpleDraweeView) view.findViewById(R.id.image);
        this.f300626f = C35835l0.d(R.attr.black, view.getContext());
        this.f300627g = C35835l0.d(R.attr.gray54, view.getContext());
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.vertical.items.content.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f300622b.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(24, aVar));
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.vertical.items.content.h
    public final void c60(boolean z12) {
        TextView textView = this.f300624d;
        TextView textView2 = this.f300623c;
        if (z12) {
            int i12 = this.f300626f;
            textView2.setTextColor(i12);
            textView.setTextColor(i12);
        } else {
            int i13 = this.f300627g;
            textView2.setTextColor(i13);
            textView.setTextColor(i13);
        }
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.vertical.items.content.h
    public final void h(@k String str) {
        this.f300624d.setText(str);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.vertical.items.content.h
    public final void l(@k Image image) {
        ImageRequest.a aVarA = C35949t5.a(this.f300625e);
        aVarA.d(com.avito.android.image_loader.b.b(image));
        aVarA.f169500r = false;
        aVarA.c();
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.vertical.items.content.h
    public final void setTitle(@k String str) {
        this.f300623c.setText(str);
    }
}
