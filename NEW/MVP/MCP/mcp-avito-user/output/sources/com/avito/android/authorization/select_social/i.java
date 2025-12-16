package com.avito.android.authorization.select_social;

import kotlin.Metadata;

/* compiled from: SelectSocialPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class i<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f94537b;

    public i(n nVar) {
        this.f94537b = nVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        SelectSocialActivity selectSocialActivity = this.f94537b.f94554k;
        if (selectSocialActivity != null) {
            selectSocialActivity.finish();
        }
    }
}
