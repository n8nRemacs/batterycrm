package TC;

import AK0.l;
import Y61.k;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryOnboardingShowsStorage.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTC/e;", "LTC/d;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f15500a;

    @Inject
    public e(@k l lVar) {
        this.f15500a = lVar;
    }

    @Override // TC.d
    public final boolean a(@k String str) {
        return this.f15500a.getBoolean("category_onboarding_show_pref_key_".concat(str), false);
    }

    @Override // TC.d
    public final void b(@k String str) {
        SharedPreferences.Editor editorEdit = this.f15500a.getF316a().edit();
        editorEdit.putBoolean("category_onboarding_show_pref_key_".concat(str), true);
        editorEdit.apply();
    }
}
