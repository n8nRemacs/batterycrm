package com.avito.android.sx_address.address_video_verification.view;

import BA0.a;
import LV.c;
import VU.a;
import VU.b;
import android.content.Context;
import android.text.format.Formatter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.remote.error.ApiError;
import com.avito.android.sx_address.address_video_verification.domain.File;
import com.avito.android.sx_address.address_video_verification.domain.FileUploadState;
import com.avito.android.sx_address.address_video_verification.mvi.entity.SxAddressVideoVerificationState;
import com.avito.android.sx_address.address_video_verification.mvi.entity.SxAddressVideoVerificationViewState;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.Arrays;
import java.util.Locale;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.u0;

/* compiled from: SxAddressVideoVerificationView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/view/i;", "Lcom/avito/android/sx_address/address_video_verification/view/g;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f292747a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d f292748b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Toolbar f292749c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final NestedScrollView f292750d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f292751e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.address_video_verification.view.c f292752f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f292753g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C42670a f292754h;

    /* compiled from: SxAddressVideoVerificationView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.sx_address.address_video_verification.b f292755l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.sx_address.address_video_verification.b bVar) {
            super(0);
            this.f292755l = bVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f292755l.accept(a.f.f1212a);
            return G0.f406611a;
        }
    }

    /* compiled from: SxAddressVideoVerificationView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.sx_address.address_video_verification.b f292756l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.sx_address.address_video_verification.b bVar) {
            super(0);
            this.f292756l = bVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f292756l.accept(a.b.f1208a);
            return G0.f406611a;
        }
    }

    /* compiled from: SxAddressVideoVerificationView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<View> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            return i.this.f292747a.findViewById(R.id.sx_address_video_verification_content_container);
        }
    }

    public i(@Y61.k View view, @Y61.k d dVar) {
        this.f292747a = view;
        this.f292748b = dVar;
        View viewFindViewById = view.findViewById(R.id.sx_address_video_verification_toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        this.f292749c = (Toolbar) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.sx_address_video_verification_scroll);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.core.widget.NestedScrollView");
        }
        this.f292750d = (NestedScrollView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.sx_address_video_verification_content);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f292751e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.sx_address_video_verification_file_block);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f292752f = new com.avito.android.sx_address.address_video_verification.view.c(viewFindViewById4);
        View viewFindViewById5 = view.findViewById(R.id.sx_address_video_verification_send_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f292753g = (Button) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.sx_address_video_verification_progress_overlay);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f292754h = new C42670a((ViewGroup) viewFindViewById6, new c(), 0, 4, null);
    }

    public final void a(@Y61.k final com.avito.android.sx_address.address_video_verification.b bVar) {
        final int i12 = 0;
        this.f292749c.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.avito.android.sx_address.address_video_verification.view.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        bVar.accept(a.C0042a.f1207a);
                        break;
                    case 1:
                        bVar.accept(a.d.f1210a);
                        break;
                    default:
                        bVar.accept(a.c.f1209a);
                        break;
                }
            }
        });
        a aVar = new a(bVar);
        com.avito.android.sx_address.address_video_verification.view.c cVar = this.f292752f;
        cVar.getClass();
        cVar.f292724b.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(0, aVar));
        b bVar2 = new b(bVar);
        cVar.getClass();
        cVar.f292730h.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(1, bVar2));
        final int i13 = 1;
        this.f292753g.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.sx_address.address_video_verification.view.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        bVar.accept(a.C0042a.f1207a);
                        break;
                    case 1:
                        bVar.accept(a.d.f1210a);
                        break;
                    default:
                        bVar.accept(a.c.f1209a);
                        break;
                }
            }
        });
        final int i14 = 2;
        this.f292754h.a(new View.OnClickListener() { // from class: com.avito.android.sx_address.address_video_verification.view.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        bVar.accept(a.C0042a.f1207a);
                        break;
                    case 1:
                        bVar.accept(a.d.f1210a);
                        break;
                    default:
                        bVar.accept(a.c.f1209a);
                        break;
                }
            }
        });
    }

    public final void b(@Y61.k SxAddressVideoVerificationState sxAddressVideoVerificationState) {
        SxAddressVideoVerificationViewState sxAddressVideoVerificationViewState = sxAddressVideoVerificationState.f292696b;
        boolean z12 = sxAddressVideoVerificationViewState instanceof SxAddressVideoVerificationViewState.Content;
        C42670a c42670a = this.f292754h;
        String shortFileSize = null;
        if (!z12) {
            if (sxAddressVideoVerificationViewState instanceof SxAddressVideoVerificationViewState.Loading) {
                C42670a.d(c42670a);
                return;
            }
            if (sxAddressVideoVerificationViewState instanceof SxAddressVideoVerificationViewState.NetworkError) {
                Throwable th2 = ((SxAddressVideoVerificationViewState.NetworkError) sxAddressVideoVerificationViewState).f292704b;
                boolean z13 = th2 instanceof ApiException;
                d dVar = this.f292748b;
                if (z13 && (((ApiException) th2).f318522b instanceof ApiError.NetworkIOError)) {
                    c42670a.c(null, new l(dVar));
                    return;
                } else {
                    c42670a.c(null, new k(dVar));
                    return;
                }
            }
            return;
        }
        SxAddressVideoVerificationViewState.Content content = (SxAddressVideoVerificationViewState.Content) sxAddressVideoVerificationViewState;
        com.avito.android.util.text.j.a(this.f292751e, content.f292699b, null);
        this.f292753g.setText(content.f292701d.f292603b);
        com.avito.android.sx_address.address_video_verification.view.c cVar = this.f292752f;
        Button button = cVar.f292724b;
        View view = cVar.f292723a;
        String str = content.f292702e;
        TextView textView = cVar.f292731i;
        if (str != null) {
            b.a aVar = VU.b.f17147t;
            Context context = view.getContext();
            aVar.getClass();
            button.setStyle(VU.b.a((VU.b) c.a.a(aVar, context, R.attr.buttonSecondaryLarge), new a.C1180a(androidx.core.content.d.getDrawable(view.getContext(), R.drawable.bg_sx_address_video_verification_load_button_error)), null, null, null, null, 0, 0, 0, 0, null, 262142));
            textView.setText(str);
            D6.H(textView);
        } else {
            b.a aVar2 = VU.b.f17147t;
            Context context2 = view.getContext();
            aVar2.getClass();
            button.setStyle((VU.b) c.a.a(aVar2, context2, R.attr.buttonSecondaryLarge));
            D6.w(textView);
        }
        ConstraintLayout constraintLayout = cVar.f292725c;
        File file = content.f292700c;
        if (file == null) {
            D6.w(constraintLayout);
        } else {
            D6.G(constraintLayout, true);
            cVar.f292726d.setText(file.f292596c);
            Long l12 = file.f292597d;
            if (l12 != null) {
                shortFileSize = Formatter.formatShortFileSize(view.getContext(), l12.longValue());
            }
            TextView textView2 = cVar.f292727e;
            I5.a(textView2, shortFileSize, false);
            FileUploadState fileUploadState = file.f292599f;
            boolean z14 = fileUploadState instanceof FileUploadState.Uploading;
            TextView textView3 = cVar.f292728f;
            TextView textView4 = cVar.f292730h;
            ProgressBarRe23 progressBarRe23 = cVar.f292729g;
            if (z14) {
                D6.H(progressBarRe23);
                FileUploadState.Uploading uploading = (FileUploadState.Uploading) fileUploadState;
                progressBarRe23.setProgress(uploading.f292602b);
                D6.H(textView4);
                u0 u0Var = u0.f406856a;
                I5.a(textView3, String.format(Locale.getDefault(), "%.0f%%", Arrays.copyOf(new Object[]{Float.valueOf(uploading.f292602b * 100)}, 1)), false);
                textView2.setTextColor(C35835l0.d(R.attr.gray54, view.getContext()));
                D6.w(textView);
            } else if (L.f(fileUploadState, FileUploadState.Uploaded.f292601b)) {
                D6.H(textView4);
                D6.g(progressBarRe23);
                D6.w(textView3);
                textView2.setTextColor(C35835l0.d(R.attr.gray54, view.getContext()));
                D6.w(textView);
            } else if (fileUploadState instanceof FileUploadState.Error) {
                D6.H(textView4);
                D6.g(progressBarRe23);
                D6.w(textView3);
                D6.H(textView2);
                textView2.setTextColor(C35835l0.d(R.attr.red600, view.getContext()));
                textView2.setText(((FileUploadState.Error) fileUploadState).f292600b);
                D6.w(textView);
            }
        }
        c42670a.b();
    }
}
