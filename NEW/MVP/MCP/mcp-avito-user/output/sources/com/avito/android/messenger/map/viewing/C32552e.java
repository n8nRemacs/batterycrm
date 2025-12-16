package com.avito.android.messenger.map.viewing;

import androidx.fragment.app.ActivityC22955m;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.L5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LiveDatas.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.map.viewing.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32552e<T> implements InterfaceC23040h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlatformMapFragment f196843b;

    public C32552e(PlatformMapFragment platformMapFragment) {
        this.f196843b = platformMapFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.view.InterfaceC23040h0
    public final void onChanged(T t12) {
        if (t12 != 0) {
            Coordinates coordinates = (Coordinates) t12;
            PlatformMapFragment platformMapFragment = this.f196843b;
            ActivityC22955m activityC22955mL1 = platformMapFragment.l1();
            if (activityC22955mL1 != null) {
                InterfaceC35845m2 interfaceC35845m2 = platformMapFragment.f196795o0;
                if (interfaceC35845m2 == null) {
                    interfaceC35845m2 = null;
                }
                try {
                    activityC22955mL1.startActivity(interfaceC35845m2.k(coordinates));
                } catch (Throwable unused) {
                    L5.a(activityC22955mL1, R.string.messenger_platform_map_map_apps_not_found, 0);
                }
            }
        }
    }
}
