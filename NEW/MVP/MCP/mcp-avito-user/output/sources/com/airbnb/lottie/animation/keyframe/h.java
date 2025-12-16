package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MaskKeyframeAnimation.java */
/* loaded from: classes10.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f59331a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f59332b;

    /* renamed from: c, reason: collision with root package name */
    public final List<Mask> f59333c;

    public h(List<Mask> list) {
        this.f59333c = list;
        this.f59331a = new ArrayList(list.size());
        this.f59332b = new ArrayList(list.size());
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f59331a.add(list.get(i12).f59663b.c());
            this.f59332b.add(list.get(i12).f59664c.c());
        }
    }
}
