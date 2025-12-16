package androidx.view;

import Y41.l;
import androidx.view.InterfaceC22983P;
import kotlin.Metadata;

/* compiled from: OnBackPressedDispatcher.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.activity.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19918B {
    public static void a(y yVar, InterfaceC22983P interfaceC22983P, l lVar, int i12) {
        if ((i12 & 1) != 0) {
            interfaceC22983P = null;
        }
        C19917A c19917a = new C19917A(lVar);
        if (interfaceC22983P != null) {
            yVar.a(interfaceC22983P, c19917a);
        } else {
            yVar.b(c19917a);
        }
    }
}
