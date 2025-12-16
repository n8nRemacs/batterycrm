package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.platform.C22535v1;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PointerInteropFilter.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Q {

    /* compiled from: PointerInteropFilter.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "motionEvent", "Landroid/view/MotionEvent;", "invoke", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<MotionEvent, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.viewinterop.a f40180l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.viewinterop.a aVar) {
            super(1);
            this.f40180l = aVar;
        }

        @Override // Y41.l
        public final Boolean invoke(MotionEvent motionEvent) {
            boolean zDispatchTouchEvent;
            MotionEvent motionEvent2 = motionEvent;
            int actionMasked = motionEvent2.getActionMasked();
            androidx.compose.ui.viewinterop.a aVar = this.f40180l;
            switch (actionMasked) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    zDispatchTouchEvent = aVar.dispatchTouchEvent(motionEvent2);
                    break;
                default:
                    zDispatchTouchEvent = aVar.dispatchGenericMotionEvent(motionEvent2);
                    break;
            }
            return Boolean.valueOf(zDispatchTouchEvent);
        }
    }

    @Y61.k
    public static final androidx.compose.ui.v a(@Y61.k androidx.compose.ui.v vVar, @Y61.k androidx.compose.ui.viewinterop.a aVar) {
        M m12 = new M();
        m12.f40155b = new a(aVar);
        X x12 = new X();
        X x13 = m12.f40156c;
        if (x13 != null) {
            x13.f40196b = null;
        }
        m12.f40156c = x12;
        x12.f40196b = m12;
        aVar.setOnRequestDisallowInterceptTouchEvent$ui_release(x12);
        return vVar.d0(m12);
    }

    public static androidx.compose.ui.v b(androidx.compose.ui.v vVar, Y41.l lVar) {
        return androidx.compose.ui.n.a(vVar, C22535v1.f41625a, new P(lVar));
    }
}
