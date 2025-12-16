package com.avito.android.tariff_lf_constructor.configure.setting.viewmodel;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.P2;
import kotlin.Metadata;
import wD0.C49488b;

/* compiled from: ConstructorSettingViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "LwD0/e;", VoiceInfo.STATE, "", "apply", "(Lcom/avito/android/util/P2;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class z<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f300238b;

    public z(m mVar) {
        this.f300238b = mVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        P2 p22 = (P2) obj;
        if (!(p22 instanceof P2.b)) {
            return p22;
        }
        wD0.e eVar = (wD0.e) ((P2.b) p22).f318720a;
        wD0.d totalInfo = eVar.getTotalInfo();
        C49488b autoProlong = totalInfo != null ? totalInfo.getAutoProlong() : null;
        m mVar = this.f300238b;
        if (autoProlong != null) {
            autoProlong.c(mVar.f300222g0);
        }
        return new P2.b(mVar.f300199J.a(eVar));
    }
}
