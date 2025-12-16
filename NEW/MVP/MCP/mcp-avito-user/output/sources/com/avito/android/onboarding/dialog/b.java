package com.avito.android.onboarding.dialog;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import com.avito.android.onboarding.dialog.analytics.OnboardingCloseType;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: OnboardingBottomSheetDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/onboarding/dialog/b;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "Lcom/avito/android/onboarding/dialog/a;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b extends com.avito.android.lib.design.bottom_sheet.d implements com.avito.android.onboarding.dialog.a {

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ int f208746K = 0;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final A40.a f208747E;

    /* renamed from: F, reason: collision with root package name */
    @k
    public final D40.e f208748F;

    /* renamed from: G, reason: collision with root package name */
    @l
    public final ViewGroup f208749G;

    /* renamed from: H, reason: collision with root package name */
    @l
    public final View f208750H;

    /* renamed from: I, reason: collision with root package name */
    @l
    public final View f208751I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f208752J;

    /* compiled from: OnboardingBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            b.this.f208747E.d(OnboardingCloseType.f208740b);
            return G0.f406611a;
        }
    }

    /* compiled from: OnboardingBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.onboarding.dialog.b$b, reason: collision with other inner class name */
    public static final class C6230b extends N implements Y41.a<G0> {
        public C6230b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            b.this.f208747E.d(OnboardingCloseType.f208742d);
            return G0.f406611a;
        }
    }

    public /* synthetic */ b(Context context, int i12, A40.a aVar, D40.e eVar, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? 0 : i12, aVar, eVar);
    }

    public final void V() {
        com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 3);
    }

    public b(@k Context context, int i12, @k A40.a aVar, @k D40.e eVar) {
        super(context, i12);
        this.f208747E = aVar;
        this.f208748F = eVar;
        this.f208752J = context.getResources().getConfiguration().orientation == 2;
        S(C35835l0.g(context).y);
        this.f178532z = true;
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        D(R.layout.onboarding, true);
        this.f208749G = (ViewGroup) findViewById(R.id.onboarding_container);
        this.f208750H = findViewById(R.id.load_progress);
        View viewFindViewById = findViewById(R.id.download_close_button);
        this.f208751I = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC31873b(this, 26));
        }
        R(new a());
        Q(new C6230b());
    }
}
