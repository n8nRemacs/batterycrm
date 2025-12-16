package com.avito.android.tariff.remote.model.edit;

import aW.InterfaceC19824b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TariffAlertAction.kt */
@InterfaceC19824b
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/tariff/remote/model/edit/TariffAlertAction;", "", "<init>", "()V", "ButtonStyle", "Lcom/avito/android/tariff/remote/model/edit/a;", "Lcom/avito/android/tariff/remote/model/edit/b;", "Lcom/avito/android/tariff/remote/model/edit/c;", "_avito_tariff_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class TariffAlertAction {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TariffAlertAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/tariff/remote/model/edit/TariffAlertAction$ButtonStyle;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "OUTLINE", "LINK_INCREASED", "_avito_tariff_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ButtonStyle {

        @com.google.gson.annotations.c("linkIncreased")
        public static final ButtonStyle LINK_INCREASED;

        @com.google.gson.annotations.c("outline")
        public static final ButtonStyle OUTLINE;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ButtonStyle[] f297495b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f297496c;

        static {
            ButtonStyle buttonStyle = new ButtonStyle("OUTLINE", 0, "outline");
            OUTLINE = buttonStyle;
            ButtonStyle buttonStyle2 = new ButtonStyle("LINK_INCREASED", 1, "linkIncreased");
            LINK_INCREASED = buttonStyle2;
            ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2};
            f297495b = buttonStyleArr;
            f297496c = kotlin.enums.c.a(buttonStyleArr);
        }

        private ButtonStyle(String str, int i12, String str2) {
        }

        public static ButtonStyle valueOf(String str) {
            return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
        }

        public static ButtonStyle[] values() {
            return (ButtonStyle[]) f297495b.clone();
        }
    }

    public /* synthetic */ TariffAlertAction(C42822w c42822w) {
        this();
    }

    private TariffAlertAction() {
    }
}
