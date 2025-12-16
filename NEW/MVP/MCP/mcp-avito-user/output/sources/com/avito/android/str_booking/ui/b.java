package com.avito.android.str_booking.ui;

import android.net.Uri;
import com.avito.android.util.V2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StrBookingFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class b extends N implements Y41.l<Exception, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Uri f285918l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Uri uri) {
        super(1);
        this.f285918l = uri;
    }

    @Override // Y41.l
    public final G0 invoke(Exception exc) {
        V2.f318762a.j("StrBookingFragment", "openWebView() failed to open uri = " + this.f285918l, null);
        return G0.f406611a;
    }
}
