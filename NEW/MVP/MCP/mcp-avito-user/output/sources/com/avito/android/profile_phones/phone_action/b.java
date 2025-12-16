package com.avito.android.profile_phones.phone_action;

import Y41.l;
import android.content.Intent;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.profile_phones.phone_action.view_model.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: PhoneActionFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/view_model/a$b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/profile_phones/phone_action/view_model/a$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class b extends N implements l<a.b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PhoneActionFragment f227264l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PhoneActionFragment phoneActionFragment) {
        super(1);
        this.f227264l = phoneActionFragment;
    }

    @Override // Y41.l
    public final G0 invoke(a.b bVar) {
        a.b bVar2 = bVar;
        boolean z12 = bVar2 instanceof a.b.C6908b;
        PhoneActionFragment phoneActionFragment = this.f227264l;
        if (z12) {
            Intent intent = new Intent();
            intent.putExtra("result_message", ((a.b.C6908b) bVar2).f227303a);
            ActivityC22955m activityC22955mRequireActivity = phoneActionFragment.requireActivity();
            activityC22955mRequireActivity.setResult(-1, intent);
            activityC22955mRequireActivity.finish();
        } else if (L.f(bVar2, a.b.C6907a.f227302a)) {
            ActivityC22955m activityC22955mRequireActivity2 = phoneActionFragment.requireActivity();
            activityC22955mRequireActivity2.setResult(0);
            activityC22955mRequireActivity2.finish();
        }
        return G0.f406611a;
    }
}
