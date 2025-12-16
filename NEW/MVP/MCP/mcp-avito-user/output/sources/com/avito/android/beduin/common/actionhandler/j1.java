package com.avito.android.beduin.common.actionhandler;

import android.content.DialogInterface;
import com.avito.android.R;
import com.avito.android.beduin.common.action.BeduinShowAlertAction;
import com.avito.android.lib.design.modal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BeduinShowAlertHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class j1 extends kotlin.jvm.internal.N implements Y41.p<a.b, DialogInterface, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BeduinShowAlertAction f100265l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k1 f100266m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BeduinShowAlertAction f100267n;

    /* compiled from: BeduinShowAlertHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100268a;

        static {
            int[] iArr = new int[BeduinShowAlertAction.Button.Type.values().length];
            try {
                iArr[BeduinShowAlertAction.Button.Type.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinShowAlertAction.Button.Type.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinShowAlertAction.Button.Type.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BeduinShowAlertAction.Button.Type.WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f100268a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(BeduinShowAlertAction beduinShowAlertAction, k1 k1Var, BeduinShowAlertAction beduinShowAlertAction2) {
        super(2);
        this.f100265l = beduinShowAlertAction;
        this.f100266m = k1Var;
        this.f100267n = beduinShowAlertAction2;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        DialogInterface dialogInterface2 = dialogInterface;
        BeduinShowAlertAction beduinShowAlertAction = this.f100265l;
        bVar2.setTitle(beduinShowAlertAction.getTitle());
        bVar2.setSubtitle(beduinShowAlertAction.getSubtitle());
        Boolean closeButtonVisible = beduinShowAlertAction.getCloseButtonVisible();
        Boolean bool = Boolean.TRUE;
        bVar2.setCloseButtonVisible(kotlin.jvm.internal.L.f(closeButtonVisible, bool));
        bVar2.setCancelable(kotlin.jvm.internal.L.f(beduinShowAlertAction.getDismissible(), bool));
        k1 k1Var = this.f100266m;
        bVar2.b(new C28735a1(k1Var, this.f100267n));
        bVar2.setButtonsOrientation(beduinShowAlertAction.getButtonsOrientation() == BeduinShowAlertAction.Orientation.VERTICAL ? 1 : 0);
        List<BeduinShowAlertAction.Button> buttons = beduinShowAlertAction.getButtons();
        if (buttons != null) {
            for (BeduinShowAlertAction.Button button : buttons) {
                int i12 = a.f100268a[button.getType().ordinal()];
                if (i12 == 1) {
                    bVar2.L3(button.getTitle(), new C28741c1(k1Var, dialogInterface2, button));
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                } else if (i12 == 2) {
                    bVar2.M3(button.getTitle(), new C28747e1(k1Var, dialogInterface2, button));
                    kotlin.G0 g03 = kotlin.G0.f406611a;
                } else if (i12 == 3) {
                    bVar2.N3(button.getTitle(), new C28753g1(k1Var, dialogInterface2, button));
                    kotlin.G0 g04 = kotlin.G0.f406611a;
                } else {
                    if (i12 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar2.F3(R.style.Legacy_Button_DangerLarge, new i1(k1Var, dialogInterface2, button), button.getTitle());
                    kotlin.G0 g05 = kotlin.G0.f406611a;
                }
            }
        }
        return kotlin.G0.f406611a;
    }
}
