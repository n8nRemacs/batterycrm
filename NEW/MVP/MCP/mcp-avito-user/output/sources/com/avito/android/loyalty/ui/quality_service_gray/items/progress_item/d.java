package com.avito.android.loyalty.ui.quality_service_gray.items.progress_item;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.loyalty.ui.items.quality_progress.QualityProgress;
import com.avito.android.loyalty.ui.quality_service_gray.items.progress_item.f;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ProgressItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service_gray/items/progress_item/d;", "LTV0/d;", "Lcom/avito/android/loyalty/ui/quality_service_gray/items/progress_item/f;", "Lcom/avito/android/loyalty/ui/quality_service_gray/items/progress_item/a;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements TV0.d<f, a> {
    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        a aVar2 = (a) aVar;
        I5.a(fVar.f184105c, aVar2.f184094c, false);
        j.a(fVar.f184106d, aVar2.f184095d, null);
        int i13 = aVar2.f184097f;
        QualityProgress qualityProgress = fVar.f184107e;
        qualityProgress.setProgress(i13);
        qualityProgress.setBadSectionSize(aVar2.f184096e);
        int i14 = f.a.f184108a[aVar2.f184098g.ordinal()];
        Context context = fVar.f184104b;
        if (i14 == 1) {
            qualityProgress.setGoodSectionStart(-4594594);
            qualityProgress.setGoodSectionEnd(C35835l0.d(R.attr.green600, context));
            qualityProgress.setBadSectionColor(C35835l0.d(R.attr.gray16, context));
            qualityProgress.setScaleBadColor(C35835l0.d(R.attr.gray54, context));
            return;
        }
        qualityProgress.setBadSectionColor(C35835l0.d(R.attr.red600, context));
        qualityProgress.setGoodSectionStart(C35835l0.d(R.attr.gray16, context));
        qualityProgress.setGoodSectionEnd(C35835l0.d(R.attr.gray16, context));
        qualityProgress.setScaleGoodColor(C35835l0.d(R.attr.gray54, context));
    }
}
