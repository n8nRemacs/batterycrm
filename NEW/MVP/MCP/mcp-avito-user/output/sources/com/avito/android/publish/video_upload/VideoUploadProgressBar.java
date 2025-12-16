package com.avito.android.publish.video_upload;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: VideoUploadProgressBar.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/avito/android/publish/video_upload/VideoUploadProgressBar;", "Landroid/widget/FrameLayout;", "", "progressPercent", "Lkotlin/G0;", "setProgressInPercentage", "(I)V", "Lkotlin/Function0;", "listener", "setOnDismissListener", "(LY41/a;)V", "setRetryClickListener", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class VideoUploadProgressBar extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CircularProgressIndicator f245532b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ImageView f245533c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageView f245534d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f245535e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public N f245536f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public N f245537g;

    /* compiled from: VideoUploadProgressBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f245539m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f245539m = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            VideoUploadProgressBar.this.a();
            this.f245539m.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: VideoUploadProgressBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f245541m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a<G0> aVar) {
            super(0);
            this.f245541m = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            VideoUploadProgressBar videoUploadProgressBar = VideoUploadProgressBar.this;
            videoUploadProgressBar.f245532b.c();
            D6.H(videoUploadProgressBar.f245533c);
            D6.w(videoUploadProgressBar.f245534d);
            videoUploadProgressBar.f245535e.setOnClickListener(new o(videoUploadProgressBar, 0));
            this.f245541m.invoke();
            return G0.f406611a;
        }
    }

    @X41.j
    public VideoUploadProgressBar(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void a() {
        setProgressInPercentage(0);
        this.f245532b.a();
        D6.w(this.f245533c);
        D6.H(this.f245534d);
        this.f245535e.setOnClickListener(new o(this, 1));
    }

    public final void setOnDismissListener(@Y61.k Y41.a<G0> listener) {
        this.f245537g = new a(listener);
    }

    public final void setProgressInPercentage(int progressPercent) {
        this.f245532b.setProgress(progressPercent, false);
    }

    public final void setRetryClickListener(@Y61.k Y41.a<G0> listener) {
        this.f245536f = new b(listener);
    }

    public VideoUploadProgressBar(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f245536f = q.f245570l;
        this.f245537g = p.f245569l;
        LayoutInflater.from(context).inflate(R.layout.video_upload_progress_bar, (ViewGroup) this, true);
        this.f245535e = (FrameLayout) findViewById(R.id.video_upload_progress_container);
        this.f245532b = (CircularProgressIndicator) findViewById(R.id.progress_bar);
        this.f245533c = (ImageView) findViewById(R.id.stop_uploading_button);
        this.f245534d = (ImageView) findViewById(R.id.retry_icon);
    }
}
