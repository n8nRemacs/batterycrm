package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
/* renamed from: com.google.android.gms.common.internal.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36728u {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC36696c0 f349466a = new Y();

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @RX0.a
    /* renamed from: com.google.android.gms.common.internal.u$a */
    public interface a<R extends com.google.android.gms.common.api.r, T> {
    }

    @j.N
    @RX0.a
    public static Task a(@j.N BasePendingResult basePendingResult) {
        C36694b0 c36694b0 = new C36694b0();
        InterfaceC36696c0 interfaceC36696c0 = f349466a;
        C37028k c37028k = new C37028k();
        basePendingResult.addStatusListener(new Z(basePendingResult, c37028k, c36694b0, interfaceC36696c0));
        return c37028k.f355672a;
    }
}
