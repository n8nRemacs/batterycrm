package com.avito.android.auto_select.confirmation_dialog;

import cf.InterfaceC27184a;
import com.avito.android.auto_select.confirmation_dialog.ui.models.AutoSelectButtonType;
import com.avito.android.auto_select.confirmation_dialog.ui.models.AutoSelectTypedButton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoSelectConfirmationBottomSheetV2.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutoSelectTypedButton f95887l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC27184a, G0> f95888m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ cf.d f95889n;

    /* compiled from: AutoSelectConfirmationBottomSheetV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f95890a;

        static {
            int[] iArr = new int[AutoSelectButtonType.values().length];
            try {
                AutoSelectButtonType autoSelectButtonType = AutoSelectButtonType.f95916b;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f95890a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(AutoSelectTypedButton autoSelectTypedButton, Y41.l<? super InterfaceC27184a, G0> lVar, cf.d dVar) {
        super(0);
        this.f95887l = autoSelectTypedButton;
        this.f95888m = lVar;
        this.f95889n = dVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        AutoSelectTypedButton autoSelectTypedButton = this.f95887l;
        AutoSelectButtonType autoSelectButtonType = autoSelectTypedButton.f95925c;
        int i12 = autoSelectButtonType == null ? -1 : a.f95890a[autoSelectButtonType.ordinal()];
        Y41.l<InterfaceC27184a, G0> lVar = this.f95888m;
        cf.d dVar = this.f95889n;
        if (i12 == 1) {
            ((g) lVar).invoke(new InterfaceC27184a.b(autoSelectTypedButton.f95924b, dVar.f58081b, false, 4, null));
        } else {
            ((g) lVar).invoke(new InterfaceC27184a.C2052a(dVar.f58081b, autoSelectTypedButton.f95924b));
        }
        return G0.f406611a;
    }
}
