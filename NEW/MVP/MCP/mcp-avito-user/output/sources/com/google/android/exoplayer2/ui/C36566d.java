package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.view.View;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: CanvasSubtitleOutput.java */
/* renamed from: com.google.android.exoplayer2.ui.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C36566d extends View implements SubtitleView.a {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f347450b;

    /* renamed from: c, reason: collision with root package name */
    public List<com.google.android.exoplayer2.text.a> f347451c;

    /* renamed from: d, reason: collision with root package name */
    public float f347452d;

    /* renamed from: e, reason: collision with root package name */
    public C36567e f347453e;

    /* renamed from: f, reason: collision with root package name */
    public float f347454f;

    public C36566d(Context context) {
        super(context, null);
        this.f347450b = new ArrayList();
        this.f347451c = Collections.emptyList();
        this.f347452d = 0.0533f;
        this.f347453e = C36567e.f347455g;
        this.f347454f = 0.08f;
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public final void a(List list, C36567e c36567e, float f12, float f13) {
        this.f347451c = list;
        this.f347453e = c36567e;
        this.f347452d = f12;
        this.f347454f = f13;
        while (true) {
            ArrayList arrayList = this.f347450b;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new A(getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04ad  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r39) {
        /*
            Method dump skipped, instructions count: 1250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.C36566d.dispatchDraw(android.graphics.Canvas):void");
    }
}
