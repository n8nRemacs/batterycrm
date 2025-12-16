package com.avito.android.inline_filters.dialog.select;

import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: RadioSelectFilterDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isKeyboardVisible", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class x extends kotlin.jvm.internal.N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B f172208l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(B b12) {
        super(1);
        this.f172208l = b12;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        boolean z12 = true;
        B b12 = this.f172208l;
        if (zBooleanValue && b12.f172004i.getTop() <= b12.f172003h.getBottom()) {
            z12 = false;
        }
        D6.G(b12.f172004i, z12);
        return G0.f406611a;
    }
}
