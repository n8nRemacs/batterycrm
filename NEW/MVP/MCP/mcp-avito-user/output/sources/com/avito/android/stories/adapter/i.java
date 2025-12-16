package com.avito.android.stories.adapter;

import com.avito.android.util.Kundle;
import kotlin.Metadata;

/* compiled from: StoriesItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class i<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f285066b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.stories.view.a f285067c;

    public i(d dVar, com.avito.android.stories.view.a aVar) {
        this.f285066b = dVar;
        this.f285067c = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ((Number) obj).intValue();
        d dVar = this.f285066b;
        Kundle kundle = dVar.f285052d;
        if (kundle != null) {
            kundle.j(this.f285067c.lu(), "key_saved_stories_state");
        }
        Kundle kundle2 = dVar.f285052d;
        if (kundle2 != null) {
            kundle2.h(Boolean.FALSE, "key_position_changes");
        }
    }
}
