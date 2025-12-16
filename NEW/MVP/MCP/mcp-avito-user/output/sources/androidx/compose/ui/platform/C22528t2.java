package androidx.compose.ui.platform;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: InspectableValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/platform/t2;", "Lkotlin/sequences/m;", "Landroidx/compose/ui/platform/s2;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.t2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22528t2 implements InterfaceC43030m<C22524s2> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList f41603a = new ArrayList();

    public final void b(@Y61.l Object obj, @Y61.k String str) {
        this.f41603a.add(new C22524s2(str, obj));
    }

    @Override // kotlin.sequences.InterfaceC43030m
    @Y61.k
    public final Iterator<C22524s2> iterator() {
        return this.f41603a.iterator();
    }
}
