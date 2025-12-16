package com.avito.android.vas_performance.ui.items.stickers_changes;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.text.j;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StickersChangesItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/stickers_changes/g;", "Lcom/avito/android/vas_performance/ui/items/stickers_changes/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f321750b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f321751c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f321752d;

    public g(@k View view) {
        super(view);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.getRootView().findViewById(R.id.stickers_changes_container);
        this.f321750b = (TextView) constraintLayout.findViewById(R.id.title);
        this.f321751c = (TextView) constraintLayout.findViewById(R.id.changes);
        this.f321752d = (SimpleDraweeView) constraintLayout.findViewById(R.id.icon);
    }

    @Override // com.avito.android.vas_performance.ui.items.stickers_changes.f
    public final void C10(@l AttributedText attributedText) {
        if (attributedText != null) {
            j.c(this.f321751c, attributedText, null);
        }
    }

    @Override // com.avito.android.vas_performance.ui.items.stickers_changes.f
    public final void setTitle(@k String str) {
        this.f321750b.setText(str);
    }

    @Override // com.avito.android.vas_performance.ui.items.stickers_changes.f
    public final void x(@k com.avito.android.image_loader.k kVar) {
        ImageRequest.a aVarA = C35949t5.a(this.f321752d);
        aVarA.d(kVar);
        aVarA.c();
    }
}
