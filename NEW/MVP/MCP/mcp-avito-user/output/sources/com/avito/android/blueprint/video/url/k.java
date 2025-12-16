package com.avito.android.blueprint.video.url;

import Y61.l;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.blueprint.suggest.A;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PublishVideoUrlView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprint/video/url/k;", "LHj/c;", "Lcom/avito/android/blueprint/video/url/j;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k extends Hj.c implements j {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f105807r = 0;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Input f105808m;

    /* renamed from: n, reason: collision with root package name */
    public final View f105809n;

    /* renamed from: o, reason: collision with root package name */
    public final SimpleDraweeView f105810o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f105811p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public a f105812q;

    public k(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view, R.layout.view_publish_video_url_content, aVar);
        this.f105808m = (Input) this.f7656e.findViewById(R.id.input);
        this.f105809n = this.f7656e.findViewById(R.id.video_preview);
        this.f105810o = (SimpleDraweeView) this.f7656e.findViewById(R.id.video_preview_image);
        this.f105811p = (TextView) this.f7656e.findViewById(R.id.video_title);
    }

    @Override // com.avito.android.blueprint.video.url.j
    public final void I0(int i12) {
        this.f105808m.setMaxLength(Integer.MAX_VALUE);
    }

    @Override // com.avito.android.blueprint.video.url.j
    public final void K(@l Y41.l<? super String, G0> lVar) {
        a aVar = this.f105812q;
        Input input = this.f105808m;
        if (aVar != null) {
            input.h(aVar);
        }
        if (lVar != null) {
            a aVar2 = new a(input, lVar);
            input.b(aVar2);
            this.f105812q = aVar2;
        }
    }

    @Override // com.avito.android.blueprint.video.url.j
    public final void T0(@Y61.k FormatterType formatterType) {
        this.f105808m.setFormatterType(formatterType);
    }

    @Override // com.avito.android.blueprint.video.url.j
    public final void c0() {
        this.f105808m.setLoading(true);
    }

    @Override // com.avito.android.blueprint.video.url.j
    public final void h0() {
        this.f105808m.r();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        K2.d(this.f7655d, true);
    }

    @Override // com.avito.android.blueprint.video.url.j
    public final void m(@l String str) {
        Input.t(this.f105808m, str, false, 6);
    }

    @Override // com.avito.android.blueprint.video.url.j
    public final void mv() {
        D6.w(this.f105809n);
    }

    @Override // com.avito.android.blueprint.video.url.j
    public final void o(@l String str) {
        this.f105808m.setHint(str);
    }

    @Override // com.avito.android.blueprint.video.url.j
    public final void q1() {
        this.f105808m.setLoading(false);
    }

    @Override // com.avito.android.blueprint.video.url.j
    public final void sJ(@l Image image, @Y61.k String str) {
        C35949t5.c(this.f105810o, image != null ? com.avito.android.image_loader.b.b(image) : null, null, null, null, 14);
        this.f105811p.setText(str);
        D6.H(this.f105809n);
    }

    @Override // com.avito.android.blueprint.video.url.j
    public final void t1(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f105808m.setOnFocusChangeListener(new A(1, lVar));
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
        public String f105813b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f105814c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ N f105815d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Input input, Y41.l lVar) {
            this.f105814c = input;
            this.f105815d = (N) lVar;
            this.f105813b = input.getDeformattedText();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // android.text.TextWatcher
        public final void afterTextChanged(@l Editable editable) {
            String deformattedText = this.f105814c.getDeformattedText();
            if (L.f(deformattedText, this.f105813b)) {
                return;
            }
            this.f105815d.invoke(deformattedText);
            this.f105813b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
