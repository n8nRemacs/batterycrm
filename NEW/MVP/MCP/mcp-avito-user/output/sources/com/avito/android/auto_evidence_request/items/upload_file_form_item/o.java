package com.avito.android.auto_evidence_request.items.upload_file_form_item;

import Ce.InterfaceC13293a;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.auto_evidence_request.s;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.lib.util.q;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: UploadFileFormView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auto_evidence_request/items/upload_file_form_item/o;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/auto_evidence_request/items/upload_file_form_item/i;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f95237k = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Button f95238b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f95239c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f95240d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ProgressBar f95241e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ImageView f95242f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ImageView f95243g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f95244h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f95245i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public AnimatorSet f95246j;

    public o(@Y61.k View view) {
        super(view);
        this.f95238b = (Button) view.findViewById(R.id.upload_button);
        this.f95239c = (ConstraintLayout) view.findViewById(R.id.upload_file_container);
        this.f95240d = (TextView) view.findViewById(R.id.upload_error_text);
        this.f95241e = (ProgressBar) view.findViewById(R.id.file_loading_progress);
        this.f95242f = (ImageView) view.findViewById(R.id.delete_file);
        this.f95243g = (ImageView) view.findViewById(R.id.file_image_view);
        this.f95244h = (TextView) view.findViewById(R.id.file_name_text_view);
        this.f95245i = (TextView) view.findViewById(R.id.file_size_text_view);
    }

    public static final ValueAnimator C80(final ProgressBar progressBar, final List<Integer> list) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(700L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.avito.android.auto_evidence_request.items.upload_file_form_item.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i12 = o.f95237k;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ProgressBar progressBar2 = progressBar;
                progressBar2.setProgress(fFloatValue);
                float progress = progressBar2.getProgress();
                List list2 = list;
                int size = (int) (progress * (list2.size() - 1));
                progressBar2.setFillColor(((Number) list2.get(size)).intValue());
                progressBar2.setEmptyColor(((Number) list2.get(1 - size)).intValue());
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // com.avito.android.auto_evidence_request.items.upload_file_form_item.i
    public final void An(@Y61.l String str) {
        TextView textView = this.f95240d;
        D6.G(textView, true);
        textView.setText(str);
    }

    public final void B80(boolean z12) {
        ProgressBar progressBar = this.f95241e;
        if (z12) {
            D6.H(progressBar);
        } else {
            AnimatorSet animatorSet = this.f95246j;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            progressBar.setProgress(0.0f);
            D6.w(progressBar);
            this.f95243g.setImageURI(Uri.EMPTY);
        }
        D6.G(this.f95239c, z12);
    }

    @Override // com.avito.android.auto_evidence_request.items.upload_file_form_item.i
    public final void D00(@Y61.l final String str, @Y61.l final s.b bVar, @Y61.k final String str2, @Y61.l final Long l12, @Y61.k final Y41.l<? super InterfaceC13293a, G0> lVar) {
        D6.G(this.f95240d, false);
        B80(true);
        this.f95238b.setEnabled(false);
        this.f95242f.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.auto_evidence_request.items.upload_file_form_item.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = o.f95237k;
                o oVar = this.f95220b;
                oVar.B80(false);
                oVar.f95238b.setEnabled(true);
                String str3 = str;
                if (str3 != null) {
                    ((f) lVar).invoke(new InterfaceC13293a.c(bVar, str3, l12, str2));
                }
            }
        });
        AnimatorSet animatorSet = this.f95246j;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ProgressBar progressBar = this.f95241e;
        progressBar.setProgress(0.0f);
        D6.w(progressBar);
    }

    @Override // com.avito.android.auto_evidence_request.items.upload_file_form_item.i
    public final void HU(@Y61.l String str) {
        I5.a(this.f95244h, str, true);
    }

    @Override // com.avito.android.auto_evidence_request.items.upload_file_form_item.i
    public final void KI(@Y61.k Uri uri) {
        com.avito.android.image_loader.glide.utils.b.b(this.f95243g, uri, 0, 6);
    }

    @Override // com.avito.android.auto_evidence_request.items.upload_file_form_item.i
    public final void O8() {
        B80(false);
    }

    @Override // com.avito.android.auto_evidence_request.items.upload_file_form_item.i
    public final void QN(@Y61.l String str) {
        B80(false);
        TextView textView = this.f95240d;
        D6.G(textView, true);
        textView.setText(str);
        this.f95238b.setEnabled(true);
    }

    @Override // com.avito.android.auto_evidence_request.items.upload_file_form_item.i
    public final void UH(@Y61.l final Long l12, @Y61.l final s.a aVar, @Y61.k final String str, @Y61.k final Y41.l<? super InterfaceC13293a, G0> lVar) {
        D6.G(this.f95240d, false);
        B80(true);
        ProgressBar progressBar = this.f95241e;
        List listU = C42745f0.U(Integer.valueOf(C35835l0.d(R.attr.black, progressBar.getContext())), Integer.valueOf(C35835l0.d(R.attr.warmGray16, progressBar.getContext())));
        ValueAnimator valueAnimatorC80 = C80(progressBar, listU);
        ValueAnimator valueAnimatorC802 = C80(progressBar, C42745f0.q0(listU));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorC80, valueAnimatorC802);
        animatorSet.addListener(new n(animatorSet, this));
        animatorSet.start();
        this.f95246j = animatorSet;
        this.f95238b.setEnabled(false);
        this.f95242f.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.auto_evidence_request.items.upload_file_form_item.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = o.f95237k;
                ((e) lVar).invoke(new InterfaceC13293a.C0116a(aVar, l12, str));
                o oVar = this;
                oVar.B80(false);
                oVar.f95238b.setEnabled(true);
            }
        });
    }

    @Override // com.avito.android.auto_evidence_request.items.upload_file_form_item.i
    public final void XM(@Y61.l String str) {
        I5.a(this.f95245i, str, true);
    }

    @Override // com.avito.android.auto_evidence_request.items.upload_file_form_item.i
    public final void yP(@Y61.k final Y41.l lVar, @Y61.k final c cVar) {
        this.f95238b.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.auto_evidence_request.items.upload_file_form_item.l
            /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r5) {
                /*
                    r4 = this;
                    int r5 = com.avito.android.auto_evidence_request.items.upload_file_form_item.o.f95237k
                    com.avito.android.auto_evidence_request.items.upload_file_form_item.c r5 = r2
                    java.util.List<com.avito.android.remote.model.validation.Error> r0 = r5.f95204g
                    if (r0 == 0) goto L33
                    java.lang.Iterable r0 = (java.lang.Iterable) r0
                    java.util.Iterator r0 = r0.iterator()
                Le:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L28
                    java.lang.Object r1 = r0.next()
                    r2 = r1
                    com.avito.android.remote.model.validation.Error r2 = (com.avito.android.remote.model.validation.Error) r2
                    java.lang.String r2 = r2.getType()
                    java.lang.String r3 = "network"
                    boolean r2 = kotlin.jvm.internal.L.f(r2, r3)
                    if (r2 == 0) goto Le
                    goto L29
                L28:
                    r1 = 0
                L29:
                    com.avito.android.remote.model.validation.Error r1 = (com.avito.android.remote.model.validation.Error) r1
                    if (r1 == 0) goto L33
                    java.lang.String r0 = r1.getMessage()
                    if (r0 != 0) goto L35
                L33:
                    java.lang.String r0 = ""
                L35:
                    Ce.a$j r1 = new Ce.a$j
                    java.lang.String r2 = r5.f95201d
                    int r3 = r5.f95208k
                    boolean r5 = r5.f95209l
                    r1.<init>(r3, r2, r0, r5)
                    Y41.l r5 = r1
                    com.avito.android.auto_evidence_request.items.upload_file_form_item.d r5 = (com.avito.android.auto_evidence_request.items.upload_file_form_item.d) r5
                    r5.invoke(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.auto_evidence_request.items.upload_file_form_item.l.onClick(android.view.View):void");
            }
        });
    }

    @Override // com.avito.android.auto_evidence_request.items.upload_file_form_item.i
    public final void yg(@Y61.k c cVar) {
        Context context = this.itemView.getContext();
        String str = cVar.f95203f;
        if (str != null) {
            Integer numA = q.a(str);
            drawableL = C35835l0.l(numA != null ? C35835l0.h(numA.intValue(), context) : null, C35835l0.d(R.attr.black, context));
        }
        Button.g(this.f95238b, drawableL, null, false, null, 14);
        com.avito.android.lib.design.button.b.a(this.f95238b, cVar.f95200c, false);
    }
}
