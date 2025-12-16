package com.avito.android.jsonrpc.client;

import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: JsonRpcCallException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/jsonrpc/client/JsonRpcCallException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_common_jsonrpc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class JsonRpcCallException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final int f174716b;

    public JsonRpcCallException(int i12, @l String str, @l Throwable th2) {
        super("Error " + i12 + ": " + str, th2);
        this.f174716b = i12;
    }

    public /* synthetic */ JsonRpcCallException(int i12, String str, Throwable th2, int i13, C42822w c42822w) {
        this(i12, str, (i13 & 4) != 0 ? null : th2);
    }
}
