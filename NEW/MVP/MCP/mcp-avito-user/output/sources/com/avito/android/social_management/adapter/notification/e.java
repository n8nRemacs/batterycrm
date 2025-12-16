package com.avito.android.social_management.adapter.notification;

import com.avito.android.social_management.adapter.SocialItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NotificationItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SocialItem.Notification f284539l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f284540m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SocialItem.Notification notification, h hVar) {
        super(0);
        this.f284539l = notification;
        this.f284540m = hVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f284539l.f284483d.setOnDeepLinkClickListener(null);
        this.f284540m.d(null);
        return G0.f406611a;
    }
}
