package com.avito.android.advert;

import com.avito.android.fakedoor_dialog.storage.FakeDoorScreen;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: AdvertDetailsInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "locationParams", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28230j<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28234n f80776b;

    public C28230j(C28234n c28234n) {
        this.f80776b = c28234n;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        kotlin.Q<String, String> qB2 = this.f80776b.f80794g.b(FakeDoorScreen.f155149b);
        if (qB2 != null) {
        }
        linkedHashMap.putAll(map);
        return linkedHashMap;
    }
}
