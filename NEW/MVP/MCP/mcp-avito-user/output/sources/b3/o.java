package B3;

import android.content.SharedPreferences;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;

/* compiled from: PassportToggleStorage.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB3/o;", "LB3/h;", "_avito_account-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class o implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SharedPreferences f851a;

    @Inject
    public o(@Y61.k SharedPreferences sharedPreferences) {
        this.f851a = sharedPreferences;
    }

    @Override // B3.h
    public final boolean c() {
        SharedPreferences sharedPreferences = this.f851a;
        Boolean boolValueOf = null;
        if (sharedPreferences.contains("passport_multi_profile")) {
            n0 n0Var = m0.f406844a;
            kotlin.reflect.d dVarB = n0Var.b(Boolean.class);
            if (dVarB.equals(n0Var.b(Integer.TYPE))) {
                boolValueOf = (Boolean) Integer.valueOf(sharedPreferences.getInt("passport_multi_profile", 0));
            } else if (dVarB.equals(n0Var.b(Long.TYPE))) {
                boolValueOf = (Boolean) Long.valueOf(sharedPreferences.getLong("passport_multi_profile", 0L));
            } else if (dVarB.equals(n0Var.b(Float.TYPE))) {
                boolValueOf = (Boolean) Float.valueOf(sharedPreferences.getFloat("passport_multi_profile", 0.0f));
            } else if (dVarB.equals(n0Var.b(String.class))) {
                Object string = sharedPreferences.getString("passport_multi_profile", "");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                boolValueOf = (Boolean) string;
            } else if (dVarB.equals(n0Var.b(Boolean.TYPE))) {
                boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("passport_multi_profile", false));
            }
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    @Override // B3.h
    public final void d(boolean z12) {
        this.f851a.edit().putBoolean("passport_multi_profile", z12).apply();
    }
}
