package defpackage;

import androidx.work.WorkRequest;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker;

/* loaded from: classes2.dex */
public final class mb8 {
    public static void a(g5i g5iVar, boolean z) {
        wqi.c(LoadEmojiFontWorker.TAG, "start", new Object[0]);
        ngb ngbVar = (ngb) ((ngb) ((ngb) ((ngb) new ngb(LoadEmojiFontWorker.class).setBackoffCriteria(eg0.a, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS)).setConstraints(new bu3(z ? 2 : 3, false, false, false, false, -1L, -1L, ue3.h0(new LinkedHashSet())))).setExpedited(ujb.a)).addTag(LoadEmojiFontWorker.TAG);
        imb[] imbVarArr = {new imb(LoadEmojiFontWorker.WAITING_FOR_WIFI, Boolean.valueOf(z))};
        r5j r5jVar = new r5j(14);
        imb imbVar = imbVarArr[0];
        r5jVar.C(imbVar.b, (String) imbVar.a);
        ogb ogbVar = (ogb) ((ngb) ngbVar.setInputData(r5jVar.g())).build();
        wqi.c(LoadEmojiFontWorker.TAG, "work " + ogbVar.getId(), new Object[0]);
        g5iVar.b(LoadEmojiFontWorker.TAG, uk5.b, ogbVar).c();
    }
}
