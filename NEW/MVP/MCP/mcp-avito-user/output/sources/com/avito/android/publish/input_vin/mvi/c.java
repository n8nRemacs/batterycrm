package com.avito.android.publish.input_vin.mvi;

import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InputVinMviFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class c extends N implements Y41.l<Exception, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InputVinMviFragment f236630l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InputVinMviFragment inputVinMviFragment) {
        super(1);
        this.f236630l = inputVinMviFragment;
    }

    @Override // Y41.l
    public final G0 invoke(Exception exc) {
        String string = this.f236630l.getString(R.string.no_application_installed_to_perform_this_action);
        com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, this.f236630l, com.avito.android.printable_text.b.f(string), null, null, null, 0, null, 1022);
        return G0.f406611a;
    }
}
