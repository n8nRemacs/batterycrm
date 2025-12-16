package com.avito.android.social_management;

import ae.C19875c;
import com.avito.android.social_management.adapter.SocialItem;
import kotlin.Metadata;

/* compiled from: SocialManagementPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/social_management/adapter/SocialItem;", "kotlin.jvm.PlatformType", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/social_management/adapter/SocialItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class y<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f284726b;

    public y(t tVar) {
        this.f284726b = tVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        SocialItem socialItem = (SocialItem) obj;
        boolean z12 = socialItem instanceof SocialItem.Connected;
        t tVar = this.f284726b;
        if (z12) {
            io.reactivex.rxjava3.disposables.c cVar = tVar.f284713q;
            M m12 = tVar.f284705i;
            cVar.b(tVar.f284704h.e(null, m12.g(), m12.j(), m12.f(), true).m(new x(tVar, socialItem)));
            return;
        }
        if (!(socialItem instanceof SocialItem.Available)) {
            if (!(socialItem instanceof SocialItem.VkGroupItem)) {
                if (socialItem instanceof SocialItem.Header) {
                    return;
                }
                boolean z13 = socialItem instanceof SocialItem.Notification;
                return;
            } else {
                SocialManagementActivity socialManagementActivity = tVar.f284711o;
                if (socialManagementActivity != null) {
                    socialManagementActivity.f(((SocialItem.VkGroupItem) socialItem).f284489f.f284491c);
                    return;
                }
                return;
            }
        }
        SocialItem.Available available = (SocialItem.Available) socialItem;
        tVar.f284706j.c(new C19875c("profile", available.f284476c.getType()));
        SocialManagementActivity socialManagementActivity2 = tVar.f284711o;
        if (socialManagementActivity2 != null) {
            String type = available.f284476c.getType();
            l90.o oVar = socialManagementActivity2.f284467m;
            if (oVar == null) {
                oVar = null;
            }
            socialManagementActivity2.startActivityForResult(oVar.a(type), 1);
        }
    }
}
