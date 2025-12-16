package com.bumptech.glide;

import com.bumptech.glide.k;

/* compiled from: TransitionOptions.java */
/* loaded from: classes5.dex */
public abstract class k<CHILD extends k<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public com.bumptech.glide.request.transition.g<? super TranscodeType> f338826b = com.bumptech.glide.request.transition.e.f339625b;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e12) {
            throw new RuntimeException(e12);
        }
    }
}
