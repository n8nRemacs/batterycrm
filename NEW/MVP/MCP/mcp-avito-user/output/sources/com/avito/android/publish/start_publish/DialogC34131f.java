package com.avito.android.publish.start_publish;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.component.user_hat.items.C29574b;
import com.avito.android.deep_linking.links.AdvertPublicationLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.fresco.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishProfileSheetLegacy.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/start_publish/f;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.start_publish.f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class DialogC34131f extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ int f245403N = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f245404E;

    /* renamed from: F, reason: collision with root package name */
    public TextView f245405F;

    /* renamed from: G, reason: collision with root package name */
    public ViewGroup f245406G;

    /* renamed from: H, reason: collision with root package name */
    public SimpleDraweeView f245407H;

    /* renamed from: I, reason: collision with root package name */
    public TextView f245408I;

    /* renamed from: J, reason: collision with root package name */
    public TextView f245409J;

    /* renamed from: K, reason: collision with root package name */
    public LinearLayout f245410K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f245411L;

    /* renamed from: M, reason: collision with root package name */
    public InterfaceC34135j f245412M;

    /* compiled from: PublishProfileSheetLegacy.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.start_publish.f$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            DialogC34131f dialogC34131f = (DialogC34131f) this.receiver;
            int i12 = DialogC34131f.f245403N;
            dialogC34131f.getClass();
            dialogC34131f.f245405F = (TextView) view2.findViewById(R.id.title);
            dialogC34131f.f245406G = (ViewGroup) view2.findViewById(R.id.avatar_group);
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view2.findViewById(R.id.avatar);
            dialogC34131f.f245407H = simpleDraweeView;
            C29574b.a(simpleDraweeView);
            dialogC34131f.f245408I = (TextView) view2.findViewById(R.id.name);
            TextView textView = (TextView) view2.findViewById(R.id.description);
            dialogC34131f.f245409J = textView;
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            dialogC34131f.f245410K = (LinearLayout) view2.findViewById(R.id.buttons_container);
            return G0.f406611a;
        }
    }

    public DialogC34131f(@Y61.k Context context, @Y61.l Y41.a<G0> aVar) {
        super(context, 0, 2, null);
        this.f245404E = aVar;
        this.f245411L = new io.reactivex.rxjava3.disposables.c();
        C(R.layout.publish_profile_sheet_legacy, new a(1, this, DialogC34131f.class, "setupContentView", "setupContentView(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 7);
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        setCancelable(true);
        T();
        setCanceledOnTouchOutside(true);
        setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(this, 28));
        this.f178532z = false;
    }

    public final void V(DeepLink deepLink) {
        if (deepLink instanceof AdvertPublicationLink.Public) {
            InterfaceC34135j interfaceC34135j = this.f245412M;
            (interfaceC34135j != null ? interfaceC34135j : null).H3((AdvertPublicationLink.Public) deepLink);
        } else {
            InterfaceC34135j interfaceC34135j2 = this.f245412M;
            (interfaceC34135j2 != null ? interfaceC34135j2 : null).a(deepLink);
        }
    }
}
