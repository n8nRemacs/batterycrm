package com.avito.beduin.v2.avito.component.stepper.state;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvitoStepperState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/stepper/state/Mode;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Mode {

    /* renamed from: b, reason: collision with root package name */
    public static final Mode f335152b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Mode[] f335153c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f335154d;

    static {
        Mode mode = new Mode("Regular", 0);
        f335152b = mode;
        Mode[] modeArr = {mode, new Mode("Loading", 1), new Mode("Error", 2)};
        f335153c = modeArr;
        f335154d = kotlin.enums.c.a(modeArr);
    }

    public Mode() {
        throw null;
    }

    public static Mode valueOf(String str) {
        return (Mode) Enum.valueOf(Mode.class, str);
    }

    public static Mode[] values() {
        return (Mode[]) f335153c.clone();
    }
}
