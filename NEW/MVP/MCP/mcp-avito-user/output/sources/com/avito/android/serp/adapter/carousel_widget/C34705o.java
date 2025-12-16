package com.avito.android.serp.adapter.carousel_widget;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: CarouselItemsWidgetView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.carousel_widget.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34705o extends kotlin.jvm.internal.N implements Y41.a<Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34699i f269405l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34705o(C34699i c34699i) {
        super(0);
        this.f269405l = c34699i;
    }

    @Override // Y41.a
    public final Integer invoke() {
        C34699i c34699i = this.f269405l;
        RecyclerView recyclerView = c34699i.f269384m;
        int iC2 = (int) (((c34699i.f269376e.c() - recyclerView.getPaddingStart()) - recyclerView.getPaddingEnd()) * 0.8f);
        int i12 = c34699i.f269397z;
        if (iC2 > i12) {
            iC2 = i12;
        }
        return Integer.valueOf(iC2);
    }
}
