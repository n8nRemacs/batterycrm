package com.yandex.metrica.impl.ob;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C38756dg;
import java.util.concurrent.Callable;

/* renamed from: com.yandex.metrica.impl.ob.fg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class CallableC38806fg implements Callable<C38756dg> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C38831gg f380593a;

    public CallableC38806fg(C38831gg c38831gg) {
        this.f380593a = c38831gg;
    }

    @Override // java.util.concurrent.Callable
    public C38756dg call() {
        Uri uri = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.f380593a.f380650a.getContentResolver();
        C38831gg c38831gg = this.f380593a;
        c38831gg.f380651b = contentResolver.query(uri, null, null, new String[]{c38831gg.f380650a.getPackageName()}, null);
        if (this.f380593a.f380651b != null && this.f380593a.f380651b.moveToFirst()) {
            String string = this.f380593a.f380651b.getString(0);
            if (!TextUtils.isEmpty(string)) {
                return new C38756dg(string, this.f380593a.f380651b.getLong(1), this.f380593a.f380651b.getLong(2), C38756dg.a.HMS);
            }
        }
        return null;
    }
}
