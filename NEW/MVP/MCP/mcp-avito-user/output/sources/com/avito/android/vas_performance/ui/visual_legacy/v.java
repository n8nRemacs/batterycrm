package com.avito.android.vas_performance.ui.visual_legacy;

import androidx.view.C23038g0;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: VisualVasViewModelImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/DeepLinkResponse;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class v<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f322172b;

    public v(p pVar) {
        this.f322172b = pVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2<?> p22 = (P2) obj;
        int i12 = p.f322128w0;
        p pVar = this.f322172b;
        pVar.getClass();
        boolean z12 = p22 instanceof P2.b;
        C23038g0<P2<?>> c23038g0 = pVar.f322140T;
        if (z12) {
            pVar.f322143W.postValue(((DeepLinkResponse) ((P2.b) p22).f318720a).getDeepLink());
            c23038g0.postValue(p22);
        } else {
            if (!(p22 instanceof P2.a)) {
                c23038g0.postValue(p22);
                return;
            }
            ApiError apiError = ((P2.a) p22).f318719a;
            TL0.d dVar = pVar.f322134N;
            dVar.i(apiError);
            dVar.f();
            c23038g0.postValue(p22);
            dVar.j(apiError);
        }
    }
}
