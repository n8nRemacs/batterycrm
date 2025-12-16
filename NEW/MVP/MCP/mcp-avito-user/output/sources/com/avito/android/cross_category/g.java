package com.avito.android.cross_category;

import kotlin.Metadata;

/* compiled from: CrossCategoryWidgetItemPresenterImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f131059b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CrossCategoryWidgetItem f131060c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f131061d;

    public g(h hVar, CrossCategoryWidgetItem crossCategoryWidgetItem, int i12) {
        this.f131059b = hVar;
        this.f131060c = crossCategoryWidgetItem;
        this.f131061d = i12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f131059b.f131063c.get().v(new vs0.h(this.f131060c, new vs0.b(Integer.valueOf(this.f131061d), null, null, 6, null)));
    }
}
