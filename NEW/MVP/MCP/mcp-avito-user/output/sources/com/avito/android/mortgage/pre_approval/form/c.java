package com.avito.android.mortgage.pre_approval.form;

import Y41.l;
import android.view.ViewGroup;
import com.avito.android.util.B6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PreApprovalFormView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "keyboardShown", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f201702l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ViewGroup viewGroup) {
        super(1);
        this.f201702l = viewGroup;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        if (!bool.booleanValue()) {
            B6.f318559a.getClass();
            ViewGroup viewGroup = this.f201702l;
            if (!B6.a(viewGroup)) {
                viewGroup.getRootView().clearFocus();
            }
        }
        return G0.f406611a;
    }
}
