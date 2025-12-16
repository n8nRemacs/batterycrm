package com.yandex.div.internal.viewpool;

import Y61.k;
import android.view.View;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* compiled from: PseudoViewPool.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/internal/viewpool/e;", "Lcom/yandex/div/internal/viewpool/h;", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ConcurrentHashMap<String, g<? extends View>> f370209a = new ConcurrentHashMap<>();

    @Override // com.yandex.div.internal.viewpool.h
    public final <T extends View> void a(@k String str, @k g<T> gVar, int i12) {
        this.f370209a.put(str, gVar);
    }

    @Override // com.yandex.div.internal.viewpool.h
    @k
    public final <T extends View> T b(@k String str) {
        g<? extends View> gVar = this.f370209a.get(str);
        if (gVar != null) {
            return (T) gVar.a();
        }
        throw new NoSuchElementException((String) null);
    }
}
