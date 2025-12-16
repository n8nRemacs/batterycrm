package com.avito.android.lib.beduin_v2.theme.all.compose;

import Y61.k;
import android.content.Context;
import android.view.ContextThemeWrapper;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.beduin_v2.theme.re23.compose.P2;
import com.avito.android.lib.beduin_v2.theme.re23.compose.Q2;
import com.avito.android.lib.beduin_v2.theme.re23.compose.R2;
import com.avito.android.lib.beduin_v2.theme.re23.compose.S2;
import com.avito.android.lib.beduin_v2.theme.re23.compose.T2;
import com.avito.android.lib.beduin_v2.theme.re23.compose.U2;
import com.squareup.anvil.annotations.ContributesBinding;
import dU.InterfaceC39624A;
import dU.y;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoThemes.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/theme/all/compose/a;", "LGQ0/a;", "_design-modules_beduin-v2_renderer-compose_theme_all"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39624A
/* loaded from: classes14.dex */
public final class a extends GQ0.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f176618a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f176619b = C42727D.c(new C5235a());

    /* compiled from: AvitoThemes.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LHQ0/e;", "invoke", "()LHQ0/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.lib.beduin_v2.theme.all.compose.a$a, reason: collision with other inner class name */
    public static final class C5235a extends N implements Y41.a<HQ0.e> {
        public C5235a() {
            super(0);
        }

        @Override // Y41.a
        public final HQ0.e invoke() {
            U2 u22 = U2.f177312a;
            Context context = a.this.f176618a;
            u22.getClass();
            S2 s22 = new S2();
            return new HQ0.e(new Q2(new ContextThemeWrapper(context, R.style.Theme_DesignSystem_Re23)), new T2(new ContextThemeWrapper(context, R.style.Theme_DesignSystem_Re23)), s22, new P2(), R2.f177174a);
        }
    }

    @Inject
    public a(@y @k Context context) {
        this.f176618a = context;
    }

    @Override // GQ0.a
    @k
    public final HQ0.e a() {
        return (HQ0.e) this.f176619b.getValue();
    }
}
