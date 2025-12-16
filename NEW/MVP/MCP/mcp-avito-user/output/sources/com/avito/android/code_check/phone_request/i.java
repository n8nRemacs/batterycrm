package com.avito.android.code_check.phone_request;

import android.widget.ScrollView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import qK0.C47313c;

/* compiled from: PhoneRequestFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PhoneRequestFragment f119085l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PhoneRequestFragment phoneRequestFragment) {
        super(0);
        this.f119085l = phoneRequestFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        PhoneRequestFragment phoneRequestFragment = this.f119085l;
        C47313c c47313c = phoneRequestFragment.f119045w0;
        kotlin.reflect.n<Object> nVar = PhoneRequestFragment.f119033I0[0];
        ((ScrollView) c47313c.a()).smoothScrollTo(0, phoneRequestFragment.y5().getTop());
        return G0.f406611a;
    }
}
