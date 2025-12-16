package com.avito.android.advert_core.information_about;

import Y61.k;
import Y61.l;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import com.avito.android.advert.item.Z0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InformationAboutPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/information_about/e;", "Lcom/avito/android/advert_core/information_about/c;", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @l
    public Z0 f83696b;

    @Inject
    public e() {
    }

    @Override // com.avito.android.advert_core.information_about.c
    public final void H5(@k Z0 z02) {
        this.f83696b = z02;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        InformationAboutItem informationAboutItem = (InformationAboutItem) aVar;
        String str = informationAboutItem.f83687h;
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new UnderlineSpan(), 0, str.length(), 33);
        gVar.rc(informationAboutItem.f83685f, informationAboutItem.f83686g);
        gVar.b(informationAboutItem.f83684e);
        gVar.hL(spannableString);
        gVar.MO(new d(this, informationAboutItem.f83688i));
    }

    @Override // com.avito.android.advert_core.information_about.c
    public final void c0() {
        this.f83696b = null;
    }
}
