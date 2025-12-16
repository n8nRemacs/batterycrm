package com.avito.android.status_view;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.jakewharton.rxbinding4.view.C37722i;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: TnsErrorAndProgressView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/status_view/g;", "", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f284958a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Y41.l<DeepLink, G0> f284959b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f284960c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f284961d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f284962e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f284963f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Button f284964g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final View f284965h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final ImageView f284966i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f284967j;

    public g() {
        throw null;
    }

    public g(View view, Y41.l lVar, Y41.a aVar, int i12, C42822w c42822w) {
        lVar = (i12 & 2) != 0 ? null : lVar;
        this.f284958a = view;
        this.f284959b = lVar;
        this.f284960c = aVar;
        View viewFindViewById = view.findViewById(R.id.info_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f284961d = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.info_message);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f284962e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.info_hint);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f284963f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.info_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f284964g = (Button) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.progress_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f284965h = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.error_image);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f284966i = (ImageView) viewFindViewById6;
        this.f284967j = new io.reactivex.rxjava3.disposables.c();
    }

    public static void a(g gVar, CharSequence charSequence, String str, int i12) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        D6.w(gVar.f284965h);
        D6.H(gVar.f284961d);
        io.reactivex.rxjava3.disposables.c cVar = gVar.f284967j;
        cVar.e();
        D6.H(gVar.f284966i);
        I5.a(gVar.f284962e, charSequence, false);
        View view = gVar.f284958a;
        if (str == null) {
            str = view.getContext().getString(R.string.error_hint);
        }
        I5.a(gVar.f284963f, str, false);
        String string = view.getContext().getString(R.string.retry_button);
        Button button = gVar.f284964g;
        com.avito.android.lib.design.button.b.a(button, string, false);
        cVar.b(C37722i.a(button).v0(new a(gVar), b.f284957b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }
}
