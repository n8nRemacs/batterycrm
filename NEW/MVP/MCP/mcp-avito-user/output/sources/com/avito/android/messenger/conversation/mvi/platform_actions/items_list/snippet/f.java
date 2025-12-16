package com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;

/* compiled from: ItemsListSnippetData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/items_list/snippet/f;", "Lcom/avito/conveyor_item/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f194014b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f194015c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f194016d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Image f194017e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f194018f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Boolean f194019g;

    public f(@k String str, @k String str2, @k String str3, @l Image image, @l String str4, @l Boolean bool) {
        this.f194014b = str;
        this.f194015c = str2;
        this.f194016d = str3;
        this.f194017e = image;
        this.f194018f = str4;
        this.f194019g = bool;
    }

    @Override // TV0.a
    public final long getId() {
        return getF183828b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF183828b() {
        return this.f194014b;
    }
}
