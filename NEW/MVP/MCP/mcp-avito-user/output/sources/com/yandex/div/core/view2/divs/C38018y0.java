package com.yandex.div.core.view2.divs;

import android.graphics.drawable.Drawable;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: DivGifImageBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/graphics/drawable/Drawable;", "it", "Lkotlin/G0;", "invoke", "(Landroid/graphics/drawable/Drawable;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.divs.y0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C38018y0 extends kotlin.jvm.internal.N implements Y41.l<Drawable, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.g f369044l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38018y0(com.yandex.div.core.view2.divs.widgets.g gVar) {
        super(1);
        this.f369044l = gVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Drawable drawable) {
        Drawable drawable2 = drawable;
        com.yandex.div.core.view2.divs.widgets.g gVar = this.f369044l;
        if (!gVar.l() && !kotlin.jvm.internal.L.f(gVar.getTag(R.id.image_loaded_flag), Boolean.FALSE)) {
            gVar.setPlaceholder(drawable2);
        }
        return kotlin.G0.f406611a;
    }
}
