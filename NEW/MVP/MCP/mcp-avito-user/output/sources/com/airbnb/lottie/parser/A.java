package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* compiled from: PathParser.java */
/* loaded from: classes10.dex */
public class A implements N<PointF> {

    /* renamed from: a, reason: collision with root package name */
    public static final A f59920a = new A();

    @Override // com.airbnb.lottie.parser.N
    public final PointF a(JsonReader jsonReader, float f12) {
        return s.b(jsonReader, f12);
    }
}
