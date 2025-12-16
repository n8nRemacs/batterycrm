package com.google.android.exoplayer2.upstream.cache;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: ContentMetadataMutations.java */
/* loaded from: classes6.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f347881a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f347882b = new ArrayList();

    public final void a(Object obj, String str) {
        HashMap map = this.f347881a;
        obj.getClass();
        map.put(str, obj);
        this.f347882b.remove(str);
    }
}
