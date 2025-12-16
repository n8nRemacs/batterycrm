package cM;

import android.os.Build;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_problems.public_module.models.IacProblem;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: IacProblemNotificationAllCheckerImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LcM/p;", "LkM/f;", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class p extends kM.f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.notification.m f57829a;

    @Inject
    public p(@Y61.k com.avito.android.notification.m mVar) {
        this.f57829a = mVar;
    }

    @Override // lM.AbstractC43655b
    @Y61.l
    public final IacProblem b() {
        if (!this.f57829a.b().f44481b.areNotificationsEnabled() && Build.VERSION.SDK_INT >= 29) {
            return IacProblem.f169090c;
        }
        return null;
    }
}
