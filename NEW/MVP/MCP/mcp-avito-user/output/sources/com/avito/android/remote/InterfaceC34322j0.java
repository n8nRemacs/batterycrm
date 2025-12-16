package com.avito.android.remote;

import com.avito.android.remote.model.Info;
import e30.InterfaceC39936a;
import kotlin.Metadata;

/* compiled from: InfoApi.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/j0;", "", "", "path", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/Info;", "a", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "b", "_avito-discouraged_avito-api_info"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: com.avito.android.remote.j0, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public interface InterfaceC34322j0 {
    @J81.f("2/info/{path}")
    @Y61.k
    io.reactivex.rxjava3.core.z<Info> a(@J81.s("path") @Y61.k String path);

    @J81.f("3/info/{path}")
    @Y61.k
    io.reactivex.rxjava3.core.z<Info> b(@J81.s("path") @Y61.k String path);
}
