package com.avito.android.extended_profile.mvi;

import android.os.Bundle;
import com.avito.android.C29640d;
import com.avito.android.InterfaceC34162r0;
import com.avito.android.advertising.loaders.j;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.i1;
import com.avito.android.analytics_ratings_reviews.ReviewsOpenPageFrom;
import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestDeepLinkAnalyticsData;
import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestLink;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ExtendedProfilePhoneRequestLink;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.extended_profile.InterfaceC30394c;
import com.avito.android.extended_profile.di.r;
import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.extended_profile.mvi.entity.a;
import com.avito.android.extended_profile.search.d;
import com.avito.android.extended_profile_map.map.ExtendedProfileMapLink;
import com.avito.android.extended_profile_serp.deep_linking.ExtendedProfileSerpLink;
import com.avito.android.extended_profile_serp.deep_linking.ExtendedProfileSerpStartMode;
import com.avito.android.extended_profile_widgets.adapter.PremiumBannerItemClickAction;
import com.avito.android.extended_profile_widgets.adapter.carousel.CarouselItem;
import com.avito.android.extended_profile_widgets.adapter.job_company_carousel.JobCompanyCarouselItem;
import com.avito.android.extended_profile_widgets.adapter.search.ExtendedProfileSearchTabType;
import com.avito.android.extended_profile_widgets.adapter.search.search_advert.SearchAdvertItem;
import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.loyalty.links.BadgeBarShowListLink;
import com.avito.android.loyalty.links.BadgeBarShowV3Link;
import com.avito.android.remote.model.ActiveItemsPreview;
import com.avito.android.remote.model.ExtendedProfile;
import com.avito.android.remote.model.ExtendedProfileGeo;
import com.avito.android.remote.model.FloatingBuyBlock;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsSegment;
import com.avito.android.remote.model.SearchParamsSegmentParser;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.Sharing;
import com.avito.android.search.filter.FilterAnalyticsData;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.shortcut_navigation_bar.adapter.ClarifyButtonItem;
import com.avito.android.shortcut_navigation_bar.adapter.InlineFilterNavigationItem;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItemImpl;
import com.avito.android.shortcut_navigation_bar.adapter.SkeletonItem;
import com.avito.android.shortcut_navigation_bar.adapter.TagShortcutItem;
import com.avito.android.util.R0;
import com.facebook.imageutils.JfifUtil;
import eA.InterfaceC39978a;
import fA.InterfaceC40265a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import oB.C44614A;
import oB.C44615a;
import oB.C44616b;
import oB.C44617c;
import oB.C44618d;
import oB.C44619e;
import oB.E;
import oB.u;
import oB.z;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import sc.C48156e;
import shark.AndroidResourceIdNames;
import yd0.C50227a;
import zA.InterfaceC50427a;

