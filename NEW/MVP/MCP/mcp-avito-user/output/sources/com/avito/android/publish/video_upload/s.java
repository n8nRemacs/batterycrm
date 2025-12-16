package com.avito.android.publish.video_upload;

import android.annotation.SuppressLint;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.C33771m1;
import com.avito.android.publish.details.InterfaceC33678b;
import com.avito.android.publish.details.ItemDetailsView;
import com.avito.android.publish.details.S0;
import com.avito.android.publish.details.w2;
import com.avito.android.publish.items.video_upload.VideoUploadItemView;
import com.avito.android.publish.video_upload.models.FileMaxSizeException;
import com.avito.android.publish.video_upload.s;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.VideoUploadParameter;
import com.avito.android.remote.model.category_parameters.VideoUploadParameterValue;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.E;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;

/* compiled from: VideoUploadViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/publish/video_upload/s;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/publish/details/w2;", "Lcom/avito/android/publish/video_upload/a;", "Lcom/avito/android/publish/video_upload/b;", "Lcom/avito/android/publish/video_upload/C;", "a", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class s extends M0 implements w2, InterfaceC34146a, InterfaceC34147b, C {

    /* renamed from: V, reason: collision with root package name */
    public static final /* synthetic */ int f245574V = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final S0 f245575E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34148c f245576J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final C33771m1 f245577K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f245578L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33678b f245579M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f245580N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final Ff0.b f245581O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.l
    public VideoUploadItemView f245582P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f245583Q = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public String f245584R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.l
    public Uri f245585S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.l
    public VideoUploadItemView.State f245586T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f245587U;

    /* compiled from: VideoUploadViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/video_upload/s$a;", "", "<init>", "()V", "", "MEGABYTES_TO_BYTES_MULTIPLIER", "I", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VideoUploadViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/video_upload/s$b;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f245588a = System.currentTimeMillis();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public volatile Integer f245589b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public volatile String f245590c;

        @Y61.l
        public final Float a() {
            if (this.f245589b != null) {
                return Float.valueOf(r0.intValue() / 1048576);
            }
            return null;
        }
    }

    /* compiled from: VideoUploadViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LEf0/b;", "it", "Lkotlin/G0;", "accept", "(LEf0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Uri f245592c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l0.h<io.reactivex.rxjava3.disposables.d> f245593d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b f245594e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f245595f;

        public c(Uri uri, l0.h<io.reactivex.rxjava3.disposables.d> hVar, b bVar, boolean z12) {
            this.f245592c = uri;
            this.f245593d = hVar;
            this.f245594e = bVar;
            this.f245595f = z12;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Ef0.b bVar = (Ef0.b) obj;
            VideoUploadItemView.State state = VideoUploadItemView.State.f237257e;
            s sVar = s.this;
            sVar.f245586T = state;
            VideoUploadItemView videoUploadItemView = sVar.f245582P;
            if (videoUploadItemView != null) {
                t tVar = new t(this.f245593d, sVar, this.f245594e);
                Uri uri = this.f245592c;
                videoUploadItemView.Je(bVar, tVar, new u(sVar, uri, this.f245595f), uri);
            }
        }
    }

    /* compiled from: VideoUploadViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Long f245597c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b f245598d;

        public d(Long l12, b bVar) {
            this.f245597c = l12;
            this.f245598d = bVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Long l12;
            Throwable th2 = (Throwable) obj;
            s sVar = s.this;
            sVar.f245586T = VideoUploadItemView.State.f237259g;
            if (!(th2 instanceof FileMaxSizeException) || (l12 = this.f245597c) == null) {
                s.ke(sVar, sVar.f245577K.f234843j);
            } else {
                s.ke(sVar, sVar.f245577K.f234834a.getString(R.string.upload_video_file_size_upload_error, Integer.valueOf((int) l12.longValue())));
            }
            InterfaceC33535v.a.b(s.this.f245578L, "Failed to upload video to file storage", th2, 4);
            s.this.f245578L.v(this.f245598d.a(), this.f245598d.f245590c, Long.valueOf(System.currentTimeMillis() - this.f245598d.f245588a), th2);
        }
    }

    static {
        new a(null);
    }

    @Inject
    public s(@Y61.k S0 s02, @Y61.k InterfaceC34148c interfaceC34148c, @Y61.k C33771m1 c33771m1, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k InterfaceC33678b interfaceC33678b, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k Ff0.b bVar) {
        this.f245575E = s02;
        this.f245576J = interfaceC34148c;
        this.f245577K = c33771m1;
        this.f245578L = interfaceC33535v;
        this.f245579M = interfaceC33678b;
        this.f245580N = interfaceC35745a5;
        this.f245581O = bVar;
    }

    public static final void ke(s sVar, String str) {
        VideoUploadParameter videoUploadParameter = (VideoUploadParameter) sVar.le().getFirstParameterOfType(VideoUploadParameter.class);
        if (videoUploadParameter != null) {
            videoUploadParameter.setErrorMessage(str);
        }
        sVar.f245579M.e7();
    }

    @Override // com.avito.android.publish.video_upload.C
    public final void Ba(@Y61.k VideoUploadItemView videoUploadItemView) {
        this.f245582P = videoUploadItemView;
    }

    @Override // com.avito.android.publish.video_upload.InterfaceC34146a
    public final void Ka(@Y61.k ParameterElement.J j12) {
        VideoUploadItemView videoUploadItemView;
        VideoUploadParameter videoUploadParameter = (VideoUploadParameter) le().getFirstParameterOfType(VideoUploadParameter.class);
        if (videoUploadParameter != null) {
            videoUploadParameter.setValue(null);
            this.f245579M.V8(j12.f117337d);
        }
        this.f245583Q.e();
        this.f245584R = null;
        this.f245585S = null;
        if (this.f245587U && (videoUploadItemView = this.f245582P) != null) {
            videoUploadItemView.Y3();
        }
        this.f245586T = VideoUploadItemView.State.f237254b;
    }

    @Override // com.avito.android.publish.video_upload.InterfaceC34147b
    @Y61.l
    /* renamed from: W, reason: from getter */
    public final VideoUploadItemView.State getF245586T() {
        return this.f245586T;
    }

    @Override // com.avito.android.publish.details.w2
    public final void e0() {
        io.reactivex.rxjava3.disposables.c cVar = this.f245583Q;
        cVar.e();
        this.f245582P = null;
        VideoUploadItemView.State state = this.f245586T;
        if (state == VideoUploadItemView.State.f237257e || state == VideoUploadItemView.State.f237258f) {
            this.f245586T = VideoUploadItemView.State.f237254b;
            cVar.e();
            this.f245584R = null;
            this.f245585S = null;
        }
    }

    public final ParametersTree le() {
        ParametersTree parametersTreeWa = this.f245575E.wa();
        if (parametersTreeWa != null) {
            return parametersTreeWa;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, io.reactivex.rxjava3.disposables.d] */
    @SuppressLint({"HardcodeStringDetector"})
    public final void me(boolean z12, @Y61.k final Uri uri) {
        VideoUploadParameter.Widget widget;
        VideoUploadParameter.Widget.Config config;
        final int i12 = 1;
        final int i13 = 0;
        io.reactivex.rxjava3.disposables.c cVar = this.f245583Q;
        cVar.e();
        Long maxFileSize = null;
        this.f245584R = null;
        this.f245587U = z12;
        this.f245585S = uri;
        this.f245586T = VideoUploadItemView.State.f237257e;
        VideoUploadParameter videoUploadParameter = (VideoUploadParameter) le().getFirstParameterOfType(VideoUploadParameter.class);
        if (videoUploadParameter != null && (widget = videoUploadParameter.getWidget()) != null && (config = widget.getConfig()) != null) {
            maxFileSize = config.getMaxFileSize();
        }
        Long l12 = maxFileSize;
        l0.h hVar = new l0.h();
        final b bVar = new b();
        E eP2 = this.f245576J.f(uri).o(new w(bVar, l12)).B(G0.f406611a).n(new v(this)).n(new x(this, bVar)).p(new y(this, uri));
        Float fA2 = bVar.a();
        io.reactivex.rxjava3.core.z zVarQ = io.reactivex.rxjava3.core.z.q(io.reactivex.rxjava3.core.z.c0(new Ef0.b(0L, fA2 != null ? (long) fA2.floatValue() : 0L)), eP2);
        InterfaceC35745a5 interfaceC35745a5 = this.f245580N;
        ?? V02 = zVarQ.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).F(new InterfaceC43543a(this) { // from class: com.avito.android.publish.video_upload.r

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ s f245572c;

            {
                this.f245572c = this;
            }

            @Override // l41.InterfaceC43543a
            public final void run() {
                List<? extends VideoUploadParameterValue> value;
                switch (i12) {
                    case 0:
                        s sVar = this.f245572c;
                        s.b bVar2 = (s.b) uri;
                        int i14 = s.f245574V;
                        sVar.f245586T = VideoUploadItemView.State.f237260h;
                        VideoUploadParameter videoUploadParameter2 = (VideoUploadParameter) sVar.le().getFirstParameterOfType(VideoUploadParameter.class);
                        VideoUploadParameterValue videoUploadParameterValue = (videoUploadParameter2 == null || (value = videoUploadParameter2.getValue()) == null) ? null : (VideoUploadParameterValue) C42745f0.G(value);
                        String str = sVar.f245584R;
                        if (str != null) {
                            if (videoUploadParameterValue != null) {
                                videoUploadParameter2.setValue(Collections.singletonList(VideoUploadParameterValue.copy$default(videoUploadParameterValue, str, null, null, 6, null)));
                            } else if (videoUploadParameter2 != null) {
                                videoUploadParameter2.setValue(Collections.singletonList(new VideoUploadParameterValue(str, null, null, 6, null)));
                            }
                        }
                        sVar.f245579M.l(videoUploadParameter2 != null ? videoUploadParameter2.getId() : null);
                        sVar.f245578L.t0(bVar2.a(), bVar2.f245590c, Long.valueOf(System.currentTimeMillis() - bVar2.f245588a));
                        break;
                    default:
                        this.f245572c.f245585S = (Uri) uri;
                        break;
                }
            }
        }).v0(new c(uri, hVar, bVar, z12), new d(l12, bVar), new InterfaceC43543a(this) { // from class: com.avito.android.publish.video_upload.r

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ s f245572c;

            {
                this.f245572c = this;
            }

            @Override // l41.InterfaceC43543a
            public final void run() {
                List<? extends VideoUploadParameterValue> value;
                switch (i13) {
                    case 0:
                        s sVar = this.f245572c;
                        s.b bVar2 = (s.b) bVar;
                        int i14 = s.f245574V;
                        sVar.f245586T = VideoUploadItemView.State.f237260h;
                        VideoUploadParameter videoUploadParameter2 = (VideoUploadParameter) sVar.le().getFirstParameterOfType(VideoUploadParameter.class);
                        VideoUploadParameterValue videoUploadParameterValue = (videoUploadParameter2 == null || (value = videoUploadParameter2.getValue()) == null) ? null : (VideoUploadParameterValue) C42745f0.G(value);
                        String str = sVar.f245584R;
                        if (str != null) {
                            if (videoUploadParameterValue != null) {
                                videoUploadParameter2.setValue(Collections.singletonList(VideoUploadParameterValue.copy$default(videoUploadParameterValue, str, null, null, 6, null)));
                            } else if (videoUploadParameter2 != null) {
                                videoUploadParameter2.setValue(Collections.singletonList(new VideoUploadParameterValue(str, null, null, 6, null)));
                            }
                        }
                        sVar.f245579M.l(videoUploadParameter2 != null ? videoUploadParameter2.getId() : null);
                        sVar.f245578L.t0(bVar2.a(), bVar2.f245590c, Long.valueOf(System.currentTimeMillis() - bVar2.f245588a));
                        break;
                    default:
                        this.f245572c.f245585S = (Uri) bVar;
                        break;
                }
            }
        });
        hVar.f406842b = V02;
        cVar.b(V02);
    }

    @Override // com.avito.android.publish.video_upload.InterfaceC34147b
    @Y61.l
    /* renamed from: s6, reason: from getter */
    public final Uri getF245585S() {
        return this.f245585S;
    }

    @Override // com.avito.android.publish.details.w2
    public final void p2(@Y61.k ItemDetailsView itemDetailsView) {
    }
}
