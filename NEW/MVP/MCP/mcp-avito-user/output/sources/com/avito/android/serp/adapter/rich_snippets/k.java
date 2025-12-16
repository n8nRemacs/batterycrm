package com.avito.android.serp.adapter.rich_snippets;

import androidx.compose.runtime.internal.P;
import com.avito.android.util.Kundle;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RichSnippetStateProvider.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/k;", "Lcom/avito/android/serp/adapter/rich_snippets/j;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<j> f270883b;

    @Inject
    public k(@Y61.k Set<j> set) {
        this.f270883b = set;
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.j
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        Iterator<T> it = this.f270883b.iterator();
        while (it.hasNext()) {
            kundle.f318647b.putAll(((j) it.next()).d0().f318647b);
        }
        return kundle;
    }
}
