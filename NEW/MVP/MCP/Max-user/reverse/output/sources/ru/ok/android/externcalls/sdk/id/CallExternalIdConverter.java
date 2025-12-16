package ru.ok.android.externcalls.sdk.id;

import defpackage.o81;

/* loaded from: classes2.dex */
public class CallExternalIdConverter {
    private CallExternalIdConverter() {
    }

    public static ParticipantId convert(o81 o81Var) {
        if (o81Var == null) {
            return null;
        }
        return new ParticipantId(o81Var.a, o81Var.b == 3, o81Var.c);
    }
}
