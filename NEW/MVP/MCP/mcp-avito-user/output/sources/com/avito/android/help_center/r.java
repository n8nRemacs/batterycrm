package com.avito.android.help_center;

import android.view.MenuItem;
import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HelpCenterPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;", "it", "Lkotlin/G0;", "invoke", "(Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class r extends N implements Y41.l<PowerWebViewStateChangeEvent, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f161843l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ L f161844m;

    /* compiled from: HelpCenterPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PowerWebViewStateChangeEvent.State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PowerWebViewStateChangeEvent.State state = PowerWebViewStateChangeEvent.State.f392943b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PowerWebViewStateChangeEvent.State state2 = PowerWebViewStateChangeEvent.State.f392943b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PowerWebViewStateChangeEvent.State state3 = PowerWebViewStateChangeEvent.State.f392943b;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(z zVar, L l12) {
        super(1);
        this.f161843l = zVar;
        this.f161844m = l12;
    }

    @Override // Y41.l
    public final G0 invoke(PowerWebViewStateChangeEvent powerWebViewStateChangeEvent) {
        PowerWebViewStateChangeEvent powerWebViewStateChangeEvent2 = powerWebViewStateChangeEvent;
        int iOrdinal = powerWebViewStateChangeEvent2.f392937a.ordinal();
        com.avito.android.progress_overlay.l lVar = this.f161844m.f161617e;
        if (iOrdinal == 0) {
            String str = powerWebViewStateChangeEvent2.f392939c;
            if (str != null && str.length() != 0) {
                z zVar = this.f161843l;
                zVar.f161865m = str;
                L l12 = zVar.f161862j;
                if (l12 != null) {
                    boolean z12 = !kotlin.jvm.internal.L.f(str, zVar.f161864l);
                    MenuItem menuItem = l12.f161618f;
                    if (menuItem == null) {
                        menuItem = null;
                    }
                    menuItem.setVisible(z12);
                }
                lVar.k(null);
            }
        } else if (iOrdinal == 1) {
            lVar.j();
        } else if (iOrdinal == 3) {
            lVar.a("");
        }
        return G0.f406611a;
    }
}
