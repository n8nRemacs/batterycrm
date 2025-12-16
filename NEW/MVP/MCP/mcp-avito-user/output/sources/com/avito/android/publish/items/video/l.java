package com.avito.android.publish.items.video;

import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.blueprint.suggest.A;
import com.avito.android.image_loader.fresco.s;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.publish.items.video.video_preview.VideoPreview;
import com.avito.android.remote.model.Image;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VideoItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/items/video/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/items/video/k;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f237224h = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f237225b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Input f237226c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public a f237227d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final VideoPreview f237228e;

    /* renamed from: f, reason: collision with root package name */
    public final int f237229f;

    /* renamed from: g, reason: collision with root package name */
    public final int f237230g;

    public l(@Y61.k View view) {
        super(view);
        this.f237225b = (ComponentContainer) view.findViewById(R.id.container);
        this.f237226c = (Input) view.findViewById(R.id.input);
        this.f237228e = (VideoPreview) view.findViewById(R.id.video_preview);
        this.f237229f = view.getResources().getDimensionPixelSize(R.dimen.video_preview_image_height);
        this.f237230g = view.getResources().getDimensionPixelSize(R.dimen.video_preview_image_width);
    }

    @Override // com.avito.android.publish.items.video.k
    public final void H40(@Y61.l CharSequence charSequence) {
        ComponentContainer.n(this.f237225b, charSequence, 2);
    }

    @Override // com.avito.android.publish.items.video.k
    public final void I0(int i12) {
        this.f237226c.setMaxLength(Integer.MAX_VALUE);
    }

    @Override // com.avito.android.publish.items.video.k
    public final void IA() {
        this.f237225b.q("");
    }

    @Override // com.avito.android.publish.items.video.k
    public final void IW() {
        VideoPreview.PreviewState previewState = VideoPreview.PreviewState.f237248c;
        VideoPreview videoPreview = this.f237228e;
        videoPreview.setPreviewState(previewState);
        videoPreview.setVisibility(0);
    }

    @Override // com.avito.android.publish.items.video.k
    public final void K(@Y61.l Y41.l<? super String, G0> lVar) {
        a aVar = this.f237227d;
        Input input = this.f237226c;
        if (aVar != null) {
            input.h(aVar);
        }
        if (lVar != null) {
            a aVar2 = new a(input, lVar);
            input.b(aVar2);
            this.f237227d = aVar2;
        }
    }

    @Override // com.avito.android.publish.items.video.k
    public final void O8() {
        this.f237228e.setVisibility(8);
    }

    @Override // com.avito.android.publish.items.video.k
    public final void RC(@Y61.l Image image, @Y61.k String str) {
        Uri uri = Uri.parse(image != null ? image.find(this.f237230g, this.f237229f) : null);
        VideoPreview videoPreview = this.f237228e;
        s.c(videoPreview, uri, true, null, null);
        videoPreview.setTitle(str);
        videoPreview.setPreviewState(VideoPreview.PreviewState.f237249d);
        videoPreview.setVisibility(0);
    }

    @Override // com.avito.android.publish.items.video.k
    public final void S7(@Y61.l Y41.a<G0> aVar) {
        this.f237225b.setTitleTipListener(aVar);
    }

    @Override // com.avito.android.publish.items.video.k
    public final void T0(@Y61.k FormatterType formatterType) {
        this.f237226c.setFormatterType(formatterType);
    }

    @Override // com.avito.android.publish.items.video.k
    public final void h0() {
        this.f237226c.r();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        K2.d(this.f237225b, true);
    }

    @Override // com.avito.android.publish.items.video.k
    public final void m(@Y61.l String str) {
        Input.t(this.f237226c, str, false, 6);
    }

    @Override // com.avito.android.publish.items.video.k
    public final void o(@Y61.l String str) {
        this.f237226c.setHint(str);
    }

    @Override // com.avito.android.publish.items.video.k
    public final void setTitle(@Y61.k String str) {
        this.f237225b.setTitle(str);
    }

    @Override // com.avito.android.publish.items.video.k
    public final void t1(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f237226c.setOnFocusChangeListener(new A(3, lVar));
    }

    @Override // com.avito.android.publish.items.video.k
    public final void v9(@Y61.k String str) {
        VideoPreview videoPreview = this.f237228e;
        videoPreview.setError(str);
        videoPreview.setPreviewState(VideoPreview.PreviewState.f237250e);
        videoPreview.setVisibility(0);
    }

    @Override // com.avito.android.util.InterfaceC35938s1, com.avito.android.blueprints.publish.html_editor.f
    public final void m7() {
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f237231b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f237232c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ N f237233d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Input input, Y41.l lVar) {
            this.f237232c = input;
            this.f237233d = (N) lVar;
            this.f237231b = input.getDeformattedText();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f237232c.getDeformattedText();
            if (L.f(deformattedText, this.f237231b)) {
                return;
            }
            this.f237233d.invoke(deformattedText);
            this.f237231b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