/* compiled from: ExtendedProfileActor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/extended_profile/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LfA/a;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lcom/avito/android/extended_profile/mvi/entity/a;", "a", "b", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.extended_profile.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30451a implements com.avito.android.arch.mvi.a<InterfaceC40265a, ExtendedProfileInternalAction, com.avito.android.extended_profile.mvi.entity.a> {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.j f150065A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final C48156e f150066B = C48156e.f437918a;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f150067a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f150068b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SearchParams f150069c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final FloatingBuyBlock f150070d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile.r f150071e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile.search.d f150072f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile.search.a f150073g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_phone_dialog.g f150074h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection_toast.b f150075i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.h f150076j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.viewed.a f150077k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile.e0 f150078l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34162r0 f150079m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50427a f150080n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39978a f150081o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final eA.m f150082p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final eA.g f150083q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30394c f150084r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_ux_feedback.b f150085s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f150086t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f150087u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final R0 f150088v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_adverts.n f150089w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final C29640d f150090x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_ui_components.search_input.suggest.a f150091y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.n f150092z;

    /* compiled from: ExtendedProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile/mvi/a$a;", "", "a", "b", "Lcom/avito/android/extended_profile/mvi/a$a$a;", "Lcom/avito/android/extended_profile/mvi/a$a$b;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.extended_profile.mvi.a$a, reason: collision with other inner class name */
    public interface InterfaceC4391a {

        /* compiled from: ExtendedProfileActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile/mvi/a$a$a;", "Lcom/avito/android/extended_profile/mvi/a$a;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.extended_profile.mvi.a$a$a, reason: collision with other inner class name */
        public static final class C4392a implements InterfaceC4391a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C4392a f150093a = new C4392a();
        }

        /* compiled from: ExtendedProfileActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile/mvi/a$a$b;", "Lcom/avito/android/extended_profile/mvi/a$a;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.extended_profile.mvi.a$a$b */
        public static final class b implements InterfaceC4391a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f150094a = new b();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ExtendedProfileActor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/a$b;", "", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.extended_profile.mvi.a$b */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f150095c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f150096d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f150097e;

        /* renamed from: f, reason: collision with root package name */
        public static final b f150098f;

        /* renamed from: g, reason: collision with root package name */
        public static final b f150099g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ b[] f150100h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f150101i;

        /* renamed from: b, reason: collision with root package name */
        public final int f150102b;

        static {
            b bVar = new b("FLOATING_CONTACTS", 0, 13);
            f150095c = bVar;
            b bVar2 = new b("TOP_CONTACTS", 1, 12);
            f150096d = bVar2;
            b bVar3 = new b("JOB_CAROUSEL", 2, 18);
            f150097e = bVar3;
            b bVar4 = new b("SNIPPET", 3, 0);
            f150098f = bVar4;
            b bVar5 = new b("FLOATING_BUY_BLOCK", 4, 19);
            f150099g = bVar5;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
            f150100h = bVarArr;
            f150101i = kotlin.enums.c.a(bVarArr);
        }

        public b(String str, int i12, int i13) {
            this.f150102b = i13;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f150100h.clone();
        }
    }

    /* compiled from: ExtendedProfileActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.extended_profile.mvi.a$c */
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[ExtendedProfileSearchTabType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ExtendedProfileSearchTabType extendedProfileSearchTabType = ExtendedProfileSearchTabType.f154620c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: ExtendedProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "<anonymous>", "(V)Lkotlinx/coroutines/flow/Flow;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor$handleFavoriteClick$1", f = "ExtendedProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.extended_profile.mvi.a$d */
    public static final class d extends SuspendLambda implements Y41.p<G0, Continuation<? super InterfaceC43160i<? extends ExtendedProfileInternalAction>>, Object> {
        public d() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new d(2, continuation);
        }

        @Override // Y41.p
        public final Object invoke(G0 g02, Continuation<? super InterfaceC43160i<? extends ExtendedProfileInternalAction>> continuation) {
            return ((d) create(g02, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return C43175k.w();
        }
    }

    /* compiled from: ExtendedProfileActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "action", "Lkotlinx/coroutines/flow/i;", "<anonymous>", "(Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor$loadData$1", f = "ExtendedProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.extended_profile.mvi.a$e */
    public static final class e extends SuspendLambda implements Y41.p<ExtendedProfileInternalAction, Continuation<? super InterfaceC43160i<? extends ExtendedProfileInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f150103q;

        /* compiled from: ExtendedProfileActor.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor$loadData$1$1", f = "ExtendedProfileActor.kt", i = {0, 1, 1}, l = {757, 777, 794, 796}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "searchMarker"}, s = {"L$0", "L$0", "L$3"})
        /* renamed from: com.avito.android.extended_profile.mvi.a$e$a, reason: collision with other inner class name */
        public static final class C4393a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileInternalAction>, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public C30451a f150105q;

            /* renamed from: r, reason: collision with root package name */
            public ExtendedProfileInternalAction f150106r;

            /* renamed from: s, reason: collision with root package name */
            public com.avito.android.extended_profile.data.i f150107s;

            /* renamed from: t, reason: collision with root package name */
            public int f150108t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f150109u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileInternalAction f150110v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ C30451a f150111w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4393a(ExtendedProfileInternalAction extendedProfileInternalAction, C30451a c30451a, Continuation<? super C4393a> continuation) {
                super(2, continuation);
                this.f150110v = extendedProfileInternalAction;
                this.f150111w = c30451a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C4393a c4393a = new C4393a(this.f150110v, this.f150111w, continuation);
                c4393a.f150109u = obj;
                return c4393a;
            }

            @Override // Y41.p
            public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
                return ((C4393a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Removed duplicated region for block: B:73:0x0142  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x0155  */
            /* JADX WARN: Removed duplicated region for block: B:93:0x0150 A[SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r37) {
                /*
                    Method dump skipped, instructions count: 457
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.mvi.C30451a.e.C4393a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = C30451a.this.new e(continuation);
            eVar.f150103q = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(ExtendedProfileInternalAction extendedProfileInternalAction, Continuation<? super InterfaceC43160i<? extends ExtendedProfileInternalAction>> continuation) {
            return ((e) create(extendedProfileInternalAction, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43160i interfaceC43160iW;
            com.avito.android.extended_profile.data.b bVar;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            ExtendedProfileInternalAction extendedProfileInternalAction = (ExtendedProfileInternalAction) this.f150103q;
            C30451a c30451a = C30451a.this;
            InterfaceC43160i interfaceC43160iG = C43175k.G(new C4393a(extendedProfileInternalAction, c30451a, null));
            ExtendedProfileInternalAction.DataLoaded dataLoaded = extendedProfileInternalAction instanceof ExtendedProfileInternalAction.DataLoaded ? (ExtendedProfileInternalAction.DataLoaded) extendedProfileInternalAction : null;
            if (dataLoaded == null || (bVar = dataLoaded.f150162b) == null) {
                interfaceC43160iW = C43175k.w();
            } else {
                c30451a.getClass();
                interfaceC43160iW = C43175k.G(new C30462l(c30451a, bVar, null));
            }
            return C43175k.N(interfaceC43160iG, interfaceC43160iW);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.extended_profile.mvi.a$f */
    public static final class f implements InterfaceC43160i<ExtendedProfileInternalAction> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f150112b;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.extended_profile.mvi.a$f$a, reason: collision with other inner class name */
        public static final class C4394a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f150113b;

            /* compiled from: Emitters.kt */
            @kotlin.jvm.internal.s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor$process$$inlined$map$1$2", f = "ExtendedProfileActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.extended_profile.mvi.a$f$a$a, reason: collision with other inner class name */
            public static final class C4395a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f150114q;

                /* renamed from: r, reason: collision with root package name */
                public int f150115r;

                public C4395a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f150114q = obj;
                    this.f150115r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C4394a.this.emit(null, this);
                }
            }

            public C4394a(InterfaceC43172j interfaceC43172j) {
                this.f150113b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.List] */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.extended_profile.mvi.C30451a.f.C4394a.C4395a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.extended_profile.mvi.a$f$a$a r0 = (com.avito.android.extended_profile.mvi.C30451a.f.C4394a.C4395a) r0
                    int r1 = r0.f150115r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f150115r = r1
                    goto L18
                L13:
                    com.avito.android.extended_profile.mvi.a$f$a$a r0 = new com.avito.android.extended_profile.mvi.a$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f150114q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f150115r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L5c
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.extended_profile_ui_components.search_input.suggest.c r5 = (com.avito.android.extended_profile_ui_components.search_input.suggest.c) r5
                    boolean r6 = r5 instanceof com.avito.android.extended_profile_ui_components.search_input.suggest.c.a
                    if (r6 == 0) goto L44
                    com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction$SuggestLoaded r6 = new com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction$SuggestLoaded
                    com.avito.android.extended_profile_ui_components.search_input.suggest.c$a r5 = (com.avito.android.extended_profile_ui_components.search_input.suggest.c.a) r5
                    java.lang.Object r5 = r5.f153443a
                    r6.<init>(r5)
                    goto L51
                L44:
                    boolean r6 = r5 instanceof com.avito.android.extended_profile_ui_components.search_input.suggest.c.b
                    if (r6 == 0) goto L5f
                    com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction$SuggestLoadingError r6 = new com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction$SuggestLoadingError
                    com.avito.android.extended_profile_ui_components.search_input.suggest.c$b r5 = (com.avito.android.extended_profile_ui_components.search_input.suggest.c.b) r5
                    java.lang.Throwable r5 = r5.f153444a
                    r6.<init>(r5)
                L51:
                    r0.f150115r = r3
                    kotlinx.coroutines.flow.j r5 = r4.f150113b
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L5c
                    return r1
                L5c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                L5f:
                    kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                    r5.<init>()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.mvi.C30451a.f.C4394a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public f(InterfaceC43160i interfaceC43160i) {
            this.f150112b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f150112b.collect(new C4394a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor$process$11", f = "ExtendedProfileActor.kt", i = {0}, l = {337, 338}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.extended_profile.mvi.a$g */
    public static final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f150117q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f150118r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC40265a f150120t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.extended_profile.mvi.entity.a f150121u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC40265a interfaceC40265a, com.avito.android.extended_profile.mvi.entity.a aVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f150120t = interfaceC40265a;
            this.f150121u = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = C30451a.this.new g(this.f150120t, this.f150121u, continuation);
            gVar.f150118r = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f150117q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f150118r;
                String string = ((InterfaceC40265a.t) this.f150120t).f395734a.f153424c.toString();
                C30451a c30451a = C30451a.this;
                c30451a.getClass();
                InterfaceC43160i interfaceC43160iG = C43175k.G(new C30463m(this.f150121u, string, true, c30451a, null));
                this.f150118r = interfaceC43172j;
                this.f150117q = 1;
                if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f150118r;
                C42729a0.b(obj);
            }
            ExtendedProfileInternalAction.SetSuggestsVisible setSuggestsVisible = new ExtendedProfileInternalAction.SetSuggestsVisible(false);
            this.f150118r = null;
            this.f150117q = 2;
            if (interfaceC43172j.emit(setSuggestsVisible, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor$process$12", f = "ExtendedProfileActor.kt", i = {0}, l = {346, 347}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.extended_profile.mvi.a$h */
    public static final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f150122q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f150123r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC40265a f150125t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.extended_profile.mvi.entity.a f150126u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC40265a interfaceC40265a, com.avito.android.extended_profile.mvi.entity.a aVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f150125t = interfaceC40265a;
            this.f150126u = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            h hVar = C30451a.this.new h(this.f150125t, this.f150126u, continuation);
            hVar.f150123r = obj;
            return hVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f150122q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f150123r;
                String str = ((InterfaceC40265a.A) this.f150125t).f395710a;
                C30451a c30451a = C30451a.this;
                c30451a.getClass();
                InterfaceC43160i interfaceC43160iG = C43175k.G(new C30463m(this.f150126u, str, true, c30451a, null));
                this.f150123r = interfaceC43172j;
                this.f150122q = 1;
                if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f150123r;
                C42729a0.b(obj);
            }
            ExtendedProfileInternalAction.SetSuggestsVisible setSuggestsVisible = new ExtendedProfileInternalAction.SetSuggestsVisible(false);
            this.f150123r = null;
            this.f150122q = 2;
            if (interfaceC43172j.emit(setSuggestsVisible, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor$process$3", f = "ExtendedProfileActor.kt", i = {0, 1, 2}, l = {224, JfifUtil.MARKER_APP1, 226, 228}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    /* renamed from: com.avito.android.extended_profile.mvi.a$i */
    public static final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f150127q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f150128r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.extended_profile.mvi.entity.a f150129s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(com.avito.android.extended_profile.mvi.entity.a aVar, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f150129s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            i iVar = new i(this.f150129s, continuation);
            iVar.f150128r = obj;
            return iVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x007a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f150127q
                r2 = 0
                com.avito.android.extended_profile.mvi.entity.a r3 = r9.f150129s
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                if (r1 == 0) goto L3c
                if (r1 == r7) goto L34
                if (r1 == r6) goto L2c
                if (r1 == r5) goto L24
                if (r1 != r4) goto L1c
                kotlin.C42729a0.b(r10)
                goto L93
            L1c:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L24:
                java.lang.Object r1 = r9.f150128r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L7b
            L2c:
                java.lang.Object r1 = r9.f150128r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L6e
            L34:
                java.lang.Object r1 = r9.f150128r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L61
            L3c:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f150128r
                r1 = r10
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction$UpdateShareMenuVisibility r10 = new com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction$UpdateShareMenuVisibility
                com.avito.android.extended_profile.data.b r8 = r3.f150240b
                if (r8 == 0) goto L4d
                com.avito.android.remote.model.Sharing r8 = r8.f149468c
                goto L4e
            L4d:
                r8 = r2
            L4e:
                if (r8 == 0) goto L52
                r8 = r7
                goto L53
            L52:
                r8 = 0
            L53:
                r10.<init>(r8)
                r9.f150128r = r1
                r9.f150127q = r7
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L61
                return r0
            L61:
                com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction$UpdateNotificationEnabledState r10 = com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction.UpdateNotificationEnabledState.f150234b
                r9.f150128r = r1
                r9.f150127q = r6
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L6e
                return r0
            L6e:
                com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction$UpdateVisibleItems r10 = com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction.UpdateVisibleItems.f150237b
                r9.f150128r = r1
                r9.f150127q = r5
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L7b
                return r0
            L7b:
                com.avito.android.extended_profile.data.b r10 = r3.f150240b
                if (r10 == 0) goto L93
                com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction$UpdateFloatingContactBar r3 = new com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction$UpdateFloatingContactBar
                java.util.List r10 = r10.b()
                r3.<init>(r10)
                r9.f150128r = r2
                r9.f150127q = r4
                java.lang.Object r10 = r1.emit(r3, r9)
                if (r10 != r0) goto L93
                return r0
            L93:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.mvi.C30451a.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ExtendedProfileActor.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor$process$4", f = "ExtendedProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.extended_profile.mvi.a$j */
    public static final class j extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ InterfaceC40265a f150130q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C30451a f150131r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC40265a interfaceC40265a, C30451a c30451a, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f150130q = interfaceC40265a;
            this.f150131r = c30451a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new j(this.f150130q, this.f150131r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.deeplink_handler.handler.bundle.a aVar = ((InterfaceC40265a.x) this.f150130q).f395739a;
            if ((aVar.f134520a instanceof ExtendedProfilePhoneRequestLink) && (str = aVar.f134521b) != null) {
                this.f150131r.f150084r.h(str);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor$process$8", f = "ExtendedProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.extended_profile.mvi.a$k */
    public static final class k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileInternalAction>, Continuation<? super G0>, Object> {
        public k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return C30451a.this.new k(continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            SearchParamsSegmentParser searchParamsSegmentParser = SearchParamsSegmentParser.INSTANCE;
            C30451a c30451a = C30451a.this;
            if (searchParamsSegmentParser.fromParam(c30451a.f150069c) == SearchParamsSegment.AvitoForBusiness) {
                c30451a.f150085s.a();
            }
            return G0.f406611a;
        }
    }

    @Inject
    public C30451a(@r.h @Y61.k String str, @Y61.l @r.d String str2, @r.g @Y61.k SearchParams searchParams, @Y61.l @r.a FloatingBuyBlock floatingBuyBlock, @Y61.k com.avito.android.extended_profile.r rVar, @Y61.k com.avito.android.extended_profile.search.d dVar, @Y61.k com.avito.android.extended_profile.search.a aVar, @Y61.k com.avito.android.extended_profile_phone_dialog.g gVar, @Y61.k com.avito.android.advert_collection_toast.b bVar, @Y61.k com.avito.android.favorite.h hVar, @Y61.k com.avito.android.advert.viewed.a aVar2, @Y61.k com.avito.android.extended_profile.e0 e0Var, @Y61.k InterfaceC34162r0 interfaceC34162r0, @Y61.k InterfaceC50427a interfaceC50427a, @Y61.k InterfaceC39978a interfaceC39978a, @Y61.k eA.m mVar, @Y61.k eA.g gVar2, @Y61.k InterfaceC30394c interfaceC30394c, @Y61.k com.avito.android.extended_profile_ux_feedback.b bVar2, @Y61.k com.avito.android.account.E e12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k R0 r02, @Y61.k com.avito.android.extended_profile_adverts.n nVar, @Y61.k C29640d c29640d, @Y61.k com.avito.android.extended_profile_ui_components.search_input.suggest.a aVar3, @Y61.k com.avito.android.advertising.loaders.n nVar2, @Y61.k com.avito.android.advertising.loaders.j jVar) {
        this.f150067a = str;
        this.f150068b = str2;
        this.f150069c = searchParams;
        this.f150070d = floatingBuyBlock;
        this.f150071e = rVar;
        this.f150072f = dVar;
        this.f150073g = aVar;
        this.f150074h = gVar;
        this.f150075i = bVar;
        this.f150076j = hVar;
        this.f150077k = aVar2;
        this.f150078l = e0Var;
        this.f150079m = interfaceC34162r0;
        this.f150080n = interfaceC50427a;
        this.f150081o = interfaceC39978a;
        this.f150082p = mVar;
        this.f150083q = gVar2;
        this.f150084r = interfaceC30394c;
        this.f150085s = bVar2;
        this.f150086t = e12;
        this.f150087u = interfaceC28373a;
        this.f150088v = r02;
        this.f150089w = nVar;
        this.f150090x = c29640d;
        this.f150091y = aVar3;
        this.f150092z = nVar2;
        this.f150065A = jVar;
    }

    public static final ExtendedProfileInternalAction.NotifyItemsChanged c(C30451a c30451a, com.avito.android.extended_profile.mvi.entity.a aVar, List list, boolean z12) {
        List<QH.a> listB;
        c30451a.getClass();
        ArrayList arrayList = new ArrayList();
        com.avito.android.extended_profile.data.b bVar = aVar.f150240b;
        if (bVar != null && (listB = bVar.b()) != null) {
            for (QH.a aVar2 : listB) {
                if (aVar2 instanceof SearchAdvertItem) {
                    SearchAdvertItem searchAdvertItem = (SearchAdvertItem) aVar2;
                    if (list.contains(searchAdvertItem.f154691d.f268425c)) {
                        AdvertItem advertItem = searchAdvertItem.f154691d;
                        advertItem.f268380G = z12;
                        arrayList.add(advertItem.f268425c);
                    }
                }
                if (aVar2 instanceof JobCompanyCarouselItem) {
                    List<AdvertItem> list2 = ((JobCompanyCarouselItem) aVar2).f154488e;
                    if (list2 != null) {
                        for (AdvertItem advertItem2 : list2) {
                            if (list.contains(advertItem2.f268425c)) {
                                advertItem2.f268380G = z12;
                                arrayList.add(((JobCompanyCarouselItem) aVar2).f154485b);
                            }
                        }
                    }
                } else if (aVar2 instanceof CarouselItem) {
                    boolean z13 = false;
                    for (AdvertItem advertItem3 : ((CarouselItem) aVar2).f154286e) {
                        if (list.contains(advertItem3.f268425c)) {
                            advertItem3.f268380G = z12;
                            z13 = true;
                        }
                    }
                    if (z13) {
                        arrayList.add(((CarouselItem) aVar2).f154283b);
                    }
                }
            }
        }
        return new ExtendedProfileInternalAction.NotifyItemsChanged(arrayList);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(f(false), C43175k.C(new C30453c(aVar, this, null), this.f150084r.getF149445k()), C43175k.C(new C30469t(aVar, this, null), this.f150078l.getF149980j()), new C30454d(kotlinx.coroutines.reactive.A.a(this.f150076j.c()), this, aVar), new C30470u(kotlinx.coroutines.rx3.y.a(this.f150077k.getF81002a()), this, aVar), C43175k.Y(kotlinx.coroutines.rx3.y.a(this.f150086t.g().D(io.reactivex.rxjava3.internal.functions.a.f401991a).q0(1L)), new C30452b(this, null)), new C30466p(this.f150089w.f150956b), C43175k.C(new C30465o(aVar, this, null), com.avito.android.arch.mvi.utils.h.a(c43197r1, C30464n.f150343l)));
    }

    public final kotlinx.coroutines.flow.internal.m d(DeepLink deepLink, com.avito.android.extended_profile.mvi.entity.a aVar, b bVar, String str) {
        ExtendedProfile.ProfileData.AnalyticParams analyticParams;
        String fromSpace = SearchParamsSegmentParser.INSTANCE.fromParam(this.f150069c).getFromSpace();
        Bundle bundleA = null;
        fromPage = null;
        String fromPage = null;
        if (deepLink instanceof PhoneRequestLink) {
            PhoneRequestDeepLinkAnalyticsData.a aVar2 = PhoneRequestDeepLinkAnalyticsData.f92253b;
            PhoneRequestLink phoneRequestLink = (PhoneRequestLink) deepLink;
            String str2 = phoneRequestLink.f92281b;
            com.avito.android.extended_profile.data.b bVar2 = aVar.f150240b;
            if (bVar2 != null && (analyticParams = bVar2.f149470e) != null) {
                fromPage = analyticParams.getFromPage();
            }
            bundleA = PhoneRequestDeepLinkAnalyticsData.a.a(aVar2, new PhoneRequestDeepLinkAnalyticsData.ExtendedProfile(Integer.valueOf(bVar.f150102b), this.f150067a, str2, phoneRequestLink.f92282c, "s", fromPage, fromSpace));
        }
        return C43175k.N(C43175k.I(this.f150088v.a(), C43175k.G(new C30455e(this, aVar, deepLink, bVar, str, null))), this.f150084r.c(aVar, deepLink, bundleA));
    }

    public final InterfaceC43160i<ExtendedProfileInternalAction> e(com.avito.android.serp.adapter.S s5) {
        this.f150075i.b(s5.getF157692b(), s5.getF107475k());
        return C43175k.C(new d(2, null), kotlinx.coroutines.rx3.y.a(this.f150076j.g(s5.getF157692b(), new AbstractC30567a.m(s5.getF73318b()), s5.getF107475k(), s5.getF73319c(), null, (2016 & 32) != 0 ? null : null, (2016 & 64) != 0 ? null : null, (2016 & 128) != 0 ? null : null, (2016 & 256) != 0 ? null : null, (2016 & 512) != 0 ? null : SearchParamsSegmentParser.INSTANCE.fromParam(this.f150069c).getFromSpace(), (2016 & 1024) != 0).F()));
    }

    public final InterfaceC43160i<ExtendedProfileInternalAction> f(boolean z12) {
        String str = this.f150067a;
        String str2 = this.f150068b;
        return C43175k.C(new e(null), this.f150071e.a(this.f150070d, this.f150069c, str, str2, z12));
    }

    public final InterfaceC43160i<ExtendedProfileInternalAction> g(a.C4397a c4397a) {
        if (c4397a == null) {
            return C43175k.w();
        }
        ActiveItemsPreview activeItemsPreview = c4397a.f150260j;
        DeepLink filtersButtonDeeplink = activeItemsPreview != null ? activeItemsPreview.getFiltersButtonDeeplink() : null;
        if (filtersButtonDeeplink != null) {
            return d.a.a(this.f150072f, filtersButtonDeeplink, "filters", null, ExtendedProfileSerpStartMode.f152657c, 4);
        }
        return new C43210w(new ExtendedProfileInternalAction.OpenSearchFilters(com.avito.android.extended_profile.search.q.a(c4397a.f150257g), c4397a.f150259i, new FilterAnalyticsData(FilterAnalyticsData.Source.f261814g, this.f150067a, null, c4397a.f150269s)));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<ExtendedProfileInternalAction> b(@Y61.k InterfaceC40265a interfaceC40265a, @Y61.k com.avito.android.extended_profile.mvi.entity.a aVar) {
        InterfaceC43160i<ExtendedProfileInternalAction> c43210w;
        SearchParams searchParams;
        SearchParams searchParamsA;
        ExtendedProfile.ProfileData.AnalyticParams analyticParams;
        ExtendedProfile.ProfileData.AnalyticParams analyticParams2;
        InterfaceC43160i<ExtendedProfileInternalAction> interfaceC43160iW;
        SearchParams searchParamsCopy;
        Sharing sharing;
        ExtendedProfile.ProfileData.AnalyticParams analyticParams3;
        SearchParams searchParams2;
        ActiveItemsPreview activeItemsPreview;
        InterfaceC43160i<ExtendedProfileInternalAction> interfaceC43160iG;
        SearchParams searchParams3;
        ActiveItemsPreview activeItemsPreview2;
        SearchParams searchParams4;
        List<SearchAdvertItem> list;
        InterfaceC43160i<ExtendedProfileInternalAction> interfaceC43160iA;
        InterfaceC43160i<ExtendedProfileInternalAction> interfaceC43160iA2;
        ExtendedProfile.ProfileData.AnalyticParams analyticParams4;
        SearchParams searchParams5;
        String categoryId;
        if (interfaceC40265a instanceof InterfaceC40265a.C40268d) {
            return f(((InterfaceC40265a.C40268d) interfaceC40265a).f395717a);
        }
        boolean z12 = interfaceC40265a instanceof InterfaceC40265a.D;
        a.e eVar = aVar.f150249k;
        InterfaceC30394c interfaceC30394c = this.f150084r;
        String categoryId2 = null;
        fromPage = null;
        String fromPage = null;
        inlineFiltersDeeplink = null;
        DeepLink inlineFiltersDeeplink = null;
        inlineFiltersDeeplink = null;
        DeepLink inlineFiltersDeeplink2 = null;
        profileSession = null;
        String profileSession = null;
        profileSession = null;
        String profileSession2 = null;
        categoryId2 = null;
        categoryId2 = null;
        com.avito.android.extended_profile_ux_feedback.b bVar = this.f150085s;
        InterfaceC28373a interfaceC28373a = this.f150087u;
        com.avito.android.extended_profile.e0 e0Var = this.f150078l;
        com.avito.android.extended_profile.data.b bVar2 = aVar.f150240b;
        a.C4397a c4397a = aVar.f150247i;
        if (z12) {
            oB.k kVar = ((InterfaceC40265a.D) interfaceC40265a).f395713a;
            boolean z13 = kVar instanceof oB.D;
            String str = this.f150067a;
            if (z13) {
                oB.D d12 = (oB.D) kVar;
                interfaceC28373a.c(new eA.r(str, d12.f419499b.f154467i));
                return new C43210w(new ExtendedProfileInternalAction.OnTextItemExpandClicked(d12.f419499b));
            }
            if (kVar instanceof oB.i) {
                oB.i iVar = (oB.i) kVar;
                return new C43210w(new ExtendedProfileInternalAction.OnCategorizerScrollChanged(iVar.f419514b, iVar.f419515c));
            }
            if (kVar instanceof oB.h) {
                oB.h hVar = (oB.h) kVar;
                DeepLink deepLink = hVar.f419513b.f154318d;
                ExtendedProfileSerpLink extendedProfileSerpLink = deepLink instanceof ExtendedProfileSerpLink ? (ExtendedProfileSerpLink) deepLink : null;
                if (extendedProfileSerpLink != null && (searchParams5 = extendedProfileSerpLink.f152653d) != null && (categoryId = searchParams5.getCategoryId()) != null) {
                    String strA = this.f150086t.a();
                    if (strA == null) {
                        strA = "";
                    }
                    interfaceC28373a.c(new eA.e(strA, str, categoryId));
                    G0 g02 = G0.f406611a;
                }
                return InterfaceC30394c.a.a(interfaceC30394c, aVar, hVar.f419513b.f154318d, 4);
            }
            if (kVar instanceof oB.C) {
                return C43175k.G(new C30457g(this, null, kVar));
            }
            if (kVar instanceof C44619e) {
                return new C43210w(new ExtendedProfileInternalAction.OpenGallery(Collections.singletonList(((C44619e) kVar).f419508b.f154236d.getImage()), 0));
            }
            if (kVar instanceof PremiumBannerItemClickAction) {
                PremiumBannerItemClickAction premiumBannerItemClickAction = (PremiumBannerItemClickAction) kVar;
                return new C43210w(new ExtendedProfileInternalAction.OpenGallery(premiumBannerItemClickAction.f154160b, premiumBannerItemClickAction.f154161c));
            }
            if (kVar instanceof oB.x) {
                return C43175k.G(new C30458h(this, null, kVar));
            }
            if (kVar instanceof oB.g) {
                return C43175k.G(new C30459i(this, null, kVar));
            }
            if (kVar instanceof C44618d) {
                Image image = ((C44618d) kVar).f419507b;
                if (image == null) {
                    return C43175k.w();
                }
                interfaceC28373a.c(new C50227a(str));
                return new C43210w(new ExtendedProfileInternalAction.OpenGallery(Collections.singletonList(image), 0));
            }
            if (kVar instanceof oB.y) {
                ReviewsOpenPageFrom.PublicProfile publicProfile = ReviewsOpenPageFrom.PublicProfile.f91260d;
                DeepLink deepLink2 = ((oB.y) kVar).f419538b.getDeepLink();
                ReviewsOpenPageFrom.f91254c.getClass();
                return interfaceC30394c.c(aVar, deepLink2, ReviewsOpenPageFrom.a.b(publicProfile));
            }
            if (kVar instanceof oB.j) {
                return d(((oB.j) kVar).f419516b, aVar, b.f150096d, null);
            }
            if (kVar instanceof oB.f) {
                return d(((oB.f) kVar).f419509b, aVar, b.f150096d, null);
            }
            if (kVar instanceof C44616b) {
                return C43175k.G(new C30460j(this, null, kVar));
            }
            if (kVar instanceof C44615a) {
                C44615a c44615a = (C44615a) kVar;
                return new C43210w(new ExtendedProfileInternalAction.OnAboutV2GalleryScrollChanged(c44615a.f419502b, c44615a.f419503c));
            }
            if (kVar instanceof C44617c) {
                C44617c c44617c = (C44617c) kVar;
                interfaceC28373a.c(new eA.r(str, c44617c.f419506b.f154171k));
                return new C43210w(new ExtendedProfileInternalAction.OnAboutV2TextExpandClicked(c44617c.f419506b));
            }
            if (kVar instanceof oB.n) {
                return C43175k.G(new C30461k(this, null, kVar));
            }
            if (kVar instanceof oB.m) {
                oB.m mVar = (oB.m) kVar;
                return new C43210w(new ExtendedProfileInternalAction.OnGalleryScrollPositionChanged(mVar.f419518b, mVar.f419519c));
            }
            if (kVar instanceof oB.o) {
                oB.o oVar = (oB.o) kVar;
                Bundle bundle = oVar.f419523c;
                DeepLink deepLink3 = oVar.f419522b;
                if ((deepLink3 instanceof BadgeBarShowListLink) || (deepLink3 instanceof BadgeBarShowV3Link)) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    RW.a.f14478a.getClass();
                    if (str != null) {
                        bundle.putString("user_key", str);
                    }
                }
                return interfaceC30394c.c(aVar, deepLink3, bundle);
            }
            if (kVar instanceof oB.v) {
                this.f150080n.a(str);
                ExtendedProfileGeo extendedProfileGeo = ((oB.v) kVar).f419534b;
                if (bVar2 != null && (analyticParams4 = bVar2.f149470e) != null) {
                    fromPage = analyticParams4.getFromPage();
                }
                return InterfaceC30394c.a.a(interfaceC30394c, aVar, new ExtendedProfileMapLink(extendedProfileGeo, str, fromPage), 4);
            }
            if (kVar instanceof oB.t) {
                return InterfaceC30394c.a.a(interfaceC30394c, aVar, ((oB.t) kVar).f419530b, 4);
            }
            boolean z14 = kVar instanceof z.c;
            a.b bVar3 = aVar.f150248j;
            com.avito.android.extended_profile.search.a aVar2 = this.f150073g;
            if (z14) {
                z.c cVar = (z.c) kVar;
                int iOrdinal = cVar.f419546b.f154766f.ordinal();
                if (iOrdinal == 0) {
                    DeepLink deepLink4 = cVar.f419546b.f154767g;
                    return (deepLink4 == null || (interfaceC43160iA = d.a.a(this.f150072f, deepLink4, "show_all", null, null, 12)) == null) ? C43175k.w() : interfaceC43160iA;
                }
                if (iOrdinal == 1) {
                    return (bVar3 == null || (interfaceC43160iA2 = aVar2.a(bVar3)) == null) ? C43175k.w() : interfaceC43160iA2;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (kVar instanceof z.f) {
                int iOrdinal2 = ((z.f) kVar).f419549b.f154836e.ordinal();
                if (iOrdinal2 == 0) {
                    return c4397a != null ? C43175k.G(new r(c4397a, this, false, null)) : C43175k.w();
                }
                if (iOrdinal2 == 1) {
                    return (bVar3 == null || (list = bVar3.f150271a) == null || !list.isEmpty()) ? C43175k.w() : aVar2.a(bVar3);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (kVar instanceof z.d) {
                z.d dVar = (z.d) kVar;
                DeepLink deepLink5 = dVar.f419547b;
                ItemsSearchLink itemsSearchLink = deepLink5 instanceof ItemsSearchLink ? (ItemsSearchLink) deepLink5 : null;
                SearchParams searchParamsCopy2 = (itemsSearchLink == null || (searchParams4 = itemsSearchLink.f133403b) == null) ? null : searchParams4.copy(((-1234173943) & 1) != 0 ? searchParams4.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams4.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams4.locationId : null, ((-1234173943) & 8) != 0 ? searchParams4.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams4.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams4.directionId : null, ((-1234173943) & 64) != 0 ? searchParams4.districtId : null, ((-1234173943) & 128) != 0 ? searchParams4.params : null, ((-1234173943) & 256) != 0 ? searchParams4.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams4.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams4.query : null, ((-1234173943) & 2048) != 0 ? searchParams4.title : null, ((-1234173943) & 4096) != 0 ? searchParams4.owner : null, ((-1234173943) & 8192) != 0 ? searchParams4.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams4.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams4.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams4.radius : null, ((-1234173943) & 131072) != 0 ? searchParams4.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams4.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams4.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams4.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams4.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams4.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams4.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams4.sellerId : str, ((-1234173943) & 33554432) != 0 ? searchParams4.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams4.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams4.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams4.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams4.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams4.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams4.clarifyIconType : null, (0 & 1) != 0 ? searchParams4.drawId : null);
                return (searchParamsCopy2 == null || c4397a == null) ? InterfaceC30394c.a.a(interfaceC30394c, aVar, dVar.f419547b, 4) : C43175k.G(new r(a.C4397a.a(c4397a, false, false, null, null, searchParamsCopy2, null, null, false, null, null, null, null, 1048511), this, true, null));
            }
            if (kVar instanceof z.e) {
                return d.a.a(this.f150072f, ((z.e) kVar).f419548b, "geo_filters", null, ExtendedProfileSerpStartMode.f152658d, 4);
            }
            boolean z15 = kVar instanceof z.a.C12170a;
            SearchParams searchParams6 = this.f150069c;
            if (z15) {
                z.a.C12170a c12170a = (z.a.C12170a) kVar;
                ShortcutNavigationItem shortcutNavigationItem = c12170a.f419540b;
                if (shortcutNavigationItem instanceof ShortcutNavigationItemImpl) {
                    DeepLink deepLink6 = ((ShortcutNavigationItemImpl) shortcutNavigationItem).f283245d;
                    return deepLink6 != null ? InterfaceC30394c.a.a(interfaceC30394c, aVar, deepLink6, 4) : C43175k.w();
                }
                if (!(shortcutNavigationItem instanceof InlineFilterNavigationItem)) {
                    if (shortcutNavigationItem instanceof ClarifyButtonItem) {
                        return (c4397a == null || (interfaceC43160iG = g(c4397a)) == null) ? C43175k.w() : interfaceC43160iG;
                    }
                    if (shortcutNavigationItem instanceof SkeletonItem ? true : shortcutNavigationItem instanceof TagShortcutItem) {
                        return C43175k.w();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (c4397a != null && (activeItemsPreview2 = c4397a.f150260j) != null) {
                    inlineFiltersDeeplink = activeItemsPreview2.getInlineFiltersDeeplink();
                }
                DeepLink deepLink7 = inlineFiltersDeeplink;
                if (deepLink7 != null) {
                    return d.a.a(this.f150072f, deepLink7, "inline_filter", null, ExtendedProfileSerpStartMode.f152657c, 4);
                }
                InlineFilterNavigationItem inlineFilterNavigationItem = (InlineFilterNavigationItem) c12170a.f419540b;
                if (c4397a != null && (searchParams3 = c4397a.f150257g) != null) {
                    searchParams6 = searchParams3;
                }
                return new C43210w(new ExtendedProfileInternalAction.OpenInlineFilter(inlineFilterNavigationItem, com.avito.android.extended_profile.search.q.a(searchParams6)));
            }
            if (kVar instanceof z.a.b) {
                if (c4397a != null && (activeItemsPreview = c4397a.f150260j) != null) {
                    inlineFiltersDeeplink2 = activeItemsPreview.getInlineFiltersDeeplink();
                }
                DeepLink deepLink8 = inlineFiltersDeeplink2;
                if (deepLink8 != null) {
                    return d.a.a(this.f150072f, deepLink8, "inline_filter", null, ExtendedProfileSerpStartMode.f152657c, 4);
                }
                String str2 = ((z.a.b) kVar).f419541b;
                if (c4397a != null && (searchParams2 = c4397a.f150257g) != null) {
                    searchParams6 = searchParams2;
                }
                return new C43210w(new ExtendedProfileInternalAction.OpenInlineFilterWithId(com.avito.android.extended_profile.search.q.a(searchParams6), str2));
            }
            if (kVar instanceof z.b.a) {
                return g(c4397a);
            }
            if (kVar instanceof z.b.C12171b) {
                z.b.C12171b c12171b = (z.b.C12171b) kVar;
                return C43175k.G(new C30463m(aVar, c12171b.f419543b, c12171b.f419544c, this, null));
            }
            if (kVar instanceof z.b.c) {
                c43210w = new C43210w(new ExtendedProfileInternalAction.SetSuggestsVisible(true));
            } else {
                if (kVar instanceof z.g) {
                    return C43175k.G(new C30456f(kVar, this, aVar, null));
                }
                if (!(kVar instanceof oB.w)) {
                    if (kVar instanceof oB.B) {
                        oB.B b12 = (oB.B) kVar;
                        this.f150082p.x(b12.f419495c);
                        return new C43210w(new ExtendedProfileInternalAction.OnSelectionsScrollStateAction(b12.f419494b, b12.f419496d));
                    }
                    if (kVar instanceof C44614A) {
                        return InterfaceC30394c.a.a(interfaceC30394c, aVar, ((C44614A) kVar).f419493b, 4);
                    }
                    if (kVar instanceof oB.r) {
                        return InterfaceC30394c.a.a(interfaceC30394c, aVar, ((oB.r) kVar).f419527b, 4);
                    }
                    if (kVar instanceof oB.p) {
                        oB.p pVar = (oB.p) kVar;
                        return d(pVar.f419524b, aVar, b.f150097e, pVar.f419525c);
                    }
                    if (kVar instanceof oB.q) {
                        return e(((oB.q) kVar).f419526b);
                    }
                    if (kVar instanceof oB.s) {
                        oB.s sVar = (oB.s) kVar;
                        return new C43210w(new ExtendedProfileInternalAction.JobCarouselScrollPositionChanged(sVar.f419528b, sVar.f419529c));
                    }
                    if (kVar instanceof u.b) {
                        return InterfaceC30394c.a.a(interfaceC30394c, aVar, ((u.b) kVar).f419533b, 4);
                    }
                    if (kVar instanceof u.a) {
                        u.a aVar3 = (u.a) kVar;
                        return d(aVar3.f419531b, aVar, b.f150098f, aVar3.f419532c);
                    }
                    if (kVar instanceof E.a) {
                        E.a aVar4 = (E.a) kVar;
                        return new C43210w(new ExtendedProfileInternalAction.UniversalWidgetCarouselContainerScrollStateAction(aVar4.f419500b, aVar4.f419501c));
                    }
                    if (kVar instanceof oB.l) {
                        return InterfaceC30394c.a.a(interfaceC30394c, aVar, ((oB.l) kVar).f419517b, 4);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (!eVar.f150283b) {
                    bVar.d();
                    if (bVar2 != null && (analyticParams3 = bVar2.f149470e) != null) {
                        profileSession = analyticParams3.getProfileSession();
                    }
                    return e0Var.b(str, profileSession, true);
                }
                c43210w = new C43210w(ExtendedProfileInternalAction.OpenSubscriptionSettings.f150209b);
            }
        } else {
            if (interfaceC40265a instanceof InterfaceC40265a.n) {
                bVar.f();
                return C43175k.G(new C30467q(this, aVar, null));
            }
            if (interfaceC40265a instanceof InterfaceC40265a.m) {
                return C43175k.G(new i(aVar, null));
            }
            if (interfaceC40265a instanceof InterfaceC40265a.f) {
                return interfaceC30394c.b(((InterfaceC40265a.f) interfaceC40265a).f395720a);
            }
            if (interfaceC40265a instanceof InterfaceC40265a.p) {
                c43210w = new C43210w(ExtendedProfileInternalAction.OnPhoneCallCanceled.f150180b);
            } else {
                if (interfaceC40265a instanceof InterfaceC40265a.C40267c) {
                    return InterfaceC30394c.a.a(interfaceC30394c, aVar, ((InterfaceC40265a.C40267c) interfaceC40265a).f395716a, 4);
                }
                if (interfaceC40265a instanceof InterfaceC40265a.x) {
                    return C43175k.G(new j(interfaceC40265a, this, null));
                }
                if (interfaceC40265a instanceof InterfaceC40265a.g) {
                    return new C43210w(new ExtendedProfileInternalAction.OnAdvertsTabSelected(((InterfaceC40265a.g) interfaceC40265a).f395721a));
                }
                if (interfaceC40265a instanceof InterfaceC40265a.i) {
                    return d(((InterfaceC40265a.i) interfaceC40265a).f395723a, aVar, b.f150095c, null);
                }
                if (interfaceC40265a instanceof InterfaceC40265a.l) {
                    return d(((InterfaceC40265a.l) interfaceC40265a).f395726a, aVar, b.f150099g, null);
                }
                if (interfaceC40265a instanceof InterfaceC40265a.k) {
                    return e(((InterfaceC40265a.k) interfaceC40265a).f395725a);
                }
                if (interfaceC40265a instanceof InterfaceC40265a.w) {
                    c43210w = new C43210w(ExtendedProfileInternalAction.OpenNotificationsSettings.f150205b);
                } else {
                    if (interfaceC40265a instanceof InterfaceC40265a.r) {
                        if (bVar2 == null || (sharing = bVar2.f149468c) == null) {
                            return C43175k.w();
                        }
                        String analytics = sharing.getAnalytics();
                        if (analytics != null) {
                            interfaceC28373a.c(new yd0.d(analytics));
                        }
                        return new C43210w(new ExtendedProfileInternalAction.OnShareMenuClick(sharing.getTitle(), sharing.getText()));
                    }
                    if (interfaceC40265a instanceof InterfaceC40265a.h) {
                        c43210w = new C43210w(ExtendedProfileInternalAction.CloseScreen.f150161b);
                    } else {
                        if (interfaceC40265a instanceof InterfaceC40265a.q) {
                            if (c4397a != null) {
                                DeepLink deepLink9 = ((InterfaceC40265a.q) interfaceC40265a).f395731a;
                                ItemsSearchLink itemsSearchLink2 = deepLink9 instanceof ItemsSearchLink ? (ItemsSearchLink) deepLink9 : null;
                                if (itemsSearchLink2 != null) {
                                    String categoryId3 = itemsSearchLink2.f133403b.getCategoryId();
                                    SearchParams searchParams7 = c4397a.f150257g;
                                    if (categoryId3 == null && c4397a.f150256f) {
                                        String sellerId = searchParams7.getSellerId();
                                        SerpDisplayType serpDisplayType = SerpDisplayType.Grid;
                                        SearchParams searchParams8 = itemsSearchLink2.f133403b;
                                        searchParamsCopy = searchParams8.copy(((-1234173943) & 1) != 0 ? searchParams8.categoryId : "0", ((-1234173943) & 2) != 0 ? searchParams8.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams8.locationId : null, ((-1234173943) & 8) != 0 ? searchParams8.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams8.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams8.directionId : null, ((-1234173943) & 64) != 0 ? searchParams8.districtId : null, ((-1234173943) & 128) != 0 ? searchParams8.params : null, ((-1234173943) & 256) != 0 ? searchParams8.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams8.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams8.query : null, ((-1234173943) & 2048) != 0 ? searchParams8.title : null, ((-1234173943) & 4096) != 0 ? searchParams8.owner : null, ((-1234173943) & 8192) != 0 ? searchParams8.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams8.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams8.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams8.radius : null, ((-1234173943) & 131072) != 0 ? searchParams8.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams8.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams8.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams8.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams8.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams8.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams8.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams8.sellerId : sellerId, ((-1234173943) & 33554432) != 0 ? searchParams8.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams8.displayType : serpDisplayType, ((-1234173943) & 134217728) != 0 ? searchParams8.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams8.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams8.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams8.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams8.clarifyIconType : null, (0 & 1) != 0 ? searchParams8.drawId : null);
                                    } else {
                                        String sellerId2 = searchParams7.getSellerId();
                                        SerpDisplayType serpDisplayType2 = SerpDisplayType.Grid;
                                        SearchParams searchParams9 = itemsSearchLink2.f133403b;
                                        searchParamsCopy = searchParams9.copy(((-1234173943) & 1) != 0 ? searchParams9.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams9.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams9.locationId : null, ((-1234173943) & 8) != 0 ? searchParams9.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams9.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams9.directionId : null, ((-1234173943) & 64) != 0 ? searchParams9.districtId : null, ((-1234173943) & 128) != 0 ? searchParams9.params : null, ((-1234173943) & 256) != 0 ? searchParams9.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams9.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams9.query : null, ((-1234173943) & 2048) != 0 ? searchParams9.title : null, ((-1234173943) & 4096) != 0 ? searchParams9.owner : null, ((-1234173943) & 8192) != 0 ? searchParams9.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams9.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams9.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams9.radius : null, ((-1234173943) & 131072) != 0 ? searchParams9.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams9.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams9.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams9.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams9.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams9.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams9.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams9.sellerId : sellerId2, ((-1234173943) & 33554432) != 0 ? searchParams9.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams9.displayType : serpDisplayType2, ((-1234173943) & 134217728) != 0 ? searchParams9.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams9.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams9.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams9.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams9.clarifyIconType : null, (0 & 1) != 0 ? searchParams9.drawId : null);
                                    }
                                    interfaceC43160iW = C43175k.G(new r(a.C4397a.a(c4397a, false, false, null, null, searchParamsCopy, null, null, false, null, null, null, null, 1048511), this, false, null));
                                } else {
                                    interfaceC43160iW = C43175k.w();
                                }
                                if (interfaceC43160iW != null) {
                                    return interfaceC43160iW;
                                }
                            }
                            return C43175k.w();
                        }
                        if (interfaceC40265a instanceof InterfaceC40265a.o) {
                            return new C43210w(new ExtendedProfileInternalAction.ShowCommonErrorToastBar(((InterfaceC40265a.o) interfaceC40265a).f395729a));
                        }
                        if (interfaceC40265a instanceof InterfaceC40265a.C) {
                            return c4397a != null ? new C43210w(new ExtendedProfileInternalAction.UpdateActiveAdvertsSearchState(a.C4397a.a(c4397a, false, false, null, null, null, null, null, ((InterfaceC40265a.C) interfaceC40265a).f395712a, null, null, null, null, 1046527), null, 2, null)) : C43175k.w();
                        }
                        boolean z16 = interfaceC40265a instanceof InterfaceC40265a.u;
                        String str3 = this.f150067a;
                        if (z16) {
                            if (bVar2 != null && (analyticParams2 = bVar2.f149470e) != null) {
                                profileSession2 = analyticParams2.getProfileSession();
                            }
                            return e0Var.b(str3, profileSession2, false);
                        }
                        if (interfaceC40265a instanceof InterfaceC40265a.s) {
                            boolean z17 = !kotlin.jvm.internal.L.f(eVar.f150284c, Boolean.TRUE);
                            if (bVar2 != null && (analyticParams = bVar2.f149470e) != null) {
                                analyticParams.getProfileSession();
                            }
                            return e0Var.d(str3, z17, eVar.f150283b);
                        }
                        if (interfaceC40265a instanceof InterfaceC40265a.j) {
                            c43210w = new C43210w(ExtendedProfileInternalAction.DismissSubscriptionSettings.f150163b);
                        } else if ((interfaceC40265a instanceof InterfaceC40265a.C40266b) || (interfaceC40265a instanceof InterfaceC40265a.C11131a)) {
                            c43210w = new C43210w(ExtendedProfileInternalAction.UpdateExtendedProfileLazyColumnComponent.f150232b);
                        } else {
                            if (interfaceC40265a instanceof InterfaceC40265a.B) {
                                return C43175k.G(new k(null));
                            }
                            if (interfaceC40265a instanceof InterfaceC40265a.z) {
                                InterfaceC40265a.z zVar = (InterfaceC40265a.z) interfaceC40265a;
                                if (c4397a != null && (searchParams = c4397a.f150257g) != null && (searchParamsA = com.avito.android.extended_profile.search.q.a(searchParams)) != null) {
                                    categoryId2 = searchParamsA.getCategoryId();
                                }
                                c43210w = new f(this.f150091y.b(zVar.f395741a, categoryId2));
                            } else {
                                if (interfaceC40265a instanceof InterfaceC40265a.t) {
                                    return C43175k.G(new g(interfaceC40265a, aVar, null));
                                }
                                if (!(interfaceC40265a instanceof InterfaceC40265a.y)) {
                                    if (interfaceC40265a instanceof InterfaceC40265a.A) {
                                        return C43175k.G(new h(interfaceC40265a, aVar, null));
                                    }
                                    boolean z18 = interfaceC40265a instanceof InterfaceC40265a.v;
                                    com.avito.android.advertising.loaders.j jVar = this.f150065A;
                                    if (z18) {
                                        InterfaceC40265a.v vVar = (InterfaceC40265a.v) interfaceC40265a;
                                        j.a.c(jVar, vVar.f395736a, vVar.f395737b, null, 12);
                                        return C43175k.w();
                                    }
                                    if (!(interfaceC40265a instanceof InterfaceC40265a.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    InterfaceC40265a.e eVar2 = (InterfaceC40265a.e) interfaceC40265a;
                                    j.a.b(jVar, eVar2.f395718a, eVar2.f395719b);
                                    return C43175k.w();
                                }
                                c43210w = new C43210w(new ExtendedProfileInternalAction.SetSuggestsVisible(false));
                            }
                        }
                    }
                }
            }
        }
        return c43210w;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.avito.android.extended_profile.mvi.entity.a r8, java.lang.String r9, java.lang.String r10, com.avito.android.extended_profile.mvi.C30451a.b r11, java.lang.String r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instructions count: 185
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.mvi.C30451a.i(com.avito.android.extended_profile.mvi.entity.a, java.lang.String, java.lang.String, com.avito.android.extended_profile.mvi.a$b, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void j(com.avito.android.extended_profile.mvi.entity.a aVar, b bVar, String str, String str2) {
        ExtendedProfile.ProfileData.AnalyticParams analyticParams;
        ExtendedProfile.ProfileData.AnalyticParams analyticParams2;
        i1.a aVar2 = i1.f90069v;
        com.avito.android.extended_profile.data.b bVar2 = aVar.f150240b;
        String profileSession = null;
        String fromPage = (bVar2 == null || (analyticParams2 = bVar2.f149470e) == null) ? null : analyticParams2.getFromPage();
        com.avito.android.extended_profile.data.b bVar3 = aVar.f150240b;
        if (bVar3 != null && (analyticParams = bVar3.f149470e) != null) {
            profileSession = analyticParams.getProfileSession();
        }
        Integer numValueOf = Integer.valueOf(bVar.f150102b);
        String fromSpace = SearchParamsSegmentParser.INSTANCE.fromParam(this.f150069c).getFromSpace();
        aVar2.getClass();
        C29640d c29640d = this.f150090x;
        InterfaceC28373a interfaceC28373a = this.f150087u;
        interfaceC28373a.c(new i1(c29640d, interfaceC28373a, 0L, fromPage, this.f150067a, profileSession, numValueOf, this.f150068b, fromSpace, str, str2, (C42822w) null));
        this.f150066B.a();
    }
}
