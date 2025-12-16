package com.avito.android.serp.adapter.title;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GroupTitleItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/title/i;", "Lcom/avito/android/serp/adapter/title/h;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f272449b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ImageView f272450c;

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f272449b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.stub_image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f272450c = (ImageView) viewFindViewById2;
    }

    @Override // com.avito.android.serp.adapter.title.h
    public final void WK(boolean z12) {
        D6.G(this.f272450c, z12);
    }

    @Override // com.avito.android.serp.adapter.title.h
    public final void setTitle(@k String str) {
        this.f272449b.setText(str);
    }
}
