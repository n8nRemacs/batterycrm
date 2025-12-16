package androidx.view.compose;

import X41.i;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22143q0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.S;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.C;
import androidx.view.I;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BackHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/activity/compose/m;", "", "<init>", "()V", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final m f21198a = new m();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C22143q0 f21199b = S.c(a.f21200l);

    /* compiled from: BackHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/activity/C;", "invoke", "()Landroidx/activity/C;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends N implements Y41.a<C> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f21200l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ C invoke() {
            return null;
        }
    }

    @InterfaceC22132o
    @l
    @i
    public static C a(@l A a12) {
        a12.I(-2068013981);
        C cA2 = (C) a12.o(f21199b);
        a12.I(1680121597);
        if (cA2 == null) {
            cA2 = I.a((View) a12.o(AndroidCompositionLocals_androidKt.f41073f));
        }
        a12.O();
        if (cA2 == null) {
            Object baseContext = (Context) a12.o(AndroidCompositionLocals_androidKt.f41069b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof C) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            cA2 = (C) baseContext;
        }
        a12.O();
        return cA2;
    }
}
