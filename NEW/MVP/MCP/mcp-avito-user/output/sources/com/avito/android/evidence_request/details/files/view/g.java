package com.avito.android.evidence_request.details.files.view;

import Rz.InterfaceC15097a;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.net.Uri;
import android.text.Html;
import android.text.format.Formatter;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.photo_list_view.C33210d;
import com.avito.android.photo_list_view.G;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.photo_list_view.Q;
import com.avito.android.photo_list_view.s;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FilesViewHolderProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/evidence_request/details/files/view/g;", "Lcom/avito/android/photo_list_view/d$a;", "a", "b", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements C33210d.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15097a f148476a;

    /* compiled from: FilesViewHolderProvider.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/details/files/view/g$a;", "Lcom/avito/android/photo_list_view/Q;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends Q {

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int f148477d = 0;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Button f148478c;

        public a(@Y61.k View view, @Y61.k s sVar) {
            super(view, sVar);
            this.f148478c = (Button) view.findViewById(R.id.file_append_button);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // com.avito.android.photo_list_view.Q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void B80(@Y61.k com.avito.android.photo_list_view.InterfaceC33208b r7) {
            /*
                r6 = this;
                com.avito.android.crm_candidates.view.dialogs.f r0 = new com.avito.android.crm_candidates.view.dialogs.f
                r1 = 20
                r0.<init>(r1, r6, r7)
                com.avito.android.lib.design.button.Button r1 = r6.f148478c
                r1.setOnClickListener(r0)
                boolean r0 = r7 instanceof com.avito.android.photo_list_view.L
                if (r0 == 0) goto L47
                com.avito.android.photo_list_view.L r7 = (com.avito.android.photo_list_view.L) r7
                java.lang.Integer r0 = r7.f218096e
                if (r0 == 0) goto L24
                int r0 = r0.intValue()
                android.content.Context r2 = r1.getContext()
                java.lang.String r0 = r2.getString(r0)
                if (r0 != 0) goto L26
            L24:
                java.lang.String r0 = ""
            L26:
                r1.setText(r0)
                java.lang.Integer r7 = r7.f218097f
                if (r7 == 0) goto L3b
                int r7 = r7.intValue()
                android.content.Context r0 = r1.getContext()
                android.graphics.drawable.Drawable r7 = androidx.core.content.d.getDrawable(r0, r7)
            L39:
                r1 = r7
                goto L3d
            L3b:
                r7 = 0
                goto L39
            L3d:
                r3 = 0
                r4 = 0
                com.avito.android.lib.design.button.Button r0 = r6.f148478c
                r2 = 0
                r5 = 14
                com.avito.android.lib.design.button.Button.g(r0, r1, r2, r3, r4, r5)
            L47:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.evidence_request.details.files.view.g.a.B80(com.avito.android.photo_list_view.b):void");
        }

        @Override // com.avito.android.photo_list_view.InterfaceC33207a
        public final boolean isDraggable() {
            return false;
        }
    }

    /* compiled from: FilesViewHolderProvider.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/details/files/view/g$b;", "Lcom/avito/android/photo_list_view/Q;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends Q {

        /* renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ int f148479k = 0;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final InterfaceC15097a f148480c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.evidence_request.details.files.f f148481d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final TextView f148482e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final TextView f148483f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final TextView f148484g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final View f148485h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final ProgressBar f148486i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public AnimatorSet f148487j;

        public b(@Y61.k View view, @Y61.k s sVar, @Y61.k InterfaceC15097a interfaceC15097a) {
            super(view, sVar);
            this.f148480c = interfaceC15097a;
            this.f148481d = new com.avito.android.evidence_request.details.files.f(view.getContext(), interfaceC15097a);
            this.f148482e = (TextView) view.findViewById(R.id.file_name);
            this.f148483f = (TextView) view.findViewById(R.id.file_size);
            this.f148484g = (TextView) view.findViewById(R.id.file_error);
            this.f148485h = view.findViewById(R.id.file_remove_btn);
            this.f148486i = (ProgressBar) view.findViewById(R.id.file_loading_progress);
        }

        @Override // com.avito.android.photo_list_view.Q
        public final void B80(@Y61.k InterfaceC33208b interfaceC33208b) {
            String lastPathSegment;
            String shortFileSize;
            this.f148485h.setOnClickListener(new com.avito.android.crm_candidates.view.dialogs.f(21, this, interfaceC33208b));
            boolean z12 = interfaceC33208b instanceof G;
            TextView textView = this.f148484g;
            TextView textView2 = this.f148483f;
            TextView textView3 = this.f148482e;
            if (!z12) {
                I5.a(textView3, null, false);
                I5.a(textView2, null, false);
                I5.a(textView, null, false);
                return;
            }
            G g12 = (G) interfaceC33208b;
            G.a aVar = g12.f218074g;
            String str = "";
            if (aVar == null || (lastPathSegment = aVar.f218077a) == null) {
                Uri uri = g12.f218069b;
                lastPathSegment = uri != null ? uri.getLastPathSegment() : null;
                if (lastPathSegment == null) {
                    lastPathSegment = "";
                }
            }
            textView3.setText(lastPathSegment);
            if (aVar != null && (shortFileSize = Formatter.formatShortFileSize(textView2.getContext(), aVar.f218078b)) != null) {
                str = shortFileSize;
            }
            textView2.setText(str);
            InterfaceC33208b.InterfaceC6540b interfaceC6540b = ((G) interfaceC33208b).f218070c;
            boolean z13 = interfaceC6540b instanceof InterfaceC33208b.InterfaceC6540b.a;
            ProgressBar progressBar = this.f148486i;
            if (z13) {
                AnimatorSet animatorSet = this.f148487j;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                progressBar.setProgress(0.0f);
                progressBar.setEmptyColor(C35835l0.d(R.attr.green50, progressBar.getContext()));
            } else if (interfaceC6540b instanceof InterfaceC33208b.InterfaceC6540b.c) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(700L);
                valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                valueAnimatorOfFloat.addListener(new k(progressBar));
                valueAnimatorOfFloat.addUpdateListener(new h(progressBar, 0));
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat2.setDuration(700L);
                valueAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
                valueAnimatorOfFloat2.addListener(new j(progressBar));
                valueAnimatorOfFloat2.addUpdateListener(new h(progressBar, 1));
                animatorSet2.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                animatorSet2.addListener(new i(this));
                this.f148487j = animatorSet2;
                animatorSet2.start();
            } else {
                AnimatorSet animatorSet3 = this.f148487j;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                }
                progressBar.setProgress(0.0f);
                progressBar.setEmptyColor(C35835l0.d(R.attr.red50, progressBar.getContext()));
            }
            if (!(g12.f218070c instanceof InterfaceC33208b.InterfaceC6540b.C6541b)) {
                textView.setOnClickListener(null);
                I5.a(textView, null, false);
                return;
            }
            boolean zL1 = aVar != null ? this.f148480c.l1(aVar.f218078b) : true;
            com.avito.android.evidence_request.details.files.f fVar = this.f148481d;
            if (zL1) {
                textView.setOnClickListener(new com.avito.android.crm_candidates.view.dialogs.f(22, this, g12));
                I5.a(textView, Html.fromHtml(fVar.f148442a, 0), false);
            } else {
                textView.setOnClickListener(null);
                I5.a(textView, fVar.f148443b, false);
            }
        }

        @Override // com.avito.android.photo_list_view.InterfaceC33207a
        public final boolean isDraggable() {
            return false;
        }
    }

    public g(@Y61.k InterfaceC15097a interfaceC15097a) {
        this.f148476a = interfaceC15097a;
    }

    @Override // com.avito.android.photo_list_view.C33210d.a
    @Y61.k
    public final Q a(@Y61.k Y41.l lVar, @Y61.k s sVar) {
        return new a((View) lVar.invoke(Integer.valueOf(R.layout.evidence_file_appending_view)), sVar);
    }

    @Override // com.avito.android.photo_list_view.C33210d.a
    @Y61.k
    public final Q b(@Y61.k Y41.l lVar, @Y61.k s sVar) {
        return new b((View) lVar.invoke(Integer.valueOf(R.layout.evidence_file_view)), sVar, this.f148476a);
    }
}
