package com.avito.android.profile.remove.screen.items.text_area_item;

import Y61.k;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: TextAreaItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/screen/items/text_area_item/c;", "Lcom/avito/conveyor_item/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f224146b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f224147c;

    public c(@k String str, @k AttributedText attributedText) {
        this.f224146b = str;
        this.f224147c = attributedText;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207394c() {
        return getF224146b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF224146b() {
        return this.f224146b;
    }
}
