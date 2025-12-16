package com.android.volley.toolbox;

import android.content.Context;
import com.android.volley.toolbox.C27631k;
import java.io.File;

/* compiled from: Volley.java */
/* loaded from: classes10.dex */
class L implements C27631k.c {

    /* renamed from: a, reason: collision with root package name */
    public File f67113a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f67114b;

    public L(Context context) {
        this.f67114b = context;
    }

    public final File a() {
        if (this.f67113a == null) {
            this.f67113a = new File(this.f67114b.getCacheDir(), "volley");
        }
        return this.f67113a;
    }
}
