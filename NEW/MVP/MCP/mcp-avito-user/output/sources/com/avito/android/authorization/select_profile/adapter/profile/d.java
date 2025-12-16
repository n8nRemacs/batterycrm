package com.avito.android.authorization.select_profile.adapter.profile;

import com.avito.android.authorization.select_profile.adapter.SelectProfileField;
import kotlin.Metadata;

/* compiled from: ProfileItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f94271b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SelectProfileField.Profile f94272c;

    public d(e eVar, SelectProfileField.Profile profile) {
        this.f94271b = eVar;
        this.f94272c = profile;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f94271b.f94273b.accept(this.f94272c);
    }
}
