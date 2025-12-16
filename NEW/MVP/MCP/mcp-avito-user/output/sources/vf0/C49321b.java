package vf0;

import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BedTypesDiffUtilCallback.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lvf0/b;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vf0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C49321b extends C23424o.f<TV0.a> {
    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        return aVar.equals(aVar2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return aVar3.getF287650b() == aVar4.getF287650b() && aVar3.getClass().equals(aVar4.getClass());
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if (!(aVar3 instanceof com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.dialog_items.bed_type.a) || !(aVar4 instanceof com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.dialog_items.bed_type.a)) {
            return null;
        }
        boolean z12 = ((com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.dialog_items.bed_type.a) aVar4).f244997g;
        Boolean boolValueOf = Boolean.valueOf(z12);
        if (((com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.dialog_items.bed_type.a) aVar3).f244997g == z12) {
            boolValueOf = null;
        }
        C49320a c49320a = new C49320a(boolValueOf);
        if (boolValueOf != null) {
            return c49320a;
        }
        return null;
    }
}
