package com.avito.android.advertising.ui.buzzoola;

import android.view.View;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: CommercialVideoViewHolderImpl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class q<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f88702b;

    public q(m mVar) {
        this.f88702b = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        Q q12 = (Q) obj;
        float fFloatValue = ((Number) q12.f406619b).floatValue();
        long jLongValue = ((Number) q12.f406620c).longValue();
        m mVar = this.f88702b;
        mVar.f88614p.setProgress(fFloatValue);
        if (mVar.B80()) {
            View view = mVar.f88617s;
            if (view != null) {
                D6.G(view, false);
            }
            D6.G(mVar.f88615q, false);
        }
        com.avito.android.advertising.adapter.items.buzzoola.video.m mVar2 = mVar.f88620v;
        if (mVar2 != null) {
            mVar2.b(jLongValue, fFloatValue);
        }
    }
}
