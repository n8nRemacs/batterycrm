package ru.cyberity.cbr.core.presentation.form.viewutils;

import Y41.l;
import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.data.model.remote.c;
import ru.cyberity.cbr.core.widget.PhoneKit;

/* compiled from: PhoneView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "value", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
final class PhoneViewKt$createView$1$1 extends N implements l<String, String> {
    final /* synthetic */ PhoneKit $phoneNumberKit;

    @Override // Y41.l
    @k
    public final String invoke(@k String str) {
        String strA;
        c mask = this.$phoneNumberKit.getMask();
        return (mask == null || (strA = mask.a(str)) == null) ? "" : strA;
    }
}
