package com.avito.android.help_center.help_center_request;

import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HelpCenterRequestPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;", "it", "Lkotlin/G0;", "invoke", "(Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class j extends N implements Y41.l<PowerWebViewStateChangeEvent, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f161809l;

    /* compiled from: HelpCenterRequestPresenter.kt */
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
    public j(p pVar) {
        super(1);
        this.f161809l = pVar;
    }

    @Override // Y41.l
    public final G0 invoke(PowerWebViewStateChangeEvent powerWebViewStateChangeEvent) {
        PowerWebViewStateChangeEvent powerWebViewStateChangeEvent2 = powerWebViewStateChangeEvent;
        int iOrdinal = powerWebViewStateChangeEvent2.f392937a.ordinal();
        com.avito.android.progress_overlay.l lVar = this.f161809l.f161834e;
        if (iOrdinal == 0) {
            String str = powerWebViewStateChangeEvent2.f392939c;
            if (str != null && str.length() != 0) {
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
