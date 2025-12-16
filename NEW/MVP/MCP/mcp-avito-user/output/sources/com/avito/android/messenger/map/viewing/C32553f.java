package com.avito.android.messenger.map.viewing;

import androidx.fragment.app.ActivityC22955m;
import androidx.view.InterfaceC23040h0;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.L5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LiveDatas.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.map.viewing.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32553f<T> implements InterfaceC23040h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlatformMapFragment f196844b;

    public C32553f(PlatformMapFragment platformMapFragment) {
        this.f196844b = platformMapFragment;
    }

    @Override // androidx.view.InterfaceC23040h0
    public final void onChanged(T t12) {
        if (t12 != null) {
            PrintableText printableText = (PrintableText) t12;
            PlatformMapFragment platformMapFragment = this.f196844b;
            ActivityC22955m activityC22955mL1 = platformMapFragment.l1();
            if (activityC22955mL1 != null) {
                L5.b(activityC22955mL1, printableText.k0(platformMapFragment.requireContext()), 0);
            }
        }
    }
}
