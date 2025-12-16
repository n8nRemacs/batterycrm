package com.yandex.div.core.view2;

import android.graphics.Bitmap;
import com.yandex.div.core.view2.D;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DivPlaceholderLoader.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/graphics/Bitmap;", "it", "Lkotlin/G0;", "invoke", "(Landroid/graphics/Bitmap;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class E extends kotlin.jvm.internal.N implements Y41.l<Bitmap, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Bitmap, G0> f367851l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.A f367852m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public E(Y41.l<? super Bitmap, G0> lVar, com.yandex.div.core.view2.divs.widgets.A a12) {
        super(1);
        this.f367851l = lVar;
        this.f367852m = a12;
    }

    @Override // Y41.l
    public final G0 invoke(Bitmap bitmap) {
        ((D.a) this.f367851l).invoke(bitmap);
        this.f367852m.b();
        return G0.f406611a;
    }
}
