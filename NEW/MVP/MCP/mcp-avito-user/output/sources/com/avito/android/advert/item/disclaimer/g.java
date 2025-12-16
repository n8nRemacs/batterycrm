package com.avito.android.advert.item.disclaimer;

import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: AdvertDetailsDisclaimerView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/disclaimer/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/disclaimer/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final View f75216b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final TextView f75217c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final TextView f75218d;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.advert_disclaimer_container);
        this.f75216b = viewFindViewById;
        this.f75217c = viewFindViewById != null ? (TextView) viewFindViewById.findViewById(R.id.disclaimer_header) : null;
        this.f75218d = viewFindViewById != null ? (TextView) viewFindViewById.findViewById(R.id.disclaimer_body) : null;
    }

    @Override // com.avito.android.advert.item.disclaimer.f
    public final void nn(@k DisclaimerData disclaimerData) {
        TextView textView = this.f75217c;
        if (textView != null) {
            I5.a(textView, disclaimerData.f75209b, false);
        }
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        TextView textView2 = this.f75218d;
        if (textView2 != null) {
            I5.a(textView2, disclaimerData.f75210c, false);
        }
        if (textView2 == null) {
            return;
        }
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
