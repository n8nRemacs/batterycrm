package Fc1;

import feedback.shared.sdk.api.network.entities.Button;
import feedback.shared.sdk.api.network.entities.Field;
import feedback.shared.sdk.api.network.entities.Page;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class Y1 implements InterfaceC13680n2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Page f5336a;

    public Y1(Page page) {
        this.f5336a = page;
    }

    @Override // Fc1.InterfaceC13680n2
    @Y61.k
    public final ArrayList a() {
        Page page = this.f5336a;
        List<Field> fields = page.getFields();
        ArrayList arrayList = new ArrayList(C42745f0.q(fields, 10));
        Iterator<T> it = fields.iterator();
        while (it.hasNext()) {
            arrayList.add(new Z5((Field) it.next()));
        }
        List<Button> buttons = page.getButtons();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(buttons, 10));
        Iterator<T> it2 = buttons.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new G5((Button) it2.next()));
        }
        return C42745f0.h0(arrayList2, arrayList);
    }

    @Override // Fc1.InterfaceC13680n2
    @Y61.k
    public final String getId() {
        return this.f5336a.getId();
    }
}
