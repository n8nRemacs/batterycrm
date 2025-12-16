package com.avito.android.profile_phones.phone_action;

import Y41.l;
import com.avito.android.profile_phones.phone_action.PhoneActionFragment;
import com.avito.android.profile_phones.phone_action.view_model.a;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.select.Arguments;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PhoneActionFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/view_model/a$d;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/profile_phones/phone_action/view_model/a$d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements l<a.d, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PhoneActionFragment f227297l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PhoneActionFragment phoneActionFragment) {
        super(1);
        this.f227297l = phoneActionFragment;
    }

    @Override // Y41.l
    public final G0 invoke(a.d dVar) {
        a.d dVar2 = dVar;
        String str = dVar2.f227309a;
        ParcelableEntity<String> parcelableEntity = dVar2.f227311c;
        Arguments arguments = new Arguments(false, "phone_select", null, dVar2.f227310b, parcelableEntity != null ? Collections.singletonList(parcelableEntity) : C42784z0.f406748b, str, null, false, false, false, false, false, false, false, false, null, false, null, null, null, null, false, false, false, false, false, false, false, null, null, null, false, false, null, false, false, false, 0, null, null, -7355, 255, null);
        PhoneActionFragment.a aVar = PhoneActionFragment.f227250u0;
        PhoneActionFragment phoneActionFragment = this.f227297l;
        phoneActionFragment.getClass();
        com.avito.android.select.bottom_sheet.c.a(phoneActionFragment, arguments).show(phoneActionFragment.getParentFragmentManager(), "select_fragment");
        return G0.f406611a;
    }
}
