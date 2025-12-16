package Hq0;

import Jd0.C14188a;
import android.net.Uri;
import cW0.InterfaceC27112a;
import com.avito.android.advert.C28245z;
import com.avito.android.advert.item.creditinfo.buzzoola.i;
import com.avito.android.advertising.loaders.avito_targeting.t;
import com.avito.android.advertising.loaders.buzzoola.l;
import com.avito.android.beduin.common.component.photo_picker.BeduinPhotoPickerModel;
import com.avito.android.comparison.remote.model.ComparisonResponse;
import com.avito.android.favorites.C30700w;
import com.avito.android.favorites.FavoritesSpace;
import com.avito.android.inline_filters.C31052l;
import com.avito.android.messenger.channels.mvi.sync.C31864v;
import com.avito.android.messenger.channels.mvi.sync.InterfaceC31860t;
import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import com.avito.android.messenger.conversation.mvi.sync.K;
import com.avito.android.remote.E;
import com.avito.android.remote.V0;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.advertising.BuzzoolaNetworkBannerItem;
import com.avito.android.remote.model.advertising.CreativeNetworkBannerItem;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.common.order_one_click.n;
import com.avito.android.util.A4;
import com.avito.android.util.rx3.g1;
import fW0.p;
import io.reactivex.rxjava3.core.z;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.collections.b1;
import kotlin.text.C43066x;
import l41.s;
import t80.InterfaceC48515a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: Hq0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C14020b implements s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7749b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7750c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7751d;

    public /* synthetic */ C14020b(int i12, Object obj, Object obj2) {
        this.f7749b = i12;
        this.f7751d = obj;
        this.f7750c = obj2;
    }

    @Override // l41.s
    public final Object get() throws t {
        Object obj = this.f7750c;
        Object obj2 = this.f7751d;
        switch (this.f7749b) {
            case 0:
                return ((C14022d) obj2).f7757a.get().a((String) obj);
            case 1:
                return ((C28245z) obj2).f81103v.a((String) obj);
            case 2:
                return ((i) obj2).f74951b.get().g(((AdvertDetails) obj).getId());
            case 3:
                CreativeNetworkBannerItem creativeNetworkBannerItem = (CreativeNetworkBannerItem) obj;
                Map<String, Object> params = creativeNetworkBannerItem.getParams();
                if (params == null) {
                    params = P0.c();
                }
                String creativeId = creativeNetworkBannerItem.getCreativeId();
                if (creativeId != null) {
                    return ((com.avito.android.advertising.loaders.avito_targeting.i) obj2).f88035a.get().a(creativeId, params);
                }
                throw new t();
            case 4:
                l lVar = (l) obj2;
                return lVar.f88322a.get().a(lVar.f88324c.b(((BuzzoolaNetworkBannerItem) obj).getParams()));
            case 5:
                com.avito.android.beduin.common.component.photo_picker.data.a aVar = ((com.avito.android.beduin.common.component.photo_picker.data.d) obj2).f101963b.get();
                BeduinPhotoPickerModel.ImageDeleteParams imageDeleteParams = (BeduinPhotoPickerModel.ImageDeleteParams) obj;
                String strU = C43066x.U("api/", imageDeleteParams.getPath());
                Map<String, Object> mapD = imageDeleteParams.d();
                if (mapD == null) {
                    mapD = P0.c();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(mapD.size()));
                Iterator<T> it = mapD.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                }
                return aVar.b(strU, linkedHashMap);
            case 6:
                return ((com.avito.android.clientEventBus.useCase.l) obj2).f118588a.a((List) obj);
            case 7:
                Object obj3 = ((com.avito.android.comparison.data.b) obj2).f123832b.get((String) obj);
                if (obj3 != null) {
                    return z.c0(new TypedResult.Success((ComparisonResponse) obj3));
                }
                throw new IllegalArgumentException("Required value was null.");
            case 8:
                com.avito.android.computer_vision.c cVar = (com.avito.android.computer_vision.c) obj2;
                C14188a c14188a = cVar.f125445a;
                int i12 = Jd0.b.f9071a;
                InterfaceC48515a interfaceC48515a = (InterfaceC48515a) c14188a.f9070b;
                A4.f318516a.getClass();
                return interfaceC48515a.b(A4.g("images", (Set) obj), cVar.f125449e.b());
            case 9:
                return ((C30700w) obj2).f157567c.c(((Uri) obj).toString());
            case 10:
                C31052l c31052l = (C31052l) obj2;
                int iOrdinal = c31052l.f172308d.ordinal();
                Map<String, String> map = (Map) obj;
                h31.e<V0> eVar = c31052l.f172305a;
                if (iOrdinal == 0) {
                    return eVar.get().t(map);
                }
                if (iOrdinal == 1) {
                    return eVar.get().k(map);
                }
                if (iOrdinal == 2) {
                    return eVar.get().k(map);
                }
                throw new NoWhenBranchMatchedException();
            case 11:
                return ((com.avito.android.libs.saved_searches.domain.t) obj2).f181477a.get().e((String) obj);
            case 12:
                return ((com.avito.android.libs.saved_searches.domain.t) obj2).f181477a.get().h(((FavoritesSpace) obj).f156271d);
            case 13:
                InterfaceC31860t.a aVar2 = (InterfaceC31860t.a) obj2;
                return new InterfaceC31860t.a(aVar2.f188565b - 1, b1.i(aVar2.f188564a, ((C31864v.b) obj).f188575d));
            case 14:
                return SendMessagePresenter.State.a((SendMessagePresenter.State) obj2, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, new SendMessagePresenter.VoiceRecorderState.ReachedMaxDuration((File) obj, 300L), false, null, null, Integer.MAX_VALUE, 7);
            case 15:
                return new K.c(((List) obj).size(), ((AtomicBoolean) obj2).get());
            case 16:
                return ((com.avito.android.recall_me_core.c) obj2).f252042a.get().d((String) obj);
            case 17:
                E e12 = ((n) obj2).f256961a.get();
                Map<String, String> mapC = (Map) obj;
                if (mapC == null) {
                    mapC = P0.c();
                }
                return g1.a(e12.e(mapC));
            case 18:
                return ((com.avito.android.service_booking_common.link.referral.b) obj2).f276655a.get().c((String) obj);
            case 19:
                InterfaceC27112a interfaceC27112a = ((com.avito.android.user_stats.c) obj2).f316955a.get();
                A4 a42 = A4.f318516a;
                List list = (List) obj;
                if (list == null) {
                    list = C42784z0.f406748b;
                }
                a42.getClass();
                return interfaceC27112a.c(A4.f("itemIDs", list));
            default:
                InterfaceC27112a interfaceC27112a2 = ((com.avito.android.user_stats.c) obj2).f316955a.get();
                p pVar = (p) obj;
                String from = pVar.getFrom();
                String to2 = pVar.getTo();
                A4 a43 = A4.f318516a;
                List<String> listA = pVar.a();
                if (listA == null) {
                    listA = C42784z0.f406748b;
                }
                a43.getClass();
                HashMap mapF = A4.f("categories", listA);
                List<String> listB = pVar.b();
                if (listB == null) {
                    listB = C42784z0.f406748b;
                }
                HashMap mapF2 = A4.f("employees", listB);
                List<String> listF = pVar.f();
                if (listF == null) {
                    listF = C42784z0.f406748b;
                }
                HashMap mapF3 = A4.f("locations", listF);
                List<String> listH = pVar.h();
                if (listH == null) {
                    listH = C42784z0.f406748b;
                }
                HashMap mapF4 = A4.f("spaces", listH);
                String group = pVar.getGroup();
                List<String> listE = pVar.e();
                if (listE == null) {
                    listE = C42784z0.f406748b;
                }
                return interfaceC27112a2.e(from, to2, mapF, mapF2, mapF3, mapF4, group, A4.f("itemIDs", listE));
        }
    }
}
