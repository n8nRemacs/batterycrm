package com.avito.android.messenger.conversation.mvi.file_upload;

import io.reactivex.rxjava3.core.AbstractC41768a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FileUploadInitializer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Ljava/io/File;", "files", "Lio/reactivex/rxjava3/core/g;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.l, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32080l<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32062c f191190b;

    public C32080l(C32062c c32062c) {
        this.f191190b = c32062c;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = ((List) obj).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C32062c c32062c = this.f191190b;
            if (!zHasNext) {
                return AbstractC41768a.p(arrayList).l(new C32078k(c32062c)).r();
            }
            String path = ((File) it.next()).getPath();
            arrayList.add(c32062c.f191127d.l(path).o(new C32076j(c32062c, path)));
        }
    }
}
