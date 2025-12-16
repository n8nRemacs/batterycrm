package com.avito.android.remote.analytics;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RetrofitHttpMethodAnnotations.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
final class G extends N implements Y41.l<Annotation, String> {

    /* renamed from: l, reason: collision with root package name */
    public static final G f253094l = new G();

    public G() {
        super(1);
    }

    @Override // Y41.l
    public final String invoke(Annotation annotation) {
        Annotation annotation2 = annotation;
        H.f253095a.getClass();
        if (annotation2 instanceof J81.b) {
            return ((J81.b) annotation2).value();
        }
        if (annotation2 instanceof J81.f) {
            return ((J81.f) annotation2).value();
        }
        if (annotation2 instanceof J81.g) {
            return ((J81.g) annotation2).value();
        }
        if (annotation2 instanceof J81.n) {
            return ((J81.n) annotation2).value();
        }
        if (annotation2 instanceof J81.o) {
            return ((J81.o) annotation2).value();
        }
        if (annotation2 instanceof J81.p) {
            return ((J81.p) annotation2).value();
        }
        if (annotation2 instanceof J81.m) {
            return ((J81.m) annotation2).value();
        }
        return null;
    }
}
