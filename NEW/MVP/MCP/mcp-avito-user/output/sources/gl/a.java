package GL;

import android.content.Intent;
import androidx.compose.runtime.C22026a;
import androidx.room.O0;
import com.avito.android.advert.item.W0;
import com.avito.android.advert.item.service_order_request.o;
import com.avito.android.advertising.CommercialBanner;
import com.avito.android.advertising.loaders.h;
import com.avito.android.advertising.loaders.p;
import com.avito.android.analytics.statsd.y;
import com.avito.android.authorization.deep_linking.AuthResultLink;
import com.avito.android.authorization.deep_linking.C28649c;
import com.avito.android.bxcontent.C29253t0;
import com.avito.android.clientEventBus.useCase.l;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.evidence_request.details.h;
import com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_enable.IacEnableDeeplink;
import com.avito.android.inline_filters.z;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.messenger.conversation.mvi.data.d0;
import com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.m;
import com.avito.android.messenger.util.i;
import com.avito.android.onboarding_manager.OnboardingType;
import com.avito.android.persistence.messenger.F0;
import com.avito.android.persistence.messenger.MessengerDatabase_Impl;
import com.avito.android.photo_cache.q;
import com.avito.android.remote.model.AuthResult;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.social_management.adapter.SocialItem;
import com.avito.android.social_management.t;
import com.avito.android.util.V2;
import com.avito.android.ux.feedback.link.UxFeedbackStartCampaignLink;
import i91.C41256a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.H;
import l41.InterfaceC43543a;
import ru.avito.component.serp.PhoneLoadingState;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class a implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6452c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6453d;

    public /* synthetic */ a(int i12, Object obj, Object obj2) {
        this.f6451b = i12;
        this.f6452c = obj;
        this.f6453d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [com.avito.android.shortcut_navigation_bar.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [Y41.l, kotlin.jvm.internal.H] */
    @Override // l41.InterfaceC43543a
    public final void run() {
        int i12 = -1;
        int i13 = 0;
        switch (this.f6451b) {
            case 0:
                IacEnableDeeplink iacEnableDeeplink = (IacEnableDeeplink) this.f6453d;
                String[] strArr = {"calls", "iac_enable", "{{%app_ver%}}", "true", iacEnableDeeplink.f168395b};
                b bVar = (b) this.f6452c;
                bVar.f6456h.c(new y.a(bVar.f6455g.a(strArr).f91030a, 1L));
                DeepLink deepLink = iacEnableDeeplink.f168396c;
                if (deepLink == null) {
                    bVar.j(IacEnableDeeplink.b.d.f168399b);
                    return;
                } else {
                    bVar.i(IacEnableDeeplink.b.c.f168398b, bVar.f6454f, deepLink);
                    return;
                }
            case 1:
                JY.e eVar = (JY.e) this.f6452c;
                Y81.a aVar = (Y81.a) this.f6453d;
                synchronized (eVar.f9031b) {
                    try {
                        if (!aVar.equals(eVar.f9032c)) {
                            try {
                                eVar.f9030a.putLong("messenger.timeToModifyMessage", aVar.f19367a);
                            } catch (Exception e12) {
                                V2.f318762a.j("PersistentMessengerConfigStorage", "Failed to save config to preferences", e12);
                            }
                            eVar.f9032c = aVar;
                        }
                        G0 g02 = G0.f406611a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 2:
                W0 w02 = ((o) this.f6452c).f79930j;
                if (w02 != null) {
                    w02.s((UxFeedbackStartCampaignLink) this.f6453d);
                    return;
                }
                return;
            case 3:
                ((h) this.f6452c).f88386b.remove((String) this.f6453d);
                return;
            case 4:
                ((p) this.f6452c).f88444o.remove(((CommercialBanner) this.f6453d).f86885b);
                return;
            case 5:
                int i14 = com.avito.android.async_phone.public_module.loading_helper.a.f92237c;
                ((H) this.f6452c).invoke(PhoneLoadingState.f430441b);
                ((Y41.a) this.f6453d).invoke();
                return;
            case 6:
                C28649c c28649c = (C28649c) this.f6452c;
                Intent intentPutExtra = c28649c.f93757j.e(null, null).putExtra("result", -1);
                intentPutExtra.setFlags(603979776);
                c28649c.f93758k.R(intentPutExtra, com.avito.android.deeplink_handler.view.b.f134588l);
                AuthResult authResult = (AuthResult) this.f6453d;
                String message = authResult.getMessage();
                if (message != null) {
                    a.i.C4057a.e(c28649c.f93755h, message, f.a.f125253a, 2750, ToastBarPosition.f181046d, 910);
                    G0 g03 = G0.f406611a;
                }
                DeepLink postAuthAction = authResult.getPostAuthAction();
                if (postAuthAction == null) {
                    c28649c.j(AuthResultLink.b.C2776b.f93664b);
                    return;
                } else {
                    c28649c.i(AuthResultLink.b.c.f93665b, c28649c.f93754g, postAuthAction);
                    return;
                }
            case 7:
                b.a.a(((C29253t0) this.f6452c).f112967m, (UxFeedbackStartCampaignLink) this.f6453d, null, null, 6);
                return;
            case 8:
                ((com.avito.android.clientEventBus.useCase.c) this.f6452c).f118572b.c(Collections.singletonList((mx0.e) this.f6453d));
                return;
            case 9:
                ((l) this.f6452c).f118589b.a((List) this.f6453d);
                return;
            case 10:
                com.avito.android.evidence_request.details.h hVar = (com.avito.android.evidence_request.details.h) this.f6452c;
                Iterator<? extends ParameterSlot> it = hVar.f148505U.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next() instanceof PhotoParameter) {
                            i12 = i13;
                        } else {
                            i13++;
                        }
                    }
                }
                hVar.f148509Y.setValue(new h.c.f(i12, ((q) this.f6453d) instanceof q.d));
                return;
            case 11:
                ?? r02 = ((z) this.f6452c).f172384A;
                if (r02 != 0) {
                    OnboardingType onboardingType = OnboardingType.f209409b;
                    r02.Ml((NavigationBarStyle.DisplayType.SearchWithActionTitle.Onboarding) this.f6453d);
                    return;
                }
                return;
            case 12:
                List list = (List) this.f6453d;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                Iterator it2 = list.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    d0 d0Var = (d0) this.f6452c;
                    if (!zHasNext) {
                        d0Var.f190454a.x(arrayList);
                        return;
                    } else {
                        arrayList.add(d0Var.f190458e.a((LocalMessage) it2.next()));
                    }
                }
            case 13:
                MessageBody.LocalImage localImage = (MessageBody.LocalImage) this.f6453d;
                String strValueOf = String.valueOf(localImage.getUploadId());
                m mVar = (m) this.f6452c;
                mVar.f191661b.b(strValueOf);
                mVar.f191662c.b(localImage.getSource());
                return;
            case 14:
                V2 v22 = V2.f318762a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[" + Thread.currentThread().getName() + ']');
                sb2.append(" Loading of incomplete bodies finished (");
                sb2.append((String) this.f6452c);
                sb2.append(", $");
                v22.i("IncompleteMessageBodyLoader", C22026a.c(sb2, i.b((MessengerUserHashInfo) this.f6453d, new Q[0]), ')'), null);
                return;
            case 15:
                com.avito.android.mvi.rx3.locks.c cVar = (com.avito.android.mvi.rx3.locks.c) this.f6453d;
                com.avito.android.mvi.rx3.locks.legacy.a aVar2 = (com.avito.android.mvi.rx3.locks.legacy.a) this.f6452c;
                aVar2.f207090j.execute(new com.avito.android.mvi.rx3.locks.legacy.d(aVar2, cVar));
                return;
            case 16:
                F0 f02 = (F0) this.f6452c;
                String str = (String) this.f6453d;
                MessengerDatabase_Impl messengerDatabase_Impl = f02.f215168a;
                messengerDatabase_Impl.c();
                try {
                    messengerDatabase_Impl.b();
                    O0 o02 = f02.f215175h;
                    Z1.i iVarA = o02.a();
                    iVarA.h4(1, str);
                    try {
                        messengerDatabase_Impl.c();
                        try {
                            iVarA.B3();
                            messengerDatabase_Impl.s();
                            o02.c(iVarA);
                            messengerDatabase_Impl.b();
                            O0 o03 = f02.f215174g;
                            Z1.i iVarA2 = o03.a();
                            iVarA2.h4(1, str);
                            try {
                                messengerDatabase_Impl.c();
                                try {
                                    iVarA2.B3();
                                    messengerDatabase_Impl.s();
                                    o03.c(iVarA2);
                                    messengerDatabase_Impl.b();
                                    O0 o04 = f02.f215173f;
                                    Z1.i iVarA3 = o04.a();
                                    iVarA3.h4(1, str);
                                    try {
                                        messengerDatabase_Impl.c();
                                        try {
                                            iVarA3.B3();
                                            messengerDatabase_Impl.s();
                                            o04.c(iVarA3);
                                            messengerDatabase_Impl.b();
                                            O0 o05 = f02.f215172e;
                                            Z1.i iVarA4 = o05.a();
                                            iVarA4.h4(1, str);
                                            try {
                                                messengerDatabase_Impl.c();
                                                try {
                                                    iVarA4.B3();
                                                    messengerDatabase_Impl.s();
                                                    o05.c(iVarA4);
                                                    messengerDatabase_Impl.b();
                                                    O0 o06 = f02.f215171d;
                                                    Z1.i iVarA5 = o06.a();
                                                    iVarA5.h4(1, str);
                                                    try {
                                                        messengerDatabase_Impl.c();
                                                        try {
                                                            iVarA5.B3();
                                                            messengerDatabase_Impl.s();
                                                            o06.c(iVarA5);
                                                            messengerDatabase_Impl.b();
                                                            O0 o07 = f02.f215170c;
                                                            Z1.i iVarA6 = o07.a();
                                                            iVarA6.h4(1, str);
                                                            try {
                                                                messengerDatabase_Impl.c();
                                                                try {
                                                                    iVarA6.B3();
                                                                    messengerDatabase_Impl.s();
                                                                    o07.c(iVarA6);
                                                                    messengerDatabase_Impl.b();
                                                                    O0 o08 = f02.f215176i;
                                                                    Z1.i iVarA7 = o08.a();
                                                                    iVarA7.h4(1, str);
                                                                    try {
                                                                        messengerDatabase_Impl.c();
                                                                        try {
                                                                            iVarA7.B3();
                                                                            messengerDatabase_Impl.s();
                                                                            o08.c(iVarA7);
                                                                            messengerDatabase_Impl.b();
                                                                            O0 o09 = f02.f215169b;
                                                                            Z1.i iVarA8 = o09.a();
                                                                            iVarA8.h4(1, str);
                                                                            try {
                                                                                messengerDatabase_Impl.c();
                                                                                try {
                                                                                    iVarA8.B3();
                                                                                    messengerDatabase_Impl.s();
                                                                                    messengerDatabase_Impl.l();
                                                                                    o09.c(iVarA8);
                                                                                    messengerDatabase_Impl.s();
                                                                                    return;
                                                                                } finally {
                                                                                }
                                                                            } catch (Throwable th3) {
                                                                                o09.c(iVarA8);
                                                                                throw th3;
                                                                            }
                                                                        } finally {
                                                                        }
                                                                    } catch (Throwable th4) {
                                                                        o08.c(iVarA7);
                                                                        throw th4;
                                                                    }
                                                                } finally {
                                                                }
                                                            } catch (Throwable th5) {
                                                                o07.c(iVarA6);
                                                                throw th5;
                                                            }
                                                        } finally {
                                                        }
                                                    } catch (Throwable th6) {
                                                        o06.c(iVarA5);
                                                        throw th6;
                                                    }
                                                } finally {
                                                }
                                            } catch (Throwable th7) {
                                                o05.c(iVarA4);
                                                throw th7;
                                            }
                                        } finally {
                                        }
                                    } catch (Throwable th8) {
                                        o04.c(iVarA3);
                                        throw th8;
                                    }
                                } finally {
                                }
                            } catch (Throwable th9) {
                                o03.c(iVarA2);
                                throw th9;
                            }
                        } finally {
                        }
                    } catch (Throwable th10) {
                        o02.c(iVarA);
                        throw th10;
                    }
                } finally {
                }
            case 17:
                ((com.avito.android.photo_cache.c) this.f6452c).f216313b.unregisterContentObserver((com.avito.android.photo_cache.e) this.f6453d);
                return;
            case 18:
                t tVar = (t) this.f6452c;
                List<? extends SocialItem> list2 = tVar.f284714r;
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList(list2);
                    arrayList2.remove(arrayList2.indexOf((SocialItem.Notification) this.f6453d));
                    tVar.f284714r = arrayList2;
                    com.avito.konveyor.util.a.a(tVar.f284700d, arrayList2);
                    return;
                }
                return;
            default:
                C41256a c41256a = (C41256a) this.f6452c;
                Y81.a aVar3 = (Y81.a) this.f6453d;
                synchronized (c41256a.f398407a) {
                    c41256a.f398408b = aVar3;
                    G0 g04 = G0.f406611a;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a(Y41.a aVar, Y41.l lVar) {
        this.f6451b = 5;
        this.f6452c = (H) lVar;
        this.f6453d = aVar;
    }
}
