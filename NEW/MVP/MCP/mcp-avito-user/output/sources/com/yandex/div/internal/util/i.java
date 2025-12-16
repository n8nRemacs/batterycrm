package com.yandex.div.internal.util;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: JsonPrinter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/internal/util/i;", "", "a", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class i {

    /* compiled from: JsonPrinter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/internal/util/i$a;", "", "<init>", "()V", "", "ELLIPSIS", "Ljava/lang/String;", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONArray a(org.json.JSONArray r6, int r7) {
        /*
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            int r1 = r6.length()
            r2 = 0
        La:
            if (r2 >= r1) goto L39
            int r3 = r2 + 1
            java.lang.Object r2 = r6.opt(r2)
            boolean r4 = r2 instanceof org.json.JSONObject
            java.lang.String r5 = "..."
            if (r4 == 0) goto L25
            if (r7 != 0) goto L1c
        L1a:
            r2 = r5
            goto L34
        L1c:
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            int r4 = r7 + (-1)
            org.json.JSONObject r2 = b(r2, r4)
            goto L34
        L25:
            boolean r4 = r2 instanceof org.json.JSONArray
            if (r4 == 0) goto L34
            if (r7 != 0) goto L2c
            goto L1a
        L2c:
            org.json.JSONArray r2 = (org.json.JSONArray) r2
            int r4 = r7 + (-1)
            org.json.JSONArray r2 = a(r2, r4)
        L34:
            r0.put(r2)
            r2 = r3
            goto La
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.util.i.a(org.json.JSONArray, int):org.json.JSONArray");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject b(org.json.JSONObject r6, int r7) throws org.json.JSONException {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Iterator r1 = r6.keys()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r6.opt(r2)
            boolean r4 = r3 instanceof org.json.JSONObject
            java.lang.String r5 = "..."
            if (r4 == 0) goto L2c
            if (r7 != 0) goto L23
        L21:
            r3 = r5
            goto L3b
        L23:
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            int r4 = r7 + (-1)
            org.json.JSONObject r3 = b(r3, r4)
            goto L3b
        L2c:
            boolean r4 = r3 instanceof org.json.JSONArray
            if (r4 == 0) goto L3b
            if (r7 != 0) goto L33
            goto L21
        L33:
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            int r4 = r7 + (-1)
            org.json.JSONArray r3 = a(r3, r4)
        L3b:
            r0.put(r2, r3)
            goto L9
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.util.i.b(org.json.JSONObject, int):org.json.JSONObject");
    }
}
