package com.avito.android.push.impl_module.token.sending.sender;

import Kk0.C14323b;
import kotlin.Metadata;
import l41.o;

/* compiled from: PushTokenSenderImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LKk0/b;", "result", "", "apply", "(LKk0/b;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public static final g<T, R> f246045b = new g<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return Boolean.valueOf(((C14323b) obj).getResult().getSuccess());
    }
}
