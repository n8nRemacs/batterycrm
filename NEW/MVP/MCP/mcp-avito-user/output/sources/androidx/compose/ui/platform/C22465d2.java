package androidx.compose.ui.platform;

import java.util.Comparator;
import kotlin.Metadata;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/platform/d2;", "Ljava/util/Comparator;", "Landroidx/compose/ui/semantics/u;", "Lkotlin/Comparator;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.d2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22465d2 implements Comparator<androidx.compose.ui.semantics.u> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22465d2 f41430b = new C22465d2();

    @Override // java.util.Comparator
    public final int compare(androidx.compose.ui.semantics.u uVar, androidx.compose.ui.semantics.u uVar2) {
        l0.j jVarF = uVar.f();
        l0.j jVarF2 = uVar2.f();
        int iCompare = Float.compare(jVarF2.f413392c, jVarF.f413392c);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Float.compare(jVarF.f413391b, jVarF2.f413391b);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Float.compare(jVarF.f413393d, jVarF2.f413393d);
        return iCompare3 != 0 ? iCompare3 : Float.compare(jVarF2.f413390a, jVarF.f413390a);
    }
}
