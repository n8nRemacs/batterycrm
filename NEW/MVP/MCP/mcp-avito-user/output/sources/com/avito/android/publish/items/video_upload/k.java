package com.avito.android.publish.items.video_upload;

import L91.q;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.ClickStreamLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.d;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.publish.items.video_upload.VideoUploadItemView;
import com.avito.android.publish.video_upload.VideoUploadProgressBar;
import com.avito.android.remote.model.category_parameters.OnboardingV2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: VideoUploadItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/items/video_upload/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/items/video_upload/VideoUploadItemView;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k extends com.avito.konveyor.adapter.b implements VideoUploadItemView {

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public static final PointF f237311N;

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f237312A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f237313B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f237314C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final TextView f237315D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final TextView f237316E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final Button f237317F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f237318G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final StyledPlayerView f237319H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public ParameterElement.J f237320I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.l
    public VideoUploadItemView.State f237321J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public Uri f237322K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f237323L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final d f237324M;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f237325b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.player_holder.a f237326c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f237327d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f237328e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f237329f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f237330g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f237331h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f237332i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f237333j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final VideoUploadProgressBar f237334k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f237335l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.image_loader.d f237336m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final View f237337n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final TextView f237338o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final TextView f237339p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f237340q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final TextView f237341r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final TextView f237342s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final ImageView f237343t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final TextView f237344u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final ImageView f237345v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final TextView f237346w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final View f237347x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final ImageView f237348y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final TextView f237349z;

    /* compiled from: VideoUploadItemView.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/publish/items/video_upload/k$a;", "", "<init>", "()V", "", "CLICKABLE_TEXT_PLACEHOLDER", "Ljava/lang/String;", "", "MEGABYTES_TO_BYTES_MULTIPLIER", "I", "", "ONBOARDING_ANIMATION_DURATION_MS", "J", "Landroid/graphics/PointF;", "ONBOARDING_IMAGE_FOCUS_POINT", "Landroid/graphics/PointF;", "ONBOARDING_PLAYER_KEY", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VideoUploadItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[VideoUploadItemView.State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                VideoUploadItemView.State state = VideoUploadItemView.State.f237254b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                VideoUploadItemView.State state2 = VideoUploadItemView.State.f237254b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                VideoUploadItemView.State state3 = VideoUploadItemView.State.f237254b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                VideoUploadItemView.State state4 = VideoUploadItemView.State.f237254b;
                iArr[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                VideoUploadItemView.State state5 = VideoUploadItemView.State.f237254b;
                iArr[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                VideoUploadItemView.State state6 = VideoUploadItemView.State.f237254b;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: VideoUploadItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/publish/items/video_upload/k$c", "Landroid/text/style/ClickableSpan;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends ClickableSpan {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f237350b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.a<G0> aVar) {
            this.f237350b = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // android.text.style.ClickableSpan
        public final void onClick(@Y61.k View view) {
            this.f237350b.invoke();
        }
    }

    /* compiled from: VideoUploadItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/publish/items/video_upload/k$d", "Lcom/google/android/exoplayer2/d0$g;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements d0.g {
        public d() {
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onPlaybackStateChanged(int i12) {
            if (i12 == 3) {
                k kVar = k.this;
                kVar.f237318G.setAlpha(0.0f);
                kVar.f237319H.setAlpha(1.0f);
            }
        }
    }

    /* compiled from: VideoUploadItemView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ DeepLink f237353l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ k f237354m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(DeepLink deepLink, k kVar) {
            super(0);
            this.f237353l = deepLink;
            this.f237354m = kVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink deepLink = this.f237353l;
            if (deepLink != null) {
                b.a.a(this.f237354m.f237327d, deepLink, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VideoUploadItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f237356m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a<G0> aVar) {
            super(0);
            this.f237356m = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            VideoUploadItemView.State state = VideoUploadItemView.State.f237258f;
            PointF pointF = k.f237311N;
            k.this.D80(state);
            Y41.a<G0> aVar = this.f237356m;
            if (aVar != null) {
                aVar.invoke();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VideoUploadItemView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<ParameterElement.J, G0> f237358m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(Y41.l<? super ParameterElement.J, G0> lVar) {
            super(0);
            this.f237358m = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            Y41.l<ParameterElement.J, G0> lVar;
            k kVar = k.this;
            ParameterElement.J j12 = kVar.f237320I;
            if (j12 != null && (lVar = this.f237358m) != null) {
                lVar.invoke(j12);
            }
            D6.w(kVar.f237337n);
            return G0.f406611a;
        }
    }

    static {
        new a(null);
        f237311N = new PointF(0.5f, 0.0f);
    }

    public k(@Y61.k View view, @Y61.k com.avito.android.player_holder.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        super(view);
        this.f237325b = view;
        this.f237326c = aVar;
        this.f237327d = aVar2;
        this.f237328e = (ComponentContainer) view.findViewById(R.id.container);
        this.f237329f = (ViewGroup) view.findViewById(R.id.add_video_view_group);
        this.f237330g = (ViewGroup) view.findViewById(R.id.record_video_view_group);
        this.f237331h = (ViewGroup) view.findViewById(R.id.video_picked_has_not_thumbnail_view_group);
        this.f237332i = (ViewGroup) view.findViewById(R.id.video_picked_has_thumbnail_view_group);
        this.f237333j = (TextView) view.findViewById(R.id.video_upload_size_progress);
        this.f237334k = (VideoUploadProgressBar) view.findViewById(R.id.video_upload_progress_bar);
        this.f237335l = (SimpleDraweeView) view.findViewById(R.id.video_thumbnail_view);
        this.f237336m = new com.avito.android.image_loader.e().a(view.getContext());
        this.f237337n = view.findViewById(R.id.clickable_area_remove_video_icon);
        this.f237338o = (TextView) view.findViewById(R.id.error_text_view);
        this.f237339p = (TextView) view.findViewById(R.id.disable_video_uploading_text);
        this.f237340q = (LinearLayout) view.findViewById(R.id.video_uploading_disabled_outline);
        this.f237341r = (TextView) view.findViewById(R.id.delivery_description);
        this.f237342s = (TextView) view.findViewById(R.id.requirements_description);
        this.f237343t = (ImageView) view.findViewById(R.id.video_upload_icon);
        this.f237344u = (TextView) view.findViewById(R.id.video_upload_text);
        this.f237345v = (ImageView) view.findViewById(R.id.record_video_icon);
        this.f237346w = (TextView) view.findViewById(R.id.record_video_text);
        this.f237347x = view.findViewById(R.id.picked_video_disabled_overlay);
        this.f237348y = (ImageView) view.findViewById(R.id.video_picked_has_not_thumbnail_icon);
        this.f237349z = (TextView) view.findViewById(R.id.video_picked_has_not_thumbnail_text);
        this.f237312A = (FrameLayout) view.findViewById(R.id.video_thumbnail_disabled_outline);
        this.f237313B = (ConstraintLayout) view.findViewById(R.id.onboarding_container);
        this.f237314C = (FrameLayout) view.findViewById(R.id.onboarding_media_container);
        this.f237315D = (TextView) view.findViewById(R.id.onboarding_title);
        this.f237316E = (TextView) view.findViewById(R.id.onboarding_subtitle);
        this.f237317F = (Button) view.findViewById(R.id.onboarding_action_button);
        this.f237318G = (SimpleDraweeView) view.findViewById(R.id.onboarding_image);
        this.f237319H = (StyledPlayerView) view.findViewById(R.id.onboarding_player);
        this.f237324M = new d();
    }

    public final SpannableStringBuilder B80(Y41.a aVar, String str, String str2) {
        c cVar = new c(aVar);
        int I12 = C43066x.I(str, str2, 0, false, 6);
        int length = str2.length() + I12;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(cVar, I12, length, 33);
        spannableStringBuilder.setSpan(new UnderlineSpan(), I12, length, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C35835l0.d(R.attr.gray54, this.f237328e.getContext())), I12, length, 33);
        return spannableStringBuilder;
    }

    @Override // com.avito.android.publish.items.video_upload.VideoUploadItemView
    public final void C50(@Y61.k ParameterElement.J j12) {
        this.f237320I = j12;
    }

    public final void C80(Uri uri) {
        boolean z12 = this.f237323L;
        SimpleDraweeView simpleDraweeView = this.f237318G;
        if (z12) {
            simpleDraweeView.setImageURI(uri);
            simpleDraweeView.setAlpha(1.0f);
            this.f237314C.setAlpha(1.0f);
        } else {
            com.facebook.drawee.backends.pipeline.f fVarA = com.facebook.drawee.backends.pipeline.d.f339915a.get();
            fVarA.e(uri);
            fVarA.f339987e = simpleDraweeView.getController();
            fVarA.f339986d = new l(this);
            simpleDraweeView.setController(fVarA.a());
        }
    }

    public final void D80(VideoUploadItemView.State state) {
        this.f237321J = state;
        int iOrdinal = state.ordinal();
        TextView textView = this.f237333j;
        VideoUploadProgressBar videoUploadProgressBar = this.f237334k;
        View view = this.f237337n;
        ViewGroup viewGroup = this.f237330g;
        ViewGroup viewGroup2 = this.f237329f;
        ViewGroup viewGroup3 = this.f237331h;
        ViewGroup viewGroup4 = this.f237332i;
        if (iOrdinal == 0) {
            D6.w(viewGroup3);
            D6.w(viewGroup4);
            D6.H(viewGroup2);
            D6.H(viewGroup);
            D6.w(view);
            D6.w(textView);
            D6.w(videoUploadProgressBar);
            videoUploadProgressBar.setProgressInPercentage(0);
            return;
        }
        if (iOrdinal == 1) {
            D6.w(viewGroup3);
            D6.H(viewGroup4);
            D6.w(viewGroup2);
            D6.w(viewGroup);
            D6.H(view);
            D6.w(textView);
            D6.w(videoUploadProgressBar);
            videoUploadProgressBar.setProgressInPercentage(0);
            return;
        }
        if (iOrdinal == 2) {
            D6.H(viewGroup3);
            D6.w(viewGroup4);
            D6.w(viewGroup2);
            D6.w(viewGroup);
            D6.H(view);
            D6.w(textView);
            D6.w(videoUploadProgressBar);
            videoUploadProgressBar.setProgressInPercentage(0);
            return;
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                E80();
                OE();
                return;
            } else {
                if (iOrdinal != 5) {
                    return;
                }
                E80();
                return;
            }
        }
        D6.w(viewGroup3);
        D6.H(viewGroup4);
        viewGroup4.setOnClickListener(new q(8));
        D6.w(viewGroup2);
        D6.w(viewGroup);
        D6.w(view);
        videoUploadProgressBar.f245532b.c();
        D6.H(videoUploadProgressBar.f245533c);
        D6.w(videoUploadProgressBar.f245534d);
        videoUploadProgressBar.f245535e.setOnClickListener(new com.avito.android.publish.video_upload.o(videoUploadProgressBar, 0));
        D6.H(videoUploadProgressBar);
    }

    public final void E80() {
        boolean zY2 = D6.y(this.f237331h);
        View view = this.f237337n;
        if (!zY2 && !D6.y(this.f237332i)) {
            D6.w(view);
            return;
        }
        D6.w(this.f237329f);
        D6.w(this.f237330g);
        D6.w(this.f237333j);
        VideoUploadProgressBar videoUploadProgressBar = this.f237334k;
        D6.H(videoUploadProgressBar);
        videoUploadProgressBar.a();
        D6.H(view);
    }

    @Override // com.avito.android.publish.items.video_upload.o
    public final void Je(@Y61.k Ef0.b bVar, @Y61.l Y41.a<G0> aVar, @Y61.l Y41.l<? super ParameterElement.J, G0> lVar, @Y61.l Uri uri) {
        Lg(VideoUploadItemView.State.f237257e, uri);
        long j12 = 1048576;
        int i12 = (int) (bVar.f4136a / j12);
        int i13 = (int) (bVar.f4137b / j12);
        if (i13 > 0) {
            TextView textView = this.f237333j;
            D6.H(textView);
            textView.setText(this.f237328e.getContext().getString(R.string.upload_video_size_progress, Integer.valueOf(i12), Integer.valueOf(i13)));
        }
        g gVar = new g(aVar);
        VideoUploadProgressBar videoUploadProgressBar = this.f237334k;
        videoUploadProgressBar.setOnDismissListener(gVar);
        videoUploadProgressBar.setRetryClickListener(new h(lVar));
        videoUploadProgressBar.setProgressInPercentage((int) ((100 * i12) / i13));
    }

    @Override // com.avito.android.publish.items.video_upload.VideoUploadItemView
    public final void K0(@Y61.l String str, boolean z12) {
        ComponentContainer componentContainer = this.f237328e;
        String str2 = str;
        CharSequence charSequenceC = str;
        if (z12) {
            if (str == null) {
                str2 = "";
            }
            charSequenceC = com.avito.android.lib.design.badge.e.c(str2, componentContainer.getContext().getString(R.string.upload_video_badge_new_text), componentContainer.getContext(), 120);
        }
        componentContainer.setTitle(charSequenceC);
    }

    @Override // com.avito.android.publish.items.video_upload.VideoUploadItemView
    public final void Lg(@Y61.k VideoUploadItemView.State state, @Y61.l Uri uri) {
        if (uri != null && !L.f(this.f237322K, uri)) {
            Sm(uri);
        }
        if (this.f237321J != state) {
            D80(state);
        }
    }

    @Override // com.avito.android.publish.items.video_upload.VideoUploadItemView
    public final void NC(@Y61.k CharSequence charSequence) {
        TextView textView = this.f237338o;
        D6.H(textView);
        textView.setText(charSequence);
    }

    @Override // com.avito.android.publish.items.video_upload.VideoUploadItemView
    public final void OE() {
        D6.w(this.f237338o);
    }

    @Override // com.avito.android.publish.items.video_upload.VideoUploadItemView
    public final void Ot(@Y61.l DeepLink deepLink, @Y61.l String str, @Y61.l String str2) {
        TextView textView = this.f237342s;
        if (str != null && str2 != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(B80(new f(deepLink, this), C43066x.a0(str, "{{link}}", str2, false), str2));
            D6.H(textView);
        } else if (str != null) {
            textView.setText(str);
            D6.H(textView);
        } else {
            D6.w(textView);
        }
        D6.w(this.f237341r);
        ComponentContainer componentContainer = this.f237328e;
        this.f237343t.setColorFilter(C35835l0.d(R.attr.black, componentContainer.getContext()));
        this.f237344u.setTextColor(C35835l0.d(R.attr.black, componentContainer.getContext()));
        this.f237345v.setColorFilter(C35835l0.d(R.attr.black, componentContainer.getContext()));
        this.f237346w.setTextColor(C35835l0.d(R.attr.black, componentContainer.getContext()));
        this.f237348y.setColorFilter(C35835l0.d(R.attr.black, componentContainer.getContext()));
        this.f237349z.setTextColor(C35835l0.d(R.attr.black, componentContainer.getContext()));
        D6.w(this.f237347x);
    }

    @Override // com.avito.android.publish.items.video_upload.VideoUploadItemView
    public final void Qk(@Y61.l com.avito.android.publish.items.video_upload.e eVar) {
        ViewGroup viewGroup = this.f237330g;
        viewGroup.setOnClickListener(eVar);
        viewGroup.post(new j(viewGroup, 1));
    }

    @Override // com.avito.android.publish.items.video_upload.VideoUploadItemView
    public final void Sm(@Y61.k Uri uri) throws SecurityException, IllegalArgumentException {
        SimpleDraweeView simpleDraweeView = this.f237335l;
        this.f237322K = uri;
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(simpleDraweeView.getContext(), uri);
            simpleDraweeView.setImageDrawable(new BitmapDrawable(simpleDraweeView.getContext().getResources(), mediaMetadataRetriever.getFrameAtTime()));
        } catch (IllegalArgumentException unused) {
            D80(VideoUploadItemView.State.f237256d);
        } catch (SecurityException unused2) {
            D80(VideoUploadItemView.State.f237256d);
        }
    }

    @Override // com.avito.android.publish.items.video_upload.VideoUploadItemView
    public final void Xv(@Y61.k Y41.a aVar, @Y61.l String str, @Y61.l String str2) {
        TextView textView = this.f237341r;
        if (str != null && str2 != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(B80(aVar, textView.getContext().getString(R.string.video_upload_link, str, str2), str2));
            D6.H(textView);
        } else if (str != null) {
            textView.setText(str);
            D6.H(textView);
        } else {
            D6.w(textView);
        }
        D6.w(this.f237342s);
        ComponentContainer componentContainer = this.f237328e;
        this.f237343t.setColorFilter(C35835l0.d(R.attr.gray36, componentContainer.getContext()));
        this.f237344u.setTextColor(C35835l0.d(R.attr.gray36, componentContainer.getContext()));
        this.f237345v.setColorFilter(C35835l0.d(R.attr.gray36, componentContainer.getContext()));
        this.f237346w.setTextColor(C35835l0.d(R.attr.gray36, componentContainer.getContext()));
        this.f237348y.setColorFilter(C35835l0.d(R.attr.gray36, componentContainer.getContext()));
        this.f237349z.setTextColor(C35835l0.d(R.attr.gray36, componentContainer.getContext()));
        if (D6.y(this.f237335l)) {
            D6.H(this.f237347x);
        }
    }

    @Override // com.avito.android.publish.items.video_upload.o
    public final void Y3() {
        Lg(VideoUploadItemView.State.f237254b, null);
    }

    @Override // com.avito.android.publish.items.video_upload.VideoUploadItemView
    public final void af() {
        NC(this.f237328e.getContext().getString(R.string.upload_video_in_progress_alert));
    }

    @Override // com.avito.android.publish.items.video_upload.VideoUploadItemView
    public final void gi(@Y61.l com.avito.android.job.cv_info_actualization.ui.items.radio.g gVar) {
        this.f237337n.setOnClickListener(new com.avito.android.profile.pro.impl.screen.item.recommendations.h(22, gVar, this));
    }

    @Override // com.avito.android.publish.items.video_upload.VideoUploadItemView
    public final void h(@Y61.l String str) {
        this.f237328e.setSubtitle(str);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        com.avito.android.player_holder.a aVar = this.f237326c;
        aVar.b("onboarding_player");
        aVar.u(this.f237319H);
    }

    @Override // com.avito.android.publish.items.video_upload.VideoUploadItemView
    public final void l40(@Y61.k Y41.a<G0> aVar) {
        this.f237325b.addOnAttachStateChangeListener(new e(aVar));
    }

    @Override // com.avito.android.publish.items.video_upload.VideoUploadItemView
    public final void oG(boolean z12) {
        ConstraintLayout constraintLayout = this.f237313B;
        if (z12) {
            D6.H(constraintLayout);
        } else {
            D6.w(constraintLayout);
        }
    }

    @Override // com.avito.android.publish.items.video_upload.VideoUploadItemView
    public final void setTitle(@Y61.l CharSequence charSequence) {
        this.f237328e.setTitle(charSequence);
    }

    @Override // com.avito.android.publish.items.video_upload.VideoUploadItemView
    public final void tY(@Y61.k OnboardingV2 onboardingV2, @Y61.l ClickStreamLink clickStreamLink) {
        String valueDark;
        String value;
        this.f237315D.setText(onboardingV2.getContent().getTitle());
        this.f237316E.setText(onboardingV2.getContent().getSubtitle());
        StyledPlayerView styledPlayerView = this.f237319H;
        View childAt = styledPlayerView.getChildAt(0);
        AspectRatioFrameLayout aspectRatioFrameLayout = childAt instanceof AspectRatioFrameLayout ? (AspectRatioFrameLayout) childAt : null;
        if (aspectRatioFrameLayout != null) {
            ViewGroup.LayoutParams layoutParams = aspectRatioFrameLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 48;
            aspectRatioFrameLayout.setLayoutParams(layoutParams2);
        }
        OnboardingV2.Action action = onboardingV2.getAction();
        Button button = this.f237317F;
        if (action != null) {
            D6.H(button);
            button.setOnClickListener(new com.avito.android.profile.pro.impl.screen.item.recommendations.h(23, clickStreamLink, this));
            button.setText(action.getTitle());
        } else {
            D6.w(button);
            G0 g02 = G0.f406611a;
        }
        OnboardingV2.Content.Video video = onboardingV2.getContent().getVideo();
        View view = this.f237325b;
        if (video != null) {
            O.c cVar = new O.c();
            if (com.avito.android.lib.util.darkTheme.c.b(view.getContext())) {
                OnboardingV2.Content.Video.Thumbnail thumbnail = video.getThumbnail();
                if (thumbnail != null && (value = thumbnail.getValue()) != null) {
                    C80(Uri.parse(value));
                }
                String videoUrl = video.getVideoUrl();
                if (videoUrl != null) {
                    cVar.f343535b = Uri.parse(videoUrl);
                }
            } else {
                OnboardingV2.Content.Video.Thumbnail thumbnail2 = video.getThumbnail();
                if (thumbnail2 != null && (valueDark = thumbnail2.getValueDark()) != null) {
                    C80(Uri.parse(valueDark));
                }
                String videoUrlDark = video.getVideoUrlDark();
                if (videoUrlDark != null) {
                    cVar.f343535b = Uri.parse(videoUrlDark);
                }
            }
            O oA2 = cVar.a();
            com.avito.android.player_holder.a aVar = this.f237326c;
            aVar.r(oA2);
            aVar.e(n.f237363l);
            aVar.H("onboarding_player", this.f237324M);
            aVar.E(styledPlayerView);
            aVar.play();
        }
        OnboardingV2.Content.Image image = onboardingV2.getContent().getImage();
        if (image != null) {
            styledPlayerView.setAlpha(0.0f);
            Uri uri = (com.avito.android.lib.util.darkTheme.c.b(view.getContext()) || image.getValueDark() == null) ? Uri.parse(image.getValue()) : Uri.parse(image.getValueDark());
            C80(uri);
        }
    }

    @Override // com.avito.android.publish.items.video_upload.VideoUploadItemView
    public final void vh(@Y61.l com.avito.android.publish.items.video_upload.e eVar) {
        ViewGroup viewGroup = this.f237329f;
        viewGroup.setOnClickListener(eVar);
        viewGroup.post(new j(viewGroup, 0));
        this.f237331h.setOnClickListener(eVar);
        this.f237332i.setOnClickListener(eVar);
    }

    @Override // com.avito.android.publish.items.video_upload.VideoUploadItemView
    public final void w70(@Y61.l String str, boolean z12) {
        if (D6.y(this.f237331h) || D6.y(this.f237332i)) {
            D6.H(this.f237312A);
        } else {
            D6.H(this.f237340q);
        }
        TextView textView = this.f237339p;
        D6.H(textView);
        if (z12) {
            textView.setText(R.string.upload_video_disabled_short_text);
        }
        if (str != null) {
            textView.setText(str);
        }
    }

    @Override // com.avito.android.publish.items.video_upload.VideoUploadItemView
    public final void x(@Y61.k com.avito.android.image_loader.k kVar) {
        Drawable drawableA = d.a.a(this.f237336m, this.f237328e.getContext(), kVar, null, null, 28);
        ImageRequest.a aVarA = C35949t5.a(this.f237335l);
        aVarA.d(kVar);
        aVarA.f169501s = drawableA;
        aVarA.c();
    }

    /* compiled from: VideoUploadItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/publish/items/video_upload/k$e", "Landroid/view/View$OnAttachStateChangeListener;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f237352b;

        public e(Y41.a<G0> aVar) {
            this.f237352b = aVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@Y61.k View view) {
            this.f237352b.invoke();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@Y61.k View view) {
        }
    }
}
