package com.avito.android.send_esia_data_screen.ui;

import Cd.C13243a;
import Y41.l;
import Y61.k;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.send_esia_data_screen.mvi.n;
import com.avito.android.send_esia_data_screen.mvi.o;
import dr0.AbstractC39789a;
import dr0.AbstractC39791c;
import dr0.C39792d;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: SendEsiaDataActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/send_esia_data_screen/ui/SendEsiaDataActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_gig_send-esia-data-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SendEsiaDataActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: p, reason: collision with root package name */
    @k
    public static final a f268287p = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public o f268288m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f268289n = new O0(m0.f406844a.b(n.class), new g(), new f(new i()), new h());

    /* renamed from: o, reason: collision with root package name */
    public com.avito.android.send_esia_data_screen.ui.f f268290o;

    /* compiled from: SendEsiaDataActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/send_esia_data_screen/ui/SendEsiaDataActivity$a;", "", "<init>", "()V", "", "EXTRA_AUTH_CODE", "Ljava/lang/String;", "EXTRA_AUTH_STATE", "EXTRA_RETRY_ESIA_LINK", "_avito_gig_send-esia-data-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SendEsiaDataActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = SendEsiaDataActivity.f268287p;
            ((n) SendEsiaDataActivity.this.f268289n.getValue()).accept(AbstractC39789a.C11041a.f394149a);
            return G0.f406611a;
        }
    }

    /* compiled from: SendEsiaDataActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = SendEsiaDataActivity.f268287p;
            SendEsiaDataActivity sendEsiaDataActivity = SendEsiaDataActivity.this;
            n nVar = (n) sendEsiaDataActivity.f268289n.getValue();
            String stringExtra = sendEsiaDataActivity.getIntent().getStringExtra("EXTRA_RETRY_ESIA_LINK");
            if (stringExtra == null) {
                stringExtra = "";
            }
            nVar.accept(new AbstractC39789a.b(stringExtra));
            return G0.f406611a;
        }
    }

    /* compiled from: SendEsiaDataActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements l<AbstractC39791c, G0> {
        @Override // Y41.l
        public final G0 invoke(AbstractC39791c abstractC39791c) {
            AbstractC39791c abstractC39791c2 = abstractC39791c;
            SendEsiaDataActivity sendEsiaDataActivity = (SendEsiaDataActivity) this.receiver;
            a aVar = SendEsiaDataActivity.f268287p;
            sendEsiaDataActivity.getClass();
            if (abstractC39791c2 instanceof AbstractC39791c.a) {
                sendEsiaDataActivity.finish();
            } else if (abstractC39791c2 instanceof AbstractC39791c.b) {
                ((n) sendEsiaDataActivity.f268289n.getValue()).accept(new AbstractC39789a.d(((AbstractC39791c.b) abstractC39791c2).f394159a));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SendEsiaDataActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldr0/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Ldr0/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements l<C39792d, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C39792d c39792d) {
            C39792d c39792d2 = c39792d;
            com.avito.android.send_esia_data_screen.ui.f fVar = SendEsiaDataActivity.this.f268290o;
            if (fVar == null) {
                fVar = null;
            }
            Iterator<T> it = fVar.f268303d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                LinearLayout linearLayout = (LinearLayout) it.next();
                if (c39792d2.f394160a) {
                    i = 0;
                }
                linearLayout.setVisibility(i);
            }
            fVar.f268302c.setVisibility(c39792d2.f394161b ? 0 : 8);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f268294l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f268294l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f268294l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return SendEsiaDataActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return SendEsiaDataActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: SendEsiaDataActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/send_esia_data_screen/mvi/n;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/send_esia_data_screen/mvi/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<n> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final n invoke() {
            o oVar = SendEsiaDataActivity.this.f268288m;
            if (oVar == null) {
                oVar = null;
            }
            return (n) oVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.send_esia_data_activity;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.send_esia_data_screen.di.a.a().a((com.avito.android.send_esia_data_screen.di.c) C29972i.a(C29972i.b(this), Object.class), cv.c.a(this)).a(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        this.f268290o = new com.avito.android.send_esia_data_screen.ui.f(new b(), new c(), findViewById(R.id.send_esia_data_root));
        O0 o02 = this.f268289n;
        com.avito.android.arch.mvi.android.f.b(this, (n) o02.getValue(), new d(1, this, SendEsiaDataActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/send_esia_data_screen/models/SendEsiaDataOneTimeEvent;)V", 0), new e());
        n nVar = (n) o02.getValue();
        String stringExtra = getIntent().getStringExtra("EXTRA_AUTH_CODE");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String stringExtra2 = getIntent().getStringExtra("EXTRA_AUTH_STATE");
        nVar.accept(new AbstractC39789a.c(stringExtra, stringExtra2 != null ? stringExtra2 : ""));
    }
}
