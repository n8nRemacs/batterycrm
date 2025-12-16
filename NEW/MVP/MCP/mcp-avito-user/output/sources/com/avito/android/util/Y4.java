package com.avito.android.util;

import com.avito.android.R;
import hw.InterfaceC41178c;
import j.InterfaceC42150f;
import kotlin.Metadata;

/* compiled from: SafeDealButtonStyles.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/Y4;", "", "<init>", "()V", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Y4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Y4 f318784a = new Y4();

    @InterfaceC42150f
    public static int a(@Y61.l String str) {
        if (str == null) {
            return 0;
        }
        return str.equals("safedealLarge") ? R.attr.buttonSafedealHuge : str.equals("safedealSecondaryLarge") ? R.attr.buttonSafedealSecondaryHuge : com.avito.android.lib.util.f.d(str);
    }
}
