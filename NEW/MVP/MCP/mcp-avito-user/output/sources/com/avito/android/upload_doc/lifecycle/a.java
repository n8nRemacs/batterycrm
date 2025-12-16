package com.avito.android.upload_doc.lifecycle;

import Y41.l;
import android.os.Bundle;
import com.avito.android.deep_linking.links.GigUploadDocDeeplink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GigUploadDocFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class a extends N implements l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ GigUploadDocDeeplink.FlowType f306844l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(GigUploadDocDeeplink.FlowType flowType) {
        super(1);
        this.f306844l = flowType;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        bundle.putParcelable("EXTRA_FLOW_TYPE", this.f306844l);
        return G0.f406611a;
    }
}
