package com.huawei.hms.base.log;

import android.content.Context;
import android.util.Log;

/* compiled from: LogCatNode.java */
/* loaded from: classes7.dex */
public class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public b f363441a;

    @Override // com.huawei.hms.base.log.b
    public void a(Context context, String str) {
        b bVar = this.f363441a;
        if (bVar != null) {
            bVar.a(context, str);
        }
    }

    @Override // com.huawei.hms.base.log.b
    public void a(b bVar) {
        this.f363441a = bVar;
    }

    @Override // com.huawei.hms.base.log.b
    public void a(String str, int i12, String str2, String str3) {
        Log.println(i12, "HMSSDK_" + str2, str3);
        b bVar = this.f363441a;
        if (bVar != null) {
            bVar.a(str, i12, str2, str3);
        }
    }
}
