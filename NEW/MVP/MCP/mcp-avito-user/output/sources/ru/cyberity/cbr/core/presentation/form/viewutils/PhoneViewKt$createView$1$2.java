package ru.cyberity.cbr.core.presentation.form.viewutils;

import Y41.a;
import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.widget.PhoneKit;

/* compiled from: PhoneView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
final class PhoneViewKt$createView$1$2 extends N implements a<Boolean> {
    final /* synthetic */ PhoneKit $phoneNumberKit;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // Y41.a
    @k
    public final Boolean invoke() {
        return Boolean.valueOf(this.$phoneNumberKit.isValid());
    }
}
