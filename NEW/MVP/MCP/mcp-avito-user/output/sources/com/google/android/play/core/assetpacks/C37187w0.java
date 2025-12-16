package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.C37146p;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.w0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37187w0 {

    /* renamed from: k, reason: collision with root package name */
    public static final com.google.android.play.core.assetpacks.internal.F f358517k = new com.google.android.play.core.assetpacks.internal.F("ExtractorLooper");

    /* renamed from: a, reason: collision with root package name */
    public final Q0 f358518a;

    /* renamed from: b, reason: collision with root package name */
    public final C37170q0 f358519b;

    /* renamed from: c, reason: collision with root package name */
    public final F1 f358520c;

    /* renamed from: d, reason: collision with root package name */
    public final C37124g1 f358521d;

    /* renamed from: e, reason: collision with root package name */
    public final C37153k1 f358522e;

    /* renamed from: f, reason: collision with root package name */
    public final C37179t1 f358523f;

    /* renamed from: g, reason: collision with root package name */
    public final C37191x1 f358524g;

    /* renamed from: h, reason: collision with root package name */
    public final T0 f358525h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f358526i = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    public final C37146p f358527j;

    public C37187w0(Q0 q02, C37146p c37146p, C37170q0 c37170q0, F1 f12, C37124g1 c37124g1, C37153k1 c37153k1, C37179t1 c37179t1, C37191x1 c37191x1, T0 t02) {
        this.f358518a = q02;
        this.f358527j = c37146p;
        this.f358519b = c37170q0;
        this.f358520c = f12;
        this.f358521d = c37124g1;
        this.f358522e = c37153k1;
        this.f358523f = c37179t1;
        this.f358524g = c37191x1;
        this.f358525h = t02;
    }

    public final void a(final int i12, Exception exc) {
        final Q0 q02 = this.f358518a;
        try {
            q02.getClass();
            final int i13 = 5;
            q02.c(new P0(i12, i13) { // from class: com.google.android.play.core.assetpacks.I0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f358147b;

                @Override // com.google.android.play.core.assetpacks.P0
                public final Object a() {
                    this.f358146a.b(this.f358147b).f358186c.f358180d = 5;
                    return null;
                }
            });
            q02.c(new D0(q02, i12));
        } catch (C37184v0 unused) {
            f358517k.b("Error during error handling: %s", exc.getMessage());
        }
    }
}
