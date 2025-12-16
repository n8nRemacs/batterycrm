package com.avito.android.photo_list_view_groups;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PhotoItemGroupsImagesGroupsCacheImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "id", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class k extends N implements Y41.l<String, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f218614l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ArrayList arrayList) {
        super(1);
        this.f218614l = arrayList;
    }

    @Override // Y41.l
    public final Boolean invoke(String str) {
        return Boolean.valueOf(!this.f218614l.contains(str));
    }
}
