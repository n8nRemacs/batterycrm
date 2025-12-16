package com.avito.android.publish.video_upload;

import com.avito.android.publish.video_upload.models.FileMaxSizeException;
import com.avito.android.publish.video_upload.s;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import kotlin.Metadata;

/* compiled from: VideoUploadViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "fileSize", "Lio/reactivex/rxjava3/core/g;", "apply", "(I)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class w<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s.b f245606b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f245607c;

    public w(s.b bVar, Long l12) {
        this.f245606b = bVar;
        this.f245607c = l12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        this.f245606b.f245589b = Integer.valueOf(iIntValue);
        Long l12 = this.f245607c;
        return (l12 == null || ((long) iIntValue) <= l12.longValue() * ((long) 1048576)) ? C41823n.f402260b : AbstractC41768a.o(new FileMaxSizeException());
    }
}
