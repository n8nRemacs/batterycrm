package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import androidx.annotation.RestrictTo;
import j.N;
import j.P;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: SlideDistanceProvider.java */
/* loaded from: classes6.dex */
public final class z implements E {

    /* compiled from: SlideDistanceProvider.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface a {
    }

    @Override // com.google.android.material.transition.E
    @P
    public final Animator a(@N View view) {
        view.getContext();
        view.getTranslationX();
        view.getTranslationY();
        throw new IllegalArgumentException("Invalid slide direction: 0");
    }

    @Override // com.google.android.material.transition.E
    @P
    public final Animator b(@N View view) {
        view.getContext();
        view.getTranslationX();
        view.getTranslationY();
        throw new IllegalArgumentException("Invalid slide direction: 0");
    }
}
