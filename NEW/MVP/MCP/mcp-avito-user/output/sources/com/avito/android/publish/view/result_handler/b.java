package com.avito.android.publish.view.result_handler;

import Y41.q;
import Y61.k;
import Y61.l;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import com.avito.android.Q1;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.C35974x2;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: PublishActivityResultHandler.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/view/result_handler/b;", "Lcom/avito/android/publish/view/result_handler/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f245674a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Q1 f245675b;

    @Inject
    public b(@k d dVar, @k Q1 q12) {
        this.f245674a = dVar;
        this.f245675b = q12;
    }

    @Override // com.avito.android.publish.view.result_handler.a
    public final void a(@l ActivityC22955m activityC22955m, @l BaseFragment baseFragment, @k Intent intent, int i12) {
        if (!this.f245675b.A().invoke().booleanValue()) {
            C35966w1.d(baseFragment, intent, i12);
            return;
        }
        if (activityC22955m != null) {
            try {
                C35974x2.d(intent);
                activityC22955m.startActivityForResult(intent, i12);
            } catch (Exception e12) {
                V2.f318762a.a(activityC22955m.getClass().getName(), "", e12);
            }
        }
    }

    @Override // com.avito.android.publish.view.result_handler.a
    public final void b(@l String str, @k q<? super Integer, ? super Integer, ? super Intent, G0> qVar) {
        if (this.f245675b.A().invoke().booleanValue()) {
            return;
        }
        this.f245674a.a(str, qVar);
    }

    @Override // com.avito.android.publish.view.result_handler.a
    public final void c(@l ActivityC22955m activityC22955m, @l Fragment fragment, @k Intent intent, int i12, boolean z12) {
        Q1 q12 = this.f245675b;
        if (q12.A().invoke().booleanValue() && !z12) {
            n<Object> nVar = Q1.f67448x0[38];
            if (((Boolean) q12.f67460L.a().invoke()).booleanValue()) {
                if (activityC22955m != null) {
                    activityC22955m.startActivityForResult(intent, i12);
                    return;
                }
                return;
            }
        }
        if (fragment != null) {
            fragment.startActivityForResult(intent, i12);
        }
    }

    @Override // com.avito.android.publish.view.result_handler.a
    public final void d(@l String str, int i12, int i13, @l Intent intent, @k q<? super Integer, ? super Integer, ? super Intent, G0> qVar) {
        if (this.f245675b.A().invoke().booleanValue()) {
            qVar.invoke(Integer.valueOf(i12), Integer.valueOf(i13), intent);
        } else {
            this.f245674a.b(str, i12, i13, intent);
        }
    }
}
