package com.avito.android.blueprints.publish.reg_number;

import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: VehicleRegNumberInputItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "itemId", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class m extends N implements Y41.l<String, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f106415l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str) {
        super(1);
        this.f106415l = str;
    }

    @Override // Y41.l
    public final Boolean invoke(String str) {
        return Boolean.valueOf(L.f(str, this.f106415l));
    }
}
