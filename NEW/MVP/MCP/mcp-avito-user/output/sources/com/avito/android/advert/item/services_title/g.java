package com.avito.android.advert.item.services_title;

import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ServicesTitleItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/services_title/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/services_title/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f80023b;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.wrap_width_text_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f80023b = textView;
    }

    @Override // com.avito.android.advert.item.services_title.f
    public final void e(@l AttributedText attributedText) {
        j.a(this.f80023b, attributedText, null);
    }
}
