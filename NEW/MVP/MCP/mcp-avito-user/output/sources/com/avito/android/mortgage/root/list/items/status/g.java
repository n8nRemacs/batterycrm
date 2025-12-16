package com.avito.android.mortgage.root.list.items.status;

import Y61.k;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35829k2;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import kotlin.Metadata;

/* compiled from: StatusView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/status/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/root/list/items/status/f;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImageView f202838b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f202839c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f202840d;

    public g(@k View view) {
        super(view);
        this.f202838b = (ImageView) view.findViewById(R.id.image);
        this.f202839c = (TextView) view.findViewById(R.id.title);
        this.f202840d = (TextView) view.findViewById(R.id.subtitle);
    }

    @Override // com.avito.android.mortgage.root.list.items.status.f
    public final void e(@k AttributedText attributedText) {
        j.c(this.f202839c, attributedText, null);
    }

    @Override // com.avito.android.mortgage.root.list.items.status.f
    public final void k(@k AttributedText attributedText) {
        j.c(this.f202840d, attributedText, null);
    }

    @Override // com.avito.android.mortgage.root.list.items.status.f
    public final void l(@k Image image) {
        ImageView imageView = this.f202838b;
        Uri uriD = C35829k2.c(image, imageView, 0, 30).d();
        if (uriD == null) {
            D6.w(imageView);
        } else {
            D6.G(imageView, true);
            com.avito.android.image_loader.glide.utils.b.c(imageView, uriD);
        }
    }
}
