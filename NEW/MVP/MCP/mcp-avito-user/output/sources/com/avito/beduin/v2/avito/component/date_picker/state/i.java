package com.avito.beduin.v2.avito.component.date_picker.state;

import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.E;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoDatePickerStateFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/date_picker/state/i;", "Lcom/avito/beduin/v2/engine/component/j;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i extends AbstractC36250j {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final i f334185c = new i();

    public i() {
        super("DatePicker", false, 2, null);
    }

    public static final ET0.a b(i iVar, G g12, String str) {
        iVar.getClass();
        return new ET0.a(C42745f0.C(g12.g(str, str, g.f334183l)));
    }

    public static final ST0.d c(i iVar, G g12, String str) {
        iVar.getClass();
        String string = g12.getString(str);
        if (string != null) {
            return new ST0.d(string);
        }
        return null;
    }

    @Override // com.avito.beduin.v2.engine.component.AbstractC36250j
    public final Object a(AbstractC36250j.b bVar, String str) {
        return (AvitoDatePickerState) E.b(bVar, bVar.f336563b, new e(bVar));
    }
}
