package com.avito.android.advert_details_items.neighboring_dates;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.A;
import com.avito.android.advert_details_items.neighboring_dates.AdvertDetailsNeighboringDatesItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import ra.InterfaceC47622a;

/* compiled from: AdvertDetailsNeighboringDatesPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/c;", "LTV0/d;", "Lcom/avito/android/advert_details_items/neighboring_dates/g;", "Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem;", "a", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements TV0.d<g, AdvertDetailsNeighboringDatesItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert_details_items.neighboring_dates.tools.d f84895b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.advert_details_items.neighboring_dates.tools.b f84896c;

    /* compiled from: AdvertDetailsNeighboringDatesPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/c$a;", "", "<init>", "()V", "", "CHANGE_DATES_REQUEST_KEY", "Ljava/lang/String;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AdvertDetailsNeighboringDatesPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "context", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<String, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            c.this.f84895b.L(str);
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public c(@InterfaceC47622a @k A a12, @k com.avito.android.advert_details_items.neighboring_dates.tools.d dVar, @k com.avito.android.advert_details_items.neighboring_dates.tools.e eVar) {
        this.f84895b = dVar;
        this.f84896c = new com.avito.android.advert_details_items.neighboring_dates.tools.b(a12, eVar, new b());
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        AdvertDetailsNeighboringDatesItem advertDetailsNeighboringDatesItem = (AdvertDetailsNeighboringDatesItem) aVar;
        AdvertDetailsNeighboringDatesItem.State state = advertDetailsNeighboringDatesItem.f84871f;
        if (state instanceof AdvertDetailsNeighboringDatesItem.State.Loading) {
            gVar.ty(true);
            return;
        }
        if (state instanceof AdvertDetailsNeighboringDatesItem.State.Hide) {
            gVar.UG();
            return;
        }
        if (state instanceof AdvertDetailsNeighboringDatesItem.State.Content) {
            gVar.ty(false);
            AdvertDetailsNeighboringDatesItem.State.Content content = (AdvertDetailsNeighboringDatesItem.State.Content) state;
            gVar.A4(content.getF84881b());
            gVar.Hz(content.getF84882c(), new d(advertDetailsNeighboringDatesItem, this));
            gVar.nW(content);
            gVar.zY(this.f84896c);
            gVar.Ss(new e(this));
        }
    }
}
