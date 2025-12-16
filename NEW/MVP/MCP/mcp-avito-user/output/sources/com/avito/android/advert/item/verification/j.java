package com.avito.android.advert.item.verification;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;

/* compiled from: VerificationBottomSheetView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/verification/j;", "Lcom/avito/android/advert/item/verification/i;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ImageView f80672a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f80673b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f80674c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f80675d;

    public j(@k View view) {
        this.f80672a = (ImageView) view.findViewById(R.id.image);
        this.f80673b = (TextView) view.findViewById(R.id.title);
        this.f80674c = (TextView) view.findViewById(R.id.description);
        this.f80675d = (Button) view.findViewById(R.id.button);
    }
}
