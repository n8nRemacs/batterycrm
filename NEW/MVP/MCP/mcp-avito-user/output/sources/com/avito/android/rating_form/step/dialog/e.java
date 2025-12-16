package com.avito.android.rating_form.step.dialog;

import android.content.Context;
import com.avito.android.R;
import com.avito.android.util.L5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BottomSheetDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements Y41.l<Exception, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BottomSheetDialogFragment f249394l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BottomSheetDialogFragment bottomSheetDialogFragment) {
        super(1);
        this.f249394l = bottomSheetDialogFragment;
    }

    @Override // Y41.l
    public final G0 invoke(Exception exc) {
        Context context = this.f249394l.getContext();
        if (context != null) {
            L5.a(context, R.string.no_application_installed_to_perform_this_action, 0);
        }
        return G0.f406611a;
    }
}
