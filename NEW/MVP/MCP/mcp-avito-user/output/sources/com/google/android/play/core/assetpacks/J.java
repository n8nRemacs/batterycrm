package com.google.android.play.core.assetpacks;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
public final /* synthetic */ class J implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f358149b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AssetPackState f358150c;

    public /* synthetic */ J(K k12, AssetPackState assetPackState) {
        this.f358149b = k12;
        this.f358150c = assetPackState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K k12 = this.f358149b;
        AssetPackState assetPackState = this.f358150c;
        synchronized (k12) {
            Iterator it = new HashSet(k12.f358342d).iterator();
            while (it.hasNext()) {
                ((MY0.a) it.next()).a(assetPackState);
            }
        }
    }
}
