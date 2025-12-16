package com.yandex.div.core.view2.divs;

import android.graphics.Bitmap;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: DivGifImageBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/graphics/Bitmap;", "it", "Lkotlin/G0;", "invoke", "(Landroid/graphics/Bitmap;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.divs.z0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C38021z0 extends kotlin.jvm.internal.N implements Y41.l<Bitmap, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.g f369050l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38021z0(com.yandex.div.core.view2.divs.widgets.g gVar) {
        super(1);
        this.f369050l = gVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        com.yandex.div.core.view2.divs.widgets.g gVar = this.f369050l;
        if (!gVar.l()) {
            gVar.setPreview(bitmap2);
            gVar.setTag(R.id.image_loaded_flag, Boolean.FALSE);
        }
        return kotlin.G0.f406611a;
    }
}
