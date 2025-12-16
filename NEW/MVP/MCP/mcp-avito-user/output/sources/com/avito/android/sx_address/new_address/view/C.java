package com.avito.android.sx_address.new_address.view;

import com.avito.android.lib.design.chips.Chips;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: TypeItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class C extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B f293860l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f293861m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(B b12, String str) {
        super(0);
        this.f293860l = b12;
        this.f293861m = str;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        boolean z12;
        String str;
        B b12 = this.f293860l;
        boolean zIsEmpty = ((ArrayList) b12.f293852b.s()).isEmpty();
        Chips chips = b12.f293852b;
        if (!zIsEmpty || (str = this.f293861m) == null || C43066x.K(str)) {
            chips.setError(null);
            z12 = false;
        } else {
            chips.setError(str);
            z12 = true;
        }
        return Boolean.valueOf(z12);
    }
}
