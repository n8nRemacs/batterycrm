package com.avito.android.serp.adapter.snippet;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.di.module.I9;
import com.avito.android.di.module.J9;
import com.avito.android.di.module.K9;
import java.util.Collections;
import javax.inject.Inject;
import jr.InterfaceC42416a;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: SnippetPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/serp/adapter/snippet/g;", "LTV0/d;", "Lcom/avito/android/serp/adapter/snippet/i;", "Lcom/avito/android/serp/adapter/snippet/SnippetItem;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface g extends TV0.d<i, SnippetItem> {

    /* compiled from: SnippetPresenter.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/snippet/g$a;", "Lcom/avito/android/serp/adapter/snippet/g;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements g {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.jakewharton.rxrelay3.d<Q<SnippetItem, Integer>> f272363b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final com.jakewharton.rxrelay3.d<Q<SnippetItem, Integer>> f272364c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final com.jakewharton.rxrelay3.d<Q<SnippetItem, Boolean>> f272365d;

        @Inject
        public a(@I9 @k com.jakewharton.rxrelay3.d<Q<SnippetItem, Integer>> dVar, @J9 @k com.jakewharton.rxrelay3.d<Q<SnippetItem, Integer>> dVar2, @K9 @k com.jakewharton.rxrelay3.d<Q<SnippetItem, Boolean>> dVar3) {
            this.f272363b = dVar;
            this.f272364c = dVar2;
            this.f272365d = dVar3;
        }

        @Override // TV0.d
        public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
            i iVar = (i) eVar;
            SnippetItem snippetItem = (SnippetItem) aVar;
            iVar.G4(com.avito.android.image_loader.b.b(snippetItem.f272346f));
            iVar.P2(snippetItem.f272347g);
            iVar.h2(Collections.singletonList(new InterfaceC42416a.C11584a(snippetItem.f272345e.getTitle(), new d(this, snippetItem, i12))));
            iVar.setCloseButtonVisible(snippetItem.f272348h);
            iVar.B7(new e(this, snippetItem, i12));
            iVar.uX(new f(this, snippetItem));
        }
    }
}
