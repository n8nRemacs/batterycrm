package w0;

import android.text.SegmentFinder;
import kotlin.Metadata;

/* compiled from: SegmentFinder.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw0/a;", "Landroid/text/SegmentFinder;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49407a extends SegmentFinder {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f441072a;

    public C49407a(j jVar) {
        this.f441072a = jVar;
    }

    public final int nextEndBoundary(int i12) {
        return this.f441072a.d(i12);
    }

    public final int nextStartBoundary(int i12) {
        return this.f441072a.b(i12);
    }

    public final int previousEndBoundary(int i12) {
        return this.f441072a.a(i12);
    }

    public final int previousStartBoundary(int i12) {
        return this.f441072a.c(i12);
    }
}
