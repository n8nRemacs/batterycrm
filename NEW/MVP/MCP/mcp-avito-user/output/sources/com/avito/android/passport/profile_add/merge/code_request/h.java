package com.avito.android.passport.profile_add.merge.code_request;

import androidx.view.C22984Q;
import com.avito.android.lib.design.button.Button;
import com.avito.android.passport.profile_add.merge.code_request.CodeRequestFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import qK0.C47313c;

/* compiled from: CodeRequestFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CodeRequestFragment f212857l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CodeRequestFragment codeRequestFragment) {
        super(0);
        this.f212857l = codeRequestFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        CodeRequestFragment.a aVar = CodeRequestFragment.f212821B0;
        CodeRequestFragment codeRequestFragment = this.f212857l;
        com.avito.android.lib.design.input.n.c(codeRequestFragment.q5(), new f(codeRequestFragment));
        C47313c c47313c = codeRequestFragment.f212834x0;
        kotlin.reflect.n<Object> nVar = CodeRequestFragment.f212822C0[5];
        ((Button) c47313c.a()).setOnClickListener(new com.avito.android.order.feature.c(codeRequestFragment, 10));
        C43175k.K(new C43197r1(new g(codeRequestFragment, null), y.a(com.avito.android.lib.design.input.n.a(codeRequestFragment.q5(), 6))), C22984Q.a(codeRequestFragment.getViewLifecycleOwner()));
        return G0.f406611a;
    }
}
