package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.content.Context;

/* loaded from: classes7.dex */
public final class Z<T> {

    /* renamed from: a, reason: collision with root package name */
    private final W<T> f379974a;

    /* renamed from: b, reason: collision with root package name */
    private final X<T> f379975b;

    /* renamed from: c, reason: collision with root package name */
    private final E0 f379976c;

    /* renamed from: d, reason: collision with root package name */
    private final String f379977d;

    @j.k0
    public Z(@Y61.k W<T> w12, @Y61.k X<T> x12, @Y61.k E0 e02, @Y61.k String str) {
        this.f379974a = w12;
        this.f379975b = x12;
        this.f379976c = e02;
        this.f379977d = str;
    }

    public final void a(@Y61.k Context context, @Y61.k ContentValues contentValues) {
        try {
            T tInvoke = this.f379974a.invoke(contentValues);
            if (tInvoke != null) {
                this.f379976c.a(context);
                if (this.f379975b.invoke(tInvoke).booleanValue()) {
                    C38842h2.a("Successfully saved " + this.f379977d, new Object[0]);
                } else {
                    C38842h2.b("Did not save " + this.f379977d + " because data is already present", new Object[0]);
                }
            }
        } catch (Throwable th2) {
            C38842h2.a(th2, "Unexpected error occurred", new Object[0]);
        }
    }
}
