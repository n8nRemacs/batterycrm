package com.avito.android.navigation;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.deeplink_handler.view.impl.d;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.L5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ShowToastIfNotFoundActivityNavigator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/navigation/e;", "Lcom/avito/android/deeplink_handler/view/a$a;", "_avito_navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements a.InterfaceC4053a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final BaseFragment f207202b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d.a f207203c;

    /* compiled from: ShowToastIfNotFoundActivityNavigator.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Exception, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Exception exc) {
            ActivityC22955m activityC22955mL1 = e.this.f207202b.l1();
            if (activityC22955mL1 != null) {
                L5.a(activityC22955mL1, R.string.no_application_installed_to_perform_this_action, 0);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ShowToastIfNotFoundActivityNavigator.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<Exception, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Exception exc) {
            ActivityC22955m activityC22955mL1 = e.this.f207202b.l1();
            if (activityC22955mL1 != null) {
                L5.a(activityC22955mL1, R.string.no_application_installed_to_perform_this_action, 0);
            }
            return G0.f406611a;
        }
    }

    public e(@k BaseFragment baseFragment, @k d.a aVar) {
        this.f207202b = baseFragment;
        this.f207203c = aVar;
    }

    @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
    public final void J(@k Intent intent, int i12, @k l<? super Exception, G0> lVar) {
        this.f207203c.J(intent, i12, new b());
    }

    @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
    public final void R(@k Intent intent, @k l<? super Exception, G0> lVar) {
        this.f207203c.R(intent, new a());
    }

    @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
    public final void X(int i12, @k Intent intent) {
        this.f207203c.X(i12, intent);
    }

    @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
    public final void g1(@k l<? super Context, G0> lVar) {
        BaseFragment baseFragment = this.f207202b;
        try {
            lVar.invoke(baseFragment.requireActivity());
        } catch (Throwable unused) {
            ActivityC22955m activityC22955mL1 = baseFragment.l1();
            if (activityC22955mL1 != null) {
                L5.a(activityC22955mL1, R.string.no_application_installed_to_perform_this_action, 0);
            }
        }
    }

    @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
    public final void s1() {
        this.f207203c.s1();
    }
}
