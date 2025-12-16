package com.avito.android.image.enhancement;

import com.avito.android.photo_cache.PhotoUpload;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImageEnhanceViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/photo_cache/PhotoUpload;", "it", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class I<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f169340b;

    public I(String str) {
        this.f169340b = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        T next;
        Iterator<T> it = ((List) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = (T) null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.L.f(((PhotoUpload) next).f216304f, this.f169340b)) {
                break;
            }
        }
        return next;
    }
}
