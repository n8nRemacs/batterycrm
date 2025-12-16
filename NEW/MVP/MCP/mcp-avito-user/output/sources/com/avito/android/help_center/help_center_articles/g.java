package com.avito.android.help_center.help_center_articles;

import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import kotlin.Metadata;

/* compiled from: HelpCenterArticlesPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;", "it", "Lkotlin/G0;", "accept", "(Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f161727b;

    /* compiled from: HelpCenterArticlesPresenter.kt */
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

    public g(q qVar) {
        this.f161727b = qVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        PowerWebViewStateChangeEvent powerWebViewStateChangeEvent = (PowerWebViewStateChangeEvent) obj;
        int iOrdinal = powerWebViewStateChangeEvent.f392937a.ordinal();
        com.avito.android.progress_overlay.l lVar = this.f161727b.f161756d;
        if (iOrdinal == 0) {
            String str = powerWebViewStateChangeEvent.f392939c;
            if (str == null || str.length() == 0) {
                return;
            }
            lVar.k(null);
            return;
        }
        if (iOrdinal == 1) {
            lVar.j();
        } else {
            if (iOrdinal != 3) {
                return;
            }
            lVar.a("");
        }
    }
}
