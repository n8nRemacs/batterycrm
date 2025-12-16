package com.avito.android.iac_dialer.impl_module.screens.call_screen.view;

import com.avito.android.iac_dialer_ui.pub.call_screen.wait_bottom_sheet.IacUIWaitBottomSheetType;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import xK.InterfaceC49852b;

/* compiled from: IacCallScreenViewFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/wait_bottom_sheet/IacUIWaitBottomSheetType;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/iac_dialer_ui/pub/call_screen/wait_bottom_sheet/IacUIWaitBottomSheetType;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class u extends N implements Y41.l<IacUIWaitBottomSheetType, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC49852b, G0> f166346l;

    /* compiled from: IacCallScreenViewFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[IacUIWaitBottomSheetType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IacUIWaitBottomSheetType iacUIWaitBottomSheetType = IacUIWaitBottomSheetType.f167398b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IacUIWaitBottomSheetType iacUIWaitBottomSheetType2 = IacUIWaitBottomSheetType.f167398b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(Y41.l<? super InterfaceC49852b, G0> lVar) {
        super(1);
        this.f166346l = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(IacUIWaitBottomSheetType iacUIWaitBottomSheetType) {
        InterfaceC49852b.z.a aVar;
        int iOrdinal = iacUIWaitBottomSheetType.ordinal();
        if (iOrdinal == 0) {
            aVar = InterfaceC49852b.z.a.C12863a.f442375a;
        } else if (iOrdinal == 1) {
            aVar = InterfaceC49852b.z.a.c.f442377a;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = InterfaceC49852b.z.a.C12864b.f442376a;
        }
        ((e) this.f166346l).invoke(new InterfaceC49852b.z(aVar));
        return G0.f406611a;
    }
}
