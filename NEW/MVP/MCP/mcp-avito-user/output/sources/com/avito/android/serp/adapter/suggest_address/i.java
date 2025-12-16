package com.avito.android.serp.adapter.suggest_address;

import androidx.compose.runtime.internal.P;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: AddAddressItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/suggest_address/i;", "Lcom/avito/android/serp/adapter/suggest_address/h;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d f272396b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f272397c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f272398d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AK0.l f272399e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f272400f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f272401g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final e2 f272402h = f2.b(0, 1, BufferOverflow.f410778c, 1);

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f272403i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: AddAddressItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/avito/android/serp/adapter/suggest_address/i$a;", "", "<init>", "()V", "", "AUTHORIZE_REQUEST_CODE", "Ljava/lang/String;", "FROM_SERP_PAGE", "KEY_PREFERENCES_IS_SUGGEST_DISABLED", "", "LIMIT_OF_ADDRESSES_TO_ADD", "I", CredentialProviderBaseController.TYPE_TAG, "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public i(@Y61.k d dVar, @Y61.k E e12, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k AK0.l lVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar) {
        this.f272396b = dVar;
        this.f272397c = e12;
        this.f272398d = aVar;
        this.f272399e = lVar;
        this.f272400f = interfaceC28373a;
        this.f272401g = gVar;
    }

    public static final void O(i iVar) {
        iVar.f272399e.putBoolean("KEY_PREFERENCES_IS_SUGGEST_DISABLED", true);
        iVar.f272402h.K5(G0.f406611a);
    }

    public static final void k(i iVar, String str, q qVar, AddAddressSuggestItem addAddressSuggestItem) {
        I0 i0A = iVar.f272396b.a(str);
        n nVar = new n(iVar, addAddressSuggestItem, qVar);
        final V2 v22 = V2.f318762a;
        iVar.f272403i.b(i0A.v0(nVar, new l41.g() { // from class: com.avito.android.serp.adapter.suggest_address.o
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        q qVar = (q) eVar;
        AddAddressSuggestItem addAddressSuggestItem = (AddAddressSuggestItem) aVar;
        qVar.setTitle(addAddressSuggestItem.f272375e);
        qVar.P2(addAddressSuggestItem.f272376f);
        qVar.jW(addAddressSuggestItem);
        DeepLink deepLink = addAddressSuggestItem.f272377g.getDeepLink();
        String str = deepLink instanceof UserAddressLink.Suggest ? ((UserAddressLink.Suggest) deepLink).f133829b : deepLink instanceof UserAddressLink.Map ? ((UserAddressLink.Map) deepLink).f133786b : deepLink instanceof UserAddressLink.List ? ((UserAddressLink.List) deepLink).f133782b : null;
        this.f272403i.b(this.f272398d.V9().t0(new j(this, str, qVar, addAddressSuggestItem)));
        qVar.h7(new k(this, i12, addAddressSuggestItem, str, qVar));
        qVar.B7(new l(this));
        this.f272400f.c(new Lr0.b(String.valueOf(addAddressSuggestItem.f272372b), String.valueOf(addAddressSuggestItem.f272373c), String.valueOf(addAddressSuggestItem.f272374d), str, this.f272397c.a(), "serp", "add_new", null));
        qVar.dB(new m(this));
    }

    @Override // com.avito.android.serp.adapter.suggest_address.h
    @Y61.k
    /* renamed from: d2, reason: from getter */
    public final e2 getF272402h() {
        return this.f272402h;
    }
}
