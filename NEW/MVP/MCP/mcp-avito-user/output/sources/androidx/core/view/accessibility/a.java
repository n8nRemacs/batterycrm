package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.RestrictTo;
import j.N;

/* compiled from: AccessibilityClickableSpanCompat.java */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: b, reason: collision with root package name */
    public final int f44995b;

    /* renamed from: c, reason: collision with root package name */
    public final f f44996c;

    /* renamed from: d, reason: collision with root package name */
    public final int f44997d;

    @RestrictTo
    public a(int i12, @N f fVar, int i13) {
        this.f44995b = i12;
        this.f44996c = fVar;
        this.f44997d = i13;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(@N View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f44995b);
        this.f44996c.f44999a.performAction(this.f44997d, bundle);
    }
}
