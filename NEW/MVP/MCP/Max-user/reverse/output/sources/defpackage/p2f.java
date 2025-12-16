package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final /* synthetic */ class p2f implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ p2f(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.cm6
    public final Object invoke() throws CameraAccessException {
        int i = 3;
        int i2 = 2;
        Continuation continuation = null;
        boolean z = true;
        switch (this.a) {
            case 0:
                return new rb9(this.b);
            case 1:
                return new xq0(this.b);
            case 2:
                return new rb9(this.b);
            case 3:
                return new xq0(this.b);
            case 4:
                l1h l1hVar = new l1h(this.b);
                l1hVar.setBackgroundEnabled(true);
                l1hVar.setDrawableEnabled(false);
                return l1hVar;
            case 5:
                return new xq0(this.b);
            case 6:
                l1h l1hVar2 = new l1h(this.b);
                l1hVar2.setBackgroundEnabled(true);
                l1hVar2.setDrawableEnabled(false);
                return l1hVar2;
            case 7:
                TextView textView = new TextView(this.b);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                layoutParams.setMarginStart(kti.d(4 * vw4.d().getDisplayMetrics().density));
                textView.setLayoutParams(layoutParams);
                dpg.y.b(textView, t75.b);
                tqi.c(new ipe(3, continuation, 7), textView);
                textView.setGravity(17);
                return textView;
            case 8:
                return new ae7(this.b);
            case 9:
                TextView textView2 = new TextView(this.b);
                dpg.l.b(textView2, t75.b);
                textView2.setTextColor(a93.s0.y(textView2).getText().b);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                float f = 12;
                layoutParams2.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(f * vw4.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
                textView2.setLayoutParams(layoutParams2);
                textView2.setGravity(17);
                return textView2;
            case 10:
                return new m72(new lk0[]{new nc0(1), new xq0(this.b)});
            case 11:
                Context context = this.b;
                if (Build.VERSION.SDK_INT < 29) {
                    CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
                    String[] cameraIdList = cameraManager.getCameraIdList();
                    int length = cameraIdList.length;
                    boolean z2 = true;
                    int i3 = 0;
                    while (i3 < length) {
                        String str = cameraIdList[i3];
                        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                        Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                        String str2 = "UNKNOWN";
                        String str3 = (num != null && num.intValue() == z) ? "BACK" : (num != null && num.intValue() == 0) ? "FRONT" : (num != null && num.intValue() == i2) ? "EXTERNAL" : "UNKNOWN";
                        if (num2 != null && num2.intValue() == i2) {
                            str2 = "LEGACY";
                        } else if (num2 != null && num2.intValue() == 0) {
                            str2 = "LIMITED";
                        } else if (num2 != null && num2.intValue() == z) {
                            str2 = "FULL";
                        } else if (num2 != null && num2.intValue() == i) {
                            str2 = "LEVEL_3";
                        }
                        boolean z3 = (num2 == null || num2.intValue() == i2) ? false : z;
                        String name = i9h.class.getName();
                        l6b l6bVar = wqi.a;
                        if (l6bVar != null) {
                            lg8 lg8Var = lg8.o;
                            if (l6bVar.b(lg8Var)) {
                                StringBuilder sbL = wy1.l("VideoMessage Camera-", str, " (", str3, "). Level = ");
                                sbL.append(str2);
                                sbL.append(". isAvailable = ");
                                sbL.append(z3);
                                sbL.append("\n");
                                l6bVar.c(lg8Var, name, sbL.toString(), null);
                            }
                        }
                        i3++;
                        z2 = z3;
                        i = 3;
                        i2 = 2;
                        z = true;
                    }
                    if (!z2) {
                        String name2 = i9h.class.getName();
                        l6b l6bVar2 = wqi.a;
                        if (l6bVar2 != null) {
                            lg8 lg8Var2 = lg8.Y;
                            if (l6bVar2.b(lg8Var2)) {
                                l6bVar2.c(lg8Var2, name2, "Camera for VideoMessage is unavailable. Recording has to be disabled", null);
                            }
                        }
                    }
                    z = z2;
                }
                return Boolean.valueOf(z);
            default:
                return Integer.valueOf(a93.s0.x(this.b).k().a().r().d.b);
        }
    }

    public /* synthetic */ p2f(Context context, i9h i9hVar) {
        this.a = 11;
        this.b = context;
    }
}
