package com.avito.android.authorization.gorelkin;

import com.avito.android.remote.model.ParsingPermissionResult;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: ParsingPermissionViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class p extends H implements Y41.q<String, String, ParsingAllowance, I<ParsingPermissionResult>> {
    @Override // Y41.q
    public final I<ParsingPermissionResult> invoke(String str, String str2, ParsingAllowance parsingAllowance) {
        return ((h) this.receiver).a(str, str2, parsingAllowance);
    }
}
