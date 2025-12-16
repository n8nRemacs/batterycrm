package com.yandex.metrica.rtm.wrapper;

import android.content.Context;
import com.yandex.metrica.rtm.client.ExceptionProcessor;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public class h implements e {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final ExceptionProcessor f382497a;

    public h(@N Context context) {
        this.f382497a = new ExceptionProcessor(context, new a());
    }

    @Override // com.yandex.metrica.rtm.wrapper.e
    public final void reportException(@P String str, @P Throwable th2) {
        try {
            this.f382497a.onException(str, th2);
        } catch (Throwable unused) {
        }
    }
}
