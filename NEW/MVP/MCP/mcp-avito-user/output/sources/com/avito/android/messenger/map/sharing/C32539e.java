package com.avito.android.messenger.map.sharing;

import android.content.Intent;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.InterfaceC23040h0;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LiveDatas.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.map.sharing.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32539e<T> implements InterfaceC23040h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SharingMapFragment f196738b;

    public C32539e(SharingMapFragment sharingMapFragment) {
        this.f196738b = sharingMapFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.view.InterfaceC23040h0
    public final void onChanged(T t12) {
        if (t12 != 0) {
            MessageBody.Location location = (MessageBody.Location) t12;
            ActivityC22955m activityC22955mL1 = this.f196738b.l1();
            if (activityC22955mL1 != null) {
                activityC22955mL1.setResult(-1, new Intent().putExtra("shared_location", location));
                activityC22955mL1.finish();
            }
        }
    }
}
