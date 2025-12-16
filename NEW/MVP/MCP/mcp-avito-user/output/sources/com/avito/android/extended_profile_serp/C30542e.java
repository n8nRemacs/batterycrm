package com.avito.android.extended_profile_serp;

import android.content.Context;
import com.avito.android.R;
import com.avito.android.util.L5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfileSerpFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.extended_profile_serp.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30542e extends kotlin.jvm.internal.N implements Y41.l<Exception, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfileSerpFragment f152882l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30542e(ExtendedProfileSerpFragment extendedProfileSerpFragment) {
        super(1);
        this.f152882l = extendedProfileSerpFragment;
    }

    @Override // Y41.l
    public final G0 invoke(Exception exc) {
        Context context = this.f152882l.getContext();
        if (context != null) {
            L5.a(context, R.string.no_application_installed_to_perform_this_action, 0);
        }
        return G0.f406611a;
    }
}
