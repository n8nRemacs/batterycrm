package com.avito.android.util;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;

/* compiled from: NougatDataDirectoryProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/n3;", "Lcom/avito/android/util/r0;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.n3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35854n3 implements InterfaceC35879r0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f318930a;

    public C35854n3(@Y61.k Context context) {
        this.f318930a = context;
    }

    @Override // com.avito.android.util.InterfaceC35879r0
    @Y61.k
    public final File a() {
        return this.f318930a.getDataDir();
    }
}
