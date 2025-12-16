package io.noties.markwon.html.tag;

import android.text.TextUtils;
import io.noties.markwon.html.tag.d;
import io.noties.markwon.image.i;
import j.N;
import j.P;
import j.k0;

/* compiled from: ImageSizeParserImpl.java */
/* loaded from: classes8.dex */
class e implements d.a {

    /* renamed from: a, reason: collision with root package name */
    public final io.noties.markwon.html.b f401896a;

    public e(@N io.noties.markwon.html.b bVar) {
        this.f401896a = bVar;
    }

    @k0
    @P
    public static i.a a(@P String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int length = str.length();
        int i12 = length - 1;
        int i13 = i12;
        while (i13 > -1) {
            if (Character.isDigit(str.charAt(i13))) {
                int i14 = i13 + 1;
                try {
                    return new i.a(Float.parseFloat(str.substring(0, i14)), i13 == i12 ? null : str.substring(i14, length));
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
            i13--;
        }
        return null;
    }
}
