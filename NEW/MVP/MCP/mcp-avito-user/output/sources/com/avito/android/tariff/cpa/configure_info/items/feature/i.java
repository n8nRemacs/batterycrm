package com.avito.android.tariff.cpa.configure_info.items.feature;

import Y61.k;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.text.j;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: ConfigureFeatureItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/configure_info/items/feature/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpa/configure_info/items/feature/h;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f294509b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f294510c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f294511d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f294512e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f294513f;

    public i(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f294509b = view;
        this.f294510c = aVar;
        this.f294511d = (SimpleDraweeView) view.findViewById(R.id.image);
        this.f294512e = (TextView) view.findViewById(R.id.title);
        this.f294513f = (TextView) view.findViewById(R.id.description);
    }

    @Override // com.avito.android.tariff.cpa.configure_info.items.feature.h
    public final void g(@k AttributedText attributedText) {
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f294513f;
        textView.setMovementMethod(linkMovementMethod);
        j.a(textView, attributedText, this.f294510c);
    }

    @Override // com.avito.android.tariff.cpa.configure_info.items.feature.h
    public final void i(@k UniversalImage universalImage) {
        C35949t5.c(this.f294511d, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f294509b.getContext()))), null, null, null, 14);
    }

    @Override // com.avito.android.tariff.cpa.configure_info.items.feature.h
    public final void setTitle(@k String str) {
        this.f294512e.setText(str);
    }
}
