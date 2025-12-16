package com.avito.android.navigation.compose;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import androidx.view.C23315U;
import androidx.view.C23404y0;
import androidx.view.compose.j;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BaseNavActivity.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/navigation/compose/d;", "Lcom/avito/android/ui/activity/a;", "<init>", "()V", "_avito_navigation-compose_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class d extends com.avito.android.ui.activity.a {

    /* renamed from: m, reason: collision with root package name */
    @l
    public C23404y0 f207196m;

    /* compiled from: BaseNavActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, G0> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.c.a(false, r.c(-1672833726, new c(d.this), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    @k
    public abstract List<com.avito.android.lib.compose.design.shared.navigation.a> a2();

    @k
    public abstract String b2();

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        j.a(this, new C22096n(486294247, new a(), true));
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@k Intent intent) {
        super.onNewIntent(intent);
        C23404y0 c23404y0 = this.f207196m;
        if (c23404y0 != null) {
            c23404y0.l(new C23315U(intent.getData(), null, null), null);
        }
    }
}
