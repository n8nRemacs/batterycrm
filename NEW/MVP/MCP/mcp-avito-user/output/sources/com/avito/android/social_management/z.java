package com.avito.android.social_management;

import com.avito.android.social_management.adapter.SocialItem;
import com.avito.android.social_management.adapter.notification.j;
import gx0.C40747a;
import kotlin.Metadata;

/* compiled from: SocialManagementPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/social_management/adapter/notification/j;", "kotlin.jvm.PlatformType", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/social_management/adapter/notification/j;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class z<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f284727b;

    public z(t tVar) {
        this.f284727b = tVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.social_management.adapter.notification.j jVar = (com.avito.android.social_management.adapter.notification.j) obj;
        boolean z12 = jVar instanceof j.a;
        t tVar = this.f284727b;
        if (z12) {
            SocialItem.Notification notification = ((j.a) jVar).f284548a;
            tVar.getClass();
            tVar.f284712p.b(tVar.f284697a.c(notification.f284482c).q(tVar.f284707k.e()).v(new GL.a(18, tVar, notification), G.f284440b));
            return;
        }
        if (jVar instanceof j.b) {
            j.b bVar = (j.b) jVar;
            if (kotlin.jvm.internal.L.f(bVar.f284549a.f284484e, "esia-id")) {
                tVar.f284706j.c(new C40747a());
            }
            SocialManagementActivity socialManagementActivity = tVar.f284711o;
            if (socialManagementActivity != null) {
                socialManagementActivity.f(bVar.f284550b);
            }
        }
    }
}
