package com.avito.android.publish.items.video_upload;

import Cd0.V;
import android.net.Uri;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.beduin.common.component.file_uploader.ValidationRule;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.ClickStreamLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.items.ItemWithState;
import com.avito.android.publish.C0;
import com.avito.android.publish.items.video_upload.VideoUploadItemView;
import com.avito.android.publish.video_upload.C;
import com.avito.android.publish.video_upload.InterfaceC34147b;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.AttributedDescription;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.DeliveryOnVideoUploadConfig;
import com.avito.android.remote.model.category_parameters.OnboardingV2;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.stories.StoriesLink;
import com.avito.android.util.InterfaceC35807h4;
import com.avito.android.video_requirements.depplink.VideoRequirementsQueryParameters;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.C42833p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VideoUploadItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/video_upload/f;", "Lcom/avito/android/publish/items/video_upload/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34147b f237273b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Q1 f237274c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f237275d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C0 f237276e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35807h4 f237277f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f237278g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.items.video_upload.a f237279h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C f237280i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final x f237281j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<ParameterElement.J> f237282k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<ParameterElement.J> f237283l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<ParameterElement.J> f237284m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<ParameterElement.J> f237285n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<ParameterElement.J> f237286o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f237287p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f237288q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f237289r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f237290s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f237291t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f237292u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f237293v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public VideoUploadItemView.State f237294w;

    /* compiled from: VideoUploadItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f237295a;

        static {
            int[] iArr = new int[VideoUploadItemView.State.values().length];
            try {
                VideoUploadItemView.State state = VideoUploadItemView.State.f237254b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                VideoUploadItemView.State state2 = VideoUploadItemView.State.f237254b;
                iArr[5] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                VideoUploadItemView.State state3 = VideoUploadItemView.State.f237254b;
                iArr[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                VideoUploadItemView.State state4 = VideoUploadItemView.State.f237254b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                VideoUploadItemView.State state5 = VideoUploadItemView.State.f237254b;
                iArr[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                VideoUploadItemView.State state6 = VideoUploadItemView.State.f237254b;
                iArr[1] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                VideoUploadItemView.State state7 = VideoUploadItemView.State.f237254b;
                iArr[2] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f237295a = iArr;
        }
    }

    /* compiled from: VideoUploadItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ParameterElement.J f237297m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ParameterElement.J j12) {
            super(0);
            this.f237297m = j12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            f.this.f237286o.accept(this.f237297m);
            return G0.f406611a;
        }
    }

    @Inject
    public f(@Y61.k InterfaceC34147b interfaceC34147b, @Y61.k Q1 q12, @Y61.k com.avito.android.details.a aVar, @Y61.k C0 c02, @Y61.k InterfaceC35807h4 interfaceC35807h4, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.publish.items.video_upload.a aVar2, @Y61.k C c12, @Y61.k x xVar) {
        this.f237273b = interfaceC34147b;
        this.f237274c = q12;
        this.f237275d = aVar;
        this.f237276e = c02;
        this.f237277f = interfaceC35807h4;
        this.f237278g = interfaceC28373a;
        this.f237279h = aVar2;
        this.f237280i = c12;
        this.f237281j = xVar;
        com.jakewharton.rxrelay3.c<ParameterElement.J> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f237282k = cVar;
        this.f237283l = new com.jakewharton.rxrelay3.c<>();
        com.jakewharton.rxrelay3.c<ParameterElement.J> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f237284m = cVar2;
        com.jakewharton.rxrelay3.c<ParameterElement.J> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f237285n = cVar3;
        com.jakewharton.rxrelay3.c<ParameterElement.J> cVar4 = new com.jakewharton.rxrelay3.c<>();
        this.f237286o = cVar4;
        com.jakewharton.rxrelay3.c<G0> cVar5 = new com.jakewharton.rxrelay3.c<>();
        this.f237287p = cVar5;
        this.f237288q = new C41981q0(cVar);
        this.f237289r = new C41981q0(cVar2);
        this.f237290s = new C41981q0(cVar3);
        this.f237291t = new C41981q0(cVar4);
        this.f237292u = new C41981q0(cVar5);
    }

    @Override // com.avito.android.publish.items.video_upload.d
    @Y61.k
    /* renamed from: D2, reason: from getter */
    public final C41981q0 getF237290s() {
        return this.f237290s;
    }

    @Override // com.avito.android.publish.items.video_upload.d
    @Y61.k
    /* renamed from: F2, reason: from getter */
    public final C41981q0 getF237292u() {
        return this.f237292u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.avito.android.publish.items.video_upload.e] */
    /* JADX WARN: Type inference failed for: r6v8, types: [com.avito.android.publish.items.video_upload.e] */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Image image;
        Boolean value;
        Boolean value2;
        Boolean value3;
        Boolean value4;
        Boolean value5;
        Boolean value6;
        final VideoUploadItemView videoUploadItemView = (VideoUploadItemView) eVar;
        final ParameterElement.J j12 = (ParameterElement.J) aVar;
        InterfaceC34147b interfaceC34147b = this.f237273b;
        com.avito.android.details.a aVar2 = this.f237275d;
        try {
            this.f237280i.Ba(videoUploadItemView);
            videoUploadItemView.C50(j12);
            CategoryParameters categoryParametersC0 = aVar2.C0();
            ParameterSlot parameterSlotFindParameter = categoryParametersC0 != null ? categoryParametersC0.findParameter("deliveryPvz") : null;
            BooleanParameter booleanParameter = parameterSlotFindParameter instanceof BooleanParameter ? (BooleanParameter) parameterSlotFindParameter : null;
            boolean z12 = false;
            boolean zBooleanValue = (booleanParameter == null || (value6 = booleanParameter.getValue()) == null) ? false : value6.booleanValue();
            CategoryParameters categoryParametersC02 = aVar2.C0();
            ParameterSlot parameterSlotFindParameter2 = categoryParametersC02 != null ? categoryParametersC02.findParameter("deliveryCourier") : null;
            BooleanParameter booleanParameter2 = parameterSlotFindParameter2 instanceof BooleanParameter ? (BooleanParameter) parameterSlotFindParameter2 : null;
            boolean zBooleanValue2 = (booleanParameter2 == null || (value5 = booleanParameter2.getValue()) == null) ? false : value5.booleanValue();
            CategoryParameters categoryParametersC03 = aVar2.C0();
            ParameterSlot parameterSlotFindParameter3 = categoryParametersC03 != null ? categoryParametersC03.findParameter("deliveryPostamat") : null;
            BooleanParameter booleanParameter3 = parameterSlotFindParameter3 instanceof BooleanParameter ? (BooleanParameter) parameterSlotFindParameter3 : null;
            boolean zBooleanValue3 = (booleanParameter3 == null || (value4 = booleanParameter3.getValue()) == null) ? false : value4.booleanValue();
            CategoryParameters categoryParametersC04 = aVar2.C0();
            ParameterSlot parameterSlotFindParameter4 = categoryParametersC04 != null ? categoryParametersC04.findParameter("deliveryDbs") : null;
            BooleanParameter booleanParameter4 = parameterSlotFindParameter4 instanceof BooleanParameter ? (BooleanParameter) parameterSlotFindParameter4 : null;
            boolean zBooleanValue4 = (booleanParameter4 == null || (value3 = booleanParameter4.getValue()) == null) ? false : value3.booleanValue();
            CategoryParameters categoryParametersC05 = aVar2.C0();
            ParameterSlot parameterSlotFindParameter5 = categoryParametersC05 != null ? categoryParametersC05.findParameter("deliveryDbsCourier") : null;
            BooleanParameter booleanParameter5 = parameterSlotFindParameter5 instanceof BooleanParameter ? (BooleanParameter) parameterSlotFindParameter5 : null;
            boolean zBooleanValue5 = (booleanParameter5 == null || (value2 = booleanParameter5.getValue()) == null) ? false : value2.booleanValue();
            CategoryParameters categoryParametersC06 = aVar2.C0();
            ParameterSlot parameterSlotFindParameter6 = categoryParametersC06 != null ? categoryParametersC06.findParameter("deliveryCdbs") : null;
            BooleanParameter booleanParameter6 = parameterSlotFindParameter6 instanceof BooleanParameter ? (BooleanParameter) parameterSlotFindParameter6 : null;
            boolean zBooleanValue6 = (booleanParameter6 == null || (value = booleanParameter6.getValue()) == null) ? false : value.booleanValue();
            DeliveryOnVideoUploadConfig deliveryOnVideoUploadConfig = j12.f117349p;
            C0 c02 = this.f237276e;
            boolean z13 = deliveryOnVideoUploadConfig != null && (c02.Be() || !(zBooleanValue || zBooleanValue2 || zBooleanValue3 || zBooleanValue4 || zBooleanValue5 || zBooleanValue6));
            k(videoUploadItemView, j12, z13);
            boolean zBooleanValue7 = this.f237274c.w().invoke().booleanValue();
            String str = j12.f117338e;
            Boolean bool = j12.f117346m;
            if (!zBooleanValue7 || L.f(bool, Boolean.TRUE)) {
                videoUploadItemView.K0(str, bool != null ? bool.booleanValue() : false);
            } else {
                videoUploadItemView.setTitle(this.f237277f.a(str, false, j12.f117352s));
            }
            videoUploadItemView.h(j12.f117339f);
            final int i13 = 0;
            final boolean z14 = z13;
            videoUploadItemView.vh(new View.OnClickListener(this) { // from class: com.avito.android.publish.items.video_upload.e

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ f f237269c;

                {
                    this.f237269c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            f fVar = this.f237269c;
                            Q1 q12 = fVar.f237274c;
                            q12.getClass();
                            kotlin.reflect.n<Object> nVar = Q1.f67448x0[19];
                            boolean zBooleanValue8 = ((Boolean) q12.f67514u.a().invoke()).booleanValue();
                            ParameterElement.J j13 = j12;
                            boolean z15 = j13.f117350q;
                            if (!zBooleanValue8 && !z15) {
                                if (!z14) {
                                    fVar.f237282k.accept(j13);
                                    break;
                                } else {
                                    fVar.f237284m.accept(j13);
                                    break;
                                }
                            } else {
                                videoUploadItemView.w70(j13.f117351r, z15);
                                break;
                            }
                        default:
                            f fVar2 = this.f237269c;
                            Q1 q13 = fVar2.f237274c;
                            q13.getClass();
                            kotlin.reflect.n<Object> nVar2 = Q1.f67448x0[19];
                            boolean zBooleanValue9 = ((Boolean) q13.f67514u.a().invoke()).booleanValue();
                            ParameterElement.J j14 = j12;
                            boolean z16 = j14.f117350q;
                            if (!zBooleanValue9 && !z16) {
                                if (!z14) {
                                    fVar2.f237283l.accept(j14);
                                    break;
                                } else {
                                    fVar2.f237284m.accept(j14);
                                    break;
                                }
                            } else {
                                videoUploadItemView.w70(j14.f117351r, z16);
                                break;
                            }
                    }
                }
            });
            final int i14 = 1;
            final boolean z15 = z13;
            videoUploadItemView.Qk(new View.OnClickListener(this) { // from class: com.avito.android.publish.items.video_upload.e

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ f f237269c;

                {
                    this.f237269c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            f fVar = this.f237269c;
                            Q1 q12 = fVar.f237274c;
                            q12.getClass();
                            kotlin.reflect.n<Object> nVar = Q1.f67448x0[19];
                            boolean zBooleanValue8 = ((Boolean) q12.f67514u.a().invoke()).booleanValue();
                            ParameterElement.J j13 = j12;
                            boolean z152 = j13.f117350q;
                            if (!zBooleanValue8 && !z152) {
                                if (!z15) {
                                    fVar.f237282k.accept(j13);
                                    break;
                                } else {
                                    fVar.f237284m.accept(j13);
                                    break;
                                }
                            } else {
                                videoUploadItemView.w70(j13.f117351r, z152);
                                break;
                            }
                        default:
                            f fVar2 = this.f237269c;
                            Q1 q13 = fVar2.f237274c;
                            q13.getClass();
                            kotlin.reflect.n<Object> nVar2 = Q1.f67448x0[19];
                            boolean zBooleanValue9 = ((Boolean) q13.f67514u.a().invoke()).booleanValue();
                            ParameterElement.J j14 = j12;
                            boolean z16 = j14.f117350q;
                            if (!zBooleanValue9 && !z16) {
                                if (!z15) {
                                    fVar2.f237283l.accept(j14);
                                    break;
                                } else {
                                    fVar2.f237284m.accept(j14);
                                    break;
                                }
                            } else {
                                videoUploadItemView.w70(j14.f117351r, z16);
                                break;
                            }
                    }
                }
            });
            videoUploadItemView.gi(new com.avito.android.job.cv_info_actualization.ui.items.radio.g(this, j12, videoUploadItemView, 8));
            Uri f245585s = interfaceC34147b.getF245585S();
            this.f237293v = false;
            ItemWithState.State state = j12.f117353t;
            boolean z16 = state instanceof ItemWithState.State.Error.ErrorWithMessage;
            String str2 = j12.f117341h;
            if (z16) {
                CharSequence charSequence = ((ItemWithState.State.Error.ErrorWithMessage) state).f173897b;
                VideoUploadItemView.State state2 = VideoUploadItemView.State.f237259g;
                this.f237294w = state2;
                videoUploadItemView.NC(charSequence);
                videoUploadItemView.Lg(state2, null);
            } else if (state instanceof ItemWithState.State.Warning) {
                CharSequence charSequence2 = ((ItemWithState.State.Warning) state).f173900b;
                VideoUploadItemView.State state3 = VideoUploadItemView.State.f237259g;
                this.f237294w = state3;
                videoUploadItemView.NC(charSequence2);
                videoUploadItemView.Lg(state3, null);
            } else {
                videoUploadItemView.OE();
                VideoUploadItemView.State f245586t = interfaceC34147b.getF245586T();
                this.f237294w = f245586t;
                int i15 = f245586t == null ? -1 : a.f237295a[f245586t.ordinal()];
                if (i15 == 1 || i15 == 2 || i15 == 3) {
                    videoUploadItemView.Lg(f245586t, null);
                } else if (i15 == 4) {
                    videoUploadItemView.Lg(f245586t, f245585s);
                    this.f237293v = true;
                } else if (i15 != 5) {
                    if (str2 != null && (image = j12.f117342i) != null) {
                        videoUploadItemView.Lg(VideoUploadItemView.State.f237255c, null);
                        videoUploadItemView.x(com.avito.android.image_loader.b.b(image));
                    } else if (str2 != null) {
                        videoUploadItemView.Lg(VideoUploadItemView.State.f237256d, null);
                    } else if (f245585s == null) {
                        videoUploadItemView.Lg(VideoUploadItemView.State.f237254b, null);
                    }
                } else if (f245585s != null) {
                    videoUploadItemView.Lg(VideoUploadItemView.State.f237255c, null);
                    videoUploadItemView.Sm(f245585s);
                } else {
                    videoUploadItemView.Lg(VideoUploadItemView.State.f237256d, null);
                }
            }
            boolean zBe = c02.Be();
            com.avito.android.publish.items.video_upload.a aVar3 = this.f237279h;
            if (zBe) {
                videoUploadItemView.l40(new g(this));
            } else {
                if (str2 != null) {
                    VideoUploadItemView.State state4 = this.f237294w;
                    int i16 = state4 == null ? -1 : a.f237295a[state4.ordinal()];
                    if (i16 == -1 || i16 == 5 || i16 == 6 || i16 == 7) {
                        z12 = true;
                    }
                }
                aVar3.z4(z12);
            }
            aVar3.I8(new h(videoUploadItemView), !this.f237293v);
        } catch (Exception e12) {
            this.f237278g.c(new V(Collections.singletonList(C42833p.b(e12)), String.valueOf(aVar2.C0())));
        }
    }

    @Override // com.avito.android.publish.items.video_upload.d
    @Y61.k
    /* renamed from: S4, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF237283l() {
        return this.f237283l;
    }

    @Override // com.avito.android.publish.items.video_upload.d
    @Y61.k
    /* renamed from: Y4, reason: from getter */
    public final C41981q0 getF237288q() {
        return this.f237288q;
    }

    public final void k(VideoUploadItemView videoUploadItemView, ParameterElement.J j12, boolean z12) {
        DeepLink deepLink;
        Navigation navigation2;
        Integer categoryId;
        AttributedDescription.AttributedDescriptionAttributes attributes;
        AttributedDescription.AttributedDescriptionAttributes.AttributedDescriptionLink link;
        AttributedDescription.AttributedDescriptionAttributes.AttributedDescriptionLink.Link value;
        AttributedDescription.AttributedDescriptionAttributes attributes2;
        AttributedDescription.AttributedDescriptionAttributes.AttributedDescriptionLink link2;
        AttributedDescription.AttributedDescriptionAttributes.AttributedDescriptionLink.Link value2;
        DeepLink deepLink2;
        String uri;
        DeliveryOnVideoUploadConfig.DeliveryLinkOnVideoUploadConfig link3;
        x xVar = this.f237281j;
        if (z12) {
            DeliveryOnVideoUploadConfig deliveryOnVideoUploadConfig = j12.f117349p;
            String condition = deliveryOnVideoUploadConfig != null ? deliveryOnVideoUploadConfig.getCondition() : null;
            DeliveryOnVideoUploadConfig deliveryOnVideoUploadConfig2 = j12.f117349p;
            videoUploadItemView.Xv(new b(j12), condition, (deliveryOnVideoUploadConfig2 == null || (link3 = deliveryOnVideoUploadConfig2.getLink()) == null) ? null : link3.getTitle());
        } else {
            AttributedDescription attributedDescription = j12.f117340g;
            String text = attributedDescription != null ? attributedDescription.getText() : null;
            AttributedDescription attributedDescription2 = j12.f117340g;
            String title = (attributedDescription2 == null || (attributes2 = attributedDescription2.getAttributes()) == null || (link2 = attributes2.getLink()) == null || (value2 = link2.getValue()) == null) ? null : value2.getTitle();
            String uri2 = (attributedDescription2 == null || (attributes = attributedDescription2.getAttributes()) == null || (link = attributes.getLink()) == null || (value = link.getValue()) == null) ? null : value.getUri();
            CategoryParameters categoryParametersC0 = this.f237275d.C0();
            Long lValueOf = (categoryParametersC0 == null || (navigation2 = categoryParametersC0.getNavigation()) == null || (categoryId = navigation2.getCategoryId()) == null) ? null : Long.valueOf(categoryId.intValue());
            if (uri2 == null) {
                deepLink = null;
            } else {
                Uri.Builder builderBuildUpon = Uri.parse(uri2).buildUpon();
                if (lValueOf != null) {
                    long jLongValue = lValueOf.longValue();
                    VideoRequirementsQueryParameters[] videoRequirementsQueryParametersArr = VideoRequirementsQueryParameters.f326007b;
                    builderBuildUpon.appendQueryParameter("categoryId", String.valueOf(jLongValue));
                }
                Long l12 = j12.f117345l;
                if (l12 != null) {
                    long jLongValue2 = l12.longValue();
                    VideoRequirementsQueryParameters[] videoRequirementsQueryParametersArr2 = VideoRequirementsQueryParameters.f326007b;
                    builderBuildUpon.appendQueryParameter("minDuration", String.valueOf(jLongValue2));
                }
                Long l13 = j12.f117344k;
                if (l13 != null) {
                    long jLongValue3 = l13.longValue();
                    VideoRequirementsQueryParameters[] videoRequirementsQueryParametersArr3 = VideoRequirementsQueryParameters.f326007b;
                    builderBuildUpon.appendQueryParameter("maxDuration", String.valueOf(jLongValue3));
                }
                Long l14 = j12.f117343j;
                if (l14 != null) {
                    long jLongValue4 = l14.longValue();
                    VideoRequirementsQueryParameters[] videoRequirementsQueryParametersArr4 = VideoRequirementsQueryParameters.f326007b;
                    builderBuildUpon.appendQueryParameter(ValidationRule.MAX_FILE_SIZE_RULE, String.valueOf(jLongValue4));
                }
                Object objF = xVar.f(builderBuildUpon.build());
                int i12 = Z.f406624c;
                if (objF instanceof Z.b) {
                    objF = null;
                }
                deepLink = (DeepLink) objF;
            }
            videoUploadItemView.Ot(deepLink, text, title);
        }
        OnboardingV2 onboardingV2 = j12.f117348o;
        if (onboardingV2 == null) {
            videoUploadItemView.oG(false);
            return;
        }
        OnboardingV2.Action action = onboardingV2.getAction();
        if (action == null || (uri = action.getUri()) == null) {
            deepLink2 = null;
        } else {
            Object objC = xVar.c(uri);
            int i13 = Z.f406624c;
            if (objC instanceof Z.b) {
                objC = null;
            }
            deepLink2 = (DeepLink) objC;
        }
        ClickStreamLink clickStreamLink = deepLink2 instanceof ClickStreamLink ? (ClickStreamLink) deepLink2 : null;
        DeepLink deepLink3 = clickStreamLink != null ? clickStreamLink.f133110e : null;
        StoriesLink storiesLink = deepLink3 instanceof StoriesLink ? (StoriesLink) deepLink3 : null;
        ClickStreamLink clickStreamLinkA = storiesLink != null ? ClickStreamLink.a(clickStreamLink, new StoriesLink(storiesLink.f285018b, storiesLink.f285019c, storiesLink.f285020d, storiesLink.f285022f, true)) : null;
        videoUploadItemView.oG(true);
        videoUploadItemView.tY(onboardingV2, clickStreamLinkA);
    }

    @Override // com.avito.android.publish.items.video_upload.d
    @Y61.k
    /* renamed from: n6, reason: from getter */
    public final C41981q0 getF237289r() {
        return this.f237289r;
    }

    @Override // com.avito.android.publish.items.video_upload.d
    @Y61.k
    /* renamed from: w6, reason: from getter */
    public final C41981q0 getF237291t() {
        return this.f237291t;
    }
}
