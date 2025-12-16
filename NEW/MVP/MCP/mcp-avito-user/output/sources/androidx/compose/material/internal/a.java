package androidx.compose.material.internal;

import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExposedDropdownMenuPopup.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f33659a = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f33660b = new C22096n(-1578637197, C1634a.f33661l, false);

    /* compiled from: ExposedDropdownMenuPopup.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.material.internal.a$a, reason: collision with other inner class name */
    public static final class C1634a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C1634a f33661l = new C1634a();

        public C1634a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            int iIntValue = num.intValue();
            if (!a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
                a13.f();
            }
            return G0.f406611a;
        }
    }
}
