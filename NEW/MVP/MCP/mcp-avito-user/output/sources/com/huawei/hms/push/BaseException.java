package com.huawei.hms.push;

import com.huawei.hms.aaid.constant.ErrorEnum;

/* loaded from: classes7.dex */
public class BaseException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final ErrorEnum f363597b;

    public BaseException(int i12) {
        ErrorEnum errorEnumA = ErrorEnum.a(i12);
        this.f363597b = errorEnumA;
        errorEnumA.getClass();
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f363597b.f363223d;
    }
}
