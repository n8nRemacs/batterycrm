package PK0;

import android.graphics.Rect;
import android.text.Spanned;
import android.text.method.TransformationMethod;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SpannedPreserveTransformationMethod.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPK0/i;", "Landroid/text/method/TransformationMethod;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i implements TransformationMethod {
    @Override // android.text.method.TransformationMethod
    @Y61.l
    public final CharSequence getTransformation(@Y61.l CharSequence charSequence, @Y61.k View view) {
        if (charSequence == null || !(charSequence instanceof Spanned)) {
            throw null;
        }
        throw null;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z12, int i12, Rect rect) {
        throw null;
    }
}
