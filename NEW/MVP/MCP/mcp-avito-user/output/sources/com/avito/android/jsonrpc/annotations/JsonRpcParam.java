package com.avito.android.jsonrpc.annotations;

import P41.c;
import P41.d;
import androidx.annotation.Keep;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: JsonRpcParam.kt */
@Target({ElementType.PARAMETER})
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/jsonrpc/annotations/JsonRpcParam;", "", "value", "", "()Ljava/lang/String;", "_common_jsonrpc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@Retention(RetentionPolicy.RUNTIME)
@c
/* loaded from: classes14.dex */
public @interface JsonRpcParam {
    String value();
}
