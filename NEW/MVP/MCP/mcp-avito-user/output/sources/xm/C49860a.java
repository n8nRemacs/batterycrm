package xM;

import Y61.k;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.MultipleIntParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OriginalParameter.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_image-enhancement_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: xM.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49860a {
    public static final boolean a(@k ParameterSlot parameterSlot) {
        if (parameterSlot instanceof MultipleIntParameter) {
            IntParameter.Widget widget = ((MultipleIntParameter) parameterSlot).getWidget();
            if (L.f(widget != null ? widget.getType() : null, "autoImageEnhancementOriginals")) {
                return true;
            }
        }
        return false;
    }
}
