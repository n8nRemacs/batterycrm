package com.avito.android.beduin.v2.page.impl;

import Ii.InterfaceC14111a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.C29270c0;
import com.avito.android.beduin.v2.page.BeduinV2PageDeepLink;
import com.avito.android.beduin.v2.page.ForcedTheme;
import com.avito.android.di.C29972i;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinV2PageActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/BeduinV2PageActivity;", "Lcom/avito/android/beduin/v2/page/e;", "<init>", "()V", "a", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinV2PageActivity extends com.avito.android.beduin.v2.page.e {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final a f104854p = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public C29270c0 f104855m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public i f104856n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Object f104857o = C42727D.b(LazyThreadSafetyMode.f406616d, b.f104858l);

    /* compiled from: BeduinV2PageActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/BeduinV2PageActivity$a;", "", "<init>", "()V", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static Intent a(@Y61.k Context context, @Y61.k BeduinV2PageDeepLink beduinV2PageDeepLink, @Y61.l Class cls) {
            if (cls == null) {
                cls = BeduinV2PageActivity.class;
            }
            Intent intentPutExtra = new Intent(context, (Class<?>) cls).putExtra("pagePath", beduinV2PageDeepLink.f104782b).putExtra("screenName", beduinV2PageDeepLink.f104783c).putExtra("scrollOnKeyboardShown", beduinV2PageDeepLink.f104784d).putExtra("ignoreSafeArea", beduinV2PageDeepLink.f104785e);
            ForcedTheme.f104800c.getClass();
            ForcedTheme forcedThemeA = ForcedTheme.a.a(beduinV2PageDeepLink.f104787g);
            return intentPutExtra.putExtra("forced_theme", forcedThemeA != null ? forcedThemeA.f104805b : null).putExtra("scenarioParentId", beduinV2PageDeepLink.f104788h).putExtra("scenarioId", beduinV2PageDeepLink.f104789i).putExtra("composeRenderer", beduinV2PageDeepLink.f104790j);
        }

        public a() {
        }
    }

    /* compiled from: BeduinV2PageActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/B;", "invoke", "()Lcom/avito/android/beduin/v2/page/impl/B;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<B> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f104858l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final B invoke() {
            return new B();
        }
    }

    @Override // com.avito.android.ui.activity.a
    /* renamed from: S1 */
    public final boolean getF304545j() {
        return !b2();
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        ((InterfaceC14111a.b) C29972i.a(C29972i.b(this), InterfaceC14111a.b.class)).Ec().create().b(this);
    }

    @Override // com.avito.android.beduin.v2.page.e
    @Y61.k
    public final com.avito.android.beduin.v2.page.l a2() {
        i iVar = this.f104856n;
        if (iVar != null) {
            return iVar;
        }
        return null;
    }

    public final boolean b2() {
        C29270c0 c29270c0 = this.f104855m;
        if (c29270c0 == null) {
            c29270c0 = null;
        }
        c29270c0.getClass();
        kotlin.reflect.n<Object> nVar = C29270c0.f113263t[9];
        return ((Boolean) c29270c0.f113273k.a().invoke()).booleanValue() && getIntent().getBooleanExtra("ignoreSafeArea", false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.beduin.v2.page.e, com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.lib.util.i.f181373a.getClass();
        boolean z12 = com.avito.android.lib.util.i.f181377e;
        if (!z12 && b2()) {
            com.avito.android.lib.util.i.a(getWindow());
        }
        ((B) this.f104857o.getValue()).a(bundle, this, getWindow(), z12, b2());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("scenario_status_bar_appearance_light", ((B) this.f104857o.getValue()).f104823a);
    }
}
