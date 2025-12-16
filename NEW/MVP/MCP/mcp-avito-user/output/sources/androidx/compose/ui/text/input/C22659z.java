package androidx.compose.ui.text.input;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import kotlin.C42727D;
import kotlin.InterfaceC42830m;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* compiled from: InputMethodManager.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/z;", "Landroidx/compose/ui/text/input/y;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* renamed from: androidx.compose.ui.text.input.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22659z implements InterfaceC22658y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f42486a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f42487b = C42727D.b(LazyThreadSafetyMode.f406616d, new a());

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.core.view.V f42488c;

    /* compiled from: InputMethodManager.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/inputmethod/InputMethodManager;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.input.z$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<InputMethodManager> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final InputMethodManager invoke() {
            return (InputMethodManager) C22659z.this.f42486a.getContext().getSystemService("input_method");
        }
    }

    public C22659z(@Y61.k View view) {
        this.f42486a = view;
        this.f42488c = new androidx.core.view.V(view);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // androidx.compose.ui.text.input.InterfaceC22658y
    public final void a(@Y61.k CursorAnchorInfo cursorAnchorInfo) {
        ((InputMethodManager) this.f42487b.getValue()).updateCursorAnchorInfo(this.f42486a, cursorAnchorInfo);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // androidx.compose.ui.text.input.InterfaceC22658y
    public final void b(int i12, int i13, int i14, int i15) {
        ((InputMethodManager) this.f42487b.getValue()).updateSelection(this.f42486a, i12, i13, i14, i15);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // androidx.compose.ui.text.input.InterfaceC22658y
    public final void c() {
        ((InputMethodManager) this.f42487b.getValue()).restartInput(this.f42486a);
    }

    @Override // androidx.compose.ui.text.input.InterfaceC22658y
    public final void d() {
        this.f42488c.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // androidx.compose.ui.text.input.InterfaceC22658y
    public final void e(int i12, @Y61.k ExtractedText extractedText) {
        ((InputMethodManager) this.f42487b.getValue()).updateExtractedText(this.f42486a, i12, extractedText);
    }

    @Override // androidx.compose.ui.text.input.InterfaceC22658y
    public final void f() {
        this.f42488c.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // androidx.compose.ui.text.input.InterfaceC22658y
    public final boolean isActive() {
        return ((InputMethodManager) this.f42487b.getValue()).isActive(this.f42486a);
    }
}
