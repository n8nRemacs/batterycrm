package com.akita.compose.theme.re23.preview;

import java.util.List;
import kotlin.Metadata;

/* compiled from: GalleryPreview.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/akita/compose/component/gallery/p;", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/gallery/p;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class W1 extends kotlin.jvm.internal.N implements Y41.l<com.akita.compose.component.gallery.p, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<String> f65552l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W1(List<String> list) {
        super(1);
        this.f65552l = list;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(com.akita.compose.component.gallery.p pVar) {
        List<String> list = this.f65552l;
        pVar.a(list.size(), new V1(list));
        return kotlin.G0.f406611a;
    }
}
