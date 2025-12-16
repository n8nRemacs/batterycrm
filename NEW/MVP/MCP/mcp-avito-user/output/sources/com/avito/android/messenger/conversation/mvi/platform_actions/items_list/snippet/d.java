package com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet;

import TV0.g;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: ItemsListSnippetBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/items_list/snippet/d;", "LTV0/b;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/items_list/snippet/a;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/items_list/snippet/f;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements TV0.b<a, f> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f194012a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<b> f194013b = new g.a<>(R.layout.messenger_platform_items_list_snippet, c.f194011l);

    public d(@k h hVar) {
        this.f194012a = hVar;
    }

    @Override // TV0.b
    @k
    public final TV0.d<a, f> a() {
        return this.f194012a;
    }

    @Override // TV0.b
    @k
    public final g.a<b> b() {
        return this.f194013b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof f;
    }
}
