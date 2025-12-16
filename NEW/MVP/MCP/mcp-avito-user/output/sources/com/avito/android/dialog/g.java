package com.avito.android.dialog;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.Action;
import kotlin.Metadata;

/* compiled from: DialogPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "Lcom/avito/android/deep_linking/links/DeepLink;", "apply", "(Lkotlin/G0;)Lcom/avito/android/deep_linking/links/DeepLink;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class g<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Action f144768b;

    public g(Action action) {
        this.f144768b = action;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        DeepLink deepLink;
        Action action = this.f144768b;
        return (action == null || (deepLink = action.getDeepLink()) == null) ? new NoMatchLink() : deepLink;
    }
}
