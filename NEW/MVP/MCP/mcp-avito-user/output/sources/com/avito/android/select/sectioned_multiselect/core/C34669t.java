package com.avito.android.select.sectioned_multiselect.core;

import com.avito.android.deeplink_handler.handler.b;
import kotlin.Metadata;

/* compiled from: SectionedMultiselectDialogPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/select/glow_animation/a;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/select/glow_animation/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.select.sectioned_multiselect.core.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34669t<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f266682b;

    public C34669t(K k12) {
        this.f266682b = k12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        K k12 = this.f266682b;
        b.a.a(k12.f266487l, ((com.avito.android.select.glow_animation.a) obj).f265387e, null, null, 6);
        SectionedMultiselectCoreFragment sectionedMultiselectCoreFragment = k12.f266490o;
        if (sectionedMultiselectCoreFragment != null) {
            sectionedMultiselectCoreFragment.g5();
        }
    }
}
