package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.webvtt.f;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class g implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f347126b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f347126b) {
            case 0:
                return Integer.compare(((f.b) obj).f347107a.f347110b, ((f.b) obj2).f347107a.f347110b);
            default:
                return Long.compare(((e) obj).f347100b, ((e) obj2).f347100b);
        }
    }
}
