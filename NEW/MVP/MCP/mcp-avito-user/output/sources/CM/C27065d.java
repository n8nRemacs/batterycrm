package cM;

import android.app.Application;
import android.os.PowerManager;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_problems.public_module.models.IacProblem;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kM.AbstractC42598b;
import kotlin.Metadata;

/* compiled from: IacProblemBatteryOptimizationCheckerImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LcM/d;", "LkM/b;", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* renamed from: cM.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C27065d extends AbstractC42598b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f57821a;

    @Inject
    public C27065d(@Y61.k Application application) {
        this.f57821a = application;
    }

    @Override // lM.AbstractC43655b
    @Y61.l
    public final IacProblem b() {
        Application application = this.f57821a;
        if (((PowerManager) application.getSystemService("power")).isIgnoringBatteryOptimizations(application.getPackageName())) {
            return null;
        }
        return IacProblem.f169093f;
    }
}
