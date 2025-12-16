package com.avito.android.authorization.select_profile;

import kotlin.Metadata;

/* compiled from: SelectProfilePresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class s<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectProfilePresenterImpl f94341b;

    public s(SelectProfilePresenterImpl selectProfilePresenterImpl) {
        this.f94341b = selectProfilePresenterImpl;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        SelectProfileActivity selectProfileActivity = this.f94341b.f94240l;
        if (selectProfileActivity != null) {
            selectProfileActivity.a2();
        }
    }
}
