package com.avito.android.mandatory_verification.items.uploader;

import Y41.p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;

/* compiled from: MandatoryVerificationUploaderItemPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "fileId", "", "isUploaded", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class j extends N implements p<String, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f184702l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar) {
        super(2);
        this.f184702l = kVar;
    }

    @Override // Y41.p
    public final G0 invoke(String str, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        k kVar = this.f184702l;
        C43259k.d(kVar.f184705d, null, null, new i(kVar, str, zBooleanValue, null), 3);
        return G0.f406611a;
    }
}
