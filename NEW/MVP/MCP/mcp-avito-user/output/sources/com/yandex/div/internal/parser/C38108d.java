package com.yandex.div.internal.parser;

import kotlin.Metadata;
import kotlin.X;
import kotlin.jvm.internal.L;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: JsonParserInternals.kt */
@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002*v\u0010\b\u001a\u0004\b\u0000\u0010\u0000\u001a\u0004\b\u0001\u0010\u0001\"2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00010\u000222\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00010\u0002*6\b\u0000\u0010\u000b\u001a\u0004\b\u0000\u0010\u0000\"\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\f"}, d2 = {"T", "R", "Lkotlin/Function2;", "Lcom/yandex/div/json/e;", "Lkotlin/S;", "name", "env", "value", "Creator", "Lorg/json/JSONArray;", "", "ItemReader", "div-json_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.internal.parser.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38108d {
    @Y61.l
    @X
    public static final Object a(@Y61.k JSONArray jSONArray, int i12) {
        Object objOpt = jSONArray.opt(i12);
        if (L.f(objOpt, JSONObject.NULL)) {
            return null;
        }
        return objOpt;
    }
}
