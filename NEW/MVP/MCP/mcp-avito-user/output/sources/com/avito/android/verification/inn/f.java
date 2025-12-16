package com.avito.android.verification.inn;

import com.avito.android.select.Arguments;
import com.avito.android.verification.verification_input_inn.VerificationInputInnFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InnListPresenterWatcher.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/select/Arguments;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/select/Arguments;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f extends N implements Y41.l<Arguments, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ VerificationInputInnFragment f323888l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(VerificationInputInnFragment verificationInputInnFragment) {
        super(1);
        this.f323888l = verificationInputInnFragment;
    }

    @Override // Y41.l
    public final G0 invoke(Arguments arguments) {
        VerificationInputInnFragment verificationInputInnFragment = this.f323888l;
        com.avito.android.select.bottom_sheet.c.a(verificationInputInnFragment, arguments).show(verificationInputInnFragment.getParentFragmentManager(), "tag.verification_select_fragment");
        return G0.f406611a;
    }
}
