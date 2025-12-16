package com.yandex.div.core.downloader;

import androidx.collection.C20199a;
import com.yandex.div.core.dagger.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DivPatchCache.kt */
@z
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/downloader/k;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C20199a<q21.c, p> f367430a = new C20199a<>();

    @Inject
    public k() {
    }

    @Y61.l
    public final void a(@Y61.k q21.c cVar) {
        if (this.f367430a.get(cVar) != null) {
            throw null;
        }
    }
}
