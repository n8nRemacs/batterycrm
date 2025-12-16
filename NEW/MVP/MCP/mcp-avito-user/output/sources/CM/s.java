package cM;

import android.os.Build;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_problems.public_module.models.IacProblem;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: IacProblemNotificationIacCheckerImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LcM/s;", "LkM/g;", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class s extends kM.g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final QK.a f57831a;

    @Inject
    public s(@Y61.k QK.a aVar) {
        this.f57831a = aVar;
    }

    @Override // lM.AbstractC43655b
    @Y61.l
    public final IacProblem b() {
        if (Build.VERSION.SDK_INT >= 29 && this.f57831a.d()) {
            return IacProblem.f169091d;
        }
        return null;
    }
}
