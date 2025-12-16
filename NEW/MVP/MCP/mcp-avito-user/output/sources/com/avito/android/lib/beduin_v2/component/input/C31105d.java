package com.avito.android.lib.beduin_v2.component.input;

import com.avito.beduin.v2.avito.component.input.state.AvitoInputState;
import kotlin.Metadata;

/* compiled from: InputComponent.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_beduin-v2_renderer_component_input"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.beduin_v2.component.input.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31105d {

    /* compiled from: InputComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.component.input.d$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[AvitoInputState.InputState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AvitoInputState.InputState inputState = AvitoInputState.InputState.f334485c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AvitoInputState.InputState inputState2 = AvitoInputState.InputState.f334485c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final String a(String str) {
        switch (str.hashCode()) {
            case -1788569759:
                return !str.equals("arrowExpandLess16") ? str : "arrowExpandMore16";
            case -1788569734:
                return !str.equals("arrowExpandLess20") ? str : "arrowExpandMore20";
            case -1788569730:
                return !str.equals("arrowExpandLess24") ? str : "arrowExpandMore24";
            case -1750748643:
                return !str.equals("arrowExpandMore16") ? str : "arrowExpandLess16";
            case -1750748618:
                return !str.equals("arrowExpandMore20") ? str : "arrowExpandLess20";
            case -1750748614:
                return !str.equals("arrowExpandMore24") ? str : "arrowExpandLess24";
            default:
                return str;
        }
    }
}
