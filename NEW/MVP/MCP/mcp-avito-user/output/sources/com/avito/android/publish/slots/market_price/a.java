package com.avito.android.publish.slots.market_price;

import Pd0.v;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.category_parameters.f;
import com.avito.android.deep_linking.links.x;
import com.avito.android.items.MarketPriceItem;
import com.avito.android.publish.C0;
import com.avito.android.publish.InterfaceC34155z;
import com.avito.android.publish.slots.market_price.n;
import com.avito.android.publish.slots.q;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.ItemBrief;
import com.avito.android.remote.model.MarketPriceImageName;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.PriceBadge;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.market_price.CommentState;
import com.avito.android.remote.model.category_parameters.slot.market_price.MarketPriceNoticeType;
import com.avito.android.remote.model.category_parameters.slot.market_price.MarketPriceResponse;
import com.avito.android.remote.model.category_parameters.slot.market_price.MarketPriceSlot;
import com.avito.android.remote.model.category_parameters.slot.market_price.MarketPriceSlotConfig;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.util.InterfaceC35745a5;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import io.reactivex.rxjava3.internal.operators.observable.W;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import l41.InterfaceC43543a;
import l41.r;
import yc.C50213a;

/* compiled from: MarketPriceSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/market_price/a;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceSlot;", "Lcom/avito/android/publish/slots/q;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends com.avito.android.category_parameters.k<MarketPriceSlot> implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final MarketPriceSlot f244509b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final H0 f244510c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34155z f244511d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f244512e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f244513f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final CategoryParametersConverter f244514g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C50213a f244515h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f244516i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f244517j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final v f244518k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.category_parameters.a f244519l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final ItemBrief f244520m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final List<String> f244521n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final Theme f244522o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public MarketPriceResponse f244523p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public ArrayList f244524q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public Object f244525r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f244526s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> f244527t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f244528u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final b f244529v;

    /* compiled from: MarketPriceSlotWrapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.slots.market_price.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C7324a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f244530a;

        static {
            int[] iArr = new int[MarketPriceImageName.values().length];
            try {
                iArr[MarketPriceImageName.LOWEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketPriceImageName.LOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MarketPriceImageName.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MarketPriceImageName.HIGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MarketPriceImageName.HIGHEST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f244530a = iArr;
        }
    }

    /* compiled from: MarketPriceSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/publish/slots/market_price/a$b", "Lcom/avito/android/deep_linking/links/x;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements x {
        @Override // com.avito.android.deep_linking.links.x
        public final boolean X(@Y61.k String str) {
            return false;
        }
    }

    @i31.c
    public a(@InterfaceC41220a @Y61.k MarketPriceSlot marketPriceSlot, @Y61.k H0 h02, @Y61.k C0 c02, @Y61.k InterfaceC34155z interfaceC34155z, @Y61.k com.avito.android.details.a aVar, @Y61.k com.avito.android.util.text.a aVar2, @Y61.k CategoryParametersConverter categoryParametersConverter, @Y61.k C50213a c50213a, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k v vVar, @Y61.k com.avito.android.category_parameters.a aVar3, @Y61.k Q1 q12) {
        this.f244509b = marketPriceSlot;
        this.f244510c = h02;
        this.f244511d = interfaceC34155z;
        this.f244512e = aVar;
        this.f244513f = aVar2;
        this.f244514g = categoryParametersConverter;
        this.f244515h = c50213a;
        this.f244516i = interfaceC28373a;
        this.f244517j = interfaceC35745a5;
        this.f244518k = vVar;
        this.f244519l = aVar3;
        this.f244520m = c02.f231867e0;
        List<String> relatedFields = ((MarketPriceSlotConfig) marketPriceSlot.getWidget().getConfig()).getRelatedFields();
        this.f244521n = relatedFields == null ? C42784z0.f406748b : relatedFields;
        this.f244522o = c02.ve();
        this.f244525r = C42784z0.f406748b;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f244526s = cVar;
        com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f244527t = cVar2;
        p();
        f fVar = new f(this);
        r rVar = com.avito.android.publish.slots.market_price.b.f244531b;
        C41981q0 c41981q0 = c02.f231882t0;
        W wN2 = c41981q0.N(rVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        I0 i0J0 = wN2.y(800L, timeUnit, interfaceC35745a5.c()).j0(interfaceC35745a5.e());
        n.a aVar4 = new n.a(fVar);
        l41.g<? super Throwable> gVar = c.f244532b;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        cVar.b(i0J0.v0(aVar4, gVar, interfaceC43543a));
        z zVarN = c41981q0.N(d.f244533b);
        kotlin.reflect.n<Object> nVar = Q1.f67448x0[21];
        cVar.b((((Boolean) q12.f67518w.a().invoke()).booleanValue() ? zVarN.n0(300L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b) : zVarN).v0(new n.a(fVar), e.f244534b, interfaceC43543a));
        this.f244528u = cVar2;
        this.f244529v = new b();
    }

    public static MarketPriceResponse.PriceRange n(long j12, List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            MarketPriceResponse.PriceRange priceRange = (MarketPriceResponse.PriceRange) next;
            if (j12 >= priceRange.getMin() && j12 <= priceRange.getMax()) {
                break;
            }
        }
        return (MarketPriceResponse.PriceRange) next;
    }

    public static Long o(PriceParameter priceParameter) {
        String value;
        if (priceParameter == null || (value = priceParameter.getValue()) == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int length = value.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = value.charAt(i12);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        return C43066x.z0(sb2.toString());
    }

    public static CommentState q(List list, MarketPriceResponse.PriceRangeV2 priceRangeV2) {
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String priceType = ((CommentState) next).getPriceType();
            MarketPriceNoticeType type = priceRangeV2.getType();
            if (L.f(priceType, type != null ? type.getValue() : null)) {
                obj = next;
                break;
            }
        }
        return (CommentState) obj;
    }

    @Override // com.avito.android.publish.slots.q
    @Y61.k
    public final z<com.avito.android.category_parameters.f> a() {
        return this.f244528u;
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
        this.f244526s.e();
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final com.avito.android.category_parameters.f d(@Y61.k com.avito.conveyor_item.a aVar) {
        Object id2;
        MarketPriceSlot marketPriceSlot = this.f244509b;
        CharParameter commentField = ((MarketPriceSlotConfig) marketPriceSlot.getWidget().getConfig()).getCommentField();
        if (commentField == null || (id2 = commentField.getId()) == null) {
            id2 = f.c.f117644b;
        }
        if (!L.f(aVar.getF231617b(), id2)) {
            return f.c.f117644b;
        }
        if (!(aVar instanceof com.avito.android.items.d)) {
            return f.c.f117644b;
        }
        CharParameter commentField2 = ((MarketPriceSlotConfig) marketPriceSlot.getWidget().getConfig()).getCommentField();
        if (commentField2 != null) {
            commentField2.set_value(((com.avito.android.items.d) aVar).getF117481f());
        }
        return f.c.f117644b;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f244509b;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    @Override // com.avito.android.category_parameters.k
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.avito.conveyor_item.a> j() {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.slots.market_price.a.j():java.util.List");
    }

    public final List<com.avito.conveyor_item.a> l(CharSequence charSequence, MarketPriceResponse.PriceRange priceRange, CharSequence charSequence2) {
        MarketPriceItem.DealTypeImageName dealTypeImageName;
        MarketPriceItem.a aVar;
        ArrayList arrayList;
        String strF = f();
        PriceBadge priceBadge = priceRange != null ? priceRange.getPriceBadge() : null;
        if (priceBadge == null) {
            aVar = null;
        } else {
            MarketPriceImageName image = priceBadge.getImage();
            int i12 = image == null ? -1 : C7324a.f244530a[image.ordinal()];
            if (i12 == -1) {
                dealTypeImageName = null;
            } else if (i12 == 1) {
                dealTypeImageName = MarketPriceItem.DealTypeImageName.f173906b;
            } else if (i12 == 2) {
                dealTypeImageName = MarketPriceItem.DealTypeImageName.f173907c;
            } else if (i12 == 3) {
                dealTypeImageName = MarketPriceItem.DealTypeImageName.f173908d;
            } else if (i12 == 4) {
                dealTypeImageName = MarketPriceItem.DealTypeImageName.f173909e;
            } else {
                if (i12 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                dealTypeImageName = MarketPriceItem.DealTypeImageName.f173910f;
            }
            aVar = new MarketPriceItem.a(priceBadge.getTitle(), priceBadge.getTitleColor().getValue(), priceBadge.getSubtitle(), dealTypeImageName);
        }
        return Collections.singletonList(new MarketPriceItem(strF, charSequence, aVar, charSequence2, (priceRange != null || (arrayList = this.f244524q) == null) ? null : arrayList));
    }

    public final PriceParameter m() {
        CategoryParameters categoryParametersC0 = this.f244512e.C0();
        ParameterSlot parameterSlotFindParameter = categoryParametersC0 != null ? categoryParametersC0.findParameter(((MarketPriceSlotConfig) this.f244509b.getWidget().getConfig()).getPriceId()) : null;
        if (parameterSlotFindParameter instanceof PriceParameter) {
            return (PriceParameter) parameterSlotFindParameter;
        }
        return null;
    }

    public final void p() {
        List<ParameterSlot> parameters;
        CategoryParameters categoryParametersC0 = this.f244512e.C0();
        if (categoryParametersC0 == null || (parameters = categoryParametersC0.getParameters()) == null) {
            return;
        }
        List<ParameterSlot> list = parameters;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (this.f244521n.contains(((ParameterSlot) obj).getId())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (obj2 instanceof EditableParameter) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(String.valueOf(((EditableParameter) it.next()).getValue()));
            }
            if (arrayList3.equals(this.f244525r)) {
                return;
            } else {
                this.f244525r = arrayList3;
            }
        }
        this.f244518k.h();
        Navigation navigationU = this.f244511d.U();
        CategoryParametersConverter categoryParametersConverter = this.f244514g;
        Map<String, String> mapConvertToFieldMap = categoryParametersConverter.convertToFieldMap(navigationU);
        Map<String, String> mapConvertToFieldMap2 = categoryParametersConverter.convertToFieldMap(list);
        ItemBrief itemBrief = this.f244520m;
        z<TypedResult<MarketPriceResponse>> zVarG = this.f244510c.g(mapConvertToFieldMap, mapConvertToFieldMap2, itemBrief != null ? itemBrief.getId() : null, this.f244515h.b());
        InterfaceC35745a5 interfaceC35745a5 = this.f244517j;
        this.f244526s.b(zVarG.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).K(new g(this)).m0(new h(this)).d0(i.f244538b).v0(new j(this), k.f244552b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }
}
