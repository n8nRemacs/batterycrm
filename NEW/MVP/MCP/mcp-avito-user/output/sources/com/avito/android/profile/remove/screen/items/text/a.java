package com.avito.android.profile.remove.screen.items.text;

import Y61.k;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: TextItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/screen/items/text/a;", "Lcom/avito/conveyor_item/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f224128b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f224129c;

    public a(@k String str, @k AttributedText attributedText) {
        this.f224128b = str;
        this.f224129c = attributedText;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207394c() {
        return getF224128b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF224128b() {
        return this.f224128b;
    }
}
