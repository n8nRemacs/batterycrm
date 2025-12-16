package com.avito.android.advertising.adapter.items.buzzoola.premium_v2.title;

import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.facebook.drawee.drawable.s;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BuzzoolaPremiumV2TitleItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advertising/ui/buzzoola/premium_v2/b;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advertising/ui/buzzoola/premium_v2/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements p<ViewGroup, View, com.avito.android.advertising.ui.buzzoola.premium_v2.b> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f87495l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(2);
        this.f87495l = cVar;
    }

    @Override // Y41.p
    public final com.avito.android.advertising.ui.buzzoola.premium_v2.b invoke(ViewGroup viewGroup, View view) {
        View view2 = view;
        boolean z12 = this.f87495l.f87497b;
        return new com.avito.android.advertising.ui.buzzoola.premium_v2.b(view2, z12 ? s.c.f340137i : null, z12 ? Integer.valueOf(view2.getResources().getDimensionPixelOffset(R.dimen.ad_grid_image_corner_radius)) : null);
    }
}
