package com.avito.android.advert.item;

import com.avito.android.remote.model.Image;
import gw.InterfaceC40743a;
import kotlin.Metadata;

/* compiled from: AdvertDetailsRouter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgw/a;", "it", "Lkotlin/G0;", "invoke", "(Lgw/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.item.e1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28125e1 extends kotlin.jvm.internal.N implements Y41.l<InterfaceC40743a, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Image f75293l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28125e1(Image image) {
        super(1);
        this.f75293l = image;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(InterfaceC40743a interfaceC40743a) {
        InterfaceC40743a interfaceC40743a2 = interfaceC40743a;
        com.avito.android.image_loader.fresco.s.a(interfaceC40743a2, this.f75293l, true, true, new C28094c1(interfaceC40743a2), new C28122d1(interfaceC40743a2));
        return kotlin.G0.f406611a;
    }
}
