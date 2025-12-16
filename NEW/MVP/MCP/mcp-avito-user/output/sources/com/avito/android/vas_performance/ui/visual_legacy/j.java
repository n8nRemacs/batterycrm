package com.avito.android.vas_performance.ui.visual_legacy;

import androidx.fragment.app.ActivityC22955m;
import com.avito.android.vas_performance.ui.visual_legacy.VisualVasFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import w50.InterfaceC49447a;

/* compiled from: VisualVasFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/vas_performance/ui/visual_legacy/VisualVasCloseEvent;", "kotlin.jvm.PlatformType", "event", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/vas_performance/ui/visual_legacy/VisualVasCloseEvent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class j extends N implements Y41.l<VisualVasCloseEvent, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ VisualVasFragment f322114l;

    /* compiled from: VisualVasFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f322115a;

        static {
            int[] iArr = new int[VisualVasCloseEvent.values().length];
            try {
                VisualVasCloseEvent visualVasCloseEvent = VisualVasCloseEvent.f322070b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                VisualVasCloseEvent visualVasCloseEvent2 = VisualVasCloseEvent.f322070b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f322115a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(VisualVasFragment visualVasFragment) {
        super(1);
        this.f322114l = visualVasFragment;
    }

    @Override // Y41.l
    public final G0 invoke(VisualVasCloseEvent visualVasCloseEvent) {
        VisualVasCloseEvent visualVasCloseEvent2 = visualVasCloseEvent;
        int i12 = visualVasCloseEvent2 == null ? -1 : a.f322115a[visualVasCloseEvent2.ordinal()];
        VisualVasFragment visualVasFragment = this.f322114l;
        if (i12 == 1) {
            VisualVasFragment.f fVar = visualVasFragment.f322082H0;
            fVar.d(false);
            ActivityC22955m activityC22955mL1 = visualVasFragment.l1();
            if (activityC22955mL1 != null) {
                activityC22955mL1.onBackPressed();
            }
            fVar.d(true);
        } else if (i12 == 2) {
            InterfaceC49447a interfaceC49447a = visualVasFragment.f322077C0;
            if (interfaceC49447a == null) {
                interfaceC49447a = null;
            }
            interfaceC49447a.r1();
        }
        return G0.f406611a;
    }
}
