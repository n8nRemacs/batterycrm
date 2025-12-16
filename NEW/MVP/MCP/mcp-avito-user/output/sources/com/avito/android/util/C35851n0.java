package com.avito.android.util;

import android.database.Cursor;
import kotlin.Metadata;
import uK0.C48914a;

/* compiled from: Cursors.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.n0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35851n0 {
    @Y61.k
    public static final C48914a a(@Y61.k Cursor cursor) {
        return cursor instanceof C48914a ? (C48914a) cursor : new C48914a(cursor);
    }
}
