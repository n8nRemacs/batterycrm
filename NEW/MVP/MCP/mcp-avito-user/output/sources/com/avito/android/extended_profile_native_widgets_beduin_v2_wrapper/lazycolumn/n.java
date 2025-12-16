package com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn;

import com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.l;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedProfileLazyColumnState.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/engine/component/i;", "component", "", "<anonymous parameter 1>", "Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/lazycolumn/l$a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;Lcom/avito/beduin/v2/engine/component/i;Ljava/lang/String;)Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/lazycolumn/l$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class n extends N implements Y41.q<G, InterfaceC36249i, String, l.a> {

    /* renamed from: l, reason: collision with root package name */
    public static final n f151415l = new n();

    public n() {
        super(3);
    }

    @Override // Y41.q
    public final l.a invoke(G g12, InterfaceC36249i interfaceC36249i, String str) {
        G g13 = g12;
        InterfaceC36249i interfaceC36249i2 = interfaceC36249i;
        String string = g13.getString("layout_width");
        int iA2 = string != null ? ET0.g.a(string) : -1;
        String string2 = g13.getString("layout_height");
        return new l.a(interfaceC36249i2, new l.a.C4426a(iA2, string2 != null ? ET0.g.a(string2) : -2, (ET0.b) g13.f(m.f151414l, "layout_padding", "layout_padding")));
    }
}
