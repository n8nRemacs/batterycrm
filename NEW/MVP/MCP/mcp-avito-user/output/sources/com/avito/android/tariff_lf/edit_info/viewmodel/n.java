package com.avito.android.tariff_lf.edit_info.viewmodel;

import androidx.view.C23038g0;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.tariff_lf.edit_info.viewmodel.k;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: EditInfoViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class n<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f299112b;

    public n(r rVar) {
        this.f299112b = rVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        boolean z12 = p22 instanceof P2.b;
        r rVar = this.f299112b;
        if (z12) {
            rVar.O();
        } else if (p22 instanceof P2.a) {
            C23038g0<k.a> c23038g0 = rVar.f299128U;
            ApiError apiError = ((P2.a) p22).f318719a;
            c23038g0.postValue(new k.a(apiError, apiError.getF244063c()));
        } else {
            p22.equals(P2.c.f318721a);
        }
        rVar.f299133Z.postValue(new Object());
    }
}
