package com.avito.android.beduin.common.advert;

import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: BeduinViewedAdvertManagerImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "id", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class u<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f100578b;

    public u(s sVar) {
        this.f100578b = sVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String str = (String) obj;
        s sVar = this.f100578b;
        if (sVar.f100572f.contains(str)) {
            return;
        }
        Set<String> setSingleton = Collections.singleton(str);
        sVar.f100572f.addAll(setSingleton);
        sVar.d(setSingleton, q.f100563l);
    }
}
