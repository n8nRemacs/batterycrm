package androidx.compose.material3;

import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: SegmentedButton.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class G3 {

    /* compiled from: SegmentedButton.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f34772l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 3) == 2 && a13.c()) {
                a13.f();
            } else {
                C21567fe.f36343a.a(a13, 6);
            }
            return kotlin.G0.f406611a;
        }
    }

    static {
        new G3();
        new C22096n(-860995255, a.f34772l, false);
    }
}
