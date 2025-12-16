package com.avito.android.imv_goods_advert;

import Cd.C13243a;
import aN.InterfaceC19793a;
import aN.b;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.advert_details_items.address.f;
import com.avito.android.advert_details_items.georeference.c;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.GoodsImvAdvertScreen;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.view.d;
import com.avito.android.di.C29972i;
import com.avito.android.imv_goods_advert.di.b;
import com.avito.android.photo_gallery.PhotoGalleryIntentFactory;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.MultiAddressesInfo;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.RouteButtons;
import com.avito.android.remote.model.Video;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.remote.model.advert_details.GalleryBuyButtonData;
import com.avito.android.remote.model.model_card.GalleryTeaser;
import com.avito.android.remote.model.model_card.ModelCardInfo;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35968w3;
import com.avito.android.util.InterfaceC35745a5;
import dN.C39603b;
import dN.InterfaceC39602a;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42830m;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import okhttp3.internal.http2.Http2;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: ImvGoodsAdvertFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/imv_goods_advert/ImvGoodsAdvertFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImvGoodsAdvertFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public static final a f170275y0;

    /* renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f170276z0;

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public u f170277h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f170278i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f170279j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f170280k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f170281l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_details_items.georeference.c f170282m0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_details_items.address.c f170283n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_details_items.description.c f170284o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.view.d f170285p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public PhotoGalleryIntentFactory f170286q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f170287r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public n f170288s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47313c f170289t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f170290u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f170291v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f170292w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f170293x0;

    /* compiled from: ImvGoodsAdvertFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/imv_goods_advert/ImvGoodsAdvertFragment$a;", "", "<init>", "()V", "", "REQ_PHOTO_GALLERY", "I", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ImvGoodsAdvertFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.imv_goods_advert.ImvGoodsAdvertFragment$onCreateView$1", f = "ImvGoodsAdvertFragment.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f170294q;

        /* compiled from: ImvGoodsAdvertFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.imv_goods_advert.ImvGoodsAdvertFragment$onCreateView$1$1", f = "ImvGoodsAdvertFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f170296q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ImvGoodsAdvertFragment f170297r;

            /* compiled from: ImvGoodsAdvertFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.imv_goods_advert.ImvGoodsAdvertFragment$onCreateView$1$1$1", f = "ImvGoodsAdvertFragment.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.imv_goods_advert.ImvGoodsAdvertFragment$b$a$a, reason: collision with other inner class name */
            public static final class C5039a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f170298q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ImvGoodsAdvertFragment f170299r;

                /* compiled from: ImvGoodsAdvertFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LaN/c;", "it", "Lkotlin/G0;", "invoke", "(LaN/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.imv_goods_advert.ImvGoodsAdvertFragment$b$a$a$a, reason: collision with other inner class name */
                public static final class C5040a extends N implements Y41.l<aN.c, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ ImvGoodsAdvertFragment f170300l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C5040a(ImvGoodsAdvertFragment imvGoodsAdvertFragment) {
                        super(1);
                        this.f170300l = imvGoodsAdvertFragment;
                    }

                    @Override // Y41.l
                    public final G0 invoke(aN.c cVar) {
                        aN.c cVar2 = cVar;
                        a aVar = ImvGoodsAdvertFragment.f170275y0;
                        ImvGoodsAdvertFragment imvGoodsAdvertFragment = this.f170300l;
                        com.avito.android.imv_goods_advert.g gVar = new com.avito.android.imv_goods_advert.g(1, imvGoodsAdvertFragment.f5(), t.class, "accept", "accept(Ljava/lang/Object;)V", 0);
                        boolean z12 = cVar2.f20890e;
                        C47313c c47313c = imvGoodsAdvertFragment.f170291v0;
                        if (z12) {
                            kotlin.reflect.n<Object> nVar = ImvGoodsAdvertFragment.f170276z0[2];
                            ((com.avito.android.progress_overlay.l) c47313c.a()).a(String.valueOf(cVar2.f20891f));
                        } else {
                            kotlin.reflect.n<Object> nVar2 = ImvGoodsAdvertFragment.f170276z0[2];
                            ((com.avito.android.progress_overlay.l) c47313c.a()).j();
                            com.avito.konveyor.adapter.a aVar2 = imvGoodsAdvertFragment.f170280k0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            aVar2.c(new UV0.c(cVar2.f20889d));
                            com.avito.konveyor.adapter.j jVar = imvGoodsAdvertFragment.f170279j0;
                            if (jVar == null) {
                                jVar = null;
                            }
                            jVar.notifyDataSetChanged();
                        }
                        C47313c c47313c2 = imvGoodsAdvertFragment.f170289t0;
                        kotlin.reflect.n<Object>[] nVarArr = ImvGoodsAdvertFragment.f170276z0;
                        kotlin.reflect.n<Object> nVar3 = nVarArr[0];
                        InterfaceC39602a interfaceC39602a = (InterfaceC39602a) c47313c2.a();
                        AdvertDetails advertDetails = cVar2.f20887b;
                        interfaceC39602a.setTitle(advertDetails != null ? advertDetails.getTitle() : null);
                        kotlin.reflect.n<Object> nVar4 = nVarArr[0];
                        ((InterfaceC39602a) c47313c2.a()).a(new com.avito.android.advert.item.compatibility.v2.m(29, gVar));
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C5039a(ImvGoodsAdvertFragment imvGoodsAdvertFragment, Continuation<? super C5039a> continuation) {
                    super(2, continuation);
                    this.f170299r = imvGoodsAdvertFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C5039a(this.f170299r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C5039a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f170298q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = ImvGoodsAdvertFragment.f170275y0;
                        ImvGoodsAdvertFragment imvGoodsAdvertFragment = this.f170299r;
                        n2<aN.c> state = imvGoodsAdvertFragment.f5().getState();
                        ScreenPerformanceTracker screenPerformanceTracker = imvGoodsAdvertFragment.f170281l0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C5040a c5040a = new C5040a(imvGoodsAdvertFragment);
                        this.f170298q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c5040a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return G0.f406611a;
                }
            }

            /* compiled from: ImvGoodsAdvertFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.imv_goods_advert.ImvGoodsAdvertFragment$onCreateView$1$1$2", f = "ImvGoodsAdvertFragment.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.imv_goods_advert.ImvGoodsAdvertFragment$b$a$b, reason: collision with other inner class name */
            public static final class C5041b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f170301q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ImvGoodsAdvertFragment f170302r;

                /* compiled from: ImvGoodsAdvertFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.imv_goods_advert.ImvGoodsAdvertFragment$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C5042a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ImvGoodsAdvertFragment f170303b;

                    public C5042a(ImvGoodsAdvertFragment imvGoodsAdvertFragment) {
                        this.f170303b = imvGoodsAdvertFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        aN.b bVar = (aN.b) obj;
                        a aVar = ImvGoodsAdvertFragment.f170275y0;
                        ImvGoodsAdvertFragment imvGoodsAdvertFragment = this.f170303b;
                        if (bVar instanceof b.C1491b) {
                            b.C1491b c1491b = (b.C1491b) bVar;
                            AdvertDetails advertDetails = c1491b.f20882a;
                            if (advertDetails != null) {
                                PhotoGalleryIntentFactory photoGalleryIntentFactory = imvGoodsAdvertFragment.f170286q0;
                                PhotoGalleryIntentFactory photoGalleryIntentFactory2 = photoGalleryIntentFactory != null ? photoGalleryIntentFactory : null;
                                Video video = advertDetails.getVideo();
                                NativeVideo nativeVideo = advertDetails.getNativeVideo();
                                List<Image> images = advertDetails.getImages();
                                if (images == null) {
                                    images = C42784z0.f406748b;
                                }
                                List<Image> list = images;
                                String id2 = advertDetails.getId();
                                String categoryId = advertDetails.getCategoryId();
                                ContactBarData contactBarDataC = V9.a.c(advertDetails, null, false, false, false, false, false, 255);
                                GalleryBuyButtonData galleryBuyButton = advertDetails.getGalleryBuyButton();
                                ModelCardInfo modelCardInfo = advertDetails.getModelCardInfo();
                                GalleryTeaser galleryItem = modelCardInfo != null ? modelCardInfo.getGalleryItem() : null;
                                imvGoodsAdvertFragment.startActivityForResult(photoGalleryIntentFactory2.a(null, null, null, null, null, video, nativeVideo, list, c1491b.f20883b, id2, (16773151 & 1024) != 0 ? null : categoryId, (16773151 & 2048) != 0 ? null : null, (16773151 & 4096) != 0 ? null : null, (16773151 & 8192) != 0 ? null : contactBarDataC, (16773151 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : galleryBuyButton, (32768 & 16773151) != 0 ? null : c1491b.f20884c, null, null, (262144 & 16773151) != 0 ? null : galleryItem, null, false, (16773151 & 2097152) != 0 ? null : null, null, null), 1);
                            }
                        } else if (bVar instanceof b.a) {
                            imvGoodsAdvertFragment.dismiss();
                        }
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f170303b, ImvGoodsAdvertFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/imv_goods_advert/mvi/entity/ImvGoodsAdvertOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C5041b(ImvGoodsAdvertFragment imvGoodsAdvertFragment, Continuation<? super C5041b> continuation) {
                    super(2, continuation);
                    this.f170302r = imvGoodsAdvertFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C5041b(this.f170302r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C5041b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f170301q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = ImvGoodsAdvertFragment.f170275y0;
                        ImvGoodsAdvertFragment imvGoodsAdvertFragment = this.f170302r;
                        InterfaceC43160i<aN.b> events = imvGoodsAdvertFragment.f5().getEvents();
                        C5042a c5042a = new C5042a(imvGoodsAdvertFragment);
                        this.f170301q = 1;
                        if (events.collect(c5042a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ImvGoodsAdvertFragment imvGoodsAdvertFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f170297r = imvGoodsAdvertFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f170297r, continuation);
                aVar.f170296q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f170296q;
                ImvGoodsAdvertFragment imvGoodsAdvertFragment = this.f170297r;
                C43259k.d(t12, null, null, new C5039a(imvGoodsAdvertFragment, null), 3);
                C43259k.d(t12, null, null, new C5041b(imvGoodsAdvertFragment, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return ImvGoodsAdvertFragment.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f170294q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                ImvGoodsAdvertFragment imvGoodsAdvertFragment = ImvGoodsAdvertFragment.this;
                a aVar = new a(imvGoodsAdvertFragment, null);
                this.f170294q = 1;
                if (C23056p0.b(imvGoodsAdvertFragment, state, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ImvGoodsAdvertFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = ImvGoodsAdvertFragment.f170275y0;
            ImvGoodsAdvertFragment.this.f5().accept(InterfaceC19793a.c.f20877a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f170305l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f170305l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f170305l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ImvGoodsAdvertFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f170307l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f170307l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f170307l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f170308l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f170308l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f170308l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f170309l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f170309l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f170309l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ImvGoodsAdvertFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/imv_goods_advert/t;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/imv_goods_advert/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<t> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final t invoke() {
            u uVar = ImvGoodsAdvertFragment.this.f170277h0;
            if (uVar == null) {
                uVar = null;
            }
            return (t) uVar.get();
        }
    }

    static {
        Y y12 = new Y(ImvGoodsAdvertFragment.class, "toolbarView", "getToolbarView()Lcom/avito/android/imv_goods_advert/views/ImvGoodsToolbarView;", 0);
        n0 n0Var = m0.f406844a;
        f170276z0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(ImvGoodsAdvertFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ImvGoodsAdvertFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/progress_overlay/ProgressOverlay;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ImvGoodsAdvertFragment.class, "openParams", "getOpenParams()Lcom/avito/android/imv_goods_advert/ImvGoodsAdvertParams;", 0, n0Var)};
        f170275y0 = new a(null);
    }

    public ImvGoodsAdvertFragment() {
        super(0, 1, null);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f170278i0 = new O0(m0.f406844a.b(t.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f170289t0 = new C47313c(null, 1, null);
        this.f170290u0 = new C47313c(null, 1, null);
        this.f170291v0 = new C47313c(null, 1, null);
        this.f170292w0 = new io.reactivex.rxjava3.disposables.c();
        this.f170293x0 = new C35968w3(this);
    }

    public final t f5() {
        return (t) this.f170278i0.getValue();
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @InterfaceC42830m
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        Bundle extras;
        super.onActivityResult(i12, i13, intent);
        com.avito.android.deeplink_handler.view.d dVar = this.f170285p0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.a(i12, i13, intent);
        if (i12 != 1 || intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        Object obj = extras.get("image_position");
        int iIntValue = obj instanceof Integer ? ((Number) obj).intValue() : 0;
        Object obj2 = extras.get("photoGalleryStateId");
        long jLongValue = obj2 instanceof Long ? ((Number) obj2).longValue() : -1L;
        if (jLongValue > -1) {
            f5().accept(new InterfaceC19793a.e(iIntValue, Long.valueOf(jLongValue)));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        b.a aVarA = com.avito.android.imv_goods_advert.di.a.a();
        S0 f42820b = getF42820b();
        Resources resources = getResources();
        kotlin.reflect.n<Object>[] nVarArr = f170276z0;
        kotlin.reflect.n<Object> nVar = nVarArr[3];
        C35968w3 c35968w3 = this.f170293x0;
        ImvGoodsAdvertParams imvGoodsAdvertParams = (ImvGoodsAdvertParams) c35968w3.getValue(this, nVar);
        C28478k c28478k = new C28478k(GoodsImvAdvertScreen.f90364d, com.avito.android.analytics.screens.s.b(this), "goodsIMVAdvert");
        com.avito.android.analytics.screens.r rVarB = com.avito.android.analytics.screens.s.b(this);
        ImvGoodsAdvertParams imvGoodsAdvertParams2 = (ImvGoodsAdvertParams) c35968w3.getValue(this, nVarArr[3]);
        aVarA.a(this, f42820b, resources, imvGoodsAdvertParams, c28478k, rVarB, imvGoodsAdvertParams2.f170312c, (com.avito.android.imv_goods_advert.di.e) C29972i.a(C29972i.b(this), com.avito.android.imv_goods_advert.di.e.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f170281l0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        com.avito.android.lib.design.bottom_sheet.j.c(dVar, null, false, 0, 0, 0, 121);
        dVar.T();
        dVar.setCanceledOnTouchOutside(true);
        dVar.S(C35835l0.g(dVar.getContext()).y);
        dVar.K(true);
        return dVar;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f170281l0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new b(null), 3);
        return layoutInflater.inflate(R.layout.fragment_imv_goods_advert, viewGroup);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f170292w0.e();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 == null || activityC22955mL1.isFinishing() || activityC22955mL1.isChangingConfigurations()) {
            return;
        }
        activityC22955mL1.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f170281l0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        com.avito.android.deeplink_handler.view.d dVar = this.f170285p0;
        if (dVar == null) {
            dVar = null;
        }
        d.a.b(dVar, this, (com.avito.android.deeplink_handler.view.impl.i) b5(), 28);
        com.avito.android.advert_details_items.georeference.c cVar = this.f170282m0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.O3(new c());
        com.avito.android.advert_details_items.address.c cVar2 = this.f170283n0;
        if (cVar2 == null) {
            cVar2 = null;
        }
        cVar2.Z3(new d());
        com.avito.android.advert_details_items.description.c cVar3 = this.f170284o0;
        if (cVar3 == null) {
            cVar3 = null;
        }
        cVar3.F7(new e());
        View viewFindViewById = view.findViewById(R.id.advert_details_recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        C47313c c47313c = this.f170290u0;
        kotlin.reflect.n<Object>[] nVarArr = f170276z0;
        kotlin.reflect.n<Object> nVar = nVarArr[1];
        c47313c.b(this, (RecyclerView) viewFindViewById);
        kotlin.reflect.n<Object> nVar2 = nVarArr[1];
        RecyclerView recyclerView = (RecyclerView) c47313c.a();
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        kotlin.reflect.n<Object> nVar3 = nVarArr[1];
        RecyclerView recyclerView2 = (RecyclerView) c47313c.a();
        com.avito.konveyor.adapter.j jVar = this.f170279j0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView2.setAdapter(jVar);
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.root), R.id.advert_details_recycler, null, 0, 0, 28, null);
        C47313c c47313c2 = this.f170291v0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[2];
        c47313c2.b(this, lVar);
        kotlin.reflect.n<Object> nVar5 = nVarArr[2];
        ((com.avito.android.progress_overlay.l) c47313c2.a()).f231600j = new f();
        n nVar6 = this.f170288s0;
        if (nVar6 == null) {
            nVar6 = null;
        }
        C41981q0 f170576e = nVar6.getF170576e();
        InterfaceC35745a5 interfaceC35745a5 = this.f170287r0;
        if (interfaceC35745a5 == null) {
            interfaceC35745a5 = null;
        }
        io.reactivex.rxjava3.disposables.d dVarT0 = f170576e.j0(interfaceC35745a5.e()).t0(new com.avito.android.imv_goods_advert.e(this));
        io.reactivex.rxjava3.disposables.c cVar4 = this.f170292w0;
        cVar4.b(dVarT0);
        n nVar7 = this.f170288s0;
        if (nVar7 == null) {
            nVar7 = null;
        }
        C41981q0 f170574c = nVar7.getF170574c();
        InterfaceC35745a5 interfaceC35745a52 = this.f170287r0;
        cVar4.b(f170574c.j0((interfaceC35745a52 != null ? interfaceC35745a52 : null).e()).t0(new com.avito.android.imv_goods_advert.f(this)));
        C39603b c39603b = new C39603b(view);
        C47313c c47313c3 = this.f170289t0;
        kotlin.reflect.n<Object> nVar8 = nVarArr[0];
        c47313c3.b(this, c39603b);
    }

    /* compiled from: ImvGoodsAdvertFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/imv_goods_advert/ImvGoodsAdvertFragment$e", "Lcom/avito/android/advert_core/advert/p;", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements com.avito.android.advert_core.advert.p {
        @Override // com.avito.android.advert_core.advert.p
        public final void V() {
        }

        @Override // com.avito.android.advert_core.advert.p
        public final void Y() {
        }

        @Override // com.avito.android.advert_core.advert.p
        public final void x1() {
        }
    }

    /* compiled from: ImvGoodsAdvertFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/imv_goods_advert/ImvGoodsAdvertFragment$d", "Lcom/avito/android/advert_details_items/address/f$b;", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements f.b {
        @Override // com.avito.android.advert_details_items.address.f.b, com.avito.android.advert.item.parking.c.a
        public final void a(@Y61.k String str, boolean z12) {
        }

        @Override // com.avito.android.advert_details_items.address.f.b
        public final void j0(@Y61.k String str, @Y61.k Coordinates coordinates, @Y61.k String str2, @Y61.l RouteButtons routeButtons) {
        }
    }

    /* compiled from: ImvGoodsAdvertFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/imv_goods_advert/ImvGoodsAdvertFragment$c", "Lcom/avito/android/advert_details_items/georeference/c$a;", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements c.a {
        @Override // com.avito.android.advert_details_items.georeference.c.a
        public final void G0(@Y61.k String str, @Y61.l MultiAddressesInfo multiAddressesInfo, @Y61.k Coordinates coordinates, @Y61.k String str2, @Y61.l RouteButtons routeButtons) {
        }
    }
}
