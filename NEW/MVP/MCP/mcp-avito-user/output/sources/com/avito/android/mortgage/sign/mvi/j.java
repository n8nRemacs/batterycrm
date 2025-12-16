package com.avito.android.mortgage.sign.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.mortgage.sign.draw.b;
import com.avito.android.mortgage.sign.mvi.entity.SignInternalAction;
import java.io.Serializable;
import java.util.Collection;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import o10.C44503a;

/* compiled from: SignReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/sign/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction;", "Lo10/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements u<SignInternalAction, o10.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final n10.b f203793b;

    @Inject
    public j(@Y61.k n10.b bVar) {
        this.f203793b = bVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final o10.d a(SignInternalAction signInternalAction, o10.d dVar) {
        SignInternalAction signInternalAction2 = signInternalAction;
        o10.d dVarA = dVar;
        boolean z12 = signInternalAction2 instanceof SignInternalAction.PathEnded;
        C44503a c44503a = dVarA.f419305b;
        if (z12) {
            dVarA = o10.d.a(dVarA, new C44503a(C42745f0.i0(new b.a(((SignInternalAction.PathEnded) signInternalAction2).f203778b), (Collection) c44503a.f419293a)), null, false, 510);
        } else if (signInternalAction2 instanceof SignInternalAction.PointDrawed) {
            SignInternalAction.PointDrawed pointDrawed = (SignInternalAction.PointDrawed) signInternalAction2;
            dVarA = o10.d.a(dVarA, new C44503a(C42745f0.i0(new b.C6070b(pointDrawed.f203779b, pointDrawed.f203780c), (Collection) c44503a.f419293a)), null, false, 510);
        } else if (signInternalAction2 instanceof SignInternalAction.SignCleared) {
            C44503a.f419291b.getClass();
            dVarA = o10.d.a(dVarA, C44503a.f419292c, null, false, 510);
        } else if (signInternalAction2 instanceof SignInternalAction.SvgFileCreationFailure) {
            dVarA = o10.d.a(dVarA, null, com.avito.android.printable_text.b.c(R.string.error, new Serializable[0]), false, 499);
        } else if (signInternalAction2 instanceof SignInternalAction.SvgFileUploadingEnded) {
            dVarA = o10.d.a(dVarA, null, null, false, 499);
        } else if (signInternalAction2 instanceof SignInternalAction.SvgFileUploadingError) {
            dVarA = o10.d.a(dVarA, null, com.avito.android.printable_text.b.c(R.string.error, new Serializable[0]), false, 499);
        } else if (signInternalAction2 instanceof SignInternalAction.SvgFileUploadingStarted) {
            dVarA = o10.d.a(dVarA, null, null, true, 499);
        } else if (signInternalAction2 instanceof SignInternalAction.DrawingStarted) {
            dVarA = o10.d.a(dVarA, null, null, false, 507);
        } else if (signInternalAction2 instanceof SignInternalAction.EmptySvgCreated) {
            dVarA = o10.d.a(dVarA, null, com.avito.android.printable_text.b.c(R.string.error_empty_sign, new Serializable[0]), false, 507);
        }
        this.f203793b.a(signInternalAction2, dVarA);
        return dVarA;
    }
}
