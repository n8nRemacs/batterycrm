package com.avito.android.user_adverts_views_util.position;

import Y41.l;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: SearchPositionAnimator.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "attachedView", "Ljava/lang/ref/WeakReference;", "Lcom/avito/android/user_adverts_views_util/position/SearchPositionView;", "invoke", "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class g extends N implements l<WeakReference<SearchPositionView>, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SearchPositionView f316766l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SearchPositionView searchPositionView) {
        super(1);
        this.f316766l = searchPositionView;
    }

    @Override // Y41.l
    public final Boolean invoke(WeakReference<SearchPositionView> weakReference) {
        WeakReference<SearchPositionView> weakReference2 = weakReference;
        return Boolean.valueOf(L.f(weakReference2.get(), this.f316766l) || weakReference2.get() == null);
    }
}
