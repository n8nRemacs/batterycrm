package com.avito.android.categories_global;

import android.net.Uri;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CategoriesRouter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/categories_global/i;", "", "<init>", "()V", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final i f116385a = new i();

    public static Uri a(i iVar, String str, String str2, int i12) {
        if ((i12 & 1) != 0) {
            str = null;
        }
        if ((i12 & 2) != 0) {
            str2 = null;
        }
        iVar.getClass();
        return Uri.parse("ru.avito://1/globalCategories?categoryName=" + str + "&categoryId=" + str2);
    }
}
