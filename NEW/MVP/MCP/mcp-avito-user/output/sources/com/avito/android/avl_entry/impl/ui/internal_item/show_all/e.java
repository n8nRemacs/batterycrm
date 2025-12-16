package com.avito.android.avl_entry.impl.ui.internal_item.show_all;

import Y41.l;
import android.content.Context;
import com.avito.android.avl_analytics.AvlEntryType;
import com.avito.android.avl_analytics.AvlFromPage;
import com.avito.android.avl_entry.impl.ui.internal_item.ShortVideosWidgetCarouselItem;
import com.avito.android.util.C35755b0;
import js0.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ShortVideosShowAllWidgetCarouselItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Lkotlin/G0;", "invoke", "(Landroid/content/Context;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements l<Context, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ShortVideosWidgetCarouselItem.ShowAllItem f98568l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f98569m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f98570n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ShortVideosWidgetCarouselItem.ShowAllItem showAllItem, f fVar, int i12) {
        super(1);
        this.f98568l = showAllItem;
        this.f98569m = fVar;
        this.f98570n = i12;
    }

    @Override // Y41.l
    public final G0 invoke(Context context) {
        Context context2 = context;
        ShortVideosWidgetCarouselItem.ShowAllItem showAllItem = this.f98568l;
        boolean z12 = showAllItem.f98555b;
        int i12 = this.f98570n;
        f fVar = this.f98569m;
        if (z12) {
            d.a.a(fVar.f98574e, Integer.valueOf(i12), "video_widget", "item", null, null, null, C35755b0.c(P0.g(new Q("x", showAllItem.getXHash()), new Q("cid", showAllItem.f98556c))), showAllItem.f98557d, 56);
        }
        com.avito.android.avl_analytics.a aVar = fVar.f98573d;
        Integer numValueOf = Integer.valueOf(i12);
        Integer entryPosition = showAllItem.getEntryPosition();
        Integer numValueOf2 = Integer.valueOf(entryPosition != null ? entryPosition.intValue() : 0);
        AvlEntryType avlEntryType = AvlEntryType.f98425b;
        aVar.l(showAllItem.f98556c, numValueOf, null, numValueOf2, AvlEntryType.f98425b, showAllItem.f98555b ? AvlFromPage.f98429d : AvlFromPage.f98428c, null);
        context2.startActivity(fVar.f98572c.a("", showAllItem.getKey(), null, null));
        return G0.f406611a;
    }
}
