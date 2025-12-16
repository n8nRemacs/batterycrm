package com.avito.android.advert_core.contactbar;

import Ax.InterfaceC13095a;
import Ev.InterfaceC13531b;
import Hr.InterfaceC14024a;
import Id.InterfaceC14060a;
import ac.C19864a;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.os.C22777e;
import com.avito.android.B2;
import com.avito.android.C29640d;
import com.avito.android.R;
import com.avito.android.advert_core.advert.b;
import com.avito.android.advert_core.sellerprofile.ShowSellersProfileSource;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.W0;
import com.avito.android.authorization.AuthSource;
import com.avito.android.autoteka.analytics.event.FromBlock;
import com.avito.android.autoteka.model.AutotekaChoosingPurchaseButtonParams;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.credits.installments.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.links.PhoneLink;
import com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter;
import com.avito.android.remote.delivery_suggests.DeliverySuggests;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertPrice;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import com.avito.android.remote.model.ContactsPosition;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.PriorityContactsMethod;
import com.avito.android.remote.model.RecallMeParams;
import com.avito.android.remote.model.RecallMeRequest;
import com.avito.android.remote.model.SellerRating;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.remote.model.advert_details.SellerOnlineStatus;
import com.avito.android.remote.model.advert_details.realty.DevelopmentsAdvice;
import com.avito.android.remote.model.autotekateaser.AutotekaPurchaseAction;
import com.avito.android.remote.model.credit_broker.CreditBrokerProduct;
import com.avito.android.remote.model.mortgage.MortgageBuyButton;
import com.avito.android.remote.model.service_seller_type.ServiceSellerType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.remote.sticky_block.StickyBlock;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.kotlin.A1;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;
import o8.C44599a;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: AdvertContactsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/contactbar/e;", "Lcom/avito/android/advert_core/contactbar/d;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert_core.contactbar.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28266e implements InterfaceC28265d {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<ContactBar.Button.Target> f83157A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<ContactBar.Button.Action> f83158B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<InterfaceC13531b> f83159C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f83160D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public AttributedText f83161E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public ContactsPosition f83162F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public List<? extends ContactBar.InfoStickyBlock> f83163G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f83164H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f83165I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public List<? extends ContactBar.Button> f83166J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public List<? extends ContactBar.Button> f83167K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.l
    public AdvertDetails f83168L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.l
    public ContactBarData f83169M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f83170N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert_core.advert.c f83171O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.l
    public Object f83172P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.l
    public DeepLink f83173Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f83174R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f83175S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final ArrayList f83176T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final ArrayList f83177U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f83178V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f83179W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final C43238h f83180X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.l
    public String f83181Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.l
    public String f83182Z;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l90.n f83183a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f83184a0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.messenger.a f83185b;

    /* renamed from: b0, reason: collision with root package name */
    public long f83186b0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final WL.a f83187c;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.m f83188c0;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.analytics.a f83189d;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f83190d0;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f83191e;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.l
    public String f83192e0;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<AdvertPrice> f83193f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f83194f0;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f83195g;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public N f83196g0;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f83197h;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f83198h0;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C29640d f83199i;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f83200i0;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final B2 f83201j;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f83202j0;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final SourceScreen f83203k;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final String f83204k0;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final AK0.l f83205l;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Integer> f83206l0;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deal_confirmation.d f83207m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f83208n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final W9.c f83209o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final ProgressInfoToastBarPresenter f83210p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final InterfaceC13095a f83211q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final C f83212r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.delayed_ux_feedback.d f83213s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final C19864a f83214t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14060a f83215u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.safedeal.trust_factors.a f83216v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_info_toast_bar.interactor.g f83217w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final InterfaceC14024a f83218x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public ShowSellersProfileSource f83219y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public String f83220z;

    /* compiled from: AdvertContactsPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert_core.contactbar.e$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ContactBar.Button.Action.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ContactBar.Button.Action.Type type = ContactBar.Button.Action.Type.f125058b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ContactBar.Button.Action.Type type2 = ContactBar.Button.Action.Type.f125058b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ContactBar.Button.Action.Type type3 = ContactBar.Button.Action.Type.f125058b;
                iArr[9] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ContactBar.Button.Action.Type type4 = ContactBar.Button.Action.Type.f125058b;
                iArr[10] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ContactBar.Button.Action.Type type5 = ContactBar.Button.Action.Type.f125058b;
                iArr[3] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ContactBar.Button.Action.Type type6 = ContactBar.Button.Action.Type.f125058b;
                iArr[4] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ContactBar.Button.Action.Type type7 = ContactBar.Button.Action.Type.f125058b;
                iArr[5] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                ContactBar.Button.Action.Type type8 = ContactBar.Button.Action.Type.f125058b;
                iArr[6] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                ContactBar.Button.Action.Type type9 = ContactBar.Button.Action.Type.f125058b;
                iArr[7] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                ContactBar.Button.Action.Type type10 = ContactBar.Button.Action.Type.f125058b;
                iArr[8] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                ContactBar.Button.Action.Type type11 = ContactBar.Button.Action.Type.f125058b;
                iArr[12] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                ContactBar.Button.Action.Type type12 = ContactBar.Button.Action.Type.f125058b;
                iArr[11] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr2 = new int[SourceScreen.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                SourceScreen sourceScreen = SourceScreen.f83145c;
                iArr2[7] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                SourceScreen sourceScreen2 = SourceScreen.f83145c;
                iArr2[0] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                SourceScreen sourceScreen3 = SourceScreen.f83145c;
                iArr2[2] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                SourceScreen sourceScreen4 = SourceScreen.f83145c;
                iArr2[3] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                SourceScreen sourceScreen5 = SourceScreen.f83145c;
                iArr2[5] = 6;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                SourceScreen sourceScreen6 = SourceScreen.f83145c;
                iArr2[6] = 7;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                SourceScreen sourceScreen7 = SourceScreen.f83145c;
                iArr2[4] = 8;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    /* compiled from: AdvertContactsPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_core.contactbar.e$b */
    public static final class b<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ContactBarData f83222c;

        public b(ContactBarData contactBarData) {
            this.f83222c = contactBarData;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            SellerRating sellerRating;
            DeepLink deeplink;
            C28266e c28266e = C28266e.this;
            c28266e.getClass();
            ContactBarData contactBarData = this.f83222c;
            if (contactBarData == null || (sellerRating = contactBarData.getSellerRating()) == null || (deeplink = sellerRating.getDeeplink()) == null) {
                return;
            }
            c28266e.f83200i0.accept(deeplink);
        }
    }

    /* compiled from: AdvertContactsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_core.contactbar.e$c */
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f83223b = new c<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Error handle container rating click", (Throwable) obj);
        }
    }

    /* compiled from: AdvertContactsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Action;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Action;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_core.contactbar.e$d */
    public static final class d<T> implements l41.g {
        public d() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
        /* JADX WARN: Type inference failed for: r0v1, types: [com.avito.android.advert_core.advert.a, java.lang.Object] */
        @Override // l41.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void accept(java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 250
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_core.contactbar.C28266e.d.accept(java.lang.Object):void");
        }
    }

    /* compiled from: AdvertContactsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_core.contactbar.e$e, reason: collision with other inner class name */
    public static final class C2465e<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final C2465e<T> f83225b = new C2465e<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Error handle action button contact click", (Throwable) obj);
        }
    }

    /* compiled from: AdvertContactsPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert_core.contactbar.e$f */
    public /* synthetic */ class f extends kotlin.jvm.internal.H implements Y41.p<String, SafeDeal.TooltipData.Event, G0> {
        @Override // Y41.p
        public final G0 invoke(String str, SafeDeal.TooltipData.Event event) {
            String str2 = str;
            SafeDeal.TooltipData.Event event2 = event;
            C28266e c28266e = (C28266e) this.receiver;
            AK0.l lVar = c28266e.f83205l;
            Set<String> setF = lVar != null ? lVar.f("displayedContactItems") : null;
            if (setF == null) {
                setF = B0.f406639b;
            }
            LinkedHashSet linkedHashSetO0 = C42745f0.O0(setF);
            linkedHashSetO0.add(str2);
            if (lVar != null) {
                lVar.putStringSet("displayedContactItems", linkedHashSetO0);
            }
            if (event2 != null) {
                c28266e.f83189d.O(new ParametrizedEvent(event2.getId(), event2.getVersion(), event2.getParams()));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertContactsPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert_core.contactbar.e$g */
    public /* synthetic */ class g extends kotlin.jvm.internal.H implements Y41.l<String, Boolean> {
        @Override // Y41.l
        public final Boolean invoke(String str) {
            String str2 = str;
            AK0.l lVar = ((C28266e) this.receiver).f83205l;
            Set<String> setF = lVar != null ? lVar.f("displayedContactItems") : null;
            if (setF == null) {
                setF = B0.f406639b;
            }
            return Boolean.valueOf(setF.contains(str2));
        }
    }

    /* compiled from: AdvertContactsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert_core/contactbar/e$h", "Lcom/avito/android/component/advert_contact_bar/ContactBar$c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert_core.contactbar.e$h */
    public static final class h implements ContactBar.c {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ContactBarData f83227b;

        public h(ContactBarData contactBarData) {
            this.f83227b = contactBarData;
        }

        @Override // com.avito.android.component.advert_contact_bar.ContactBar.c
        public final void a(@Y61.k InterfaceC13531b interfaceC13531b) {
            C28266e.this.f83159C.accept(interfaceC13531b);
        }

        @Override // com.avito.android.component.advert_contact_bar.ContactBar.c
        public final void b(@Y61.k ContactBar.Button.Action action) {
            C28266e c28266e = C28266e.this;
            c28266e.f83169M = this.f83227b;
            c28266e.f83158B.accept(action);
        }

        @Override // com.avito.android.component.advert_contact_bar.ContactBar.c
        public final void c(@Y61.k ContactBar.Button.Target target) {
            C28266e.this.f83157A.accept(target);
        }
    }

    /* compiled from: AdvertContactsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "notified", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_core.contactbar.e$i */
    public static final class i<T> implements l41.g {
        public i() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.advert_core.advert.c cVar;
            if (!((Boolean) obj).booleanValue() || (cVar = C28266e.this.f83171O) == null) {
                return;
            }
            cVar.na();
        }
    }

    /* compiled from: AdvertContactsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_core.contactbar.e$j */
    public static final class j<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final j<T> f83229b = new j<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.c("AdvertDetailsContactsPresenter", "Failed to send message about call", (Throwable) obj);
        }
    }

    /* compiled from: AdvertContactsPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_core.contactbar.e$k */
    public static final class k extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final k f83230l = new k();

        public k() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    @Inject
    public C28266e(@Y61.k l90.n nVar, @Y61.k com.avito.android.advert_core.messenger.a aVar, @Y61.k WL.a aVar2, @Y61.k com.avito.android.advert_core.analytics.a aVar3, @Y61.k com.avito.android.account.E e12, @Y61.k InterfaceC35945t1<AdvertPrice> interfaceC35945t1, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k C29640d c29640d, @Y61.k B2 b22, @Y61.k SourceScreen sourceScreen, @Y61.l AK0.l lVar, @Y61.k com.avito.android.deal_confirmation.d dVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar4, @Y61.k W9.c cVar, @Y61.k ProgressInfoToastBarPresenter progressInfoToastBarPresenter, @Y61.l InterfaceC13095a interfaceC13095a, @Y61.k C c12, @Y61.k com.avito.android.delayed_ux_feedback.d dVar2, @Y61.k C19864a c19864a, @Y61.k InterfaceC14060a interfaceC14060a, @Y61.k com.avito.android.advert_core.safedeal.trust_factors.a aVar5, @Y61.k R0 r02, @Y61.k com.avito.android.progress_info_toast_bar.interactor.g gVar, @Y61.l InterfaceC14024a interfaceC14024a) {
        this.f83183a = nVar;
        this.f83185b = aVar;
        this.f83187c = aVar2;
        this.f83189d = aVar3;
        this.f83191e = e12;
        this.f83193f = interfaceC35945t1;
        this.f83195g = interfaceC28373a;
        this.f83197h = interfaceC35745a5;
        this.f83199i = c29640d;
        this.f83201j = b22;
        this.f83203k = sourceScreen;
        this.f83205l = lVar;
        this.f83207m = dVar;
        this.f83208n = aVar4;
        this.f83209o = cVar;
        this.f83210p = progressInfoToastBarPresenter;
        this.f83211q = interfaceC13095a;
        this.f83212r = c12;
        this.f83213s = dVar2;
        this.f83214t = c19864a;
        this.f83215u = interfaceC14060a;
        this.f83216v = aVar5;
        this.f83217w = gVar;
        this.f83218x = interfaceC14024a;
        this.f83219y = ShowSellersProfileSource.f84283d;
        this.f83220z = "item";
        this.f83157A = new com.jakewharton.rxrelay3.c<>();
        this.f83158B = new com.jakewharton.rxrelay3.c<>();
        this.f83159C = new com.jakewharton.rxrelay3.c<>();
        this.f83160D = new com.jakewharton.rxrelay3.c<>();
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f83163G = c42784z0;
        this.f83164H = new LinkedHashMap();
        this.f83166J = c42784z0;
        this.f83167K = c42784z0;
        this.f83170N = new LinkedHashSet();
        this.f83176T = new ArrayList();
        this.f83177U = new ArrayList();
        this.f83179W = new io.reactivex.rxjava3.disposables.c();
        this.f83180X = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
        this.f83194f0 = true;
        this.f83196g0 = k.f83230l;
        this.f83198h0 = new com.jakewharton.rxrelay3.c<>();
        this.f83200i0 = new com.jakewharton.rxrelay3.c<>();
        this.f83202j0 = new com.jakewharton.rxrelay3.c<>();
        this.f83204k0 = UUID.randomUUID().toString();
        this.f83206l0 = new com.jakewharton.rxrelay3.c<>();
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    @Y61.k
    public final Bundle H() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("phoneLink", this.f83173Q);
        bundle.putBoolean("shoudNotifySeller", this.f83174R);
        bundle.putBoolean("dialerOpen", this.f83184a0);
        bundle.putBoolean("needEmitCall", this.f83194f0);
        bundle.putBoolean("shouldShowAnimatedStickyBlock", this.f83165I);
        bundle.putString("callIdForEmitCall", this.f83192e0);
        bundle.putLong("startTimeToOpenDialer", this.f83186b0);
        com.avito.android.util.G.e("actionsForSticky", bundle, this.f83166J);
        com.avito.android.util.G.e("actionsForEmbedded", bundle, this.f83167K);
        this.f83210p.a(bundle);
        return bundle;
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    /* renamed from: Ma, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF83200i0() {
        return this.f83200i0;
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void Na(@Y61.k ShowSellersProfileSource showSellersProfileSource) {
        this.f83219y = showSellersProfileSource;
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void Oa(@Y61.k List<? extends ContactBar.InfoStickyBlock> list, @Y61.k AdvertDetails advertDetails) {
        List<? extends ContactBar.InfoStickyBlock> listInvoke;
        C c12 = this.f83212r;
        c12.getClass();
        boolean zIsEmpty = list.isEmpty();
        com.avito.android.advert_core.safedeal.trust_factors.a aVar = c12.f83111b;
        if (zIsEmpty) {
            listInvoke = aVar.f84278c;
        } else {
            listInvoke = new E(list, c12).invoke(aVar.f84278c);
            aVar.f84278c = listInvoke;
        }
        this.f83163G = listInvoke;
        this.f83166J = c12.c(advertDetails);
        this.f83160D.accept(G0.f406611a);
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final boolean Pa() {
        return this.f83184a0 && (((System.currentTimeMillis() - this.f83186b0) > 10000L ? 1 : ((System.currentTimeMillis() - this.f83186b0) == 10000L ? 0 : -1)) > 0);
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    @Y61.k
    /* renamed from: Q1, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF83206l0() {
        return this.f83206l0;
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void Qa(@Y61.k com.avito.android.advert_core.advert.b bVar) {
        this.f83172P = bVar;
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void R1(boolean z12) {
        ContactBarData contactBarData = this.f83169M;
        if (contactBarData == null) {
            return;
        }
        SellerOnlineStatus sellerOnlineStatusCopy$default = SellerOnlineStatus.copy$default(contactBarData.getOnlineStatus(), z12, null, 2, null);
        SellerOnlineStatus sellerOnlineStatus = sellerOnlineStatusCopy$default;
        this.f83169M = contactBarData.copy(((-3) & 1) != 0 ? contactBarData.name : null, ((-3) & 2) != 0 ? contactBarData.onlineStatus : sellerOnlineStatusCopy$default, ((-3) & 4) != 0 ? contactBarData.avatar : null, ((-3) & 8) != 0 ? contactBarData.iconType : null, ((-3) & 16) != 0 ? contactBarData.advertId : null, ((-3) & 32) != 0 ? contactBarData.advertTitle : null, ((-3) & 64) != 0 ? contactBarData.advertDescription : null, ((-3) & 128) != 0 ? contactBarData.advertPrice : null, ((-3) & 256) != 0 ? contactBarData.advertImage : null, ((-3) & 512) != 0 ? contactBarData.sellerType : null, ((-3) & 1024) != 0 ? contactBarData.categoryId : null, ((-3) & 2048) != 0 ? contactBarData.adjustCategoryId : null, ((-3) & 4096) != 0 ? contactBarData.adjustCategoryAlias : null, ((-3) & 8192) != 0 ? contactBarData.isFromCompany : false, ((-3) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? contactBarData.metroId : null, ((-3) & 32768) != 0 ? contactBarData.userHashId : null, ((-3) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? contactBarData.userKey : null, ((-3) & 131072) != 0 ? contactBarData.locationId : null, ((-3) & 262144) != 0 ? contactBarData.shopId : null, ((-3) & 524288) != 0 ? contactBarData.verticalAlias : null, ((-3) & 1048576) != 0 ? contactBarData.microCategoryId : null, ((-3) & 2097152) != 0 ? contactBarData.vehicleType : null, ((-3) & 4194304) != 0 ? contactBarData.source : null, ((-3) & 8388608) != 0 ? contactBarData.showTrade : false, ((-3) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? contactBarData.iceBreakers : null, ((-3) & 33554432) != 0 ? contactBarData.customerValue : null, ((-3) & 67108864) != 0 ? contactBarData.viewItemAndBuyerEventsParams : null, ((-3) & 134217728) != 0 ? contactBarData.sellerRating : null, ((-3) & 268435456) != 0 ? contactBarData.trackVacanciesSurvey : false, ((-3) & 536870912) != 0 ? contactBarData.hideStatusContainer : false, ((-3) & 1073741824) != 0 ? contactBarData.showOnlineStatusBottom : false, ((-3) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? contactBarData.isSimpleContactBar : false, (255 & 1) != 0 ? contactBarData.advantages : null, (255 & 2) != 0 ? contactBarData.contactsTitle : null, (255 & 4) != 0 ? contactBarData.hideContactBarButtons : false, (255 & 8) != 0 ? contactBarData.hasPriorityMethod : false, (255 & 16) != 0 ? contactBarData.hasInstallmentsStickyBlock : false, (255 & 32) != 0 ? contactBarData.jobRknDisclaimer : null, (255 & 64) != 0 ? contactBarData.earlyAccessStatus : null, (255 & 128) != 0 ? contactBarData.showOnlineStatusWithSellerType : false);
        if (contactBarData.getEarlyAccessStatus() == null) {
            for (w wVar : this.f83170N) {
                String name = contactBarData.getName();
                ServiceSellerType sellerType = contactBarData.getSellerType();
                String text = sellerType != null ? sellerType.getText() : null;
                if (text == null) {
                    text = "";
                }
                SellerOnlineStatus sellerOnlineStatus2 = sellerOnlineStatus;
                wVar.op(name, text, sellerOnlineStatus2);
                sellerOnlineStatus = sellerOnlineStatus2;
            }
        }
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void Ra(@Y61.l String str) {
        this.f83181Y = str;
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void Sa(@Y61.k String str) {
        this.f83220z = str;
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    @Y61.k
    /* renamed from: Ta, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF83157A() {
        return this.f83157A;
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    @Y61.k
    public final List<ContactBar.Button> Ua() {
        return this.f83166J;
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    @Y61.k
    public final List<ContactBar.InfoStickyBlock> Va() {
        return this.f83163G;
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void Wa() {
        this.f83184a0 = true;
        this.f83186b0 = System.currentTimeMillis();
        this.f83184a0 = false;
        this.f83173Q = null;
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void Xa() {
        this.f83173Q = null;
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    /* renamed from: Ya, reason: from getter */
    public final boolean getF83165I() {
        return this.f83165I;
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void Za(@Y61.k w wVar) {
        this.f83170N.remove(wVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c6  */
    /* JADX WARN: Type inference failed for: r2v48, types: [com.avito.android.advert_core.advert.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v50, types: [com.avito.android.advert_core.advert.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [com.avito.android.advert_core.advert.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [com.avito.android.advert_core.advert.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [com.avito.android.advert_core.advert.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [com.avito.android.advert_core.advert.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22, types: [com.avito.android.advert_core.advert.b, java.lang.Object] */
    @j.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.k com.avito.android.deep_linking.links.DeepLink r30) {
        /*
            Method dump skipped, instructions count: 974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_core.contactbar.C28266e.a(com.avito.android.deep_linking.links.DeepLink):void");
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void ab(@Y61.k AdvertDetails advertDetails) {
        LinkedHashMap linkedHashMap = this.f83164H;
        StickyBlock stickyBlock = advertDetails.getStickyBlock();
        linkedHashMap.put("stickyBlock", stickyBlock != null ? stickyBlock.d() : null);
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void b(@Y61.l Bundle bundle) {
        List<? extends ContactBar.Button> parcelableArrayList;
        List<? extends ContactBar.Button> parcelableArrayList2;
        this.f83173Q = bundle != null ? (DeepLink) bundle.getParcelable("phoneLink") : null;
        this.f83174R = bundle != null ? bundle.getBoolean("shoudNotifySeller") : false;
        this.f83184a0 = bundle != null ? bundle.getBoolean("dialerOpen") : false;
        this.f83194f0 = bundle != null ? bundle.getBoolean("needEmitCall") : false;
        this.f83165I = bundle != null ? bundle.getBoolean("shouldShowAnimatedStickyBlock") : false;
        this.f83192e0 = bundle != null ? bundle.getString("callIdForEmitCall") : null;
        this.f83186b0 = bundle != null ? bundle.getLong("startTimeToOpenDialer") : 0L;
        if (bundle == null || (parcelableArrayList = bundle.getParcelableArrayList("actionsForSticky")) == null) {
            parcelableArrayList = C42784z0.f406748b;
        }
        this.f83166J = parcelableArrayList;
        if (bundle == null || (parcelableArrayList2 = bundle.getParcelableArrayList("actionsForEmbedded")) == null) {
            parcelableArrayList2 = C42784z0.f406748b;
        }
        this.f83167K = parcelableArrayList2;
        this.f83210p.b(bundle);
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void bb(@Y61.l com.avito.android.advert_core.advert.c cVar) {
        this.f83171O = cVar;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f83208n;
        io.reactivex.rxjava3.internal.observers.y yVarH = A1.h(aVar.V9(), null, new o(this), 3);
        io.reactivex.rxjava3.disposables.c cVar2 = this.f83179W;
        cVar2.b(yVarH);
        cVar2.b(A1.h(aVar.V9().N(p.f83241b), null, new q(this), 3));
        cVar2.b(A1.h(kotlinx.coroutines.rx3.y.b(this.f83217w.b(this.f83204k0)), null, new t(this), 3));
    }

    public final void c() {
        ContactBarData contactBarData;
        C29640d c29640d = this.f83199i;
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[7];
        if (((Boolean) c29640d.f132206i.a().invoke()).booleanValue() && (contactBarData = this.f83169M) != null && L.f(contactBarData.getCategoryId(), "24")) {
            boolean zR2 = C42745f0.r(v.f83271a, contactBarData.getMicroCategoryId());
            InterfaceC28373a interfaceC28373a = this.f83195g;
            if (zR2) {
                interfaceC28373a.c(new C44599a(contactBarData.getViewItemAndBuyerEventsParams(), contactBarData.getAdvertId(), contactBarData.getCustomerValue()));
                String str = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).format(new Date());
                AK0.l lVar = this.f83205l;
                String string = lVar != null ? lVar.getString("buyerEventLastDay") : null;
                if (string == null || !string.equals(str)) {
                    if (lVar != null) {
                        lVar.putString("buyerEventLastDay", str);
                    }
                    contactBarData.getAdvertId();
                    interfaceC28373a.c(new o8.c(contactBarData.getCustomerValue(), contactBarData.getViewItemAndBuyerEventsParams()));
                }
            }
            if (C42745f0.r(v.f83272b, contactBarData.getMicroCategoryId())) {
                contactBarData.getAdvertId();
                interfaceC28373a.c(new o8.o(contactBarData.getCustomerValue(), contactBarData.getViewItemAndBuyerEventsParams()));
            }
        }
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    @Y61.k
    /* renamed from: cb, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF83159C() {
        return this.f83159C;
    }

    public final void d() {
        ContactBarData contactBarData = this.f83169M;
        if (contactBarData != null) {
            if (contactBarData.getAdjustCategoryId() == null && contactBarData.getAdjustCategoryAlias() == null) {
                return;
            }
            this.f83195g.c(new o8.e(contactBarData.getAdjustCategoryId(), contactBarData.getAdjustCategoryAlias(), contactBarData.getAdvertId(), contactBarData.getCustomerValue(), contactBarData.getViewItemAndBuyerEventsParams()));
        }
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void db() {
        this.f83184a0 = false;
        this.f83186b0 = 0L;
    }

    public final void e() {
        String advertId;
        Map<String, String> viewItemAndBuyerEventsParams;
        String str;
        ContactBarData contactBarData;
        String advertId2;
        String email = this.f83183a.e().getEmail();
        ContactBarData contactBarData2 = this.f83169M;
        if (contactBarData2 == null || (advertId = contactBarData2.getAdvertId()) == null) {
            return;
        }
        ContactBarData contactBarData3 = this.f83169M;
        Double customerValue = contactBarData3 != null ? contactBarData3.getCustomerValue() : null;
        ContactBarData contactBarData4 = this.f83169M;
        o8.f fVar = new o8.f(email, advertId, customerValue, contactBarData4 != null ? contactBarData4.getViewItemAndBuyerEventsParams() : null);
        InterfaceC28373a interfaceC28373a = this.f83195g;
        interfaceC28373a.c(fVar);
        ContactBarData contactBarData5 = this.f83169M;
        if (contactBarData5 == null || (viewItemAndBuyerEventsParams = contactBarData5.getViewItemAndBuyerEventsParams()) == null || (str = viewItemAndBuyerEventsParams.get("logcat")) == null || !i(str, "global") || (contactBarData = this.f83169M) == null || (advertId2 = contactBarData.getAdvertId()) == null) {
            return;
        }
        ContactBarData contactBarData6 = this.f83169M;
        Double customerValue2 = contactBarData6 != null ? contactBarData6.getCustomerValue() : null;
        ContactBarData contactBarData7 = this.f83169M;
        interfaceC28373a.c(new o8.k(contactBarData7 != null ? contactBarData7.getViewItemAndBuyerEventsParams() : null, advertId2, customerValue2));
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void e0() {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f83175S;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f83175S = null;
        ArrayList arrayList = this.f83176T;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((io.reactivex.rxjava3.disposables.d) it.next()).dispose();
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f83177U;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            io.reactivex.rxjava3.disposables.d dVar = (io.reactivex.rxjava3.disposables.d) it2.next();
            if (dVar != null) {
                dVar.dispose();
            }
        }
        arrayList2.clear();
        io.reactivex.rxjava3.internal.observers.y yVar2 = this.f83178V;
        if (yVar2 != null) {
            DisposableHelper.a(yVar2);
        }
        this.f83178V = null;
        io.reactivex.rxjava3.internal.observers.m mVar = this.f83188c0;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        this.f83188c0 = null;
        this.f83179W.e();
        Q0.d(this.f83180X.f411905b);
        this.f83170N.clear();
        this.f83171O = null;
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void eb(@Y61.k AdvertDetails advertDetails) {
        List<? extends ContactBar.Button> list = this.f83166J;
        C c12 = this.f83212r;
        this.f83166J = c12.i(list, advertDetails);
        this.f83167K = c12.i(this.f83167K, advertDetails);
        this.f83160D.accept(G0.f406611a);
    }

    public final void f() {
        String microCategoryId;
        ContactBarData contactBarData = this.f83169M;
        if (contactBarData == null || (microCategoryId = contactBarData.getMicroCategoryId()) == null) {
            return;
        }
        this.f83195g.c(new o8.h(contactBarData.getVerticalAlias(), contactBarData.getCustomerValue(), microCategoryId, contactBarData.getAdvertId(), contactBarData.getViewItemAndBuyerEventsParams()));
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void fb(@Y61.l w wVar, @Y61.l ContactBarData contactBarData) {
        if (wVar != null) {
            boolean zHasRatingDeeplink = contactBarData != null ? contactBarData.hasRatingDeeplink() : false;
            this.f83176T.add(wVar.Cz(zHasRatingDeeplink ? C42745f0.U(ContactBar.ContainerClickType.f125103d, ContactBar.ContainerClickType.f125101b) : C42745f0.U(ContactBar.ContainerClickType.f125103d, ContactBar.ContainerClickType.f125101b, ContactBar.ContainerClickType.f125102c)).t0(this.f83198h0));
            ArrayList arrayList = this.f83177U;
            io.reactivex.rxjava3.core.z<G0> zVarH70 = wVar.H70(zHasRatingDeeplink);
            arrayList.add(zVarH70 != null ? zVarH70.v0(new b(contactBarData), c.f83223b, io.reactivex.rxjava3.internal.functions.a.f401993c) : null);
            this.f83179W.b(wVar.getF83108j().t0(this.f83206l0));
        }
    }

    public final void g() {
        ContactBarData contactBarData = this.f83169M;
        if (contactBarData == null || !contactBarData.getVehicleType().isNewAuto()) {
            return;
        }
        this.f83195g.c(new o8.i(contactBarData.getViewItemAndBuyerEventsParams(), contactBarData.getAdvertId(), contactBarData.getCustomerValue()));
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void g0(@Y61.l String str) {
        this.f83182Z = str;
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void gb(@Y61.k AdvertDetails advertDetails) {
        Boolean boolC;
        StickyBlock stickyBlock = advertDetails.getStickyBlock();
        this.f83165I = (stickyBlock == null || (boolC = stickyBlock.getShouldShowAnimated()) == null) ? false : boolC.booleanValue();
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    @Y61.l
    /* renamed from: getPosition, reason: from getter */
    public final ContactsPosition getF83162F() {
        return this.f83162F;
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    @Y61.l
    /* renamed from: getTitle, reason: from getter */
    public final AttributedText getF83161E() {
        return this.f83161E;
    }

    public final void h() {
        Map<String, String> viewItemAndBuyerEventsParams;
        String str;
        ContactBarData contactBarData = this.f83169M;
        if (contactBarData == null || (viewItemAndBuyerEventsParams = contactBarData.getViewItemAndBuyerEventsParams()) == null || (str = viewItemAndBuyerEventsParams.get("logcat")) == null) {
            return;
        }
        ContactBarData contactBarData2 = this.f83169M;
        if ((contactBarData2 != null ? contactBarData2.getVerticalAlias() : null) == AdvertisementVerticalAlias.REALTY && i(str, "re")) {
            ContactBarData contactBarData3 = this.f83169M;
            Double customerValue = contactBarData3 != null ? contactBarData3.getCustomerValue() : null;
            ContactBarData contactBarData4 = this.f83169M;
            this.f83195g.c(new o8.m(customerValue, contactBarData4 != null ? contactBarData4.getViewItemAndBuyerEventsParams() : null));
        }
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    @Y61.k
    /* renamed from: hb, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF83160D() {
        return this.f83160D;
    }

    public final boolean i(String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        AK0.l lVar = this.f83205l;
        if (lVar == null) {
            return false;
        }
        if (TimeUnit.DAYS.convert(jCurrentTimeMillis - lVar.getLong("first_time_run", 0L), TimeUnit.MILLISECONDS) > 364) {
            return false;
        }
        if (lVar.c(str2 + '_' + str)) {
            return false;
        }
        lVar.putBoolean(str2 + '_' + str, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void ib(@Y61.k Y41.a<G0> aVar) {
        this.f83196g0 = (N) aVar;
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void jb(@Y61.k AdvertDetails advertDetails) {
        this.f83168L = advertDetails;
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void k0(@Y61.l Parcelable parcelable) {
        DeepLink deepLink = parcelable instanceof DeepLink ? (DeepLink) parcelable : null;
        if (deepLink != null) {
            a(deepLink);
        }
    }

    @Override // S9.a
    @Y61.k
    /* renamed from: kb, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF85563d() {
        return this.f83198h0;
    }

    @Override // S9.a
    @Y61.k
    /* renamed from: lb, reason: from getter */
    public final ShowSellersProfileSource getF85561b() {
        return this.f83219y;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.avito.android.advert_core.advert.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.avito.android.advert_core.advert.b, java.lang.Object] */
    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void mb(@Y61.k DeepLink deepLink) {
        String advertId;
        ContactBarData contactBarData = this.f83169M;
        if (contactBarData != null && (advertId = contactBarData.getAdvertId()) != null) {
            this.f83195g.c(new o8.v(this.f83183a.e().getEmail(), advertId));
        }
        e();
        h();
        d();
        g();
        c();
        f();
        if (this.f83191e.b()) {
            InterfaceC13095a interfaceC13095a = this.f83211q;
            Bundle bundleB = L.f(interfaceC13095a != null ? interfaceC13095a.d() : null, "1") ? C22777e.b(new Q("key_disclaimer_pd", interfaceC13095a.f())) : null;
            ?? r12 = this.f83172P;
            if (r12 != 0) {
                b.a.a(r12, deepLink, bundleB, 2);
            }
        } else {
            ?? r02 = this.f83172P;
            if (r02 != 0) {
                AuthSource authSource = AuthSource.f92694c;
                r02.m(deepLink, "mi");
            }
        }
        this.f83184a0 = false;
        this.f83186b0 = System.currentTimeMillis();
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void nb(@Y61.k String str) {
        String advertId;
        boolean z12 = System.currentTimeMillis() - this.f83186b0 > 10000;
        if (this.f83184a0) {
            if (!z12) {
                B2 b22 = this.f83201j;
                b22.getClass();
                kotlin.reflect.n<Object> nVar = B2.f67184X[1];
                if (((Boolean) b22.f67209c.a().invoke()).booleanValue()) {
                    return;
                }
            }
            ContactBarData contactBarData = this.f83169M;
            if (contactBarData == null || (advertId = contactBarData.getAdvertId()) == null) {
                return;
            }
            this.f83207m.a(advertId, str);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.avito.android.advert_core.advert.b, java.lang.Object] */
    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void ob(@Y61.k PhoneLink phoneLink) {
        Bundle bundleM = com.avito.android.actions_sheet.a.m("key_source_name", "button");
        ?? r12 = this.f83172P;
        if (r12 != 0) {
            r12.g(bundleM, phoneLink, "req_key_advert_contacts_phone_call");
        }
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void onPause() {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f83190d0;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f83210p.onPause();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            r4 = this;
            io.reactivex.rxjava3.internal.observers.m r0 = r4.f83188c0
            if (r0 == 0) goto L7
            io.reactivex.rxjava3.internal.disposables.DisposableHelper.a(r0)
        L7:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.f83186b0
            long r0 = r0 - r2
            r2 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L17
            r0 = r1
            goto L18
        L17:
            r0 = 0
        L18:
            boolean r2 = r4.f83184a0
            if (r2 == 0) goto L4c
            if (r0 != 0) goto L39
            com.avito.android.B2 r0 = r4.f83201j
            r0.getClass()
            kotlin.reflect.n<java.lang.Object>[] r2 = com.avito.android.B2.f67184X
            r1 = r2[r1]
            com.avito.android.A0$a r0 = r0.f67209c
            DE0.a r0 = r0.a()
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L4c
        L39:
            com.avito.android.remote.model.advert_details.ContactBarData r0 = r4.f83169M
            if (r0 == 0) goto L4c
            java.lang.String r0 = r0.getAdvertId()
            if (r0 == 0) goto L4c
            com.avito.android.deal_confirmation.d r1 = r4.f83207m
            java.lang.String r2 = "card"
            io.reactivex.rxjava3.internal.operators.single.U r0 = r1.c(r0, r2)
            goto L52
        L4c:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            io.reactivex.rxjava3.internal.operators.single.M r0 = io.reactivex.rxjava3.core.I.q(r0)
        L52:
            com.avito.android.advert_core.contactbar.k r1 = new com.avito.android.advert_core.contactbar.k
            r1.<init>(r4)
            io.reactivex.rxjava3.internal.operators.single.y r0 = r0.n(r1)
            com.avito.android.advert_core.contactbar.l r1 = new com.avito.android.advert_core.contactbar.l
            r1.<init>(r4)
            io.reactivex.rxjava3.internal.operators.single.y r0 = r0.n(r1)
            com.avito.android.advert_core.contactbar.m r1 = com.avito.android.advert_core.contactbar.m.f83238l
            com.avito.android.advert_core.contactbar.n r2 = new com.avito.android.advert_core.contactbar.n
            r2.<init>(r4)
            io.reactivex.rxjava3.internal.observers.m r0 = io.reactivex.rxjava3.kotlin.A1.e(r0, r1, r2)
            r4.f83188c0 = r0
            com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter r0 = r4.f83210p
            r0.onResume()
            BK0.a r0 = r0.getF231563e()
            com.avito.android.util.a5 r1 = r4.f83197h
            io.reactivex.rxjava3.core.H r1 = r1.e()
            io.reactivex.rxjava3.internal.operators.observable.I0 r0 = r0.j0(r1)
            com.avito.android.advert_core.contactbar.r r1 = new com.avito.android.advert_core.contactbar.r
            r1.<init>(r4)
            com.avito.android.advert_core.contactbar.s<T> r2 = com.avito.android.advert_core.contactbar.s.f83244b
            l41.a r3 = io.reactivex.rxjava3.internal.functions.a.f401993c
            io.reactivex.rxjava3.disposables.d r0 = r0.v0(r1, r2, r3)
            io.reactivex.rxjava3.internal.observers.y r0 = (io.reactivex.rxjava3.internal.observers.y) r0
            r4.f83190d0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_core.contactbar.C28266e.onResume():void");
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void onStop() {
        io.reactivex.rxjava3.internal.observers.m mVar = this.f83188c0;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        this.f83188c0 = null;
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void pb() {
        String advertId;
        ContactBarData contactBarData = this.f83169M;
        if (contactBarData == null || (advertId = contactBarData.getAdvertId()) == null || !this.f83174R) {
            return;
        }
        this.f83174R = false;
        this.f83179W.b(this.f83185b.b(advertId).s(this.f83197h.e()).x(new i(), j.f83229b));
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void qb() {
        String advertId;
        ContactBarData contactBarData = this.f83169M;
        if (contactBarData == null || (advertId = contactBarData.getAdvertId()) == null) {
            return;
        }
        this.f83195g.c(new W0(advertId, "button"));
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void rb() {
        com.avito.android.advert_core.advert.c cVar;
        DeepLink deepLink = this.f83173Q;
        PhoneLink.Call call = deepLink instanceof PhoneLink.Call ? (PhoneLink.Call) deepLink : null;
        if (call == null || (cVar = this.f83171O) == null) {
            return;
        }
        cVar.ja(call);
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    @Y61.k
    /* renamed from: sb, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF83202j0() {
        return this.f83202j0;
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    @Y61.k
    public final List<ContactBar.Button> tb() {
        return this.f83167K;
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void ub(@Y61.l String str) {
        Object next;
        DeepLink deepLink;
        this.f83192e0 = str;
        if (str != null && this.f83194f0 && this.f83191e.b()) {
            t0 t0Var = new t0(2);
            t0Var.b(this.f83167K.toArray(new ContactBar.Button[0]));
            t0Var.b(this.f83166J.toArray(new ContactBar.Button[0]));
            ArrayList<Object> arrayList = t0Var.f406850a;
            List listU = C42745f0.U(arrayList.toArray(new ContactBar.Button[arrayList.size()]));
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listU) {
                if (obj instanceof ContactBar.Button.Action) {
                    arrayList2.add(obj);
                }
            }
            Iterator it = arrayList2.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((ContactBar.Button.Action) next).f125043g == ContactBar.Button.Action.Type.f125058b) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ContactBar.Button.Action action = (ContactBar.Button.Action) next;
            if (action == null || (deepLink = action.f125041e) == null) {
                return;
            }
            a(deepLink);
        }
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void vb(@Y61.l w wVar, @Y61.l ContactBarData contactBarData, @Y61.k List<? extends ContactBar.Button> list, @Y61.k List<? extends ContactBar.InfoStickyBlock> list2, @Y61.l ContactBar.b bVar) {
        if (wVar == null) {
            return;
        }
        this.f83169M = contactBarData;
        this.f83170N.add(wVar);
        io.reactivex.rxjava3.internal.observers.y yVar = this.f83178V;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f83178V = (io.reactivex.rxjava3.internal.observers.y) this.f83158B.C0(500L, TimeUnit.MILLISECONDS, this.f83197h.c()).v0(new d(), C2465e.f83225b, io.reactivex.rxjava3.internal.functions.a.f401993c);
        wVar.LW(contactBarData, list, list2, this.f83164H, bVar, new f(2, this, C28266e.class, "onTooltipDismissed", "onTooltipDismissed(Ljava/lang/String;Lcom/avito/android/remote/safedeal/SafeDeal$TooltipData$Event;)V", 0), new g(1, this, C28266e.class, "isContactItemDisplayed", "isContactItemDisplayed(Ljava/lang/String;)Z", 0), new h(contactBarData));
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void wb(@Y61.l AdvertActions advertActions) {
        if (advertActions == null) {
            return;
        }
        PriorityContactsMethod priorityMethod = advertActions.getPriorityMethod();
        C c12 = this.f83212r;
        if (priorityMethod != null) {
            ArrayList arrayListH = c12.h(advertActions);
            this.f83166J = arrayListH;
            this.f83167K = arrayListH;
        } else {
            ArrayList arrayListG = c12.g(advertActions, false, false);
            this.f83166J = arrayListG;
            this.f83167K = arrayListG;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.avito.android.advert_core.advert.b, java.lang.Object] */
    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void xb(@Y61.k com.avito.android.credits.installments.a aVar, @Y61.k AdvertDetails advertDetails) {
        Object next;
        DeepLink deepLink;
        ContactBar.Button.Target target = null;
        if (!(aVar instanceof a.c)) {
            if (!(aVar instanceof a.b)) {
                boolean z12 = aVar instanceof a.C3820a;
                return;
            }
            ?? r22 = this.f83172P;
            if (r22 != 0) {
                b.a.a(r22, ((a.b) aVar).f128862a, null, 6);
                return;
            }
            return;
        }
        a.c cVar = (a.c) aVar;
        C28269h c28269h = new C28269h(cVar);
        com.avito.android.advert_core.safedeal.trust_factors.a aVar2 = this.f83216v;
        List<? extends ContactBar.InfoStickyBlock> listInvoke = c28269h.invoke(aVar2.f84278c);
        aVar2.f84278c = listInvoke;
        this.f83163G = listInvoke;
        boolean z13 = cVar.f128863a;
        C c12 = this.f83212r;
        if (z13) {
            Iterator<T> it = listInvoke.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (next instanceof ContactBar.InfoStickyBlock.InstallmentsActionToggle) {
                        break;
                    }
                }
            }
            if (!(next instanceof ContactBar.InfoStickyBlock.InstallmentsActionToggle)) {
                next = null;
            }
            ContactBar.InfoStickyBlock.InstallmentsActionToggle installmentsActionToggle = (ContactBar.InfoStickyBlock.InstallmentsActionToggle) next;
            if (installmentsActionToggle != null) {
                c12.getClass();
                String str = installmentsActionToggle.f125127f;
                if (str != null && (deepLink = installmentsActionToggle.f125128g) != null) {
                    target = new ContactBar.Button.Target(str, null, deepLink, false, "avitoRe23", "primaryLarge", null, ContactBar.Button.Target.Type.f125094k, null, false, null, 770, null);
                }
            }
            aVar2.f84279d = target;
        } else {
            aVar2.f84279d = null;
        }
        this.f83166J = c12.c(advertDetails);
        this.f83160D.accept(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v20, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v5, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v16, types: [com.avito.android.component.advert_contact_bar.ContactBar$InfoStickyBlock$DeliveryInfoSplitText] */
    /* JADX WARN: Type inference failed for: r7v18, types: [com.avito.android.component.advert_contact_bar.ContactBar$InfoStickyBlock$DeliveryInfoSpacing] */
    @Override // com.avito.android.advert_core.contactbar.InterfaceC28265d
    public final void yb(@Y61.k AdvertDetails advertDetails) {
        ?? arrayList;
        String contactBarButtonTitle;
        ?? arrayList2;
        DeliverySuggests.SelectionSettings selectionSettingsF;
        Map<String, DeliverySuggests.SelectionSettings.DeliveryOption> mapD;
        List<SafeDeal.Component> components;
        ContactBar.InfoStickyBlock.DeliveryInfoText deliveryInfoText;
        RecallMeParams recallParams;
        RecallMeParams recallParams2;
        AdvertActions contacts = advertDetails.getContacts();
        ?? E12 = 0;
        E12 = 0;
        E12 = 0;
        this.f83161E = contacts != null ? contacts.getTitle() : null;
        AdvertActions contacts2 = advertDetails.getContacts();
        this.f83162F = contacts2 != null ? contacts2.getPosition() : null;
        C c12 = this.f83212r;
        this.f83166J = c12.c(advertDetails);
        if (advertDetails.getRecallMeRequest() != null) {
            arrayList = new ArrayList();
            AdvertActions contacts3 = advertDetails.getContacts();
            Collection collectionG = contacts3 != null ? c12.g(contacts3, false, false) : null;
            if (collectionG == null) {
                collectionG = C42784z0.f406748b;
            }
            arrayList.addAll(collectionG);
            RecallMeRequest recallMeRequest = advertDetails.getRecallMeRequest();
            String title = (recallMeRequest == null || (recallParams2 = recallMeRequest.getRecallParams()) == null) ? null : recallParams2.getTitle();
            RecallMeRequest recallMeRequest2 = advertDetails.getRecallMeRequest();
            DeepLink deeplink = (recallMeRequest2 == null || (recallParams = recallMeRequest2.getRecallParams()) == null) ? null : recallParams.getDeeplink();
            if (title != null && deeplink != null) {
                arrayList.add(new ContactBar.Button.Target(title, null, deeplink, false, "avitoLookAndFeel", "primaryLarge", null, ContactBar.Button.Target.Type.f125090g, ContactBar.Button.Width.f125097b, false, null, 2, null));
            }
        } else {
            DevelopmentsAdvice developmentsAdvice = advertDetails.getDevelopmentsAdvice();
            if ((developmentsAdvice != null ? L.f(developmentsAdvice.getShouldShowInContactBar(), Boolean.TRUE) : false) && advertDetails.isRedesign()) {
                arrayList = new ArrayList();
                AdvertActions contacts4 = advertDetails.getContacts();
                List listG = contacts4 != null ? c12.g(contacts4, false, false) : null;
                if (listG == null) {
                    listG = C42784z0.f406748b;
                }
                if (listG.size() == 2) {
                    List list = listG;
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(list, 10));
                    int i12 = 0;
                    for (Object obj : list) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        ContactBar.Button.Action actionD = (ContactBar.Button.Action) obj;
                        if (i12 == 0) {
                            ContactBar.Button.Width width = ContactBar.Button.Width.f125097b;
                            actionD = ContactBar.Button.Action.d(actionD, false, 917503);
                        }
                        arrayList3.add(actionD);
                        i12 = i13;
                    }
                    listG = arrayList3;
                }
                arrayList.addAll(listG);
                DevelopmentsAdvice developmentsAdvice2 = advertDetails.getDevelopmentsAdvice();
                if (developmentsAdvice2 == null || (contactBarButtonTitle = developmentsAdvice2.getContactBarButtonTitle()) == null) {
                    contactBarButtonTitle = "";
                }
                arrayList.add(new ContactBar.Button.Target(contactBarButtonTitle, null, new NoMatchLink(), false, "avitoLookAndFeel", "primaryLarge", null, ContactBar.Button.Target.Type.f125091h, ContactBar.Button.Width.f125098c, false, null, 2, null));
            } else {
                arrayList = C42784z0.f406748b;
            }
        }
        Collection collectionH = (Collection) arrayList;
        if (collectionH.isEmpty()) {
            AdvertActions contacts5 = advertDetails.getContacts();
            if ((contacts5 != null ? contacts5.getPriorityMethod() : null) != null) {
                AdvertActions contacts6 = advertDetails.getContacts();
                collectionH = contacts6 != null ? c12.h(contacts6) : null;
                if (collectionH == null) {
                    collectionH = C42784z0.f406748b;
                }
            } else {
                AdvertActions contacts7 = advertDetails.getContacts();
                if (contacts7 != null) {
                    boolean z12 = advertDetails.getStickyBlock() != null;
                    Boolean isAutoSelectView = advertDetails.getIsAutoSelectView();
                    collectionH = c12.g(contacts7, z12, isAutoSelectView != null ? isAutoSelectView.booleanValue() : false);
                } else {
                    collectionH = null;
                }
                if (collectionH == null) {
                    collectionH = C42784z0.f406748b;
                }
            }
        }
        List<? extends ContactBar.Button> list2 = (List) collectionH;
        if (advertDetails.getMortgageBuyButton() != null) {
            ArrayList arrayList4 = new ArrayList(list2);
            MortgageBuyButton mortgageBuyButton = advertDetails.getMortgageBuyButton();
            boolean z13 = advertDetails.getMortgageCalculatorConfig() != null;
            if (arrayList4.size() <= 2 && mortgageBuyButton != null && z13) {
                String title2 = mortgageBuyButton.getTitle();
                DeepLink deeplink2 = mortgageBuyButton.getDeeplink();
                if (deeplink2 == null) {
                    deeplink2 = new NoMatchLink();
                }
                arrayList4.add(new ContactBar.Button.Target(title2, null, deeplink2, false, null, "secondaryLarge", null, ContactBar.Button.Target.Type.f125092i, null, false, "mortgageBuyButton", 770, null));
            }
            list2 = arrayList4;
        } else if (advertDetails.getAutotekaContactPurchaseAction() != null) {
            ArrayList arrayList5 = new ArrayList(list2);
            AutotekaPurchaseAction autotekaContactPurchaseAction = advertDetails.getAutotekaContactPurchaseAction();
            if (arrayList5.size() <= 2 && autotekaContactPurchaseAction != null) {
                AutotekaChoosingPurchaseButtonParams autotekaChoosingPurchaseButtonParamsB = com.avito.android.autoteka.helpers.b.b(com.avito.android.autoteka.helpers.b.f96647a, autotekaContactPurchaseAction, FromBlock.f96090j, null);
                arrayList5.add(new ContactBar.Button.Target(autotekaChoosingPurchaseButtonParamsB.f97069c, autotekaChoosingPurchaseButtonParamsB.f97070d, autotekaChoosingPurchaseButtonParamsB.f97068b, false, "avitoRe23", "buttonSecondaryExtraLarge", Integer.valueOf(R.drawable.autoteka_logo_without_text), ContactBar.Button.Target.Type.f125093j, null, false, null, 768, null));
            }
            list2 = arrayList5;
        }
        this.f83167K = list2;
        StickyBlock stickyBlock = advertDetails.getStickyBlock();
        if (stickyBlock == null || (components = stickyBlock.getComponents()) == null) {
            arrayList2 = C42784z0.f406748b;
        } else {
            arrayList2 = new ArrayList();
            for (SafeDeal.Component component : components) {
                if (component instanceof SafeDeal.Component.Spacing) {
                    deliveryInfoText = new ContactBar.InfoStickyBlock.DeliveryInfoSpacing(E12, ((SafeDeal.Component.Spacing) component).getHeight(), 1, E12);
                } else if (component instanceof SafeDeal.Component.SplitText) {
                    SafeDeal.Component.SplitText splitText = (SafeDeal.Component.SplitText) component;
                    deliveryInfoText = new ContactBar.InfoStickyBlock.DeliveryInfoSplitText(null, splitText.getLeftText(), splitText.getRightText(), 1, null);
                } else if (component instanceof SafeDeal.Component.Text) {
                    SafeDeal.Component.Text text = (SafeDeal.Component.Text) component;
                    AttributedText attributedText = text.getAttributedText();
                    ContactBar.Alignment.a aVar = ContactBar.Alignment.f125035b;
                    SafeDeal.Alignment alignment = text.getAlignment();
                    String strName = alignment != null ? alignment.name() : null;
                    aVar.getClass();
                    deliveryInfoText = new ContactBar.InfoStickyBlock.DeliveryInfoText(null, attributedText, L.f(strName, "CENTER") ? ContactBar.Alignment.CENTER : L.f(strName, "RIGHT") ? ContactBar.Alignment.RIGHT : ContactBar.Alignment.LEFT, text.getNumberOfLines(), 1, null);
                } else {
                    deliveryInfoText = null;
                }
                if (deliveryInfoText != null) {
                    arrayList2.add(deliveryInfoText);
                }
            }
        }
        com.avito.android.advert_core.safedeal.trust_factors.a aVar2 = c12.f83111b;
        List<? extends ContactBar.InfoStickyBlock> listC = aVar2.f84278c;
        if (listC.isEmpty()) {
            listC = null;
        }
        if (listC == null) {
            CreditBrokerProduct creditInfo = advertDetails.getCreditInfo();
            listC = creditInfo != null ? c12.f83115f.c(creditInfo) : null;
            if (listC == null) {
                listC = C42784z0.f406748b;
            }
        }
        List<? extends ContactBar.InfoStickyBlock> list3 = aVar2.f84278c;
        if (list3.isEmpty()) {
            list3 = null;
        }
        if (list3 == null) {
            DeliverySuggests deliverySuggests = advertDetails.getDeliverySuggests();
            if (deliverySuggests != null && (selectionSettingsF = deliverySuggests.getSelectionSettings()) != null && (mapD = selectionSettingsF.d()) != null) {
                E12 = c12.f83116g.e(mapD);
            }
            list3 = E12 == 0 ? C42784z0.f406748b : E12;
        }
        List<? extends ContactBar.InfoStickyBlock> listM0 = C42745f0.M0(C42745f0.P0(C42745f0.h0((Iterable) arrayList2, C42745f0.h0(list3, listC))));
        this.f83216v.f84278c = listM0;
        this.f83163G = listM0;
    }

    public /* synthetic */ C28266e(l90.n nVar, com.avito.android.advert_core.messenger.a aVar, WL.a aVar2, com.avito.android.advert_core.analytics.a aVar3, com.avito.android.account.E e12, InterfaceC35945t1 interfaceC35945t1, InterfaceC28373a interfaceC28373a, InterfaceC35745a5 interfaceC35745a5, C29640d c29640d, B2 b22, SourceScreen sourceScreen, AK0.l lVar, com.avito.android.deal_confirmation.d dVar, com.avito.android.deeplink_handler.handler.composite.a aVar4, W9.c cVar, ProgressInfoToastBarPresenter progressInfoToastBarPresenter, InterfaceC13095a interfaceC13095a, C c12, com.avito.android.delayed_ux_feedback.d dVar2, C19864a c19864a, InterfaceC14060a interfaceC14060a, com.avito.android.advert_core.safedeal.trust_factors.a aVar5, R0 r02, com.avito.android.progress_info_toast_bar.interactor.g gVar, InterfaceC14024a interfaceC14024a, int i12, C42822w c42822w) {
        this(nVar, aVar, aVar2, aVar3, e12, interfaceC35945t1, interfaceC28373a, interfaceC35745a5, c29640d, b22, sourceScreen, lVar, dVar, aVar4, cVar, progressInfoToastBarPresenter, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : interfaceC13095a, c12, dVar2, c19864a, interfaceC14060a, aVar5, r02, gVar, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : interfaceC14024a);
    }
}
