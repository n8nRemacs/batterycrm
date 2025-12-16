package com.avito.android.home.navbar;

import com.avito.android.deep_linking.links.CartLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.Metadata;
import mU.C44012a;

/* compiled from: NavbarBusiness360View.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class h<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f162461b;

    public h(f fVar) {
        this.f162461b = fVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        i iVar = this.f162461b.f162451e;
        b.a.a(iVar.f162462a, new CartLink(null, "avitoForBusiness"), null, null, 6);
        C44012a.a(iVar.f162465d, null, null, "navbar_business360", 3);
    }
}
