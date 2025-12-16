package com.avito.android.photo_gallery;

import android.content.res.Resources;
import com.avito.android.ui.SafeViewPager;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: RealtyLayoutsDelegate.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class M extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ P f216615l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(P p12) {
        super(0);
        this.f216615l = p12;
    }

    @Override // Y41.a
    public final G0 invoke() throws Resources.NotFoundException {
        P p12 = this.f216615l;
        p12.f216628g.setAdapter(p12.f216626e);
        int i12 = p12.f216641t;
        SafeViewPager safeViewPager = p12.f216628g;
        safeViewPager.x(i12, false);
        safeViewPager.setPagingEnabled(true);
        p12.f216644w = false;
        return G0.f406611a;
    }
}
