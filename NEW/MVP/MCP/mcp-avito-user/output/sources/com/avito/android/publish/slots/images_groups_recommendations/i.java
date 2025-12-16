package com.avito.android.publish.slots.images_groups_recommendations;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.category_parameters.f;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.photo_list_view.InterfaceC33214h;
import com.avito.android.publish.C0;
import com.avito.android.publish.slots.images_groups_recommendations.item.GroupTitle;
import com.avito.android.publish.slots.images_groups_recommendations.item.ImagesGroupsRecommendationsItem;
import com.avito.android.publish.slots.images_groups_recommendations.item.Recommendation;
import com.avito.android.publish.slots.images_groups_recommendations.item.Title;
import com.avito.android.publish.slots.q;
import com.avito.android.remote.model.ImageUploadResult;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.PhotoParameterKt;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.images_groups_recommendations.ImagesGroupsRecommendationsSlot;
import com.avito.android.remote.model.category_parameters.slot.images_groups_recommendations.ImagesGroupsRecommendationsSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.images_groups_recommendations.Recommendation;
import com.avito.android.util.R0;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.X;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;

/* compiled from: ImagesGroupsRecommendationsSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/images_groups_recommendations/i;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/images_groups_recommendations/ImagesGroupsRecommendationsSlot;", "Lcom/avito/android/publish/slots/q;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.android.category_parameters.k<ImagesGroupsRecommendationsSlot> implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ImagesGroupsRecommendationsSlot f244172b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f244173c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_list_view_groups.h f244174d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33214h f244175e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Q1 f244176f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C0 f244177g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final g80.d f244178h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> f244179i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f244180j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final C43238h f244181k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public N0 f244182l;

    /* renamed from: m, reason: collision with root package name */
    public int f244183m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f244184n;

    /* renamed from: o, reason: collision with root package name */
    public int f244185o;

    /* compiled from: ImagesGroupsRecommendationsSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.slots.images_groups_recommendations.ImagesGroupsRecommendationsSlotWrapper$1", f = "ImagesGroupsRecommendationsSlotWrapper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<Object, Continuation<? super G0>, Object> {
        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return i.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(Object obj, Continuation<? super G0> continuation) {
            return ((a) create(obj, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            i.this.f244179i.accept(new f.b(SlotType.IMAGES_GROUPS_RECOMMENDATIONS, null));
            return G0.f406611a;
        }
    }

    @i31.c
    public i(@InterfaceC41220a @Y61.k ImagesGroupsRecommendationsSlot imagesGroupsRecommendationsSlot, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.photo_list_view_groups.h hVar, @Y61.k InterfaceC33214h interfaceC33214h, @Y61.k Q1 q12, @Y61.k C0 c02, @Y61.k g80.d dVar, @Y61.k R0 r02) {
        this.f244172b = imagesGroupsRecommendationsSlot;
        this.f244173c = interfaceC28373a;
        this.f244174d = hVar;
        this.f244175e = interfaceC33214h;
        this.f244176f = q12;
        this.f244177g = c02;
        this.f244178h = dVar;
        com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f244179i = cVar;
        this.f244180j = cVar;
        C43238h c43238hA = U.a(r02.a());
        this.f244181k = c43238hA;
        this.f244183m = ((ImagesGroupsRecommendationsSlotConfig) imagesGroupsRecommendationsSlot.getWidget().getConfig()).getSkeletonsCount();
        C43175k.K(new C43197r1(new a(null), C43175k.n(C43175k.N(hVar.getF218624R(), hVar.getF218626T()), 1000L)), c43238hA);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Recommendation recommendation : ((ImagesGroupsRecommendationsSlotConfig) imagesGroupsRecommendationsSlot.getWidget().getConfig()).getRecommendations()) {
            linkedHashMap.put(recommendation.getGroupTitle().getOne(), String.valueOf(recommendation.getCount()));
        }
        this.f244178h.f(linkedHashMap);
        l();
    }

    @Override // com.avito.android.publish.slots.q
    @Y61.k
    public final z<com.avito.android.category_parameters.f> a() {
        return this.f244180j;
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
        U.b(this.f244181k, null);
        this.f244185o = 0;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f244172b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        boolean z12;
        ArrayList arrayList;
        PhotoParameter photoParameter;
        PhotoParameter.ImageUploadListWrapper value;
        if (!this.f244184n) {
            for (Recommendation recommendation : ((ImagesGroupsRecommendationsSlotConfig) this.f244172b.getWidget().getConfig()).getRecommendations()) {
                if (this.f244174d.c9(recommendation.getGroupId()) < recommendation.getCount()) {
                    CategoryParameters categoryParameters = this.f244177g.f231873k0;
                    if (categoryParameters != null && (photoParameter = (PhotoParameter) categoryParameters.getFirstParameterOfType(PhotoParameter.class)) != null && (value = photoParameter.getValue()) != null) {
                        List<ImageUploadResult> onlyUploaded = value.getOnlyUploaded();
                        if (value.size() == onlyUploaded.size()) {
                            for (ImageUploadResult imageUploadResult : onlyUploaded) {
                                String uploadId = imageUploadResult.getUploadId();
                                com.avito.android.photo_list_view_groups.h hVar = this.f244174d;
                                if (hVar.Mc(uploadId) || hVar.C3(imageUploadResult.getUploadId())) {
                                }
                            }
                            z12 = false;
                        }
                        z12 = true;
                        break;
                    }
                    z12 = false;
                    if (z12) {
                        arrayList = new ArrayList();
                        int i12 = this.f244183m;
                        for (int i13 = 0; i13 < i12; i13++) {
                            arrayList.add(new Recommendation.Skeleton(String.valueOf(i13)));
                        }
                    } else {
                        this.f244183m = 0;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        List<com.avito.android.remote.model.category_parameters.slot.images_groups_recommendations.Recommendation> recommendations = ((ImagesGroupsRecommendationsSlotConfig) this.f244172b.getWidget().getConfig()).getRecommendations();
                        ArrayList arrayList2 = new ArrayList();
                        for (com.avito.android.remote.model.category_parameters.slot.images_groups_recommendations.Recommendation recommendation2 : recommendations) {
                            int iC9 = this.f244174d.c9(recommendation2.getGroupId());
                            int count = recommendation2.getCount();
                            Recommendation.Content content = iC9 >= count ? null : new Recommendation.Content(recommendation2.getGroupId(), count - iC9, recommendation2.getImage(), recommendation2.getGroupId(), new GroupTitle(recommendation2.getGroupTitle().getOne(), recommendation2.getGroupTitle().getFew(), recommendation2.getGroupTitle().getMany(), recommendation2.getGroupTitle().getConnectorString()), recommendation2.getLongPostfixFormat(), recommendation2.getShortPostfixFormat(), recommendation2.getLongSuggestPostfixFormat(), recommendation2.getShortSuggestPostfixFormat(), recommendation2.getImageOffset());
                            if (content != null) {
                                this.f244183m++;
                                linkedHashMap.put(content.f244198f.f244187b, String.valueOf(content.f244195c));
                            }
                            if (content != null) {
                                arrayList2.add(content);
                            }
                        }
                        this.f244178h.e(linkedHashMap);
                        arrayList = arrayList2;
                    }
                    if (arrayList.isEmpty()) {
                        return C42784z0.f406748b;
                    }
                    return Collections.singletonList(new ImagesGroupsRecommendationsItem(this.f244172b.getId(), z12 ? Title.Skeleton.f244206b : new Title.Content(((ImagesGroupsRecommendationsSlotConfig) this.f244172b.getWidget().getConfig()).getTitle()), arrayList));
                }
            }
        }
        return C42784z0.f406748b;
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final void l() {
        CategoryParameters categoryParameters = this.f244177g.f231873k0;
        PhotoParameter photoParameter = categoryParameters != null ? (PhotoParameter) categoryParameters.getFirstParameterOfType(PhotoParameter.class) : null;
        if (photoParameter == null) {
            this.f244173c.c(new NonFatalErrorEvent("PhotoParameter should not be null in ImagesGroupsRecommendationsSlot", null, null, null, 14, null));
            return;
        }
        N0 n02 = this.f244182l;
        if (n02 != null) {
            n02.c(null);
        }
        this.f244182l = C43175k.K(new X(new C43152f0(new C43197r1(new j(this, null), C43175k.V(C43175k.r(y.a(this.f244175e.a())), PhotoParameterKt.maxPhotos(photoParameter))), new k(this, null)), new l(this, null)), this.f244181k);
    }
}
