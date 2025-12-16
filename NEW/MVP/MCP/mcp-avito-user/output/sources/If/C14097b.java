package If;

import Cj0.g;
import Cj0.l;
import Y61.k;
import com.avito.android.autoteka.domain.model.choosingPurchase.ProductItem;
import com.avito.android.autoteka.items.choosingProduct.ChoosingTypePurchaseState;
import com.avito.android.autoteka.presentation.choosingPurchase.mvi.entity.AutotekaChoosingPurchaseInternalAction;
import com.avito.android.features.autoteka.ab_tests.configs.ChoosingPurchaseTestGroup;
import com.avito.android.remote.autoteka.generated.api.get_step_products_v_3.ProductItemDiscountsItem;
import com.avito.android.remote.autoteka.model.AutotekaDiscount;
import com.avito.android.remote.autoteka.model.KindOfDiscount;
import com.avito.android.remote.autoteka.model.StandaloneAutotekaBlock;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.autotekateaser.AutotekaAnalytic;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AutotekaChoosingProductResultMapper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIf/b;", "", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: If.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14097b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u3.f<ChoosingPurchaseTestGroup> f8458a;

    /* compiled from: AutotekaChoosingProductResultMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: If.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8459a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f8460b;

        static {
            int[] iArr = new int[ChoosingPurchaseTestGroup.values().length];
            try {
                ChoosingPurchaseTestGroup choosingPurchaseTestGroup = ChoosingPurchaseTestGroup.f157655c;
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f8459a = iArr;
            int[] iArr2 = new int[ProductItemDiscountsItem.Kind.values().length];
            try {
                iArr2[ProductItemDiscountsItem.Kind.DynamicDiscount.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            f8460b = iArr2;
        }
    }

    @Inject
    public C14097b(@sD.c @k u3.f<ChoosingPurchaseTestGroup> fVar) {
        this.f8458a = fVar;
    }

    @k
    public final AutotekaChoosingPurchaseInternalAction a(@k TypedResult<Cj0.g> typedResult) {
        Iterator it;
        ProductItem.ProductItemAnalyticsData productItemAnalyticsData;
        if (typedResult instanceof TypedResult.Error) {
            return new AutotekaChoosingPurchaseInternalAction.Error(((TypedResult.Error) typedResult).getError());
        }
        if (!(typedResult instanceof TypedResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        Cj0.g gVar = (Cj0.g) ((TypedResult.Success) typedResult).getResult();
        if (gVar instanceof g.b) {
            g.b bVar = (g.b) gVar;
            return L.f(bVar.getCode(), "previewBySearchKeyNotAvailable") ? AutotekaChoosingPurchaseInternalAction.OpenPreviewSearch.f97167b : new AutotekaChoosingPurchaseInternalAction.Error(new ApiError.UnknownError(bVar.getCode(), null, null, 6, null));
        }
        if (!(gVar instanceof g.a)) {
            throw new NoWhenBranchMatchedException();
        }
        int i12 = 1;
        String strD = a.f8459a[this.f8458a.a().ordinal()] == 1 ? ((g.a) gVar).getProductList().getSelectedItemSlug() : null;
        g.a aVar = (g.a) gVar;
        String strE = aVar.getProductList().getTitle();
        AttributedText attributedTextA = aVar.getProductList().getDescription();
        Cj0.e toStandalone = aVar.getToStandalone();
        StandaloneAutotekaBlock standaloneAutotekaBlock = toStandalone != null ? new StandaloneAutotekaBlock(toStandalone.getDescription(), new StandaloneAutotekaBlock.StandaloneAutotekaLink(toStandalone.getStandaloneLink().getTitle(), toStandalone.getStandaloneLink().getUrl())) : null;
        List<Cj0.j> listB = aVar.getProductList().b();
        int i13 = 10;
        ArrayList arrayList = new ArrayList(C42745f0.q(listB, 10));
        Iterator it2 = listB.iterator();
        while (it2.hasNext()) {
            Cj0.j jVar = (Cj0.j) it2.next();
            String slug = jVar.getSlug();
            List<ProductItemDiscountsItem> listB2 = jVar.b();
            if (listB2 == null) {
                listB2 = C42784z0.f406748b;
            }
            List<ProductItemDiscountsItem> list = listB2;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, i13));
            for (ProductItemDiscountsItem productItemDiscountsItem : list) {
                arrayList2.add(new AutotekaDiscount(a.f8460b[productItemDiscountsItem.getKind().ordinal()] == i12 ? KindOfDiscount.DYNAMIC_DISCOUNT : KindOfDiscount.DISCOUNT, productItemDiscountsItem.getValue()));
            }
            String title = jVar.getTitle();
            String subtitle = jVar.getSubtitle();
            String price = jVar.getPrice();
            String originalPrice = jVar.getOriginalPrice();
            String unitPrice = jVar.getUnitPrice();
            l style = jVar.getStyle();
            String gradient = style != null ? style.getGradient() : null;
            Cj0.k analyticsData = jVar.getAnalyticsData();
            if (analyticsData != null) {
                it = it2;
                productItemAnalyticsData = new ProductItem.ProductItemAnalyticsData(analyticsData.getPriceInCents(), analyticsData.getProductId());
            } else {
                it = it2;
                productItemAnalyticsData = null;
            }
            arrayList.add(new ProductItem(slug, arrayList2, title, subtitle, price, originalPrice, unitPrice, gradient, productItemAnalyticsData));
            it2 = it;
            i12 = 1;
            i13 = 10;
        }
        return new AutotekaChoosingPurchaseInternalAction.ChoosingProductState(new ChoosingTypePurchaseState.ChoosingProductState(null, attributedTextA, strE, standaloneAutotekaBlock, arrayList, strD, aVar.getProductList().getMultiProductFlow(), 1, null), new AutotekaAnalytic(aVar.getAnalytics().getSearchType().ordinal()));
    }
}
