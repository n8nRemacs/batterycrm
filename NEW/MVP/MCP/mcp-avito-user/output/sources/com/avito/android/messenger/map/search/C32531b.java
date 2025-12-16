package com.avito.android.messenger.map.search;

import android.content.Intent;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.InterfaceC23040h0;
import com.avito.android.remote.model.messenger.geo.GeoSearchSuggest;
import com.avito.android.util.K2;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: LiveDatas.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.map.search.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32531b<T> implements InterfaceC23040h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GeoSearchFragment f196533b;

    public C32531b(GeoSearchFragment geoSearchFragment) {
        this.f196533b = geoSearchFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.view.InterfaceC23040h0
    public final void onChanged(T t12) {
        if (t12 != 0) {
            com.avito.android.messenger.map.search.adapter.a aVar = (com.avito.android.messenger.map.search.adapter.a) t12;
            ActivityC22955m activityC22955mL1 = this.f196533b.l1();
            if (activityC22955mL1 != null) {
                activityC22955mL1.setResult(-1, new Intent().putExtra("selected_suggest", new GeoSearchSuggest(aVar.f196515b, aVar.f196516c, aVar.f196517d, aVar.f196518e, aVar.f196519f, aVar.f196520g, Boolean.valueOf(L.f(aVar.f196521h, "item suggest")))));
                K2.c(activityC22955mL1);
                activityC22955mL1.finish();
            }
        }
    }
}
