package com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.iacForce;

import Y41.p;
import androidx.compose.runtime.A;
import com.avito.android.R;
import com.avito.android.permissions.z;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.LinkAttribute;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacForceCallMethodsDialogFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ IacForceCallMethodsDialogFragment f168496l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f168497m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(IacForceCallMethodsDialogFragment iacForceCallMethodsDialogFragment, com.avito.android.lib.design.bottom_sheet.d dVar) {
        super(2);
        this.f168496l = iacForceCallMethodsDialogFragment;
        this.f168497m = dVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.e eVar = com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.e.f168466a;
            IacForceCallMethodsDialogFragment iacForceCallMethodsDialogFragment = this.f168496l;
            String string = iacForceCallMethodsDialogFragment.getString(R.string.iac_outgoing_call_ability_impl_call_methods_force_dialog_content);
            String string2 = iacForceCallMethodsDialogFragment.getString(R.string.iac_outgoing_call_ability_impl_call_methods_how_it_work);
            eVar.getClass();
            AttributedText attributedText = new AttributedText(string, Collections.singletonList(new LinkAttribute("howto", string2, "", null, 8, null)), 0, 4, null);
            attributedText.setOnUrlClickListener(new com.avito.android.auction.details.i(iacForceCallMethodsDialogFragment, 7));
            z zVar = iacForceCallMethodsDialogFragment.f168468h0;
            if (zVar == null) {
                zVar = null;
            }
            boolean z12 = !zVar.b("android.permission.RECORD_AUDIO").b();
            com.avito.android.lib.design.bottom_sheet.d dVar = this.f168497m;
            iacForceCallMethodsDialogFragment.f5(attributedText, z12, new f(iacForceCallMethodsDialogFragment, dVar), new g(iacForceCallMethodsDialogFragment, dVar), a13, 262152);
        }
        return G0.f406611a;
    }
}
