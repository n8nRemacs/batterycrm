package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ui.SubtitleView;
import com.google.android.exoplayer2.util.U;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: WebViewSubtitleOutput.java */
/* loaded from: classes6.dex */
final class G extends FrameLayout implements SubtitleView.a {

    /* renamed from: b, reason: collision with root package name */
    public final C36566d f347384b;

    /* renamed from: c, reason: collision with root package name */
    public final WebView f347385c;

    /* renamed from: d, reason: collision with root package name */
    public List<com.google.android.exoplayer2.text.a> f347386d;

    /* renamed from: e, reason: collision with root package name */
    public C36567e f347387e;

    /* renamed from: f, reason: collision with root package name */
    public float f347388f;

    /* renamed from: g, reason: collision with root package name */
    public float f347389g;

    /* compiled from: WebViewSubtitleOutput.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f347390a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f347390a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f347390a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f347390a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public G(Context context) {
        super(context, null);
        this.f347386d = Collections.emptyList();
        this.f347387e = C36567e.f347455g;
        this.f347388f = 0.0533f;
        this.f347389g = 0.08f;
        C36566d c36566d = new C36566d(context);
        this.f347384b = c36566d;
        F f12 = new F(context, null);
        this.f347385c = f12;
        f12.setBackgroundColor(0);
        addView(c36566d);
        addView(f12);
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public final void a(List list, C36567e c36567e, float f12, float f13) {
        this.f347387e = c36567e;
        this.f347388f = f12;
        this.f347389g = f13;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            com.google.android.exoplayer2.text.a aVar = (com.google.android.exoplayer2.text.a) list.get(i12);
            if (aVar.f346720e != null) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        if (!this.f347386d.isEmpty() || !arrayList2.isEmpty()) {
            this.f347386d = arrayList2;
            c();
        }
        this.f347384b.a(arrayList, c36567e, f12, f13);
        invalidate();
    }

    public final String b(float f12, int i12) {
        float fB2 = B.b(i12, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom(), f12);
        if (fB2 == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fB2 / getContext().getResources().getDisplayMetrics().density)};
        int i13 = U.f348106a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:260:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.G.c():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        if (!z12 || this.f347386d.isEmpty()) {
            return;
        }
        c();
    }
}
