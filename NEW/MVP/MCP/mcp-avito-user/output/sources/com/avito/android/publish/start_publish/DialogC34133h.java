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
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishProfileSheetRedesigned.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/start_publish/h;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.start_publish.h, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class DialogC34133h extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ int f245414N = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f245415E;

    /* renamed from: F, reason: collision with root package name */
    public TextView f245416F;

    /* renamed from: G, reason: collision with root package name */
    public ViewGroup f245417G;

    /* renamed from: H, reason: collision with root package name */
    public SimpleDraweeView f245418H;

    /* renamed from: I, reason: collision with root package name */
    public TextView f245419I;

    /* renamed from: J, reason: collision with root package name */
    public TextView f245420J;

    /* renamed from: K, reason: collision with root package name */
    public LinearLayout f245421K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f245422L;

    /* renamed from: M, reason: collision with root package name */
    public InterfaceC34135j f245423M;

    /* compiled from: PublishProfileSheetRedesigned.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.start_publish.h$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            DialogC34133h dialogC34133h = (DialogC34133h) this.receiver;
            int i12 = DialogC34133h.f245414N;
            dialogC34133h.getClass();
            dialogC34133h.f245416F = (TextView) view2.findViewById(R.id.title);
            ViewGroup viewGroup = (ViewGroup) view2.findViewById(R.id.avatar_group);
            dialogC34133h.f245417G = viewGroup;
            com.avito.android.lib.util.v.a(viewGroup, y6.b(16));
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view2.findViewById(R.id.avatar);
            dialogC34133h.f245418H = simpleDraweeView;
            C29574b.a(simpleDraweeView);
            dialogC34133h.f245419I = (TextView) view2.findViewById(R.id.name);
            TextView textView = (TextView) view2.findViewById(R.id.description);
            dialogC34133h.f245420J = textView;
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            dialogC34133h.f245421K = (LinearLayout) view2.findViewById(R.id.buttons_container);
            return G0.f406611a;
        }
    }

    public DialogC34133h(@Y61.k Context context, @Y61.l Y41.a<G0> aVar) {
        super(context, R.style.Re23_BottomSheet_Default);
        this.f245415E = aVar;
        this.f245422L = new io.reactivex.rxjava3.disposables.c();
        C(R.layout.publish_profile_sheet_redesigned, new a(1, this, DialogC34133h.class, "setupContentView", "setupContentView(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 7);
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        setCancelable(true);
        T();
        setCanceledOnTouchOutside(true);
        setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(this, 29));
        this.f178532z = false;
    }

    public final void V(DeepLink deepLink) {
        if (deepLink instanceof AdvertPublicationLink.Public) {
            InterfaceC34135j interfaceC34135j = this.f245423M;
            (interfaceC34135j != null ? interfaceC34135j : null).H3((AdvertPublicationLink.Public) deepLink);
        } else {
            InterfaceC34135j interfaceC34135j2 = this.f245423M;
            (interfaceC34135j2 != null ? interfaceC34135j2 : null).a(deepLink);
        }
    }
}
