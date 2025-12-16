package com.avito.android.publish.drafts;

import com.avito.android.photo_cache.PhotoUpload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoStorageCleaner.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroid/net/Uri;", "list", "Lcom/avito/android/photo_cache/PhotoUpload;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.drafts.k, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33845k<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C33845k<T, R> f235390b = new C33845k<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PhotoUpload) it.next()).f216305g);
        }
        return arrayList;
    }
}
