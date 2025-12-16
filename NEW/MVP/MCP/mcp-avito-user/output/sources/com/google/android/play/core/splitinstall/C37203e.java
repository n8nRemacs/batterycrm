package com.google.android.play.core.splitinstall;

import java.util.ArrayList;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* renamed from: com.google.android.play.core.splitinstall.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37203e {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f358710a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f358711b;

    public /* synthetic */ C37203e(a aVar, r rVar) {
        this.f358710a = new ArrayList(aVar.f358712a);
        this.f358711b = new ArrayList(aVar.f358713b);
    }

    public final String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", this.f358710a, this.f358711b);
    }

    /* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
    /* renamed from: com.google.android.play.core.splitinstall.e$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f358712a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f358713b = new ArrayList();

        public a() {
        }

        public /* synthetic */ a(C37240q c37240q) {
        }
    }
}
