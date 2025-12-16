package com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar;

import Y41.l;
import android.graphics.drawable.Drawable;
import com.avito.android.lib.util.darkTheme.ThemeAppearance;
import com.avito.android.ui.status_bar.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VerticalFilterToolbarPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/graphics/drawable/Drawable;", "drawable", "Lkotlin/G0;", "invoke", "(Landroid/graphics/drawable/Drawable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class d extends N implements l<Drawable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f113155l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(1);
        this.f113155l = eVar;
    }

    @Override // Y41.l
    public final G0 invoke(Drawable drawable) {
        this.f113155l.f113169o.setValue(new com.avito.android.ui.status_bar.d(ThemeAppearance.f181334b, new d.a.c(drawable)));
        return G0.f406611a;
    }
}
