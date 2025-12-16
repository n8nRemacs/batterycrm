package com.avito.android.lib.design.tab_group.layout;

import android.content.res.Resources;
import androidx.viewpager.widget.ViewPager;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TabGroupLayoutViewPagerExt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "tabPosition", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class l extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ViewPager f180816l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ViewPager viewPager) {
        super(1);
        this.f180816l = viewPager;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) throws Resources.NotFoundException {
        this.f180816l.x(num.intValue(), true);
        return G0.f406611a;
    }
}
