package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import kotlin.Metadata;

/* compiled from: ComposeInputMethodManager.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.input.internal.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20951y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<? super View, ? extends InterfaceC20941t> f31504a = a.f31505l;

    /* compiled from: ComposeInputMethodManager.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Landroidx/compose/foundation/text/input/internal/t;", "invoke", "(Landroid/view/View;)Landroidx/compose/foundation/text/input/internal/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.input.internal.y$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<View, InterfaceC20941t> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f31505l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final InterfaceC20941t invoke(View view) {
            View view2 = view;
            return Build.VERSION.SDK_INT >= 34 ? new C20949x(view2) : new C20947w(view2);
        }
    }

    @Y61.k
    public static final InterfaceC20941t a(@Y61.k View view) {
        return (InterfaceC20941t) ((a) f31504a).invoke(view);
    }
}
