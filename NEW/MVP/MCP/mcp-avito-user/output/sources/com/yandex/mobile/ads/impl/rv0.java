package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.nb0;

/* loaded from: classes8.dex */
public final class rv0 implements nb0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final nb0.a f389675a = new nb0.a();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final cb f389676b;

    /* renamed from: c, reason: collision with root package name */
    private final float f389677c;

    public rv0(float f12) {
        this.f389677c = f12;
        this.f389676b = new cb(f12);
    }

    @Override // com.yandex.mobile.ads.impl.nb0
    @j.N
    public final nb0.a a(int i12, int i13) {
        int mode = View.MeasureSpec.getMode(i12);
        int mode2 = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i12);
        int size2 = View.MeasureSpec.getSize(i13);
        if (mode == 1073741824 && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            int iA2 = this.f389676b.a(size);
            if (mode2 == Integer.MIN_VALUE) {
                iA2 = Math.min(size2, iA2);
            }
            i13 = View.MeasureSpec.makeMeasureSpec(iA2, 1073741824);
        } else if (mode2 == 1073741824 && (mode == Integer.MIN_VALUE || mode == 0)) {
            int iB2 = this.f389676b.b(size2);
            if (mode == Integer.MIN_VALUE) {
                iB2 = Math.min(size, iB2);
            }
            i12 = View.MeasureSpec.makeMeasureSpec(iB2, 1073741824);
        } else if (mode2 == Integer.MIN_VALUE && mode == Integer.MIN_VALUE && size2 != 0 && size != 0) {
            if (size / size2 > this.f389677c) {
                i12 = View.MeasureSpec.makeMeasureSpec(this.f389676b.b(size2), 1073741824);
                i13 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            } else {
                int iA3 = this.f389676b.a(size);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                i13 = View.MeasureSpec.makeMeasureSpec(iA3, 1073741824);
                i12 = iMakeMeasureSpec;
            }
        }
        nb0.a aVar = this.f389675a;
        aVar.f388198a = i12;
        aVar.f388199b = i13;
        return aVar;
    }
}
