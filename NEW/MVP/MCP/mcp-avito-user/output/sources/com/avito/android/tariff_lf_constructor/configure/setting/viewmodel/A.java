package com.avito.android.tariff_lf_constructor.configure.setting.viewmodel;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: ConstructorSettingViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class A<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f300169b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f300170c;

    public A(m mVar, String str) {
        this.f300169b = mVar;
        this.f300170c = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        boolean z12 = p22 instanceof P2.b;
        m mVar = this.f300169b;
        if (z12) {
            m.le(mVar, (BD0.d) ((P2.b) p22).f318720a);
        } else if (p22 instanceof P2.a) {
            mVar.f300210U.setValue(com.avito.android.error.z.k(((P2.a) p22).f318719a));
        } else if (p22 instanceof P2.c) {
            m.ke(mVar, this.f300170c, p22);
        }
    }
}
