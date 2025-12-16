package com.avito.android.messenger.conversation.mvi.file_download;

import androidx.work.C23544h;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: FileDownloadWorker.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Ljava/util/UUID;", "Landroidx/work/WorkInfo;", "workInfos", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.file_download.s, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32054s<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f190952b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f190953c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f190954d;

    public C32054s(long j12, String str, MessengerUserHashInfo messengerUserHashInfo) {
        this.f190952b = j12;
        this.f190953c = messengerUserHashInfo;
        this.f190954d = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (T t12 : (List) obj) {
            WorkInfo workInfo = (WorkInfo) t12;
            if (workInfo.f55408b == WorkInfo.State.f55422e) {
                C23544h c23544h = workInfo.f55410d;
                if (c23544h.b("enqTimestamp", 0L) >= this.f190952b && kotlin.jvm.internal.L.f(dZ.g.a(c23544h, FileDownloadWorker.f190806e), this.f190953c) && kotlin.jvm.internal.L.f(c23544h.c("channelId"), this.f190954d)) {
                    arrayList.add(t12);
                }
            }
        }
        int iF2 = P0.f(C42745f0.q(arrayList, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((WorkInfo) next).f55407a, next);
        }
        return linkedHashMap;
    }
}
