package com.avito.android.success_screen_after_apply.ui;

import Y41.l;
import android.graphics.drawable.Drawable;
import com.avito.android.design.State;
import com.avito.android.lib.deprecated_design.badge_bar.ImageLoadableView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ImageLoadableExtension.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/graphics/drawable/Drawable;", "drawable", "Lkotlin/G0;", "invoke", "(Landroid/graphics/drawable/Drawable;)V", "com/avito/android/image_loader/fresco/m", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class b extends N implements l<Drawable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ImageLoadableView f291779l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ImageLoadableView imageLoadableView) {
        super(1);
        this.f291779l = imageLoadableView;
    }

    @Override // Y41.l
    public final G0 invoke(Drawable drawable) {
        this.f291779l.setState(State.f135882f);
        return G0.f406611a;
    }
}
