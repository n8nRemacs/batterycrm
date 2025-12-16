package com.avito.android.beduin.ui.screen;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.m;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.beduin.ui.screen.BeduinScreenRootFragment;
import com.avito.android.util.C35961v3;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinScreenActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/ui/screen/BeduinScreenActivity;", "Landroidx/appcompat/app/m;", "Lcom/avito/android/analytics/screens/j$a;", "Lcom/avito/android/beduin/ui/screen/a;", "<init>", "()V", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinScreenActivity extends m implements InterfaceC28477j.a, com.avito.android.beduin.ui.screen.a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f104068c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f104069b = C35961v3.a(this);

    /* compiled from: BeduinScreenActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/ui/screen/BeduinScreenActivity$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BeduinScreenActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            BeduinScreenActivity.this.finish();
            return G0.f406611a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.C] */
    @Override // androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.beduin_screen_activity);
        if (bundle == null) {
            H hE2 = getSupportFragmentManager().e();
            BeduinScreenRootFragment.a aVar = BeduinScreenRootFragment.f104071v0;
            BeduinScreenRootOpenParams beduinScreenRootOpenParams = (BeduinScreenRootOpenParams) this.f104069b.getValue();
            aVar.getClass();
            BeduinScreenRootFragment beduinScreenRootFragment = new BeduinScreenRootFragment();
            beduinScreenRootFragment.f104079t0.setValue(beduinScreenRootFragment, BeduinScreenRootFragment.f104072w0[1], beduinScreenRootOpenParams);
            hE2.j(R.id.fragment_container, beduinScreenRootFragment, null, 1);
            hE2.e();
        }
        com.avito.android.ui.fragments.e.b(this, getSupportFragmentManager(), new b());
    }
}
