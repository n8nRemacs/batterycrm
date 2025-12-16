package com.avito.android.profile_phones.confirm_phone;

import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.profile_phones.confirm_phone.l;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ConfirmPhoneFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/l$a;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/profile_phones/confirm_phone/l$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class c extends N implements Y41.l<l.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ConfirmPhoneFragment f227005l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ConfirmPhoneFragment confirmPhoneFragment) {
        super(1);
        this.f227005l = confirmPhoneFragment;
    }

    @Override // Y41.l
    public final G0 invoke(l.a aVar) {
        l.a aVar2 = aVar;
        boolean zF2 = L.f(aVar2, l.a.c.f227045a);
        ConfirmPhoneFragment confirmPhoneFragment = this.f227005l;
        if (zF2) {
            com.avito.android.lib.design.ticking_button.b bVar = confirmPhoneFragment.f226979s0;
            Button button = (bVar != null ? bVar : null).f180941a;
            button.setLoading(true);
            button.setEnabled(false);
        } else if (L.f(aVar2, l.a.b.f227044a)) {
            com.avito.android.lib.design.ticking_button.b bVar2 = confirmPhoneFragment.f226979s0;
            Button button2 = (bVar2 != null ? bVar2 : null).f180941a;
            button2.setLoading(false);
            button2.setEnabled(true);
        } else if (aVar2 instanceof l.a.C6894a) {
            com.avito.android.lib.design.ticking_button.b bVar3 = confirmPhoneFragment.f226979s0;
            if (bVar3 == null) {
                bVar3 = null;
            }
            Button button3 = bVar3.f180941a;
            button3.setLoading(false);
            button3.setEnabled(true);
            com.avito.android.lib.design.ticking_button.b bVar4 = confirmPhoneFragment.f226979s0;
            if (bVar4 == null) {
                bVar4 = null;
            }
            l.a.C6894a c6894a = (l.a.C6894a) aVar2;
            long j12 = c6894a.f227042a;
            y yVar = bVar4.f180944d;
            if (yVar != null) {
                DisposableHelper.a(yVar);
            }
            bVar4.f180946f = j12;
            bVar4.f180945e = j12;
            bVar4.a();
            Input input = confirmPhoneFragment.f226981u0;
            (input != null ? input : null).setMaxLength(c6894a.f227043b);
        }
        return G0.f406611a;
    }
}
