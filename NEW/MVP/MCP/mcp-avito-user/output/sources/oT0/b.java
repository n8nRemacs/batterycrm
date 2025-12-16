package OT0;

import Y61.k;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.l;
import com.avito.beduin.v2.engine.component.y;
import com.avito.beduin.v2.engine.core.E;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.m;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MetaState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOT0/b;", "Lcom/avito/beduin/v2/engine/component/j;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends AbstractC36250j {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final b f12283c = new b();

    public b() {
        super("Meta", true);
    }

    @Override // com.avito.beduin.v2.engine.component.AbstractC36250j
    public final Object a(AbstractC36250j.b bVar, String str) throws BeduinPropertyException {
        Object objH;
        z zVar = bVar.f336562a;
        if (zVar.F()) {
            InterfaceC36252b interfaceC36252bE = zVar.E(zVar.getF336696a(), "@componentType", str);
            bVar.w(interfaceC36252bE);
            if (!interfaceC36252bE.getF336616h()) {
                try {
                    interfaceC36252bE.l(interfaceC36252bE.g().h(str));
                } catch (Throwable th2) {
                    interfaceC36252bE.l(null);
                    throw th2;
                }
            }
            objH = interfaceC36252bE.getF336702c();
        } else {
            objH = zVar.h(str);
        }
        y yVar = (y) objH;
        m mVar = bVar.f336563b;
        String strW = mVar.w(bVar, "tag");
        String strC = yVar.f336588b.f336794b.c();
        if (strC == null) {
            strC = "rootComponent";
        }
        return new a(str, strW, new l("child", strC, yVar.f336588b.f336795c, E.b(bVar, mVar, yVar)));
    }
}
