package com.avito.android.vas_performance.ui.items.stickers_count;

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

/* compiled from: StickersCountItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/stickers_count/g;", "Lcom/avito/android/vas_performance/ui/items/stickers_count/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f321762b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f321763c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f321764d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f321765e;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.getRootView().findViewById(R.id.stickers_count_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = constraintLayout.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f321762b = (TextView) viewFindViewById2;
        View viewFindViewById3 = constraintLayout.findViewById(R.id.price);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f321763c = (TextView) viewFindViewById3;
        View viewFindViewById4 = constraintLayout.findViewById(R.id.icon);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f321764d = (SimpleDraweeView) viewFindViewById4;
        View viewFindViewById5 = constraintLayout.findViewById(R.id.lightning_icon);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f321765e = (SimpleDraweeView) viewFindViewById5;
    }

    @Override // com.avito.android.vas_performance.ui.items.stickers_count.f
    public final void L(@l AttributedText attributedText) {
        if (attributedText != null) {
            j.c(this.f321763c, attributedText, null);
        }
    }

    @Override // com.avito.android.vas_performance.ui.items.stickers_count.f
    public final void setTitle(@k String str) {
        this.f321762b.setText(str);
    }

    @Override // com.avito.android.vas_performance.ui.items.stickers_count.f
    public final void x(@k com.avito.android.image_loader.k kVar) {
        ImageRequest.a aVarA = C35949t5.a(this.f321764d);
        aVarA.d(kVar);
        aVarA.c();
    }

    @Override // com.avito.android.vas_performance.ui.items.stickers_count.f
    public final void x1(@l com.avito.android.image_loader.a aVar) {
        SimpleDraweeView simpleDraweeView = this.f321765e;
        if (aVar == null) {
            simpleDraweeView.setVisibility(4);
            return;
        }
        simpleDraweeView.setVisibility(0);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(aVar);
        aVarA.c();
    }
}
