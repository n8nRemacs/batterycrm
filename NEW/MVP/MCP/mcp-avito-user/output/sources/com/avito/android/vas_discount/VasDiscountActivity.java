package com.avito.android.vas_discount;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import androidx.view.P0;
import com.avito.android.K;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.favorite_sellers.C30597v;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.D6;
import com.avito.android.util.P2;
import com.avito.android.vas_discount.di.q;
import com.avito.android.vas_discount.g;
import com.avito.android.vas_discount.remote.model.DiscountResponse;
import com.avito.android.vas_discount.ui.dialog.DiscountDialogFragment;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VasDiscountActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/vas_discount/VasDiscountActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/K;", "Lcom/avito/android/vas_discount/di/q;", "Lcom/avito/android/vas_discount/e;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]", "DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes5.dex */
public final class VasDiscountActivity extends com.avito.android.ui.activity.a implements K<q>, e, InterfaceC28477j.b {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f319603q = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public b f319604m;

    /* renamed from: n, reason: collision with root package name */
    public View f319605n;

    /* renamed from: o, reason: collision with root package name */
    public com.avito.android.vas_discount.a f319606o;

    /* renamed from: p, reason: collision with root package name */
    public q f319607p;

    /* compiled from: VasDiscountActivity.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/vas_discount/remote/model/DiscountResponse;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<P2<? super DiscountResponse>, G0> {
        public a() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(P2<? super DiscountResponse> p22) {
            P2<? super DiscountResponse> p23 = p22;
            boolean z12 = p23 instanceof P2.b;
            VasDiscountActivity vasDiscountActivity = VasDiscountActivity.this;
            if (z12) {
                DiscountResponse discountResponse = (DiscountResponse) ((P2.b) p23).f318720a;
                int i12 = VasDiscountActivity.f319603q;
                View view = vasDiscountActivity.f319605n;
                D6.w(view != null ? view : null);
                if (vasDiscountActivity.getSupportFragmentManager().H("dialog") == null) {
                    DiscountDialogFragment.f319679q0.getClass();
                    DiscountDialogFragment discountDialogFragment = new DiscountDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("discount_data", discountResponse);
                    discountDialogFragment.setArguments(bundle);
                    discountDialogFragment.show(vasDiscountActivity.getSupportFragmentManager(), "dialog");
                }
            } else if (p23 instanceof P2.a) {
                VasDiscountActivity.a2(vasDiscountActivity, null, ((P2.a) p23).f318719a, 1);
            } else if (p23 instanceof P2.c) {
                View view2 = vasDiscountActivity.f319605n;
                D6.H(view2 != null ? view2 : null);
            }
            return G0.f406611a;
        }
    }

    public static void a2(VasDiscountActivity vasDiscountActivity, Throwable th2, ApiError apiError, int i12) {
        Throwable th3 = (i12 & 1) != 0 ? null : th2;
        ApiError apiError2 = (i12 & 2) != 0 ? null : apiError;
        View view = vasDiscountActivity.f319605n;
        if (view == null) {
            view = null;
        }
        D6.w(view);
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        View view2 = vasDiscountActivity.f319605n;
        View view3 = view2 == null ? null : view2;
        PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.unknown_server_error, new Serializable[0]);
        C30597v c30597v = new C30597v(vasDiscountActivity, 5);
        f.c.f125255c.getClass();
        com.avito.android.component.toast.c.b(cVar, view3, printableTextC, null, null, null, f.c.a.a(apiError2, th3), 0, null, null, false, false, c30597v, null, 3054);
    }

    @Override // com.avito.android.vas_discount.e
    public final void Y(@Y61.k Throwable th2) {
        a2(this, th2, null, 2);
        Fragment fragmentH = getSupportFragmentManager().H("dialog");
        if (fragmentH != null) {
            H hE2 = getSupportFragmentManager().e();
            hE2.m(fragmentH);
            hE2.f();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("discount_context");
        q.a aVarA = com.avito.android.vas_discount.di.b.a();
        aVarA.a(new com.avito.android.vas_discount.di.e(stringExtra));
        aVarA.b((com.avito.android.vas_discount.di.d) C29972i.a(C29972i.b(this), com.avito.android.vas_discount.di.d.class));
        q qVarBuild = aVarA.build();
        this.f319607p = qVarBuild;
        qVarBuild.Wb(this);
        super.onCreate(bundle);
        setContentView(R.layout.vas_discount_activity);
        this.f319605n = findViewById(R.id.progress_view);
        b bVar = this.f319604m;
        if (bVar == null) {
            bVar = null;
        }
        com.avito.android.vas_discount.a aVar = (com.avito.android.vas_discount.a) new P0(this, bVar).a(d.class);
        this.f319606o = aVar;
        aVar.K().observe(this, new g.a(new a()));
    }

    @Override // com.avito.android.K
    public final InterfaceC29971h r0() {
        q qVar = this.f319607p;
        if (qVar != null) {
            return qVar;
        }
        return null;
    }
}
