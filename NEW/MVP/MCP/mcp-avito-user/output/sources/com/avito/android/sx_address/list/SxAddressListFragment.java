package com.avito.android.sx_address.list;

import Cd.C13243a;
import Y61.k;
import Y61.l;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.SxAddressAddLink;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.lib.design.spinner.overlay.SpinnerOverlay;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.sx_address.SxAddressListParams;
import com.avito.android.sx_address.list.di.n;
import com.avito.android.sx_address.list.domain.AddressItem;
import com.avito.android.sx_address.list.domain.Filter;
import com.avito.android.sx_address.list.domain.InfoBannerButtonData;
import com.avito.android.sx_address.list.domain.InfoBannerData;
import com.avito.android.sx_address.list.domain.ScreenData;
import com.avito.android.sx_address.list.mvi.entity.ListState;
import com.avito.android.sx_address.list.mvi.entity.ListViewState;
import com.avito.android.sx_address.list.mvi.entity.c;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.ApiException;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.O2;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.d2;
import z1.AbstractC50339a;

/* compiled from: SxAddressListFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sx_address/list/SxAddressListFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SxAddressListFragment extends BaseFragment implements InterfaceC28477j.a {

    /* renamed from: F0, reason: collision with root package name */
    @k
    public static final a f293014F0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public com.avito.android.analytics.provider.a f293015A0;

    /* renamed from: B0, reason: collision with root package name */
    @k
    public final O0 f293016B0;

    /* renamed from: C0, reason: collision with root package name */
    @l
    public com.avito.android.sx_address.list.view.g f293017C0;

    /* renamed from: D0, reason: collision with root package name */
    @l
    public com.avito.android.sx_address.list.a f293018D0;

    /* renamed from: E0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f293019E0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.sx_address.list.i f293020n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f293021o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f293022p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f293023q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f293024r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f293025s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public d2<AddressItem> f293026t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.sx_address.list.view.recycler.promo_banner.a f293027u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.sx_address.list.e f293028v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f293029w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.sx_address.list.analytics.i f293030x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public com.avito.android.sx_address.list.analytics.g f293031y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public SharedPreferences f293032z0;

    /* compiled from: SxAddressListFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/sx_address/list/SxAddressListFragment$a;", "", "<init>", "()V", "", "SX_LIST_ADDRESS_PARAMS_KEY", "Ljava/lang/String;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SxAddressListFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/sx_address/SxAddressListParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<SxAddressListParams> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final SxAddressListParams invoke() {
            Bundle bundleRequireArguments = SxAddressListFragment.this.requireArguments();
            Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("sx_list_address_params_key", SxAddressListParams.class) : bundleRequireArguments.getParcelable("sx_list_address_params_key");
            if (parcelable != null) {
                return (SxAddressListParams) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* compiled from: SxAddressListFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<com.avito.android.sx_address.list.mvi.entity.c, G0> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v1 */
        /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r14v5 */
        @Override // Y41.l
        public final G0 invoke(com.avito.android.sx_address.list.mvi.entity.c cVar) {
            com.avito.android.sx_address.list.view.g gVar;
            com.avito.android.sx_address.list.mvi.entity.c cVar2 = cVar;
            SxAddressListFragment sxAddressListFragment = (SxAddressListFragment) this.receiver;
            a aVar = SxAddressListFragment.f293014F0;
            View viewFindViewById = sxAddressListFragment.requireView().findViewById(R.id.add_button);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            Button button = (Button) viewFindViewById;
            if (cVar2 instanceof c.a) {
                sxAddressListFragment.requireActivity().finish();
            } else if (cVar2 instanceof c.C8905c) {
                int i12 = (int) ((SxAddressListParams) sxAddressListFragment.f293019E0.getValue()).f292541b;
                com.avito.android.sx_address.list.analytics.g gVar2 = sxAddressListFragment.f293031y0;
                if (gVar2 == null) {
                    gVar2 = null;
                }
                SxAddressAddLink sxAddressAddLink = new SxAddressAddLink(i12, gVar2.a(), com.avito.android.sx_address.list.c.f293066a, null, null, 24, null);
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = sxAddressListFragment.f293025s0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, sxAddressAddLink, null, null, 6);
            } else if (cVar2 instanceof c.h) {
                com.avito.android.sx_address.list.view.g gVar3 = sxAddressListFragment.f293017C0;
                if (gVar3 != null) {
                    AddressItem addressItem = ((c.h) cVar2).f293308a;
                    View view = gVar3.f293432a;
                    ?? r14 = 0;
                    com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(view.getContext(), 0, 2, null);
                    dVar.setContentView(R.layout.action_menu_layout);
                    TextView textView = (TextView) dVar.findViewById(R.id.title);
                    TextView textView2 = (TextView) dVar.findViewById(R.id.subtitle);
                    TextView textView3 = (TextView) dVar.findViewById(R.id.description);
                    LinearLayout linearLayout = (LinearLayout) dVar.findViewById(R.id.buttons_container);
                    ((ImageView) dVar.findViewById(R.id.close_button)).setOnClickListener(new S7.a(dVar, 16));
                    AddressItem.AddressListItemBottomSheet addressListItemBottomSheet = addressItem.f293122c;
                    I5.a(textView, addressListItemBottomSheet.f293131d, false);
                    I5.a(textView2, addressItem.f293127h, false);
                    com.avito.android.util.text.j.a(textView3, addressListItemBottomSheet.f293130c, null);
                    ArrayList arrayList = addressListItemBottomSheet.f293129b;
                    ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    int i13 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        AddressItem.AddressListItemBottomSheetButtonsItem addressListItemBottomSheetButtonsItem = (AddressItem.AddressListItemBottomSheetButtonsItem) next;
                        Button button2 = new Button(view.getContext(), null, 0, 0, 14, null);
                        com.avito.android.lib.design.button.b.a(button2, addressListItemBottomSheetButtonsItem.f293132b, r14);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams.weight = 1.0f;
                        layoutParams.setMarginStart(r14);
                        layoutParams.setMarginEnd(r14);
                        if (i13 > 0) {
                            layoutParams.setMarginStart(y6.b(4));
                        }
                        if (i13 < arrayList.size() - 1) {
                            layoutParams.setMarginEnd(y6.b(4));
                        }
                        button2.setLayoutParams(layoutParams);
                        button2.setAppearanceFromAttr(R.attr.buttonSecondaryLarge);
                        ArrayList arrayList3 = arrayList2;
                        button2.setOnClickListener(new com.avito.android.advert.item.beduin.v2.favorite.a(addressListItemBottomSheetButtonsItem, gVar3, dVar, button2, addressItem, 3));
                        arrayList3.add(button2);
                        arrayList2 = arrayList3;
                        i13 = i14;
                        arrayList = arrayList;
                        r14 = 0;
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        linearLayout.addView((Button) it2.next());
                    }
                    com.avito.android.lib.util.g.a(dVar);
                }
            } else if (cVar2 instanceof c.j) {
                com.avito.android.sx_address.list.view.g gVar4 = sxAddressListFragment.f293017C0;
                if (gVar4 != null) {
                    Filter filter = ((c.j) cVar2).f293310a;
                    com.avito.android.sx_address.list.view.a aVar3 = gVar4.f293430J;
                    aVar3.f293409H = filter;
                    for (Map.Entry entry : aVar3.f293410I.entrySet()) {
                        ((ListItemRadio) entry.getValue()).setChecked(L.f((String) entry.getKey(), filter.name()));
                    }
                    com.avito.android.lib.util.g.a(aVar3);
                }
            } else if (cVar2 instanceof c.b) {
                com.avito.android.sx_address.list.view.g gVar5 = sxAddressListFragment.f293017C0;
                if (gVar5 != null) {
                    String str = ((c.b) cVar2).f293302a;
                    D6.w(gVar5.f293450s);
                    SharedPreferences.Editor editorEdit = gVar5.f293441j.edit();
                    editorEdit.putBoolean("sx_address_list_close_banner_" + gVar5.f293442k.a() + '_' + str, true);
                    editorEdit.apply();
                }
            } else if (cVar2 instanceof c.d) {
                com.avito.android.sx_address.list.a aVar4 = sxAddressListFragment.f293018D0;
                if (aVar4 != null) {
                    aVar4.a(((c.d) cVar2).f293304a, button);
                }
            } else if (cVar2 instanceof c.e) {
                com.avito.android.sx_address.list.a aVar5 = sxAddressListFragment.f293018D0;
                if (aVar5 != null) {
                    aVar5.a(((c.e) cVar2).f293305a, button);
                }
            } else if (cVar2 instanceof c.f) {
                com.avito.android.sx_address.list.a aVar6 = sxAddressListFragment.f293018D0;
                if (aVar6 != null) {
                    aVar6.a(((c.f) cVar2).f293306a, button);
                }
            } else if (cVar2 instanceof c.g) {
                com.avito.android.sx_address.list.a aVar7 = sxAddressListFragment.f293018D0;
                if (aVar7 != null) {
                    aVar7.a(((c.g) cVar2).f293307a, button);
                }
            } else if (cVar2 instanceof c.i) {
                com.avito.android.sx_address.list.view.g gVar6 = sxAddressListFragment.f293017C0;
                if (gVar6 != null) {
                    String str2 = ((c.i) cVar2).f293309a;
                    com.avito.android.component.toast.c cVar3 = com.avito.android.component.toast.c.f125244a;
                    PrintableText printableTextF = com.avito.android.printable_text.b.f(str2);
                    f.c.f125255c.getClass();
                    com.avito.android.component.toast.c.b(cVar3, gVar6.f293453v, printableTextF, null, null, null, f.c.a.b(), 0, ToastBarPosition.f181044b, null, false, false, null, null, 4014);
                }
            } else if (cVar2 instanceof c.l) {
                com.avito.android.sx_address.list.view.g gVar7 = sxAddressListFragment.f293017C0;
                if (gVar7 != null) {
                    gVar7.b(((c.l) cVar2).f293313a);
                }
            } else if ((cVar2 instanceof c.k) && (gVar = sxAddressListFragment.f293017C0) != null) {
                c.k kVar = (c.k) cVar2;
                gVar.c(kVar.f293311a, kVar.f293312b);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SxAddressListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/ListState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/sx_address/list/mvi/entity/ListState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<ListState, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(ListState listState) {
            String f293201j;
            ListState listState2 = listState;
            com.avito.android.sx_address.list.view.g gVar = SxAddressListFragment.this.f293017C0;
            if (gVar != null) {
                ListViewState listViewState = listState2.f293245b;
                boolean z12 = listViewState instanceof ListViewState.Content;
                FrameLayout frameLayout = gVar.f293454w;
                SpinnerOverlay spinnerOverlay = gVar.f293449r;
                Button button = gVar.f293453v;
                if (z12) {
                    D6.w(spinnerOverlay);
                    D6.w(frameLayout);
                    D6.H(button);
                    ScreenData screenData = ((ListViewState.Content) listViewState).f293254b;
                    boolean z13 = screenData.f293179o;
                    com.avito.konveyor.adapter.j jVar = gVar.f293433b;
                    com.avito.konveyor.adapter.a aVar = gVar.f293434c;
                    List list = screenData.f293166b;
                    boolean z14 = screenData.f293170f;
                    com.avito.android.sx_address.list.analytics.i iVar = gVar.f293444m;
                    if (z13) {
                        I5.a(gVar.f293446o, screenData.f293175k, false);
                        com.avito.android.util.text.j.a(gVar.f293447p, screenData.f293167c, null);
                        gVar.f293451t.setVisibility(screenData.f293177m ? 0 : 8);
                        if (list == null) {
                            list = C42784z0.f406748b;
                        }
                        aVar.c(new UV0.c(list));
                        jVar.notifyDataSetChanged();
                        ArrayList arrayList = screenData.f293173i;
                        boolean zA2 = O2.a(arrayList);
                        RecyclerView recyclerView = gVar.f293448q;
                        if (zA2) {
                            D6.H(recyclerView);
                            if (arrayList != null) {
                                gVar.f293436e.c(new UV0.c(arrayList));
                                gVar.f293435d.notifyDataSetChanged();
                            }
                        } else {
                            D6.w(recyclerView);
                        }
                        Banner banner = gVar.f293450s;
                        InfoBannerData infoBannerData = screenData.f293168d;
                        if (infoBannerData != null) {
                            StringBuilder sb2 = new StringBuilder("sx_address_list_close_banner_");
                            sb2.append(gVar.f293442k.a());
                            sb2.append('_');
                            String str = infoBannerData.f293159f;
                            sb2.append(str);
                            if (gVar.f293441j.getBoolean(sb2.toString(), false)) {
                                D6.w(banner);
                            } else {
                                D6.H(banner);
                                View viewInflate = LayoutInflater.from(banner.getContext()).inflate(R.layout.info_banner_layout, (ViewGroup) null);
                                View viewFindViewById = viewInflate.findViewById(R.id.banner_title);
                                if (viewFindViewById == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                                }
                                TextView textView = (TextView) viewFindViewById;
                                View viewFindViewById2 = viewInflate.findViewById(R.id.banner_description);
                                if (viewFindViewById2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                                }
                                TextView textView2 = (TextView) viewFindViewById2;
                                View viewFindViewById3 = viewInflate.findViewById(R.id.banner_button);
                                if (viewFindViewById3 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
                                }
                                Button button2 = (Button) viewFindViewById3;
                                View viewFindViewById4 = viewInflate.findViewById(R.id.close_button);
                                if (viewFindViewById4 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                                }
                                ImageView imageView = (ImageView) viewFindViewById4;
                                I5.a(textView, infoBannerData.f293158e, false);
                                com.avito.android.util.text.j.a(textView2, infoBannerData.f293156c, null);
                                InfoBannerButtonData infoBannerButtonData = infoBannerData.f293155b;
                                com.avito.android.lib.design.button.b.a(button2, infoBannerButtonData != null ? infoBannerButtonData.f293153b : null, false);
                                button2.setOnClickListener(new com.avito.android.sx_address.list.view.c(infoBannerData, gVar));
                                imageView.setVisibility(infoBannerData.f293157d ? 0 : 8);
                                imageView.setOnClickListener(new com.avito.android.sx_address.list.view.c(gVar, infoBannerData));
                                banner.setContentView(viewInflate);
                                iVar.c(str);
                            }
                        } else {
                            D6.w(banner);
                        }
                        button.setEnabled(z14);
                        Boolean bool = screenData.f293174j;
                        gVar.f293452u.setVisibility(bool != null ? bool.booleanValue() : false ? 0 : 8);
                    } else {
                        if (list == null) {
                            list = C42784z0.f406748b;
                        }
                        aVar.c(new UV0.c(list));
                        jVar.notifyDataSetChanged();
                    }
                    if (z14) {
                        iVar.a();
                    }
                } else if (listViewState instanceof ListViewState.Loading) {
                    D6.w(frameLayout);
                    D6.H(spinnerOverlay);
                    D6.g(button);
                } else if (listViewState instanceof ListViewState.Error) {
                    Throwable th2 = ((ListViewState.Error) listViewState).f293255b;
                    boolean z15 = th2 instanceof ApiException;
                    TextView textView3 = gVar.f293421A;
                    TextView textView4 = gVar.f293457z;
                    ImageView imageView2 = gVar.f293456y;
                    com.avito.android.sx_address.list.e eVar = gVar.f293440i;
                    if (z15 && (((ApiException) th2).f318522b instanceof ApiError.NetworkIOError)) {
                        if (gVar.f293455x != null) {
                            if (imageView2 != null) {
                                imageView2.setImageResource(eVar.getF293196e());
                            }
                            if (textView4 != null) {
                                I5.a(textView4, eVar.getF293197f(), false);
                            }
                            if (textView3 != null) {
                                I5.a(textView3, eVar.getF293198g(), false);
                            }
                        }
                        D6.H(frameLayout);
                        D6.w(spinnerOverlay);
                        D6.g(button);
                    } else {
                        ApiError apiErrorN = th2 != null ? z.n(th2) : null;
                        View viewFindViewById5 = gVar.f293432a.findViewById(R.id.error_layout);
                        if (viewFindViewById5 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
                        }
                        gVar.f293455x = (LinearLayout) viewFindViewById5;
                        if (imageView2 != null) {
                            imageView2.setImageResource(eVar.getF293199h());
                        }
                        if (textView4 != null) {
                            I5.a(textView4, eVar.getF293200i(), false);
                        }
                        if (textView3 != null) {
                            if (apiErrorN == null || (f293201j = apiErrorN.getF244063c()) == null) {
                                f293201j = eVar.getF293201j();
                            }
                            I5.a(textView3, f293201j, false);
                        }
                        D6.H(frameLayout);
                        D6.w(spinnerOverlay);
                        D6.g(button);
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f293035l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f293035l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f293035l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SxAddressListFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f293037l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f293037l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f293037l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f293038l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f293038l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f293038l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f293039l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f293039l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f293039l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SxAddressListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/sx_address/list/h;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/sx_address/list/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.sx_address.list.h> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.sx_address.list.h invoke() {
            com.avito.android.sx_address.list.i iVar = SxAddressListFragment.this.f293020n0;
            if (iVar == null) {
                iVar = null;
            }
            return (com.avito.android.sx_address.list.h) iVar.get();
        }
    }

    public SxAddressListFragment() {
        super(R.layout.fragment_sx_address_list);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f293016B0 = new O0(m0.f406844a.b(com.avito.android.sx_address.list.h.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f293019E0 = C42727D.c(new b());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f293017C0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.konveyor.adapter.j jVar = this.f293021o0;
        com.avito.konveyor.adapter.j jVar2 = jVar != null ? jVar : null;
        com.avito.konveyor.adapter.a aVar = this.f293022p0;
        com.avito.konveyor.adapter.a aVar2 = aVar != null ? aVar : null;
        com.avito.konveyor.adapter.j jVar3 = this.f293023q0;
        com.avito.konveyor.adapter.j jVar4 = jVar3 != null ? jVar3 : null;
        com.avito.android.sx_address.list.view.recycler.promo_banner.a aVar3 = this.f293027u0;
        com.avito.android.sx_address.list.view.recycler.promo_banner.a aVar4 = aVar3 != null ? aVar3 : null;
        com.avito.konveyor.adapter.a aVar5 = this.f293024r0;
        com.avito.konveyor.adapter.a aVar6 = aVar5 != null ? aVar5 : null;
        d2<AddressItem> d2Var = this.f293026t0;
        d2<AddressItem> d2Var2 = d2Var != null ? d2Var : null;
        InterfaceC22983P viewLifecycleOwner = getViewLifecycleOwner();
        com.avito.android.deeplink_handler.handler.composite.a aVar7 = this.f293025s0;
        com.avito.android.deeplink_handler.handler.composite.a aVar8 = aVar7 != null ? aVar7 : null;
        com.avito.android.sx_address.list.e eVar = this.f293028v0;
        com.avito.android.sx_address.list.e eVar2 = eVar != null ? eVar : null;
        SharedPreferences sharedPreferences = this.f293032z0;
        SharedPreferences sharedPreferences2 = sharedPreferences != null ? sharedPreferences : null;
        com.avito.android.analytics.provider.a aVar9 = this.f293015A0;
        com.avito.android.analytics.provider.a aVar10 = aVar9 != null ? aVar9 : null;
        com.avito.android.util.text.a aVar11 = this.f293029w0;
        com.avito.android.util.text.a aVar12 = aVar11 != null ? aVar11 : null;
        com.avito.android.sx_address.list.analytics.i iVar = this.f293030x0;
        com.avito.android.sx_address.list.view.g gVar = new com.avito.android.sx_address.list.view.g(view, jVar2, aVar2, jVar4, aVar4, aVar6, d2Var2, viewLifecycleOwner, aVar8, eVar2, sharedPreferences2, aVar10, aVar12, iVar != null ? iVar : null);
        O0 o02 = this.f293016B0;
        gVar.a((com.avito.android.sx_address.list.h) o02.getValue());
        this.f293017C0 = gVar;
        com.avito.android.arch.mvi.android.f.a((com.avito.android.sx_address.list.h) o02.getValue(), getViewLifecycleOwner(), Lifecycle.State.f46681d, new c(1, this, SxAddressListFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/sx_address/list/mvi/entity/ListOneTimeEvent;)V", 0), new d());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        com.avito.android.sx_address.list.di.c.a().a((SxAddressListParams) this.f293019E0.getValue(), requireActivity().getResources(), requireActivity(), (n) C29972i.a(C29972i.b(this), n.class), cv.c.b(this)).a(this);
        com.avito.android.sx_address.list.e eVar = this.f293028v0;
        if (eVar == null) {
            eVar = null;
        }
        this.f293018D0 = new com.avito.android.sx_address.list.a(eVar);
    }
}
