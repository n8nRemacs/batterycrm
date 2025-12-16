package qy0;

import AK0.l;
import Y61.k;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.P;
import com.avito.android.di.B;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.r;

/* compiled from: TooltipStorage.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqy0/a;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@B
/* renamed from: qy0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47463a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f429536a;

    @Inject
    public C47463a(@k l lVar) {
        this.f429536a = lVar;
    }

    public static final String a(C47463a c47463a, String str) {
        c47463a.getClass();
        return "travel.seller.calendar.onboarding_" + str;
    }

    @Y61.l
    public final Object b(@k String str, int i12, @k Continuation<? super G0> continuation) {
        r rVar = new r(1, IntrinsicsKt.intercepted(continuation));
        rVar.p();
        SharedPreferences.Editor editorEdit = this.f429536a.getF316a().edit();
        editorEdit.putInt(a(this, str), i12);
        editorEdit.apply();
        int i13 = Z.f406624c;
        G0 g02 = G0.f406611a;
        rVar.resumeWith(g02);
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : g02;
    }
}
