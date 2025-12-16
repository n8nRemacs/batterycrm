package com.avito.android.user_adverts.tab_actions.info.items.block;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ActionBlockInfoItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/info/items/block/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f314658b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f314659c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f314660d;

    public a(@k String str, @k String str2, @l AttributedText attributedText) {
        this.f314658b = str;
        this.f314659c = str2;
        this.f314660d = attributedText;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return getF296143b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF296143b() {
        return this.f314658b;
    }
}
