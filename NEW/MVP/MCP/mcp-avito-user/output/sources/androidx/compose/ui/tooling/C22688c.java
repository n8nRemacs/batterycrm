package androidx.compose.ui.tooling;

import androidx.compose.material.dc;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PreviewActivity.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.tooling.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22688c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C22688c f42808a = new C22688c();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f42809b = new C22096n(-426398407, a.f42810l, false);

    /* compiled from: PreviewActivity.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.tooling.c$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f42810l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            int iIntValue = num.intValue();
            if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
                dc.c(null, 0L, 0L, 0L, 0L, 0, false, 0, null, null, a13, 6);
            } else {
                a13.f();
            }
            return G0.f406611a;
        }
    }
}
