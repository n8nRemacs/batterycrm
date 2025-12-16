package com.google.crypto.tink.shaded.protobuf;

@CheckReturnValue
/* loaded from: classes6.dex */
final class OneofInfo {
    private final java.lang.reflect.Field caseField;

    /* renamed from: id, reason: collision with root package name */
    private final int f360676id;
    private final java.lang.reflect.Field valueField;

    public OneofInfo(int i12, java.lang.reflect.Field field, java.lang.reflect.Field field2) {
        this.f360676id = i12;
        this.caseField = field;
        this.valueField = field2;
    }

    public java.lang.reflect.Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.f360676id;
    }

    public java.lang.reflect.Field getValueField() {
        return this.valueField;
    }
}
