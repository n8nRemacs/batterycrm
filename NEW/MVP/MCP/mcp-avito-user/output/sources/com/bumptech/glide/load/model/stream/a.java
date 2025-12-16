package com.bumptech.glide.load.model.stream;

import android.text.TextUtils;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.model.h;
import com.bumptech.glide.load.model.n;
import j.N;
import j.P;
import java.io.InputStream;
import java.util.Collections;

/* compiled from: BaseGlideUrlLoader.java */
/* loaded from: classes5.dex */
public abstract class a<Model> implements n<Model, InputStream> {
    @Override // com.bumptech.glide.load.model.n
    @P
    public final n.a<InputStream> a(@N Model model, int i12, int i13, @N k kVar) {
        String strC = c();
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        new com.bumptech.glide.load.model.g(strC, h.f339226a);
        Collections.emptyList();
        throw null;
    }

    public abstract String c();
}
