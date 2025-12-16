package com.avito.android.messenger.conversation.mvi.platform_actions;

import com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PlatformActionsView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class w extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f194050l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f194051m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(int i12, z zVar) {
        super(0);
        this.f194050l = i12;
        this.f194051m = zVar;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        z zVar = this.f194051m;
        int top = zVar.f194069p.getTop() + this.f194050l;
        boolean z12 = !zVar.f194059f.invoke(Integer.valueOf(top)).booleanValue();
        int i12 = top - zVar.f194063j;
        boolean z13 = false;
        int i13 = i12 < 0 ? 0 : i12;
        if (zVar.f194064k.getPaddingBottom() != i13) {
            D6.f(zVar.f194064k, 0, 0, 0, i13, 7);
            z12 = false;
        }
        BottomSheet.c.a aVar = new BottomSheet.c.a(top);
        BottomSheet bottomSheet = zVar.f194068o;
        if (aVar.equals(bottomSheet.getF177861t())) {
            z13 = z12;
        } else {
            bottomSheet.s2(aVar);
        }
        return Boolean.valueOf(z13);
    }
}
