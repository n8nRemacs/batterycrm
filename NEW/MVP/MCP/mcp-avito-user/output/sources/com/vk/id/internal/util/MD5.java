package com.vk.id.internal.util;

import Q11.b;
import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.reflect.n;

/* compiled from: MD5.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001f\u0010\r\u001a\u00060\u0007j\u0002`\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/vk/id/internal/util/MD5;", "", "<init>", "()V", "", "hex", "[C", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "tmpBuilder$delegate", "Lcom/vk/id/internal/util/ThreadLocalDelegate;", "getTmpBuilder", "()Ljava/lang/StringBuilder;", "tmpBuilder", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MD5 {
    static final /* synthetic */ n<Object>[] $$delegatedProperties = {m0.f406844a.i(new h0(MD5.class, "tmpBuilder", "getTmpBuilder()Ljava/lang/StringBuilder;", 0))};

    @k
    public static final MD5 INSTANCE = new MD5();

    @k
    private static final char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: tmpBuilder$delegate, reason: from kotlin metadata */
    @k
    private static final ThreadLocalDelegate tmpBuilder = ThreadLocalDelegateKt.threadLocal(new b(1));
    public static final int $stable = 8;

    private MD5() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StringBuilder tmpBuilder_delegate$lambda$0() {
        return new StringBuilder();
    }
}
