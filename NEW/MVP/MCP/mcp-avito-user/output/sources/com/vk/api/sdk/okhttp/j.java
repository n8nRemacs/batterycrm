package com.vk.api.sdk.okhttp;

import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.InterfaceC43057n;

/* compiled from: LoggingInterceptor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/text/n;", "match", "", "<anonymous>", "(Lkotlin/text/n;)Ljava/lang/String;"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class j extends N implements Y41.l<InterfaceC43057n, String> {

    /* renamed from: l, reason: collision with root package name */
    public static final j f366652l = new j();

    public j() {
        super(1);
    }

    @Override // Y41.l
    public final String invoke(InterfaceC43057n interfaceC43057n) {
        return AK.c.s(new StringBuilder("\""), interfaceC43057n.d().get(1), "\":<HIDE>");
    }
}
