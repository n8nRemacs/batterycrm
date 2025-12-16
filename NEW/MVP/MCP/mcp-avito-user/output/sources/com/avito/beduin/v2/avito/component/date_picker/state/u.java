package com.avito.beduin.v2.avito.component.date_picker.state;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoDatePickerStylePatchDeclaration.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "", "it", "", "Lcom/avito/beduin/v2/component/common/Size;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;Ljava/lang/String;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class u extends N implements Y41.p<G, String, Integer> {

    /* renamed from: l, reason: collision with root package name */
    public static final u f334222l = new u();

    public u() {
        super(2);
    }

    @Override // Y41.p
    public final Integer invoke(G g12, String str) {
        String string = g12.getString(str);
        if (string != null) {
            return Integer.valueOf(ET0.g.a(string));
        }
        return null;
    }
}
