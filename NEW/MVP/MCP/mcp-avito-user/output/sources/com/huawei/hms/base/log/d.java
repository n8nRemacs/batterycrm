package com.huawei.hms.base.log;

import android.content.Context;

/* compiled from: ExtLogNode.java */
/* loaded from: classes7.dex */
public class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final I01.a f363439a;

    /* renamed from: b, reason: collision with root package name */
    public b f363440b;

    public d(I01.a aVar) {
        this.f363439a = aVar;
    }

    @Override // com.huawei.hms.base.log.b
    public void a(Context context, String str) {
        b bVar = this.f363440b;
        if (bVar != null) {
            bVar.a(context, str);
        }
    }

    @Override // com.huawei.hms.base.log.b
    public void a(b bVar) {
        this.f363440b = bVar;
    }

    @Override // com.huawei.hms.base.log.b
    public void a(String str, int i12, String str2, String str3) {
        I01.a aVar = this.f363439a;
        if (aVar != null) {
            if (i12 == 3) {
                aVar.d();
            } else if (i12 == 4) {
                aVar.i();
            } else if (i12 != 5) {
                aVar.e();
            } else {
                aVar.t();
            }
        }
        b bVar = this.f363440b;
        if (bVar != null) {
            bVar.a(str, i12, str2, str3);
        }
    }
}
