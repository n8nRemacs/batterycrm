package com.avito.android.home.default_search_location;

import com.avito.android.location.analytics.FindLocationPage;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;

/* compiled from: DefaultSearchLocationPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lorg/funktionale/option/a;", "", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lorg/funktionale/option/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class m<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f162390b;

    public m(s sVar) {
        this.f162390b = sVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        s sVar = this.f162390b;
        if (sVar.f162411p) {
            return;
        }
        sVar.f162411p = true;
        boolean z12 = sVar.f162409n;
        a aVar = sVar.f162398c;
        if (z12) {
            FindLocationPage findLocationPage = FindLocationPage.f181725c;
            aVar.c("open_app");
        } else {
            FindLocationPage findLocationPage2 = FindLocationPage.f181725c;
            aVar.c("first_launch");
        }
        Boolean bool = sVar.f162412q;
        sVar.f162407l.b((bool != null ? I.q(bool) : sVar.f162403h.j().k(new l(sVar))).s(sVar.f162396a.e()).x(new g(sVar), new h(sVar)));
    }
}
