package com.avito.android.publish.slots.cv_upload.item.cv_upload_banner;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CvUploadBannerPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/slots/cv_upload/item/cv_upload_banner/f;", "LTV0/d;", "Lcom/avito/android/publish/slots/cv_upload/item/cv_upload_banner/e;", "Lcom/avito/android/publish/slots/cv_upload/item/cv_upload_banner/d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements TV0.d<e, d> {
    @Inject
    public f() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        d dVar = (d) aVar;
        I5.a(eVar2.f243419c, dVar.f243416c, false);
        LinearLayout linearLayout = eVar2.f243420d;
        linearLayout.removeAllViews();
        for (a aVar2 : dVar.f243417d) {
            View viewInflate = eVar2.f243421e.inflate(R.layout.job_cv_uploaded_banner_action_view, (ViewGroup) linearLayout, false);
            View viewFindViewById = viewInflate.findViewById(R.id.action_text);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            I5.a((TextView) viewFindViewById, aVar2.f243411a, false);
            linearLayout.addView(viewInflate);
        }
    }
}
