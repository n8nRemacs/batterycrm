package com.avito.android.subscriptions_settings;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.c;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.publish.start_publish.C;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Action;
import com.avito.android.subscriptions_settings.SubscriptionSettingsState;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: SubscriptionSettingsView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/subscriptions_settings/d;", "Lcom/avito/android/subscriptions_settings/a;", "_avito-discouraged_avito-libs_favorite-sellers-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public class d implements com.avito.android.subscriptions_settings.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f291500b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ScreenPerformanceTracker f291501c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public View f291502d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public ImageView f291503e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public TextView f291504f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public ProgressBar f291505g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public View f291506h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public ImageView f291507i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public TextView f291508j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public ProgressBar f291509k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public View f291510l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.bottom_sheet.d f291511m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public SubscriptionSettingsState f291512n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f291513o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f291514p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.modal.a f291515q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final e2 f291516r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final e2 f291517s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final e2 f291518t;

    /* compiled from: SubscriptionSettingsView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<a.b, DialogInterface, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ApiError.ErrorDialog f291519l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f291520m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ApiError.ErrorDialog errorDialog, Y41.a<G0> aVar) {
            super(2);
            this.f291519l = errorDialog;
            this.f291520m = aVar;
        }

        @Override // Y41.p
        public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
            Action action;
            a.b bVar2 = bVar;
            DialogInterface dialogInterface2 = dialogInterface;
            ApiError.ErrorDialog errorDialog = this.f291519l;
            bVar2.setTitle(errorDialog.getUserDialog().getTitle());
            bVar2.setSubtitle(errorDialog.getUserDialog().getMessage());
            bVar2.setCloseButtonVisible(errorDialog.getUserDialog().getCancelable());
            List<Action> actions = errorDialog.getUserDialog().getActions();
            if (actions != null && (action = actions.get(0)) != null) {
                bVar2.L3(action.getTitle(), new c(this.f291520m, dialogInterface2));
            }
            return G0.f406611a;
        }
    }

    public d(Context context, ScreenPerformanceTracker screenPerformanceTracker, int i12, C42822w c42822w) {
        screenPerformanceTracker = (i12 & 2) != 0 ? null : screenPerformanceTracker;
        this.f291500b = context;
        this.f291501c = screenPerformanceTracker;
        this.f291512n = new SubscriptionSettingsState(SubscriptionSettingsState.NotificationState.f291488b, SubscriptionSettingsState.SubscriptionState.f291492b, SubscriptionSettingsState.EnabledState.f291484b);
        BufferOverflow bufferOverflow = BufferOverflow.f410778c;
        this.f291516r = f2.b(0, 1, bufferOverflow, 1);
        this.f291517s = f2.b(0, 1, bufferOverflow, 1);
        this.f291518t = f2.b(0, 1, bufferOverflow, 1);
    }

    @Override // com.avito.android.component.toast.util.g
    public final void a(@k PrintableText printableText, int i12, @l String str, @l Y41.a aVar, @k ToastBarPosition toastBarPosition, @k com.avito.android.component.toast.f fVar) {
        PrintableText printableTextC = i12 != 0 ? com.avito.android.printable_text.b.c(i12, new Serializable[0]) : printableText;
        List listSingletonList = (str == null || aVar == null) ? C42784z0.f406748b : Collections.singletonList(new c.a.C3719a(str, true, null, new e(aVar), 4, null));
        View view = this.f291502d;
        if (view != null) {
            com.avito.android.component.toast.c.e(com.avito.android.component.toast.c.f125244a, view, printableTextC, null, listSingletonList, null, fVar, 2750, toastBarPosition, false, false, null, null, this.f291501c, 3978);
        }
    }

    public final boolean b() {
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f291511m;
        if (dVar == null || !dVar.isShowing()) {
            return false;
        }
        com.avito.android.lib.design.bottom_sheet.d dVar2 = this.f291511m;
        if (dVar2 != null) {
            dVar2.dismiss();
        }
        this.f291511m = null;
        this.f291502d = null;
        this.f291503e = null;
        this.f291504f = null;
        this.f291505g = null;
        this.f291506h = null;
        this.f291507i = null;
        this.f291508j = null;
        this.f291509k = null;
        this.f291510l = null;
        return true;
    }

    public final void c() {
        if (this.f291511m == null) {
            com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(this.f291500b, 0, 2, null);
            dVar.setContentView(R.layout.subscription_menu);
            this.f291502d = dVar.findViewById(R.id.subscriptions_settings_root);
            this.f291503e = (ImageView) dVar.findViewById(R.id.notifications_icon);
            this.f291504f = (TextView) dVar.findViewById(R.id.notifications_title);
            this.f291506h = dVar.findViewById(R.id.notifications_item);
            this.f291505g = (ProgressBar) dVar.findViewById(R.id.notifications_progress);
            this.f291507i = (ImageView) dVar.findViewById(R.id.unsubscription_icon);
            this.f291508j = (TextView) dVar.findViewById(R.id.unsubscription_title);
            this.f291509k = (ProgressBar) dVar.findViewById(R.id.unsubscription_progress);
            this.f291510l = dVar.findViewById(R.id.unsubscription_item);
            View view = this.f291506h;
            if (view != null) {
                final int i12 = 0;
                view.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.subscriptions_settings.b

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ d f291497c;

                    {
                        this.f291497c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i12) {
                            case 0:
                                this.f291497c.f291516r.K5(G0.f406611a);
                                break;
                            default:
                                this.f291497c.f291517s.K5(G0.f406611a);
                                break;
                        }
                    }
                });
            }
            View view2 = this.f291510l;
            if (view2 != null) {
                final int i13 = 1;
                view2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.subscriptions_settings.b

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ d f291497c;

                    {
                        this.f291497c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        switch (i13) {
                            case 0:
                                this.f291497c.f291516r.K5(G0.f406611a);
                                break;
                            default:
                                this.f291497c.f291517s.K5(G0.f406611a);
                                break;
                        }
                    }
                });
            }
            dVar.S(C35835l0.g(dVar.getContext()).y);
            dVar.setCancelable(true);
            dVar.setCanceledOnTouchOutside(true);
            com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 2);
            dVar.setOnDismissListener(new C(this, 3));
            this.f291511m = dVar;
            i();
            j();
            com.avito.android.lib.design.bottom_sheet.d dVar2 = this.f291511m;
            if (dVar2 != null) {
                com.avito.android.lib.util.g.a(dVar2);
            }
        }
    }

    public final void d(boolean z12) {
        SubscriptionSettingsState.NotificationState notificationState = z12 ? SubscriptionSettingsState.NotificationState.f291488b : SubscriptionSettingsState.NotificationState.f291489c;
        SubscriptionSettingsState subscriptionSettingsState = this.f291512n;
        this.f291512n = new SubscriptionSettingsState(notificationState, subscriptionSettingsState.f291482b, subscriptionSettingsState.f291483c);
        i();
    }

    public final void e(boolean z12) {
        this.f291513o = z12;
        i();
    }

    public final void f(boolean z12) {
        this.f291514p = z12;
        j();
    }

    public final void g(@k ApiError.ErrorDialog errorDialog, @k Y41.a<G0> aVar) {
        com.avito.android.lib.design.modal.a aVar2 = this.f291515q;
        if (aVar2 != null) {
            aVar2.dismiss();
        }
        com.avito.android.lib.design.modal.a aVarC = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, this.f291500b, new a(errorDialog, aVar));
        this.f291515q = aVarC;
        com.avito.android.lib.util.g.a(aVarC);
    }

    @Override // com.avito.android.component.toast.util.f
    public final boolean h() {
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f291511m;
        if (dVar != null) {
            return dVar.isShowing();
        }
        return false;
    }

    public final void i() {
        if (this.f291511m == null) {
            return;
        }
        ImageView imageView = this.f291503e;
        if (imageView != null) {
            D6.G(imageView, !this.f291513o);
        }
        ProgressBar progressBar = this.f291505g;
        if (progressBar != null) {
            D6.G(progressBar, this.f291513o);
        }
        View view = this.f291506h;
        if (view != null) {
            view.setEnabled((this.f291513o || this.f291514p) ? false : true);
        }
        View view2 = this.f291510l;
        if (view2 != null) {
            view2.setEnabled((this.f291513o || this.f291514p) ? false : true);
        }
        if (this.f291512n.f291481a == SubscriptionSettingsState.NotificationState.f291488b) {
            ImageView imageView2 = this.f291503e;
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.ic_notifications_off);
            }
            TextView textView = this.f291504f;
            if (textView != null) {
                textView.setText(R.string.subscription_settings_disable_notification);
            }
        }
        if (this.f291512n.f291481a == SubscriptionSettingsState.NotificationState.f291489c) {
            ImageView imageView3 = this.f291503e;
            if (imageView3 != null) {
                imageView3.setImageResource(R.drawable.ic_notifications_on);
            }
            TextView textView2 = this.f291504f;
            if (textView2 != null) {
                textView2.setText(R.string.subscription_settings_enable_notification);
            }
        }
    }

    public final void j() {
        if (this.f291511m == null) {
            return;
        }
        D6.G(this.f291507i, !this.f291514p);
        D6.G(this.f291509k, this.f291514p);
        View view = this.f291506h;
        if (view != null) {
            view.setEnabled((this.f291513o || this.f291514p) ? false : true);
        }
        View view2 = this.f291510l;
        if (view2 != null) {
            view2.setEnabled((this.f291513o || this.f291514p) ? false : true);
        }
        SubscriptionSettingsState subscriptionSettingsState = this.f291512n;
        if (subscriptionSettingsState.f291483c == SubscriptionSettingsState.EnabledState.f291485c || subscriptionSettingsState.f291482b == SubscriptionSettingsState.SubscriptionState.f291493c) {
            View view3 = this.f291506h;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        } else {
            View view4 = this.f291506h;
            if (view4 != null) {
                view4.setVisibility(0);
            }
        }
        if (this.f291512n.f291482b == SubscriptionSettingsState.SubscriptionState.f291492b) {
            ImageView imageView = this.f291507i;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.ic_unsubscribe_24);
                imageView.setColorFilter(C35835l0.d(R.attr.red, imageView.getContext()));
            }
            TextView textView = this.f291508j;
            if (textView != null) {
                textView.setText(R.string.subscription_settings_unsubscribe);
                textView.setTextColor(C35835l0.d(R.attr.red, textView.getContext()));
            }
        }
        if (this.f291512n.f291482b == SubscriptionSettingsState.SubscriptionState.f291493c) {
            ImageView imageView2 = this.f291507i;
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.ic_subscriber_user_filled_24);
                imageView2.setColorFilter(C35835l0.d(R.attr.black, imageView2.getContext()));
            }
            TextView textView2 = this.f291508j;
            if (textView2 != null) {
                textView2.setText(R.string.subscription_settings_subscribe);
                textView2.setTextColor(C35835l0.d(R.attr.black, textView2.getContext()));
            }
        }
    }
}
