package com.avito.android.sx_address.new_address.view;

import com.avito.android.lib.design.chips.Chips;
import com.avito.android.sx_address.new_address.domain.DetailItem;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DetailsItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.sx_address.new_address.view.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35200g extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Chips f293894l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DetailItem f293895m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35200g(Chips chips, DetailItem detailItem) {
        super(0);
        this.f293894l = chips;
        this.f293895m = detailItem;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        boolean z12;
        Chips chips = this.f293894l;
        if (((ArrayList) chips.s()).isEmpty()) {
            chips.setError(this.f293895m.f293607c);
            z12 = true;
        } else {
            chips.setError(null);
            z12 = false;
        }
        return Boolean.valueOf(z12);
    }
}
