package com.avito.android.profile_phones.phone_action;

import Y41.l;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.profile_phones.phone_action.view_model.a;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: PhoneActionFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/view_model/a$c;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/profile_phones/phone_action/view_model/a$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements l<a.c, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PhoneActionFragment f227296l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PhoneActionFragment phoneActionFragment) {
        super(1);
        this.f227296l = phoneActionFragment;
    }

    @Override // Y41.l
    public final G0 invoke(a.c cVar) {
        a.c cVar2 = cVar;
        boolean z12 = cVar2 instanceof a.c.C6909a;
        PhoneActionFragment phoneActionFragment = this.f227296l;
        if (z12) {
            Input input = phoneActionFragment.f227255r0;
            if (input == null) {
                input = null;
            }
            D6.H(input);
            Input input2 = phoneActionFragment.f227255r0;
            if (input2 == null) {
                input2 = null;
            }
            input2.setOnClickListener(new a(phoneActionFragment, 1));
            Input input3 = phoneActionFragment.f227255r0;
            if (input3 == null) {
                input3 = null;
            }
            a.c.C6909a c6909a = (a.c.C6909a) cVar2;
            input3.setHint(c6909a.f227304a);
            Input input4 = phoneActionFragment.f227255r0;
            if (input4 == null) {
                input4 = null;
            }
            Input.t(input4, c6909a.f227306c, false, 6);
            ComponentContainer componentContainer = phoneActionFragment.f227254q0;
            if (componentContainer == null) {
                componentContainer = null;
            }
            componentContainer.setMessage(c6909a.f227305b);
            String str = c6909a.f227307d;
            if (str == null) {
                Input input5 = phoneActionFragment.f227255r0;
                Input input6 = input5 != null ? input5 : null;
                Input.f179303W.getClass();
                input6.setState(Input.f179304a0);
            } else {
                Input input7 = phoneActionFragment.f227255r0;
                if (input7 == null) {
                    input7 = null;
                }
                Input.f179303W.getClass();
                input7.setState(Input.f179305b0);
                ComponentContainer componentContainer2 = phoneActionFragment.f227254q0;
                if (componentContainer2 == null) {
                    componentContainer2 = null;
                }
                Input input8 = phoneActionFragment.f227255r0;
                ComponentContainer.l(componentContainer2, new int[]{(input8 != null ? input8 : null).getId()}, str, 4);
            }
        } else if (L.f(cVar2, a.c.b.f227308a)) {
            Input input9 = phoneActionFragment.f227255r0;
            D6.w(input9 != null ? input9 : null);
        }
        return G0.f406611a;
    }
}
