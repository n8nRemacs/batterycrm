package com.avito.android.verification.verification_finish;

import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import m.C43852a;
import xM0.C49861a;

/* compiled from: VerificationFinishView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LxM0/a;", "Lkotlin/G0;", "invoke", "(LxM0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class t extends N implements Y41.l<C49861a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public static final t f325333l = new t();

    public t() {
        super(1);
    }

    @Override // Y41.l
    public final G0 invoke(C49861a c49861a) {
        C49861a c49861a2 = c49861a;
        c49861a2.setImageDrawable(C43852a.a(c49861a2.getContext(), R.drawable.img_content_placeholder_error));
        c49861a2.setTitle(c49861a2.getContext().getString(R.string.verification_default_network_error_title));
        c49861a2.setSubtitle(c49861a2.getContext().getString(R.string.verification_default_network_error_body));
        c49861a2.setFirstButtonTitle(c49861a2.getContext().getString(R.string.verification_default_network_error_first_action));
        c49861a2.setSecondButtonTitle(c49861a2.getContext().getString(R.string.verification_default_network_error_second_action));
        return G0.f406611a;
    }
}
