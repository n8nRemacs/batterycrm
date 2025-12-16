package hc1;

import Y61.k;
import gc1.C40657a;
import gc1.C40659c;
import gc1.C40660d;
import gc1.InterfaceC40658b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"SberIdSDK_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0206  */
    /* JADX WARN: Type inference failed for: r4v12, types: [gc1.b$f] */
    /* JADX WARN: Type inference failed for: r4v15, types: [gc1.b$n] */
    /* JADX WARN: Type inference failed for: r4v17, types: [gc1.b$o] */
    /* JADX WARN: Type inference failed for: r4v19, types: [gc1.b$h] */
    /* JADX WARN: Type inference failed for: r4v21, types: [gc1.b$o] */
    /* JADX WARN: Type inference failed for: r4v23, types: [gc1.b$j] */
    /* JADX WARN: Type inference failed for: r4v26, types: [gc1.b$e] */
    /* JADX WARN: Type inference failed for: r4v29, types: [gc1.b$i] */
    /* JADX WARN: Type inference failed for: r4v32, types: [gc1.b$d] */
    /* JADX WARN: Type inference failed for: r4v6, types: [gc1.b$g] */
    /* JADX WARN: Type inference failed for: r4v9, types: [gc1.b$l] */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList a(@Y61.k java.util.List r19) {
        /*
            Method dump skipped, instructions count: 1256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hc1.b.a(java.util.List):java.util.ArrayList");
    }

    @k
    public static final InterfaceC40658b.o b(@k C40660d c40660d) {
        List<C40660d> listS;
        String load = c40660d.getLoad();
        C40659c data = c40660d.getData();
        String title = data != null ? data.getTitle() : null;
        C40659c data2 = c40660d.getData();
        String icon = data2 != null ? data2.getIcon() : null;
        C40659c data3 = c40660d.getData();
        String badge = data3 != null ? data3.getBadge() : null;
        C40659c data4 = c40660d.getData();
        Integer iconSize = data4 != null ? data4.getIconSize() : null;
        C40659c data5 = c40660d.getData();
        String initials = data5 != null ? data5.getInitials() : null;
        C40659c data6 = c40660d.getData();
        String value = data6 != null ? data6.getValue() : null;
        C40659c data7 = c40660d.getData();
        C40657a valueClick = data7 != null ? data7.getValueClick() : null;
        C40659c data8 = c40660d.getData();
        String elementName = data8 != null ? data8.getElementName() : null;
        C40659c data9 = c40660d.getData();
        String widgetName = data9 != null ? data9.getWidgetName() : null;
        C40659c data10 = c40660d.getData();
        return new InterfaceC40658b.o(title, icon, badge, iconSize, initials, value, valueClick, load, elementName, widgetName, (data10 == null || (listS = data10.s()) == null) ? null : a(listS));
    }
}
