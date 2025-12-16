package com.yandex.mobile.ads.impl;

import android.os.AsyncTask;

/* loaded from: classes8.dex */
public abstract class jp1 extends AsyncTask<Object, Void, String> {

    /* renamed from: a, reason: collision with root package name */
    private a f386948a;

    /* renamed from: b, reason: collision with root package name */
    protected final b f386949b;

    public interface a {
    }

    public interface b {
    }

    public jp1(b bVar) {
        this.f386949b = bVar;
    }

    public final void a(a aVar) {
        this.f386948a = aVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f386948a;
        if (aVar != null) {
            ((op1) aVar).a();
        }
    }
}
