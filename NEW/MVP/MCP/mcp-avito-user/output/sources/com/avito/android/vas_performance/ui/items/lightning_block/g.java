package com.avito.android.vas_performance.ui.items.lightning_block;

import Y61.k;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.text.j;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: LightningBlockItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/lightning_block/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/vas_performance/ui/items/lightning_block/f;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f321720b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f321721c;

    public g(@k View view) {
        super(view);
        this.f321720b = (TextView) view.findViewById(R.id.lightning_block_description);
        this.f321721c = (SimpleDraweeView) view.findViewById(R.id.lightning_block_image);
    }

    @Override // com.avito.android.vas_performance.ui.items.lightning_block.f
    public final void Nd(@k AttributedText attributedText, @k com.avito.android.image_loader.a aVar) {
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f321720b;
        textView.setMovementMethod(linkMovementMethod);
        j.c(textView, attributedText, null);
        ImageRequest.a aVarA = C35949t5.a(this.f321721c);
        aVarA.d(aVar);
        aVarA.c();
    }
}
