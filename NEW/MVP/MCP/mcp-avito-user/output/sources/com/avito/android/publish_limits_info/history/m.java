package com.avito.android.publish_limits_info.history;

import androidx.compose.foundation.H;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.publish_limits_info.ItemId;
import com.avito.android.publish_limits_info.history.tab.HistoryTabItem;
import com.avito.android.remote.model.AdvertHistoryInfo;
import com.avito.android.remote.model.AdvertsHistory;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.P2;
import com.avito.android.util.T2;
import com.avito.android.util.V2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PublishLimitsHistoryViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish_limits_info/history/m;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/publish_limits_info/history/tab/d;", "a", "_avito_publish-limits-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m extends M0 implements com.avito.android.publish_limits_info.history.tab.d {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final ItemId f245853E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final g f245854J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f245855K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f245856L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish_limits_info.history.tab.a f245857M;

    /* renamed from: O, reason: collision with root package name */
    public AdvertsHistory f245859O;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f245858N = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<a>> f245860P = new C23038g0<>();

    /* compiled from: PublishLimitsHistoryViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish_limits_info/history/m$a;", "", "_avito_publish-limits-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f245861a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AttributedText f245862b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ArrayList f245863c;

        public a(@Y61.k AttributedText attributedText, @Y61.k String str, @Y61.k ArrayList arrayList) {
            this.f245861a = str;
            this.f245862b = attributedText;
            this.f245863c = arrayList;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f245861a, aVar.f245861a) && this.f245862b.equals(aVar.f245862b) && this.f245863c.equals(aVar.f245863c);
        }

        public final int hashCode() {
            return this.f245863c.hashCode() + com.avito.android.actions_sheet.a.b(this.f245861a.hashCode() * 31, 31, this.f245862b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("State(title=");
            sb2.append(this.f245861a);
            sb2.append(", description=");
            sb2.append(this.f245862b);
            sb2.append(", tabs=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f245863c, ')');
        }
    }

    /* compiled from: PublishLimitsHistoryViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/AdvertsHistory;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            AttributedText attributedText;
            P2<a> bVar = (P2) obj;
            AdvertsHistory advertsHistory = (AdvertsHistory) T2.a(bVar);
            final m mVar = m.this;
            if (advertsHistory != null) {
                mVar.f245859O = advertsHistory;
            }
            C23038g0<P2<a>> c23038g0 = mVar.f245860P;
            if (bVar instanceof P2.b) {
                AdvertsHistory advertsHistory2 = (AdvertsHistory) ((P2.b) bVar).f318720a;
                Iterator<T> it = advertsHistory2.getTabs().iterator();
                while (true) {
                    if (it.hasNext()) {
                        attributedText = ((AdvertsHistory.Tab) it.next()).getExtra();
                        if (attributedText != null) {
                            break;
                        }
                    } else {
                        attributedText = null;
                        break;
                    }
                }
                String description = advertsHistory2.getDescription();
                if (description.length() == 0 && attributedText != null) {
                    final int i12 = 0;
                    attributedText.setOnDeepLinkClickListener(new w() { // from class: com.avito.android.publish_limits_info.history.l
                        @Override // com.avito.android.deep_linking.links.w
                        public final void i7(DeepLink deepLink) {
                            switch (i12) {
                                case 0:
                                    mVar.f245857M.s1(deepLink);
                                    break;
                                default:
                                    mVar.f245857M.s1(deepLink);
                                    break;
                            }
                        }
                    });
                } else if (attributedText != null) {
                    String str = "{{extra_link}}" + attributedText.getText();
                    List<Attribute> attributes = attributedText.getAttributes();
                    StringBuilder sbR = H.r(description);
                    sbR.append(System.lineSeparator());
                    AttributedText attributedText2 = new AttributedText(str, C42745f0.h0(Collections.singletonList(new FontAttribute("extra_link", sbR.toString(), Collections.singletonList(new FontParameter.ParagraphSpacingParameter(8.0f)))), attributes), 1);
                    final int i13 = 1;
                    attributedText2.setOnDeepLinkClickListener(new w() { // from class: com.avito.android.publish_limits_info.history.l
                        @Override // com.avito.android.deep_linking.links.w
                        public final void i7(DeepLink deepLink) {
                            switch (i13) {
                                case 0:
                                    mVar.f245857M.s1(deepLink);
                                    break;
                                default:
                                    mVar.f245857M.s1(deepLink);
                                    break;
                            }
                        }
                    });
                    attributedText = attributedText2;
                } else {
                    attributedText = new AttributedText("{{description}}", Collections.singletonList(new FontAttribute("description", description, Collections.singletonList(new FontParameter.ParagraphSpacingParameter(8.0f)))), 1);
                }
                String title = advertsHistory2.getTitle();
                List<AdvertsHistory.Tab> tabs = advertsHistory2.getTabs();
                ArrayList arrayList = new ArrayList(C42745f0.q(tabs, 10));
                for (AdvertsHistory.Tab tab : tabs) {
                    arrayList.add(new HistoryTabItem(tab.getTitle(), tab.getTitle(), tab.getCount()));
                }
                bVar = new P2.b(new a(attributedText, title, arrayList));
            } else if (!(bVar instanceof P2.a) && !(bVar instanceof P2.c)) {
                throw new NoWhenBranchMatchedException();
            }
            c23038g0.setValue(bVar);
        }
    }

    /* compiled from: PublishLimitsHistoryViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f245865b = new c<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("PublishLimitsHistory", "Can't get history", (Throwable) obj);
        }
    }

    public m(@Y61.k ItemId itemId, @Y61.k g gVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k com.avito.android.publish_limits_info.history.tab.a aVar) {
        this.f245853E = itemId;
        this.f245854J = gVar;
        this.f245855K = interfaceC35745a5;
        this.f245856L = interfaceC35863o4;
        this.f245857M = aVar;
        ke();
    }

    @Override // com.avito.android.publish_limits_info.history.tab.d
    @Y61.k
    public final ArrayList gc(@Y61.k String str) {
        Object next;
        AdvertsHistory advertsHistory = this.f245859O;
        if (advertsHistory == null) {
            advertsHistory = null;
        }
        Iterator<T> it = advertsHistory.getTabs().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((AdvertsHistory.Tab) next).getTitle(), str)) {
                break;
            }
        }
        AdvertsHistory.Tab tab = (AdvertsHistory.Tab) next;
        List<AdvertHistoryInfo> items = tab.getItems();
        ArrayList arrayList = new ArrayList(C42745f0.q(items, 10));
        for (AdvertHistoryInfo advertHistoryInfo : items) {
            arrayList.add(new com.avito.android.publish_limits_info.history.tab.advert.a(this.f245856L.a(), advertHistoryInfo.getTitle(), advertHistoryInfo.getPrice(), advertHistoryInfo.getHint(), advertHistoryInfo.getImage(), advertHistoryInfo.getAutoPublish(), advertHistoryInfo.getSellerName()));
        }
        String description = tab.getDescription();
        return C42745f0.h0(C42745f0.V(description != null ? new com.avito.android.publish_limits_info.history.tab.info.a(description) : null), arrayList);
    }

    public final void ke() {
        this.f245858N.b(this.f245854J.a(this.f245853E).j0(this.f245855K.e()).v0(new b(), c.f245865b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        this.f245858N.e();
    }
}
