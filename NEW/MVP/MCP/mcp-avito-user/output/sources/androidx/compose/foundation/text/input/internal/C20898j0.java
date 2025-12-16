package androidx.compose.foundation.text.input.internal;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* compiled from: InputMethodManager.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/j0;", "Landroidx/compose/foundation/text/input/internal/i0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.input.internal.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20898j0 implements InterfaceC20896i0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f31124a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f31125b = C42727D.b(LazyThreadSafetyMode.f406616d, new a());

    /* compiled from: InputMethodManager.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/inputmethod/InputMethodManager;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.input.internal.j0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<InputMethodManager> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final InputMethodManager invoke() {
            return (InputMethodManager) C20898j0.this.f31124a.getContext().getSystemService("input_method");
        }
    }

    public C20898j0(@Y61.k View view) {
        this.f31124a = view;
        new androidx.core.view.V(view);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final InputMethodManager a() {
        return (InputMethodManager) this.f31125b.getValue();
    }

    public final void b(int i12, int i13, int i14, int i15) {
        a().updateSelection(this.f31124a, i12, i13, i14, i15);
    }
}
