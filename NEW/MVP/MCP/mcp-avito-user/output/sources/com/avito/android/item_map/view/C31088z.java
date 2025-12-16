package com.avito.android.item_map.view;

import androidx.fragment.app.ActivityC22955m;
import com.avito.android.C34160q2;
import com.avito.android.item_map.ItemMapActivity;
import com.avito.android.item_map.ItemMapFragment;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ItemMapPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.item_map.view.z, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31088z extends kotlin.jvm.internal.N implements Y41.l<G0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I f173642l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31088z(I i12) {
        super(1);
        this.f173642l = i12;
    }

    @Override // Y41.l
    public final G0 invoke(G0 g02) {
        ItemMapFragment itemMapFragment = this.f173642l.f173424k;
        if (itemMapFragment != null) {
            C34160q2 c34160q2 = itemMapFragment.f173232A0;
            if (c34160q2 == null) {
                c34160q2 = null;
            }
            c34160q2.getClass();
            kotlin.reflect.n<Object> nVar = C34160q2.f246158g[1];
            if (!((Boolean) c34160q2.f246160c.a().invoke()).booleanValue() || (itemMapFragment.l1() instanceof ItemMapActivity)) {
                ActivityC22955m activityC22955mL1 = itemMapFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.finish();
                }
            } else {
                itemMapFragment.r5();
            }
        }
        return G0.f406611a;
    }
}
