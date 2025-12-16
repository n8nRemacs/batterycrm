package com.avito.android.publish.slots.images_groups_recommendations.item;

import android.view.View;
import android.view.ViewGroup;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImagesGroupsRecommendationsAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "layoutRes", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class c extends N implements Y41.l<Integer, View> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f244211l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ViewGroup viewGroup) {
        super(1);
        this.f244211l = viewGroup;
    }

    @Override // Y41.l
    public final View invoke(Integer num) {
        int iIntValue = num.intValue();
        ViewGroup viewGroup = this.f244211l;
        return C0.b(viewGroup, iIntValue, viewGroup, false);
    }
}
