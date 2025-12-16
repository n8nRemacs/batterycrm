package androidx.compose.ui.platform;

import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u000026\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002`\u0006B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/q2;", "Ljava/util/Comparator;", "Lkotlin/Q;", "Ll0/j;", "", "Landroidx/compose/ui/semantics/u;", "Lkotlin/Comparator;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.q2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22517q2 implements Comparator<kotlin.Q<? extends l0.j, ? extends List<androidx.compose.ui.semantics.u>>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22517q2 f41531b = new C22517q2();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(kotlin.Q<? extends l0.j, ? extends List<androidx.compose.ui.semantics.u>> q12, kotlin.Q<? extends l0.j, ? extends List<androidx.compose.ui.semantics.u>> q13) {
        kotlin.Q<? extends l0.j, ? extends List<androidx.compose.ui.semantics.u>> q14 = q12;
        kotlin.Q<? extends l0.j, ? extends List<androidx.compose.ui.semantics.u>> q15 = q13;
        int iCompare = Float.compare(((l0.j) q14.f406619b).f413391b, ((l0.j) q15.f406619b).f413391b);
        return iCompare != 0 ? iCompare : Float.compare(((l0.j) q14.f406619b).f413393d, ((l0.j) q15.f406619b).f413393d);
    }
}
