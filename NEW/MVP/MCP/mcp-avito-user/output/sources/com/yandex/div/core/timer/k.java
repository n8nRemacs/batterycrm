package com.yandex.div.core.timer;

import com.yandex.div.core.view2.C38029k;
import com.yandex.div2.DivAction;
import java.util.List;
import kotlin.Metadata;

/* compiled from: UiThreadHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/yandex/div/internal/util/t", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
public final class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f367739b;

    public k(i iVar) {
        this.f367739b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.f367739b;
        List<DivAction> list = iVar.f367731h;
        if (list == null) {
            return;
        }
        for (DivAction divAction : list) {
            C38029k c38029k = iVar.f367728e;
            if (c38029k != null) {
                iVar.f367725b.handleAction(divAction, c38029k);
            }
        }
    }
}
