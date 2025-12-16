package com.avito.android.profile_phones.phone_action;

import Y41.l;
import android.view.View;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.profile_phones.phone_action.view_model.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PhoneActionFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/view_model/a$a;", "kotlin.jvm.PlatformType", "event", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/profile_phones/phone_action/view_model/a$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d extends N implements l<a.C6906a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PhoneActionFragment f227266l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PhoneActionFragment phoneActionFragment) {
        super(1);
        this.f227266l = phoneActionFragment;
    }

    @Override // Y41.l
    public final G0 invoke(a.C6906a c6906a) {
        a.C6906a c6906a2 = c6906a;
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        View view = this.f227266l.f227252o0;
        if (view == null) {
            view = null;
        }
        com.avito.android.component.toast.c.b(cVar, view, com.avito.android.printable_text.b.f(c6906a2.f227300a), null, null, null, new f.c(c6906a2.f227301b), 0, ToastBarPosition.f181045c, null, false, false, null, null, 4014);
        return G0.f406611a;
    }
}
