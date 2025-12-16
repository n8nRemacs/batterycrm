package com.avito.android.social_management.adapter.available;

import com.avito.android.social_management.adapter.SocialItem;
import kotlin.Metadata;

/* compiled from: AvailableItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f284501b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SocialItem.Available f284502c;

    public d(e eVar, SocialItem.Available available) {
        this.f284501b = eVar;
        this.f284502c = available;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f284501b.f284503b.accept(this.f284502c);
    }
}
