package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import androidx.compose.ui.text.input.C22654u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/s0;", "Landroidx/compose/foundation/text/input/internal/h0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.input.internal.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20915s0 implements InterfaceC20894h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C20946v0 f31210a;

    public C20915s0(C20946v0 c20946v0) {
        this.f31210a = c20946v0;
    }

    @Override // androidx.compose.foundation.text.input.internal.InterfaceC20894h0
    public final void a(boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        C20908o0 c20908o0 = this.f31210a.f31494m;
        synchronized (c20908o0.f31183c) {
            try {
                c20908o0.f31186f = z14;
                c20908o0.f31187g = z15;
                c20908o0.f31188h = z16;
                c20908o0.f31189i = z17;
                if (z12) {
                    c20908o0.f31185e = true;
                    if (c20908o0.f31190j != null) {
                        c20908o0.a();
                    }
                }
                c20908o0.f31184d = z13;
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.foundation.text.input.internal.InterfaceC20894h0
    public final void b(D0 d02) {
        C20946v0 c20946v0 = this.f31210a;
        int size = c20946v0.f31491j.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (kotlin.jvm.internal.L.f(((WeakReference) c20946v0.f31491j.get(i12)).get(), d02)) {
                c20946v0.f31491j.remove(i12);
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
    @Override // androidx.compose.foundation.text.input.internal.InterfaceC20894h0
    public final void c(KeyEvent keyEvent) {
        ((BaseInputConnection) this.f31210a.f31492k.getValue()).sendKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // androidx.compose.foundation.text.input.internal.InterfaceC20894h0
    public final void d(ArrayList arrayList) {
        this.f31210a.f31484c.invoke(arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // androidx.compose.foundation.text.input.internal.InterfaceC20894h0
    public final void e(int i12) {
        this.f31210a.f31485d.invoke(C22654u.a(i12));
    }
}
