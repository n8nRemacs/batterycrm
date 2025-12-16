package com.avito.android.campaigns_sale.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.campaigns_sale.mvi.entity.a;
import com.avito.android.campaigns_sale.network.remote.model.BonusInfo;
import com.avito.android.campaigns_sale.network.remote.model.HeaderTooltip;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.UniversalImage;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import gm.C40705b;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: CampaignsSaleState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleState;", "Lcom/avito/android/analytics/screens/mvi/q;", "AddBlockButtonState", "a", "b", "c", "FloatingButton", "d", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CampaignsSaleState extends q {

    /* renamed from: s, reason: collision with root package name */
    @k
    public static final a f114186s = new a(null);

    /* renamed from: t, reason: collision with root package name */
    @k
    public static final CampaignsSaleState f114187t = new CampaignsSaleState(null, null, null, null, null, null, false, null, false, null, null, null, null, false, false, null, null, 131071, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.campaigns_sale.mvi.entity.a f114188b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final b f114189c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final d f114190d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<C40705b> f114191e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final HeaderTooltip f114192f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final HeaderTooltip f114193g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f114194h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final FloatingButton f114195i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f114196j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f114197k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final AddBlockButtonState f114198l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final c f114199m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final BonusInfo f114200n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f114201o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f114202p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final String f114203q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f114204r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CampaignsSaleState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleState$AddBlockButtonState;", "", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AddBlockButtonState {

        /* renamed from: b, reason: collision with root package name */
        public static final AddBlockButtonState f114205b;

        /* renamed from: c, reason: collision with root package name */
        public static final AddBlockButtonState f114206c;

        /* renamed from: d, reason: collision with root package name */
        public static final AddBlockButtonState f114207d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ AddBlockButtonState[] f114208e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f114209f;

        static {
            AddBlockButtonState addBlockButtonState = new AddBlockButtonState("ENABLED", 0);
            f114205b = addBlockButtonState;
            AddBlockButtonState addBlockButtonState2 = new AddBlockButtonState("DISABLED", 1);
            f114206c = addBlockButtonState2;
            AddBlockButtonState addBlockButtonState3 = new AddBlockButtonState("HIDDEN", 2);
            f114207d = addBlockButtonState3;
            AddBlockButtonState[] addBlockButtonStateArr = {addBlockButtonState, addBlockButtonState2, addBlockButtonState3};
            f114208e = addBlockButtonStateArr;
            f114209f = kotlin.enums.c.a(addBlockButtonStateArr);
        }

        public AddBlockButtonState() {
            throw null;
        }

        public static AddBlockButtonState valueOf(String str) {
            return (AddBlockButtonState) Enum.valueOf(AddBlockButtonState.class, str);
        }

        public static AddBlockButtonState[] values() {
            return (AddBlockButtonState[]) f114208e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CampaignsSaleState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleState$FloatingButton;", "", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FloatingButton {

        /* renamed from: b, reason: collision with root package name */
        public static final FloatingButton f114210b;

        /* renamed from: c, reason: collision with root package name */
        public static final FloatingButton f114211c;

        /* renamed from: d, reason: collision with root package name */
        public static final FloatingButton f114212d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ FloatingButton[] f114213e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f114214f;

        static {
            FloatingButton floatingButton = new FloatingButton("ENTER_SALE_BUTTON", 0);
            f114210b = floatingButton;
            FloatingButton floatingButton2 = new FloatingButton("SAVE_SALE_BUTTON", 1);
            f114211c = floatingButton2;
            FloatingButton floatingButton3 = new FloatingButton("NO_BUTTON", 2);
            f114212d = floatingButton3;
            FloatingButton[] floatingButtonArr = {floatingButton, floatingButton2, floatingButton3};
            f114213e = floatingButtonArr;
            f114214f = kotlin.enums.c.a(floatingButtonArr);
        }

        public FloatingButton() {
            throw null;
        }

        public static FloatingButton valueOf(String str) {
            return (FloatingButton) Enum.valueOf(FloatingButton.class, str);
        }

        public static FloatingButton[] values() {
            return (FloatingButton[]) f114213e.clone();
        }
    }

    /* compiled from: CampaignsSaleState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleState$a;", "", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CampaignsSaleState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleState$b;", "", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f114215a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f114216b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f114217c;

        public b(PrintableText printableText, PrintableText printableText2, PrintableText printableText3, int i12, C42822w c42822w) {
            printableText2 = (i12 & 2) != 0 ? null : printableText2;
            printableText3 = (i12 & 4) != 0 ? com.avito.android.printable_text.b.c(R.string.campaigns_sale_refresh, new Serializable[0]) : printableText3;
            this.f114215a = printableText;
            this.f114216b = printableText2;
            this.f114217c = printableText3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f114215a, bVar.f114215a) && L.f(this.f114216b, bVar.f114216b) && L.f(this.f114217c, bVar.f114217c);
        }

        public final int hashCode() {
            int iHashCode = this.f114215a.hashCode() * 31;
            PrintableText printableText = this.f114216b;
            return this.f114217c.hashCode() + ((iHashCode + (printableText == null ? 0 : printableText.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentPlaceholderData(title=");
            sb2.append(this.f114215a);
            sb2.append(", subtitle=");
            sb2.append(this.f114216b);
            sb2.append(", buttonTitle=");
            return AK.c.m(sb2, this.f114217c, ')');
        }
    }

    /* compiled from: CampaignsSaleState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleState$c;", "", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Map<Long, Integer> f114218a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<Integer> f114219b;

        /* renamed from: c, reason: collision with root package name */
        public final int f114220c;

        /* renamed from: d, reason: collision with root package name */
        public final int f114221d;

        public c() {
            this(null, null, 0, 0, 15, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static c a(c cVar, LinkedHashMap linkedHashMap, List list, int i12, int i13, int i14) {
            Map map = linkedHashMap;
            if ((i14 & 1) != 0) {
                map = cVar.f114218a;
            }
            if ((i14 & 2) != 0) {
                list = cVar.f114219b;
            }
            if ((i14 & 4) != 0) {
                i12 = cVar.f114220c;
            }
            if ((i14 & 8) != 0) {
                i13 = cVar.f114221d;
            }
            cVar.getClass();
            return new c(map, list, i12, i13);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f114218a, cVar.f114218a) && L.f(this.f114219b, cVar.f114219b) && this.f114220c == cVar.f114220c && this.f114221d == cVar.f114221d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f114221d) + r.e(this.f114220c, H.e(this.f114218a.hashCode() * 31, 31, this.f114219b), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DiscountInfo(itemMinDiscountMap=");
            sb2.append(this.f114218a);
            sb2.append(", possibleDiscounts=");
            sb2.append(this.f114219b);
            sb2.append(", minDiscount=");
            sb2.append(this.f114220c);
            sb2.append(", maxDiscount=");
            return r.t(sb2, this.f114221d, ')');
        }

        public c(@k Map<Long, Integer> map, @k List<Integer> list, int i12, int i13) {
            this.f114218a = map;
            this.f114219b = list;
            this.f114220c = i12;
            this.f114221d = i13;
        }

        public c(Map map, List list, int i12, int i13, int i14, C42822w c42822w) {
            this((i14 & 1) != 0 ? P0.c() : map, (i14 & 2) != 0 ? C42784z0.f406748b : list, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 100 : i13);
        }
    }

    /* compiled from: CampaignsSaleState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleState$d;", "", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f114222a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f114223b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final UniversalImage f114224c;

        public d(@k String str, @k String str2, @k UniversalImage universalImage) {
            this.f114222a = str;
            this.f114223b = str2;
            this.f114224c = universalImage;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f114222a, dVar.f114222a) && L.f(this.f114223b, dVar.f114223b) && L.f(this.f114224c, dVar.f114224c);
        }

        public final int hashCode() {
            return this.f114224c.hashCode() + H.d(this.f114222a.hashCode() * 31, 31, this.f114223b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ItemsAmountExceededErrorData(title=");
            sb2.append(this.f114222a);
            sb2.append(", subtitle=");
            sb2.append(this.f114223b);
            sb2.append(", image=");
            return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f114224c, ')');
        }
    }

    public CampaignsSaleState() {
        this(null, null, null, null, null, null, false, null, false, null, null, null, null, false, false, null, null, 131071, null);
    }

    public static CampaignsSaleState a(CampaignsSaleState campaignsSaleState, com.avito.android.campaigns_sale.mvi.entity.a aVar, b bVar, d dVar, List list, HeaderTooltip headerTooltip, HeaderTooltip headerTooltip2, boolean z12, FloatingButton floatingButton, boolean z13, String str, AddBlockButtonState addBlockButtonState, c cVar, BonusInfo bonusInfo, boolean z14, boolean z15, String str2, List list2, int i12) {
        com.avito.android.campaigns_sale.mvi.entity.a aVar2 = (i12 & 1) != 0 ? campaignsSaleState.f114188b : aVar;
        b bVar2 = (i12 & 2) != 0 ? campaignsSaleState.f114189c : bVar;
        d dVar2 = (i12 & 4) != 0 ? campaignsSaleState.f114190d : dVar;
        List list3 = (i12 & 8) != 0 ? campaignsSaleState.f114191e : list;
        HeaderTooltip headerTooltip3 = (i12 & 16) != 0 ? campaignsSaleState.f114192f : headerTooltip;
        HeaderTooltip headerTooltip4 = (i12 & 32) != 0 ? campaignsSaleState.f114193g : headerTooltip2;
        boolean z16 = (i12 & 64) != 0 ? campaignsSaleState.f114194h : z12;
        FloatingButton floatingButton2 = (i12 & 128) != 0 ? campaignsSaleState.f114195i : floatingButton;
        boolean z17 = (i12 & 256) != 0 ? campaignsSaleState.f114196j : z13;
        String str3 = (i12 & 512) != 0 ? campaignsSaleState.f114197k : str;
        AddBlockButtonState addBlockButtonState2 = (i12 & 1024) != 0 ? campaignsSaleState.f114198l : addBlockButtonState;
        c cVar2 = (i12 & 2048) != 0 ? campaignsSaleState.f114199m : cVar;
        BonusInfo bonusInfo2 = (i12 & 4096) != 0 ? campaignsSaleState.f114200n : bonusInfo;
        boolean z18 = (i12 & 8192) != 0 ? campaignsSaleState.f114201o : z14;
        boolean z19 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? campaignsSaleState.f114202p : z15;
        String str4 = (i12 & 32768) != 0 ? campaignsSaleState.f114203q : str2;
        List list4 = (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? campaignsSaleState.f114204r : list2;
        campaignsSaleState.getClass();
        return new CampaignsSaleState(aVar2, bVar2, dVar2, list3, headerTooltip3, headerTooltip4, z16, floatingButton2, z17, str3, addBlockButtonState2, cVar2, bonusInfo2, z18, z19, str4, list4);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignsSaleState)) {
            return false;
        }
        CampaignsSaleState campaignsSaleState = (CampaignsSaleState) obj;
        return L.f(this.f114188b, campaignsSaleState.f114188b) && L.f(this.f114189c, campaignsSaleState.f114189c) && L.f(this.f114190d, campaignsSaleState.f114190d) && L.f(this.f114191e, campaignsSaleState.f114191e) && L.f(this.f114192f, campaignsSaleState.f114192f) && L.f(this.f114193g, campaignsSaleState.f114193g) && this.f114194h == campaignsSaleState.f114194h && this.f114195i == campaignsSaleState.f114195i && this.f114196j == campaignsSaleState.f114196j && L.f(this.f114197k, campaignsSaleState.f114197k) && this.f114198l == campaignsSaleState.f114198l && L.f(this.f114199m, campaignsSaleState.f114199m) && L.f(this.f114200n, campaignsSaleState.f114200n) && this.f114201o == campaignsSaleState.f114201o && this.f114202p == campaignsSaleState.f114202p && L.f(this.f114203q, campaignsSaleState.f114203q) && L.f(this.f114204r, campaignsSaleState.f114204r);
    }

    public final int hashCode() {
        int iHashCode = this.f114188b.hashCode() * 31;
        b bVar = this.f114189c;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        d dVar = this.f114190d;
        int i12 = r.i((this.f114195i.hashCode() + r.i((this.f114193g.hashCode() + ((this.f114192f.hashCode() + H.e((iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f114191e)) * 31)) * 31, 31, this.f114194h)) * 31, 31, this.f114196j);
        String str = this.f114197k;
        int iHashCode3 = (this.f114199m.hashCode() + ((this.f114198l.hashCode() + ((i12 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        BonusInfo bonusInfo = this.f114200n;
        int i13 = r.i(r.i((iHashCode3 + (bonusInfo == null ? 0 : bonusInfo.hashCode())) * 31, 31, this.f114201o), 31, this.f114202p);
        String str2 = this.f114203q;
        return this.f114204r.hashCode() + ((i13 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CampaignsSaleState(loadingState=");
        sb2.append(this.f114188b);
        sb2.append(", contentPlaceholderData=");
        sb2.append(this.f114189c);
        sb2.append(", itemsAmountExceededErrorData=");
        sb2.append(this.f114190d);
        sb2.append(", blocks=");
        sb2.append(this.f114191e);
        sb2.append(", discountTooltip=");
        sb2.append(this.f114192f);
        sb2.append(", itemsTooltip=");
        sb2.append(this.f114193g);
        sb2.append(", isParticipant=");
        sb2.append(this.f114194h);
        sb2.append(", floatingButton=");
        sb2.append(this.f114195i);
        sb2.append(", exitSaleButtonVisible=");
        sb2.append(this.f114196j);
        sb2.append(", editingBlockUuid=");
        sb2.append(this.f114197k);
        sb2.append(", addBlockButtonState=");
        sb2.append(this.f114198l);
        sb2.append(", discountInfo=");
        sb2.append(this.f114199m);
        sb2.append(", bonusInfo=");
        sb2.append(this.f114200n);
        sb2.append(", isTerminated=");
        sb2.append(this.f114201o);
        sb2.append(", isSearchAvailable=");
        sb2.append(this.f114202p);
        sb2.append(", mainFormId=");
        sb2.append(this.f114203q);
        sb2.append(", mainComponents=");
        return H.p(sb2, this.f114204r, ')');
    }

    public CampaignsSaleState(com.avito.android.campaigns_sale.mvi.entity.a aVar, b bVar, d dVar, List list, HeaderTooltip headerTooltip, HeaderTooltip headerTooltip2, boolean z12, FloatingButton floatingButton, boolean z13, String str, AddBlockButtonState addBlockButtonState, c cVar, BonusInfo bonusInfo, boolean z14, boolean z15, String str2, List list2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? a.b.f114226a : aVar, (i12 & 2) != 0 ? null : bVar, (i12 & 4) != 0 ? null : dVar, (i12 & 8) != 0 ? C42784z0.f406748b : list, (i12 & 16) != 0 ? new HeaderTooltip(null, "", null) : headerTooltip, (i12 & 32) != 0 ? new HeaderTooltip(null, "", null) : headerTooltip2, (i12 & 64) != 0 ? false : z12, (i12 & 128) != 0 ? FloatingButton.f114212d : floatingButton, (i12 & 256) != 0 ? false : z13, (i12 & 512) != 0 ? null : str, (i12 & 1024) != 0 ? AddBlockButtonState.f114207d : addBlockButtonState, (i12 & 2048) != 0 ? new c(null, null, 0, 0, 15, null) : cVar, (i12 & 4096) != 0 ? null : bonusInfo, (i12 & 8192) != 0 ? false : z14, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z15, (i12 & 32768) != 0 ? null : str2, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? C42784z0.f406748b : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CampaignsSaleState(@k com.avito.android.campaigns_sale.mvi.entity.a aVar, @l b bVar, @l d dVar, @k List<C40705b> list, @k HeaderTooltip headerTooltip, @k HeaderTooltip headerTooltip2, boolean z12, @k FloatingButton floatingButton, boolean z13, @l String str, @k AddBlockButtonState addBlockButtonState, @k c cVar, @l BonusInfo bonusInfo, boolean z14, boolean z15, @l String str2, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2) {
        this.f114188b = aVar;
        this.f114189c = bVar;
        this.f114190d = dVar;
        this.f114191e = list;
        this.f114192f = headerTooltip;
        this.f114193g = headerTooltip2;
        this.f114194h = z12;
        this.f114195i = floatingButton;
        this.f114196j = z13;
        this.f114197k = str;
        this.f114198l = addBlockButtonState;
        this.f114199m = cVar;
        this.f114200n = bonusInfo;
        this.f114201o = z14;
        this.f114202p = z15;
        this.f114203q = str2;
        this.f114204r = list2;
    }
}
