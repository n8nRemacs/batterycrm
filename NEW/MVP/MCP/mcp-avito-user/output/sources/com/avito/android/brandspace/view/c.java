package com.avito.android.brandspace.view;

import Y41.l;
import android.content.Context;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.error.z;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BrandspaceFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/error/ApiError;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/error/ApiError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements l<ApiError, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f107788l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BrandspaceFragment f107789m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BrandspaceFragment brandspaceFragment, h hVar) {
        super(1);
        this.f107788l = hVar;
        this.f107789m = brandspaceFragment;
    }

    @Override // Y41.l
    public final G0 invoke(ApiError apiError) {
        ApiError apiError2 = apiError;
        h hVar = this.f107788l;
        String strI = z.i(apiError2);
        if (strI == null) {
            Context context = this.f107789m.getContext();
            strI = context != null ? context.getString(R.string.brandspace_request_error) : null;
            if (strI == null) {
                strI = "";
            }
        }
        f.c.f125255c.getClass();
        com.avito.android.component.toast.b.b(hVar.f107799h, strI, 0, null, 0, null, 0, ToastBarPosition.f181046d, f.c.a.a(apiError2, null), null, 130878);
        return G0.f406611a;
    }
}
