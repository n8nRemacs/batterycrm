package com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.nativewidget;

import Y41.l;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedProfileNativeWidgetState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/nativewidget/d;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/nativewidget/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class f extends N implements l<G, d> {

    /* renamed from: l, reason: collision with root package name */
    public static final f f151431l = new f();

    public f() {
        super(1);
    }

    @Override // Y41.l
    public final d invoke(G g12) {
        G g13 = g12;
        String string = g13.getString("type");
        if (string == null) {
            string = "";
        }
        return new d(string, (ET0.b) g13.f(e.f151430l, "layout_padding", "layout_padding"));
    }
}
