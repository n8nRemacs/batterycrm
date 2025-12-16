package com.avito.android.messenger.channels.mvi.interactor;

import com.avito.android.messenger.folders.f;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FoldersInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "foldersWithCounters", "Lkotlin/G0;", "accept", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class x<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f187670b;

    public x(l lVar) {
        this.f187670b = lVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.jakewharton.rxrelay3.c<com.avito.android.messenger.folders.f> cVar = this.f187670b.f187656M;
        f.a aVar = com.avito.android.messenger.folders.f.f196355b;
        com.avito.android.messenger.folders.e.f196349a.getClass();
        List list = (List) com.avito.android.messenger.folders.e.f196353e.getValue();
        aVar.getClass();
        cVar.accept(f.a.a(list, (Map) obj));
    }
}
