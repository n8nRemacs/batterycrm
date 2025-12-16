package com.avito.android.cv_upload.screens.cv_upload;

import Ot.InterfaceC14733a;
import Y41.l;
import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.R;
import com.avito.android.cv_upload.screens.cv_upload.CvUploadActivity;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.spinner.Spinner;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CvUploadViewRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_upload/screens/cv_upload/h;", "", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<InterfaceC14733a, G0> f131717a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y41.a<G0> f131718b;

    /* renamed from: c, reason: collision with root package name */
    public final Resources f131719c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Spinner f131720d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f131721e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f131722f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Button f131723g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.progress_overlay.l f131724h;

    /* compiled from: CvUploadViewRenderer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ CvUploadParams f131726m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CvUploadParams cvUploadParams) {
            super(0);
            this.f131726m = cvUploadParams;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ((CvUploadActivity.d) h.this.f131717a).invoke(new InterfaceC14733a.b(this.f131726m));
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@k ViewGroup viewGroup, @k CvUploadParams cvUploadParams, @k l<? super InterfaceC14733a, G0> lVar, @k Y41.a<G0> aVar) {
        this.f131717a = lVar;
        this.f131718b = aVar;
        this.f131719c = viewGroup.getResources();
        View viewFindViewById = viewGroup.findViewById(R.id.loader);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.Spinner");
        }
        this.f131720d = (Spinner) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.cv_loading_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f131721e = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.cv_loading_subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f131722f = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f131723g = (Button) viewFindViewById4;
        com.avito.android.progress_overlay.l lVar2 = new com.avito.android.progress_overlay.l((ViewGroup) viewGroup.findViewById(R.id.progress_root), 0, null, 0, 0, 30, null);
        lVar2.f231600j = new a(cvUploadParams);
        this.f131724h = lVar2;
        ((Toolbar) viewGroup.findViewById(R.id.toolbar)).setNavigationOnClickListener(new f(this, 0));
    }
}
