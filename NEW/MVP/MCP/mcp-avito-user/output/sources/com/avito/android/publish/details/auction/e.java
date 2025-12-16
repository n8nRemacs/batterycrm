package com.avito.android.publish.details.auction;

import Ju.InterfaceC14249c;
import Kl.InterfaceC14324a;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.c2c_trx.deepLinks.AddAutoToC2CTrxLink;
import com.avito.android.deep_linking.links.AuctionAddLink;
import com.avito.android.deep_linking.links.AuctionLink;
import com.avito.android.deep_linking.links.InterfaceC29675a;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.publish.C0;
import com.avito.android.publish.analytics.InterfaceC33518d;
import com.avito.android.publish.details.AddButtonsState;
import com.avito.android.publish.details.InterfaceC33675a;
import com.avito.android.publish.details.InterfaceC33746e0;
import com.avito.android.publish.details.ItemDetailsView;
import com.avito.android.publish.details.auction.d;
import com.avito.android.publish.drafts.E;
import com.avito.android.remote.model.category_parameters.AttributeNode;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.completable.F;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kv.C43501a;

/* compiled from: PublishAuctionDelegate.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/details/auction/e;", "Lcom/avito/android/publish/details/auction/d;", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributesTreeConverter f233468b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.publish.details.auction.a f233469c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC33518d f233470d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC33675a f233471e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC33746e0 f233472f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f233473g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final E f233474h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.details.a f233475i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final C0 f233476j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f233477k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public ItemDetailsView f233478l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public Object f233479m;

    /* compiled from: PublishAuctionDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "deepLinkResult", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
            boolean z12 = interfaceC14249c instanceof InterfaceC29675a.b;
            e eVar = e.this;
            if (z12) {
                C0 c02 = eVar.f233476j;
                boolean z13 = c02.f231870h0;
                c02.f231870h0 = true;
                return;
            }
            if (interfaceC14249c instanceof InterfaceC14324a.b) {
                C0 c03 = eVar.f233476j;
                boolean z14 = c03.f231871i0;
                c03.f231871i0 = true;
                e.b(eVar, "AddAutoToC2CTRXSold");
                return;
            }
            if (interfaceC14249c instanceof InterfaceC29675a.C4022a) {
                ItemDetailsView itemDetailsView = eVar.f233478l;
                if (itemDetailsView != null) {
                    itemDetailsView.j3(((InterfaceC29675a.C4022a) interfaceC14249c).f133878b);
                    return;
                }
                return;
            }
            if (!(interfaceC14249c instanceof InterfaceC14324a.C0595a)) {
                if (interfaceC14249c instanceof AuctionLink.b) {
                    e.b(eVar, "AuctionSold");
                }
            } else {
                ItemDetailsView itemDetailsView2 = eVar.f233478l;
                if (itemDetailsView2 != null) {
                    itemDetailsView2.j3(((InterfaceC14324a.C0595a) interfaceC14249c).f9642b);
                }
            }
        }
    }

    /* compiled from: PublishAuctionDelegate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/publish/details/auction/e$b;", "", "<init>", "()V", "", "ADD_AUCTION_LINK_RENDERER", "Ljava/lang/String;", "ADD_AUTO_C2C_TRX_LINK_RENDERER", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: PublishAuctionDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[AddButtonsState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AddButtonsState addButtonsState = AddButtonsState.f232618b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        new b(null);
    }

    @Inject
    public e(@k AttributesTreeConverter attributesTreeConverter, @k com.avito.android.publish.details.auction.a aVar, @k InterfaceC33518d interfaceC33518d, @k InterfaceC33675a interfaceC33675a, @k InterfaceC33746e0 interfaceC33746e0, @k com.avito.android.deeplink_handler.handler.composite.a aVar2, @k E e12, @k com.avito.android.details.a aVar3, @k C0 c02, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f233468b = attributesTreeConverter;
        this.f233469c = aVar;
        this.f233470d = interfaceC33518d;
        this.f233471e = interfaceC33675a;
        this.f233472f = interfaceC33746e0;
        this.f233473g = aVar2;
        this.f233474h = e12;
        this.f233475i = aVar3;
        this.f233476j = c02;
        this.f233477k = interfaceC35745a5;
        aVar2.V9().t0(new a());
    }

    public static final void b(e eVar, String str) {
        F fA2 = eVar.f233474h.a(str);
        InterfaceC35745a5 interfaceC35745a5 = eVar.f233477k;
        fA2.x(interfaceC35745a5.a()).q(interfaceC35745a5.e()).n(new f(eVar)).l(new g(eVar)).r().v(new C31684n(eVar, 10), io.reactivex.rxjava3.internal.functions.a.f401996f);
    }

    @Override // com.avito.android.publish.details.auction.d
    public final void M7(@k AuctionAddLink auctionAddLink) {
        List<ParameterSlot> parametersExceptOwnedBySlots;
        Bundle bundle;
        String str = this.f233476j.f231865c0;
        if (str == null) {
            bundle = null;
        } else {
            CategoryParameters categoryParametersC0 = this.f233475i.C0();
            if (categoryParametersC0 == null || (parametersExceptOwnedBySlots = categoryParametersC0.getParametersExceptOwnedBySlots()) == null) {
                parametersExceptOwnedBySlots = C42784z0.f406748b;
            }
            List<ParameterSlot> list = parametersExceptOwnedBySlots;
            AttributesTreeConverter attributesTreeConverter = this.f233468b;
            List<AttributeNode> listConvertToParameterAttributesTree = attributesTreeConverter.convertToParameterAttributesTree(list);
            List<AttributeNode> listConvertToSlotAttributesTree = attributesTreeConverter.convertToSlotAttributesTree(list);
            com.avito.android.publish.details.auction.a aVar = this.f233469c;
            String strA = aVar.a(listConvertToParameterAttributesTree);
            String strA2 = aVar.a(listConvertToSlotAttributesTree);
            AuctionAddLink.f133013b.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("publish_draft_id_key", new AuctionAddLink.Arguments(str, strA, strA2));
            bundle = bundle2;
        }
        this.f233473g.r6(bundle, auctionAddLink, "add_auction_link");
    }

    @Override // com.avito.android.publish.details.InterfaceC33746e0.a
    public final void a(@k AddButtonsState addButtonsState) {
        List<CategoryPublishStep.Params.NavigationButton> navigationButtons;
        List<CategoryPublishStep.Params.NavigationButton> navigationButtons2;
        CategoryPublishStep categoryPublishStepA = this.f233471e.a();
        if (categoryPublishStepA instanceof CategoryPublishStep.Params) {
            CategoryPublishStep.Params params = (CategoryPublishStep.Params) categoryPublishStepA;
            CategoryPublishStep.Params.Config config = params.getConfig();
            Boolean boolValueOf = null;
            List<CategoryPublishStep.Params.NavigationButton> navigationButtons3 = config != null ? config.getNavigationButtons() : null;
            if (navigationButtons3 == null || navigationButtons3.isEmpty()) {
                return;
            }
            int iOrdinal = addButtonsState.ordinal();
            InterfaceC33518d interfaceC33518d = this.f233470d;
            boolean z12 = true;
            if (iOrdinal == 0) {
                CategoryPublishStep.Params.Config config2 = params.getConfig();
                if (config2 != null && (navigationButtons = config2.getNavigationButtons()) != null) {
                    List<CategoryPublishStep.Params.NavigationButton> list = navigationButtons;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        z12 = false;
                        boolValueOf = Boolean.valueOf(z12);
                    } else {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            if (((CategoryPublishStep.Params.NavigationButton) it.next()).getDeepLink() instanceof AuctionAddLink) {
                                break;
                            }
                        }
                        z12 = false;
                        boolValueOf = Boolean.valueOf(z12);
                    }
                }
                if (L.f(boolValueOf, Boolean.TRUE)) {
                    interfaceC33518d.a();
                    return;
                }
                return;
            }
            if (iOrdinal != 1) {
                return;
            }
            CategoryPublishStep.Params.Config config3 = params.getConfig();
            if (config3 != null && (navigationButtons2 = config3.getNavigationButtons()) != null) {
                List<CategoryPublishStep.Params.NavigationButton> list2 = navigationButtons2;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    z12 = false;
                    boolValueOf = Boolean.valueOf(z12);
                } else {
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (((CategoryPublishStep.Params.NavigationButton) it2.next()).getAction() == CategoryPublishStep.Params.NavigationButtonAction.CONDITIONAL_ACTION) {
                            break;
                        }
                    }
                    z12 = false;
                    boolValueOf = Boolean.valueOf(z12);
                }
            }
            if (L.f(boolValueOf, Boolean.TRUE)) {
                interfaceC33518d.a();
            }
        }
    }

    @Override // com.avito.android.publish.details.auction.d
    public final void b3(@k d.a aVar) {
        this.f233479m = aVar;
    }

    @Override // com.avito.android.publish.details.auction.d
    public final void c0() {
        this.f233479m = null;
    }

    @Override // com.avito.android.publish.details.w2
    public final void e0() {
        this.f233478l = null;
    }

    @Override // com.avito.android.deeplink_handler.view.a.g
    public final void g(@l com.avito.android.deeplink_handler.handler.bundle.a aVar, boolean z12) {
        InterfaceC33746e0 interfaceC33746e0 = this.f233472f;
        if (z12) {
            ItemDetailsView itemDetailsView = this.f233478l;
            if (itemDetailsView != null) {
                itemDetailsView.a();
            }
            interfaceC33746e0.e();
            return;
        }
        ItemDetailsView itemDetailsView2 = this.f233478l;
        if (itemDetailsView2 != null) {
            itemDetailsView2.C0();
        }
        interfaceC33746e0.d(null);
    }

    @Override // com.avito.android.publish.details.auction.d
    public final void m7(@k AddAutoToC2CTrxLink addAutoToC2CTrxLink) {
        List<ParameterSlot> parametersExceptOwnedBySlots;
        Bundle bundle;
        String str = this.f233476j.f231865c0;
        if (str == null) {
            bundle = null;
        } else {
            CategoryParameters categoryParametersC0 = this.f233475i.C0();
            if (categoryParametersC0 == null || (parametersExceptOwnedBySlots = categoryParametersC0.getParametersExceptOwnedBySlots()) == null) {
                parametersExceptOwnedBySlots = C42784z0.f406748b;
            }
            List<ParameterSlot> list = parametersExceptOwnedBySlots;
            AttributesTreeConverter attributesTreeConverter = this.f233468b;
            List<AttributeNode> listConvertToParameterAttributesTree = attributesTreeConverter.convertToParameterAttributesTree(list);
            List<AttributeNode> listConvertToSlotAttributesTree = attributesTreeConverter.convertToSlotAttributesTree(list);
            com.avito.android.publish.details.auction.a aVar = this.f233469c;
            String strA = aVar.a(listConvertToParameterAttributesTree);
            String strA2 = aVar.a(listConvertToSlotAttributesTree);
            AddAutoToC2CTrxLink.f113283b.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("publish_draft_id_key", new AddAutoToC2CTrxLink.Arguments(str, strA, strA2));
            bundle = bundle2;
        }
        this.f233473g.r6(bundle, addAutoToC2CTrxLink, "add_auto_c2c_trx_link");
    }

    @Override // com.avito.android.publish.details.w2
    public final void p2(@k ItemDetailsView itemDetailsView) {
        this.f233478l = itemDetailsView;
    }
}
