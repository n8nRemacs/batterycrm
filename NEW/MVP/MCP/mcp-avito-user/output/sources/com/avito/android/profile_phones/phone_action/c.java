package com.avito.android.profile_phones.phone_action;

import Y41.l;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.profile_phones.phone_action.view_model.a;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import ru.avito.component.toolbar.AppBarLayoutWithIconAction;

/* compiled from: PhoneActionFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/view_model/a$e;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/profile_phones/phone_action/view_model/a$e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class c extends N implements l<a.e, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PhoneActionFragment f227265l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PhoneActionFragment phoneActionFragment) {
        super(1);
        this.f227265l = phoneActionFragment;
    }

    @Override // Y41.l
    public final G0 invoke(a.e eVar) {
        a.e eVar2 = eVar;
        boolean z12 = eVar2 instanceof a.e.C6910a;
        PhoneActionFragment phoneActionFragment = this.f227265l;
        if (z12) {
            AppBarLayoutWithIconAction appBarLayoutWithIconAction = phoneActionFragment.f227251n0;
            if (appBarLayoutWithIconAction == null) {
                appBarLayoutWithIconAction = null;
            }
            a.e.C6910a c6910a = (a.e.C6910a) eVar2;
            appBarLayoutWithIconAction.setTitle(c6910a.f227312a);
            AppBarLayoutWithIconAction appBarLayoutWithIconAction2 = phoneActionFragment.f227251n0;
            if (appBarLayoutWithIconAction2 == null) {
                appBarLayoutWithIconAction2 = null;
            }
            appBarLayoutWithIconAction2.setShortTitle(c6910a.f227312a);
            ComponentContainer componentContainer = phoneActionFragment.f227254q0;
            if (componentContainer == null) {
                componentContainer = null;
            }
            componentContainer.setSubtitle(c6910a.f227313b);
            Button button = phoneActionFragment.f227253p0;
            if (button == null) {
                button = null;
            }
            button.setText(c6910a.f227314c);
            Button button2 = phoneActionFragment.f227253p0;
            if (button2 == null) {
                button2 = null;
            }
            D6.k(button2);
            Button button3 = phoneActionFragment.f227253p0;
            (button3 != null ? button3 : null).setLoading(false);
        } else if (L.f(eVar2, a.e.b.f227315a)) {
            Button button4 = phoneActionFragment.f227253p0;
            if (button4 == null) {
                button4 = null;
            }
            D6.h(button4);
            Button button5 = phoneActionFragment.f227253p0;
            (button5 != null ? button5 : null).setLoading(true);
        }
        return G0.f406611a;
    }
}
