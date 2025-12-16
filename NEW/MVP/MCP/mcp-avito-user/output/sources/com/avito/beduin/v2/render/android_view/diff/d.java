package com.avito.beduin.v2.render.android_view.diff;

import kotlin.Metadata;

/* compiled from: Diff.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/diff/d;", "", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements Comparable<d> {

    /* renamed from: b, reason: collision with root package name */
    public final int f337966b;

    /* renamed from: c, reason: collision with root package name */
    public final int f337967c;

    /* renamed from: d, reason: collision with root package name */
    public final int f337968d;

    public d(int i12, int i13, int i14) {
        this.f337966b = i12;
        this.f337967c = i13;
        this.f337968d = i14;
    }

    @Override // java.lang.Comparable
    public final int compareTo(d dVar) {
        return this.f337966b - dVar.f337966b;
    }
}
