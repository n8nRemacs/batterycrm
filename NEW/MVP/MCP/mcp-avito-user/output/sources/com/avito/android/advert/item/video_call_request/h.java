package com.avito.android.advert.item.video_call_request;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: AdvertVideoCallRequestItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/video_call_request/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/video_call_request/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f80697d = 0;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Badge f80698b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Button f80699c;

    public h(@k View view) {
        super(view);
        this.f80698b = (Badge) view.findViewById(R.id.advert_video_call_request_badge);
        this.f80699c = (Button) view.findViewById(R.id.advert_video_call_request_btn);
    }

    @Override // com.avito.android.advert.item.video_call_request.g
    public final void UQ() {
        D6.H(this.f80698b);
    }

    @Override // com.avito.android.advert.item.video_call_request.g
    public final void XU(int i12, @k Y41.a aVar, boolean z12, boolean z13) throws Resources.NotFoundException {
        Button button = this.f80699c;
        if (button != null) {
            if (z13) {
                if (z12) {
                    button.setAppearance(R.style.ButtonAdvertActionGray);
                } else {
                    button.setAppearanceFromAttr(R.attr.buttonAccentSecondaryLarge);
                }
            }
            button.setText(i12);
            button.setOnClickListener(new com.avito.android.advert.item.parking.h(26, aVar));
        }
    }
}
